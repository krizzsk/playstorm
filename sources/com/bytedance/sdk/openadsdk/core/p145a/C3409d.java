package com.bytedance.sdk.openadsdk.core.p145a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFullScreenVideoAd;
import com.bytedance.sdk.openadsdk.core.C3568k;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.d */
/* compiled from: FullScreenVideoAdListenerAdapter */
public class C3409d implements TTAdNative.FullScreenVideoAdListener {

    /* renamed from: a */
    TTAdNative.FullScreenVideoAdListener f8226a;

    public C3409d(TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        this.f8226a = fullScreenVideoAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8226a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8226a.onError(i, str);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3409d.this.f8226a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onFullScreenVideoAdLoad(final TTFullScreenVideoAd tTFullScreenVideoAd) {
        if (this.f8226a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8226a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3409d.this.f8226a.onFullScreenVideoAdLoad(tTFullScreenVideoAd);
                    }
                });
            }
        }
    }

    public void onFullScreenVideoCached() {
        if (this.f8226a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8226a.onFullScreenVideoCached();
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3409d.this.f8226a.onFullScreenVideoCached();
                    }
                });
            }
        }
    }
}
