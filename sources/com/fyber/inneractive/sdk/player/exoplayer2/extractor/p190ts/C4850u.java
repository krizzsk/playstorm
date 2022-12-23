package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.google.android.exoplayer2.extractor.p194ts.TsExtractor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u */
public final class C4850u implements C4723f {

    /* renamed from: l */
    public static final long f12819l = ((long) C5049u.m15386a("AC-3"));

    /* renamed from: m */
    public static final long f12820m = ((long) C5049u.m15386a("EAC3"));

    /* renamed from: n */
    public static final long f12821n = ((long) C5049u.m15386a("HEVC"));

    /* renamed from: a */
    public final int f12822a;

    /* renamed from: b */
    public final List<C5046r> f12823b;

    /* renamed from: c */
    public final C5036k f12824c;

    /* renamed from: d */
    public final SparseIntArray f12825d;

    /* renamed from: e */
    public final C4853v.C4856c f12826e;

    /* renamed from: f */
    public final SparseArray<C4853v> f12827f;

    /* renamed from: g */
    public final SparseBooleanArray f12828g;

    /* renamed from: h */
    public C4731h f12829h;

    /* renamed from: i */
    public int f12830i;

    /* renamed from: j */
    public boolean f12831j;

    /* renamed from: k */
    public C4853v f12832k;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u$a */
    public class C4851a implements C4846q {

        /* renamed from: a */
        public final C5035j f12833a = new C5035j(new byte[4]);

        public C4851a() {
        }

        /* renamed from: a */
        public void mo25318a(C5036k kVar) {
            if (kVar.mo25608l() == 0) {
                kVar.mo25602f(7);
                int a = kVar.mo25588a() / 4;
                for (int i = 0; i < a; i++) {
                    kVar.mo25590a(this.f12833a, 4);
                    int a2 = this.f12833a.mo25583a(16);
                    this.f12833a.mo25587c(3);
                    if (a2 == 0) {
                        this.f12833a.mo25587c(13);
                    } else {
                        int a3 = this.f12833a.mo25583a(13);
                        C4850u uVar = C4850u.this;
                        uVar.f12827f.put(a3, new C4847r(new C4852b(a3)));
                        C4850u.this.f12830i++;
                    }
                }
                C4850u uVar2 = C4850u.this;
                if (uVar2.f12822a != 2) {
                    uVar2.f12827f.remove(0);
                }
            }
        }

        /* renamed from: a */
        public void mo25319a(C5046r rVar, C4731h hVar, C4853v.C4857d dVar) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u$b */
    public class C4852b implements C4846q {

        /* renamed from: a */
        public final C5035j f12835a = new C5035j(new byte[5]);

        /* renamed from: b */
        public final SparseArray<C4853v> f12836b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f12837c = new SparseIntArray();

        /* renamed from: d */
        public final int f12838d;

