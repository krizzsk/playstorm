package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5037l;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j */
public final class C4834j implements C4831h {

    /* renamed from: a */
    public final C4848s f12684a;

    /* renamed from: b */
    public final boolean f12685b;

    /* renamed from: c */
    public final boolean f12686c;

    /* renamed from: d */
    public final C4842n f12687d = new C4842n(7, 128);

    /* renamed from: e */
    public final C4842n f12688e = new C4842n(8, 128);

    /* renamed from: f */
    public final C4842n f12689f = new C4842n(6, 128);

    /* renamed from: g */
    public long f12690g;

    /* renamed from: h */
    public final boolean[] f12691h = new boolean[3];

    /* renamed from: i */
    public String f12692i;

    /* renamed from: j */
    public C4804n f12693j;

    /* renamed from: k */
    public C4836b f12694k;

    /* renamed from: l */
    public boolean f12695l;

    /* renamed from: m */
    public long f12696m;

    /* renamed from: n */
    public final C5036k f12697n = new C5036k();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b */
    public static final class C4836b {

        /* renamed from: a */
        public final C4804n f12698a;

        /* renamed from: b */
        public final boolean f12699b;

        /* renamed from: c */
        public final boolean f12700c;

        /* renamed from: d */
        public final SparseArray<C5032i.C5034b> f12701d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C5032i.C5033a> f12702e = new SparseArray<>();

        /* renamed from: f */
        public final C5037l f12703f;

        /* renamed from: g */
        public byte[] f12704g;

        /* renamed from: h */
        public int f12705h;

        /* renamed from: i */
        public int f12706i;

        /* renamed from: j */
        public long f12707j;

        /* renamed from: k */
        public boolean f12708k;

        /* renamed from: l */
        public long f12709l;

        /* renamed from: m */
        public C4837a f12710m = new C4837a();

        /* renamed from: n */
        public C4837a f12711n = new C4837a();

        /* renamed from: o */
        public boolean f12712o;

        /* renamed from: p */
        public long f12713p;

        /* renamed from: q */
        public long f12714q;

        /* renamed from: r */
        public boolean f12715r;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a */
        public static final class C4837a {

            /* renamed from: a */
            public boolean f12716a;

            /* renamed from: b */
            public boolean f12717b;

            /* renamed from: c */
            public C5032i.C5034b f12718c;

            /* renamed from: d */
            public int f12719d;

            /* renamed from: e */
            public int f12720e;

            /* renamed from: f */
            public int f12721f;

            /* renamed from: g */
            public int f12722g;

            /* renamed from: h */
            public boolean f12723h;

            /* renamed from: i */
            public boolean f12724i;

            /* renamed from: j */
            public boolean f12725j;

            /* renamed from: k */
            public boolean f12726k;

            /* renamed from: l */
            public int f12727l;

            /* renamed from: m */
            public int f12728m;

            /* renamed from: n */
            public int f12729n;

            /* renamed from: o */
            public int f12730o;

            /* renamed from: p */
            public int f12731p;

            public C4837a() {
            }

            /* renamed from: a */
            public static boolean m14857a(C4837a aVar, C4837a aVar2) {
                boolean z;
                boolean z2;
                if (aVar.f12716a) {
                    if (!aVar2.f12716a || aVar.f12721f != aVar2.f12721f || aVar.f12722g != aVar2.f12722g || aVar.f12723h != aVar2.f12723h) {
                        return true;
                    }
                    if (aVar.f12724i && aVar2.f12724i && aVar.f12725j != aVar2.f12725j) {
                        return true;
                    }
                    int i = aVar.f12719d;
                    int i2 = aVar2.f12719d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    int i3 = aVar.f12718c.f13437h;
                    if (i3 == 0 && aVar2.f12718c.f13437h == 0 && (aVar.f12728m != aVar2.f12728m || aVar.f12729n != aVar2.f12729n)) {
                        return true;
                    }
                    if ((i3 != 1 || aVar2.f12718c.f13437h != 1 || (aVar.f12730o == aVar2.f12730o && aVar.f12731p == aVar2.f12731p)) && (z = aVar.f12726k) == (z2 = aVar2.f12726k)) {
                        return z && z2 && aVar.f12727l != aVar2.f12727l;
                    }
                    return true;
                }
            }
        }

        public C4836b(C4804n nVar, boolean z, boolean z2) {
            this.f12698a = nVar;
            this.f12699b = z;
            this.f12700c = z2;
            byte[] bArr = new byte[128];
            this.f12704g = bArr;
            this.f12703f = new C5037l(bArr, 0, 0);
            mo25307a();
        }

