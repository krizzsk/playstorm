package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.google.android.exoplayer2.extractor.p194ts.TsExtractor;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b */
public final class C4787b {

    /* renamed from: a */
    public static final int f12383a = C5049u.m15386a("vide");

    /* renamed from: b */
    public static final int f12384b = C5049u.m15386a("soun");

    /* renamed from: c */
    public static final int f12385c = C5049u.m15386a("text");

    /* renamed from: d */
    public static final int f12386d = C5049u.m15386a("sbtl");

    /* renamed from: e */
    public static final int f12387e = C5049u.m15386a("subt");

    /* renamed from: f */
    public static final int f12388f = C5049u.m15386a("clcp");

    /* renamed from: g */
    public static final int f12389g = C5049u.m15386a("cenc");

    /* renamed from: h */
    public static final int f12390h = C5049u.m15386a("meta");

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$a */
    public interface C4788a {
        /* renamed from: a */
        int mo25263a();

        /* renamed from: b */
        int mo25264b();

        /* renamed from: c */
        boolean mo25265c();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b */
    public static final class C4789b {

        /* renamed from: a */
        public final C4801i[] f12391a;

        /* renamed from: b */
        public C4869i f12392b;

        /* renamed from: c */
        public int f12393c;

        /* renamed from: d */
        public int f12394d = 0;

