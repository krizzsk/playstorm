package com.ogury.p376ed;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10366bm;
import com.ogury.p376ed.internal.C10480e;
import com.ogury.p376ed.internal.C10491ej;
import com.ogury.p376ed.internal.C10512f;
import com.ogury.p376ed.internal.C10574gw;
import com.ogury.p376ed.internal.C10578h;
import com.ogury.p376ed.internal.C10679k;
import com.ogury.p376ed.internal.C10684ke;
import com.ogury.p376ed.internal.C10730lk;
import com.ogury.p376ed.internal.C10765mq;
import com.ogury.p376ed.internal.C10766mr;
import com.ogury.p376ed.internal.C10832t;
import p394io.presage.common.AdConfig;
import p394io.presage.common.network.models.RewardItem;

/* renamed from: com.ogury.ed.OguryOptinVideoAd */
public final class OguryOptinVideoAd {

    /* renamed from: a */
    private final C10366bm f26100a;

    private OguryOptinVideoAd(C10366bm bmVar) {
        this.f26100a = bmVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryOptinVideoAd(Context context, String str) {
        this(new C10366bm(context, new AdConfig(str), C10491ej.OPTIN_VIDEO));
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(str, "adUnitId");
    }

    public final boolean isLoaded() {
        return this.f26100a.mo67104b();
    }

    public final void setListener(OguryOptinVideoAdListener oguryOptinVideoAdListener) {
        OguryIntegrationLogger.m30996d("[Ads] Optin Video Ad - setListener() called");
        C10366bm bmVar = this.f26100a;
        C10512f.C10513a aVar = C10512f.f26570a;
        bmVar.mo67098a((C10578h) C10512f.C10513a.m31885a(oguryOptinVideoAdListener));
        this.f26100a.mo67100a((C10730lk<? super RewardItem, C10684ke>) new C10302a(oguryOptinVideoAdListener));
    }

    /* renamed from: com.ogury.ed.OguryOptinVideoAd$a */
    static final class C10302a extends C10766mr implements C10730lk<RewardItem, C10684ke> {

        /* renamed from: a */
        final /* synthetic */ OguryOptinVideoAdListener f26101a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10302a(OguryOptinVideoAdListener oguryOptinVideoAdListener) {
            super(1);
            this.f26101a = oguryOptinVideoAdListener;
        }

        /* renamed from: a */
        private void m31144a(RewardItem rewardItem) {
            C10765mq.m32773b(rewardItem, "rewardItem");
            OguryOptinVideoAdListener oguryOptinVideoAdListener = this.f26101a;
            if (oguryOptinVideoAdListener != null) {
                oguryOptinVideoAdListener.onAdRewarded(new OguryReward(rewardItem.getName(), rewardItem.getValue()));
            }
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo66961a(Object obj) {
            m31144a((RewardItem) obj);
            return C10684ke.f26938a;
        }
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C10366bm bmVar = this.f26100a;
        C10480e.C10481a aVar = C10480e.f26475a;
        bmVar.mo67099a((C10679k) C10480e.C10481a.m31685a(oguryAdImpressionListener));
    }

    private final void setCampaignId(String str) {
        this.f26100a.mo67103b(str);
    }

    private final void setCreativeId(String str) {
        this.f26100a.mo67105c(str);
    }

    public final void load() {
        OguryIntegrationLogger.m30996d("[Ads] Optin Video Ad - load() called");
        this.f26100a.mo67097a();
    }

    public final void show() {
        OguryIntegrationLogger.m30996d("[Ads] Optin Video Ad - show() called");
        this.f26100a.mo67101a((C10832t) C10574gw.f26698a);
    }

    public final void setUserId(String str) {
        C10765mq.m32773b(str, DataKeys.USER_ID);
        this.f26100a.mo67102a(str);
    }
}
