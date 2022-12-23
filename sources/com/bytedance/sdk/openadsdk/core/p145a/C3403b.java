package com.bytedance.sdk.openadsdk.core.p145a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppOpenAd;
import com.bytedance.sdk.openadsdk.core.C3568k;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.b */
/* compiled from: AppOpenAdListenerAdapter */
public class C3403b implements TTAdNative.AppOpenAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final TTAdNative.AppOpenAdListener f8214a;

    public C3403b(TTAdNative.AppOpenAdListener appOpenAdListener) {
        this.f8214a = appOpenAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8214a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8214a.onError(i, str);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3403b.this.f8214a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onAppOpenAdLoaded(final TTAppOpenAd tTAppOpenAd) {
        if (this.f8214a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8214a.onAppOpenAdLoaded(tTAppOpenAd);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3403b.this.f8214a.onAppOpenAdLoaded(tTAppOpenAd);
                    }
                });
            }
        }
    }
}
