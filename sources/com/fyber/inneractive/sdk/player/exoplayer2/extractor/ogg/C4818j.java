package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4820k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j */
public final class C4818j extends C4814h {

    /* renamed from: n */
    public C4819a f12591n;

    /* renamed from: o */
    public int f12592o;

    /* renamed from: p */
    public boolean f12593p;

    /* renamed from: q */
    public C4820k.C4823c f12594q;

    /* renamed from: r */
    public C4820k.C4821a f12595r;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a */
    public static final class C4819a {

        /* renamed from: a */
        public final C4820k.C4823c f12596a;

        /* renamed from: b */
        public final byte[] f12597b;

        /* renamed from: c */
        public final C4820k.C4822b[] f12598c;

        /* renamed from: d */
        public final int f12599d;

        public C4819a(C4820k.C4823c cVar, C4820k.C4821a aVar, byte[] bArr, C4820k.C4822b[] bVarArr, int i) {
            this.f12596a = cVar;
            this.f12597b = bArr;
            this.f12598c = bVarArr;
            this.f12599d = i;
        }
    }

    /* renamed from: a */
    public void mo25281a(boolean z) {
        super.mo25281a(z);
        if (z) {
            this.f12591n = null;
            this.f12594q = null;
            this.f12595r = null;
        }
        this.f12592o = 0;
        this.f12593p = false;
    }

    /* renamed from: b */
    public void mo25289b(long j) {
        this.f12578g = j;
        int i = 0;
        this.f12593p = j != 0;
        C4820k.C4823c cVar = this.f12594q;
        if (cVar != null) {
            i = cVar.f12604d;
        }
        this.f12592o = i;
    }

