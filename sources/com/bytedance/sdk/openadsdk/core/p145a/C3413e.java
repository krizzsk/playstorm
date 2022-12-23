package com.bytedance.sdk.openadsdk.core.p145a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.C3568k;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.e */
/* compiled from: NativeAdListenerAdapter */
public class C3413e implements TTAdNative.NativeAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAdNative.NativeAdListener f8233a;

    public C3413e(TTAdNative.NativeAdListener nativeAdListener) {
        this.f8233a = nativeAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8233a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8233a.onError(i, str);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3413e.this.f8233a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onNativeAdLoad(final List<TTNativeAd> list) {
        if (this.f8233a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8233a.onNativeAdLoad(list);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3413e.this.f8233a.onNativeAdLoad(list);
                    }
                });
            }
        }
    }
}
