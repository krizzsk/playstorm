package com.bytedance.sdk.openadsdk.component.reward;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.TTRewardVideoAd;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.f */
/* compiled from: RewardFullProxyListener */
public class C3344f implements TTAdNative.FullScreenVideoAdListener, TTAdNative.RewardVideoAdListener {

    /* renamed from: a */
    final TTAdNative.RewardVideoAdListener f7991a;

    /* renamed from: b */
    final TTAdNative.FullScreenVideoAdListener f7992b;

    public C3344f(TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        this.f7991a = rewardVideoAdListener;
        this.f7992b = null;
    }

    public C3344f(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f7991a = null;
        this.f7992b = fullScreenVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f7991a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3344f.this.f7991a != null) {
                        C3344f.this.f7991a.onError(i, str);
                    }
                }
            });
        }
        if (this.f7992b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3344f.this.f7992b != null) {
                        C3344f.this.f7992b.onError(i, str);
                    }
                }
            });
        }
    }

    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f7992b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3344f.this.f7992b != null) {
                        C3344f.this.f7992b.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                    }
                }
            });
        }
    }

    public void onFullScreenVideoCached() {
        if (this.f7992b != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3344f.this.f7992b != null) {
                        C3344f.this.f7992b.onFullScreenVideoCached();
                    }
                }
            });
        }
    }

    public void onRewardVideoAdLoad(final TTRewardVideoAd tTRewardVideoAd) {
        if (this.f7991a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3344f.this.f7991a != null) {
                        C3344f.this.f7991a.onRewardVideoAdLoad(tTRewardVideoAd);
                    }
                }
            });
        }
    }

    public void onRewardVideoCached() {
        if (this.f7991a != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    if (C3344f.this.f7991a != null) {
                        C3344f.this.f7991a.onRewardVideoCached();
                    }
                }
            });
        }
    }
}
