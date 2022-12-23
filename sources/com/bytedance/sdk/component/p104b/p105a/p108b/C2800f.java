package com.bytedance.sdk.component.p104b.p105a.p108b;

import android.support.p003v4.media.session.PlaybackStateCompat;

/* renamed from: com.bytedance.sdk.component.b.a.b.f */
/* compiled from: SegmentPool */
final class C2800f {

    /* renamed from: a */
    static C2799e f6301a;

    /* renamed from: b */
    static long f6302b;

    private C2800f() {
    }

    /* renamed from: a */
    static C2799e m7654a() {
        synchronized (C2800f.class) {
            if (f6301a == null) {
                return new C2799e();
            }
            C2799e eVar = f6301a;
            f6301a = eVar.f6299f;
            eVar.f6299f = null;
            f6302b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return eVar;
        }
    }

    /* renamed from: a */
    static void m7655a(C2799e eVar) {
        if (eVar.f6299f != null || eVar.f6300g != null) {
            throw new IllegalArgumentException();
        } else if (!eVar.f6297d) {
            synchronized (C2800f.class) {
                if (f6302b + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    f6302b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    eVar.f6299f = f6301a;
                    eVar.f6296c = 0;
                    eVar.f6295b = 0;
                    f6301a = eVar;
                }
            }
        }
    }
}
