package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k */
public final class C4838k implements C4831h {

    /* renamed from: a */
    public final C4848s f12732a;

    /* renamed from: b */
    public String f12733b;

    /* renamed from: c */
    public C4804n f12734c;

    /* renamed from: d */
    public C4839a f12735d;

    /* renamed from: e */
    public boolean f12736e;

    /* renamed from: f */
    public final boolean[] f12737f = new boolean[3];

    /* renamed from: g */
    public final C4842n f12738g = new C4842n(32, 128);

    /* renamed from: h */
    public final C4842n f12739h = new C4842n(33, 128);

    /* renamed from: i */
    public final C4842n f12740i = new C4842n(34, 128);

    /* renamed from: j */
    public final C4842n f12741j = new C4842n(39, 128);

    /* renamed from: k */
    public final C4842n f12742k = new C4842n(40, 128);

    /* renamed from: l */
    public long f12743l;

    /* renamed from: m */
    public long f12744m;

    /* renamed from: n */
    public final C5036k f12745n = new C5036k();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k$a */
    public static final class C4839a {

        /* renamed from: a */
        public final C4804n f12746a;

        /* renamed from: b */
        public long f12747b;

        /* renamed from: c */
        public boolean f12748c;

        /* renamed from: d */
        public int f12749d;

        /* renamed from: e */
        public long f12750e;

        /* renamed from: f */
        public boolean f12751f;

        /* renamed from: g */
        public boolean f12752g;

        /* renamed from: h */
        public boolean f12753h;

        /* renamed from: i */
        public boolean f12754i;

        /* renamed from: j */
        public boolean f12755j;

        /* renamed from: k */
        public long f12756k;

        /* renamed from: l */
        public long f12757l;

        /* renamed from: m */
        public boolean f12758m;

        public C4839a(C4804n nVar) {
            this.f12746a = nVar;
        }
    }

    public C4838k(C4848s sVar) {
        this.f12732a = sVar;
    }

    /* renamed from: a */
    public void mo25293a() {
        C5032i.m15323a(this.f12737f);
        this.f12738g.mo25309a();
        this.f12739h.mo25309a();
        this.f12740i.mo25309a();
        this.f12741j.mo25309a();
        this.f12742k.mo25309a();
        C4839a aVar = this.f12735d;
        aVar.f12751f = false;
        aVar.f12752g = false;
        aVar.f12753h = false;
        aVar.f12754i = false;
        aVar.f12755j = false;
        this.f12743l = 0;
    }

    /* renamed from: b */
    public void mo25297b() {
    }

    /* renamed from: a */
    public void mo25295a(C4731h hVar, C4853v.C4857d dVar) {
        dVar.mo25322a();
        this.f12733b = dVar.mo25323b();
        C4804n a = hVar.mo25173a(dVar.mo25324c(), 2);
        this.f12734c = a;
        this.f12735d = new C4839a(a);
        this.f12732a.mo25320a(hVar, dVar);
    }

