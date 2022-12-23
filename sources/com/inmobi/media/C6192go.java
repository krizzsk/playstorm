package com.inmobi.media;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.go */
/* compiled from: EventSubmitter */
public class C6192go {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15670a = C6192go.class.getSimpleName();

    /* renamed from: b */
    private static ScheduledExecutorService f15671b;

    /* renamed from: com.inmobi.media.go$a */
    /* compiled from: EventSubmitter */
    static class C6194a {

        /* renamed from: a */
        static final C6192go f15682a = new C6192go((byte) 0);
    }

    /* synthetic */ C6192go(byte b) {
        this();
    }

    /* renamed from: a */
    public static C6192go m18434a() {
        return C6194a.f15682a;
    }

    private C6192go() {
        f15671b = Executors.newSingleThreadScheduledExecutor();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35376a(C6189gm gmVar, String str, int i, int i2, long j, C6271ir irVar, C6195gp gpVar, boolean z) {
        C6189gm gmVar2 = gmVar;
        int i3 = i;
        int i4 = i2;
        if (!C6239hv.m18616a() || !C6227ho.m18565j()) {
            gpVar.mo35373a(gmVar2, false);
            return;
        }
        final C6206gx gxVar = new C6206gx(ShareTarget.METHOD_POST, str, irVar);
        HashMap hashMap = new HashMap();
        hashMap.put("payload", gmVar2.f15656b);
        gxVar.mo35388c(hashMap);
        int i5 = i3 - i4;
        if (i5 > 0) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("X-im-retry-count", String.valueOf(i5));
            gxVar.mo35385a((Map<String, String>) hashMap2);
        }
        gxVar.f15720t = false;
        gxVar.f15715o = false;
        long j2 = 0;
        if (z) {
            if (i4 != i3) {
                j2 = ((long) Math.pow(2.0d, (double) i5)) * j;
            }
        } else if (i4 != i3) {
            j2 = j;
        }
        long j3 = j2;
        final int i6 = i2;
        final C6189gm gmVar3 = gmVar;
        final String str2 = str;
        final int i7 = i;
        final long j4 = j;
        final C6271ir irVar2 = irVar;
        final C6195gp gpVar2 = gpVar;
        final boolean z2 = z;
        f15671b.schedule(new Runnable() {
            public final void run() {
                C6207gy a = new C6210ha(gxVar).mo35400a();
                if (!a.mo35396a()) {
                    gpVar2.mo35372a(gmVar3);
                } else if (i6 > 1) {
                    String unused = C6192go.f15670a;
                    a.mo35397b();
                    C6192go.this.mo35376a(gmVar3, str2, i7, i6 - 1, j4, irVar2, gpVar2, z2);
                } else {
                    gpVar2.mo35373a(gmVar3, true);
                }
            }
        }, j3, TimeUnit.SECONDS);
    }
}
