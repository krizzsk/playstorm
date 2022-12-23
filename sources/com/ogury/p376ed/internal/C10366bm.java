package com.ogury.p376ed.internal;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.smaato.sdk.video.vast.model.C11286Ad;
import p394io.presage.common.AdConfig;
import p394io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.internal.bm */
public final class C10366bm {

    /* renamed from: a */
    private final Context f26249a;

    /* renamed from: b */
    private final AdConfig f26250b;

    /* renamed from: c */
    private final C10491ej f26251c;

    /* renamed from: d */
    private final C10746m f26252d;

    /* renamed from: e */
    private C10706l f26253e;

    /* renamed from: f */
    private C10578h f26254f;

    /* renamed from: g */
    private C10679k f26255g;

    /* renamed from: h */
    private String f26256h;

    /* renamed from: i */
    private String f26257i;

    /* renamed from: j */
    private C10730lk<? super RewardItem, C10684ke> f26258j;

    private C10366bm(Context context, AdConfig adConfig, C10491ej ejVar, C10746m mVar) {
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(ejVar, C11286Ad.AD_TYPE);
        C10765mq.m32773b(mVar, "adsSourceFactory");
        this.f26249a = context;
        this.f26250b = adConfig;
        this.f26251c = ejVar;
        this.f26252d = mVar;
        this.f26256h = "";
    }

    public /* synthetic */ C10366bm(Context context, AdConfig adConfig, C10491ej ejVar) {
        this(context, adConfig, ejVar, new C10746m(context, adConfig, ejVar));
    }

    /* renamed from: a */
    public final void mo67100a(C10730lk<? super RewardItem, C10684ke> lkVar) {
        this.f26258j = lkVar;
    }

    /* renamed from: a */
    public final void mo67097a() {
        C10706l lVar;
        C10706l lVar2 = this.f26253e;
        boolean z = true;
        if (lVar2 == null || !lVar2.mo67818c()) {
            z = false;
        }
        if (z && (lVar = this.f26253e) != null) {
            lVar.mo67820e();
        }
        C10706l c = m31364c();
        this.f26253e = c;
        String str = this.f26257i;
        if (str != null) {
            if (c != null) {
                c.mo67817b(str);
            }
        } else if (c != null) {
            c.mo67819d();
        }
    }

    /* renamed from: c */
    private final C10706l m31364c() {
        C10706l a = this.f26252d.mo67843a();
        a.mo67810a(this.f26254f);
        a.mo67812a(this.f26258j);
        a.mo67811a(this.f26255g);
        a.mo67814a(this.f26256h);
        return a;
    }

    /* renamed from: a */
    public final void mo67098a(C10578h hVar) {
        OguryIntegrationLogger.m30996d("[Ads][" + this.f26251c.mo67288b() + "] Registering to ad listener");
        if (hVar == null) {
            OguryIntegrationLogger.m30996d("[Ads][" + this.f26251c.mo67288b() + "] Ad listener is null");
        }
        this.f26254f = hVar;
        C10706l lVar = this.f26253e;
        if (lVar != null) {
            lVar.mo67810a(hVar);
        }
    }

    /* renamed from: a */
    public final void mo67099a(C10679k kVar) {
        this.f26255g = kVar;
        C10706l lVar = this.f26253e;
        if (lVar != null) {
            lVar.mo67811a(kVar);
        }
    }

    /* renamed from: a */
    public final void mo67101a(C10832t tVar) {
        C10765mq.m32773b(tVar, "showAction");
        if (this.f26253e == null) {
            OguryIntegrationLogger.m30997e("[Ads][" + this.f26251c.mo67288b() + "][show] Failed to show (no ad loaded)");
            OguryIntegrationLogger.m30996d("[Ads][" + this.f26251c.mo67288b() + "][show] Triggering onAdError() callback");
            if (this.f26254f == null) {
                OguryIntegrationLogger.m30996d("[Ads][" + this.f26251c.mo67288b() + "][show] No ad listener registered");
            }
            C10578h hVar = this.f26254f;
            if (hVar != null) {
                hVar.mo67352e();
            }
        }
        C10706l lVar = this.f26253e;
        if (lVar != null) {
            lVar.mo67813a(tVar);
        }
    }

    /* renamed from: b */
    public final boolean mo67104b() {
        C10706l lVar = this.f26253e;
        if (lVar == null) {
            return false;
        }
        return lVar.mo67815a();
    }

    /* renamed from: a */
    public final void mo67102a(String str) {
        C10765mq.m32773b(str, DataKeys.USER_ID);
        this.f26256h = str;
    }

    /* renamed from: b */
    public final void mo67103b(String str) {
        C10765mq.m32773b(str, "campaignId");
        C10537ft.m32041a(this.f26250b, str);
    }

    /* renamed from: c */
    public final void mo67105c(String str) {
        C10765mq.m32773b(str, "creativeId");
        C10537ft.m32042b(this.f26250b, str);
    }

    /* renamed from: d */
    public final void mo67106d(String str) {
        C10765mq.m32773b(str, "adMarkup");
        this.f26257i = str;
    }
}
