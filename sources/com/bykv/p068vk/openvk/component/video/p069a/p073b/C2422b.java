package com.bykv.p068vk.openvk.component.video.p069a.p073b;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2471h;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2473i;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.C2480l;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p074a.C2410a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p075b.C2427c;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2432a;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2433b;
import com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2434c;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.b */
/* compiled from: DownloadTask */
class C2422b extends C2408a {

    /* renamed from: m */
    final Object f5123m = this;

    /* renamed from: n */
    final Object f5124n;

    /* renamed from: o */
    private final int f5125o;

    /* renamed from: p */
    private final C2424b f5126p;

    /* renamed from: q */
    private volatile C2471h.C2472a f5127q;

    /* renamed from: r */
    private volatile C2433b f5128r;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.b$b */
    /* compiled from: DownloadTask */
    public interface C2424b {
        /* renamed from: a */
        void mo16134a(C2422b bVar);
    }

    C2422b(C2423a aVar) {
        super(aVar.f5132d, aVar.f5133e);
        this.f5125o = aVar.f5135g;
        this.f5126p = aVar.f5137i;
        this.f5092g = aVar.f5129a;
        this.f5093h = aVar.f5130b;
        this.f5091f = aVar.f5134f;
        this.f5095j = aVar.f5131c;
        this.f5094i = aVar.f5136h;
        this.f5124n = aVar.f5138j;
    }