        public C4852b(int i) {
            this.f12838d = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:71:0x01db  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01e8  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo25318a(com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k r25) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                int r2 = r25.mo25608l()
                r3 = 2
                if (r2 == r3) goto L_0x000c
                return
            L_0x000c:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                int r4 = r2.f12822a
                r5 = 0
                r6 = 1
                if (r4 == r6) goto L_0x0032
                if (r4 == r3) goto L_0x0032
                int r4 = r2.f12830i
                if (r4 != r6) goto L_0x001b
                goto L_0x0032
            L_0x001b:
                com.fyber.inneractive.sdk.player.exoplayer2.util.r r4 = new com.fyber.inneractive.sdk.player.exoplayer2.util.r
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r2 = r2.f12823b
                java.lang.Object r2 = r2.get(r5)
                com.fyber.inneractive.sdk.player.exoplayer2.util.r r2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r) r2
                long r7 = r2.f13468a
                r4.<init>(r7)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r2 = r2.f12823b
                r2.add(r4)
                goto L_0x003b
            L_0x0032:
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r2 = r2.f12823b
                java.lang.Object r2 = r2.get(r5)
                r4 = r2
                com.fyber.inneractive.sdk.player.exoplayer2.util.r r4 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r) r4
            L_0x003b:
                r1.mo25602f(r3)
                int r2 = r25.mo25613q()
                r7 = 5
                r1.mo25602f(r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r8 = r0.f12835a
                r1.mo25590a((com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j) r8, (int) r3)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r8 = r0.f12835a
                r9 = 4
                r8.mo25587c(r9)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r8 = r0.f12835a
                r10 = 12
                int r8 = r8.mo25583a(r10)
                r1.mo25602f(r8)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                int r11 = r8.f12822a
                r12 = 8192(0x2000, float:1.14794E-41)
                r13 = 0
                r14 = 21
                if (r11 != r3) goto L_0x008a
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r8 = r8.f12832k
                if (r8 != 0) goto L_0x008a
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b
                byte[] r11 = new byte[r5]
                r8.<init>(r14, r13, r13, r11)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$c r15 = r11.f12826e
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r8 = r15.mo25302a(r14, r8)
                r11.f12832k = r8
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r11 = r8.f12832k
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r8 = r8.f12829h
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d r15 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d
                r15.<init>(r2, r14, r12)
                r11.mo25316a(r4, r8, r15)
            L_0x008a:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r8 = r0.f12836b
                r8.clear()
                android.util.SparseIntArray r8 = r0.f12837c
                r8.clear()
                int r8 = r25.mo25588a()
            L_0x0098:
                if (r8 <= 0) goto L_0x0206
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r11 = r0.f12835a
                r1.mo25590a((com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j) r11, (int) r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r11 = r0.f12835a
                r15 = 8
                int r11 = r11.mo25583a(r15)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r0.f12835a
                r13 = 3
                r15.mo25587c(r13)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r0.f12835a
                r6 = 13
                int r6 = r15.mo25583a(r6)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r0.f12835a
                r15.mo25587c(r9)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r0.f12835a
                int r15 = r15.mo25583a(r10)
                int r10 = r1.f13445b
                int r12 = r10 + r15
                r16 = -1
                r14 = r16
                r3 = 0
                r17 = 0
            L_0x00cb:
                int r5 = r1.f13445b
                if (r5 >= r12) goto L_0x018a
                int r5 = r25.mo25608l()
                int r18 = r25.mo25608l()
                int r9 = r1.f13445b
                int r9 = r9 + r18
                r13 = 89
                if (r5 != r7) goto L_0x00fa
                long r20 = r25.mo25609m()
                long r22 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.f12819l
                int r5 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
                if (r5 != 0) goto L_0x00ea
                goto L_0x00fe
            L_0x00ea:
                long r22 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.f12820m
                int r5 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
                if (r5 != 0) goto L_0x00f1
                goto L_0x010e
            L_0x00f1:
                long r22 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.f12821n
                int r5 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
                if (r5 != 0) goto L_0x0125
                r5 = 36
                goto L_0x0100
            L_0x00fa:
                r7 = 106(0x6a, float:1.49E-43)
                if (r5 != r7) goto L_0x010a
            L_0x00fe:
                r5 = 129(0x81, float:1.81E-43)
            L_0x0100:
                r22 = r2
                r19 = r4
                r14 = r5
            L_0x0105:
                r23 = r6
                r13 = 4
                goto L_0x0177
            L_0x010a:
                r7 = 122(0x7a, float:1.71E-43)
                if (r5 != r7) goto L_0x0111
            L_0x010e:
                r5 = 135(0x87, float:1.89E-43)
                goto L_0x0100
            L_0x0111:
                r7 = 123(0x7b, float:1.72E-43)
                if (r5 != r7) goto L_0x0118
                r5 = 138(0x8a, float:1.93E-43)
                goto L_0x0100
            L_0x0118:
                r7 = 10
                if (r5 != r7) goto L_0x012a
                r7 = 3
                java.lang.String r3 = r1.mo25594b(r7)
                java.lang.String r3 = r3.trim()
            L_0x0125:
                r22 = r2
                r19 = r4
                goto L_0x0105
            L_0x012a:
                r7 = 3
                if (r5 != r13) goto L_0x0125
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
            L_0x0132:
                int r14 = r1.f13445b
                if (r14 >= r9) goto L_0x016c
                java.lang.String r14 = r1.mo25594b(r7)
                java.lang.String r14 = r14.trim()
                int r7 = r25.mo25608l()
                r19 = r4
                r13 = 4
                byte[] r4 = new byte[r13]
                r22 = r2
                byte[] r2 = r1.f13444a
                r23 = r6
                int r6 = r1.f13445b
                r0 = 0
                java.lang.System.arraycopy(r2, r6, r4, r0, r13)
                int r0 = r1.f13445b
                int r0 = r0 + r13
                r1.f13445b = r0
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$a r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$a
                r0.<init>(r14, r7, r4)
                r5.add(r0)
                r0 = r24
                r4 = r19
                r2 = r22
                r6 = r23
                r7 = 3
                r13 = 89
                goto L_0x0132
            L_0x016c:
                r22 = r2
                r19 = r4
                r23 = r6
                r13 = 4
                r17 = r5
                r14 = 89
            L_0x0177:
                int r0 = r1.f13445b
                int r9 = r9 - r0
                r1.mo25602f(r9)
                r0 = r24
                r9 = r13
                r4 = r19
                r2 = r22
                r6 = r23
                r7 = 5
                r13 = 3
                goto L_0x00cb
            L_0x018a:
                r22 = r2
                r19 = r4
                r23 = r6
                r13 = r9
                r1.mo25600e(r12)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b
                byte[] r2 = r1.f13444a
                byte[] r2 = java.util.Arrays.copyOfRange(r2, r10, r12)
                r4 = r17
                r0.<init>(r14, r3, r4, r2)
                r2 = 6
                if (r11 != r2) goto L_0x01a5
                r11 = r14
            L_0x01a5:
                int r15 = r15 + 5
                int r8 = r8 - r15
                r2 = r24
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                int r4 = r3.f12822a
                r5 = 2
                if (r4 != r5) goto L_0x01b3
                r4 = r11
                goto L_0x01b5
            L_0x01b3:
                r4 = r23
            L_0x01b5:
                android.util.SparseBooleanArray r3 = r3.f12828g
                boolean r3 = r3.get(r4)
                if (r3 == 0) goto L_0x01c0
                r6 = 21
                goto L_0x01f4
            L_0x01c0:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                int r6 = r3.f12822a
                if (r6 != r5) goto L_0x01cd
                r6 = 21
                if (r11 != r6) goto L_0x01cf
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r0 = r3.f12832k
                goto L_0x01d5
            L_0x01cd:
                r6 = 21
            L_0x01cf:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$c r3 = r3.f12826e
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r0 = r3.mo25302a(r11, r0)
            L_0x01d5:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                int r3 = r3.f12822a
                if (r3 != r5) goto L_0x01e8
                android.util.SparseIntArray r3 = r2.f12837c
                r5 = 8192(0x2000, float:1.14794E-41)
                int r3 = r3.get(r4, r5)
                r5 = r23
                if (r5 >= r3) goto L_0x01f4
                goto L_0x01ea
            L_0x01e8:
                r5 = r23
            L_0x01ea:
                android.util.SparseIntArray r3 = r2.f12837c
                r3.put(r4, r5)
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r3 = r2.f12836b
                r3.put(r4, r0)
            L_0x01f4:
                r0 = r2
                r14 = r6
                r9 = r13
                r4 = r19
                r2 = r22
                r3 = 2
                r5 = 0
                r6 = 1
                r7 = 5
                r10 = 12
                r12 = 8192(0x2000, float:1.14794E-41)
                r13 = 0
                goto L_0x0098
            L_0x0206:
                r22 = r2
                r19 = r4
                r2 = r0
                android.util.SparseIntArray r0 = r2.f12837c
                int r0 = r0.size()
                r1 = 0
            L_0x0212:
                if (r1 >= r0) goto L_0x0264
                android.util.SparseIntArray r3 = r2.f12837c
                int r3 = r3.keyAt(r1)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                android.util.SparseBooleanArray r4 = r4.f12828g
                r5 = 1
                r4.put(r3, r5)
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r4 = r2.f12836b
                java.lang.Object r4 = r4.valueAt(r1)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v) r4
                if (r4 == 0) goto L_0x0257
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r6 = r5.f12832k
                if (r4 == r6) goto L_0x0243
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r5 = r5.f12829h
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d r6 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d
                r7 = r22
                r8 = 8192(0x2000, float:1.14794E-41)
                r6.<init>(r7, r3, r8)
                r3 = r19
                r4.mo25316a(r3, r5, r6)
                goto L_0x0249
            L_0x0243:
                r3 = r19
                r7 = r22
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x0249:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r5 = r5.f12827f
                android.util.SparseIntArray r6 = r2.f12837c
                int r6 = r6.valueAt(r1)
                r5.put(r6, r4)
                goto L_0x025d
            L_0x0257:
                r3 = r19
                r7 = r22
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x025d:
                int r1 = r1 + 1
                r19 = r3
                r22 = r7
                goto L_0x0212
            L_0x0264:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                int r1 = r0.f12822a
                r3 = 2
                if (r1 != r3) goto L_0x027e
                boolean r1 = r0.f12831j
                if (r1 != 0) goto L_0x02a1
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r0.f12829h
                r0.mo25175c()
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                r1 = 0
                r0.f12830i = r1
                r3 = 1
                boolean unused = r0.f12831j = r3
                goto L_0x02a1
            L_0x027e:
                r1 = 0
                r3 = 1
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r0 = r0.f12827f
                int r4 = r2.f12838d
                r0.remove(r4)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                int r4 = r0.f12822a
                if (r4 != r3) goto L_0x028f
                r5 = r1
                goto L_0x0293
            L_0x028f:
                int r1 = r0.f12830i
                int r5 = r1 + -1
            L_0x0293:
                r0.f12830i = r5
                if (r5 != 0) goto L_0x02a1
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r0.f12829h
                r0.mo25175c()
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.this
                boolean unused = r0.f12831j = r3
            L_0x02a1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.C4852b.mo25318a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
        }

