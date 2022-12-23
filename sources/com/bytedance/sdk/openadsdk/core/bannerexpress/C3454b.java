package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.multipro.p183b.C3954a;

/* renamed from: com.bytedance.sdk.openadsdk.core.bannerexpress.b */
/* compiled from: TTBannerExpressVideoAdImpl */
public class C3454b extends C3445a {
    public C3454b(Context context, C3498n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    /* renamed from: a */
    public void mo19447a(Context context, C3498n nVar, AdSlot adSlot) {
        this.f8350a = new BannerExpressVideoView(context, nVar, adSlot);
        mo19448a(this.f8350a.getCurView(), this.f8352c);
    }

    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
        if (this.f8350a != null) {
            this.f8350a.setVideoAdListener(expressVideoAdListener);
        }
    }

    public C3954a getVideoModel() {
        if (this.f8350a != null) {
            return ((BannerExpressVideoView) this.f8350a).getVideoModel();
        }
        return null;
    }
}
