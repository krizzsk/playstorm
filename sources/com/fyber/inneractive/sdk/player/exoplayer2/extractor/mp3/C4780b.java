package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4763j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4765k;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4886a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4901g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b */
public final class C4780b implements C4723f {

    /* renamed from: m */
    public static final int f12262m = C5049u.m15386a("Xing");

    /* renamed from: n */
    public static final int f12263n = C5049u.m15386a("Info");

    /* renamed from: o */
    public static final int f12264o = C5049u.m15386a("VBRI");

    /* renamed from: a */
    public final long f12265a;

    /* renamed from: b */
    public final C5036k f12266b = new C5036k(10);

    /* renamed from: c */
    public final C4765k f12267c = new C4765k();

    /* renamed from: d */
    public final C4763j f12268d = new C4763j();

    /* renamed from: e */
    public C4731h f12269e;

    /* renamed from: f */
    public C4804n f12270f;

    /* renamed from: g */
    public int f12271g;

    /* renamed from: h */
    public C4886a f12272h;

    /* renamed from: i */
    public C4781a f12273i;

    /* renamed from: j */
    public long f12274j = -9223372036854775807L;

    /* renamed from: k */
    public long f12275k;

    /* renamed from: l */
    public int f12276l;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a */
    public interface C4781a extends C4767m {
        /* renamed from: b */
        long mo25257b(long j);
    }

    public C4780b(int i, long j) {
        this.f12265a = j;
    }

