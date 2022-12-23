package com.bytedance.sdk.openadsdk.core.p145a;

import android.os.Looper;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTFeedAd;
import com.bytedance.sdk.openadsdk.core.C3568k;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.a.c */
/* compiled from: FeedAdListenerAdapter */
public class C3406c implements TTAdNative.FeedAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TTAdNative.FeedAdListener f8220a = null;

    public C3406c(TTAdNative.FeedAdListener feedAdListener) {
        this.f8220a = feedAdListener;
    }

    public void onError(final int i, final String str) {
        if (this.f8220a != null) {
            if (str == null) {
                str = "Unknown exception.";
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8220a.onError(i, str);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3406c.this.f8220a.onError(i, str);
                    }
                });
            }
        }
    }

    public void onFeedAdLoad(final List<TTFeedAd> list) {
        if (this.f8220a != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f8220a.onFeedAdLoad(list);
            } else {
                C3568k.m11192d().post(new Runnable() {
                    public void run() {
                        C3406c.this.f8220a.onFeedAdLoad(list);
                    }
                });
            }
        }
    }
}