        public C4789b(int i) {
            this.f12391a = new C4801i[i];
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$c */
    public static final class C4790c implements C4788a {

        /* renamed from: a */
        public final int f12395a;

        /* renamed from: b */
        public final int f12396b;

        /* renamed from: c */
        public final C5036k f12397c;

        public C4790c(C4784a.C4786b bVar) {
            C5036k kVar = bVar.f12382P0;
            this.f12397c = kVar;
            kVar.mo25600e(12);
            this.f12395a = kVar.mo25611o();
            this.f12396b = kVar.mo25611o();
        }

        /* renamed from: a */
        public int mo25263a() {
            return this.f12396b;
        }

        /* renamed from: b */
        public int mo25264b() {
            int i = this.f12395a;
            return i == 0 ? this.f12397c.mo25611o() : i;
        }

        /* renamed from: c */
        public boolean mo25265c() {
            return this.f12395a != 0;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$d */
    public static final class C4791d implements C4788a {

        /* renamed from: a */
        public final C5036k f12398a;

        /* renamed from: b */
        public final int f12399b;

        /* renamed from: c */
        public final int f12400c;

        /* renamed from: d */
        public int f12401d;

        /* renamed from: e */
        public int f12402e;

        public C4791d(C4784a.C4786b bVar) {
            C5036k kVar = bVar.f12382P0;
            this.f12398a = kVar;
            kVar.mo25600e(12);
            this.f12400c = kVar.mo25611o() & 255;
            this.f12399b = kVar.mo25611o();
        }

        /* renamed from: a */
        public int mo25263a() {
            return this.f12399b;
        }

        /* renamed from: b */
        public int mo25264b() {
            int i = this.f12400c;
            if (i == 8) {
                return this.f12398a.mo25608l();
            }
            if (i == 16) {
                return this.f12398a.mo25613q();
            }
            int i2 = this.f12401d;
            this.f12401d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f12402e & 15;
            }
            int l = this.f12398a.mo25608l();
            this.f12402e = l;
            return (l & 240) >> 4;
        }

        /* renamed from: c */
        public boolean mo25265c() {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        if (r8 == 0) goto L_0x008d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4800h m14706a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a r45, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b r46, long r47, com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a r49, boolean r50) throws com.fyber.inneractive.sdk.player.exoplayer2.C4873l {
        /*
            r0 = r45
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12296F
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r1 = r0.mo25261c(r1)
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12320T
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r2 = r1.mo25262d(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r2.f12382P0
            r3 = 16
            r2.mo25600e(r3)
            int r2 = r2.mo25595c()
            int r4 = f12384b
            r6 = 4
            r7 = -1
            if (r2 != r4) goto L_0x0021
            r12 = 1
            goto L_0x0041
        L_0x0021:
            int r4 = f12383a
            if (r2 != r4) goto L_0x0027
            r12 = 2
            goto L_0x0041
        L_0x0027:
            int r4 = f12385c
            if (r2 == r4) goto L_0x0040
            int r4 = f12386d
            if (r2 == r4) goto L_0x0040
            int r4 = f12387e
            if (r2 == r4) goto L_0x0040
            int r4 = f12388f
            if (r2 != r4) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            int r4 = f12390h
            if (r2 != r4) goto L_0x003e
            r12 = r6
            goto L_0x0041
        L_0x003e:
            r12 = r7
            goto L_0x0041
        L_0x0040:
            r12 = 3
        L_0x0041:
            r2 = 0
            if (r12 != r7) goto L_0x0045
            return r2
        L_0x0045:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12316P
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r4 = r0.mo25262d(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r4.f12382P0
            r10 = 8
            r4.mo25600e(r10)
            int r11 = r4.mo25595c()
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r11)
            if (r11 != 0) goto L_0x005e
            r13 = r10
            goto L_0x005f
        L_0x005e:
            r13 = r3
        L_0x005f:
            r4.mo25602f(r13)
            int r13 = r4.mo25595c()
            r4.mo25602f(r6)
            int r14 = r4.f13445b
            if (r11 != 0) goto L_0x006f
            r15 = r6
            goto L_0x0070
        L_0x006f:
            r15 = r10
        L_0x0070:
            r8 = 0
        L_0x0071:
            if (r8 >= r15) goto L_0x0080
            byte[] r9 = r4.f13444a
            int r19 = r14 + r8
            byte r9 = r9[r19]
            if (r9 == r7) goto L_0x007d
            r8 = 0
            goto L_0x0081
        L_0x007d:
            int r8 = r8 + 1
            goto L_0x0071
        L_0x0080:
            r8 = 1
        L_0x0081:
            r19 = 0
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto L_0x0090
            r4.mo25602f(r15)
        L_0x008d:
            r8 = r21
            goto L_0x00a0
        L_0x0090:
            if (r11 != 0) goto L_0x0097
            long r8 = r4.mo25609m()
            goto L_0x009b
        L_0x0097:
            long r8 = r4.mo25612p()
        L_0x009b:
            int r11 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r11 != 0) goto L_0x00a0
            goto L_0x008d
        L_0x00a0:
            r4.mo25602f(r3)
            int r11 = r4.mo25595c()
            int r14 = r4.mo25595c()
            r4.mo25602f(r6)
            int r15 = r4.mo25595c()
            int r4 = r4.mo25595c()
            r6 = 65536(0x10000, float:9.18355E-41)
            r3 = -65536(0xffffffffffff0000, float:NaN)
            if (r11 != 0) goto L_0x00c5
            if (r14 != r6) goto L_0x00c5
            if (r15 != r3) goto L_0x00c5
            if (r4 != 0) goto L_0x00c5
            r3 = 90
            goto L_0x00dc
        L_0x00c5:
            if (r11 != 0) goto L_0x00d0
            if (r14 != r3) goto L_0x00d0
            if (r15 != r6) goto L_0x00d0
            if (r4 != 0) goto L_0x00d0
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x00dc
        L_0x00d0:
            if (r11 != r3) goto L_0x00db
            if (r14 != 0) goto L_0x00db
            if (r15 != 0) goto L_0x00db
            if (r4 != r3) goto L_0x00db
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x00dc
        L_0x00db:
            r3 = 0
        L_0x00dc:
            int r4 = (r47 > r21 ? 1 : (r47 == r21 ? 0 : -1))
            if (r4 != 0) goto L_0x00e5
            r4 = r46
            r25 = r8
            goto L_0x00e9
        L_0x00e5:
            r4 = r46
            r25 = r47
        L_0x00e9:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r4.f12382P0
            r4.mo25600e(r10)
            int r6 = r4.mo25595c()
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r6)
            if (r6 != 0) goto L_0x00fa
            r6 = r10
            goto L_0x00fc
        L_0x00fa:
            r6 = 16
        L_0x00fc:
            r4.mo25602f(r6)
            long r8 = r4.mo25609m()
            int r4 = (r25 > r21 ? 1 : (r25 == r21 ? 0 : -1))
            if (r4 != 0) goto L_0x0108
            goto L_0x0113
        L_0x0108:
            r27 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r8
            long r14 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r25, (long) r27, (long) r29)
            r21 = r14
        L_0x0113:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12298G
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r4 = r1.mo25261c(r4)
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12300H
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r4 = r4.mo25261c(r6)
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12319S
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r1 = r1.mo25262d(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r1.f12382P0
            r1.mo25600e(r10)
            int r6 = r1.mo25595c()
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r6)
            if (r6 != 0) goto L_0x0136
            r11 = r10
            goto L_0x0138
        L_0x0136:
            r11 = 16
        L_0x0138:
            r1.mo25602f(r11)
            long r14 = r1.mo25609m()
            if (r6 != 0) goto L_0x0143
            r6 = 4
            goto L_0x0144
        L_0x0143:
            r6 = r10
        L_0x0144:
            r1.mo25602f(r6)
            int r1 = r1.mo25613q()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = ""
            r6.append(r11)
            int r11 = r1 >> 10
            r11 = r11 & 31
            int r11 = r11 + 96
            char r11 = (char) r11
            r6.append(r11)
            int r11 = r1 >> 5
            r11 = r11 & 31
            int r11 = r11 + 96
            char r11 = (char) r11
            r6.append(r11)
            r1 = r1 & 31
            int r1 = r1 + 96
            char r1 = (char) r1
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            java.lang.Long r6 = java.lang.Long.valueOf(r14)
            android.util.Pair r1 = android.util.Pair.create(r6, r1)
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12321U
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r4 = r4.mo25262d(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r4.f12382P0
            java.lang.Object r6 = r1.second
            java.lang.String r6 = (java.lang.String) r6
            r11 = 12
            r4.mo25600e(r11)
            int r11 = r4.mo25595c()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b r14 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.b$b
            r14.<init>(r11)
            r15 = 0
        L_0x0198:
            if (r15 >= r11) goto L_0x0707
            int r5 = r4.f13445b
            int r10 = r4.mo25595c()
            if (r10 <= 0) goto L_0x01a4
            r2 = 1
            goto L_0x01a5
        L_0x01a4:
            r2 = 0
        L_0x01a5:
            java.lang.String r7 = "childAtomSize should be positive"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15303a(r2, r7)
            int r2 = r4.mo25595c()
            r46 = r11
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12330c
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12332d
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12327a0
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12349l0
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12334e
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12336f
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12338g
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12307K0
            if (r2 == r11) goto L_0x055b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12309L0
            if (r2 != r11) goto L_0x01d6
            goto L_0x055b
        L_0x01d6:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12344j
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12329b0
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12354o
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12358q
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12362s
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12368v
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12364t
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12366u
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12375y0
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12377z0
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12350m
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12352n
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12346k
            if (r2 == r11) goto L_0x02c1
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12315O0
            if (r2 != r11) goto L_0x0210
            goto L_0x02c1
        L_0x0210:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12347k0
            if (r2 == r7) goto L_0x0243
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12367u0
            if (r2 == r11) goto L_0x0243
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12369v0
            if (r2 == r11) goto L_0x0243
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12371w0
            if (r2 == r11) goto L_0x0243
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12373x0
            if (r2 != r11) goto L_0x0225
            goto L_0x0243
        L_0x0225:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12313N0
            if (r2 != r7) goto L_0x023d
            java.lang.String r2 = java.lang.Integer.toString(r13)
            java.lang.String r7 = "application/x-camera-motion"
            r11 = r49
            r47 = r8
            r8 = -1
            r9 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14978a(r2, r7, r9, r8, r11)
            r14.f12392b = r2
            goto L_0x0303
        L_0x023d:
            r11 = r49
            r47 = r8
            goto L_0x0303
        L_0x0243:
            r11 = r49
            r47 = r8
            int r8 = r5 + 8
            r9 = 8
            int r8 = r8 + r9
            r4.mo25600e(r8)
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r8 = "application/ttml+xml"
            if (r2 != r7) goto L_0x025f
            r33 = r25
            r35 = 0
            r26 = r8
            goto L_0x02a4
        L_0x025f:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12367u0
            if (r2 != r7) goto L_0x0282
            int r2 = r10 + -8
            int r2 = r2 - r9
            byte[] r7 = new byte[r2]
            byte[] r8 = r4.f13444a
            int r9 = r4.f13445b
            r11 = 0
            java.lang.System.arraycopy(r8, r9, r7, r11, r2)
            int r8 = r4.f13445b
            int r8 = r8 + r2
            r4.f13445b = r8
            java.util.List r2 = java.util.Collections.singletonList(r7)
            java.lang.String r7 = "application/x-quicktime-tx3g"
            r35 = r2
            r33 = r25
            r26 = r7
            goto L_0x02a4
        L_0x0282:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12369v0
            if (r2 != r7) goto L_0x028f
            java.lang.String r2 = "application/x-mp4-vtt"
        L_0x0288:
            r33 = r25
            r35 = 0
            r26 = r2
            goto L_0x02a4
        L_0x028f:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12371w0
            if (r2 != r7) goto L_0x029a
            r26 = r8
            r33 = r19
            r35 = 0
            goto L_0x02a4
        L_0x029a:
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12373x0
            if (r2 != r7) goto L_0x02bb
            r2 = 1
            r14.f12394d = r2
            java.lang.String r2 = "application/x-mp4-cea-608"
            goto L_0x0288
        L_0x02a4:
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = 0
            r28 = -1
            r29 = 0
            r31 = -1
            r30 = r6
            r32 = r49
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14976a(r25, r26, r27, r28, r29, r30, r31, r32, r33, r35)
            r14.f12392b = r2
            goto L_0x0303
        L_0x02bb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02c1:
            r47 = r8
            int r8 = r5 + 8
            r9 = 8
            int r8 = r8 + r9
            r4.mo25600e(r8)
            r8 = 6
            if (r50 == 0) goto L_0x02d6
            int r11 = r4.mo25613q()
            r4.mo25602f(r8)
            goto L_0x02da
        L_0x02d6:
            r4.mo25602f(r9)
            r11 = 0
        L_0x02da:
            if (r11 == 0) goto L_0x030e
            r9 = 1
            if (r11 != r9) goto L_0x02e0
            goto L_0x030e
        L_0x02e0:
            r9 = 2
            if (r11 != r9) goto L_0x0303
            r9 = 16
            r4.mo25602f(r9)
            long r25 = r4.mo25605i()
            double r25 = java.lang.Double.longBitsToDouble(r25)
            long r8 = java.lang.Math.round(r25)
            int r8 = (int) r8
            int r9 = r4.mo25611o()
            r11 = 20
            r4.mo25602f(r11)
            r41 = r1
            r40 = r12
            goto L_0x0343
        L_0x0303:
            r41 = r1
            r42 = r3
            r9 = r10
            r40 = r12
            r8 = r15
        L_0x030b:
            r1 = 3
            goto L_0x06ef
        L_0x030e:
            int r9 = r4.mo25613q()
            r8 = 6
            r4.mo25602f(r8)
            byte[] r8 = r4.f13444a
            r25 = r9
            int r9 = r4.f13445b
            r40 = r12
            int r12 = r9 + 1
            r4.f13445b = r12
            byte r9 = r8[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r26 = 8
            int r9 = r9 << 8
            r41 = r1
            int r1 = r12 + 1
            r4.f13445b = r1
            byte r8 = r8[r12]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            r9 = 2
            int r1 = r1 + r9
            r4.f13445b = r1
            r1 = 1
            if (r11 != r1) goto L_0x0341
            r1 = 16
            r4.mo25602f(r1)
        L_0x0341:
            r9 = r25
        L_0x0343:
            int r1 = r4.f13445b
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12329b0
            if (r2 != r11) goto L_0x0350
            int r2 = m14704a((com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k) r4, (int) r5, (int) r10, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4787b.C4789b) r14, (int) r15)
            r4.mo25600e(r1)
        L_0x0350:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12354o
            java.lang.String r12 = "audio/raw"
            if (r2 != r11) goto L_0x0359
            java.lang.String r2 = "audio/ac3"
            goto L_0x03a2
        L_0x0359:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12358q
            if (r2 != r11) goto L_0x0360
            java.lang.String r2 = "audio/eac3"
            goto L_0x03a2
        L_0x0360:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12362s
            if (r2 != r11) goto L_0x0367
            java.lang.String r2 = "audio/vnd.dts"
            goto L_0x03a2
        L_0x0367:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12364t
            if (r2 == r11) goto L_0x03a0
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12366u
            if (r2 != r11) goto L_0x0370
            goto L_0x03a0
        L_0x0370:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12368v
            if (r2 != r11) goto L_0x0377
            java.lang.String r2 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03a2
        L_0x0377:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12375y0
            if (r2 != r11) goto L_0x037e
            java.lang.String r2 = "audio/3gpp"
            goto L_0x03a2
        L_0x037e:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12377z0
            if (r2 != r11) goto L_0x0385
            java.lang.String r2 = "audio/amr-wb"
            goto L_0x03a2
        L_0x0385:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12350m
            if (r2 == r11) goto L_0x039e
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12352n
            if (r2 != r11) goto L_0x038e
            goto L_0x039e
        L_0x038e:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12346k
            if (r2 != r11) goto L_0x0395
            java.lang.String r2 = "audio/mpeg"
            goto L_0x03a2
        L_0x0395:
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12315O0
            if (r2 != r11) goto L_0x039c
            java.lang.String r2 = "audio/alac"
            goto L_0x03a2
        L_0x039c:
            r2 = 0
            goto L_0x03a2
        L_0x039e:
            r2 = r12
            goto L_0x03a2
        L_0x03a0:
            java.lang.String r2 = "audio/vnd.dts.hd"
        L_0x03a2:
            r11 = r8
            r8 = r1
            r1 = r9
            r9 = 0
        L_0x03a6:
            int r0 = r8 - r5
            if (r0 >= r10) goto L_0x0516
            r4.mo25600e(r8)
            int r0 = r4.mo25595c()
            r42 = r3
            if (r0 <= 0) goto L_0x03b7
            r3 = 1
            goto L_0x03b8
        L_0x03b7:
            r3 = 0
        L_0x03b8:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15303a(r3, r7)
            int r3 = r4.mo25595c()
            r43 = r10
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12306K
            r44 = r15
            if (r3 == r10) goto L_0x04ae
            if (r50 == 0) goto L_0x03cf
            int r15 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12348l
            if (r3 != r15) goto L_0x03cf
            goto L_0x04ae
        L_0x03cf:
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12356p
            if (r3 != r10) goto L_0x041d
            int r3 = r8 + 8
            r4.mo25600e(r3)
            java.lang.String r25 = java.lang.Integer.toString(r13)
            int r3 = r4.mo25608l()
            r3 = r3 & 192(0xc0, float:2.69E-43)
            r10 = 6
            int r3 = r3 >> r10
            int[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C4678a.f11699b
            r31 = r10[r3]
            int r3 = r4.mo25608l()
            int[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C4678a.f11701d
            r15 = r3 & 56
            r16 = 3
            int r15 = r15 >> 3
            r10 = r10[r15]
            r15 = 4
            r3 = r3 & r15
            if (r3 == 0) goto L_0x03fc
            int r10 = r10 + 1
        L_0x03fc:
            r30 = r10
            r27 = 0
            r28 = -1
            r29 = -1
            r32 = -1
            r33 = 0
            r35 = 0
            java.lang.String r26 = "audio/ac3"
            r34 = r49
            r36 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14975a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (int) r32, (java.util.List<byte[]>) r33, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r34, (int) r35, (java.lang.String) r36)
            r14.f12392b = r3
            r25 = r7
            r7 = -1
            r23 = 6
            goto L_0x050b
        L_0x041d:
            r15 = 4
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12360r
            if (r3 != r10) goto L_0x046c
            int r3 = r8 + 8
            r4.mo25600e(r3)
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r3 = 2
            r4.mo25602f(r3)
            int r3 = r4.mo25608l()
            r3 = r3 & 192(0xc0, float:2.69E-43)
            r23 = 6
            int r3 = r3 >> 6
            int[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C4678a.f11699b
            r31 = r10[r3]
            int r3 = r4.mo25608l()
            int[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.audio.C4678a.f11701d
            r26 = r3 & 14
            r18 = 1
            int r26 = r26 >> 1
            r10 = r10[r26]
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0451
            int r10 = r10 + 1
        L_0x0451:
            r30 = r10
            r27 = 0
            r28 = -1
            r29 = -1
            r32 = -1
            r33 = 0
            r35 = 0
            java.lang.String r26 = "audio/eac3"
            r34 = r49
            r36 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14975a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (int) r32, (java.util.List<byte[]>) r33, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r34, (int) r35, (java.lang.String) r36)
            r14.f12392b = r3
            goto L_0x04aa
        L_0x046c:
            r23 = 6
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12370w
            if (r3 != r10) goto L_0x0493
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = 0
            r28 = -1
            r29 = -1
            r32 = -1
            r33 = 0
            r35 = 0
            r26 = r2
            r30 = r1
            r31 = r11
            r34 = r49
            r36 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14975a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (int) r32, (java.util.List<byte[]>) r33, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r34, (int) r35, (java.lang.String) r36)
            r14.f12392b = r3
            goto L_0x04aa
        L_0x0493:
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12315O0
            if (r3 != r10) goto L_0x04aa
            byte[] r3 = new byte[r0]
            r4.mo25600e(r8)
            byte[] r9 = r4.f13444a
            int r10 = r4.f13445b
            r15 = 0
            java.lang.System.arraycopy(r9, r10, r3, r15, r0)
            int r9 = r4.f13445b
            int r9 = r9 + r0
            r4.f13445b = r9
            r9 = r3
        L_0x04aa:
            r25 = r7
            r7 = -1
            goto L_0x050b
        L_0x04ae:
            r15 = 0
            r23 = 6
            if (r3 != r10) goto L_0x04b8
            r25 = r7
            r3 = r8
        L_0x04b6:
            r7 = -1
            goto L_0x04df
        L_0x04b8:
            int r3 = r4.f13445b
        L_0x04ba:
            int r10 = r3 - r8
            if (r10 >= r0) goto L_0x04db
            r4.mo25600e(r3)
            int r10 = r4.mo25595c()
            if (r10 <= 0) goto L_0x04c8
            r15 = 1
        L_0x04c8:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15303a(r15, r7)
            int r15 = r4.mo25595c()
            r25 = r7
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12306K
            if (r15 != r7) goto L_0x04d6
            goto L_0x04b6
        L_0x04d6:
            int r3 = r3 + r10
            r7 = r25
            r15 = 0
            goto L_0x04ba
        L_0x04db:
            r25 = r7
            r3 = -1
            goto L_0x04b6
        L_0x04df:
            if (r3 == r7) goto L_0x050b
            android.util.Pair r2 = m14705a(r4, r3)
            java.lang.Object r3 = r2.first
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.second
            byte[] r2 = (byte[]) r2
            java.lang.String r9 = "audio/mp4a-latm"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x0509
            android.util.Pair r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5026c.m15309a((byte[]) r2)
            java.lang.Object r9 = r1.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r11 = r9.intValue()
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L_0x0509:
            r9 = r2
            r2 = r3
        L_0x050b:
            int r8 = r8 + r0
            r7 = r25
            r3 = r42
            r10 = r43
            r15 = r44
            goto L_0x03a6
        L_0x0516:
            r42 = r3
            r43 = r10
            r44 = r15
            r7 = -1
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r14.f12392b
            if (r0 != 0) goto L_0x0555
            if (r2 == 0) goto L_0x0555
            boolean r0 = r12.equals(r2)
            if (r0 == 0) goto L_0x052c
            r32 = 2
            goto L_0x052e
        L_0x052c:
            r32 = r7
        L_0x052e:
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = 0
            r28 = -1
            r29 = -1
            if (r9 != 0) goto L_0x053d
            r33 = 0
            goto L_0x0543
        L_0x053d:
            java.util.List r0 = java.util.Collections.singletonList(r9)
            r33 = r0
        L_0x0543:
            r35 = 0
            r26 = r2
            r30 = r1
            r31 = r11
            r34 = r49
            r36 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14975a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (int) r32, (java.util.List<byte[]>) r33, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r34, (int) r35, (java.lang.String) r36)
            r14.f12392b = r0
        L_0x0555:
            r9 = r43
            r8 = r44
            goto L_0x030b
        L_0x055b:
            r41 = r1
            r42 = r3
            r25 = r7
            r47 = r8
            r43 = r10
            r40 = r12
            r44 = r15
            r7 = -1
            int r0 = r5 + 8
            r1 = 8
            int r0 = r0 + r1
            r4.mo25600e(r0)
            r0 = 16
            r4.mo25602f(r0)
            int r30 = r4.mo25613q()
            int r31 = r4.mo25613q()
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 50
            r4.mo25602f(r3)
            int r3 = r4.f13445b
            int r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12327a0
            r9 = r43
            if (r2 != r8) goto L_0x0598
            r8 = r44
            int r2 = m14704a((com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k) r4, (int) r5, (int) r9, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4787b.C4789b) r14, (int) r8)
            r4.mo25600e(r3)
            goto L_0x059a
        L_0x0598:
            r8 = r44
        L_0x059a:
            r35 = r1
            r37 = r7
            r1 = 0
            r26 = 0
            r33 = 0
            r36 = 0
        L_0x05a5:
            int r10 = r3 - r5
            if (r10 >= r9) goto L_0x06d3
            r4.mo25600e(r3)
            int r10 = r4.f13445b
            int r11 = r4.mo25595c()
            if (r11 != 0) goto L_0x05bb
            int r12 = r4.f13445b
            int r12 = r12 - r5
            if (r12 != r9) goto L_0x05bb
            goto L_0x06d3
        L_0x05bb:
            r15 = r25
            if (r11 <= 0) goto L_0x05c1
            r12 = 1
            goto L_0x05c2
        L_0x05c1:
            r12 = 0
        L_0x05c2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15303a(r12, r15)
            int r12 = r4.mo25595c()
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12302I
            if (r12 != r0) goto L_0x05ed
            if (r26 != 0) goto L_0x05d1
            r0 = 1
            goto L_0x05d2
        L_0x05d1:
            r0 = 0
        L_0x05d2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)
            int r10 = r10 + 8
            r4.mo25600e(r10)
            com.fyber.inneractive.sdk.player.exoplayer2.video.a r0 = com.fyber.inneractive.sdk.player.exoplayer2.video.C5060a.m15428b(r4)
            java.util.List<byte[]> r10 = r0.f13532a
            int r12 = r0.f13533b
            r14.f12393c = r12
            if (r1 != 0) goto L_0x05ea
            float r0 = r0.f13536e
            r35 = r0
        L_0x05ea:
            java.lang.String r26 = "video/avc"
            goto L_0x060a
        L_0x05ed:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12304J
            if (r12 != r0) goto L_0x0611
            if (r26 != 0) goto L_0x05f5
            r0 = 1
            goto L_0x05f6
        L_0x05f5:
            r0 = 0
        L_0x05f6:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)
            int r10 = r10 + 8
            r4.mo25600e(r10)
            com.fyber.inneractive.sdk.player.exoplayer2.video.c r0 = com.fyber.inneractive.sdk.player.exoplayer2.video.C5063c.m15429a(r4)
            java.util.List<byte[]> r10 = r0.f13542a
            int r0 = r0.f13543b
            r14.f12393c = r0
            java.lang.String r26 = "video/hevc"
        L_0x060a:
            r23 = r1
            r33 = r10
        L_0x060e:
            r1 = 3
            goto L_0x06c9
        L_0x0611:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12311M0
            if (r12 != r0) goto L_0x0627
            if (r26 != 0) goto L_0x0619
            r0 = 1
            goto L_0x061a
        L_0x0619:
            r0 = 0
        L_0x061a:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12307K0
            if (r2 != r0) goto L_0x0624
            java.lang.String r26 = "video/x-vnd.on2.vp8"
            goto L_0x0635
        L_0x0624:
            java.lang.String r26 = "video/x-vnd.on2.vp9"
            goto L_0x0635
        L_0x0627:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12340h
            if (r12 != r0) goto L_0x0638
            if (r26 != 0) goto L_0x062f
            r0 = 1
            goto L_0x0630
        L_0x062f:
            r0 = 0
        L_0x0630:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)
            java.lang.String r26 = "video/3gpp"
        L_0x0635:
            r23 = r1
            goto L_0x060e
        L_0x0638:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12306K
            if (r12 != r0) goto L_0x0655
            if (r26 != 0) goto L_0x0640
            r0 = 1
            goto L_0x0641
        L_0x0640:
            r0 = 0
        L_0x0641:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r0)
            android.util.Pair r0 = m14705a(r4, r10)
            java.lang.Object r10 = r0.first
            r26 = r10
            java.lang.String r26 = (java.lang.String) r26
            java.lang.Object r0 = r0.second
            java.util.List r33 = java.util.Collections.singletonList(r0)
            goto L_0x0635
        L_0x0655:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12345j0
            if (r12 != r0) goto L_0x066e
            int r10 = r10 + 8
            r4.mo25600e(r10)
            int r0 = r4.mo25611o()
            int r1 = r4.mo25611o()
            float r0 = (float) r0
            float r1 = (float) r1
            float r35 = r0 / r1
            r1 = 3
            r23 = 1
            goto L_0x06c9
        L_0x066e:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12303I0
            if (r12 != r0) goto L_0x069f
            int r0 = r10 + 8
        L_0x0674:
            int r12 = r0 - r10
            if (r12 >= r11) goto L_0x0699
            r4.mo25600e(r0)
            int r12 = r4.mo25595c()
            int r7 = r4.mo25595c()
            r23 = r1
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12305J0
            if (r7 != r1) goto L_0x0694
            byte[] r1 = r4.f13444a
            int r12 = r12 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r0, r12)
            r36 = r0
            goto L_0x060e
        L_0x0694:
            int r0 = r0 + r12
            r1 = r23
            r7 = -1
            goto L_0x0674
        L_0x0699:
            r23 = r1
            r1 = 3
            r36 = 0
            goto L_0x06c9
        L_0x069f:
            r23 = r1
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12301H0
            if (r12 != r0) goto L_0x060e
            int r0 = r4.mo25608l()
            r1 = 3
            r4.mo25602f(r1)
            if (r0 != 0) goto L_0x06c9
            int r0 = r4.mo25608l()
            if (r0 == 0) goto L_0x06c7
            r7 = 1
            if (r0 == r7) goto L_0x06c4
            r7 = 2
            if (r0 == r7) goto L_0x06c1
            if (r0 == r1) goto L_0x06be
            goto L_0x06c9
        L_0x06be:
            r37 = r1
            goto L_0x06c9
        L_0x06c1:
            r37 = 2
            goto L_0x06c9
        L_0x06c4:
            r37 = 1
            goto L_0x06c9
        L_0x06c7:
            r37 = 0
        L_0x06c9:
            int r3 = r3 + r11
            r25 = r15
            r1 = r23
            r0 = 16
            r7 = -1
            goto L_0x05a5
        L_0x06d3:
            r1 = 3
            if (r26 != 0) goto L_0x06d7
            goto L_0x06ef
        L_0x06d7:
            java.lang.String r25 = java.lang.Integer.toString(r13)
            r27 = 0
            r28 = -1
            r29 = -1
            r32 = -1082130432(0xffffffffbf800000, float:-1.0)
            r38 = 0
            r34 = r42
            r39 = r49
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14973a((java.lang.String) r25, (java.lang.String) r26, (java.lang.String) r27, (int) r28, (int) r29, (int) r30, (int) r31, (float) r32, (java.util.List<byte[]>) r33, (int) r34, (float) r35, (byte[]) r36, (int) r37, (com.fyber.inneractive.sdk.player.exoplayer2.video.C5061b) r38, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r39)
            r14.f12392b = r0
        L_0x06ef:
            int r5 = r5 + r9
            r4.mo25600e(r5)
            int r15 = r8 + 1
            r0 = r45
            r11 = r46
            r8 = r47
            r12 = r40
            r1 = r41
            r3 = r42
            r2 = 0
            r7 = -1
            r10 = 8
            goto L_0x0198
        L_0x0707:
            r41 = r1
            r47 = r8
            r40 = r12
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12317Q
            r1 = r45
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r0 = r1.mo25261c(r0)
            if (r0 == 0) goto L_0x0788
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12318R
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r0.mo25262d(r1)
            if (r0 != 0) goto L_0x0720
            goto L_0x0788
        L_0x0720:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12382P0
            r1 = 8
            r0.mo25600e(r1)
            int r1 = r0.mo25595c()
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r1)
            int r2 = r0.mo25611o()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r5 = 0
        L_0x0738:
            if (r5 >= r2) goto L_0x0781
            r6 = 1
            if (r1 != r6) goto L_0x0742
            long r7 = r0.mo25612p()
            goto L_0x0746
        L_0x0742:
            long r7 = r0.mo25609m()
        L_0x0746:
            r3[r5] = r7
            if (r1 != r6) goto L_0x074f
            long r6 = r0.mo25605i()
            goto L_0x0754
        L_0x074f:
            int r6 = r0.mo25595c()
            long r6 = (long) r6
        L_0x0754:
            r4[r5] = r6
            byte[] r6 = r0.f13444a
            int r7 = r0.f13445b
            int r8 = r7 + 1
            r0.f13445b = r8
            byte r7 = r6[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r9 = 8
            int r7 = r7 << r9
            int r10 = r8 + 1
            r0.f13445b = r10
            byte r6 = r6[r8]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r6 | r7
            short r6 = (short) r6
            r7 = 1
            if (r6 != r7) goto L_0x0779
            r6 = 2
            r0.mo25602f(r6)
            int r5 = r5 + 1
            goto L_0x0738
        L_0x0779:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x0781:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x078d
        L_0x0788:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x078d:
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = r14.f12392b
            if (r2 != 0) goto L_0x0793
            r2 = r0
            goto L_0x07c7
        L_0x0793:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h
            r0 = r41
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r14.f12392b
            int r5 = r14.f12394d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r6 = r14.f12391a
            int r7 = r14.f12393c
            java.lang.Object r8 = r1.first
            r23 = r8
            long[] r23 = (long[]) r23
            java.lang.Object r1 = r1.second
            r24 = r1
            long[] r24 = (long[]) r24
            r10 = r2
            r11 = r13
            r12 = r40
            r13 = r3
            r15 = r47
            r17 = r21
            r19 = r0
            r20 = r5
            r21 = r6
            r22 = r7
            r10.<init>(r11, r12, r13, r15, r17, r19, r20, r21, r22, r23, r24)
        L_0x07c7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4787b.m14706a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b, long, com.fyber.inneractive.sdk.player.exoplayer2.drm.a, boolean):com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h");
    }

    /* renamed from: a */
    public static int m14704a(C5036k kVar, int i, int i2, C4789b bVar, int i3) {
        C5036k kVar2 = kVar;
        int i4 = kVar2.f13445b;
        while (true) {
            boolean z = false;
            if (i4 - i >= i2) {
                return 0;
            }
            kVar2.mo25600e(i4);
            int c = kVar.mo25595c();
            boolean z2 = true;
            C5023a.m15303a(c > 0, "childAtomSize should be positive");
            if (kVar.mo25595c() == C4784a.f12323W) {
                int i5 = i4 + 8;
                Pair pair = null;
                boolean z3 = false;
                Integer num = null;
                C4801i iVar = null;
                while (i5 - i4 < c) {
                    kVar2.mo25600e(i5);
                    int c2 = kVar.mo25595c();
                    int c3 = kVar.mo25595c();
                    if (c3 == C4784a.f12331c0) {
                        num = Integer.valueOf(kVar.mo25595c());
                    } else if (c3 == C4784a.f12324X) {
                        kVar2.mo25602f(4);
                        z3 = kVar.mo25595c() == f12389g ? z2 : false;
                    } else if (c3 == C4784a.f12325Y) {
                        int i6 = i5 + 8;
                        while (true) {
                            if (i6 - i5 >= c2) {
                                iVar = null;
                                break;
                            }
                            kVar2.mo25600e(i6);
                            int c4 = kVar.mo25595c();
                            if (kVar.mo25595c() == C4784a.f12326Z) {
                                kVar2.mo25602f(6);
                                boolean z4 = kVar.mo25608l() == z2 ? z2 : false;
                                int l = kVar.mo25608l();
                                byte[] bArr = new byte[16];
                                System.arraycopy(kVar2.f13444a, kVar2.f13445b, bArr, 0, 16);
                                kVar2.f13445b += 16;
                                iVar = new C4801i(z4, l, bArr);
                            } else {
                                i6 += c4;
                                z2 = true;
                            }
                        }
                    }
                    i5 += c2;
                    z2 = true;
                }
                if (z3) {
                    C5023a.m15303a(num != null, "frma atom is mandatory");
                    if (iVar != null) {
                        z = true;
                    }
                    C5023a.m15303a(z, "schi->tenc atom is mandatory");
                    pair = Pair.create(num, iVar);
                }
                if (pair != null) {
                    bVar.f12391a[i3] = (C4801i) pair.second;
                    return ((Integer) pair.first).intValue();
                }
            }
            C4789b bVar2 = bVar;
            i4 += c;
        }
    }

    /* renamed from: a */
    public static Pair<String, byte[]> m14705a(C5036k kVar, int i) {
        kVar.mo25600e(i + 8 + 4);
        kVar.mo25602f(1);
        m14703a(kVar);
        kVar.mo25602f(2);
        int l = kVar.mo25608l();
        if ((l & 128) != 0) {
            kVar.mo25602f(2);
        }
        if ((l & 64) != 0) {
            kVar.mo25602f(kVar.mo25613q());
        }
        if ((l & 32) != 0) {
            kVar.mo25602f(2);
        }
        kVar.mo25602f(1);
        m14703a(kVar);
        int l2 = kVar.mo25608l();
        String str = null;
        if (l2 == 32) {
            str = "video/mp4v-es";
        } else if (l2 == 33) {
            str = "video/avc";
        } else if (l2 != 35) {
            if (l2 != 64) {
                if (l2 == 107) {
                    return Pair.create("audio/mpeg", (Object) null);
                }
                if (l2 == 165) {
                    str = "audio/ac3";
                } else if (l2 != 166) {
                    switch (l2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (l2) {
                                case 169:
                                case TsExtractor.TS_STREAM_TYPE_AC4 /*172*/:
                                    return Pair.create("audio/vnd.dts", (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create("audio/vnd.dts.hd", (Object) null);
                            }
                    }
                } else {
                    str = "audio/eac3";
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        kVar.mo25602f(12);
        kVar.mo25602f(1);
        int a = m14703a(kVar);
        byte[] bArr = new byte[a];
        System.arraycopy(kVar.f13444a, kVar.f13445b, bArr, 0, a);
        kVar.f13445b += a;
        return Pair.create(str, bArr);
    }

    /* renamed from: a */
    public static int m14703a(C5036k kVar) {
        int l = kVar.mo25608l();
        int i = l & 127;
        while ((l & 128) == 128) {
            l = kVar.mo25608l();
            i = (i << 7) | (l & 127);
        }
        return i;
    }
}
