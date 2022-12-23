package com.inmobi.media;

import android.os.SystemClock;

/* renamed from: com.inmobi.media.cl */
/* compiled from: AdNetworkClient */
public final class C5929cl {

    /* renamed from: a */
    private static final String f15024a = C5929cl.class.getSimpleName();

    /* renamed from: b */
    private C5930cm f15025b;

    public C5929cl(C5930cm cmVar) {
        this.f15025b = cmVar;
    }

    /* renamed from: a */
    public final C5931cn mo34921a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            C6207gy a = new C6210ha(this.f15025b).mo35400a();
            C5931cn cnVar = new C5931cn(this.f15025b, a);
            try {
                C6279iv.m18765a().mo35491a(this.f15025b.mo35394g());
                C6279iv.m18765a().mo35492b(a.mo35399d());
                if (a.mo35396a()) {
                    return cnVar;
                }
                C6279iv.m18765a().mo35493c(SystemClock.elapsedRealtime() - elapsedRealtime);
                return cnVar;
            } catch (Exception unused) {
                return cnVar;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
