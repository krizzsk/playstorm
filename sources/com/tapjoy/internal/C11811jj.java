package com.tapjoy.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;

/* renamed from: com.tapjoy.internal.jj */
final class C11811jj {

    /* renamed from: a */
    static C11810ji f28839a;

    /* renamed from: b */
    static long f28840b;

    private C11811jj() {
    }

    /* renamed from: a */
    static C11810ji m34330a() {
        synchronized (C11811jj.class) {
            if (f28839a == null) {
                return new C11810ji();
            }
            C11810ji jiVar = f28839a;
            f28839a = jiVar.f28837f;
            jiVar.f28837f = null;
            f28840b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
            return jiVar;
        }
    }

    /* renamed from: a */
    static void m34331a(C11810ji jiVar) {
        if (jiVar.f28837f != null || jiVar.f28838g != null) {
            throw new IllegalArgumentException();
        } else if (!jiVar.f28835d) {
            synchronized (C11811jj.class) {
                if (f28840b + PlaybackStateCompat.ACTION_PLAY_FROM_URI <= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    f28840b += PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    jiVar.f28837f = f28839a;
                    jiVar.f28834c = 0;
                    jiVar.f28833b = 0;
                    f28839a = jiVar;
                }
            }
        }
    }
}
