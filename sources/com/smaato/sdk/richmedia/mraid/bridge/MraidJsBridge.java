package com.smaato.sdk.richmedia.mraid.bridge;

import android.net.Uri;
import android.webkit.WebView;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.Maps;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.MraidUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class MraidJsBridge {
    private final Map<String, MraidCommandHandler> handlers = Collections.synchronizedMap(new HashMap());
    private final Logger logger;
    private final WebView webView;

    public MraidJsBridge(WebView webView2, Logger logger2) {
        this.webView = (WebView) Objects.requireNonNull(webView2);
        this.logger = (Logger) Objects.requireNonNull(logger2);
    }

    public void handleMraidUrl(String str, boolean z) {
        Uri parse = Uri.parse(str);
        Objects.onNotNull(parse.getHost(), new Consumer(parse, z) {
            public final /* synthetic */ Uri f$1;
            public final /* synthetic */ boolean f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void accept(Object obj) {
                MraidJsBridge.this.lambda$handleMraidUrl$0$MraidJsBridge(this.f$1, this.f$2, (String) obj);
            }
        });
        fireNativeCallCompleteEvent();
    }

    public /* synthetic */ void lambda$handleMraidUrl$0$MraidJsBridge(Uri uri, boolean z, String str) {
        handleCommand(str, getQueryParamMap(uri), z);
    }

    private Map<String, String> getQueryParamMap(Uri uri) {
        HashMap hashMap = new HashMap();
        for (String next : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(next);
            if (queryParameter != null) {
                hashMap.put(next, queryParameter);
            }
        }
        return Maps.toImmutableMap(hashMap);
    }

    private void handleCommand(String str, Map<String, String> map, boolean z) {
        MraidCommandHandler mraidCommandHandler = this.handlers.get(str);
        if (mraidCommandHandler == null) {
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.MRAID;
            logger2.debug(logDomain, "A handler for command \"" + str + "\" is not registered", new Object[0]);
            return;
        }
        mraidCommandHandler.handle(map, z);
    }

    public void fireReadyEvent() {
        runScript("window.mraidbridge.fireReadyEvent();");
    }

    private void fireNativeCallCompleteEvent() {
        runScript("window.mraidbridge.nativeCallComplete();");
    }

    /* access modifiers changed from: package-private */
    public void addCommandHandler(String str, MraidCommandHandler mraidCommandHandler) {
        if (!TextUtils.isEmpty(str)) {
            this.handlers.put(str, mraidCommandHandler);
        }
    }

    /* access modifiers changed from: package-private */
    public void runScript(String str) {
        Logger logger2 = this.logger;
        LogDomain logDomain = LogDomain.MRAID;
        logger2.info(logDomain, "Running script: " + str, new Object[0]);
        this.webView.loadUrl(MraidUtils.format("javascript:%s", str));
    }
}
