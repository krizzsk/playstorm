package com.mbridge.msdk.foundation.same.net;

import android.net.TrafficStats;
import android.os.SystemClock;

/* renamed from: com.mbridge.msdk.foundation.same.net.a */
/* compiled from: BandWideUtil */
public final class C8449a {

    /* renamed from: a */
    private static long f20426a;

    /* renamed from: b */
    private static long f20427b;

    /* renamed from: c */
    private static long f20428c;

    /* renamed from: com.mbridge.msdk.foundation.same.net.a$a */
    /* compiled from: BandWideUtil */
    private static class C8451a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C8449a f20429a = new C8449a();
    }

    private C8449a() {
    }

    /* renamed from: a */
    public static C8449a m24396a() {
        return C8451a.f20429a;
    }

    /* renamed from: b */
    public final synchronized void mo57537b() {
        if (f20426a == 0) {
            f20426a = SystemClock.elapsedRealtime();
            f20428c = TrafficStats.getTotalRxBytes();
        }
    }

    /* renamed from: c */
    public final synchronized void mo57538c() {
        if (!(f20426a == 0 || f20428c == 0)) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - f20426a;
            if (elapsedRealtime != 0) {
                try {
                    if (TrafficStats.getTotalRxBytes() != -1) {
                        long totalRxBytes = ((TrafficStats.getTotalRxBytes() - f20428c) * 1000) / elapsedRealtime;
                        if (totalRxBytes == 0) {
                            f20427b = 1;
                        } else {
                            f20427b = totalRxBytes;
                        }
                    } else {
                        f20427b = 0;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            mo57539d();
        }
    }

    /* renamed from: d */
    public final synchronized void mo57539d() {
        f20428c = 0;
        f20426a = 0;
    }

    /* renamed from: e */
    public final long mo57540e() {
        return f20427b;
    }
}
