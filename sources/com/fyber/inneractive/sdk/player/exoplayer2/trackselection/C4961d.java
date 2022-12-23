package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d */
public abstract class C4961d extends C4967g {

    /* renamed from: a */
    public final SparseArray<Map<C4948s, C4963b>> f13230a = new SparseArray<>();

    /* renamed from: b */
    public final SparseBooleanArray f13231b = new SparseBooleanArray();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$a */
    public static final class C4962a {
        public C4962a(int[] iArr, C4948s[] sVarArr, int[] iArr2, int[][][] iArr3, C4948s sVar) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$b */
    public static final class C4963b {
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x027e A[LOOP:8: B:64:0x015f->B:109:0x027e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0392  */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0279 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0163  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4968h mo25505a(com.fyber.inneractive.sdk.player.exoplayer2.C4669a[] r48, com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s r49) throws com.fyber.inneractive.sdk.player.exoplayer2.C4697d {
        /*
            r47 = this;
            r1 = r47
            r0 = r48
            r2 = r49
            int r3 = r0.length
            r4 = 1
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r5 = r0.length
            int r5 = r5 + r4
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[][] r6 = new com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r[r5][]
            int r7 = r0.length
            int r7 = r7 + r4
            int[][][] r12 = new int[r7][][]
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x0023
            int r9 = r2.f13198a
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r10 = new com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r[r9]
            r6[r8] = r10
            int[][] r9 = new int[r9][]
            r12[r8] = r9
            int r8 = r8 + 1
            goto L_0x0014
        L_0x0023:
            int r5 = r0.length
            int[] r11 = new int[r5]
            r8 = 0
        L_0x0027:
            r9 = 4
            if (r8 >= r5) goto L_0x0034
            r10 = r0[r8]
            r10.getClass()
            r11[r8] = r9
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0034:
            r5 = 0
        L_0x0035:
            int r8 = r2.f13198a
            if (r5 >= r8) goto L_0x00be
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r8 = r2.f13199b
            r8 = r8[r5]
            int r13 = r0.length
            r14 = 0
            r15 = 0
        L_0x0040:
            int r9 = r0.length
            if (r14 >= r9) goto L_0x0077
            r9 = r0[r14]
            r7 = 0
        L_0x0046:
            int r4 = r8.f13194a
            if (r7 >= r4) goto L_0x0073
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r4 = r8.f13195b
            r4 = r4[r7]
            r10 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b r10 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4876b) r10
            r10.getClass()
            r18 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r9 = r10.f13008i     // Catch:{ b -> 0x006b }
            int r4 = r10.mo25047a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4878c) r9, (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r4)     // Catch:{ b -> 0x006b }
            r9 = 3
            r4 = r4 & r9
            if (r4 <= r15) goto L_0x0066
            if (r4 != r9) goto L_0x0064
            r13 = r14
            goto L_0x0077
        L_0x0064:
            r15 = r4
            r13 = r14
        L_0x0066:
            int r7 = r7 + 1
            r9 = r18
            goto L_0x0046
        L_0x006b:
            r0 = move-exception
            int r2 = r10.f11668c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r0, r2)
            throw r0
        L_0x0073:
            int r14 = r14 + 1
            r4 = 1
            goto L_0x0040
        L_0x0077:
            int r4 = r0.length
            if (r13 != r4) goto L_0x007f
            int r4 = r8.f13194a
            int[] r4 = new int[r4]
            goto L_0x00a8
        L_0x007f:
            r4 = r0[r13]
            int r7 = r8.f13194a
            int[] r7 = new int[r7]
            r9 = 0
        L_0x0086:
            int r10 = r8.f13194a
            if (r9 >= r10) goto L_0x00a7
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r10 = r8.f13195b
            r10 = r10[r9]
            r14 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4876b) r14
            r14.getClass()
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r15 = r14.f13008i     // Catch:{ b -> 0x009f }
            int r10 = r14.mo25047a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4878c) r15, (com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r10)     // Catch:{ b -> 0x009f }
            r7[r9] = r10
            int r9 = r9 + 1
            goto L_0x0086
        L_0x009f:
            r0 = move-exception
            int r2 = r14.f11668c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4697d.m14459a(r0, r2)
            throw r0
        L_0x00a7:
            r4 = r7
        L_0x00a8:
            r7 = r3[r13]
            r9 = r6[r13]
            r9[r7] = r8
            r8 = r12[r13]
            r8[r7] = r4
            r4 = r3[r13]
            r7 = 1
            int r4 = r4 + r7
            r3[r13] = r4
            int r5 = r5 + 1
            r4 = 1
            r9 = 4
            goto L_0x0035
        L_0x00be:
            int r4 = r0.length
            com.fyber.inneractive.sdk.player.exoplayer2.source.s[] r10 = new com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s[r4]
            int r4 = r0.length
            int[] r9 = new int[r4]
            r4 = 0
        L_0x00c5:
            int r5 = r0.length
            if (r4 >= r5) goto L_0x00ec
            r5 = r3[r4]
            com.fyber.inneractive.sdk.player.exoplayer2.source.s r7 = new com.fyber.inneractive.sdk.player.exoplayer2.source.s
            r8 = r6[r4]
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r8 = (com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r[]) r8
            r7.<init>(r8)
            r10[r4] = r7
            r7 = r12[r4]
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            int[][] r5 = (int[][]) r5
            r12[r4] = r5
            r5 = r0[r4]
            int r5 = r5.f11666a
            r9[r4] = r5
            int r4 = r4 + 1
            goto L_0x00c5
        L_0x00ec:
            int r4 = r0.length
            r3 = r3[r4]
            com.fyber.inneractive.sdk.player.exoplayer2.source.s r13 = new com.fyber.inneractive.sdk.player.exoplayer2.source.s
            int r4 = r0.length
            r4 = r6[r4]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r3 = (com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r[]) r3
            r13.<init>(r3)
            r3 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b) r3
            int r4 = r0.length
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] r5 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e[r4]
            java.util.concurrent.atomic.AtomicReference<com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$b> r6 = r3.f13212d
            java.lang.Object r6 = r6.get()
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.C4959b) r6
            r7 = 0
            r8 = 0
            r14 = 0
        L_0x010e:
            if (r7 >= r4) goto L_0x03e9
            r15 = r0[r7]
            int r15 = r15.f11666a
            r2 = 2
            if (r2 != r15) goto L_0x03b7
            if (r8 != 0) goto L_0x0394
            r2 = r0[r7]
            r8 = r10[r7]
            r15 = r12[r7]
            r26 = r13
            int r13 = r6.f13220e
            r27 = r11
            int r11 = r6.f13221f
            r28 = r9
            int r9 = r6.f13222g
            boolean r1 = r6.f13219d
            r29 = r12
            boolean r12 = r6.f13218c
            int r0 = r6.f13225j
            r30 = r4
            int r4 = r6.f13226k
            r31 = r14
            boolean r14 = r6.f13227l
            r32 = r10
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e$a r10 = r3.f13211c
            r33 = r3
            boolean r3 = r6.f13223h
            r34 = r5
            boolean r5 = r6.f13224i
            if (r10 == 0) goto L_0x029b
            if (r1 == 0) goto L_0x014e
            r1 = 12
            goto L_0x0150
        L_0x014e:
            r1 = 8
        L_0x0150:
            if (r12 == 0) goto L_0x015b
            r2.getClass()
            r2 = r1 & 4
            if (r2 == 0) goto L_0x015b
            r2 = 1
            goto L_0x015c
        L_0x015b:
            r2 = 0
        L_0x015c:
            r35 = r6
            r12 = 0
        L_0x015f:
            int r6 = r8.f13198a
            if (r12 >= r6) goto L_0x0292
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r6 = r8.f13199b
            r6 = r6[r12]
            r36 = r15[r12]
            r37 = r7
            int r7 = r6.f13194a
            r38 = r3
            r3 = 2
            if (r7 >= r3) goto L_0x0182
            int[] r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.f13210e
            r43 = r0
            r40 = r2
            r45 = r4
            r39 = r5
        L_0x017c:
            r46 = r14
            r42 = r15
            goto L_0x0276
        L_0x0182:
            java.util.List r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15166a(r6, r0, r4, r14)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r39 = r5
            int r5 = r7.size()
            if (r5 >= r3) goto L_0x0199
            int[] r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.f13210e
            r43 = r0
            r40 = r2
            r45 = r4
            goto L_0x017c
        L_0x0199:
            if (r2 != 0) goto L_0x0217
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r40 = r2
            r42 = r15
            r2 = 0
            r5 = 0
            r41 = 0
        L_0x01a8:
            int r15 = r7.size()
            if (r5 >= r15) goto L_0x0210
            java.lang.Object r15 = r7.get(r5)
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r43 = r0
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r0 = r6.f13195b
            r0 = r0[r15]
            java.lang.String r0 = r0.f12956f
            boolean r15 = r3.add(r0)
            r44 = r3
            r45 = r4
            if (r15 == 0) goto L_0x0203
            r3 = 0
            r15 = 0
        L_0x01cc:
            int r4 = r7.size()
            if (r15 >= r4) goto L_0x01fb
            java.lang.Object r4 = r7.get(r15)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r46 = r14
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r14 = r6.f13195b
            r19 = r14[r4]
            r21 = r36[r4]
            r20 = r0
            r22 = r1
            r23 = r13
            r24 = r11
            r25 = r9
            boolean r4 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15170a(r19, r20, r21, r22, r23, r24, r25)
            if (r4 == 0) goto L_0x01f6
            int r3 = r3 + 1
        L_0x01f6:
            int r15 = r15 + 1
            r14 = r46
            goto L_0x01cc
        L_0x01fb:
            r46 = r14
            if (r3 <= r2) goto L_0x0205
            r41 = r0
            r2 = r3
            goto L_0x0205
        L_0x0203:
            r46 = r14
        L_0x0205:
            int r5 = r5 + 1
            r0 = r43
            r3 = r44
            r4 = r45
            r14 = r46
            goto L_0x01a8
        L_0x0210:
            r43 = r0
            r45 = r4
            r46 = r14
            goto L_0x0223
        L_0x0217:
            r43 = r0
            r40 = r2
            r45 = r4
            r46 = r14
            r42 = r15
            r41 = 0
        L_0x0223:
            int r0 = r7.size()
            r2 = 1
            int r0 = r0 - r2
        L_0x0229:
            if (r0 < 0) goto L_0x0251
            java.lang.Object r2 = r7.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r3 = r6.f13195b
            r19 = r3[r2]
            r21 = r36[r2]
            r20 = r41
            r22 = r1
            r23 = r13
            r24 = r11
            r25 = r9
            boolean r2 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15170a(r19, r20, r21, r22, r23, r24, r25)
            if (r2 != 0) goto L_0x024e
            r7.remove(r0)
        L_0x024e:
            int r0 = r0 + -1
            goto L_0x0229
        L_0x0251:
            int r0 = r7.size()
            r2 = 2
            if (r0 >= r2) goto L_0x025b
            int[] r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.f13210e
            goto L_0x0276
        L_0x025b:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            int r0 = r7.size()
            int[] r2 = new int[r0]
            r3 = 0
        L_0x0264:
            if (r3 >= r0) goto L_0x0275
            java.lang.Object r4 = r7.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x0264
        L_0x0275:
            r7 = r2
        L_0x0276:
            int r0 = r7.length
            if (r0 <= 0) goto L_0x027e
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r0 = r10.mo25507a(r6, r7)
            goto L_0x02ac
        L_0x027e:
            int r12 = r12 + 1
            r7 = r37
            r3 = r38
            r5 = r39
            r2 = r40
            r15 = r42
            r0 = r43
            r4 = r45
            r14 = r46
            goto L_0x015f
        L_0x0292:
            r43 = r0
            r38 = r3
            r45 = r4
            r39 = r5
            goto L_0x02a5
        L_0x029b:
            r43 = r0
            r38 = r3
            r45 = r4
            r39 = r5
            r35 = r6
        L_0x02a5:
            r37 = r7
            r46 = r14
            r42 = r15
            r0 = 0
        L_0x02ac:
            if (r0 != 0) goto L_0x0389
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = -1
            r5 = 0
        L_0x02b4:
            int r6 = r8.f13198a
            if (r0 >= r6) goto L_0x037e
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r6 = r8.f13199b
            r6 = r6[r0]
            r7 = r43
            r10 = r45
            r12 = r46
            java.util.List r14 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15166a(r6, r7, r10, r12)
            r15 = r42[r0]
            r19 = r1
            r20 = r5
            r1 = 0
        L_0x02cd:
            int r5 = r6.f13194a
            if (r1 >= r5) goto L_0x036c
            r5 = r15[r1]
            r43 = r7
            r7 = r39
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15167a((int) r5, (boolean) r7)
            if (r5 == 0) goto L_0x0358
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r5 = r6.f13195b
            r5 = r5[r1]
            r21 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r39 = r7
            r7 = r14
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x0307
            int r6 = r5.f12960j
            r7 = -1
            if (r6 == r7) goto L_0x02f9
            if (r6 > r13) goto L_0x0307
        L_0x02f9:
            int r6 = r5.f12961k
            if (r6 == r7) goto L_0x02ff
            if (r6 > r11) goto L_0x0307
        L_0x02ff:
            int r6 = r5.f12952b
            if (r6 == r7) goto L_0x0305
            if (r6 > r9) goto L_0x0307
        L_0x0305:
            r6 = 1
            goto L_0x0308
        L_0x0307:
            r6 = 0
        L_0x0308:
            if (r6 != 0) goto L_0x030d
            if (r38 != 0) goto L_0x030d
            goto L_0x035c
        L_0x030d:
            r22 = r8
            if (r6 == 0) goto L_0x0313
            r7 = 2
            goto L_0x0314
        L_0x0313:
            r7 = 1
        L_0x0314:
            r8 = r15[r1]
            r23 = r9
            r9 = 0
            boolean r8 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15167a((int) r8, (boolean) r9)
            if (r8 == 0) goto L_0x0321
            int r7 = r7 + 1000
        L_0x0321:
            if (r7 <= r2) goto L_0x0325
            r9 = 1
            goto L_0x0326
        L_0x0325:
            r9 = 0
        L_0x0326:
            if (r7 != r2) goto L_0x0349
            int r9 = r5.mo25375b()
            if (r9 == r3) goto L_0x0337
            int r9 = r5.mo25375b()
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15165a((int) r9, (int) r3)
            goto L_0x033d
        L_0x0337:
            int r9 = r5.f12952b
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15165a((int) r9, (int) r4)
        L_0x033d:
            if (r8 == 0) goto L_0x0344
            if (r6 == 0) goto L_0x0344
            if (r9 <= 0) goto L_0x0348
            goto L_0x0346
        L_0x0344:
            if (r9 >= 0) goto L_0x0348
        L_0x0346:
            r9 = 1
            goto L_0x0349
        L_0x0348:
            r9 = 0
        L_0x0349:
            if (r9 == 0) goto L_0x0360
            int r2 = r5.f12952b
            int r3 = r5.mo25375b()
            r19 = r1
            r4 = r2
            r2 = r7
            r20 = r21
            goto L_0x0360
        L_0x0358:
            r21 = r6
            r39 = r7
        L_0x035c:
            r22 = r8
            r23 = r9
        L_0x0360:
            int r1 = r1 + 1
            r6 = r21
            r8 = r22
            r9 = r23
            r7 = r43
            goto L_0x02cd
        L_0x036c:
            r43 = r7
            r22 = r8
            r23 = r9
            int r0 = r0 + 1
            r45 = r10
            r46 = r12
            r1 = r19
            r5 = r20
            goto L_0x02b4
        L_0x037e:
            if (r5 != 0) goto L_0x0382
            r15 = 0
            goto L_0x038a
        L_0x0382:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c r0 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c
            r2 = 0
            r3 = 0
            r0.<init>(r5, r1, r3, r2)
        L_0x0389:
            r15 = r0
        L_0x038a:
            r34[r37] = r15
            r0 = r34[r37]
            if (r0 == 0) goto L_0x0392
            r8 = 1
            goto L_0x03aa
        L_0x0392:
            r8 = 0
            goto L_0x03aa
        L_0x0394:
            r33 = r3
            r30 = r4
            r34 = r5
            r35 = r6
            r37 = r7
            r28 = r9
            r32 = r10
            r27 = r11
            r29 = r12
            r26 = r13
            r31 = r14
        L_0x03aa:
            r0 = r32[r37]
            int r0 = r0.f13198a
            if (r0 <= 0) goto L_0x03b2
            r0 = 1
            goto L_0x03b3
        L_0x03b2:
            r0 = 0
        L_0x03b3:
            r0 = r31 | r0
            r14 = r0
            goto L_0x03cd
        L_0x03b7:
            r33 = r3
            r30 = r4
            r34 = r5
            r35 = r6
            r37 = r7
            r28 = r9
            r32 = r10
            r27 = r11
            r29 = r12
            r26 = r13
            r31 = r14
        L_0x03cd:
            int r7 = r37 + 1
            r1 = r47
            r0 = r48
            r2 = r49
            r13 = r26
            r11 = r27
            r9 = r28
            r12 = r29
            r4 = r30
            r10 = r32
            r3 = r33
            r5 = r34
            r6 = r35
            goto L_0x010e
        L_0x03e9:
            r33 = r3
            r34 = r5
            r35 = r6
            r28 = r9
            r32 = r10
            r27 = r11
            r29 = r12
            r26 = r13
            r31 = r14
            r1 = r4
            r0 = 0
            r7 = 0
            r9 = 0
        L_0x03ff:
            if (r9 >= r1) goto L_0x065f
            r2 = r48
            r3 = r2[r9]
            int r3 = r3.f11666a
            r4 = 1
            if (r3 == r4) goto L_0x0534
            r4 = 2
            if (r3 == r4) goto L_0x052e
            r5 = 3
            if (r3 == r5) goto L_0x0486
            r3 = r2[r9]
            r3.getClass()
            r3 = r32[r9]
            r6 = r29[r9]
            r8 = r35
            boolean r10 = r8.f13224i
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0421:
            int r15 = r3.f13198a
            if (r11 >= r15) goto L_0x0475
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r15 = r3.f13199b
            r15 = r15[r11]
            r17 = r6[r11]
            r4 = 0
        L_0x042c:
            int r5 = r15.f13194a
            if (r4 >= r5) goto L_0x046c
            r5 = r17[r4]
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15167a((int) r5, (boolean) r10)
            if (r5 == 0) goto L_0x0461
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r5 = r15.f13195b
            r5 = r5[r4]
            int r5 = r5.f12974x
            r16 = 1
            r5 = r5 & 1
            if (r5 == 0) goto L_0x0446
            r5 = 1
            goto L_0x0447
        L_0x0446:
            r5 = 0
        L_0x0447:
            r30 = r1
            if (r5 == 0) goto L_0x044d
            r5 = 2
            goto L_0x044e
        L_0x044d:
            r5 = 1
        L_0x044e:
            r1 = r17[r4]
            r20 = r3
            r3 = 0
            boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15167a((int) r1, (boolean) r3)
            if (r1 == 0) goto L_0x045b
            int r5 = r5 + 1000
        L_0x045b:
            if (r5 <= r13) goto L_0x0465
            r12 = r4
            r13 = r5
            r14 = r15
            goto L_0x0465
        L_0x0461:
            r30 = r1
            r20 = r3
        L_0x0465:
            int r4 = r4 + 1
            r3 = r20
            r1 = r30
            goto L_0x042c
        L_0x046c:
            r30 = r1
            r20 = r3
            int r11 = r11 + 1
            r4 = 2
            r5 = 3
            goto L_0x0421
        L_0x0475:
            r30 = r1
            if (r14 != 0) goto L_0x047b
            r1 = 0
            goto L_0x0482
        L_0x047b:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c
            r3 = 0
            r4 = 0
            r1.<init>(r14, r12, r4, r3)
        L_0x0482:
            r34[r9] = r1
            goto L_0x0652
        L_0x0486:
            r30 = r1
            r8 = r35
            if (r0 != 0) goto L_0x0652
            r0 = r32[r9]
            r1 = r29[r9]
            java.lang.String r3 = r8.f13217b
            java.lang.String r4 = r8.f13216a
            boolean r5 = r8.f13224i
            r6 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x049a:
            int r13 = r0.f13198a
            if (r6 >= r13) goto L_0x0511
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r13 = r0.f13199b
            r13 = r13[r6]
            r14 = r1[r6]
            r17 = r0
            r15 = 0
        L_0x04a7:
            int r0 = r13.f13194a
            if (r15 >= r0) goto L_0x0508
            r0 = r14[r15]
            boolean r0 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15167a((int) r0, (boolean) r5)
            if (r0 == 0) goto L_0x04fd
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r0 = r13.f13195b
            r0 = r0[r15]
            r20 = r1
            int r1 = r0.f12974x
            r21 = r1 & 1
            if (r21 == 0) goto L_0x04c2
            r21 = 1
            goto L_0x04c4
        L_0x04c2:
            r21 = 0
        L_0x04c4:
            r1 = r1 & 2
            if (r1 == 0) goto L_0x04ca
            r1 = 1
            goto L_0x04cb
        L_0x04ca:
            r1 = 0
        L_0x04cb:
            boolean r22 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15169a((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r0, (java.lang.String) r3)
            if (r22 == 0) goto L_0x04db
            if (r21 == 0) goto L_0x04d5
            r0 = 6
            goto L_0x04ea
        L_0x04d5:
            if (r1 != 0) goto L_0x04d9
            r0 = 5
            goto L_0x04ea
        L_0x04d9:
            r0 = 4
            goto L_0x04ea
        L_0x04db:
            if (r21 == 0) goto L_0x04df
            r0 = 3
            goto L_0x04ea
        L_0x04df:
            if (r1 == 0) goto L_0x04ff
            boolean r0 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15169a((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r0, (java.lang.String) r4)
            if (r0 == 0) goto L_0x04e9
            r0 = 2
            goto L_0x04ea
        L_0x04e9:
            r0 = 1
        L_0x04ea:
            r1 = r14[r15]
            r21 = r3
            r3 = 0
            boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15167a((int) r1, (boolean) r3)
            if (r1 == 0) goto L_0x04f7
            int r0 = r0 + 1000
        L_0x04f7:
            if (r0 <= r11) goto L_0x0501
            r11 = r0
            r12 = r13
            r10 = r15
            goto L_0x0501
        L_0x04fd:
            r20 = r1
        L_0x04ff:
            r21 = r3
        L_0x0501:
            int r15 = r15 + 1
            r1 = r20
            r3 = r21
            goto L_0x04a7
        L_0x0508:
            r20 = r1
            r21 = r3
            int r6 = r6 + 1
            r0 = r17
            goto L_0x049a
        L_0x0511:
            if (r12 != 0) goto L_0x0515
            r0 = 0
            goto L_0x051c
        L_0x0515:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c r0 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c
            r1 = 0
            r3 = 0
            r0.<init>(r12, r10, r3, r1)
        L_0x051c:
            r34[r9] = r0
            r0 = r34[r9]
            r35 = r8
            if (r0 == 0) goto L_0x0529
            r0 = 1
            r20 = 1
            goto L_0x0657
        L_0x0529:
            r0 = 1
            r20 = 0
            goto L_0x0657
        L_0x052e:
            r30 = r1
            r20 = r0
            goto L_0x0656
        L_0x0534:
            r30 = r1
            r8 = r35
            if (r7 != 0) goto L_0x0652
            r1 = r32[r9]
            r3 = r29[r9]
            java.lang.String r4 = r8.f13216a
            boolean r5 = r8.f13224i
            boolean r6 = r8.f13218c
            if (r31 == 0) goto L_0x054a
            r10 = r33
            r7 = 0
            goto L_0x054e
        L_0x054a:
            r10 = r33
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e$a r7 = r10.f13211c
        L_0x054e:
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
        L_0x0552:
            int r15 = r1.f13198a
            if (r13 >= r15) goto L_0x05be
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r15 = r1.f13199b
            r15 = r15[r13]
            r17 = r3[r13]
            r20 = r0
            r35 = r8
            r0 = r14
            r14 = r12
            r12 = r11
            r11 = 0
        L_0x0564:
            int r8 = r15.f13194a
            if (r11 >= r8) goto L_0x05b0
            r8 = r17[r11]
            boolean r8 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15167a((int) r8, (boolean) r5)
            if (r8 == 0) goto L_0x05a5
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r8 = r15.f13195b
            r8 = r8[r11]
            r21 = r5
            r5 = r17[r11]
            r33 = r10
            int r10 = r8.f12974x
            r16 = 1
            r10 = r10 & 1
            if (r10 == 0) goto L_0x0584
            r10 = 1
            goto L_0x0585
        L_0x0584:
            r10 = 0
        L_0x0585:
            boolean r8 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15169a((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r8, (java.lang.String) r4)
            if (r8 == 0) goto L_0x0591
            if (r10 == 0) goto L_0x058f
            r8 = 4
            goto L_0x0596
        L_0x058f:
            r8 = 3
            goto L_0x0596
        L_0x0591:
            if (r10 == 0) goto L_0x0595
            r8 = 2
            goto L_0x0596
        L_0x0595:
            r8 = 1
        L_0x0596:
            r10 = 0
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15167a((int) r5, (boolean) r10)
            if (r5 == 0) goto L_0x059f
            int r8 = r8 + 1000
        L_0x059f:
            if (r8 <= r0) goto L_0x05a9
            r0 = r8
            r14 = r11
            r12 = r13
            goto L_0x05a9
        L_0x05a5:
            r21 = r5
            r33 = r10
        L_0x05a9:
            int r11 = r11 + 1
            r5 = r21
            r10 = r33
            goto L_0x0564
        L_0x05b0:
            r21 = r5
            r33 = r10
            int r13 = r13 + 1
            r11 = r12
            r12 = r14
            r8 = r35
            r14 = r0
            r0 = r20
            goto L_0x0552
        L_0x05be:
            r20 = r0
            r35 = r8
            r33 = r10
            r0 = -1
            if (r11 != r0) goto L_0x05cb
            r0 = 1
            r1 = 0
            goto L_0x0648
        L_0x05cb:
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r1 = r1.f13199b
            r1 = r1[r11]
            if (r7 == 0) goto L_0x0641
            r3 = r3[r11]
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r5 = 0
            r8 = 0
            r10 = 0
        L_0x05db:
            int r11 = r1.f13194a
            if (r5 >= r11) goto L_0x0618
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r11 = r1.f13195b
            r11 = r11[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$a r13 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$a
            int r14 = r11.f12968r
            int r15 = r11.f12969s
            if (r6 == 0) goto L_0x05ed
            r11 = 0
            goto L_0x05ef
        L_0x05ed:
            java.lang.String r11 = r11.f12956f
        L_0x05ef:
            r13.<init>(r14, r15, r11)
            boolean r11 = r4.add(r13)
            if (r11 == 0) goto L_0x0614
            r11 = 0
            r14 = 0
        L_0x05fa:
            int r15 = r1.f13194a
            if (r11 >= r15) goto L_0x0610
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r15 = r1.f13195b
            r15 = r15[r11]
            r0 = r3[r11]
            boolean r0 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15168a(r15, r0, r13)
            if (r0 == 0) goto L_0x060c
            int r14 = r14 + 1
        L_0x060c:
            int r11 = r11 + 1
            r0 = -1
            goto L_0x05fa
        L_0x0610:
            if (r14 <= r8) goto L_0x0614
            r10 = r13
            r8 = r14
        L_0x0614:
            int r5 = r5 + 1
            r0 = -1
            goto L_0x05db
        L_0x0618:
            r0 = 1
            if (r8 <= r0) goto L_0x0637
            int[] r4 = new int[r8]
            r5 = 0
            r6 = 0
        L_0x061f:
            int r8 = r1.f13194a
            if (r5 >= r8) goto L_0x0639
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r8 = r1.f13195b
            r8 = r8[r5]
            r11 = r3[r5]
            boolean r8 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.m15168a(r8, r11, r10)
            if (r8 == 0) goto L_0x0634
            int r8 = r6 + 1
            r4[r6] = r5
            r6 = r8
        L_0x0634:
            int r5 = r5 + 1
            goto L_0x061f
        L_0x0637:
            int[] r4 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4957b.f13210e
        L_0x0639:
            int r3 = r4.length
            if (r3 <= 0) goto L_0x0642
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r1 = r7.mo25507a(r1, r4)
            goto L_0x0648
        L_0x0641:
            r0 = 1
        L_0x0642:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c r3 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c
            r3.<init>(r1, r12)
            r1 = r3
        L_0x0648:
            r34[r9] = r1
            r1 = r34[r9]
            if (r1 == 0) goto L_0x0650
            r7 = r0
            goto L_0x0657
        L_0x0650:
            r7 = 0
            goto L_0x0657
        L_0x0652:
            r20 = r0
            r35 = r8
        L_0x0656:
            r0 = 1
        L_0x0657:
            int r9 = r9 + 1
            r0 = r20
            r1 = r30
            goto L_0x03ff
        L_0x065f:
            r2 = r48
            r0 = 1
            r9 = 0
        L_0x0663:
            int r1 = r2.length
            if (r9 >= r1) goto L_0x06ad
            r1 = r47
            android.util.SparseBooleanArray r3 = r1.f13231b
            boolean r3 = r3.get(r9)
            if (r3 == 0) goto L_0x0676
            r3 = 0
            r34[r9] = r3
            r4 = r3
        L_0x0674:
            r3 = 0
            goto L_0x06aa
        L_0x0676:
            r3 = r32[r9]
            android.util.SparseArray<java.util.Map<com.fyber.inneractive.sdk.player.exoplayer2.source.s, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$b>> r4 = r1.f13230a
            java.lang.Object r4 = r4.get(r9)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x068a
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x068a
            r7 = r0
            goto L_0x068b
        L_0x068a:
            r7 = 0
        L_0x068b:
            if (r7 == 0) goto L_0x06a8
            android.util.SparseArray<java.util.Map<com.fyber.inneractive.sdk.player.exoplayer2.source.s, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$b>> r4 = r1.f13230a
            java.lang.Object r4 = r4.get(r9)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r4.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4961d.C4963b) r4
            if (r4 != 0) goto L_0x06a1
            r4 = 0
            r34[r9] = r4
            goto L_0x0674
        L_0x06a1:
            r4 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r0 = r3.f13199b
            r3 = 0
            r0 = r0[r3]
            throw r4
        L_0x06a8:
            r3 = 0
            r4 = 0
        L_0x06aa:
            int r9 = r9 + 1
            goto L_0x0663
        L_0x06ad:
            r1 = r47
            r3 = 0
            r4 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$a r0 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$a
            r8 = r0
            r9 = r28
            r10 = r32
            r11 = r27
            r12 = r29
            r13 = r26
            r8.<init>(r9, r10, r11, r12, r13)
            int r5 = r2.length
            com.fyber.inneractive.sdk.player.exoplayer2.o[] r5 = new com.fyber.inneractive.sdk.player.exoplayer2.C4912o[r5]
            r7 = r3
        L_0x06c5:
            int r3 = r2.length
            if (r7 >= r3) goto L_0x06d5
            r3 = r34[r7]
            if (r3 == 0) goto L_0x06cf
            com.fyber.inneractive.sdk.player.exoplayer2.o r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4912o.f13074b
            goto L_0x06d0
        L_0x06cf:
            r3 = r4
        L_0x06d0:
            r5[r7] = r3
            int r7 = r7 + 1
            goto L_0x06c5
        L_0x06d5:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r2 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r3 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f
            r4 = r34
            r3.<init>(r4)
            r4 = r49
            r2.<init>(r4, r3, r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4961d.mo25505a(com.fyber.inneractive.sdk.player.exoplayer2.a[], com.fyber.inneractive.sdk.player.exoplayer2.source.s):com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h");
    }

    /* renamed from: a */
    public final void mo25506a(Object obj) {
        C4962a aVar = (C4962a) obj;
    }
}
