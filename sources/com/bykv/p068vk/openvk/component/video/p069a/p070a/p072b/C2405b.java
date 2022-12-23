package com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b;

import android.content.Context;
import com.bykv.p068vk.openvk.component.video.api.C2518b;
import com.bykv.p068vk.openvk.component.video.api.p085c.C2522c;
import com.bykv.p068vk.openvk.component.video.api.p087e.C2531a;
import com.bykv.p068vk.openvk.component.video.api.p088f.C2536c;
import com.bykv.p068vk.openvk.component.video.p069a.p082e.C2514c;
import com.bytedance.sdk.component.p104b.p105a.C2794b;
import com.bytedance.sdk.component.p104b.p105a.C2804c;
import com.bytedance.sdk.component.p104b.p105a.C2813i;
import com.bytedance.sdk.component.p104b.p105a.C2816k;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.b.b */
/* compiled from: ReallyVideoPreload */
public class C2405b {

    /* renamed from: a */
    private Context f5075a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C2522c f5076b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile boolean f5077c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public File f5078d = null;

    /* renamed from: e */
    private File f5079e = null;

    /* renamed from: f */
    private final List<C2531a.C2532a> f5080f = new ArrayList();

    /* renamed from: g */
    private volatile boolean f5081g = false;

    public C2405b(Context context, C2522c cVar) {
        this.f5075a = context;
        this.f5076b = cVar;
        this.f5078d = C2514c.m6224b(cVar.mo16373a(), cVar.mo16399k());
        this.f5079e = C2514c.m6225c(cVar.mo16373a(), cVar.mo16399k());
    }

    /* renamed from: a */
    public void mo16084a(C2531a.C2532a aVar) {
        if (this.f5081g) {
            synchronized (C2531a.C2532a.class) {
                this.f5080f.add(aVar);
            }
            return;
        }
        this.f5080f.add(aVar);
        if (this.f5079e.exists() || (!this.f5076b.mo16396h() && this.f5078d.length() >= ((long) this.f5076b.mo16380b()))) {
            C2536c.m6436b("VideoPreload", "Cache file is exist");
            this.f5076b.mo16395g(1);
            m5824a(this.f5076b, 200);
            C2407c.m5842a(this.f5076b);
            return;
        }
        this.f5081g = true;
        this.f5076b.mo16395g(0);
        m5828b();
    }

