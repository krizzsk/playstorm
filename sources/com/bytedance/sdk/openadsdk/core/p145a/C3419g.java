package com.bytedance.sdk.openadsdk.core.p145a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;
import com.bytedance.sdk.openadsdk.core.C3568k;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.g */
/* compiled from: RewardVideoAdListenerAdapter */
public class C3419g implements TTAdNative.RewardVideoAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAdNative.RewardVideoAdListener f8245a;

    public C3419g(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f8245a = rewardVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8245a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8245a.onError(i, str);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3419g.this.f8245a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f8245a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8245a.onRewardVideoAdLoad(tTRewardVideoAd);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3419g.this.f8245a.onRewardVideoAdLoad(tTRewardVideoAd);
                    }
                });
            }
        }
    }

    public void onRewardVideoCached() {
        if (this.f8245a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8245a.onRewardVideoCached();
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3419g.this.f8245a.onRewardVideoCached();
                    }
                });
            }
        }
    }
}