    /* renamed from: a */
    public long mo25280a(C5036k kVar) {
        int i;
        byte[] bArr = kVar.f13444a;
        int i2 = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        byte b = bArr[0];
        C4819a aVar = this.f12591n;
        if (!aVar.f12598c[(b >> 1) & (255 >>> (8 - aVar.f12599d))].f12600a) {
            i = aVar.f12596a.f12604d;
        } else {
            i = aVar.f12596a.f12605e;
        }
        if (this.f12593p) {
            i2 = (this.f12592o + i) / 4;
        }
        long j = (long) i2;
        kVar.mo25598d(kVar.f13446c + 4);
        byte[] bArr2 = kVar.f13444a;
        int i3 = kVar.f13446c;
        bArr2[i3 - 4] = (byte) ((int) (j & 255));
        bArr2[i3 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr2[i3 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr2[i3 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f12593p = true;
        this.f12592o = i;
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0421 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0423  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25282a(com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k r22, long r23, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4814h.C4815a r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r2 = r0.f12591n
            r3 = 0
            if (r2 == 0) goto L_0x000a
            return r3
        L_0x000a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r2 = r0.f12594q
            r5 = 4
            r6 = 1
            if (r2 != 0) goto L_0x0066
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4820k.m14801a(r6, r1, r3)
            long r8 = r22.mo25601f()
            int r10 = r22.mo25608l()
            long r11 = r22.mo25601f()
            int r13 = r22.mo25599e()
            int r14 = r22.mo25599e()
            int r15 = r22.mo25599e()
            int r2 = r22.mo25608l()
            r7 = r2 & 15
            double r3 = (double) r7
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.pow(r6, r3)
            int r3 = (int) r3
            r2 = r2 & 240(0xf0, float:3.36E-43)
            int r2 = r2 >> r5
            double r4 = (double) r2
            double r4 = java.lang.Math.pow(r6, r4)
            int r2 = (int) r4
            int r4 = r22.mo25608l()
            r5 = 1
            r4 = r4 & r5
            if (r4 <= 0) goto L_0x004d
            r18 = 1
            goto L_0x004f
        L_0x004d:
            r18 = 0
        L_0x004f:
            byte[] r4 = r1.f13444a
            int r1 = r1.f13446c
            byte[] r19 = java.util.Arrays.copyOf(r4, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c
            r7 = r1
            r16 = r3
            r17 = r2
            r7.<init>(r8, r10, r11, r13, r14, r15, r16, r17, r18, r19)
            r0.f12594q = r1
        L_0x0063:
            r4 = 0
            goto L_0x041d
        L_0x0066:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a r2 = r0.f12595r
            r3 = 3
            if (r2 != 0) goto L_0x00bd
            r2 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4820k.m14801a(r3, r1, r2)
            long r2 = r22.mo25601f()
            int r2 = (int) r2
            java.lang.String r2 = r1.mo25594b(r2)
            int r3 = r2.length()
            int r3 = r3 + 11
            long r6 = r22.mo25601f()
            int r4 = (int) r6
            java.lang.String[] r4 = new java.lang.String[r4]
            int r3 = r3 + r5
            r5 = r3
            r3 = 0
        L_0x0088:
            long r8 = (long) r3
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a4
            long r8 = r22.mo25601f()
            int r8 = (int) r8
            int r5 = r5 + 4
            java.lang.String r8 = r1.mo25594b(r8)
            r4[r3] = r8
            r8 = r4[r3]
            int r8 = r8.length()
            int r5 = r5 + r8
            int r3 = r3 + 1
            goto L_0x0088
        L_0x00a4:
            int r1 = r22.mo25608l()
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00b5
            int r5 = r5 + r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a
            r1.<init>(r2, r4, r5)
            r0.f12595r = r1
            goto L_0x0063
        L_0x00b5:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "framing bit expected to be set"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x00bd:
            int r2 = r1.f13446c
            byte[] r9 = new byte[r2]
            byte[] r4 = r1.f13444a
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r9, r6, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r2 = r0.f12594q
            int r2 = r2.f12601a
            r4 = 5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4820k.m14801a(r4, r1, r6)
            int r7 = r22.mo25608l()
            r8 = 1
            int r7 = r7 + r8
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i
            byte[] r10 = r1.f13444a
            r8.<init>(r10)
            int r1 = r1.f13445b
            r10 = 8
            int r1 = r1 * r10
            r8.mo25292b(r1)
            r1 = r6
        L_0x00e5:
            r11 = 24
            r13 = 16
            if (r1 >= r7) goto L_0x01fb
            int r14 = r8.mo25290a(r11)
            r15 = 5653314(0x564342, float:7.92198E-39)
            if (r14 != r15) goto L_0x01dc
            int r13 = r8.mo25290a(r13)
            int r11 = r8.mo25290a(r11)
            long[] r14 = new long[r11]
            boolean r15 = r8.mo25291a()
            r16 = 0
            if (r15 != 0) goto L_0x013f
            boolean r15 = r8.mo25291a()
        L_0x010a:
            if (r6 >= r11) goto L_0x013c
            if (r15 == 0) goto L_0x0129
            boolean r18 = r8.mo25291a()
            if (r18 == 0) goto L_0x0122
            int r18 = r8.mo25290a(r4)
            r19 = 1
            int r3 = r18 + 1
            r18 = r13
            long r12 = (long) r3
            r14[r6] = r12
            goto L_0x0136
        L_0x0122:
            r18 = r13
            r19 = 1
            r14[r6] = r16
            goto L_0x0136
        L_0x0129:
            r18 = r13
            r19 = 1
            int r3 = r8.mo25290a(r4)
            int r3 = r3 + 1
            long r12 = (long) r3
            r14[r6] = r12
        L_0x0136:
            int r6 = r6 + 1
            r13 = r18
            r3 = 3
            goto L_0x010a
        L_0x013c:
            r18 = r13
            goto L_0x0175
        L_0x013f:
            r18 = r13
            r19 = 1
            int r3 = r8.mo25290a(r4)
            int r3 = r3 + 1
            r6 = r3
            r3 = 0
        L_0x014b:
            if (r3 >= r11) goto L_0x0175
            int r12 = r11 - r3
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4820k.m14800a(r12)
            int r12 = r8.mo25290a(r12)
            r13 = r3
            r3 = 0
        L_0x0159:
            if (r3 >= r12) goto L_0x016b
            if (r13 >= r11) goto L_0x016b
            r19 = r11
            long r10 = (long) r6
            r14[r13] = r10
            int r13 = r13 + 1
            int r3 = r3 + 1
            r11 = r19
            r10 = 8
            goto L_0x0159
        L_0x016b:
            r19 = r11
            int r6 = r6 + 1
            r3 = r13
            r11 = r19
            r10 = 8
            goto L_0x014b
        L_0x0175:
            r19 = r11
            int r3 = r8.mo25290a(r5)
            r6 = 2
            if (r3 > r6) goto L_0x01c5
            r10 = 1
            if (r3 == r10) goto L_0x0183
            if (r3 != r6) goto L_0x01bd
        L_0x0183:
            r6 = 32
            r8.mo25292b(r6)
            r8.mo25292b(r6)
            int r6 = r8.mo25290a(r5)
            int r6 = r6 + r10
            r8.mo25292b(r10)
            if (r3 != r10) goto L_0x01ad
            if (r18 == 0) goto L_0x01b6
            r3 = r19
            long r10 = (long) r3
            r12 = r18
            long r12 = (long) r12
            double r10 = (double) r10
            double r12 = (double) r12
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r16 / r12
            double r10 = java.lang.Math.pow(r10, r12)
            double r10 = java.lang.Math.floor(r10)
            long r10 = (long) r10
            goto L_0x01b4
        L_0x01ad:
            r12 = r18
            r3 = r19
            int r11 = r3 * r12
            long r10 = (long) r11
        L_0x01b4:
            r16 = r10
        L_0x01b6:
            long r10 = (long) r6
            long r10 = r10 * r16
            int r3 = (int) r10
            r8.mo25292b(r3)
        L_0x01bd:
            int r1 = r1 + 1
            r3 = 3
            r6 = 0
            r10 = 8
            goto L_0x00e5
        L_0x01c5:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "lookup type greater than 2 not decodable: "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01dc:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expected code book to start with [0x56, 0x43, 0x42] at "
            r2.append(r3)
            int r3 = r8.f12589c
            r4 = 8
            int r3 = r3 * r4
            int r4 = r8.f12590d
            int r3 = r3 + r4
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01fb:
            r1 = 6
            int r3 = r8.mo25290a(r1)
            r6 = 1
            int r3 = r3 + r6
            r6 = 0
        L_0x0203:
            if (r6 >= r3) goto L_0x0216
            int r7 = r8.mo25290a(r13)
            if (r7 != 0) goto L_0x020e
            int r6 = r6 + 1
            goto L_0x0203
        L_0x020e:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "placeholder of time domain transforms not zeroed out"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0216:
            int r3 = r8.mo25290a(r1)
            r6 = 1
            int r3 = r3 + r6
            r7 = 0
        L_0x021d:
            if (r7 >= r3) goto L_0x02dc
            int r10 = r8.mo25290a(r13)
            if (r10 == 0) goto L_0x02ac
            if (r10 != r6) goto L_0x0295
            int r6 = r8.mo25290a(r4)
            r10 = -1
            int[] r12 = new int[r6]
            r14 = r10
            r10 = 0
        L_0x0230:
            if (r10 >= r6) goto L_0x0241
            int r16 = r8.mo25290a(r5)
            r12[r10] = r16
            r15 = r12[r10]
            if (r15 <= r14) goto L_0x023e
            r14 = r12[r10]
        L_0x023e:
            int r10 = r10 + 1
            goto L_0x0230
        L_0x0241:
            int r14 = r14 + 1
            int[] r10 = new int[r14]
            r15 = 0
        L_0x0246:
            if (r15 >= r14) goto L_0x0278
            r4 = 3
            int r18 = r8.mo25290a(r4)
            r4 = 1
            int r18 = r18 + 1
            r10[r15] = r18
            r11 = 2
            int r19 = r8.mo25290a(r11)
            r11 = 8
            if (r19 <= 0) goto L_0x025e
            r8.mo25292b(r11)
        L_0x025e:
            r1 = 0
        L_0x025f:
            int r13 = r4 << r19
            if (r1 >= r13) goto L_0x026d
            r8.mo25292b(r11)
            r4 = r15
            int r1 = r1 + 1
            r4 = 1
            r11 = 8
            goto L_0x025f
        L_0x026d:
            r4 = r15
            int r1 = r4 + 1
            r15 = r1
            r1 = 6
            r4 = 5
            r11 = 24
            r13 = 16
            goto L_0x0246
        L_0x0278:
            r1 = 2
            r8.mo25292b(r1)
            int r1 = r8.mo25290a(r5)
            r4 = 0
            r11 = 0
            r13 = 0
        L_0x0283:
            if (r4 >= r6) goto L_0x02d1
            r14 = r12[r4]
            r14 = r10[r14]
            int r11 = r11 + r14
        L_0x028a:
            if (r13 >= r11) goto L_0x0292
            r8.mo25292b(r1)
            int r13 = r13 + 1
            goto L_0x028a
        L_0x0292:
            int r4 = r4 + 1
            goto L_0x0283
        L_0x0295:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "floor type greater than 1 not decodable: "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02ac:
            r1 = 8
            r8.mo25292b(r1)
            r4 = 16
            r8.mo25292b(r4)
            r8.mo25292b(r4)
            r4 = 6
            r8.mo25292b(r4)
            r8.mo25292b(r1)
            int r4 = r8.mo25290a(r5)
            r6 = 1
            int r4 = r4 + r6
            r6 = 0
        L_0x02c7:
            if (r6 >= r4) goto L_0x02d1
            r8.mo25292b(r1)
            int r6 = r6 + 1
            r1 = 8
            goto L_0x02c7
        L_0x02d1:
            int r7 = r7 + 1
            r1 = 6
            r4 = 5
            r6 = 1
            r11 = 24
            r13 = 16
            goto L_0x021d
        L_0x02dc:
            int r3 = r8.mo25290a(r1)
            r4 = 1
            int r3 = r3 + r4
            r6 = 0
        L_0x02e3:
            if (r6 >= r3) goto L_0x034e
            r7 = 16
            int r10 = r8.mo25290a(r7)
            r7 = 2
            if (r10 > r7) goto L_0x0346
            r7 = 24
            r8.mo25292b(r7)
            r8.mo25292b(r7)
            r8.mo25292b(r7)
            int r10 = r8.mo25290a(r1)
            int r10 = r10 + r4
            r1 = 8
            r8.mo25292b(r1)
            int[] r4 = new int[r10]
            r11 = 0
        L_0x0306:
            if (r11 >= r10) goto L_0x0322
            r12 = 3
            int r13 = r8.mo25290a(r12)
            boolean r14 = r8.mo25291a()
            if (r14 == 0) goto L_0x0319
            r14 = 5
            int r15 = r8.mo25290a(r14)
            goto L_0x031b
        L_0x0319:
            r14 = 5
            r15 = 0
        L_0x031b:
            int r15 = r15 * r1
            int r15 = r15 + r13
            r4[r11] = r15
            int r11 = r11 + 1
            goto L_0x0306
        L_0x0322:
            r12 = 3
            r14 = 5
            r11 = 0
        L_0x0325:
            if (r11 >= r10) goto L_0x0341
            r13 = 0
        L_0x0328:
            if (r13 >= r1) goto L_0x033c
            r15 = r4[r11]
            r17 = 1
            int r18 = r17 << r13
            r15 = r15 & r18
            if (r15 == 0) goto L_0x0337
            r8.mo25292b(r1)
        L_0x0337:
            int r13 = r13 + 1
            r1 = 8
            goto L_0x0328
        L_0x033c:
            int r11 = r11 + 1
            r1 = 8
            goto L_0x0325
        L_0x0341:
            int r6 = r6 + 1
            r1 = 6
            r4 = 1
            goto L_0x02e3
        L_0x0346:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "residueType greater than 2 is not decodable"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x034e:
            int r3 = r8.mo25290a(r1)
            r1 = 1
            int r3 = r3 + r1
            r1 = 0
        L_0x0355:
            if (r1 >= r3) goto L_0x03dd
            r4 = 16
            int r6 = r8.mo25290a(r4)
            if (r6 == 0) goto L_0x0377
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "mapping type other than 0 not supported: "
            r4.append(r7)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "VorbisUtil"
            android.util.Log.e(r6, r4)
            r6 = 2
            goto L_0x03d2
        L_0x0377:
            boolean r4 = r8.mo25291a()
            if (r4 == 0) goto L_0x0386
            int r4 = r8.mo25290a(r5)
            r20 = 1
            int r4 = r4 + 1
            goto L_0x038a
        L_0x0386:
            r20 = 1
            r4 = r20
        L_0x038a:
            boolean r6 = r8.mo25291a()
            if (r6 == 0) goto L_0x03ae
            r6 = 8
            int r7 = r8.mo25290a(r6)
            int r7 = r7 + 1
            r6 = 0
        L_0x0399:
            if (r6 >= r7) goto L_0x03ae
            int r10 = r2 + -1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4820k.m14800a(r10)
            r8.mo25292b(r11)
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4820k.m14800a(r10)
            r8.mo25292b(r10)
            int r6 = r6 + 1
            goto L_0x0399
        L_0x03ae:
            r6 = 2
            int r7 = r8.mo25290a(r6)
            if (r7 != 0) goto L_0x03d5
            r7 = 1
            if (r4 <= r7) goto L_0x03c1
            r7 = 0
        L_0x03b9:
            if (r7 >= r2) goto L_0x03c1
            r8.mo25292b(r5)
            int r7 = r7 + 1
            goto L_0x03b9
        L_0x03c1:
            r7 = 0
        L_0x03c2:
            if (r7 >= r4) goto L_0x03d2
            r10 = 8
            r8.mo25292b(r10)
            r8.mo25292b(r10)
            r8.mo25292b(r10)
            int r7 = r7 + 1
            goto L_0x03c2
        L_0x03d2:
            int r1 = r1 + 1
            goto L_0x0355
        L_0x03d5:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "to reserved bits must be zero after mapping coupling steps"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03dd:
            r1 = 6
            int r1 = r8.mo25290a(r1)
            r2 = 1
            int r1 = r1 + r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$b[] r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4820k.C4822b[r1]
            r3 = 0
        L_0x03e7:
            if (r3 >= r1) goto L_0x0407
            boolean r2 = r8.mo25291a()
            r4 = 16
            int r5 = r8.mo25290a(r4)
            int r6 = r8.mo25290a(r4)
            r7 = 8
            int r11 = r8.mo25290a(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$b r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$b
            r12.<init>(r2, r5, r6, r11)
            r10[r3] = r12
            int r3 = r3 + 1
            goto L_0x03e7
        L_0x0407:
            boolean r2 = r8.mo25291a()
            if (r2 == 0) goto L_0x0456
            r2 = 1
            int r1 = r1 - r2
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4820k.m14800a(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r7 = r0.f12594q
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a r8 = r0.f12595r
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x041d:
            r0.f12591n = r4
            if (r4 != 0) goto L_0x0423
            r1 = 1
            return r1
        L_0x0423:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r1 = r0.f12591n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r1 = r1.f12596a
            byte[] r1 = r1.f12606f
            r10.add(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r1 = r0.f12591n
            byte[] r1 = r1.f12597b
            r10.add(r1)
            r2 = 0
            r4 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j$a r1 = r0.f12591n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c r1 = r1.f12596a
            int r5 = r1.f12603c
            r6 = -1
            int r7 = r1.f12601a
            long r8 = r1.f12602b
            int r8 = (int) r8
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = -1
            java.lang.String r3 = "audio/vorbis"
            com.fyber.inneractive.sdk.player.exoplayer2.i r1 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14975a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (java.util.List<byte[]>) r10, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r11, (int) r12, (java.lang.String) r13)
            r2 = r25
            r2.f12585a = r1
            r1 = 1
            return r1
        L_0x0456:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "framing bit after modes not set as expected"
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4818j.mo25282a(com.fyber.inneractive.sdk.player.exoplayer2.util.k, long, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h$a):boolean");
    }
}
