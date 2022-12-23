package com.amazon.device.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.IOException;
import java.util.Locale;

public class DTBAdViewSupportClient extends WebViewClient {
    static final String AMAZON_APP_STORE_LINK = "https://www.amazon.com/gp/mas/dl/android?";
    static final String AMAZON_SCHEME = "amzn";
    static final String GOOGLE_PLAY_STORE_LINK = "https://play.google.com/store/apps/";
    static final String LOG_TAG = DTBAdViewSupportClient.class.getSimpleName();
    static final String MARKET_SCHEME = "market";
    static final String MOBILE_SHOPPING_SCHEME = "com.amazon.mobile.shopping";
    static final String MOBILE_SHOPPING_WEB_SCHEME = "com.amazon.mobile.shopping.web";
    Context context;
    DTBAdMRAIDController controller;

    public DTBAdViewSupportClient(Context context2, DTBAdMRAIDController dTBAdMRAIDController) {
        this.context = context2;
        this.controller = dTBAdMRAIDController;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        String str2 = LOG_TAG;
        DtbLog.debug(str2, "Should intercept Resource url: " + str);
        if (matchesLocalInjectionUrl(str)) {
            return createImageInjectionResponse(str.substring(str.lastIndexOf(47) + 1));
        }
        return super.shouldInterceptRequest(webView, str);
    }

    private boolean matchesLocalInjectionUrl(String str) {
        return ImagesContract.LOCAL.equals(Uri.parse(str.toLowerCase(Locale.US)).getScheme());
    }

    private WebResourceResponse createImageInjectionResponse(String str) {
        try {
            return new WebResourceResponse("image/png", "UTF-8", this.context.getAssets().open(str));
        } catch (IOException unused) {
            String str2 = LOG_TAG;
            DtbLog.error(str2, "Failed to get injection response: " + str);
            return null;
        }
    }

    public void onPageFinished(WebView webView, String str) {
        try {
            String str2 = LOG_TAG;
            DtbLog.debug(str2, "Page finished:" + str);
            if (!(webView instanceof DTBAdView)) {
                return;
            }
            if (str.contains("MRAID_ENV")) {
                this.controller.onPageLoad();
            } else if (str.equals("https://c.amazon-adsystem.com/")) {
                DtbOmSdkSessionManager dtbOmSdkSessionManager = this.controller.getDtbOmSdkSessionManager();
                if (dtbOmSdkSessionManager != null) {
                    dtbOmSdkSessionManager.stopOmAdSession();
                    if (!this.controller.getAdView().isVideo()) {
                        dtbOmSdkSessionManager.initHtmlDisplayOmAdSession(this.controller.getAdView(), str);
                    } else {
                        dtbOmSdkSessionManager.initJavaScriptOmAdSession(this.controller.getAdView(), str);
                    }
                    dtbOmSdkSessionManager.registerAdView(this.controller.getAdView());
                    dtbOmSdkSessionManager.startAdSession();
                }
                this.controller.onPageLoad();
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute onPageFinished method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onPageFinished method", e);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            if (this.controller.isTwoPartExpand()) {
                return false;
            }
            return openUrl(str);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute shouldOverrideUrlLoading method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute shouldOverrideUrlLoading method", e);
            return false;
        }
    }

