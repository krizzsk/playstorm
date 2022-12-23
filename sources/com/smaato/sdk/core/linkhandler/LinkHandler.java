package com.smaato.sdk.core.linkhandler;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.utils.Utils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.common.net.HttpHeaders;
import com.smaato.sdk.core.browser.SmaatoSdkBrowserActivity;
import com.smaato.sdk.core.network.HttpClient;
import com.smaato.sdk.core.network.Request;
import com.smaato.sdk.core.network.Response;
import com.smaato.sdk.core.network.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.util.Either;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Set;

public class LinkHandler {
    public static final int MAX_REDIRECTS = 16;
    private final ActivityQueries activityQueries;
    private final Application application;
    private final HttpClient httpClient;
    private final IntentLauncher intentLauncher;
    private final SimpleHttpClient simpleHttpClient;

    public LinkHandler(Application application2, HttpClient httpClient2, SimpleHttpClient simpleHttpClient2, IntentLauncher intentLauncher2, ActivityQueries activityQueries2) {
        this.application = application2;
        this.intentLauncher = intentLauncher2;
        this.httpClient = httpClient2;
        this.simpleHttpClient = simpleHttpClient2;
        this.activityQueries = activityQueries2;
    }

    public boolean launchAsUncheckedIntent(String str) {
        try {
            return this.intentLauncher.launch(createUncheckedIntentForUrl(str));
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean handleUrl(String str) {
        if (!str.startsWith(SmaDeepLink.SMAATO_DEEPLINK_SCHEME)) {
            return launchUrl(str);
        }
        try {
            SmaDeepLink smaDeepLink = new SmaDeepLink(str);
            if (launchUrl(smaDeepLink.primaryUrl)) {
                return fireTrackingUrls(smaDeepLink.primaryTrackerUrls);
            }
            if (launchUrl(smaDeepLink.fallbackUrl)) {
                return fireTrackingUrls(smaDeepLink.fallbackTrackerUrls);
            }
            return false;
        } catch (Exception unused) {
        }
    }

    private boolean launchUrl(String str) {
        if (isApiLevel30Plus()) {
            boolean tryToStartAsAppLink = tryToStartAsAppLink(str, true);
            return !tryToStartAsAppLink ? handleFailedUrl(str) : tryToStartAsAppLink;
        }
        try {
            if (this.intentLauncher.launch(resolveExternalAppUrl(str))) {
                return true;
            }
        } catch (Exception unused) {
        }
        if (!URLUtil.isHttpUrl(str) && !URLUtil.isHttpsUrl(str)) {
            return false;
        }
        try {
            if (this.intentLauncher.launch(resolveRedirectUrlAndCreateIntent(str))) {
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.e(LinkHandler.class.getSimpleName(), "intent launcher resolver exception", e);
        }
    }

    private boolean tryToStartAsAppLink(String str, boolean z) {
        Intent createUncheckedIntentForUrl = createUncheckedIntentForUrl(str);
        if (z) {
            createUncheckedIntentForUrl.addFlags(1024);
        }
        return this.intentLauncher.launch(createUncheckedIntentForUrl);
    }

    private boolean handleFailedUrl(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return resolveRedirectAndStartAsAppLink(str);
        }
        if (isIntentUrl(str)) {
            return this.intentLauncher.launch(createIntentForFallback(str));
        }
        return false;
    }

    private boolean resolveRedirectAndStartAsAppLink(String str) {
        try {
            ResolvedRedirection resolveRedirectUrl = resolveRedirectUrl(str);
            if (!URLUtil.isHttpUrl(str)) {
                if (!URLUtil.isHttpsUrl(str)) {
                    return tryToStartAsAppLink(resolveRedirectUrl.url, false);
                }
            }
            return startInInternalBrowser(str);
        } catch (Exception unused) {
            return false;
        }
    }

    private Intent resolveRedirectUrlAndCreateIntent(String str) {
        ResolvedRedirection resolveRedirectUrl = resolveRedirectUrl(str);
        if (resolveRedirectUrl.lastRedirectionFailed) {
            return createInternalBrowserIntent(resolveRedirectUrl.url);
        }
        try {
            return resolveExternalAppUrl(resolveRedirectUrl.url);
        } catch (Exception unused) {
            return createInternalBrowserIntent(resolveRedirectUrl.url);
        }
    }

    private ResolvedRedirection resolveRedirectUrl(String str) {
        Response execute;
        Request buildHttpRequestWithBlockedRedirection = buildHttpRequestWithBlockedRedirection(str);
        int i = 0;
        do {
            try {
                execute = this.httpClient.newCall(buildHttpRequestWithBlockedRedirection).execute();
                if (execute.isRedirect()) {
                    buildHttpRequestWithBlockedRedirection = createRequestForRedirection(buildHttpRequestWithBlockedRedirection, execute);
                    i++;
                    execute.close();
                } else {
                    ResolvedRedirection resolvedRedirection = new ResolvedRedirection(execute.request().uri().toString());
                    execute.close();
                    return resolvedRedirection;
                }
            } catch (Exception unused) {
                return new ResolvedRedirection(buildHttpRequestWithBlockedRedirection.uri().toString(), true);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } while (i <= 16);
        throw new IllegalArgumentException("Unable to resolve redirect " + str);
        throw th;
    }

    private Request buildHttpRequestWithBlockedRedirection(String str) {
        return Request.get(str).buildUpon().followRedirects(false).build();
    }

    private Request createRequestForRedirection(Request request, Response response) {
        List<String> values = response.headers().values(HttpHeaders.LOCATION);
        if (values.isEmpty()) {
            return request;
        }
        Uri parse = Uri.parse(values.get(0));
        if (parse.isAbsolute()) {
            return request.buildUpon().uri(parse).build();
        }
        return request.buildUpon().uri(request.uri().buildUpon().path(parse.getPath()).query(parse.getQuery()).build()).build();
    }

    private Intent resolveExternalAppUrl(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return createCheckedAppLinkIntent(str);
        }
        if (SDKConstants.PARAM_INTENT.equalsIgnoreCase(str.substring(0, 6))) {
            return createExternalAppIntent(str);
        }
        return createViewIntent(str);
    }

    private Intent createUncheckedIntentForUrl(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return new Intent("android.intent.action.VIEW", Uri.parse(str)).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT");
        }
        if (isIntentUrl(str)) {
            return createUncheckedExternalAppIntent(str);
        }
        return createViewIntent(str);
    }

    public Either<Intent, String> findExternalAppForUrl(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return Either.right(str);
        }
        if (!isIntentUrl(str)) {
            return Either.right(str);
        }
        try {
            return Either.left(createUncheckedExternalAppIntent(str));
        } catch (Exception unused) {
            return Either.right(str);
        }
    }

