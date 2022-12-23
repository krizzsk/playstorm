package com.applovin.impl.sdk.p045a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.applovin.impl.p025a.C1401a;
import com.applovin.impl.p025a.C1406b;
import com.applovin.impl.p025a.C1410f;
import com.applovin.impl.p025a.C1411g;
import com.applovin.impl.p025a.C1415j;
import com.applovin.impl.p025a.C1417l;
import com.applovin.impl.sdk.C2092v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.InteractionType;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.adsession.media.Position;
import com.iab.omid.library.applovin.adsession.media.VastProperties;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.a.g */
public class C1803g extends C1790b {

    /* renamed from: h */
    static final /* synthetic */ boolean f2868h = (!C1803g.class.desiredAssertionStatus());

    /* renamed from: i */
    private final C1401a f2869i;

    /* renamed from: j */
    private final AtomicBoolean f2870j = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MediaEvents f2871k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final VastProperties f2872l;

    /* renamed from: m */
    private final AtomicBoolean f2873m = new AtomicBoolean();

    /* renamed from: n */
    private final AtomicBoolean f2874n = new AtomicBoolean();

    /* renamed from: o */
    private final AtomicBoolean f2875o = new AtomicBoolean();

    /* renamed from: p */
    private final AtomicBoolean f2876p = new AtomicBoolean();

    public C1803g(C1401a aVar) {
        super(aVar);
        this.f2869i = aVar;
        this.f2872l = aVar.mo12624e() == -1 ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia((float) aVar.mo12624e(), true, Position.STANDALONE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionConfiguration mo13836a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.VIDEO, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NATIVE, false);
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                this.f2843c.mo14790b(this.f2844d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AdSessionContext mo13837a(WebView webView) {
        Set<C1415j> d;
        C1410f fVar;
        if (f2868h || this.f2869i.mo12619aS() != null) {
            ArrayList arrayList = new ArrayList();
            for (C1406b next : this.f2869i.mo12619aS().mo12663a()) {
                List<C1411g> b = next.mo12657b();
                if (!b.isEmpty()) {
                    ArrayList<C1411g> arrayList2 = new ArrayList<>();
                    for (C1411g next2 : b) {
                        if (CampaignEx.KEY_OMID.equalsIgnoreCase(next2.mo12683a())) {
                            arrayList2.add(next2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        d = next.mo12659d();
                        fVar = C1410f.API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED;
                        C1417l.m2438a(d, fVar, this.f2842b);
                    } else {
                        ArrayList<URL> arrayList3 = new ArrayList<>();
                        for (C1411g b2 : arrayList2) {
                            try {
                                arrayList3.add(new URL(b2.mo12684b()));
                            } catch (Throwable th) {
                                if (C2092v.m5047a()) {
                                    this.f2843c.mo14790b(this.f2844d, "Failed to parse JavaScript resource url", th);
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            String c = next.mo12658c();
                            String a = next.mo12656a();
                            if (!StringUtils.isValidString(c) || StringUtils.isValidString(a)) {
                                for (URL url : arrayList3) {
                                    arrayList.add(StringUtils.isValidString(c) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(a, url, c) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                                }
                            }
                        }
                    }
                }
                d = next.mo12659d();
                fVar = C1410f.FAILED_TO_LOAD_RESOURCE;
                C1417l.m2438a(d, fVar, this.f2842b);
            }
            String e = this.f2842b.mo14339al().mo13865e();
            if (TextUtils.isEmpty(e)) {
                if (C2092v.m5047a()) {
                    this.f2843c.mo14793e(this.f2844d, "JavaScript SDK content not loaded successfully");
                }
                return null;
            }
            try {
                return AdSessionContext.createNativeAdSessionContext(this.f2842b.mo14339al().mo13864d(), e, arrayList, this.f2869i.getOpenMeasurementContentUrl(), this.f2869i.getOpenMeasurementCustomReferenceData());
            } catch (Throwable th2) {
                if (!C2092v.m5047a()) {
                    return null;
                }
                this.f2843c.mo14790b(this.f2844d, "Failed to create ad session context", th2);
                return null;
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public void mo13867a(final float f, final boolean z) {
        if (this.f2873m.compareAndSet(false, true)) {
            mo13842a("track started", (Runnable) new Runnable() {
                public void run() {
                    C1803g.this.f2871k.start(f, z ? 0.0f : 1.0f);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13840a(AdSession adSession) {
        try {
            this.f2871k = MediaEvents.createMediaEvents(adSession);
        } catch (Throwable th) {
            if (C2092v.m5047a()) {
                this.f2843c.mo14790b(this.f2844d, "Failed to create media events", th);
            }
        }
    }

    /* renamed from: a */
    public void mo13868a(final boolean z) {
        mo13842a("track volume changed", (Runnable) new Runnable() {
            public void run() {
                C1803g.this.f2871k.volumeChange(z ? 0.0f : 1.0f);
            }
        });
    }

    /* renamed from: c */
    public void mo13845c() {
        mo13842a("track loaded", (Runnable) new Runnable() {
            public void run() {
                C1803g.this.f2847g.loaded(C1803g.this.f2872l);
            }
        });
    }

    /* renamed from: f */
    public void mo13869f() {
        if (this.f2874n.compareAndSet(false, true)) {
            mo13842a("track first quartile", (Runnable) new Runnable() {
                public void run() {
                    C1803g.this.f2871k.firstQuartile();
                }
            });
        }
    }

    /* renamed from: g */
    public void mo13870g() {
        if (this.f2875o.compareAndSet(false, true)) {
            mo13842a("track midpoint", (Runnable) new Runnable() {
                public void run() {
                    C1803g.this.f2871k.midpoint();
                }
            });
        }
    }

    /* renamed from: h */
    public void mo13871h() {
        if (this.f2876p.compareAndSet(false, true)) {
            mo13842a("track third quartile", (Runnable) new Runnable() {
                public void run() {
                    C1803g.this.f2871k.thirdQuartile();
                }
            });
        }
    }

    /* renamed from: i */
    public void mo13872i() {
        mo13842a("track completed", (Runnable) new Runnable() {
            public void run() {
                C1803g.this.f2871k.complete();
            }
        });
    }

    /* renamed from: j */
    public void mo13873j() {
        mo13842a("track paused", (Runnable) new Runnable() {
            public void run() {
                C1803g.this.f2871k.pause();
            }
        });
    }

    /* renamed from: k */
    public void mo13874k() {
        mo13842a("track resumed", (Runnable) new Runnable() {
            public void run() {
                C1803g.this.f2871k.resume();
            }
        });
    }

    /* renamed from: l */
    public void mo13875l() {
        if (this.f2870j.compareAndSet(false, true)) {
            mo13842a("buffer started", (Runnable) new Runnable() {
                public void run() {
                    C1803g.this.f2871k.bufferStart();
                }
            });
        }
    }

    /* renamed from: m */
    public void mo13876m() {
        if (this.f2870j.compareAndSet(true, false)) {
            mo13842a("buffer finished", (Runnable) new Runnable() {
                public void run() {
                    C1803g.this.f2871k.bufferFinish();
                }
            });
        }
    }

    /* renamed from: n */
    public void mo13877n() {
        mo13842a("track skipped", (Runnable) new Runnable() {
            public void run() {
                C1803g.this.f2871k.skipped();
            }
        });
    }

    /* renamed from: o */
    public void mo13878o() {
        mo13842a("track clicked", (Runnable) new Runnable() {
            public void run() {
                C1803g.this.f2871k.adUserInteraction(InteractionType.CLICK);
            }
        });
    }
}
