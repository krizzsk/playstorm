package com.mbridge.msdk.mbnative.p333c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.mbnative.p334d.C8772a;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.mbnative.c.a */
/* compiled from: AdListenerProxy */
public class C8738a implements NativeListener.NativeAdListener {

    /* renamed from: a */
    private static final String f21180a = C8738a.class.getSimpleName();

    /* renamed from: b */
    private NativeListener.NativeAdListener f21181b;

    /* renamed from: c */
    private boolean f21182c = false;

    /* renamed from: d */
    private String f21183d;

    /* renamed from: e */
    private Context f21184e;

    /* renamed from: f */
    private boolean f21185f;

    /* renamed from: a */
    public final void mo58110a(boolean z) {
        this.f21185f = z;
    }

    /* renamed from: a */
    public final void mo58109a(String str) {
        this.f21183d = str;
    }

    public C8738a() {
    }

    public C8738a(NativeListener.NativeAdListener nativeAdListener) {
        this.f21181b = nativeAdListener;
    }

    /* renamed from: a */
    public final boolean mo58111a() {
        return this.f21182c;
    }

    /* renamed from: b */
    public final void mo58112b() {
        this.f21182c = true;
    }

    public void onAdLoaded(List<Campaign> list, int i) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        try {
            this.f21182c = false;
            synchronized (list) {
                copyOnWriteArrayList = new CopyOnWriteArrayList(list);
            }
            if (this.f21181b == null) {
                return;
            }
            if (copyOnWriteArrayList.size() > 0) {
                this.f21181b.onAdLoaded(copyOnWriteArrayList, i);
            } else {
                this.f21181b.onAdLoaded(list, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onAdLoadError(String str) {
        this.f21182c = false;
        NativeListener.NativeAdListener nativeAdListener = this.f21181b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdLoadError(str);
            if (this.f21184e == null) {
                this.f21184e = C2350a.m5601e().mo15792g();
            }
            if (!TextUtils.isEmpty(this.f21183d)) {
                C8772a.m25505a(this.f21184e, str, this.f21183d, this.f21185f);
            }
        }
    }

    public void onAdClick(Campaign campaign) {
        NativeListener.NativeAdListener nativeAdListener = this.f21181b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdClick(campaign);
        }
    }

    public void onAdFramesLoaded(List<Frame> list) {
        NativeListener.NativeAdListener nativeAdListener = this.f21181b;
        if (nativeAdListener != null) {
            nativeAdListener.onAdFramesLoaded(list);
        }
    }

    public void onLoggingImpression(int i) {
        NativeListener.NativeAdListener nativeAdListener = this.f21181b;
        if (nativeAdListener != null) {
            nativeAdListener.onLoggingImpression(i);
        }
    }
}
