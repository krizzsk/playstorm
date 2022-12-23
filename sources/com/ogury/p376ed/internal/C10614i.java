package com.ogury.p376ed.internal;

import com.ogury.core.internal.OguryIntegrationLogger;
import com.smaato.sdk.video.vast.model.C11286Ad;
import java.util.ArrayList;
import java.util.List;
import p394io.presage.common.AdConfig;
import p394io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.i */
public final class C10614i {

    /* renamed from: a */
    private C10729lj<C10684ke> f26790a;

    /* renamed from: b */
    private int f26791b;

    /* renamed from: c */
    private boolean f26792c = true;

    /* renamed from: d */
    private boolean f26793d = true;

    /* renamed from: e */
    private boolean f26794e = true;

    /* renamed from: f */
    private List<String> f26795f = new ArrayList();

    /* renamed from: g */
    private int f26796g;

    /* renamed from: h */
    private boolean f26797h;

    /* renamed from: a */
    public final void mo67610a(C10729lj<C10684ke> ljVar) {
        this.f26790a = ljVar;
    }

    /* renamed from: a */
    public final void mo67608a(int i) {
        this.f26791b = i;
    }

    /* renamed from: a */
    public final void mo67609a(C10585hf hfVar, C10491ej ejVar, AdConfig adConfig, C10578h hVar, C10730lk<? super RewardItem, C10684ke> lkVar, C10679k kVar) {
        C10765mq.m32773b(hfVar, "event");
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        if (C10765mq.m32772a((Object) hfVar.mo67539c(), (Object) "adDisplayed")) {
            m32338a(ejVar, adConfig, hVar);
        } else if (C10765mq.m32772a((Object) hfVar.mo67539c(), (Object) "adImpression")) {
            m32339a(ejVar, adConfig, hfVar.mo67538b(), kVar);
        } else if (C10765mq.m32772a((Object) hfVar.mo67539c(), (Object) "adClosed")) {
            m32347c(ejVar, adConfig, hVar);
        } else if (C10765mq.m32772a((Object) hfVar.mo67539c(), (Object) "closeWhithoutShowNextAd")) {
            m32348d(ejVar, adConfig, hVar);
        } else if (hfVar instanceof C10588hi) {
            m32342a((C10588hi) hfVar, ejVar, adConfig, lkVar);
        } else if (hfVar instanceof C10579ha) {
            m32346b(ejVar, adConfig, hVar);
        } else if (hfVar instanceof C10584he) {
            m32341a((C10584he) hfVar, ejVar, adConfig, hVar);
        }
    }