        /* renamed from: a */
        public void mo25307a() {
            this.f12708k = false;
            this.f12712o = false;
            C4837a aVar = this.f12711n;
            aVar.f12717b = false;
            aVar.f12716a = false;
        }
    }

    public C4834j(C4848s sVar, boolean z, boolean z2) {
        this.f12684a = sVar;
        this.f12685b = z;
        this.f12686c = z2;
    }

    /* renamed from: a */
    public void mo25293a() {
        C5032i.m15323a(this.f12691h);
        this.f12687d.mo25309a();
        this.f12688e.mo25309a();
        this.f12689f.mo25309a();
        C4836b bVar = this.f12694k;
        bVar.f12708k = false;
        bVar.f12712o = false;
        C4836b.C4837a aVar = bVar.f12711n;
        aVar.f12717b = false;
        aVar.f12716a = false;
        this.f12690g = 0;
    }

    /* renamed from: b */
    public void mo25297b() {
    }

    /* renamed from: a */
    public void mo25295a(C4731h hVar, C4853v.C4857d dVar) {
        dVar.mo25322a();
        this.f12692i = dVar.mo25323b();
        C4804n a = hVar.mo25173a(dVar.mo25324c(), 2);
        this.f12693j = a;
        this.f12694k = new C4836b(a, this.f12685b, this.f12686c);
        this.f12684a.mo25320a(hVar, dVar);
    }