    /* renamed from: a */
    public void mo25294a(long j, boolean z) {
        this.f12744m = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0368  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03b3  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25296a(com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k r39) {
        /*
            r38 = this;
            r0 = r38
        L_0x0002:
            r1 = r39
            int r2 = r39.mo25588a()
            if (r2 <= 0) goto L_0x03e8
            int r2 = r1.f13445b
            int r3 = r1.f13446c
            byte[] r4 = r1.f13444a
            long r5 = r0.f12743l
            int r7 = r39.mo25588a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f12743l = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r5 = r0.f12734c
            int r6 = r39.mo25588a()
            r5.mo25150a(r1, r6)
        L_0x0023:
            if (r2 >= r3) goto L_0x0002
            boolean[] r5 = r0.f12737f
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15321a(r4, r2, r3, r5)
            if (r5 != r3) goto L_0x0031
            r0.mo25308a(r4, r2, r3)
            return
        L_0x0031:
            int r6 = r5 + 3
            byte r7 = r4[r6]
            r7 = r7 & 126(0x7e, float:1.77E-43)
            r8 = 1
            int r7 = r7 >> r8
            int r9 = r5 - r2
            if (r9 <= 0) goto L_0x0040
            r0.mo25308a(r4, r2, r5)
        L_0x0040:
            int r15 = r3 - r5
            long r10 = r0.f12743l
            long r12 = (long) r15
            long r10 = r10 - r12
            r2 = 0
            if (r9 >= 0) goto L_0x004b
            int r5 = -r9
            goto L_0x004c
        L_0x004b:
            r5 = r2
        L_0x004c:
            long r12 = r0.f12744m
            boolean r9 = r0.f12736e
            if (r9 == 0) goto L_0x00b5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k$a r9 = r0.f12735d
            boolean r14 = r9.f12755j
            if (r14 == 0) goto L_0x0063
            boolean r14 = r9.f12752g
            if (r14 == 0) goto L_0x0063
            boolean r14 = r9.f12748c
            r9.f12758m = r14
            r9.f12755j = r2
            goto L_0x006c
        L_0x0063:
            boolean r14 = r9.f12753h
            if (r14 != 0) goto L_0x0078
            boolean r14 = r9.f12752g
            if (r14 == 0) goto L_0x006c
            goto L_0x0078
        L_0x006c:
            r17 = r3
            r18 = r4
            r19 = r6
            r20 = r7
            r25 = r15
            goto L_0x030d
        L_0x0078:
            boolean r14 = r9.f12754i
            r17 = r3
            if (r14 == 0) goto L_0x00a1
            long r2 = r9.f12747b
            r14 = r9
            long r8 = r10 - r2
            int r8 = (int) r8
            int r23 = r15 + r8
            r8 = r14
            boolean r9 = r8.f12758m
            r25 = r15
            long r14 = r8.f12756k
            long r2 = r2 - r14
            int r2 = (int) r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r3 = r8.f12746a
            long r14 = r8.f12757l
            r24 = 0
            r18 = r3
            r19 = r14
            r21 = r9
            r22 = r2
            r18.mo25147a(r19, r21, r22, r23, r24)
            goto L_0x00a4
        L_0x00a1:
            r8 = r9
            r25 = r15
        L_0x00a4:
            long r2 = r8.f12747b
            r8.f12756k = r2
            long r2 = r8.f12750e
            r8.f12757l = r2
            r2 = 1
            r8.f12754i = r2
            boolean r2 = r8.f12748c
            r8.f12758m = r2
            goto L_0x0307
        L_0x00b5:
            r17 = r3
            r25 = r15
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12738g
            r2.mo25311a(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12739h
            r2.mo25311a(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12740i
            r2.mo25311a(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12738g
            boolean r3 = r2.f12779c
            if (r3 == 0) goto L_0x0307
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f12739h
            boolean r8 = r3.f12779c
            if (r8 == 0) goto L_0x0307
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r8 = r0.f12740i
            boolean r9 = r8.f12779c
            if (r9 == 0) goto L_0x0307
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r9 = r0.f12734c
            java.lang.String r14 = r0.f12733b
            int r15 = r2.f12781e
            int r1 = r3.f12781e
            int r1 = r1 + r15
            r18 = r4
            int r4 = r8.f12781e
            int r1 = r1 + r4
            byte[] r1 = new byte[r1]
            byte[] r4 = r2.f12780d
            r19 = r6
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r1, r6, r15)
            byte[] r4 = r3.f12780d
            int r15 = r2.f12781e
            r20 = r7
            int r7 = r3.f12781e
            java.lang.System.arraycopy(r4, r6, r1, r15, r7)
            byte[] r4 = r8.f12780d
            int r2 = r2.f12781e
            int r7 = r3.f12781e
            int r2 = r2 + r7
            int r7 = r8.f12781e
            java.lang.System.arraycopy(r4, r6, r1, r2, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.l
            byte[] r4 = r3.f12780d
            int r3 = r3.f12781e
            r2.<init>(r4, r6, r3)
            r3 = 44
            r2.mo25623d(r3)
            r3 = 3
            int r4 = r2.mo25618b(r3)
            r2.mo25625f()
            r6 = 88
            r2.mo25623d(r6)
            r6 = 8
            r2.mo25623d(r6)
            r7 = 0
            r8 = 0
        L_0x012b:
            if (r7 >= r4) goto L_0x0140
            boolean r15 = r2.mo25620c()
            if (r15 == 0) goto L_0x0135
            int r8 = r8 + 89
        L_0x0135:
            boolean r15 = r2.mo25620c()
            if (r15 == 0) goto L_0x013d
            int r8 = r8 + 8
        L_0x013d:
            int r7 = r7 + 1
            goto L_0x012b
        L_0x0140:
            r2.mo25623d(r8)
            r7 = 2
            if (r4 <= 0) goto L_0x014c
            int r8 = 8 - r4
            int r8 = r8 * r7
            r2.mo25623d(r8)
        L_0x014c:
            r2.mo25622d()
            int r8 = r2.mo25622d()
            if (r8 != r3) goto L_0x0158
            r2.mo25625f()
        L_0x0158:
            int r15 = r2.mo25622d()
            int r21 = r2.mo25622d()
            boolean r22 = r2.mo25620c()
            if (r22 == 0) goto L_0x0192
            int r22 = r2.mo25622d()
            int r23 = r2.mo25622d()
            int r24 = r2.mo25622d()
            int r26 = r2.mo25622d()
            r6 = 1
            if (r8 == r6) goto L_0x017f
            if (r8 != r7) goto L_0x017c
            goto L_0x017f
        L_0x017c:
            r28 = r6
            goto L_0x0181
        L_0x017f:
            r28 = r7
        L_0x0181:
            if (r8 != r6) goto L_0x0185
            r6 = r7
            goto L_0x0186
        L_0x0185:
            r6 = 1
        L_0x0186:
            int r22 = r22 + r23
            int r28 = r28 * r22
            int r15 = r15 - r28
            int r24 = r24 + r26
            int r6 = r6 * r24
            int r21 = r21 - r6
        L_0x0192:
            r31 = r15
            r32 = r21
            r2.mo25622d()
            r2.mo25622d()
            int r6 = r2.mo25622d()
            boolean r8 = r2.mo25620c()
            if (r8 == 0) goto L_0x01a8
            r8 = 0
            goto L_0x01a9
        L_0x01a8:
            r8 = r4
        L_0x01a9:
            if (r8 > r4) goto L_0x01b7
            r2.mo25622d()
            r2.mo25622d()
            r2.mo25622d()
            int r8 = r8 + 1
            goto L_0x01a9
        L_0x01b7:
            r2.mo25622d()
            r2.mo25622d()
            r2.mo25622d()
            r2.mo25622d()
            r2.mo25622d()
            r2.mo25622d()
            boolean r4 = r2.mo25620c()
            r8 = 4
            if (r4 == 0) goto L_0x020f
            boolean r4 = r2.mo25620c()
            if (r4 == 0) goto L_0x020f
            r4 = 0
        L_0x01d7:
            if (r4 >= r8) goto L_0x020f
            r15 = 0
        L_0x01da:
            r7 = 6
            if (r15 >= r7) goto L_0x020a
            boolean r7 = r2.mo25620c()
            if (r7 != 0) goto L_0x01e7
            r2.mo25622d()
            goto L_0x0202
        L_0x01e7:
            int r7 = r4 << 1
            int r7 = r7 + r8
            r8 = 1
            int r7 = r8 << r7
            r3 = 64
            int r3 = java.lang.Math.min(r3, r7)
            if (r4 <= r8) goto L_0x01f8
            r2.mo25624e()
        L_0x01f8:
            r7 = 0
        L_0x01f9:
            if (r7 >= r3) goto L_0x0201
            r2.mo25624e()
            int r7 = r7 + 1
            goto L_0x01f9
        L_0x0201:
            r3 = 3
        L_0x0202:
            if (r4 != r3) goto L_0x0206
            r7 = r3
            goto L_0x0207
        L_0x0206:
            r7 = 1
        L_0x0207:
            int r15 = r15 + r7
            r8 = 4
            goto L_0x01da
        L_0x020a:
            int r4 = r4 + 1
            r7 = 2
            r8 = 4
            goto L_0x01d7
        L_0x020f:
            r3 = r7
            r2.mo25623d(r3)
            boolean r3 = r2.mo25620c()
            if (r3 == 0) goto L_0x0227
            r3 = 8
            r2.mo25623d(r3)
            r2.mo25622d()
            r2.mo25622d()
            r2.mo25625f()
        L_0x0227:
            int r3 = r2.mo25622d()
            r4 = 0
            r7 = 0
            r8 = 0
        L_0x022e:
            if (r4 >= r3) goto L_0x027b
            if (r4 == 0) goto L_0x0236
            boolean r7 = r2.mo25620c()
        L_0x0236:
            if (r7 == 0) goto L_0x0250
            r2.mo25625f()
            r2.mo25622d()
            r15 = 0
        L_0x023f:
            if (r15 > r8) goto L_0x024d
            boolean r23 = r2.mo25620c()
            if (r23 == 0) goto L_0x024a
            r2.mo25625f()
        L_0x024a:
            int r15 = r15 + 1
            goto L_0x023f
        L_0x024d:
            r24 = r3
            goto L_0x0276
        L_0x0250:
            int r8 = r2.mo25622d()
            int r15 = r2.mo25622d()
            int r23 = r8 + r15
            r24 = r3
            r3 = 0
        L_0x025d:
            if (r3 >= r8) goto L_0x0268
            r2.mo25622d()
            r2.mo25625f()
            int r3 = r3 + 1
            goto L_0x025d
        L_0x0268:
            r3 = 0
        L_0x0269:
            if (r3 >= r15) goto L_0x0274
            r2.mo25622d()
            r2.mo25625f()
            int r3 = r3 + 1
            goto L_0x0269
        L_0x0274:
            r8 = r23
        L_0x0276:
            int r4 = r4 + 1
            r3 = r24
            goto L_0x022e
        L_0x027b:
            boolean r3 = r2.mo25620c()
            if (r3 == 0) goto L_0x0293
            r3 = 0
        L_0x0282:
            int r4 = r2.mo25622d()
            if (r3 >= r4) goto L_0x0293
            r4 = 4
            int r8 = r6 + 4
            r7 = 1
            int r8 = r8 + r7
            r2.mo25623d(r8)
            int r3 = r3 + 1
            goto L_0x0282
        L_0x0293:
            r3 = 2
            r2.mo25623d(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            boolean r4 = r2.mo25620c()
            if (r4 == 0) goto L_0x02e4
            boolean r4 = r2.mo25620c()
            if (r4 == 0) goto L_0x02e4
            r4 = 8
            int r4 = r2.mo25618b(r4)
            r6 = 255(0xff, float:3.57E-43)
            if (r4 != r6) goto L_0x02c1
            r6 = 16
            int r4 = r2.mo25618b(r6)
            int r2 = r2.mo25618b(r6)
            if (r4 == 0) goto L_0x02e6
            if (r2 == 0) goto L_0x02e6
            float r3 = (float) r4
            float r2 = (float) r2
            float r3 = r3 / r2
            goto L_0x02e6
        L_0x02c1:
            r6 = 16
            float[] r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.f13424b
            int r7 = r2.length
            if (r4 >= r7) goto L_0x02cd
            r2 = r2[r4]
            r36 = r2
            goto L_0x02e8
        L_0x02cd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "Unexpected aspect_ratio_idc value: "
            r2.append(r7)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "H265Reader"
            android.util.Log.w(r4, r2)
            goto L_0x02e6
        L_0x02e4:
            r6 = 16
        L_0x02e6:
            r36 = r3
        L_0x02e8:
            java.util.List r34 = java.util.Collections.singletonList(r1)
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
            r35 = -1
            r37 = 0
            java.lang.String r27 = "video/hevc"
            r26 = r14
            com.fyber.inneractive.sdk.player.exoplayer2.i r1 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14972a((java.lang.String) r26, (java.lang.String) r27, (java.lang.String) r28, (int) r29, (int) r30, (int) r31, (int) r32, (float) r33, (java.util.List<byte[]>) r34, (int) r35, (float) r36, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r37)
            r9.mo25149a(r1)
            r1 = 1
            r0.f12736e = r1
            goto L_0x030f
        L_0x0307:
            r18 = r4
            r19 = r6
            r20 = r7
        L_0x030d:
            r6 = 16
        L_0x030f:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f12741j
            boolean r1 = r1.mo25311a(r5)
            r2 = 5
            if (r1 == 0) goto L_0x0339
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f12741j
            byte[] r3 = r1.f12780d
            int r1 = r1.f12781e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15320a(r3, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12745n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12741j
            byte[] r4 = r4.f12780d
            r3.mo25591a((byte[]) r4, (int) r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12745n
            r1.mo25602f(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s r1 = r0.f12732a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12745n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r1 = r1.f12815b
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C4951a.m15153a(r12, r3, r1)
        L_0x0339:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f12742k
            boolean r1 = r1.mo25311a(r5)
            if (r1 == 0) goto L_0x0362
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f12742k
            byte[] r3 = r1.f12780d
            int r1 = r1.f12781e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15320a(r3, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12745n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12742k
            byte[] r4 = r4.f12780d
            r3.mo25591a((byte[]) r4, (int) r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12745n
            r1.mo25602f(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s r1 = r0.f12732a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f12745n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r1 = r1.f12815b
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C4951a.m15153a(r12, r2, r1)
        L_0x0362:
            long r1 = r0.f12744m
            boolean r3 = r0.f12736e
            if (r3 == 0) goto L_0x03c3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.k$a r3 = r0.f12735d
            r4 = 0
            r3.f12752g = r4
            r3.f12753h = r4
            r3.f12750e = r1
            r3.f12749d = r4
            r3.f12747b = r10
            r1 = 32
            r2 = r20
            if (r2 < r1) goto L_0x03a8
            boolean r1 = r3.f12755j
            if (r1 != 0) goto L_0x0399
            boolean r1 = r3.f12754i
            if (r1 == 0) goto L_0x0399
            boolean r13 = r3.f12758m
            long r4 = r3.f12756k
            long r10 = r10 - r4
            int r14 = (int) r10
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r10 = r3.f12746a
            long r11 = r3.f12757l
            r16 = 0
            r1 = r6
            r15 = r25
            r10.mo25147a(r11, r13, r14, r15, r16)
            r4 = 0
            r3.f12754i = r4
            goto L_0x039b
        L_0x0399:
            r1 = r6
            r4 = 0
        L_0x039b:
            r5 = 34
            if (r2 > r5) goto L_0x03aa
            boolean r5 = r3.f12755j
            r6 = 1
            r5 = r5 ^ r6
            r3.f12753h = r5
            r3.f12755j = r6
            goto L_0x03ab
        L_0x03a8:
            r1 = r6
            r4 = 0
        L_0x03aa:
            r6 = 1
        L_0x03ab:
            if (r2 < r1) goto L_0x03b3
            r1 = 21
            if (r2 > r1) goto L_0x03b3
            r1 = r6
            goto L_0x03b4
        L_0x03b3:
            r1 = r4
        L_0x03b4:
            r3.f12748c = r1
            if (r1 != 0) goto L_0x03bf
            r1 = 9
            if (r2 > r1) goto L_0x03bd
            goto L_0x03bf
        L_0x03bd:
            r8 = r4
            goto L_0x03c0
        L_0x03bf:
            r8 = r6
        L_0x03c0:
            r3.f12751f = r8
            goto L_0x03d4
        L_0x03c3:
            r2 = r20
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f12738g
            r1.mo25312b(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f12739h
            r1.mo25312b(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f12740i
            r1.mo25312b(r2)
        L_0x03d4:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f12741j
            r1.mo25312b(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r1 = r0.f12742k
            r1.mo25312b(r2)
            r1 = r39
            r3 = r17
            r4 = r18
            r2 = r19
            goto L_0x0023
        L_0x03e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4838k.mo25296a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }

    /* renamed from: a */
    public final void mo25308a(byte[] bArr, int i, int i2) {
        if (this.f12736e) {
            C4839a aVar = this.f12735d;
            if (aVar.f12751f) {
                int i3 = aVar.f12749d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    aVar.f12752g = (bArr[i4] & 128) != 0;
                    aVar.f12751f = false;
                } else {
                    aVar.f12749d = i3 + (i2 - i);
                }
            }
        } else {
            this.f12738g.mo25310a(bArr, i, i2);
            this.f12739h.mo25310a(bArr, i, i2);
            this.f12740i.mo25310a(bArr, i, i2);
        }
        this.f12741j.mo25310a(bArr, i, i2);
        this.f12742k.mo25310a(bArr, i, i2);
    }
}
