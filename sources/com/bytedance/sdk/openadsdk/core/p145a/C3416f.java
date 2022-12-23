package com.bytedance.sdk.openadsdk.core.p145a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3568k;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.f */
/* compiled from: NativeExpressAdListenerAdapter */
public class C3416f implements TTAdNative.NativeExpressAdListener {

    /* renamed from: a */
    TTAdNative.NativeExpressAdListener f8239a;

    public C3416f(TTAdNative.NativeExpressAdListener nativeExpressAdListener) {
        this.f8239a = nativeExpressAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8239a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8239a.onError(i, str);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3416f.this.f8239a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onNativeExpressAdLoad(final List<TTNativeExpressAd> list) {
        if (this.f8239a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8239a.onNativeExpressAdLoad(list);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3416f.this.f8239a.onNativeExpressAdLoad(list);
                    }
                });
            }
        }
    }
}