    /* renamed from: a */
    public void mo25294a(long j, boolean z) {
        this.f12696m = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b9, code lost:
        if ((r1.f12717b && ((r1 = r1.f12720e) == 7 || r1 == 2)) != false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ea, code lost:
        if (r6 != 1) goto L_0x01ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25296a(com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            int r2 = r1.f13445b
            int r3 = r1.f13446c
            byte[] r4 = r1.f13444a
            long r5 = r0.f12690g
            int r7 = r31.mo25588a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f12690g = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r5 = r0.f12693j
            int r6 = r31.mo25588a()
            r5.mo25150a(r1, r6)
        L_0x001d:
            boolean[] r1 = r0.f12691h
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15321a(r4, r2, r3, r1)
            if (r1 != r3) goto L_0x0029
            r0.mo25306a(r4, r2, r3)
            return
        L_0x0029:
            int r5 = r1 + 3
            byte r6 = r4[r5]
            r6 = r6 & 31
            int r7 = r1 - r2
            if (r7 <= 0) goto L_0x0036
            r0.mo25306a(r4, r2, r1)
        L_0x0036:
            int r1 = r3 - r1
            long r8 = r0.f12690g
            long r10 = (long) r1
            long r8 = r8 - r10
            if (r7 >= 0) goto L_0x0040
            int r7 = -r7
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            long r10 = r0.f12696m
            boolean r12 = r0.f12695l
            if (r12 == 0) goto L_0x0056
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r12 = r0.f12694k
            boolean r12 = r12.f12700c
            if (r12 == 0) goto L_0x004e
            goto L_0x0056
        L_0x004e:
            r27 = r3
            r28 = r4
            r29 = r5
            goto L_0x0130
        L_0x0056:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f12687d
            r12.mo25311a(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f12688e
            r12.mo25311a(r7)
            boolean r12 = r0.f12695l
            r14 = 3
            if (r12 != 0) goto L_0x00f1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f12687d
            boolean r12 = r12.f12779c
            if (r12 == 0) goto L_0x004e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f12688e
            boolean r12 = r12.f12779c
            if (r12 == 0) goto L_0x004e
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r15 = r0.f12687d
            byte[] r2 = r15.f12780d
            int r15 = r15.f12781e
            byte[] r2 = java.util.Arrays.copyOf(r2, r15)
            r12.add(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12688e
            byte[] r15 = r2.f12780d
            int r2 = r2.f12781e
            byte[] r2 = java.util.Arrays.copyOf(r15, r2)
            r12.add(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12687d
            byte[] r15 = r2.f12780d
            int r2 = r2.f12781e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15324b(r15, r14, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r15 = r0.f12688e
            byte[] r13 = r15.f12780d
            int r15 = r15.f12781e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$a r13 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15322a(r13, r14, r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r14 = r0.f12693j
            java.lang.String r15 = r0.f12692i
            r27 = r3
            int r3 = r2.f13431b
            r28 = r4
            int r4 = r2.f13432c
            r29 = r5
            float r5 = r2.f13433d
            r17 = 0
            r18 = -1
            r19 = -1
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            r26 = 0
            java.lang.String r16 = "video/avc"
            r20 = r3
            r21 = r4
            r23 = r12
            r25 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14972a((java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18, (int) r19, (int) r20, (int) r21, (float) r22, (java.util.List<byte[]>) r23, (int) r24, (float) r25, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r26)
            r14.mo25149a(r3)
            r3 = 1
            r0.f12695l = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12694k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$b> r3 = r3.f12701d
            int r4 = r2.f13430a
            r3.append(r4, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r2 = r0.f12694k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r2 = r2.f12702e
            int r3 = r13.f13427a
            r2.append(r3, r13)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12687d
            r2.mo25309a()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12688e
            r2.mo25309a()
            goto L_0x0130
        L_0x00f1:
            r27 = r3
            r28 = r4
            r29 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12687d
            boolean r3 = r2.f12779c
            if (r3 == 0) goto L_0x0114
            byte[] r3 = r2.f12780d
            int r2 = r2.f12781e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15324b(r3, r14, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12694k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$b> r3 = r3.f12701d
            int r4 = r2.f13430a
            r3.append(r4, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12687d
            r2.mo25309a()
            goto L_0x0130
        L_0x0114:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12688e
            boolean r3 = r2.f12779c
            if (r3 == 0) goto L_0x0130
            byte[] r3 = r2.f12780d
            int r2 = r2.f12781e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$a r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15322a(r3, r14, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12694k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r3 = r3.f12702e
            int r4 = r2.f13427a
            r3.append(r4, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12688e
            r2.mo25309a()
        L_0x0130:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12689f
            boolean r2 = r2.mo25311a(r7)
            if (r2 == 0) goto L_0x015a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12689f
            byte[] r3 = r2.f12780d
            int r2 = r2.f12781e
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15320a(r3, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12697n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12689f
            byte[] r4 = r4.f12780d
            r3.mo25591a((byte[]) r4, (int) r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f12697n
            r3 = 4
            r2.mo25600e(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s r2 = r0.f12684a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12697n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r2 = r2.f12815b
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C4951a.m15153a(r10, r3, r2)
        L_0x015a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r2 = r0.f12694k
            int r3 = r2.f12706i
            r4 = 9
            if (r3 == r4) goto L_0x0173
            boolean r3 = r2.f12700c
            if (r3 == 0) goto L_0x0171
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r3 = r2.f12711n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r4 = r2.f12710m
            boolean r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4834j.C4836b.C4837a.m14857a(r3, r4)
            if (r3 == 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r1 = 1
            goto L_0x019b
        L_0x0173:
            boolean r3 = r2.f12712o
            if (r3 == 0) goto L_0x018d
            long r3 = r2.f12707j
            long r10 = r8 - r3
            int r5 = (int) r10
            int r15 = r1 + r5
            boolean r13 = r2.f12715r
            long r10 = r2.f12713p
            long r3 = r3 - r10
            int r14 = (int) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r10 = r2.f12698a
            long r11 = r2.f12714q
            r16 = 0
            r10.mo25147a(r11, r13, r14, r15, r16)
        L_0x018d:
            long r3 = r2.f12707j
            r2.f12713p = r3
            long r3 = r2.f12709l
            r2.f12714q = r3
            r1 = 0
            r2.f12715r = r1
            r1 = 1
            r2.f12712o = r1
        L_0x019b:
            boolean r3 = r2.f12715r
            int r4 = r2.f12706i
            r5 = 2
            r7 = 5
            if (r4 == r7) goto L_0x01be
            boolean r10 = r2.f12699b
            if (r10 == 0) goto L_0x01bc
            if (r4 != r1) goto L_0x01bc
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r1 = r2.f12711n
            boolean r4 = r1.f12717b
            if (r4 == 0) goto L_0x01b8
            int r1 = r1.f12720e
            r4 = 7
            if (r1 == r4) goto L_0x01b6
            if (r1 != r5) goto L_0x01b8
        L_0x01b6:
            r1 = 1
            goto L_0x01b9
        L_0x01b8:
            r1 = 0
        L_0x01b9:
            if (r1 == 0) goto L_0x01bc
            goto L_0x01be
        L_0x01bc:
            r1 = 0
            goto L_0x01bf
        L_0x01be:
            r1 = 1
        L_0x01bf:
            r1 = r1 | r3
            r2.f12715r = r1
            long r1 = r0.f12696m
            boolean r3 = r0.f12695l
            if (r3 == 0) goto L_0x01ce
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12694k
            boolean r3 = r3.f12700c
            if (r3 == 0) goto L_0x01d8
        L_0x01ce:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f12687d
            r3.mo25312b(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f12688e
            r3.mo25312b(r6)
        L_0x01d8:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f12689f
            r3.mo25312b(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12694k
            r3.f12706i = r6
            r3.f12709l = r1
            r3.f12707j = r8
            boolean r1 = r3.f12699b
            if (r1 == 0) goto L_0x01ed
            r1 = 1
            if (r6 == r1) goto L_0x01f8
            goto L_0x01ee
        L_0x01ed:
            r1 = 1
        L_0x01ee:
            boolean r2 = r3.f12700c
            if (r2 == 0) goto L_0x020a
            if (r6 == r7) goto L_0x01f8
            if (r6 == r1) goto L_0x01f8
            if (r6 != r5) goto L_0x020a
        L_0x01f8:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r1 = r3.f12710m
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r2 = r3.f12711n
            r3.f12710m = r2
            r3.f12711n = r1
            r2 = 0
            r1.f12717b = r2
            r1.f12716a = r2
            r3.f12705h = r2
            r1 = 1
            r3.f12708k = r1
        L_0x020a:
            r3 = r27
            r4 = r28
            r2 = r29
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4834j.mo25296a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0170  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25306a(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.f12695l
            if (r4 == 0) goto L_0x0012
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r4 = r0.f12694k
            boolean r4 = r4.f12700c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12687d
            r4.mo25310a(r1, r2, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12688e
            r4.mo25310a(r1, r2, r3)
        L_0x001c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12689f
            r4.mo25310a(r1, r2, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r4 = r0.f12694k
            boolean r5 = r4.f12708k
            if (r5 != 0) goto L_0x0029
            goto L_0x01cd
        L_0x0029:
            int r3 = r3 - r2
            byte[] r5 = r4.f12704g
            int r6 = r5.length
            int r7 = r4.f12705h
            int r7 = r7 + r3
            r8 = 2
            if (r6 >= r7) goto L_0x003a
            int r7 = r7 * r8
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.f12704g = r5
        L_0x003a:
            byte[] r5 = r4.f12704g
            int r6 = r4.f12705h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.f12705h
            int r1 = r1 + r3
            r4.f12705h = r1
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12703f
            byte[] r3 = r4.f12704g
            r2.f13447a = r3
            r3 = 0
            r2.f13449c = r3
            r2.f13448b = r1
            r2.f13450d = r3
            r2.mo25615a()
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r1 = r4.f12703f
            r2 = 8
            boolean r1 = r1.mo25617a(r2)
            if (r1 != 0) goto L_0x0062
            goto L_0x01cd
        L_0x0062:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r1 = r4.f12703f
            r1.mo25625f()
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r1 = r4.f12703f
            int r1 = r1.mo25618b(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12703f
            r5 = 5
            r2.mo25623d(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12703f
            boolean r2 = r2.mo25619b()
            if (r2 != 0) goto L_0x007d
            goto L_0x01cd
        L_0x007d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12703f
            r2.mo25622d()
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12703f
            boolean r2 = r2.mo25619b()
            if (r2 != 0) goto L_0x008c
            goto L_0x01cd
        L_0x008c:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12703f
            int r2 = r2.mo25622d()
            boolean r6 = r4.f12700c
            r7 = 1
            if (r6 != 0) goto L_0x00a1
            r4.f12708k = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r1 = r4.f12711n
            r1.f12720e = r2
            r1.f12717b = r7
            goto L_0x01cd
        L_0x00a1:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r6 = r4.f12703f
            boolean r6 = r6.mo25619b()
            if (r6 != 0) goto L_0x00ab
            goto L_0x01cd
        L_0x00ab:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r6 = r4.f12703f
            int r6 = r6.mo25622d()
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r9 = r4.f12702e
            int r9 = r9.indexOfKey(r6)
            if (r9 >= 0) goto L_0x00bd
            r4.f12708k = r3
            goto L_0x01cd
        L_0x00bd:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r9 = r4.f12702e
            java.lang.Object r9 = r9.get(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$a r9 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.C5033a) r9
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$b> r10 = r4.f12701d
            int r11 = r9.f13428b
            java.lang.Object r10 = r10.get(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r10 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.C5034b) r10
            boolean r11 = r10.f13434e
            if (r11 == 0) goto L_0x00e2
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f12703f
            boolean r11 = r11.mo25617a(r8)
            if (r11 != 0) goto L_0x00dd
            goto L_0x01cd
        L_0x00dd:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f12703f
            r11.mo25623d(r8)
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r8 = r4.f12703f
            int r11 = r10.f13436g
            boolean r8 = r8.mo25617a(r11)
            if (r8 != 0) goto L_0x00ee
            goto L_0x01cd
        L_0x00ee:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r8 = r4.f12703f
            int r11 = r10.f13436g
            int r8 = r8.mo25618b(r11)
            boolean r11 = r10.f13435f
            if (r11 != 0) goto L_0x0120
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f12703f
            boolean r11 = r11.mo25617a(r7)
            if (r11 != 0) goto L_0x0104
            goto L_0x01cd
        L_0x0104:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f12703f
            boolean r11 = r11.mo25620c()
            if (r11 == 0) goto L_0x011e
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r12 = r4.f12703f
            boolean r12 = r12.mo25617a(r7)
            if (r12 != 0) goto L_0x0116
            goto L_0x01cd
        L_0x0116:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r12 = r4.f12703f
            boolean r12 = r12.mo25620c()
            r13 = r7
            goto L_0x0123
        L_0x011e:
            r12 = r3
            goto L_0x0122
        L_0x0120:
            r11 = r3
            r12 = r11
        L_0x0122:
            r13 = r12
        L_0x0123:
            int r14 = r4.f12706i
            if (r14 != r5) goto L_0x0129
            r5 = r7
            goto L_0x012a
        L_0x0129:
            r5 = r3
        L_0x012a:
            if (r5 == 0) goto L_0x013d
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r14 = r4.f12703f
            boolean r14 = r14.mo25619b()
            if (r14 != 0) goto L_0x0136
            goto L_0x01cd
        L_0x0136:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r14 = r4.f12703f
            int r14 = r14.mo25622d()
            goto L_0x013e
        L_0x013d:
            r14 = r3
        L_0x013e:
            int r15 = r10.f13437h
            if (r15 != 0) goto L_0x0170
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r15 = r4.f12703f
            int r3 = r10.f13438i
            boolean r3 = r15.mo25617a(r3)
            if (r3 != 0) goto L_0x014e
            goto L_0x01cd
        L_0x014e:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r3 = r4.f12703f
            int r15 = r10.f13438i
            int r3 = r3.mo25618b(r15)
            boolean r9 = r9.f13429c
            if (r9 == 0) goto L_0x01a4
            if (r11 != 0) goto L_0x01a4
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f12703f
            boolean r9 = r9.mo25619b()
            if (r9 != 0) goto L_0x0166
            goto L_0x01cd
        L_0x0166:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f12703f
            int r9 = r9.mo25624e()
            r15 = r9
            r7 = 0
            r9 = 0
            goto L_0x01a7
        L_0x0170:
            if (r15 != r7) goto L_0x01a3
            boolean r3 = r10.f13439j
            if (r3 != 0) goto L_0x01a3
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r3 = r4.f12703f
            boolean r3 = r3.mo25619b()
            if (r3 != 0) goto L_0x017f
            goto L_0x01cd
        L_0x017f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r3 = r4.f12703f
            int r3 = r3.mo25624e()
            boolean r9 = r9.f13429c
            if (r9 == 0) goto L_0x019f
            if (r11 != 0) goto L_0x019f
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f12703f
            boolean r9 = r9.mo25619b()
            if (r9 != 0) goto L_0x0194
            goto L_0x01cd
        L_0x0194:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f12703f
            int r9 = r9.mo25624e()
            r7 = r9
            r15 = 0
            r9 = r3
            r3 = 0
            goto L_0x01a7
        L_0x019f:
            r9 = r3
            r3 = 0
            r7 = 0
            goto L_0x01a6
        L_0x01a3:
            r3 = 0
        L_0x01a4:
            r7 = 0
            r9 = 0
        L_0x01a6:
            r15 = 0
        L_0x01a7:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r0 = r4.f12711n
            r0.f12718c = r10
            r0.f12719d = r1
            r0.f12720e = r2
            r0.f12721f = r8
            r0.f12722g = r6
            r0.f12723h = r11
            r0.f12724i = r13
            r0.f12725j = r12
            r0.f12726k = r5
            r0.f12727l = r14
            r0.f12728m = r3
            r0.f12729n = r15
            r0.f12730o = r9
            r0.f12731p = r7
            r1 = 1
            r0.f12716a = r1
            r0.f12717b = r1
            r0 = 0
            r4.f12708k = r0
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4834j.mo25306a(byte[], int, int):void");
    }
}