        /* renamed from: a */
        public void mo25319a(C5046r rVar, C4731h hVar, C4853v.C4857d dVar) {
        }
    }

    public C4850u(int i, C5046r rVar, C4853v.C4856c cVar) {
        this.f12826e = (C4853v.C4856c) C5023a.m15300a(cVar);
        this.f12822a = i;
        if (i == 1 || i == 2) {
            this.f12823b = Collections.singletonList(rVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f12823b = arrayList;
            arrayList.add(rVar);
        }
        this.f12824c = new C5036k(940);
        this.f12828g = new SparseBooleanArray();
        this.f12827f = new SparseArray<>();
        this.f12825d = new SparseIntArray();
        mo25321a();
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        byte[] bArr = this.f12824c.f13444a;
        C4715b bVar = (C4715b) gVar;
        bVar.mo25136a(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * TsExtractor.TS_PACKET_SIZE) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            bVar.mo25139c(i);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        this.f12829h = hVar;
        hVar.mo25174a(new C4767m.C4768a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        int size = this.f12823b.size();
        for (int i = 0; i < size; i++) {
            this.f12823b.get(i).f13470c = -9223372036854775807L;
        }
        this.f12824c.mo25614r();
        this.f12825d.clear();
        mo25321a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r0 != ((r7 + 1) & 15)) goto L_0x00ac;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g r10, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f12824c
            byte[] r0 = r11.f13444a
            int r1 = r11.f13445b
            int r1 = 940 - r1
            r2 = 188(0xbc, float:2.63E-43)
            r3 = 0
            if (r1 >= r2) goto L_0x001f
            int r11 = r11.mo25588a()
            if (r11 <= 0) goto L_0x001a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r9.f12824c
            int r1 = r1.f13445b
            java.lang.System.arraycopy(r0, r1, r0, r3, r11)
        L_0x001a:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r9.f12824c
            r1.mo25591a((byte[]) r0, (int) r11)
        L_0x001f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f12824c
            int r11 = r11.mo25588a()
            if (r11 >= r2) goto L_0x003f
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f12824c
            int r11 = r11.f13446c
            int r1 = 940 - r11
            r4 = r10
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r4
            int r1 = r4.mo25132a(r0, r11, r1)
            r4 = -1
            if (r1 != r4) goto L_0x0038
            return r4
        L_0x0038:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r9.f12824c
            int r11 = r11 + r1
            r4.mo25598d(r11)
            goto L_0x001f
        L_0x003f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r9.f12824c
            int r11 = r10.f13446c
            int r10 = r10.f13445b
        L_0x0045:
            if (r10 >= r11) goto L_0x0050
            byte r1 = r0[r10]
            r4 = 71
            if (r1 == r4) goto L_0x0050
            int r10 = r10 + 1
            goto L_0x0045
        L_0x0050:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r9.f12824c
            r0.mo25600e(r10)
            int r10 = r10 + r2
            if (r10 <= r11) goto L_0x0059
            return r3
        L_0x0059:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r9.f12824c
            int r0 = r0.mo25595c()
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f12824c
            r11.mo25600e(r10)
            return r3
        L_0x006a:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            r2 = 1
            if (r1 == 0) goto L_0x0072
            r1 = r2
            goto L_0x0073
        L_0x0072:
            r1 = r3
        L_0x0073:
            r4 = 2096896(0x1fff00, float:2.938377E-39)
            r4 = r4 & r0
            int r4 = r4 >> 8
            r5 = r0 & 32
            if (r5 == 0) goto L_0x007f
            r5 = r2
            goto L_0x0080
        L_0x007f:
            r5 = r3
        L_0x0080:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0086
            r6 = r2
            goto L_0x0087
        L_0x0086:
            r6 = r3
        L_0x0087:
            int r7 = r9.f12822a
            r8 = 2
            if (r7 == r8) goto L_0x00ab
            r0 = r0 & 15
            android.util.SparseIntArray r7 = r9.f12825d
            int r8 = r0 + -1
            int r7 = r7.get(r4, r8)
            android.util.SparseIntArray r8 = r9.f12825d
            r8.put(r4, r0)
            if (r7 != r0) goto L_0x00a5
            if (r6 == 0) goto L_0x00ab
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f12824c
            r11.mo25600e(r10)
            return r3
        L_0x00a5:
            int r7 = r7 + r2
            r7 = r7 & 15
            if (r0 == r7) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r2 = r3
        L_0x00ac:
            if (r5 == 0) goto L_0x00b9
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r9.f12824c
            int r0 = r0.mo25608l()
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r9.f12824c
            r5.mo25602f(r0)
        L_0x00b9:
            if (r6 == 0) goto L_0x00d9
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r0 = r9.f12827f
            java.lang.Object r0 = r0.get(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v) r0
            if (r0 == 0) goto L_0x00d9
            if (r2 == 0) goto L_0x00ca
            r0.mo25313a()
        L_0x00ca:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r9.f12824c
            r2.mo25598d(r10)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r9.f12824c
            r0.mo25315a(r2, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r9.f12824c
            r0.mo25598d(r11)
        L_0x00d9:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f12824c
            r11.mo25600e(r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4850u.mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final void mo25321a() {
        this.f12828g.clear();
        this.f12827f.clear();
        SparseArray<C4853v> a = this.f12826e.mo25300a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f12827f.put(a.keyAt(i), a.valueAt(i));
        }
        this.f12827f.put(0, new C4847r(new C4851a()));
        this.f12832k = null;
    }
}
