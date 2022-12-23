package com.ogury.p376ed;

import android.content.Context;
import com.ogury.core.internal.OguryIntegrationLogger;
import com.ogury.p376ed.internal.C10366bm;
import com.ogury.p376ed.internal.C10480e;
import com.ogury.p376ed.internal.C10491ej;
import com.ogury.p376ed.internal.C10512f;
import com.ogury.p376ed.internal.C10574gw;
import com.ogury.p376ed.internal.C10578h;
import com.ogury.p376ed.internal.C10679k;
import com.ogury.p376ed.internal.C10765mq;
import com.ogury.p376ed.internal.C10832t;
import p394io.presage.common.AdConfig;

/* renamed from: com.ogury.ed.OguryInterstitialAd */
public final class OguryInterstitialAd {

    /* renamed from: a */
    private final C10366bm f26099a;

    private OguryInterstitialAd(C10366bm bmVar) {
        this.f26099a = bmVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OguryInterstitialAd(Context context, String str) {
        this(new C10366bm(context, new AdConfig(str), C10491ej.f26523b));
        C10765mq.m32773b(context, "context");
        C10765mq.m32773b(str, "adUnitId");
    }

    public final boolean isLoaded() {
        return this.f26099a.mo67104b();
    }

    public final void setListener(OguryInterstitialAdListener oguryInterstitialAdListener) {
        OguryIntegrationLogger.m30996d("[Ads] Interstitial Ad - setListener() called");
        C10366bm bmVar = this.f26099a;
        C10512f.C10513a aVar = C10512f.f26570a;
        bmVar.mo67098a((C10578h) C10512f.C10513a.m31885a(oguryInterstitialAdListener));
    }

    public final void setAdImpressionListener(OguryAdImpressionListener oguryAdImpressionListener) {
        C10366bm bmVar = this.f26099a;
        C10480e.C10481a aVar = C10480e.f26475a;
        bmVar.mo67099a((C10679k) C10480e.C10481a.m31685a(oguryAdImpressionListener));
    }

    private final void setCampaignId(String str) {
        this.f26099a.mo67103b(str);
    }

    public final void setAdMarkup(String str) {
        C10765mq.m32773b(str, "adMarkup");
        this.f26099a.mo67106d(str);
    }

    private final void setCreativeId(String str) {
        this.f26099a.mo67105c(str);
    }

    public final void load() {
        OguryIntegrationLogger.m30996d("[Ads] Interstitial Ad - load() called");
        this.f26099a.mo67097a();
    }

    public final void show() {
        OguryIntegrationLogger.m30996d("[Ads] Interstitial Ad - show() called");
        this.f26099a.mo67101a((C10832t) C10574gw.f26698a);
    }
}