    /* renamed from: b */
    private void m5828b() {
        C2813i.C2814a aVar;
        if (C2518b.m6277e() != null) {
            aVar = C2518b.m6277e().mo17574b();
        } else {
            aVar = new C2813i.C2814a();
        }
        aVar.mo17575a((long) this.f5076b.mo16401m(), TimeUnit.MILLISECONDS).mo17578b((long) this.f5076b.mo16402n(), TimeUnit.MILLISECONDS).mo17579c((long) this.f5076b.mo16403o(), TimeUnit.MILLISECONDS);
        C2813i a = aVar.mo17577a();
        C2816k.C2817a aVar2 = new C2816k.C2817a();
        final long length = this.f5078d.length();
        if (this.f5076b.mo16396h()) {
            aVar2.mo17595a("RANGE", "bytes=" + length + "-").mo17594a(this.f5076b.mo16398j()).mo17589a().mo17597b();
        } else {
            aVar2.mo17595a("RANGE", "bytes=" + length + "-" + this.f5076b.mo16380b()).mo17594a(this.f5076b.mo16398j()).mo17589a().mo17597b();
        }
        a.mo17476a(aVar2.mo17597b()).mo17469a(new C2804c() {
            /* renamed from: a */
            public void mo16081a(C2794b bVar, IOException iOException) {
                C2405b bVar2 = C2405b.this;
                bVar2.m5825a(bVar2.f5076b, 601, iOException.getMessage());
                C2407c.m5842a(C2405b.this.f5076b);
            }

            /* JADX WARNING: Removed duplicated region for block: B:54:0x0185 A[Catch:{ all -> 0x01d2 }] */
            /* JADX WARNING: Removed duplicated region for block: B:88:0x025a A[Catch:{ all -> 0x02a4 }] */
            /* JADX WARNING: Removed duplicated region for block: B:98:0x019d A[SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo16080a(com.bytedance.sdk.component.p104b.p105a.C2794b r23, com.bytedance.sdk.component.p104b.p105a.C2820m r24) throws java.io.IOException {
                /*
                    r22 = this;
                    r1 = r22
                    r2 = r24
                    long r3 = r2
                    r6 = 0
                    r7 = 3
                    java.lang.String r8 = " Preload size="
                    r9 = 2
                    java.lang.String r10 = "Pre finally "
                    r11 = 4
                    java.lang.String r12 = "VideoPreload"
                    r13 = 1
                    r14 = 0
                    if (r2 == 0) goto L_0x01e5
                    boolean r0 = r24.mo17499d()     // Catch:{ all -> 0x01e1 }
                    if (r0 != 0) goto L_0x0079
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f5076b     // Catch:{ all -> 0x0070 }
                    int r4 = r24.mo17497c()     // Catch:{ all -> 0x0070 }
                    java.lang.String r15 = r24.mo17500e()     // Catch:{ all -> 0x0070 }
                    r0.m5825a((com.bykv.p068vk.openvk.component.video.api.p085c.C2522c) r3, (int) r4, (java.lang.String) r15)     // Catch:{ all -> 0x0070 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    java.lang.String r2 = r2.mo16398j()
                    r0[r13] = r2
                    r0[r9] = r8
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    int r2 = r2.mo16380b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r0[r7] = r2
                    com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6438b((java.lang.String) r12, (java.lang.Object[]) r0)
                L_0x0066:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f5076b
                    com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2407c.m5842a(r0)
                    return
                L_0x0070:
                    r0 = move-exception
                    r7 = r6
                    r23 = r8
                    r5 = 601(0x259, float:8.42E-43)
                    r8 = r7
                    goto L_0x0248
                L_0x0079:
                    com.bytedance.sdk.component.b.a.n r15 = r24.mo17501f()     // Catch:{ all -> 0x01e1 }
                    com.bytedance.sdk.component.b.a.n r15 = r24.mo17501f()     // Catch:{ all -> 0x01da }
                    r16 = 0
                    if (r0 == 0) goto L_0x009d
                    if (r15 == 0) goto L_0x009d
                    r23 = r8
                    long r7 = r2     // Catch:{ all -> 0x0099 }
                    long r18 = r15.mo17505a()     // Catch:{ all -> 0x0099 }
                    long r7 = r7 + r18
                    java.io.InputStream r0 = r15.mo17507c()     // Catch:{ all -> 0x0099 }
                    r18 = r7
                    r7 = r0
                    goto L_0x00a2
                L_0x0099:
                    r0 = move-exception
                    r7 = r6
                    r8 = r7
                    goto L_0x00f5
                L_0x009d:
                    r23 = r8
                    r7 = r6
                    r18 = r16
                L_0x00a2:
                    if (r7 != 0) goto L_0x00fa
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f5076b     // Catch:{ all -> 0x00f3 }
                    int r4 = r24.mo17497c()     // Catch:{ all -> 0x00f3 }
                    java.lang.String r8 = r24.mo17500e()     // Catch:{ all -> 0x00f3 }
                    r0.m5825a((com.bykv.p068vk.openvk.component.video.api.p085c.C2522c) r3, (int) r4, (java.lang.String) r8)     // Catch:{ all -> 0x00f3 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    java.lang.String r2 = r2.mo16398j()
                    r0[r13] = r2
                    r0[r9] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    int r2 = r2.mo16380b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6438b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0066
                L_0x00f3:
                    r0 = move-exception
                    r8 = r6
                L_0x00f5:
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0248
                L_0x00fa:
                    java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ all -> 0x01d5 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d5 }
                    java.io.File r0 = r0.f5078d     // Catch:{ all -> 0x01d5 }
                    java.lang.String r6 = "rw"
                    r8.<init>(r0, r6)     // Catch:{ all -> 0x01d5 }
                    r0 = 8192(0x2000, float:1.14794E-41)
                    byte[] r0 = new byte[r0]     // Catch:{ all -> 0x01d2 }
                    r6 = r14
                    r20 = r16
                L_0x010e:
                    int r5 = 8192 - r6
                    int r5 = r7.read(r0, r6, r5)     // Catch:{ all -> 0x01d2 }
                    r9 = -1
                    if (r5 == r9) goto L_0x01a2
                    com.bykv.vk.openvk.component.video.a.a.b.b r9 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d2 }
                    boolean r9 = r9.f5077c     // Catch:{ all -> 0x01d2 }
                    if (r9 == 0) goto L_0x016b
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f5076b     // Catch:{ all -> 0x01d2 }
                    int r4 = r24.mo17497c()     // Catch:{ all -> 0x01d2 }
                    r0.m5830b(r3, r4)     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r0[r14] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    java.lang.String r2 = r2.mo16398j()
                    r0[r13] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    int r2 = r2.mo16380b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6438b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0066
                L_0x016b:
                    int r6 = r6 + r5
                    long r13 = (long) r5
                    long r20 = r20 + r13
                    r13 = 8192(0x2000, double:4.0474E-320)
                    long r13 = r20 % r13
                    int r5 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
                    if (r5 == 0) goto L_0x0182
                    long r13 = r2     // Catch:{ all -> 0x01d2 }
                    long r13 = r18 - r13
                    int r5 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
                    if (r5 != 0) goto L_0x0180
                    goto L_0x0182
                L_0x0180:
                    r5 = 0
                    goto L_0x0183
                L_0x0182:
                    r5 = 1
                L_0x0183:
                    if (r5 == 0) goto L_0x019d
                    java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x01d2 }
                    int r5 = r5.intValue()     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r13 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r13 = r13.f5076b     // Catch:{ all -> 0x01d2 }
                    java.lang.String r13 = r13.mo16399k()     // Catch:{ all -> 0x01d2 }
                    com.bykv.p068vk.openvk.component.video.p069a.p082e.C2514c.m6223a(r8, r0, r5, r6, r13)     // Catch:{ all -> 0x01d2 }
                    long r5 = (long) r6     // Catch:{ all -> 0x01d2 }
                    long r3 = r3 + r5
                    r6 = 0
                L_0x019d:
                    r9 = 2
                    r13 = 1
                    r14 = 0
                    goto L_0x010e
                L_0x01a2:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f5076b     // Catch:{ all -> 0x01d2 }
                    boolean r0 = r0.mo16396h()     // Catch:{ all -> 0x01d2 }
                    if (r0 == 0) goto L_0x01c1
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d2 }
                    java.io.File r0 = r0.f5078d     // Catch:{ all -> 0x01d2 }
                    long r3 = r0.length()     // Catch:{ all -> 0x01d2 }
                    int r0 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
                    if (r0 != 0) goto L_0x01c1
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d2 }
                    r0.m5833d()     // Catch:{ all -> 0x01d2 }
                L_0x01c1:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x01d2 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f5076b     // Catch:{ all -> 0x01d2 }
                    int r4 = r24.mo17497c()     // Catch:{ all -> 0x01d2 }
                    r0.m5824a((com.bykv.p068vk.openvk.component.video.api.p085c.C2522c) r3, (int) r4)     // Catch:{ all -> 0x01d2 }
                    r6 = r8
                    goto L_0x01f9
                L_0x01d2:
                    r0 = move-exception
                    goto L_0x00f5
                L_0x01d5:
                    r0 = move-exception
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0247
                L_0x01da:
                    r0 = move-exception
                    r23 = r8
                    r6 = r15
                    r5 = 601(0x259, float:8.42E-43)
                    goto L_0x0246
                L_0x01e1:
                    r0 = move-exception
                    r23 = r8
                    goto L_0x0243
                L_0x01e5:
                    r23 = r8
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x0242 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x0242 }
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f5076b     // Catch:{ all -> 0x0242 }
                    java.lang.String r4 = "Network link failed."
                    r5 = 601(0x259, float:8.42E-43)
                    r0.m5825a((com.bykv.p068vk.openvk.component.video.api.p085c.C2522c) r3, (int) r5, (java.lang.String) r4)     // Catch:{ all -> 0x0240 }
                    r6 = 0
                    r7 = 0
                    r15 = 0
                L_0x01f9:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r15)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r2 = 0
                    r0[r2] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    java.lang.String r2 = r2.mo16398j()
                    r3 = 1
                    r0[r3] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    int r2 = r2.mo16380b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6438b((java.lang.String) r12, (java.lang.Object[]) r0)
                L_0x0236:
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r0 = r0.f5076b
                    com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2407c.m5842a(r0)
                    goto L_0x02a3
                L_0x0240:
                    r0 = move-exception
                    goto L_0x0245
                L_0x0242:
                    r0 = move-exception
                L_0x0243:
                    r5 = 601(0x259, float:8.42E-43)
                L_0x0245:
                    r6 = 0
                L_0x0246:
                    r7 = 0
                L_0x0247:
                    r8 = 0
                L_0x0248:
                    r0.printStackTrace()     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x02a4 }
                    r3.m5831c()     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r4 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.api.c.c r4 = r4.f5076b     // Catch:{ all -> 0x02a4 }
                    if (r2 == 0) goto L_0x025e
                    int r5 = r24.mo17497c()     // Catch:{ all -> 0x02a4 }
                L_0x025e:
                    java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02a4 }
                    r3.m5825a((com.bykv.p068vk.openvk.component.video.api.p085c.C2522c) r4, (int) r5, (java.lang.String) r0)     // Catch:{ all -> 0x02a4 }
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r0 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r0.m5826a((java.io.Closeable) r2)
                    java.lang.Object[] r0 = new java.lang.Object[r11]
                    r2 = 0
                    r0[r2] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    java.lang.String r2 = r2.mo16398j()
                    r3 = 1
                    r0[r3] = r2
                    r2 = 2
                    r0[r2] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    int r2 = r2.mo16380b()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 3
                    r0[r3] = r2
                    com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6438b((java.lang.String) r12, (java.lang.Object[]) r0)
                    goto L_0x0236
                L_0x02a3:
                    return
                L_0x02a4:
                    r0 = move-exception
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r3.m5826a((java.io.Closeable) r8)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r3.m5826a((java.io.Closeable) r7)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r3.m5826a((java.io.Closeable) r6)
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    r3.m5826a((java.io.Closeable) r2)
                    java.lang.Object[] r2 = new java.lang.Object[r11]
                    r3 = 0
                    r2[r3] = r10
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f5076b
                    java.lang.String r3 = r3.mo16398j()
                    r4 = 1
                    r2[r4] = r3
                    r3 = 2
                    r2[r3] = r23
                    com.bykv.vk.openvk.component.video.a.a.b.b r3 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r3 = r3.f5076b
                    int r3 = r3.mo16380b()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r4 = 3
                    r2[r4] = r3
                    com.bykv.p068vk.openvk.component.video.api.p088f.C2536c.m6438b((java.lang.String) r12, (java.lang.Object[]) r2)
                    com.bykv.vk.openvk.component.video.a.a.b.b r2 = com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.this
                    com.bykv.vk.openvk.component.video.api.c.c r2 = r2.f5076b
                    com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2407c.m5842a(r2)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.p068vk.openvk.component.video.p069a.p070a.p072b.C2405b.C24061.mo16080a(com.bytedance.sdk.component.b.a.b, com.bytedance.sdk.component.b.a.m):void");
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5826a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public C2522c mo16083a() {
        return this.f5076b;
    }

    /* renamed from: a */
    public void mo16085a(boolean z) {
        this.f5077c = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5824a(C2522c cVar, int i) {
        synchronized (C2531a.C2532a.class) {
            for (C2531a.C2532a next : this.f5080f) {
                if (next != null) {
                    next.mo16474a(cVar, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m5825a(C2522c cVar, int i, String str) {
        synchronized (C2531a.C2532a.class) {
            for (C2531a.C2532a next : this.f5080f) {
                if (next != null) {
                    next.mo16475a(cVar, i, str);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5830b(C2522c cVar, int i) {
        synchronized (C2531a.C2532a.class) {
            for (C2531a.C2532a next : this.f5080f) {
                if (next != null) {
                    next.mo16476b(cVar, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m5831c() {
        try {
            this.f5079e.delete();
            this.f5078d.delete();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m5833d() {
        try {
            if (!this.f5078d.renameTo(this.f5079e)) {
                throw new IOException("Error renaming file " + this.f5078d + " to " + this.f5079e + " for completion!");
            }
        } catch (Throwable th) {
            th.printStackTrace();
            C2536c.m6436b("VideoPreload", th.getMessage());
        }
    }
}