    @Deprecated
    public void onLoadResource(WebView webView, String str) {
        String str2 = LOG_TAG;
        DtbLog.debug(str2, "Load Resource:" + str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        com.amazon.device.ads.DTBAdUtil.directAppStoreLinkToBrowser(r6.controller, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f5, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fe, code lost:
        com.amazon.device.ads.DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00f0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00f6 */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[ExcHandler: NullPointerException (unused java.lang.NullPointerException), SYNTHETIC, Splitter:B:31:0x00db] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean openUrl(java.lang.String r7) {
        /*
            r6 = this;
            android.net.Uri r0 = android.net.Uri.parse(r7)
            android.content.Context r1 = r6.context
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "com.amazon.mobile.shopping.web"
            java.lang.String r3 = r0.getScheme()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            boolean r2 = r2.equals(r3)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r3 = 1
            java.lang.String r4 = "android.intent.action.VIEW"
            if (r2 == 0) goto L_0x0054
            java.lang.String r0 = "//"
            int r0 = r7.indexOf(r0)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            if (r0 < 0) goto L_0x010d
            int r0 = r0 + 2
            int r1 = r7.length()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            if (r0 >= r1) goto L_0x010d
            java.lang.String r7 = r7.substring(r0)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r0.<init>()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            java.lang.String r1 = "https://"
            r0.append(r1)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r0.append(r7)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            java.lang.String r7 = r0.toString()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r0.<init>(r4, r7)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            android.app.Activity r7 = com.amazon.device.ads.AdRegistration.getCurrentActivity()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r7.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            com.amazon.device.ads.DTBAdMRAIDController r7 = r6.controller     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r7.onAdLeftApplication()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            return r3
        L_0x0054:
            java.lang.String r2 = "com.amazon.mobile.shopping"
            java.lang.String r5 = r0.getScheme()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            boolean r2 = r2.equals(r5)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            if (r2 == 0) goto L_0x00ad
            java.lang.String r2 = "com.amazon.mShop.android.shopping"
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r2)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            if (r1 == 0) goto L_0x0071
            android.content.Intent r7 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r7.<init>(r4)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r7.setData(r0)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            goto L_0x00a0
        L_0x0071:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r1.<init>(r4)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r1.setData(r0)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            java.lang.String r0 = "products/"
            int r0 = r7.indexOf(r0)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            if (r0 <= 0) goto L_0x009f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r2.<init>()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            java.lang.String r4 = "https://www.amazon.com/dp/"
            r2.append(r4)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            int r0 = r0 + 9
            java.lang.String r7 = r7.substring(r0)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r2.append(r7)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            java.lang.String r7 = r2.toString()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r1.setData(r7)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
        L_0x009f:
            r7 = r1
        L_0x00a0:
            android.app.Activity r0 = com.amazon.device.ads.AdRegistration.getCurrentActivity()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r0.startActivity(r7)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            com.amazon.device.ads.DTBAdMRAIDController r7 = r6.controller     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r7.onAdLeftApplication()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            return r3
        L_0x00ad:
            java.lang.String r7 = "market"
            java.lang.String r1 = r0.getScheme()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            boolean r7 = r7.equals(r1)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            if (r7 != 0) goto L_0x00db
            java.lang.String r7 = "amzn"
            java.lang.String r1 = r0.getScheme()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            boolean r7 = r7.equals(r1)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            if (r7 == 0) goto L_0x00c6
            goto L_0x00db
        L_0x00c6:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r7.<init>(r4)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r7.setData(r0)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            android.app.Activity r0 = com.amazon.device.ads.AdRegistration.getCurrentActivity()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r0.startActivity(r7)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            com.amazon.device.ads.DTBAdMRAIDController r7 = r6.controller     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            r7.onAdLeftApplication()     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            return r3
        L_0x00db:
            android.content.Intent r7 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00f0, NullPointerException -> 0x00fe }
            r7.<init>(r4)     // Catch:{ ActivityNotFoundException -> 0x00f0, NullPointerException -> 0x00fe }
            r7.setData(r0)     // Catch:{ ActivityNotFoundException -> 0x00f0, NullPointerException -> 0x00fe }
            android.app.Activity r1 = com.amazon.device.ads.AdRegistration.getCurrentActivity()     // Catch:{ ActivityNotFoundException -> 0x00f0, NullPointerException -> 0x00fe }
            r1.startActivity(r7)     // Catch:{ ActivityNotFoundException -> 0x00f0, NullPointerException -> 0x00fe }
            com.amazon.device.ads.DTBAdMRAIDController r7 = r6.controller     // Catch:{ ActivityNotFoundException -> 0x00f0, NullPointerException -> 0x00fe }
            r7.onAdLeftApplication()     // Catch:{ ActivityNotFoundException -> 0x00f0, NullPointerException -> 0x00fe }
            return r3
        L_0x00f0:
            com.amazon.device.ads.DTBAdMRAIDController r7 = r6.controller     // Catch:{ ActivityNotFoundException -> 0x00f6, NullPointerException -> 0x00fe }
            com.amazon.device.ads.DTBAdUtil.directAppStoreLinkToBrowser(r7, r0)     // Catch:{ ActivityNotFoundException -> 0x00f6, NullPointerException -> 0x00fe }
            return r3
        L_0x00f6:
            java.lang.String r7 = LOG_TAG     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            java.lang.String r0 = "App stores and browsers not found"
            com.amazon.device.ads.DtbLog.debug(r7, r0)     // Catch:{ ActivityNotFoundException -> 0x0106, NullPointerException -> 0x00fe }
            goto L_0x010d
        L_0x00fe:
            java.lang.String r7 = LOG_TAG
            java.lang.String r0 = "Current activity from AdRegistration not found"
            com.amazon.device.ads.DtbLog.debug(r7, r0)
            goto L_0x010d
        L_0x0106:
            java.lang.String r7 = LOG_TAG
            java.lang.String r0 = "Activity not found com.amazon.mobile.shopping"
            com.amazon.device.ads.DtbLog.error(r7, r0)
        L_0x010d:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdViewSupportClient.openUrl(java.lang.String):boolean");
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                this.controller.onLoadError(webResourceError.getDescription().toString(), webResourceError.getErrorCode());
            } else {
                this.controller.onLoadError();
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute onReceivedError method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute onReceivedError method", e);
        }
    }
}