    /* renamed from: a */
    private final void m32338a(C10491ej ejVar, AdConfig adConfig, C10578h hVar) {
        if (this.f26792c) {
            this.f26792c = false;
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo67288b());
            sb.append("][show][");
            String str = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Ad successfully shown!");
            OguryIntegrationLogger.m30996d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo67288b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdDisplayed() callback");
            OguryIntegrationLogger.m30996d(sb2.toString());
            String b = ejVar.mo67288b();
            if (adConfig != null) {
                str = adConfig.getAdUnitId();
            }
            m32340a(hVar, b, str);
            if (hVar != null) {
                hVar.mo67353f();
            }
        }
    }

    /* renamed from: a */
    private final void m32339a(C10491ej ejVar, AdConfig adConfig, String str, C10679k kVar) {
        if (!this.f26795f.contains(str)) {
            this.f26795f.add(str);
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo67288b());
            sb.append("][show][");
            String str2 = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Impression");
            OguryIntegrationLogger.m30996d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo67288b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdImpression() callback");
            OguryIntegrationLogger.m30996d(sb2.toString());
            String b = ejVar.mo67288b();
            if (adConfig != null) {
                str2 = adConfig.getAdUnitId();
            }
            m32343a(kVar, b, str2);
            if (kVar != null) {
                kVar.mo67211a();
            }
        }
    }

    /* renamed from: b */
    private final void m32346b(C10491ej ejVar, AdConfig adConfig, C10578h hVar) {
        if (this.f26793d) {
            this.f26793d = false;
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo67288b());
            sb.append("][show][");
            String str = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Ad clicked");
            OguryIntegrationLogger.m30996d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo67288b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdClicked() callback");
            OguryIntegrationLogger.m30996d(sb2.toString());
            String b = ejVar.mo67288b();
            if (adConfig != null) {
                str = adConfig.getAdUnitId();
            }
            m32340a(hVar, b, str);
            if (hVar != null) {
                hVar.mo67087a();
            }
        }
    }

    /* renamed from: c */
    private final void m32347c(C10491ej ejVar, AdConfig adConfig, C10578h hVar) {
        this.f26796g++;
        m32349e(ejVar, adConfig, hVar);
    }

    /* renamed from: d */
    private final void m32348d(C10491ej ejVar, AdConfig adConfig, C10578h hVar) {
        this.f26797h = true;
        m32349e(ejVar, adConfig, hVar);
    }

    /* renamed from: e */
    private final void m32349e(C10491ej ejVar, AdConfig adConfig, C10578h hVar) {
        if (this.f26794e && m32345a()) {
            this.f26794e = false;
            StringBuilder sb = new StringBuilder("[Ads][");
            sb.append(ejVar.mo67288b());
            sb.append("][show][");
            String str = null;
            sb.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb.append("] Ad closed");
            OguryIntegrationLogger.m30996d(sb.toString());
            StringBuilder sb2 = new StringBuilder("[Ads][");
            sb2.append(ejVar.mo67288b());
            sb2.append("][show][");
            sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
            sb2.append("] Triggering onAdClosed() callback");
            OguryIntegrationLogger.m30996d(sb2.toString());
            String b = ejVar.mo67288b();
            if (adConfig != null) {
                str = adConfig.getAdUnitId();
            }
            m32340a(hVar, b, str);
            if (hVar != null) {
                hVar.mo67354g();
            }
            C10729lj<C10684ke> ljVar = this.f26790a;
            if (ljVar != null) {
                ljVar.mo67074a();
            }
        }
    }

    /* renamed from: a */
    private static void m32342a(C10588hi hiVar, C10491ej ejVar, AdConfig adConfig, C10730lk<? super RewardItem, C10684ke> lkVar) {
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(ejVar.mo67288b());
        sb.append("][show][");
        String str = null;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("] Reward: ");
        sb.append(hiVar.mo67540a().getValue());
        sb.append(' ');
        sb.append(hiVar.mo67540a().getName());
        OguryIntegrationLogger.m30996d(sb.toString());
        StringBuilder sb2 = new StringBuilder("[Ads][");
        sb2.append(ejVar.mo67288b());
        sb2.append("][show][");
        sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb2.append("] Triggering onAdRewarded() callback");
        OguryIntegrationLogger.m30996d(sb2.toString());
        String b = ejVar.mo67288b();
        if (adConfig != null) {
            str = adConfig.getAdUnitId();
        }
        m32344a(lkVar, b, str);
        if (lkVar != null) {
            lkVar.mo66961a(hiVar.mo67540a());
        }
    }

    /* renamed from: a */
    private static void m32341a(C10584he heVar, C10491ej ejVar, AdConfig adConfig, C10578h hVar) {
        StringBuilder sb = new StringBuilder("[Ads][");
        sb.append(ejVar.mo67288b());
        sb.append("][show][");
        String str = null;
        sb.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb.append("]* Failed to show (error code: ");
        sb.append(heVar.mo67537a());
        OguryIntegrationLogger.m30997e(sb.toString());
        StringBuilder sb2 = new StringBuilder("[Ads][");
        sb2.append(ejVar.mo67288b());
        sb2.append("][show][");
        sb2.append(adConfig == null ? null : adConfig.getAdUnitId());
        sb2.append("] Triggering onAdError() callback");
        OguryIntegrationLogger.m30996d(sb2.toString());
        String b = ejVar.mo67288b();
        if (adConfig != null) {
            str = adConfig.getAdUnitId();
        }
        m32340a(hVar, b, str);
        if (hVar != null) {
            hVar.mo67348a(heVar.mo67537a());
        }
    }

    /* renamed from: a */
    private final boolean m32345a() {
        return this.f26796g == this.f26791b || this.f26797h;
    }

    /* renamed from: a */
    private static void m32340a(C10578h hVar, String str, String str2) {
        if (hVar == null) {
            OguryIntegrationLogger.m30996d("[Ads][" + str + "][show][" + str2 + "] No ad listener registered");
        }
    }

    /* renamed from: a */
    private static void m32343a(C10679k kVar, String str, String str2) {
        if (kVar == null) {
            OguryIntegrationLogger.m30996d("[Ads][" + str + "][show][" + str2 + "] No impression listener registered");
        }
    }

    /* renamed from: a */
    private static void m32344a(C10730lk<? super RewardItem, C10684ke> lkVar, String str, String str2) {
        if (lkVar == null) {
            OguryIntegrationLogger.m30996d("[Ads][" + str + "][show][" + str2 + "] No ad listener registered");
        }
    }
}
