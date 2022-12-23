package com.bytedance.sdk.component.p125f;

import android.os.SystemClock;
import com.bytedance.sdk.component.utils.C2975l;

/* renamed from: com.bytedance.sdk.component.f.b */
/* compiled from: DelegateRunnable */
class C2948b implements Comparable, Runnable {

    /* renamed from: a */
    private C2955g f6696a = null;

    /* renamed from: b */
    private C2944a f6697b = null;

    /* renamed from: c */
    private long f6698c = 0;

    /* renamed from: d */
    private Thread f6699d = null;

    public C2948b(C2955g gVar, C2944a aVar) {
        this.f6696a = gVar;
        this.f6697b = aVar;
        this.f6698c = SystemClock.uptimeMillis();
    }

    public void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = uptimeMillis - this.f6698c;
        this.f6699d = Thread.currentThread();
        C2955g gVar = this.f6696a;
        if (gVar != null) {
            gVar.run();
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (this.f6697b != null) {
            C2950d.m8300a();
        }
        if (C2975l.m8381a()) {
            Object[] objArr = new Object[8];
            objArr[0] = "run: pool  = ";
            C2944a aVar = this.f6697b;
            String str = "null";
            objArr[1] = aVar != null ? aVar.mo17848a() : str;
            objArr[2] = " waitTime =";
            objArr[3] = Long.valueOf(j);
            objArr[4] = " taskCost = ";
            objArr[5] = Long.valueOf(uptimeMillis2);
            objArr[6] = " name=";
            C2955g gVar2 = this.f6696a;
            if (gVar2 != null) {
                str = gVar2.mo17880b();
            }
            objArr[7] = str;
            C2975l.m8380a("DelegateRunnable", objArr);
        }
    }

    /* renamed from: a */
    public C2955g mo17864a() {
        return this.f6696a;
    }

    public int compareTo(Object obj) {
        if (obj instanceof C2948b) {
            return this.f6696a.compareTo(((C2948b) obj).mo17864a());
        }
        return 0;
    }

    public int hashCode() {
        return this.f6696a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f6696a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof com.bytedance.sdk.component.p125f.C2948b
            if (r0 == 0) goto L_0x0016
            com.bytedance.sdk.component.f.g r0 = r1.f6696a
            if (r0 == 0) goto L_0x0016
            com.bytedance.sdk.component.f.b r2 = (com.bytedance.sdk.component.p125f.C2948b) r2
            com.bytedance.sdk.component.f.g r2 = r2.mo17864a()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0016
            r2 = 1
            goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p125f.C2948b.equals(java.lang.Object):boolean");
    }
}
