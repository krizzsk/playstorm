package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.p025a.C1401a;
import com.applovin.impl.p025a.C1408d;
import com.applovin.impl.p025a.C1417l;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C2007h;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1866b;
import com.applovin.impl.sdk.p049d.C1869d;
import com.applovin.impl.sdk.utils.C2032a;
import com.applovin.impl.sdk.utils.C2043j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.applovin.impl.adview.e */
public class C1519e extends WebViewClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1959m f1890a;

    /* renamed from: b */
    private final C2092v f1891b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C1497b f1892c;

    public C1519e(C1497b bVar, C1959m mVar) {
        this.f1890a = mVar;
        this.f1891b = mVar.mo14286A();
        this.f1892c = bVar;
    }

    /* renamed from: a */
    private void m2783a(PointF pointF) {
        this.f1892c.mo12875a(pointF);
    }

    /* renamed from: a */
    private void m2784a(Uri uri, C1513d dVar) {
        String str;
        C2092v vVar;
        final String queryParameter = uri.getQueryParameter("n");
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                if (C2092v.m5047a()) {
                    C2092v vVar2 = this.f1891b;
                    vVar2.mo14789b("AdWebView", "Loading new page externally: " + queryParameter);
                }
                Utils.openUri(dVar.getContext(), Uri.parse(queryParameter), this.f1890a);
                C2043j.m4955c(this.f1892c.mo12894g(), (AppLovinAd) this.f1892c.mo12903p(), this.f1892c.mo12905r());
                return;
            } else if (TapjoyConstants.LOG_LEVEL_INTERNAL.equalsIgnoreCase(queryParameter2)) {
                if (C2092v.m5047a()) {
                    C2092v vVar3 = this.f1891b;
                    vVar3.mo14789b("AdWebView", "Loading new page in WebView: " + queryParameter);
                }
                dVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (StringUtils.isValidString(queryParameter3)) {
                    dVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
                if (C2092v.m5047a()) {
                    C2092v vVar4 = this.f1891b;
                    vVar4.mo14789b("AdWebView", "Loading new page in slide-up webview: " + queryParameter);
                }
                this.f1890a.mo14333af().mo13823a(new C2032a() {
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, (AppLovinWebViewActivity.EventListener) null);
                            C2043j.m4921a(C1519e.this.f1892c.mo12894g(), (AppLovinAd) C1519e.this.f1892c.mo12903p(), C1519e.this.f1892c.mo12905r());
                        }
                    }

                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            C2043j.m4950b(C1519e.this.f1892c.mo12894g(), (AppLovinAd) C1519e.this.f1892c.mo12903p(), C1519e.this.f1892c.mo12905r());
                            C1519e.this.f1890a.mo14333af().mo13825b(this);
                        }
                    }
                });
                Intent intent = new Intent(this.f1890a.mo14297L(), AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1890a.mo14374z());
                intent.setFlags(268435456);
                this.f1890a.mo14297L().startActivity(intent);
                return;
            } else if (C2092v.m5047a()) {
                vVar = this.f1891b;
                str = "Could not find load type in original uri";
            } else {
                return;
            }
        } else if (C2092v.m5047a()) {
            vVar = this.f1891b;
            str = "Could not find url to load from query in original uri";
        } else {
            return;
        }
        vVar.mo14793e("AdWebView", str);
    }

    /* renamed from: a */
    private void m2785a(Uri uri, C1829e eVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            String appendQueryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", eVar.getClCode());
            this.f1890a.mo14305U().mo14541a(C2007h.m4678o().mo14575c(appendQueryParameter).mo14570a(false).mo14577c(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).mo14571a());
        } else if (C2092v.m5047a()) {
            C2092v vVar = this.f1891b;
            vVar.mo14793e("AdWebView", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    /* renamed from: a */
    private void m2786a(C1401a aVar, C1513d dVar) {
        C1408d aM = aVar.mo12613aM();
        if (aM != null) {
            C1417l.m2439a(aM.mo12669c(), this.f1892c.mo12904q());
            m2787a(dVar, aM.mo12667a());
        }
    }

    /* renamed from: a */
    private void m2787a(C1513d dVar, Uri uri) {
        C1829e currentAd = dVar.getCurrentAd();
        AppLovinAdView r = this.f1892c.mo12905r();
        if (r != null && currentAd != null) {
            C1869d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.mo14104b();
            }
            if (currentAd instanceof C1401a) {
                ((C1401a) currentAd).mo12640o().mo13878o();
            }
            this.f1892c.mo12880a(currentAd, r, uri, dVar.getAndClearLastClickLocation());
        } else if (C2092v.m5047a()) {
            C2092v vVar = this.f1891b;
            vVar.mo14793e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    /* renamed from: b */
    private void m2789b() {
        this.f1892c.mo12899l();
    }

    /* renamed from: c */
    private void m2790c() {
        this.f1892c.mo12898k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1497b mo12941a() {
        return this.f1892c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0252, code lost:
        if (r6.mo12614aN() != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0152, code lost:
        if (r6.mo12614aN() != false) goto L_0x0125;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12942a(android.webkit.WebView r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            com.applovin.impl.adview.b r0 = r10.f1892c
            r1 = 1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = com.applovin.impl.sdk.C2092v.m5047a()
            java.lang.String r2 = "AdWebView"
            if (r0 == 0) goto L_0x0029
            com.applovin.impl.sdk.v r0 = r10.f1891b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Processing click on ad URL \""
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = "\""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.mo14791c(r2, r3)
        L_0x0029:
            if (r12 == 0) goto L_0x0257
            boolean r0 = r11 instanceof com.applovin.impl.adview.C1513d
            if (r0 == 0) goto L_0x0257
            android.net.Uri r0 = android.net.Uri.parse(r12)
            com.applovin.impl.adview.d r11 = (com.applovin.impl.adview.C1513d) r11
            java.lang.String r3 = r0.getScheme()
            java.lang.String r4 = r0.getHost()
            java.lang.String r5 = r0.getPath()
            com.applovin.impl.adview.b r6 = r10.f1892c
            com.applovin.impl.sdk.ad.e r6 = r6.mo12903p()
            if (r6 != 0) goto L_0x0057
            boolean r11 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r11 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r11 = r10.f1891b
            java.lang.String r12 = "Unable to process click, ad not found!"
            r11.mo14793e(r2, r12)
        L_0x0056:
            return r1
        L_0x0057:
            android.graphics.PointF r7 = r11.getLastClickLocation()
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>()
            boolean r7 = r7.equals(r8)
            r7 = r7 ^ r1
            boolean r8 = r6.mo13947J()
            r9 = 0
            if (r8 == 0) goto L_0x0070
            if (r7 == 0) goto L_0x0070
            r13 = r1
            goto L_0x0079
        L_0x0070:
            boolean r8 = r6.mo13948K()
            if (r8 == 0) goto L_0x0079
            if (r7 != 0) goto L_0x0079
            r13 = r9
        L_0x0079:
            java.lang.String r8 = "applovin"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0217
            java.lang.String r8 = "com.applovin.sdk"
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0217
            java.lang.String r13 = "/adservice/close_ad"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x00b9
            com.applovin.impl.sdk.m r11 = r10.f1890a
            com.applovin.sdk.AppLovinSdkSettings r11 = r11.mo14363p()
            java.util.Map r11 = r11.getExtraParameters()
            java.lang.String r13 = "enable_close_url_ad_value"
            java.lang.Object r11 = r11.get(r13)
            java.lang.String r11 = (java.lang.String) r11
            boolean r13 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r11)
            if (r13 == 0) goto L_0x00b4
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            if (r11 == 0) goto L_0x00b4
            java.lang.String r11 = "close_url"
            r6.setMaxAdValue(r11, r12)
        L_0x00b4:
            r10.m2789b()
            goto L_0x0257
        L_0x00b9:
            java.lang.String r13 = "/adservice/expand_ad"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x00da
            boolean r12 = r6.mo13946I()
            if (r12 == 0) goto L_0x00d1
            if (r7 != 0) goto L_0x00d1
            com.applovin.impl.sdk.v r11 = r10.f1891b
            java.lang.String r12 = "Skipping expand command without user interaction"
        L_0x00cd:
            r11.mo14793e(r2, r12)
            return r9
        L_0x00d1:
            android.graphics.PointF r11 = r11.getAndClearLastClickLocation()
            r10.m2783a((android.graphics.PointF) r11)
            goto L_0x0257
        L_0x00da:
            java.lang.String r13 = "/adservice/contract_ad"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x00e7
            r10.m2790c()
            goto L_0x0257
        L_0x00e7:
            java.lang.String r13 = "/adservice/no_op"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x00f0
            return r1
        L_0x00f0:
            java.lang.String r13 = "/adservice/load_url"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x010a
            boolean r12 = r6.mo13946I()
            if (r12 == 0) goto L_0x0105
            if (r7 != 0) goto L_0x0105
            com.applovin.impl.sdk.v r11 = r10.f1891b
            java.lang.String r12 = "Skipping URL load command without user interaction"
            goto L_0x00cd
        L_0x0105:
            r10.m2784a((android.net.Uri) r0, (com.applovin.impl.adview.C1513d) r11)
            goto L_0x0257
        L_0x010a:
            java.lang.String r13 = "/adservice/track_click_now"
            boolean r3 = r13.equals(r5)
            if (r3 == 0) goto L_0x0133
            boolean r12 = r6.mo13946I()
            if (r12 == 0) goto L_0x011f
            if (r7 != 0) goto L_0x011f
            com.applovin.impl.sdk.v r11 = r10.f1891b
            java.lang.String r12 = "Skipping click tracking command without user interaction"
            goto L_0x00cd
        L_0x011f:
            boolean r12 = r6 instanceof com.applovin.impl.p025a.C1401a
            if (r12 == 0) goto L_0x012a
            com.applovin.impl.a.a r6 = (com.applovin.impl.p025a.C1401a) r6
        L_0x0125:
            r10.m2786a((com.applovin.impl.p025a.C1401a) r6, (com.applovin.impl.adview.C1513d) r11)
            goto L_0x0257
        L_0x012a:
            android.net.Uri r12 = android.net.Uri.parse(r13)
            r10.m2787a((com.applovin.impl.adview.C1513d) r11, (android.net.Uri) r12)
            goto L_0x0257
        L_0x0133:
            java.lang.String r13 = "/adservice/deeplink"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L_0x015a
            boolean r12 = r6.mo13946I()
            if (r12 == 0) goto L_0x0148
            if (r7 != 0) goto L_0x0148
            com.applovin.impl.sdk.v r11 = r10.f1891b
            java.lang.String r12 = "Skipping deep link plus command without user interaction"
            goto L_0x00cd
        L_0x0148:
            boolean r12 = r6 instanceof com.applovin.impl.p025a.C1401a
            if (r12 == 0) goto L_0x0155
            com.applovin.impl.a.a r6 = (com.applovin.impl.p025a.C1401a) r6
            boolean r12 = r6.mo12614aN()
            if (r12 == 0) goto L_0x0155
        L_0x0154:
            goto L_0x0125
        L_0x0155:
            r10.m2787a((com.applovin.impl.adview.C1513d) r11, (android.net.Uri) r0)
            goto L_0x0257
        L_0x015a:
            java.lang.String r11 = "/adservice/postback"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0167
            r10.m2785a((android.net.Uri) r0, (com.applovin.impl.sdk.p046ad.C1829e) r6)
            goto L_0x0257
        L_0x0167:
            com.applovin.impl.adview.b r11 = r10.f1892c
            com.applovin.impl.adview.g r11 = r11.mo12895h()
            if (r11 == 0) goto L_0x01e4
            java.lang.String r11 = "/video_began"
            boolean r11 = r11.equals(r5)
            r12 = 0
            if (r11 == 0) goto L_0x018e
            java.lang.String r11 = "duration"
            java.lang.String r11 = r0.getQueryParameter(r11)
            double r11 = com.applovin.impl.sdk.utils.Utils.tryParseDouble(r11, r12)
            com.applovin.impl.adview.b r13 = r10.f1892c
            com.applovin.impl.adview.g r13 = r13.mo12895h()
            r13.mo12861a(r11)
            goto L_0x0257
        L_0x018e:
            java.lang.String r11 = "/video_completed"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01a1
            com.applovin.impl.adview.b r11 = r10.f1892c
            com.applovin.impl.adview.g r11 = r11.mo12895h()
            r11.mo12862a_()
            goto L_0x0257
        L_0x01a1:
            java.lang.String r11 = "/video_progress"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01be
            java.lang.String r11 = "percent_viewed"
            java.lang.String r11 = r0.getQueryParameter(r11)
            double r11 = com.applovin.impl.sdk.utils.Utils.tryParseDouble(r11, r12)
            com.applovin.impl.adview.b r13 = r10.f1892c
            com.applovin.impl.adview.g r13 = r13.mo12895h()
            r13.mo12863b(r11)
            goto L_0x0257
        L_0x01be:
            java.lang.String r11 = "/video_waiting"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01d1
            com.applovin.impl.adview.b r11 = r10.f1892c
            com.applovin.impl.adview.g r11 = r11.mo12895h()
            r11.mo12864b_()
            goto L_0x0257
        L_0x01d1:
            java.lang.String r11 = "/video_resumed"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0257
            com.applovin.impl.adview.b r11 = r10.f1892c
            com.applovin.impl.adview.g r11 = r11.mo12895h()
            r11.mo12808c()
            goto L_0x0257
        L_0x01e4:
            boolean r11 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r11 == 0) goto L_0x0257
            com.applovin.impl.sdk.v r11 = r10.f1891b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "Unknown URL: "
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.mo14792d(r2, r12)
            com.applovin.impl.sdk.v r11 = r10.f1891b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Path: "
            r12.append(r13)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            r11.mo14792d(r2, r12)
            goto L_0x0257
        L_0x0217:
            if (r13 == 0) goto L_0x0256
            java.util.List r12 = r6.mo13969aA()
            java.util.List r13 = r6.mo13970aB()
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto L_0x022d
            boolean r12 = r12.contains(r3)
            if (r12 == 0) goto L_0x023a
        L_0x022d:
            boolean r12 = r13.isEmpty()
            if (r12 != 0) goto L_0x0248
            boolean r12 = r13.contains(r4)
            if (r12 == 0) goto L_0x023a
            goto L_0x0248
        L_0x023a:
            boolean r11 = com.applovin.impl.sdk.C2092v.m5047a()
            if (r11 == 0) goto L_0x0257
            com.applovin.impl.sdk.v r11 = r10.f1891b
            java.lang.String r12 = "URL is not whitelisted - bypassing click"
            r11.mo14793e(r2, r12)
            goto L_0x0257
        L_0x0248:
            boolean r12 = r6 instanceof com.applovin.impl.p025a.C1401a
            if (r12 == 0) goto L_0x0155
            com.applovin.impl.a.a r6 = (com.applovin.impl.p025a.C1401a) r6
            boolean r12 = r6.mo12614aN()
            if (r12 == 0) goto L_0x0155
            goto L_0x0154
        L_0x0256:
            return r9
        L_0x0257:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.C1519e.mo12942a(android.webkit.WebView, java.lang.String, boolean):boolean");
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (C2092v.m5047a()) {
            C2092v vVar = this.f1891b;
            vVar.mo14791c("AdWebView", "Loaded resource: " + str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1497b bVar = this.f1892c;
        if (bVar != null) {
            bVar.mo12876a(webView);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C1497b bVar = this.f1892c;
        if (bVar != null) {
            C1829e p = bVar.mo12903p();
            String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
            if (p != null) {
                this.f1890a.mo14330ac().mo14097a(p).mo14100a(C1866b.f3414z, str3).mo14101a();
            }
            if (C2092v.m5047a()) {
                this.f1891b.mo14793e("AdWebView", str3 + " for ad: " + p);
            }
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1497b bVar = this.f1892c;
        if (bVar != null) {
            C1829e p = bVar.mo12903p();
            this.f1890a.mo14330ac().mo14097a(p).mo14098a(C1866b.f3384A).mo14101a();
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1891b;
                vVar.mo14793e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + p);
            }
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1497b bVar = this.f1892c;
        if (bVar != null) {
            C1829e p = bVar.mo12903p();
            String str = "Received SSL error: " + sslError;
            this.f1890a.mo14330ac().mo14097a(p).mo14100a(C1866b.f3386C, str).mo14101a();
            if (C2092v.m5047a()) {
                this.f1891b.mo14793e("AdWebView", str + " for ad: " + p);
            }
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (this.f1892c == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        if (C2092v.m5047a()) {
            C2092v.m5053i("AdWebView", "Render process gone for ad: " + this.f1892c.mo12903p() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        }
        C1829e p = this.f1892c.mo12903p();
        if (p != null) {
            this.f1890a.mo14330ac().mo14097a(p).mo14098a(C1866b.f3385B).mo14101a();
        }
        if (!((Boolean) this.f1890a.mo14311a(C1857b.f3285eF)).booleanValue()) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f1890a.mo14311a(C1857b.f3287eH)).booleanValue()) {
            String valueOf = p != null ? String.valueOf(p.getAdIdNumber()) : "null";
            throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + valueOf);
        } else if (webView == null || !webView.equals(this.f1892c.mo12906s())) {
            return true;
        } else {
            this.f1892c.mo12893f();
            AppLovinAdSize b = this.f1892c.mo12888b();
            if (!Utils.isBML(b)) {
                return true;
            }
            this.f1892c.mo12887a(b);
            this.f1892c.mo12892e();
            return true;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean hasGesture = ((Boolean) this.f1890a.mo14311a(C1857b.f3128bE)).booleanValue() ? webResourceRequest.hasGesture() : true;
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return mo12942a(webView, url.toString(), hasGesture);
        }
        if (!C2092v.m5047a()) {
            return false;
        }
        this.f1891b.mo14793e("AdWebView", "No url found for request");
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return mo12942a(webView, str, true);
    }
}