    private Intent createCheckedAppLinkIntent(String str) {
        Set<String> queryTargetActivityNames = this.activityQueries.queryTargetActivityNames("https://");
        Set<String> queryTargetActivityNames2 = this.activityQueries.queryTargetActivityNames(str);
        queryTargetActivityNames2.removeAll(queryTargetActivityNames);
        if (!queryTargetActivityNames2.isEmpty()) {
            return new Intent("android.intent.action.VIEW", Uri.parse(str)).addCategory("android.intent.category.BROWSABLE").addCategory("android.intent.category.DEFAULT").addFlags(268435456);
        }
        throw new IllegalArgumentException("No app supports " + str);
    }

    private Intent createExternalAppIntent(String str) {
        return createExternalAppIntent(str, false);
    }

    private Intent createUncheckedExternalAppIntent(String str) {
        return createExternalAppIntent(str, true);
    }

    private Intent createExternalAppIntent(String str, boolean z) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (!z) {
                if (!this.activityQueries.canBeLaunched(parseUri)) {
                    return createIntentForFallback(str);
                }
            }
            return parseUri;
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private Intent createIntentForFallback(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            String stringExtra = parseUri.getStringExtra("browser_fallback_url");
            if (!TextUtils.isEmpty(stringExtra)) {
                return createInternalBrowserIntent(stringExtra);
            }
            String stringExtra2 = parseUri.getStringExtra("package");
            if (!TextUtils.isEmpty(stringExtra2)) {
                return createMarketIntent(stringExtra2);
            }
            throw new IllegalArgumentException("No such app supports " + str);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private Intent createMarketIntent(String str) {
        return new Intent("android.intent.action.VIEW", new Uri.Builder().scheme(Utils.PLAY_STORE_SCHEME).authority("details").appendQueryParameter("id", str).build());
    }

    private boolean startInInternalBrowser(String str) {
        return this.intentLauncher.launch(createInternalBrowserIntent(str));
    }

    private Intent createInternalBrowserIntent(String str) {
        if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            return SmaatoSdkBrowserActivity.createIntent(this.application, str);
        }
        throw new IllegalArgumentException("Not browsable url " + str);
    }

    private Intent createViewIntent(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    private boolean isIntentUrl(String str) {
        return SDKConstants.PARAM_INTENT.equalsIgnoreCase(str.substring(0, 6));
    }

    private boolean fireTrackingUrls(List<String> list) {
        try {
            this.simpleHttpClient.fireAndForget(list);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isApiLevel30Plus() {
        return Build.VERSION.SDK_INT >= 30;
    }
}
