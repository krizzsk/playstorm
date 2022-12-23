package com.bytedance.sdk.openadsdk.core.bannerexpress;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressVideoView;
import com.bytedance.sdk.openadsdk.core.p151e.C3498n;
import com.bytedance.sdk.openadsdk.multipro.p183b.C3954a;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class BannerExpressVideoView extends BannerExpressView {
    public BannerExpressVideoView(Context context, C3498n nVar, AdSlot adSlot) {
        super(context, nVar, adSlot);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19428a() {
        this.f8338b = new NativeExpressVideoView(this.f8337a, this.f8340d, this.f8341e, this.f8346j);
        addView(this.f8338b, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public void mo19429a(C3498n nVar, AdSlot adSlot) {
        this.f8339c = new NativeExpressVideoView(this.f8337a, nVar, adSlot, this.f8346j);
        this.f8339c.setExpressInteractionListener(new TTNativeExpressAd.ExpressAdInteractionListener() {
            public void onAdShow(View view, int i) {
            }

            public void onRenderFail(View view, String str, int i) {
            }

            public void onAdClicked(View view, int i) {
                if (BannerExpressVideoView.this.f8342f != null) {
                    BannerExpressVideoView.this.f8342f.onAdClicked(BannerExpressVideoView.this, i);
                }
            }

            public void onRenderSuccess(View view, float f, float f2) {
                BannerExpressVideoView.this.mo19431a(f, f2);
                BannerExpressVideoView.this.mo19435e();
            }
        });
        C4020v.m13282a((View) this.f8339c, 8);
        addView(this.f8339c, new ViewGroup.LayoutParams(-1, -1));
    }

    public C3954a getVideoModel() {
        if (this.f8338b != null) {
            return ((NativeExpressVideoView) this.f8338b).getVideoModel();
        }
        return null;
    }
}
