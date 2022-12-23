package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i */
public final class C4832i implements C4831h {

    /* renamed from: n */
    public static final double[] f12666n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f12667a;

    /* renamed from: b */
    public C4804n f12668b;

    /* renamed from: c */
    public boolean f12669c;

    /* renamed from: d */
    public long f12670d;

    /* renamed from: e */
    public final boolean[] f12671e = new boolean[4];

    /* renamed from: f */
    public final C4833a f12672f = new C4833a(128);

    /* renamed from: g */
    public boolean f12673g;

    /* renamed from: h */
    public long f12674h;

    /* renamed from: i */
    public long f12675i;

    /* renamed from: j */
    public boolean f12676j;

    /* renamed from: k */
    public boolean f12677k;

    /* renamed from: l */
    public long f12678l;

    /* renamed from: m */
    public long f12679m;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i$a */
    public static final class C4833a {

        /* renamed from: a */
        public boolean f12680a;

        /* renamed from: b */
        public int f12681b;

        /* renamed from: c */
        public int f12682c;

        /* renamed from: d */
        public byte[] f12683d;

        public C4833a(int i) {
            this.f12683d = new byte[i];
        }

        /* renamed from: a */
        public void mo25305a(byte[] bArr, int i, int i2) {
            if (this.f12680a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f12683d;
                int length = bArr2.length;
                int i4 = this.f12681b + i3;
                if (length < i4) {
                    this.f12683d = Arrays.copyOf(bArr2, i4 * 2);
                }
                System.arraycopy(bArr, i, this.f12683d, this.f12681b, i3);
                this.f12681b += i3;
            }
        }
    }

    /* renamed from: a */
    public void mo25293a() {
        C5032i.m15323a(this.f12671e);
        C4833a aVar = this.f12672f;
        aVar.f12680a = false;
        aVar.f12681b = 0;
        aVar.f12682c = 0;
        this.f12676j = false;
        this.f12673g = false;
        this.f12674h = 0;
    }

    /* renamed from: b */
    public void mo25297b() {
    }

    /* renamed from: a */
    public void mo25295a(C4731h hVar, C4853v.C4857d dVar) {
        dVar.mo25322a();
        this.f12667a = dVar.mo25323b();
        this.f12668b = hVar.mo25173a(dVar.mo25324c(), 2);
    }

