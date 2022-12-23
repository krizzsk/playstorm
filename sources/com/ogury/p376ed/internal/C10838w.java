package com.ogury.p376ed.internal;

import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.ogury.core.internal.OguryIntegrationLogger;
import java.util.List;
import p394io.presage.common.AdConfig;
import p394io.presage.interstitial.p395ui.InterstitialActivity;

/* renamed from: com.ogury.ed.internal.w */
public final class C10838w {

    /* renamed from: a */
    private final Context f27062a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final FrameLayout f27063b;

    /* renamed from: c */
    private final C10837v f27064c;

    /* renamed from: d */
    private final C10842x f27065d;

    /* renamed from: e */
    private C10843y f27066e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C10833u f27067f;

    /* renamed from: g */
    private C10706l f27068g;

    /* renamed from: h */
    private C10679k f27069h;

    /* renamed from: i */
    private C10706l f27070i;

    /* renamed from: j */
    private C10833u f27071j;

    /* renamed from: k */
    private C10407cn f27072k;

    private C10838w(Context context, FrameLayout frameLayout, C10837v vVar, C10842x xVar, C10843y yVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(frameLayout, TtmlNode.RUBY_CONTAINER);
        C10765mq.m32773b(vVar, "adControllerFactory");
        C10765mq.m32773b(xVar, "adsSourceFactory");
        C10765mq.m32773b(yVar, "bannerCallback");
        this.f27062a = context;
        this.f27063b = frameLayout;
        this.f27064c = vVar;
        this.f27065d = xVar;
        this.f27066e = yVar;
        yVar.mo67899a((C10729lj<C10684ke>) new C10729lj<C10684ke>(this) {
            /* renamed from: h */
            private void m32908h() {
                ((C10838w) this.f26984a).m32901e();
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo67074a() {
                m32908h();
                return C10684ke.f26938a;
            }
        });
    }

    public /* synthetic */ C10838w(Context context, FrameLayout frameLayout) {
        this(context, frameLayout, new C10837v(InterstitialActivity.f29347a), new C10842x(context), new C10843y());
    }

    /* renamed from: a */
    public final void mo67892a(C10578h hVar) {
        OguryIntegrationLogger.m30996d("[Ads][Banner View] Registering to ad listener");
        if (hVar == null) {
            OguryIntegrationLogger.m30996d("[Ads][Banner View] Ad listener is null");
        }
        this.f27066e.mo67898a(hVar);
        this.f27066e.mo67899a((C10729lj<C10684ke>) new C10840a(this));
    }

    /* renamed from: com.ogury.ed.internal.w$a */
    /* synthetic */ class C10840a extends C10764mp implements C10729lj<C10684ke> {
        C10840a(Object obj) {
            super(0, obj, C10838w.class, "onAdLoaded", "onAdLoaded()V");
        }

        /* renamed from: h */
        private void m32910h() {
            ((C10838w) this.f26984a).m32901e();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo67074a() {
            m32910h();
            return C10684ke.f26938a;
        }
    }

    /* renamed from: a */
    public final void mo67893a(C10679k kVar) {
        this.f27069h = kVar;
    }

    /* renamed from: a */
    public final void mo67894a(AdConfig adConfig, C10491ej ejVar, C10407cn cnVar) {
        C10765mq.m32773b(adConfig, "adConfig");
        C10765mq.m32773b(cnVar, "adSize");
        if (ejVar == null) {
            OguryIntegrationLogger.m30997e("[Ads][Banner View][load][" + adConfig.getAdUnitId() + "] Failed to load (invalid banner ad size)");
            throw new IllegalArgumentException("Ad size must be set before loading an ad".toString());
        } else if (ejVar.mo67291e()) {
            boolean z = false;
            if (adConfig.getAdUnitId().length() > 0) {
                this.f27072k = cnVar;
                C10706l lVar = this.f27068g;
                if (lVar != null && lVar.mo67818c()) {
                    z = true;
                }
                if (z) {
                    C10833u uVar = this.f27067f;
                    if (uVar != null) {
                        uVar.mo67889b();
                    }
                    C10706l lVar2 = this.f27068g;
                    if (lVar2 != null) {
                        lVar2.mo67820e();
                    }
                } else {
                    this.f27070i = this.f27068g;
                    this.f27071j = this.f27067f;
                }
                C10837v vVar = this.f27064c;
                Context applicationContext = this.f27062a.getApplicationContext();
                if (applicationContext != null) {
                    this.f27067f = vVar.mo67890a((Application) applicationContext);
                    C10706l a = this.f27065d.mo67897a(adConfig, ejVar);
                    this.f27068g = a;
                    if (a != null) {
                        a.mo67810a((C10578h) this.f27066e);
                    }
                    C10706l lVar3 = this.f27068g;
                    if (lVar3 != null) {
                        lVar3.mo67811a(this.f27069h);
                    }
                    C10706l lVar4 = this.f27068g;
                    if (lVar4 != null) {
                        lVar4.mo67819d();
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            OguryIntegrationLogger.m30997e("[Ads][" + ejVar.mo67288b() + "][load] Failed to load (invalid ad unit ID: \"" + adConfig.getAdUnitId() + "\")");
            throw new IllegalArgumentException("Ad unit must be set before loading an ad".toString());
        } else {
            OguryIntegrationLogger.m30997e("[Ads][Banner View][load][" + adConfig.getAdUnitId() + "] Failed to load (invalid ad type: " + ejVar.mo67288b() + ')');
            throw new IllegalArgumentException(("AdType " + ejVar + " is not a banner type").toString());
        }
    }

    /* renamed from: d */
    private final void m32900d() {
        if (this.f27068g == null) {
            this.f27066e.mo67352e();
        }
        C10706l lVar = this.f27068g;
        if (lVar != null) {
            lVar.mo67813a((C10832t) new C10841b(this));
        }
    }

    /* renamed from: com.ogury.ed.internal.w$b */
    public static final class C10841b implements C10832t {

        /* renamed from: a */
        final /* synthetic */ C10838w f27073a;

        C10841b(C10838w wVar) {
            this.f27073a = wVar;
        }

        /* renamed from: a */
        public final void mo67135a(Context context, List<C10483eb> list) {
            C10765mq.m32773b(context, "context");
            C10765mq.m32773b(list, CampaignUnit.JSON_KEY_ADS);
            C10833u b = this.f27073a.f27067f;
            if (b != null) {
                b.mo67886a(this.f27073a.f27063b, list);
            }
        }
    }

    /* renamed from: a */
    public final void mo67891a() {
        C10833u uVar;
        C10407cn cnVar = this.f27072k;
        if (cnVar != null && (uVar = this.f27067f) != null) {
            uVar.mo67887a(cnVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m32901e() {
        C10706l lVar = this.f27070i;
        if (lVar != null) {
            lVar.mo67820e();
        }
        C10833u uVar = this.f27071j;
        if (uVar != null) {
            uVar.mo67889b();
        }
        m32900d();
    }

    /* renamed from: b */
    public final void mo67895b() {
        C10833u uVar = this.f27067f;
        if (uVar != null) {
            uVar.mo67889b();
        }
        C10706l lVar = this.f27068g;
        if (lVar != null) {
            lVar.mo67820e();
        }
        this.f27067f = null;
        this.f27068g = null;
        this.f27066e.mo67899a((C10729lj<C10684ke>) null);
        this.f27066e.mo67898a((C10578h) null);
    }

    /* renamed from: c */
    public final boolean mo67896c() {
        C10833u uVar = this.f27067f;
        if (uVar == null) {
            return false;
        }
        return uVar.mo67888a();
    }
}
