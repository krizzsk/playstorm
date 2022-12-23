package com.p374my.target;

import android.content.Context;
import com.p374my.target.C9700f5;
import com.p374my.target.common.MyTargetVersion;
import java.util.Map;

/* renamed from: com.my.target.i5 */
public final class C9754i5 extends C9736h5 {

    /* renamed from: a */
    public static final C9754i5 f24055a = new C9754i5();

    /* renamed from: b */
    public final C9700f5 f24056b = new C9700f5();

    /* renamed from: c */
    public final C9714g5 f24057c = new C9714g5();

    /* renamed from: d */
    public final C9782j5 f24058d = new C9782j5();

    /* renamed from: e */
    public final C9843m5 f24059e = new C9843m5();

    /* renamed from: f */
    public final C9803k5 f24060f = new C9803k5();

    /* renamed from: g */
    public final C9678e5 f24061g = new C9678e5();

    /* renamed from: h */
    public final C9660d5 f24062h = new C9660d5();

    /* renamed from: i */
    public final C9643c5 f24063i = new C9643c5();

    /* renamed from: j */
    public final C9861n5 f24064j = new C9861n5();

    /* renamed from: k */
    public final C9827l5 f24065k = new C9827l5();

    /* renamed from: l */
    public volatile String f24066l = null;

    /* renamed from: m */
    public C9822l3 f24067m;

    /* renamed from: n */
    public boolean f24068n = true;

    /* renamed from: c */
    public static C9754i5 m28266c() {
        return f24055a;
    }

    /* renamed from: a */
    public final long mo64270a(int i, long j) {
        if (this.f24067m == null) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f24067m.mo64677b(i, currentTimeMillis - j);
        return currentTimeMillis;
    }

    /* renamed from: a */
    public C9700f5.C9701a mo64271a() {
        return this.f24056b.mo64020a();
    }

    /* renamed from: a */
    public String mo64272a(Context context) {
        if (C9693f0.m27982b()) {
            C9672e0.m27882a("FingerprintDataProvider: You must not call getBidderToken method from main thread");
            return "";
        }
        if (this.f24066l == null) {
            synchronized (C9754i5.class) {
                if (this.f24066l == null) {
                    removeAll();
                    this.f24056b.collectData(context);
                    if (this.f24068n) {
                        this.f24058d.collectData(context);
                        this.f24060f.collectData(context);
                    }
                    Map<String, String> map = getMap();
                    this.f24056b.putDataTo(map);
                    if (this.f24068n) {
                        this.f24058d.putDataTo(map);
                        this.f24060f.putDataTo(map);
                    }
                    map.put("sdk_ver_int", MyTargetVersion.VERSION_INT);
                    this.f24066l = C9764i8.m28304a(map);
                }
            }
        }
        String str = this.f24066l;
        return str != null ? str : "";
    }

    /* renamed from: a */
    public void mo64273a(C9822l3 l3Var) {
        this.f24067m = l3Var;
    }

    /* renamed from: a */
    public void mo64274a(boolean z) {
        this.f24068n = z;
    }

    /* renamed from: b */
    public C9714g5 mo64275b() {
        return this.f24057c;
    }

    /* renamed from: b */
    public String mo64276b(Context context) {
        return this.f24056b.mo64025e(context);
    }

    /* renamed from: c */
    public void mo64277c(Context context) {
        if (C9693f0.m27982b()) {
            C9672e0.m27882a("FingerprintDataProvider: You must not call collectData method from main thread");
            return;
        }
        this.f24056b.collectData(context);
        this.f24058d.collectData(context);
        this.f24060f.collectData(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00c3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void collectData(android.content.Context r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.p374my.target.C9693f0.m27982b()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = "FingerprintDataProvider: You must not call collectData method from main thread"
            com.p374my.target.C9672e0.m27882a(r4)     // Catch:{ all -> 0x00c4 }
            monitor-exit(r3)
            return
        L_0x000e:
            r3.removeAll()     // Catch:{ all -> 0x00c4 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00c4 }
            com.my.target.f5 r2 = r3.f24056b     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 10
            long r0 = r3.mo64270a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.n5 r2 = r3.f24064j     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 21
            r3.mo64270a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.c5 r2 = r3.f24063i     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 16
            long r0 = r3.mo64270a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.l5 r2 = r3.f24065k     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 22
            r3.mo64270a(r2, r0)     // Catch:{ all -> 0x00c4 }
            boolean r2 = r3.f24068n     // Catch:{ all -> 0x00c4 }
            if (r2 == 0) goto L_0x0084
            com.my.target.g5 r2 = r3.f24057c     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 15
            long r0 = r3.mo64270a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.j5 r2 = r3.f24058d     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 11
            long r0 = r3.mo64270a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.m5 r2 = r3.f24059e     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 14
            long r0 = r3.mo64270a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.k5 r2 = r3.f24060f     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 13
            long r0 = r3.mo64270a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.d5 r2 = r3.f24062h     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r2 = 17
            long r0 = r3.mo64270a(r2, r0)     // Catch:{ all -> 0x00c4 }
            com.my.target.e5 r2 = r3.f24061g     // Catch:{ all -> 0x00c4 }
            r2.collectData(r4)     // Catch:{ all -> 0x00c4 }
            r4 = 18
            r3.mo64270a(r4, r0)     // Catch:{ all -> 0x00c4 }
        L_0x0084:
            r4 = 0
            r3.mo64273a((com.p374my.target.C9822l3) r4)     // Catch:{ all -> 0x00c4 }
            java.util.Map r4 = r3.getMap()     // Catch:{ all -> 0x00c4 }
            com.my.target.f5 r0 = r3.f24056b     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.n5 r0 = r3.f24064j     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.c5 r0 = r3.f24063i     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.l5 r0 = r3.f24065k     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            boolean r0 = r3.f24068n     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00c2
            com.my.target.g5 r0 = r3.f24057c     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.j5 r0 = r3.f24058d     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.m5 r0 = r3.f24059e     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.k5 r0 = r3.f24060f     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.d5 r0 = r3.f24062h     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
            com.my.target.e5 r0 = r3.f24061g     // Catch:{ all -> 0x00c4 }
            r0.putDataTo(r4)     // Catch:{ all -> 0x00c4 }
        L_0x00c2:
            monitor-exit(r3)
            return
        L_0x00c4:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9754i5.collectData(android.content.Context):void");
    }
}
