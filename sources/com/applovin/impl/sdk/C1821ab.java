package com.applovin.impl.sdk;

import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.sdk.p050e.C1877a;
import com.applovin.impl.sdk.p050e.C1908o;
import com.applovin.impl.sdk.p050e.C1934z;
import com.applovin.impl.sdk.utils.C2039g;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.ab */
public class C1821ab {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static WebView f2910a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile String f2911b;

    /* renamed from: a */
    public static String m3814a() {
        return f2911b;
    }

    /* renamed from: a */
    public static void m3816a(C1959m mVar) {
    }

    /* renamed from: b */
    public static void m3818b(final C1959m mVar) {
        if (f2911b == null) {
            f2911b = "";
            if (C2039g.m4883b()) {
                mVar.mo14303S().mo14206a((C1877a) new C1934z(mVar, true, new Runnable() {
                    public void run() {
                        try {
                            String unused = C1821ab.f2911b = WebSettings.getDefaultUserAgent(C1959m.this.mo14297L());
                        } catch (Throwable th) {
                            if (C2092v.m5047a()) {
                                C1959m.this.mo14286A().mo14790b("WebViewDataCollector", "Failed to collect user agent", th);
                            }
                        }
                    }
                }), C1908o.C1910a.BACKGROUND);
            } else {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C1821ab.m3816a(C1959m.this);
                            String unused = C1821ab.f2911b = C1821ab.f2910a.getSettings().getUserAgentString();
                        } catch (Throwable th) {
                            if (C2092v.m5047a()) {
                                C1959m.this.mo14286A().mo14790b("WebViewDataCollector", "Failed to collect user agent", th);
                            }
                        }
                    }
                });
            }
        }
    }
}
