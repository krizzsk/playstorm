package com.applovin.impl.sdk.p045a;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.security.CertificateUtil;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a.b */
public abstract class C1790b {

    /* renamed from: a */
    protected final AppLovinAdBase f2841a;

    /* renamed from: b */
    protected final C1959m f2842b;

    /* renamed from: c */
    protected final C2092v f2843c;

    /* renamed from: d */
    protected final String f2844d;

    /* renamed from: e */
    protected boolean f2845e;

    /* renamed from: f */
    protected AdSession f2846f;

    /* renamed from: g */
    protected AdEvents f2847g;

    public C1790b(AppLovinAdBase appLovinAdBase) {
        this.f2841a = appLovinAdBase;
        this.f2842b = appLovinAdBase.getSdk();
        this.f2843c = appLovinAdBase.getSdk().mo14286A();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + CertificateUtil.DELIMITER + appLovinAdBase.getDspName();
        }
        this.f2844d = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AdSessionConfiguration mo13836a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AdSessionContext mo13837a(WebView webView);

    /* renamed from: a */
    public void mo13838a(View view) {
        mo13839a(view, (List<C1799d>) Collections.emptyList());
    }

    /* renamed from: a */
    public void mo13839a(final View view, final List<C1799d> list) {
        mo13842a("update main view: " + view, (Runnable) new Runnable() {
            public void run() {
                C1790b.this.f2846f.registerAdView(view);
                C1790b.this.f2846f.removeAllFriendlyObstructions();
                for (C1799d dVar : list) {
                    if (dVar.mo13855a() != null) {
                        try {
                            C1790b.this.f2846f.addFriendlyObstruction(dVar.mo13855a(), dVar.mo13856b(), dVar.mo13857c());
                        } catch (Throwable th) {
                            if (C2092v.m5047a()) {
                                C2092v vVar = C1790b.this.f2843c;
                                String str = C1790b.this.f2844d;
                                vVar.mo14790b(str, "Failed to add friendly obstruction (" + dVar + ")", th);
                            }
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13840a(AdSession adSession) {
    }

    /* renamed from: a */
    public void mo13841a(final String str) {
        mo13842a("track error", (Runnable) new Runnable() {
            public void run() {
                C1790b.this.f2846f.error(ErrorType.VIDEO, str);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13842a(final String str, final Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    if (C1790b.this.f2845e) {
                        if (C2092v.m5047a()) {
                            C2092v vVar = C1790b.this.f2843c;
                            String str = C1790b.this.f2844d;
                            vVar.mo14789b(str, "Running operation: " + str);
                        }
                        runnable.run();
                    } else if (C2092v.m5047a()) {
                        C2092v vVar2 = C1790b.this.f2843c;
                        String str2 = C1790b.this.f2844d;
                        vVar2.mo14793e(str2, "Failed to run operation: " + str);
                    }
                } catch (Throwable th) {
                    if (C2092v.m5047a()) {
                        C2092v vVar3 = C1790b.this.f2843c;
                        String str3 = C1790b.this.f2844d;
                        vVar3.mo14790b(str3, "Failed to run operation: " + str, th);
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo13843b() {
        mo13844b((WebView) null);
    }

    /* renamed from: b */
    public void mo13844b(final WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                AdSessionContext a;
                if (!C1790b.this.f2841a.isOpenMeasurementEnabled()) {
                    if (C2092v.m5047a()) {
                        C1790b.this.f2843c.mo14791c(C1790b.this.f2844d, "Skip starting session - Open Measurement disabled");
                    }
                } else if (C1790b.this.f2846f == null) {
                    if (C2092v.m5047a()) {
                        C1790b.this.f2843c.mo14789b(C1790b.this.f2844d, "Starting session");
                    }
                    AdSessionConfiguration a2 = C1790b.this.mo13836a();
                    if (a2 != null && (a = C1790b.this.mo13837a(webView)) != null) {
                        try {
                            C1790b.this.f2846f = AdSession.createAdSession(a2, a);
                            try {
                                C1790b.this.f2847g = AdEvents.createAdEvents(C1790b.this.f2846f);
                                C1790b bVar = C1790b.this;
                                bVar.mo13840a(bVar.f2846f);
                                C1790b.this.f2846f.start();
                                C1790b.this.f2845e = true;
                                if (C2092v.m5047a()) {
                                    C1790b.this.f2843c.mo14789b(C1790b.this.f2844d, "Session started");
                                }
                            } catch (Throwable th) {
                                if (C2092v.m5047a()) {
                                    C1790b.this.f2843c.mo14790b(C1790b.this.f2844d, "Failed to create ad events", th);
                                }
                            }
                        } catch (Throwable th2) {
                            if (C2092v.m5047a()) {
                                C1790b.this.f2843c.mo14790b(C1790b.this.f2844d, "Failed to create session", th2);
                            }
                        }
                    }
                } else if (C2092v.m5047a()) {
                    C2092v vVar = C1790b.this.f2843c;
                    String str = C1790b.this.f2844d;
                    vVar.mo14792d(str, "Attempting to start session again for ad: " + C1790b.this.f2841a);
                }
            }
        });
    }

    /* renamed from: c */
    public void mo13845c() {
        mo13842a("track loaded", (Runnable) new Runnable() {
            public void run() {
                C1790b.this.f2847g.loaded();
            }
        });
    }

    /* renamed from: d */
    public void mo13846d() {
        mo13842a("track impression event", (Runnable) new Runnable() {
            public void run() {
                C1790b.this.f2847g.impressionOccurred();
            }
        });
    }

    /* renamed from: e */
    public void mo13847e() {
        mo13842a("stop session", (Runnable) new Runnable() {
            public void run() {
                C1790b.this.f2845e = false;
                C1790b.this.f2846f.finish();
                C1790b.this.f2846f = null;
            }
        });
    }
}