    public void run() {
        this.f5086a.mo16097a(this.f5093h);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            m5884j();
        } catch (C2432a unused) {
        }
        this.f5089d.set(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.f5086a.mo16098b(this.f5093h);
        C2424b bVar = this.f5126p;
        if (bVar != null) {
            bVar.mo16134a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C2471h.C2472a mo16120h() {
        return this.f5127q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C2433b mo16121i() {
        return this.f5128r;
    }

    /* renamed from: j */
    private boolean m5884j() throws C2432a {
        while (this.f5095j.mo16216a()) {
            mo16093e();
            C2480l.C2481a b = this.f5095j.mo16217b();
            try {
                m5883a(b);
                return true;
            } catch (C2434c e) {
                b.mo16218a();
                mo16089a(Boolean.valueOf(mo16095g()), this.f5092g, e);
            } catch (IOException e2) {
                if (e2 instanceof SocketTimeoutException) {
                    b.mo16219b();
                }
                if (!mo16090b()) {
                    mo16089a(Boolean.valueOf(mo16095g()), this.f5092g, e2);
                }
            } catch (C2471h.C2472a e3) {
                this.f5127q = e3;
                mo16089a(Boolean.valueOf(mo16095g()), this.f5092g, e3);
                return false;
            } catch (C2433b e4) {
                this.f5128r = e4;
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        mo16091c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cf, code lost:
        if (com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d1, code lost:
        android.util.Log.i("TAG_PROXY_DownloadTask", "download succeed, no need to cancel call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d8, code lost:
        com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6056a((java.io.Closeable) r6.mo16172d());
        r4.mo16207a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e2, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x021d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5883a(com.bykv.p068vk.openvk.component.video.p069a.p073b.C2480l.C2481a r13) throws java.io.IOException, com.bykv.p068vk.openvk.component.video.p069a.p073b.C2471h.C2472a, com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2432a, com.bykv.p068vk.openvk.component.video.p069a.p073b.p076c.C2433b {
        /*
            r12 = this;
            com.bykv.vk.openvk.component.video.a.b.a.a r0 = r12.f5086a
            java.lang.String r1 = r12.f5093h
            java.io.File r0 = r0.mo16099c(r1)
            long r1 = r0.length()
            int r3 = r12.f5125o
            if (r3 <= 0) goto L_0x0044
            long r3 = (long) r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0044
            boolean r13 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r13 == 0) goto L_0x0043
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "no necessary to download for "
            r0.append(r3)
            java.lang.String r3 = r12.f5093h
            r0.append(r3)
            java.lang.String r3 = ", cache file size: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", max: "
            r0.append(r1)
            int r1 = r12.f5125o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r13, r0)
        L_0x0043:
            return
        L_0x0044:
            int r3 = r12.mo16094f()
            com.bykv.vk.openvk.component.video.a.b.b.c r4 = r12.f5087b
            java.lang.String r5 = r12.f5093h
            com.bykv.vk.openvk.component.video.a.b.b.a r4 = r4.mo16135a((java.lang.String) r5, (int) r3)
            if (r4 == 0) goto L_0x0076
            int r5 = r4.f5141c
            long r5 = (long) r5
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0076
            boolean r13 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r13 == 0) goto L_0x0075
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "file download complete, key: "
            r0.append(r1)
            java.lang.String r1 = r12.f5093h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r13, r0)
        L_0x0075:
            return
        L_0x0076:
            r12.mo16093e()
            int r5 = (int) r1
            int r6 = r12.f5125o
            java.lang.String r7 = "GET"
            com.bykv.vk.openvk.component.video.a.b.e.a r6 = r12.mo16086a(r13, r5, r6, r7)
            if (r6 != 0) goto L_0x0085
            return
        L_0x0085:
            r7 = 0
            r8 = 1
            r9 = 0
            r12.mo16093e()     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.i r10 = r12.f5094i     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x0095
            boolean r10 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5189e     // Catch:{ all -> 0x020e }
            if (r10 == 0) goto L_0x0095
            r10 = r8
            goto L_0x0096
        L_0x0095:
            r10 = r9
        L_0x0096:
            java.lang.String r10 = com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6051a(r6, r10, r8)     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x01ea
            int r10 = com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6045a((com.bykv.p068vk.openvk.component.video.p069a.p073b.p078e.C2448a) r6)     // Catch:{ all -> 0x020e }
            if (r4 == 0) goto L_0x0111
            int r11 = r4.f5141c     // Catch:{ all -> 0x020e }
            if (r11 == r10) goto L_0x0111
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Content-Length not match, old: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            int r2 = r4.f5141c     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", key: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f5093h     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x020e }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x020e }
        L_0x00d4:
            com.bykv.vk.openvk.component.video.a.b.c.b r0 = new com.bykv.vk.openvk.component.video.a.b.c.b     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Content-Length not match, old length: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            int r2 = r4.f5141c     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", new length: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f5092g     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", currentUrl: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = ", previousInfo: "
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r4.f5143e     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x020e }
            r0.<init>(r13)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x0111:
            com.bykv.vk.openvk.component.video.a.b.b.c r13 = r12.f5087b     // Catch:{ all -> 0x020e }
            java.lang.String r4 = r12.f5093h     // Catch:{ all -> 0x020e }
            com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6047a(r6, r13, r4, r3)     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.b.c r13 = r12.f5087b     // Catch:{ all -> 0x020e }
            java.lang.String r4 = r12.f5093h     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.b.a r13 = r13.mo16135a((java.lang.String) r4, (int) r3)     // Catch:{ all -> 0x020e }
            if (r13 != 0) goto L_0x0124
            r13 = r9
            goto L_0x0126
        L_0x0124:
            int r13 = r13.f5141c     // Catch:{ all -> 0x020e }
        L_0x0126:
            java.io.InputStream r3 = r6.mo16172d()     // Catch:{ all -> 0x020e }
            com.bykv.vk.openvk.component.video.a.b.h r4 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ all -> 0x020e }
            boolean r10 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5188d     // Catch:{ all -> 0x020e }
            if (r10 == 0) goto L_0x0133
            java.lang.String r10 = "rwd"
            goto L_0x0135
        L_0x0133:
            java.lang.String r10 = "rw"
        L_0x0135:
            r4.<init>(r0, r10)     // Catch:{ all -> 0x020e }
            r4.mo16208a((long) r1)     // Catch:{ all -> 0x01e7 }
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01e7 }
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r7.<init>()     // Catch:{ all -> 0x01e7 }
            java.lang.String r10 = "preload start from: "
            r7.append(r10)     // Catch:{ all -> 0x01e7 }
            r7.append(r1)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x01e7 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x01e7 }
        L_0x0155:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01e7 }
        L_0x0159:
            int r1 = r3.read(r0)     // Catch:{ all -> 0x01e7 }
            if (r1 < 0) goto L_0x01ca
            r12.mo16093e()     // Catch:{ all -> 0x01e7 }
            if (r1 <= 0) goto L_0x0181
            r4.mo16209a(r0, r9, r1)     // Catch:{ all -> 0x01e7 }
            int r5 = r5 + r1
            com.bykv.vk.openvk.component.video.a.b.i r2 = r12.f5094i     // Catch:{ all -> 0x01e7 }
            if (r2 == 0) goto L_0x0179
            java.lang.Object r2 = r12.f5123m     // Catch:{ all -> 0x01e7 }
            monitor-enter(r2)     // Catch:{ all -> 0x01e7 }
            java.lang.Object r7 = r12.f5123m     // Catch:{ all -> 0x0176 }
            r7.notifyAll()     // Catch:{ all -> 0x0176 }
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            goto L_0x0179
        L_0x0176:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0176 }
            throw r13     // Catch:{ all -> 0x01e7 }
        L_0x0179:
            java.util.concurrent.atomic.AtomicInteger r2 = r12.f5088c     // Catch:{ all -> 0x01e7 }
            r2.addAndGet(r1)     // Catch:{ all -> 0x01e7 }
            r12.mo16088a(r13, r5)     // Catch:{ all -> 0x01e7 }
        L_0x0181:
            int r1 = r12.f5125o     // Catch:{ all -> 0x01e7 }
            if (r1 <= 0) goto L_0x01c6
            int r1 = r12.f5125o     // Catch:{ all -> 0x01e7 }
            if (r5 < r1) goto L_0x01c6
            boolean r13 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01e7 }
            if (r13 == 0) goto L_0x01ad
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e7 }
            r0.<init>()     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = "download, more data received, currentCacheFileSize: "
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            r0.append(r5)     // Catch:{ all -> 0x01e7 }
            java.lang.String r1 = ", max: "
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            int r1 = r12.f5125o     // Catch:{ all -> 0x01e7 }
            r0.append(r1)     // Catch:{ all -> 0x01e7 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01e7 }
            android.util.Log.w(r13, r0)     // Catch:{ all -> 0x01e7 }
        L_0x01ad:
            java.io.InputStream r13 = r6.mo16172d()
            com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6056a((java.io.Closeable) r13)
            r4.mo16207a()
            r12.mo16087a()
            boolean r13 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r13 == 0) goto L_0x01c5
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "cancel call"
            android.util.Log.w(r13, r0)
        L_0x01c5:
            return
        L_0x01c6:
            r12.mo16093e()     // Catch:{ all -> 0x01e7 }
            goto L_0x0159
        L_0x01ca:
            r12.mo16091c()     // Catch:{ all -> 0x01e3 }
            boolean r13 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c     // Catch:{ all -> 0x01e3 }
            if (r13 == 0) goto L_0x01d8
            java.lang.String r13 = "TAG_PROXY_DownloadTask"
            java.lang.String r0 = "download succeed, no need to cancel call"
            android.util.Log.i(r13, r0)     // Catch:{ all -> 0x01e3 }
        L_0x01d8:
            java.io.InputStream r13 = r6.mo16172d()
            com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6056a((java.io.Closeable) r13)
            r4.mo16207a()
            return
        L_0x01e3:
            r13 = move-exception
            r7 = r4
            r8 = r9
            goto L_0x020f
        L_0x01e7:
            r13 = move-exception
            r7 = r4
            goto L_0x020f
        L_0x01ea:
            com.bykv.vk.openvk.component.video.a.b.c.c r0 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r1.<init>()     // Catch:{ all -> 0x020e }
            r1.append(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", rawKey: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = r12.f5092g     // Catch:{ all -> 0x020e }
            r1.append(r2)     // Catch:{ all -> 0x020e }
            java.lang.String r2 = ", url: "
            r1.append(r2)     // Catch:{ all -> 0x020e }
            r1.append(r13)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x020e }
            r0.<init>(r13)     // Catch:{ all -> 0x020e }
            throw r0     // Catch:{ all -> 0x020e }
        L_0x020e:
            r13 = move-exception
        L_0x020f:
            java.io.InputStream r0 = r6.mo16172d()
            com.bykv.p068vk.openvk.component.video.p069a.p080c.C2482a.m6056a((java.io.Closeable) r0)
            if (r7 == 0) goto L_0x021b
            r7.mo16207a()
        L_0x021b:
            if (r8 == 0) goto L_0x022b
            r12.mo16087a()
            boolean r0 = com.bykv.p068vk.openvk.component.video.p069a.p073b.C2446e.f5187c
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = "TAG_PROXY_DownloadTask"
            java.lang.String r1 = "cancel call"
            android.util.Log.w(r0, r1)
        L_0x022b:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p073b.C2422b.m5883a(com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.b$a */
    /* compiled from: DownloadTask */
    static final class C2423a {

        /* renamed from: a */
        String f5129a;

        /* renamed from: b */
        String f5130b;

        /* renamed from: c */
        C2480l f5131c;

        /* renamed from: d */
        C2410a f5132d;

        /* renamed from: e */
        C2427c f5133e;

        /* renamed from: f */
        List<C2473i.C2475b> f5134f;

        /* renamed from: g */
        int f5135g;

        /* renamed from: h */
        C2473i f5136h;

        /* renamed from: i */
        C2424b f5137i;

        /* renamed from: j */
        Object f5138j;

        C2423a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2423a mo16130a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f5129a = str;
                return this;
            }
            throw new IllegalArgumentException("rawKey == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C2423a mo16133b(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f5130b = str;
                return this;
            }
            throw new IllegalArgumentException("key == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2423a mo16128a(C2480l lVar) {
            if (lVar != null) {
                this.f5131c = lVar;
                return this;
            }
            throw new IllegalArgumentException("urls is empty");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2423a mo16124a(C2410a aVar) {
            if (aVar != null) {
                this.f5132d = aVar;
                return this;
            }
            throw new IllegalArgumentException("cache == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2423a mo16126a(C2427c cVar) {
            if (cVar != null) {
                this.f5133e = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2423a mo16131a(List<C2473i.C2475b> list) {
            this.f5134f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2423a mo16123a(int i) {
            this.f5135g = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2423a mo16125a(C2424b bVar) {
            this.f5137i = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2423a mo16127a(C2473i iVar) {
            this.f5136h = iVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2423a mo16129a(Object obj) {
            this.f5138j = obj;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2422b mo16132a() {
            if (this.f5132d != null && this.f5133e != null && !TextUtils.isEmpty(this.f5129a) && !TextUtils.isEmpty(this.f5130b) && this.f5131c != null) {
                return new C2422b(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