    /* renamed from: a */
    public static boolean m14682a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        return mo25258a(gVar, true);
    }

    /* renamed from: b */
    public final C4781a mo25259b(C4730g gVar) throws IOException, InterruptedException {
        C4715b bVar = (C4715b) gVar;
        bVar.mo25136a(this.f12266b.f13444a, 0, 4, false);
        this.f12266b.mo25600e(0);
        C4765k.m14644a(this.f12266b.mo25595c(), this.f12267c);
        return new C4779a(bVar.f11871c, this.f12267c.f12143f, bVar.f11870b);
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        this.f12269e = hVar;
        this.f12270f = hVar.mo25173a(0, 1);
        this.f12269e.mo25175c();
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        this.f12271g = 0;
        this.f12274j = -9223372036854775807L;
        this.f12275k = 0;
        this.f12276l = 0;
    }

    /* JADX WARNING: type inference failed for: r16v2, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r12 != f12263n) goto L_0x005a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g r36, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l r37) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            int r2 = r0.f12271g
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.mo25258a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g) r1, (boolean) r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r2 = r0.f12273i
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r10 = 1
            if (r2 != 0) goto L_0x0240
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r11 = r0.f12267c
            int r11 = r11.f12140c
            r2.<init>((int) r11)
            byte[] r11 = r2.f13444a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r12 = r0.f12267c
            int r12 = r12.f12140c
            r13 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r13 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r13
            r13.mo25136a(r11, r4, r12, r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r11 = r0.f12267c
            int r12 = r11.f12138a
            r12 = r12 & r10
            r14 = 36
            if (r12 == 0) goto L_0x003b
            int r11 = r11.f12142e
            if (r11 == r10) goto L_0x003f
            r11 = r14
            goto L_0x0044
        L_0x003b:
            int r11 = r11.f12142e
            if (r11 == r10) goto L_0x0042
        L_0x003f:
            r11 = 21
            goto L_0x0044
        L_0x0042:
            r11 = 13
        L_0x0044:
            int r12 = r2.f13446c
            int r15 = r11 + 4
            if (r12 < r15) goto L_0x005a
            r2.mo25600e(r11)
            int r12 = r2.mo25595c()
            int r15 = f12262m
            if (r12 == r15) goto L_0x006e
            int r15 = f12263n
            if (r12 != r15) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            int r12 = r2.f13446c
            r15 = 40
            if (r12 < r15) goto L_0x006d
            r2.mo25600e(r14)
            int r12 = r2.mo25595c()
            int r14 = f12264o
            if (r12 != r14) goto L_0x006d
            r12 = r14
            goto L_0x006e
        L_0x006d:
            r12 = r4
        L_0x006e:
            int r14 = f12262m
            r16 = 0
            if (r12 == r14) goto L_0x0133
            int r14 = f12263n
            if (r12 != r14) goto L_0x007a
            goto L_0x0133
        L_0x007a:
            int r11 = f12264o
            if (r12 != r11) goto L_0x012b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r11 = r0.f12267c
            long r9 = r13.f11871c
            long r14 = r13.f11870b
            r12 = 10
            r2.mo25602f(r12)
            int r12 = r2.mo25595c()
            if (r12 > 0) goto L_0x0093
            r24 = r13
            goto L_0x0121
        L_0x0093:
            int r3 = r11.f12141d
            long r4 = (long) r12
            r6 = 32000(0x7d00, float:4.4842E-41)
            if (r3 < r6) goto L_0x009d
            r6 = 1152(0x480, float:1.614E-42)
            goto L_0x009f
        L_0x009d:
            r6 = 576(0x240, float:8.07E-43)
        L_0x009f:
            r24 = r13
            long r12 = (long) r6
            long r20 = r12 * r7
            long r12 = (long) r3
            r18 = r4
            r22 = r12
            long r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r18, (long) r20, (long) r22)
            int r5 = r2.mo25613q()
            int r6 = r2.mo25613q()
            int r12 = r2.mo25613q()
            r13 = 2
            r2.mo25602f(r13)
            int r11 = r11.f12140c
            long r7 = (long) r11
            long r9 = r9 + r7
            int r7 = r5 + 1
            long[] r8 = new long[r7]
            long[] r11 = new long[r7]
            r20 = 0
            r22 = 0
            r8[r22] = r20
            r11[r22] = r9
            r13 = 1
        L_0x00d0:
            if (r13 >= r7) goto L_0x011a
            r21 = r7
            r7 = 1
            if (r12 == r7) goto L_0x00f0
            r7 = 2
            if (r12 == r7) goto L_0x00eb
            r7 = 3
            if (r12 == r7) goto L_0x00e6
            r7 = 4
            if (r12 == r7) goto L_0x00e1
            goto L_0x0121
        L_0x00e1:
            int r7 = r2.mo25611o()
            goto L_0x00f4
        L_0x00e6:
            int r7 = r2.mo25610n()
            goto L_0x00f4
        L_0x00eb:
            int r7 = r2.mo25613q()
            goto L_0x00f4
        L_0x00f0:
            int r7 = r2.mo25608l()
        L_0x00f4:
            int r7 = r7 * r6
            r22 = r6
            long r6 = (long) r7
            long r9 = r9 + r6
            long r6 = (long) r13
            long r6 = r6 * r3
            r23 = r2
            long r1 = (long) r5
            long r6 = r6 / r1
            r8[r13] = r6
            r1 = -1
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0109
            r1 = r9
            goto L_0x010d
        L_0x0109:
            long r1 = java.lang.Math.min(r14, r9)
        L_0x010d:
            r11[r13] = r1
            int r13 = r13 + 1
            r1 = r36
            r7 = r21
            r6 = r22
            r2 = r23
            goto L_0x00d0
        L_0x011a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c
            r1.<init>(r8, r11, r3)
            r16 = r1
        L_0x0121:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r1 = r0.f12267c
            int r1 = r1.f12140c
            r2 = r24
            r2.mo25139c(r1)
            goto L_0x012f
        L_0x012b:
            r1 = r4
            r2 = r13
            r2.f11873e = r1
        L_0x012f:
            r1 = r16
            goto L_0x01f5
        L_0x0133:
            r23 = r2
            r2 = r13
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r1 = r0.f12267c
            long r3 = r2.f11871c
            long r5 = r2.f11870b
            int r7 = r1.f12144g
            int r8 = r1.f12141d
            int r9 = r1.f12140c
            long r9 = (long) r9
            long r25 = r3 + r9
            int r3 = r23.mo25595c()
            r4 = r3 & 1
            r9 = 1
            if (r4 != r9) goto L_0x01a6
            int r4 = r23.mo25611o()
            if (r4 != 0) goto L_0x0155
            goto L_0x01a6
        L_0x0155:
            long r9 = (long) r4
            long r14 = (long) r7
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r29 = r14 * r18
            long r7 = (long) r8
            r27 = r9
            r31 = r7
            long r27 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r27, (long) r29, (long) r31)
            r4 = 6
            r3 = r3 & r4
            if (r3 == r4) goto L_0x0179
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d r16 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d
            r31 = 0
            r32 = 0
            r34 = 0
            r24 = r16
            r29 = r5
            r24.<init>(r25, r27, r29, r31, r32, r34)
            goto L_0x01a6
        L_0x0179:
            int r3 = r23.mo25611o()
            long r3 = (long) r3
            r7 = r23
            r8 = 1
            r7.mo25602f(r8)
            r8 = 99
            long[] r9 = new long[r8]
            r10 = 0
        L_0x0189:
            if (r10 >= r8) goto L_0x0195
            int r13 = r7.mo25608l()
            long r14 = (long) r13
            r9[r10] = r14
            int r10 = r10 + 1
            goto L_0x0189
        L_0x0195:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d r16 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d
            int r1 = r1.f12140c
            r24 = r16
            r29 = r5
            r31 = r9
            r32 = r3
            r34 = r1
            r24.<init>(r25, r27, r29, r31, r32, r34)
        L_0x01a6:
            if (r16 == 0) goto L_0x01dc
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r1 = r0.f12268d
            boolean r1 = r1.mo25236a()
            if (r1 != 0) goto L_0x01dc
            r1 = 0
            r2.f11873e = r1
            int r11 = r11 + 141
            r2.mo25135a(r11, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12266b
            byte[] r3 = r3.f13444a
            r4 = 3
            r2.mo25136a(r3, r1, r4, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12266b
            r3.mo25600e(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r1 = r0.f12268d
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12266b
            int r3 = r3.mo25610n()
            r1.getClass()
            int r4 = r3 >> 12
            r3 = r3 & 4095(0xfff, float:5.738E-42)
            if (r4 > 0) goto L_0x01d8
            if (r3 <= 0) goto L_0x01dc
        L_0x01d8:
            r1.f12129a = r4
            r1.f12130b = r3
        L_0x01dc:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r1 = r0.f12267c
            int r1 = r1.f12140c
            r2.mo25139c(r1)
            if (r16 == 0) goto L_0x012f
            boolean r1 = r16.mo25130a()
            if (r1 != 0) goto L_0x012f
            int r1 = f12263n
            if (r12 != r1) goto L_0x012f
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r16 = r35.mo25259b(r36)
            goto L_0x012f
        L_0x01f5:
            r0.f12273i = r1
            if (r1 == 0) goto L_0x01fd
            r1.mo25130a()
            goto L_0x0203
        L_0x01fd:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r1 = r35.mo25259b(r36)
            r0.f12273i = r1
        L_0x0203:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r1 = r0.f12269e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r2 = r0.f12273i
            r1.mo25174a(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r1 = r0.f12270f
            r2 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r3 = r0.f12267c
            java.lang.String r4 = r3.f12139b
            r5 = 0
            r6 = -1
            r7 = 4096(0x1000, float:5.74E-42)
            int r8 = r3.f12142e
            int r9 = r3.f12141d
            r10 = -1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r3 = r0.f12268d
            int r11 = r3.f12129a
            int r12 = r3.f12130b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r3 = r0.f12272h
            r17 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4869i.m14974a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (int) r10, (int) r11, (java.util.List<byte[]>) r12, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r13, (int) r14, (java.lang.String) r15, (com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4886a) r16)
            r1.mo25149a(r2)
        L_0x0240:
            int r1 = r0.f12276l
            if (r1 != 0) goto L_0x02b5
            r1 = r36
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r2
            r3 = 0
            r2.f11873e = r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r0.f12266b
            byte[] r4 = r4.f13444a
            r5 = 4
            r6 = 1
            boolean r4 = r2.mo25136a(r4, r3, r5, r6)
            if (r4 != 0) goto L_0x025a
            r2 = -1
            goto L_0x02c3
        L_0x025a:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r0.f12266b
            r4.mo25600e(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12266b
            int r3 = r3.mo25595c()
            int r4 = r0.f12271g
            long r4 = (long) r4
            boolean r4 = m14682a((int) r3, (long) r4)
            if (r4 == 0) goto L_0x02ad
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4765k.m14643a(r3)
            r5 = -1
            if (r4 != r5) goto L_0x0276
            goto L_0x02ad
        L_0x0276:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r4 = r0.f12267c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4765k.m14644a(r3, r4)
            long r3 = r0.f12274j
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x02a6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r3 = r0.f12273i
            long r7 = r2.f11871c
            long r2 = r3.mo25257b(r7)
            r0.f12274j = r2
            long r2 = r0.f12265a
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x02a6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r2 = r0.f12273i
            r3 = 0
            long r2 = r2.mo25257b(r3)
            long r4 = r0.f12274j
            long r6 = r0.f12265a
            long r6 = r6 - r2
            long r4 = r4 + r6
            r0.f12274j = r4
        L_0x02a6:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r2 = r0.f12267c
            int r2 = r2.f12140c
            r0.f12276l = r2
            goto L_0x02b7
        L_0x02ad:
            r3 = 1
            r2.mo25139c(r3)
            r1 = 0
            r0.f12271g = r1
            goto L_0x02cc
        L_0x02b5:
            r1 = r36
        L_0x02b7:
            r3 = 1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r0.f12270f
            int r4 = r0.f12276l
            int r1 = r2.mo25143a(r1, r4, r3)
            r2 = -1
            if (r1 != r2) goto L_0x02c5
        L_0x02c3:
            r3 = r2
            goto L_0x02f6
        L_0x02c5:
            int r2 = r0.f12276l
            int r2 = r2 - r1
            r0.f12276l = r2
            if (r2 <= 0) goto L_0x02ce
        L_0x02cc:
            r3 = 0
            goto L_0x02f6
        L_0x02ce:
            long r1 = r0.f12274j
            long r3 = r0.f12275k
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r5 = r0.f12267c
            int r6 = r5.f12141d
            long r6 = (long) r6
            long r3 = r3 / r6
            long r7 = r1 + r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r6 = r0.f12270f
            int r10 = r5.f12140c
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo25147a(r7, r9, r10, r11, r12)
            long r1 = r0.f12275k
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r3 = r0.f12267c
            int r3 = r3.f12144g
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f12275k = r1
            r1 = 0
            r0.f12276l = r1
            r3 = r1
        L_0x02f6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4780b.mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final boolean mo25258a(C4730g gVar, boolean z) throws IOException, InterruptedException {
        int i;
        int i2;
        int i3;
        int a;
        int i4 = z ? 16384 : 131072;
        C4715b bVar = (C4715b) gVar;
        bVar.f11873e = 0;
        if (bVar.f11871c == 0) {
            int i5 = 0;
            while (true) {
                bVar.mo25136a(this.f12266b.f13444a, 0, 10, false);
                this.f12266b.mo25600e(0);
                if (this.f12266b.mo25610n() != C4901g.f13062b) {
                    break;
                }
                this.f12266b.mo25602f(3);
                int k = this.f12266b.mo25607k();
                int i6 = k + 10;
                if (this.f12272h == null) {
                    byte[] bArr = new byte[i6];
                    System.arraycopy(this.f12266b.f13444a, 0, bArr, 0, 10);
                    bVar.mo25136a(bArr, 10, k, false);
                    C4886a a2 = new C4901g((C4901g.C4902a) null).mo25439a(bArr, i6);
                    this.f12272h = a2;
                    if (a2 != null) {
                        this.f12268d.mo25237a(a2);
                    }
                } else {
                    bVar.mo25135a(k, false);
                }
                i5 += i6;
            }
            bVar.f11873e = 0;
            bVar.mo25135a(i5, false);
            i2 = (int) (bVar.f11871c + ((long) bVar.f11873e));
            if (!z) {
                bVar.mo25139c(i2);
            }
            i = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i7 = i;
        int i8 = i7;
        while (true) {
            if (!bVar.mo25136a(this.f12266b.f13444a, 0, 4, i > 0)) {
                break;
            }
            this.f12266b.mo25600e(0);
            int c = this.f12266b.mo25595c();
            if ((i7 == 0 || m14682a(c, (long) i7)) && (a = C4765k.m14643a(c)) != -1) {
                i3 = i + 1;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    C4765k.m14644a(c, this.f12267c);
                    i7 = c;
                }
                bVar.mo25135a(a - 4, false);
            } else {
                int i9 = i8 + 1;
                if (i8 != i4) {
                    if (z) {
                        bVar.f11873e = 0;
                        bVar.mo25135a(i2 + i9, false);
                    } else {
                        bVar.mo25139c(1);
                    }
                    i7 = 0;
                    i8 = i9;
                    i3 = 0;
                } else if (z) {
                    return false;
                } else {
                    throw new C4873l("Searched too many bytes.");
                }
            }
        }
        if (z) {
            bVar.mo25139c(i2 + i8);
        } else {
            bVar.f11873e = 0;
        }
        this.f12271g = i7;
        return true;
    }
}
