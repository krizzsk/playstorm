package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.p025a.C1401a;
import com.applovin.impl.p025a.C1408d;
import com.applovin.impl.p025a.C1412h;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.network.C2010i;
import com.applovin.impl.sdk.p046ad.C1824a;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.impl.sdk.p049d.C1869d;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.d */
public class C1513d extends C1524h {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static WebView f1878c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2092v f1879a;

    /* renamed from: b */
    private final C1959m f1880b;

    /* renamed from: d */
    private C1869d f1881d;

    /* renamed from: e */
    private C1829e f1882e;

    /* renamed from: f */
    private boolean f1883f;

    public C1513d(C1519e eVar, C1959m mVar, Context context) {
        this(eVar, mVar, context, false);
    }

    C1513d(C1519e eVar, C1959m mVar, Context context, boolean z) {
        super(context);
        if (mVar != null) {
            this.f1880b = mVar;
            this.f1879a = mVar.mo14286A();
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            setWebViewClient(eVar);
            setWebChromeClient(new C1512c(eVar != null ? eVar.mo12941a() : null, mVar));
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (C2039g.m4890i() && ((Boolean) mVar.mo14311a(C1857b.f3290eK)).booleanValue()) {
                setWebViewRenderProcessClient(new C1521f(mVar).mo12953a());
            }
            setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (view.hasFocus()) {
                        return false;
                    }
                    view.requestFocus();
                    return false;
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    if (!C2092v.m5047a()) {
                        return true;
                    }
                    C1513d.this.f1879a.mo14789b("AdWebView", "Received a LongClick event.");
                    return true;
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* renamed from: a */
    private String m2772a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m2774a(final C2010i iVar, final C1959m mVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                String a = C2010i.this.mo14478a();
                C1513d.m2778c();
                if (C1513d.f1878c == null) {
                    appLovinPostbackListener.onPostbackFailure(a, -1);
                    return;
                }
                if (C2010i.this.mo14483c() != null) {
                    a = StringUtils.appendQueryParameters(a, C2010i.this.mo14483c(), ((Boolean) mVar.mo14311a(C1857b.f3259df)).booleanValue());
                }
                String str = "al_firePostback('" + a + "');";
                if (C2039g.m4884c()) {
                    C1513d.f1878c.evaluateJavascript(str, (ValueCallback) null);
                } else {
                    C1513d.f1878c.loadUrl("javascript:" + str);
                }
                appLovinPostbackListener.onPostbackSuccess(a);
            }
        });
    }

    /* renamed from: a */
    private void m2775a(String str, String str2, String str3, C1959m mVar) {
        String a = m2772a(str3, str);
        if (StringUtils.isValidString(a)) {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1879a;
                vVar.mo14789b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a);
            }
            loadDataWithBaseURL(str2, a, "text/html", (String) null, "");
            return;
        }
        String a2 = m2772a((String) mVar.mo14311a(C1857b.f3310eg), str);
        if (StringUtils.isValidString(a2)) {
            if (C2092v.m5047a()) {
                C2092v vVar2 = this.f1879a;
                vVar2.mo14789b("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a2);
            }
            loadDataWithBaseURL(str2, a2, "text/html", (String) null, "");
            return;
        }
        if (C2092v.m5047a()) {
            C2092v vVar3 = this.f1879a;
            vVar3.mo14789b("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    /* renamed from: b */
    private void m2777b(C1829e eVar) {
        Boolean n;
        Integer a;
        loadUrl("about:blank");
        int az = this.f1882e.mo14005az();
        if (az >= 0) {
            setLayerType(az, (Paint) null);
        }
        if (C2039g.m4883b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(eVar.mo14001av());
        }
        if (C2039g.m4884c() && eVar.mo14003ax()) {
            setWebContentsDebuggingEnabled(true);
        }
        C1557v ay = eVar.mo14004ay();
        if (ay != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b = ay.mo13024b();
            if (b != null) {
                settings.setPluginState(b);
            }
            Boolean c = ay.mo13025c();
            if (c != null) {
                settings.setAllowFileAccess(c.booleanValue());
            }
            Boolean d = ay.mo13026d();
            if (d != null) {
                settings.setLoadWithOverviewMode(d.booleanValue());
            }
            Boolean e = ay.mo13027e();
            if (e != null) {
                settings.setUseWideViewPort(e.booleanValue());
            }
            Boolean f = ay.mo13028f();
            if (f != null) {
                settings.setAllowContentAccess(f.booleanValue());
            }
            Boolean g = ay.mo13029g();
            if (g != null) {
                settings.setBuiltInZoomControls(g.booleanValue());
            }
            Boolean h = ay.mo13030h();
            if (h != null) {
                settings.setDisplayZoomControls(h.booleanValue());
            }
            Boolean i = ay.mo13031i();
            if (i != null) {
                settings.setSaveFormData(i.booleanValue());
            }
            Boolean j = ay.mo13032j();
            if (j != null) {
                settings.setGeolocationEnabled(j.booleanValue());
            }
            Boolean k = ay.mo13033k();
            if (k != null) {
                settings.setNeedInitialFocus(k.booleanValue());
            }
            Boolean l = ay.mo13034l();
            if (l != null) {
                settings.setAllowFileAccessFromFileURLs(l.booleanValue());
            }
            Boolean m = ay.mo13035m();
            if (m != null) {
                settings.setAllowUniversalAccessFromFileURLs(m.booleanValue());
            }
            if (C2039g.m4885d() && (a = ay.mo13023a()) != null) {
                settings.setMixedContentMode(a.intValue());
            }
            if (C2039g.m4886e() && (n = ay.mo13036n()) != null) {
                settings.setOffscreenPreRaster(n.booleanValue());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m2778c() {
        if (f1878c == null) {
            WebView tryToCreateWebView = Utils.tryToCreateWebView(C1959m.m4401M(), "postbacks");
            f1878c = tryToCreateWebView;
            if (tryToCreateWebView != null) {
                tryToCreateWebView.getSettings().setJavaScriptEnabled(true);
                f1878c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
                f1878c.setWebViewClient(new WebViewClient() {
                    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                        if (webView != C1513d.f1878c) {
                            return true;
                        }
                        C1513d.f1878c.destroy();
                        WebView unused = C1513d.f1878c = null;
                        AppLovinSdkUtils.runOnUiThread(new Runnable() {
                            public void run() {
                                C1513d.m2778c();
                            }
                        });
                        return true;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void mo12926a(C1829e eVar) {
        C2092v vVar;
        String str;
        C2092v vVar2;
        String str2;
        String str3;
        String aw;
        String str4;
        String str5;
        String str6;
        String aw2;
        C1959m mVar;
        if (!this.f1883f) {
            this.f1882e = eVar;
            try {
                m2777b(eVar);
                if (Utils.isBML(eVar.getSize())) {
                    setVisibility(0);
                }
                if (eVar instanceof C1824a) {
                    C1824a aVar = (C1824a) eVar;
                    String b = aVar.mo12621b();
                    if (aVar.isOpenMeasurementEnabled()) {
                        b = this.f1880b.mo14339al().mo13860a(b);
                    }
                    loadDataWithBaseURL(eVar.mo14002aw(), b, "text/html", (String) null, "");
                    if (C2092v.m5047a()) {
                        vVar = this.f1879a;
                        str = "AppLovinAd rendered";
                    } else {
                        return;
                    }
                } else if (eVar instanceof C1401a) {
                    C1401a aVar2 = (C1401a) eVar;
                    C1408d aM = aVar2.mo12613aM();
                    if (aM != null) {
                        C1412h b2 = aM.mo12668b();
                        Uri b3 = b2.mo12691b();
                        String uri = b3 != null ? b3.toString() : "";
                        String c = b2.mo12692c();
                        String aO = aVar2.mo12615aO();
                        if (!StringUtils.isValidString(uri)) {
                            if (!StringUtils.isValidString(c)) {
                                if (C2092v.m5047a()) {
                                    vVar2 = this.f1879a;
                                    str2 = "Unable to load companion ad. No resources provided.";
                                    vVar2.mo14793e("AdWebView", str2);
                                    return;
                                }
                                return;
                            }
                        }
                        if (b2.mo12688a() == C1412h.C1413a.STATIC) {
                            if (C2092v.m5047a()) {
                                this.f1879a.mo14789b("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            loadDataWithBaseURL(eVar.mo14002aw(), m2772a((String) this.f1880b.mo14311a(C1857b.f3309ef), uri), "text/html", (String) null, "");
                            return;
                        }
                        if (b2.mo12688a() == C1412h.C1413a.HTML) {
                            if (StringUtils.isValidString(c)) {
                                String a = m2772a(aO, c);
                                str3 = StringUtils.isValidString(a) ? a : c;
                                if (C2092v.m5047a()) {
                                    C2092v vVar3 = this.f1879a;
                                    vVar3.mo14789b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                                }
                                aw = eVar.mo14002aw();
                                str4 = "text/html";
                                str5 = null;
                                str6 = "";
                            } else if (StringUtils.isValidString(uri)) {
                                if (C2092v.m5047a()) {
                                    this.f1879a.mo14789b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                aw2 = eVar.mo14002aw();
                                mVar = this.f1880b;
                                m2775a(uri, aw2, aO, mVar);
                                return;
                            } else {
                                return;
                            }
                        } else if (b2.mo12688a() == C1412h.C1413a.IFRAME) {
                            if (StringUtils.isValidString(uri)) {
                                if (C2092v.m5047a()) {
                                    this.f1879a.mo14789b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                aw2 = eVar.mo14002aw();
                                mVar = this.f1880b;
                                m2775a(uri, aw2, aO, mVar);
                                return;
                            } else if (StringUtils.isValidString(c)) {
                                String a2 = m2772a(aO, c);
                                str3 = StringUtils.isValidString(a2) ? a2 : c;
                                if (C2092v.m5047a()) {
                                    C2092v vVar4 = this.f1879a;
                                    vVar4.mo14789b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                }
                                aw = eVar.mo14002aw();
                                str4 = "text/html";
                                str5 = null;
                                str6 = "";
                            } else {
                                return;
                            }
                        } else if (C2092v.m5047a()) {
                            vVar2 = this.f1879a;
                            str2 = "Failed to render VAST companion ad of invalid type";
                            vVar2.mo14793e("AdWebView", str2);
                            return;
                        } else {
                            return;
                        }
                        loadDataWithBaseURL(aw, str3, str4, str5, str6);
                        return;
                    } else if (C2092v.m5047a()) {
                        vVar = this.f1879a;
                        str = "No companion ad provided.";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                vVar.mo14789b("AdWebView", str);
            } catch (Throwable th) {
                String valueOf = eVar != null ? String.valueOf(eVar.getAdIdNumber()) : "null";
                throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
            }
        } else if (C2092v.m5047a()) {
            C2092v.m5053i("AdWebView", "Ad can not be loaded in a destroyed webview");
        }
    }

    /* renamed from: a */
    public void mo12927a(String str) {
        mo12928a(str, (Runnable) null);
    }

    /* renamed from: a */
    public void mo12928a(String str, Runnable runnable) {
        try {
            if (C2092v.m5047a()) {
                C2092v vVar = this.f1879a;
                vVar.mo14789b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            }
            loadUrl(str);
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                this.f1879a.mo14790b("AdWebView", "Unable to forward to template", th);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void computeScroll() {
    }

    public void destroy() {
        this.f1883f = true;
        super.destroy();
    }

    /* access modifiers changed from: package-private */
    public C1829e getCurrentAd() {
        return this.f1882e;
    }

    public C1869d getStatsManagerHelper() {
        return this.f1881d;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    public void scrollTo(int i, int i2) {
    }

    public void setStatsManagerHelper(C1869d dVar) {
        this.f1881d = dVar;
    }
}