    /* renamed from: a */
    public void mo25294a(long j, boolean z) {
        boolean z2 = j != -9223372036854775807L;
        this.f12676j = z2;
        if (z2) {
            this.f12675i = j;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25296a(com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r1.f13445b
            int r3 = r1.f13446c
            byte[] r4 = r1.f13444a
            long r5 = r0.f12674h
            int r7 = r26.mo25588a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f12674h = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r5 = r0.f12668b
            int r6 = r26.mo25588a()
            r5.mo25150a(r1, r6)
            r5 = r2
        L_0x001e:
            boolean[] r6 = r0.f12671e
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15321a(r4, r2, r3, r6)
            if (r2 != r3) goto L_0x0030
            boolean r1 = r0.f12669c
            if (r1 != 0) goto L_0x002f
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i$a r1 = r0.f12672f
            r1.mo25305a(r4, r5, r3)
        L_0x002f:
            return
        L_0x0030:
            byte[] r6 = r1.f13444a
            int r7 = r2 + 3
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            boolean r8 = r0.f12669c
            r9 = 0
            r10 = 1
            if (r8 != 0) goto L_0x0122
            int r8 = r2 - r5
            if (r8 <= 0) goto L_0x0047
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i$a r11 = r0.f12672f
            r11.mo25305a(r4, r5, r2)
        L_0x0047:
            if (r8 >= 0) goto L_0x004b
            int r5 = -r8
            goto L_0x004c
        L_0x004b:
            r5 = r9
        L_0x004c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i$a r8 = r0.f12672f
            boolean r11 = r8.f12680a
            if (r11 == 0) goto L_0x0068
            int r11 = r8.f12682c
            if (r11 != 0) goto L_0x005f
            r11 = 181(0xb5, float:2.54E-43)
            if (r6 != r11) goto L_0x005f
            int r5 = r8.f12681b
            r8.f12682c = r5
            goto L_0x006e
        L_0x005f:
            int r11 = r8.f12681b
            int r11 = r11 - r5
            r8.f12681b = r11
            r8.f12680a = r9
            r5 = r10
            goto L_0x006f
        L_0x0068:
            r5 = 179(0xb3, float:2.51E-43)
            if (r6 != r5) goto L_0x006e
            r8.f12680a = r10
        L_0x006e:
            r5 = r9
        L_0x006f:
            if (r5 == 0) goto L_0x0122
            java.lang.String r11 = r0.f12667a
            byte[] r5 = r8.f12683d
            int r12 = r8.f12681b
            byte[] r5 = java.util.Arrays.copyOf(r5, r12)
            r12 = 4
            byte r13 = r5[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r23 = 5
            byte r14 = r5[r23]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r15 = 6
            byte r15 = r5[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r13 = r13 << r12
            int r16 = r14 >> 4
            r16 = r13 | r16
            r13 = r14 & 15
            int r13 = r13 << 8
            r17 = r13 | r15
            r13 = 1065353216(0x3f800000, float:1.0)
            r24 = 7
            byte r14 = r5[r24]
            r14 = r14 & 240(0xf0, float:3.36E-43)
            int r14 = r14 >> r12
            r15 = 2
            if (r14 == r15) goto L_0x00b6
            r15 = 3
            if (r14 == r15) goto L_0x00b0
            if (r14 == r12) goto L_0x00aa
            r21 = r13
            goto L_0x00bf
        L_0x00aa:
            int r12 = r17 * 121
            float r12 = (float) r12
            int r13 = r16 * 100
            goto L_0x00bb
        L_0x00b0:
            int r12 = r17 * 16
            float r12 = (float) r12
            int r13 = r16 * 9
            goto L_0x00bb
        L_0x00b6:
            int r12 = r17 * 4
            float r12 = (float) r12
            int r13 = r16 * 3
        L_0x00bb:
            float r13 = (float) r13
            float r12 = r12 / r13
            r21 = r12
        L_0x00bf:
            java.util.List r19 = java.util.Collections.singletonList(r5)
            r13 = 0
            r14 = -1
            r15 = -1
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            r20 = -1
            r22 = 0
            java.lang.String r12 = "video/mpeg2"
            com.fyber.inneractive.sdk.player.exoplayer2.i r11 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14972a((java.lang.String) r11, (java.lang.String) r12, (java.lang.String) r13, (int) r14, (int) r15, (int) r16, (int) r17, (float) r18, (java.util.List<byte[]>) r19, (int) r20, (float) r21, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r22)
            byte r14 = r5[r24]
            r14 = r14 & 15
            int r14 = r14 - r10
            if (r14 < 0) goto L_0x0102
            double[] r15 = f12666n
            int r12 = r15.length
            if (r14 >= r12) goto L_0x0102
            r12 = r15[r14]
            int r8 = r8.f12682c
            int r8 = r8 + 9
            byte r14 = r5[r8]
            r14 = r14 & 96
            int r14 = r14 >> 5
            byte r5 = r5[r8]
            r5 = r5 & 31
            if (r14 == r5) goto L_0x00fa
            double r14 = (double) r14
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r14 = r14 + r16
            int r5 = r5 + 1
            double r9 = (double) r5
            double r14 = r14 / r9
            double r12 = r12 * r14
        L_0x00fa:
            r9 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r9 = r9 / r12
            long r12 = (long) r9
            goto L_0x0104
        L_0x0102:
            r12 = 0
        L_0x0104:
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            android.util.Pair r5 = android.util.Pair.create(r11, r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r9 = r0.f12668b
            java.lang.Object r10 = r5.first
            com.fyber.inneractive.sdk.player.exoplayer2.i r10 = (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r10
            r9.mo25149a(r10)
            java.lang.Object r5 = r5.second
            java.lang.Long r5 = (java.lang.Long) r5
            long r9 = r5.longValue()
            r0.f12670d = r9
            r5 = 1
            r0.f12669c = r5
        L_0x0122:
            boolean r5 = r0.f12669c
            if (r5 == 0) goto L_0x0171
            r5 = 184(0xb8, float:2.58E-43)
            if (r6 == r5) goto L_0x012c
            if (r6 != 0) goto L_0x0171
        L_0x012c:
            int r15 = r3 - r2
            boolean r9 = r0.f12673g
            if (r9 == 0) goto L_0x014d
            boolean r12 = r0.f12677k
            long r9 = r0.f12674h
            long r13 = r0.f12678l
            long r9 = r9 - r13
            int r9 = (int) r9
            int r13 = r9 - r15
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r9 = r0.f12668b
            long r10 = r0.f12679m
            r16 = 0
            r14 = r15
            r8 = r15
            r15 = r16
            r9.mo25147a(r10, r12, r13, r14, r15)
            r9 = 0
            r0.f12677k = r9
            goto L_0x014f
        L_0x014d:
            r8 = r15
            r9 = 0
        L_0x014f:
            if (r6 != r5) goto L_0x0157
            r0.f12673g = r9
            r5 = 1
            r0.f12677k = r5
            goto L_0x0171
        L_0x0157:
            boolean r6 = r0.f12676j
            if (r6 == 0) goto L_0x015e
            long r9 = r0.f12675i
            goto L_0x0163
        L_0x015e:
            long r9 = r0.f12679m
            long r11 = r0.f12670d
            long r9 = r9 + r11
        L_0x0163:
            r0.f12679m = r9
            long r9 = r0.f12674h
            long r11 = (long) r8
            long r9 = r9 - r11
            r0.f12678l = r9
            r5 = 0
            r0.f12676j = r5
            r5 = 1
            r0.f12673g = r5
        L_0x0171:
            r5 = r2
            r2 = r7
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4832i.mo25296a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }
}
