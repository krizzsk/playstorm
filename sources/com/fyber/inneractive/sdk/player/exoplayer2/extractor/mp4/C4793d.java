package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4873l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d */
public final class C4793d implements C4723f {

    /* renamed from: D */
    public static final int f12407D = C5049u.m15386a("seig");

    /* renamed from: E */
    public static final byte[] f12408E = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: A */
    public C4804n f12409A;

    /* renamed from: B */
    public C4804n[] f12410B;

    /* renamed from: C */
    public boolean f12411C;

    /* renamed from: a */
    public final int f12412a;

    /* renamed from: b */
    public final SparseArray<C4795b> f12413b;

    /* renamed from: c */
    public final C5036k f12414c;

    /* renamed from: d */
    public final C5036k f12415d;

    /* renamed from: e */
    public final C5036k f12416e;

    /* renamed from: f */
    public final C5036k f12417f;

    /* renamed from: g */
    public final C5046r f12418g;

    /* renamed from: h */
    public final C5036k f12419h;

    /* renamed from: i */
    public final byte[] f12420i;

    /* renamed from: j */
    public final Stack<C4784a.C4785a> f12421j;

    /* renamed from: k */
    public final LinkedList<C4794a> f12422k;

    /* renamed from: l */
    public int f12423l;

    /* renamed from: m */
    public int f12424m;

    /* renamed from: n */
    public long f12425n;

    /* renamed from: o */
    public int f12426o;

    /* renamed from: p */
    public C5036k f12427p;

    /* renamed from: q */
    public long f12428q;

    /* renamed from: r */
    public int f12429r;

    /* renamed from: s */
    public long f12430s;

    /* renamed from: t */
    public long f12431t;

    /* renamed from: u */
    public C4795b f12432u;

    /* renamed from: v */
    public int f12433v;

    /* renamed from: w */
    public int f12434w;

    /* renamed from: x */
    public int f12435x;

    /* renamed from: y */
    public boolean f12436y;

    /* renamed from: z */
    public C4731h f12437z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a */
    public static final class C4794a {

        /* renamed from: a */
        public final long f12438a;

        /* renamed from: b */
        public final int f12439b;

        public C4794a(long j, int i) {
            this.f12438a = j;
            this.f12439b = i;
        }
    }

    public C4793d(int i, C5046r rVar) {
        this(i, (C5046r) null, (C4800h) null);
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        return C4799g.m14745a(gVar, true);
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: c */
    public final void mo25268c() {
        if ((this.f12412a & 4) != 0 && this.f12409A == null) {
            C4804n a = this.f12437z.mo25173a(this.f12413b.size(), 4);
            this.f12409A = a;
            a.mo25149a(C4869i.m14971a((String) null, "application/x-emsg", Long.MAX_VALUE));
        }
        if ((this.f12412a & 8) != 0 && this.f12410B == null) {
            C4804n a2 = this.f12437z.mo25173a(this.f12413b.size() + 1, 3);
            a2.mo25149a(C4869i.m14977a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (C4702a) null));
            this.f12410B = new C4804n[]{a2};
        }
    }

    public C4793d(int i, C5046r rVar, C4800h hVar) {
        this.f12412a = i | 0;
        this.f12418g = rVar;
        this.f12419h = new C5036k(16);
        this.f12414c = new C5036k(C5032i.f13423a);
        this.f12415d = new C5036k(5);
        this.f12416e = new C5036k();
        this.f12417f = new C5036k(1);
        this.f12420i = new byte[16];
        this.f12421j = new Stack<>();
        this.f12422k = new LinkedList<>();
        this.f12413b = new SparseArray<>();
        this.f12430s = -9223372036854775807L;
        this.f12431t = -9223372036854775807L;
        mo25266a();
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        this.f12437z = hVar;
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        int size = this.f12413b.size();
        for (int i = 0; i < size; i++) {
            this.f12413b.valueAt(i).mo25269a();
        }
        this.f12422k.clear();
        this.f12429r = 0;
        this.f12421j.clear();
        mo25266a();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b */
    public static final class C4795b {

        /* renamed from: a */
        public final C4802j f12440a = new C4802j();

        /* renamed from: b */
        public final C4804n f12441b;

        /* renamed from: c */
        public C4800h f12442c;

        /* renamed from: d */
        public C4792c f12443d;

        /* renamed from: e */
        public int f12444e;

        /* renamed from: f */
        public int f12445f;

        /* renamed from: g */
        public int f12446g;

        public C4795b(C4804n nVar) {
            this.f12441b = nVar;
        }

        /* renamed from: a */
        public void mo25270a(C4800h hVar, C4792c cVar) {
            hVar.getClass();
            this.f12442c = hVar;
            cVar.getClass();
            this.f12443d = cVar;
            this.f12441b.mo25149a(hVar.f12503f);
            mo25269a();
        }

        /* renamed from: a */
        public void mo25269a() {
            C4802j jVar = this.f12440a;
            jVar.f12514d = 0;
            jVar.f12528r = 0;
            jVar.f12522l = false;
            jVar.f12527q = false;
            jVar.f12524n = null;
            this.f12444e = 0;
            this.f12446g = 0;
            this.f12445f = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:261:0x0289 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05d4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0002 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g r26, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r25 = this;
            r0 = r25
        L_0x0002:
            r1 = r26
        L_0x0004:
            int r2 = r0.f12423l
            r3 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0440
            if (r2 == r6) goto L_0x02e3
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x028a
            r12 = 6
            if (r2 != r11) goto L_0x00fc
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12432u
            if (r2 != 0) goto L_0x0081
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12413b
            int r13 = r2.size()
            r14 = r7
            r15 = 0
        L_0x0024:
            if (r14 >= r13) goto L_0x0045
            java.lang.Object r16 = r2.valueAt(r14)
            r11 = r16
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r11 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.C4795b) r11
            int r4 = r11.f12446g
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r8 = r11.f12440a
            int r5 = r8.f12514d
            if (r4 != r5) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            long[] r5 = r8.f12516f
            r4 = r5[r4]
            int r8 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0041
            r9 = r4
            r15 = r11
        L_0x0041:
            int r14 = r14 + 1
            r11 = 3
            goto L_0x0024
        L_0x0045:
            if (r15 != 0) goto L_0x0063
            long r2 = r0.f12428q
            r4 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r4
            long r5 = r4.f11871c
            long r2 = r2 - r5
            int r2 = (int) r2
            if (r2 < 0) goto L_0x005b
            r4.mo25139c(r2)
            r25.mo25266a()
            r6 = r7
            goto L_0x0287
        L_0x005b:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0063:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r2 = r15.f12440a
            long[] r2 = r2.f12516f
            int r4 = r15.f12446g
            r4 = r2[r4]
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r2
            long r8 = r2.f11871c
            long r4 = r4 - r8
            int r4 = (int) r4
            if (r4 >= 0) goto L_0x007c
            java.lang.String r4 = "FragmentedMp4Extractor"
            java.lang.String r5 = "Ignoring negative offset to sample data."
            android.util.Log.w(r4, r5)
            r4 = r7
        L_0x007c:
            r2.mo25139c(r4)
            r0.f12432u = r15
        L_0x0081:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12432u
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r4 = r2.f12440a
            int[] r5 = r4.f12518h
            int r8 = r2.f12444e
            r5 = r5[r8]
            r0.f12433v = r5
            boolean r5 = r4.f12522l
            if (r5 == 0) goto L_0x00e0
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r4.f12526p
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r9 = r4.f12511a
            int r9 = r9.f12403a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i r10 = r4.f12524n
            if (r10 == 0) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r10 = r2.f12442c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r10 = r10.f12505h
            r10 = r10[r9]
        L_0x00a2:
            int r9 = r10.f12509a
            boolean[] r4 = r4.f12523m
            boolean r4 = r4[r8]
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12417f
            byte[] r10 = r8.f13444a
            if (r4 == 0) goto L_0x00b1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00b2
        L_0x00b1:
            r11 = r7
        L_0x00b2:
            r11 = r11 | r9
            byte r11 = (byte) r11
            r10[r7] = r11
            r8.mo25600e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r2.f12441b
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12417f
            r2.mo25150a(r8, r6)
            r2.mo25150a(r5, r9)
            if (r4 != 0) goto L_0x00c8
            int r9 = r9 + 1
            goto L_0x00d8
        L_0x00c8:
            int r4 = r5.mo25613q()
            r8 = -2
            r5.mo25602f(r8)
            int r4 = r4 * r12
            int r4 = r4 + r3
            r2.mo25150a(r5, r4)
            int r9 = r9 + 1
            int r9 = r9 + r4
        L_0x00d8:
            r0.f12434w = r9
            int r2 = r0.f12433v
            int r2 = r2 + r9
            r0.f12433v = r2
            goto L_0x00e2
        L_0x00e0:
            r0.f12434w = r7
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12432u
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = r2.f12442c
            int r2 = r2.f12504g
            if (r2 != r6) goto L_0x00f7
            int r2 = r0.f12433v
            r4 = 8
            int r2 = r2 - r4
            r0.f12433v = r2
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r2
            r2.mo25139c(r4)
        L_0x00f7:
            r2 = 4
            r0.f12423l = r2
            r0.f12435x = r7
        L_0x00fc:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12432u
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r4 = r2.f12440a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r5 = r2.f12442c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r8 = r2.f12441b
            int r2 = r2.f12444e
            int r9 = r5.f12508k
            if (r9 == 0) goto L_0x01e3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r13 = r0.f12415d
            byte[] r13 = r13.f13444a
            r13[r7] = r7
            r13[r6] = r7
            r13[r3] = r7
            int r3 = r9 + 1
            int r9 = 4 - r9
        L_0x0118:
            int r14 = r0.f12434w
            int r15 = r0.f12433v
            if (r14 >= r15) goto L_0x01f4
            int r14 = r0.f12435x
            java.lang.String r15 = "video/hevc"
            if (r14 != 0) goto L_0x0183
            r14 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r14
            r14.mo25138b(r13, r9, r3, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12415d
            r14.mo25600e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12415d
            int r14 = r14.mo25611o()
            int r14 = r14 - r6
            r0.f12435x = r14
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12414c
            r14.mo25600e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12414c
            r10 = 4
            r8.mo25150a(r14, r10)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r0.f12415d
            r8.mo25150a(r11, r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r11 = r0.f12410B
            if (r11 == 0) goto L_0x0174
            com.fyber.inneractive.sdk.player.exoplayer2.i r11 = r5.f12503f
            java.lang.String r11 = r11.f12956f
            byte r14 = r13[r10]
            byte[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.f13423a
            java.lang.String r10 = "video/avc"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0160
            r10 = r14 & 31
            if (r10 == r12) goto L_0x016d
        L_0x0160:
            boolean r10 = r15.equals(r11)
            if (r10 == 0) goto L_0x016f
            r10 = r14 & 126(0x7e, float:1.77E-43)
            int r10 = r10 >> r6
            r11 = 39
            if (r10 != r11) goto L_0x016f
        L_0x016d:
            r10 = r6
            goto L_0x0170
        L_0x016f:
            r10 = r7
        L_0x0170:
            if (r10 == 0) goto L_0x0174
            r10 = r6
            goto L_0x0175
        L_0x0174:
            r10 = r7
        L_0x0175:
            r0.f12436y = r10
            int r10 = r0.f12434w
            int r10 = r10 + 5
            r0.f12434w = r10
            int r10 = r0.f12433v
            int r10 = r10 + r9
            r0.f12433v = r10
            goto L_0x0118
        L_0x0183:
            boolean r10 = r0.f12436y
            if (r10 == 0) goto L_0x01d2
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r0.f12416e
            r10.mo25596c(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r0.f12416e
            byte[] r10 = r10.f13444a
            int r11 = r0.f12435x
            r14 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r14
            r14.mo25138b(r10, r7, r11, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r0.f12416e
            int r11 = r0.f12435x
            r8.mo25150a(r10, r11)
            int r10 = r0.f12435x
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r0.f12416e
            byte[] r14 = r11.f13444a
            int r11 = r11.f13446c
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5032i.m15320a(r14, r11)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12416e
            com.fyber.inneractive.sdk.player.exoplayer2.i r12 = r5.f12503f
            java.lang.String r12 = r12.f12956f
            boolean r12 = r15.equals(r12)
            r14.mo25600e(r12)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r12 = r0.f12416e
            r12.mo25598d(r11)
            long[] r11 = r4.f12520j
            r14 = r11[r2]
            int[] r11 = r4.f12519i
            r11 = r11[r2]
            long r11 = (long) r11
            long r14 = r14 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r11
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r0.f12416e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r12 = r0.f12410B
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C4951a.m15153a(r14, r11, r12)
            goto L_0x01d6
        L_0x01d2:
            int r10 = r8.mo25143a(r1, r14, r7)
        L_0x01d6:
            int r11 = r0.f12434w
            int r11 = r11 + r10
            r0.f12434w = r11
            int r11 = r0.f12435x
            int r11 = r11 - r10
            r0.f12435x = r11
            r12 = 6
            goto L_0x0118
        L_0x01e3:
            int r3 = r0.f12434w
            int r9 = r0.f12433v
            if (r3 >= r9) goto L_0x01f4
            int r9 = r9 - r3
            int r3 = r8.mo25143a(r1, r9, r7)
            int r9 = r0.f12434w
            int r9 = r9 + r3
            r0.f12434w = r9
            goto L_0x01e3
        L_0x01f4:
            long[] r3 = r4.f12520j
            r9 = r3[r2]
            int[] r3 = r4.f12519i
            r3 = r3[r2]
            long r11 = (long) r3
            long r9 = r9 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            boolean r3 = r4.f12522l
            if (r3 == 0) goto L_0x0208
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0209
        L_0x0208:
            r11 = r7
        L_0x0209:
            boolean[] r12 = r4.f12521k
            boolean r2 = r12[r2]
            r21 = r11 | r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r2 = r4.f12511a
            int r2 = r2.f12403a
            if (r3 == 0) goto L_0x0225
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i r3 = r4.f12524n
            if (r3 == 0) goto L_0x021c
            byte[] r2 = r3.f12510b
            goto L_0x0222
        L_0x021c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r3 = r5.f12505h
            r2 = r3[r2]
            byte[] r2 = r2.f12510b
        L_0x0222:
            r24 = r2
            goto L_0x0227
        L_0x0225:
            r24 = 0
        L_0x0227:
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r2 = r0.f12418g
            if (r2 == 0) goto L_0x022f
            long r9 = r2.mo25634a(r9)
        L_0x022f:
            int r2 = r0.f12433v
            r23 = 0
            r18 = r8
            r19 = r9
            r22 = r2
            r18.mo25147a(r19, r21, r22, r23, r24)
        L_0x023c:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a> r2 = r0.f12422k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0267
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a> r2 = r0.f12422k
            java.lang.Object r2 = r2.removeFirst()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.C4794a) r2
            int r3 = r0.f12429r
            int r5 = r2.f12439b
            int r3 = r3 - r5
            r0.f12429r = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r8 = r0.f12409A
            long r11 = r2.f12438a
            long r18 = r9 + r11
            r20 = 1
            r23 = 0
            r17 = r8
            r21 = r5
            r22 = r3
            r17.mo25147a(r18, r20, r21, r22, r23)
            goto L_0x023c
        L_0x0267:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12432u
            int r3 = r2.f12444e
            int r3 = r3 + r6
            r2.f12444e = r3
            int r3 = r2.f12445f
            int r3 = r3 + r6
            r2.f12445f = r3
            int[] r4 = r4.f12517g
            int r5 = r2.f12446g
            r4 = r4[r5]
            if (r3 != r4) goto L_0x0284
            int r5 = r5 + 1
            r2.f12446g = r5
            r2.f12445f = r7
            r2 = 0
            r0.f12432u = r2
        L_0x0284:
            r2 = 3
            r0.f12423l = r2
        L_0x0287:
            if (r6 == 0) goto L_0x0004
            return r7
        L_0x028a:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12413b
            int r2 = r2.size()
            r3 = r7
            r4 = 0
        L_0x0292:
            if (r3 >= r2) goto L_0x02b4
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r5 = r0.f12413b
            java.lang.Object r5 = r5.valueAt(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.C4795b) r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r5 = r5.f12440a
            boolean r6 = r5.f12527q
            if (r6 == 0) goto L_0x02b1
            long r5 = r5.f12513c
            int r8 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x02b1
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r4 = r0.f12413b
            java.lang.Object r4 = r4.valueAt(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.C4795b) r4
            r9 = r5
        L_0x02b1:
            int r3 = r3 + 1
            goto L_0x0292
        L_0x02b4:
            if (r4 != 0) goto L_0x02bb
            r2 = 3
            r0.f12423l = r2
            goto L_0x0004
        L_0x02bb:
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r2
            long r5 = r2.f11871c
            long r9 = r9 - r5
            int r3 = (int) r9
            if (r3 < 0) goto L_0x02db
            r2.mo25139c(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r3 = r4.f12440a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r3.f12526p
            byte[] r4 = r4.f13444a
            int r5 = r3.f12525o
            r2.mo25138b(r4, r7, r5, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r3.f12526p
            r2.mo25600e(r7)
            r3.f12527q = r7
            goto L_0x0004
        L_0x02db:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02e3:
            long r4 = r0.f12425n
            int r2 = (int) r4
            int r4 = r0.f12426o
            int r2 = r2 - r4
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r0.f12427p
            if (r4 == 0) goto L_0x042e
            byte[] r4 = r4.f13444a
            r5 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r5
            r8 = 8
            r5.mo25138b(r4, r8, r2, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b
            int r4 = r0.f12424m
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12427p
            r2.<init>(r4, r8)
            long r9 = r5.f11871c
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r5 = r0.f12421j
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0319
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12421j
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r3
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r3.f12380Q0
            r3.add(r2)
            goto L_0x0435
        L_0x0319:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12288B
            if (r4 != r2) goto L_0x03d9
            r2 = 8
            r8.mo25600e(r2)
            int r2 = r8.mo25595c()
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r2)
            r4 = 4
            r8.mo25602f(r4)
            long r4 = r8.mo25609m()
            if (r2 != 0) goto L_0x033d
            long r11 = r8.mo25609m()
            long r13 = r8.mo25609m()
            goto L_0x0345
        L_0x033d:
            long r11 = r8.mo25612p()
            long r13 = r8.mo25612p()
        L_0x0345:
            long r9 = r9 + r13
            r18 = r11
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r15 = r4
            long r20 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r11, (long) r13, (long) r15)
            r8.mo25602f(r3)
            int r2 = r8.mo25613q()
            int[] r3 = new int[r2]
            long[] r15 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r11 = r20
        L_0x0363:
            if (r7 >= r2) goto L_0x03b2
            int r16 = r8.mo25595c()
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r16 & r22
            if (r22 != 0) goto L_0x03aa
            long r22 = r8.mo25609m()
            r24 = 2147483647(0x7fffffff, float:NaN)
            r16 = r16 & r24
            r3[r7] = r16
            r15[r7] = r9
            r14[r7] = r11
            long r18 = r18 + r22
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r24 = r2
            r6 = r13
            r2 = r14
            r13 = r22
            r1 = r15
            r15 = r4
            long r11 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r11, (long) r13, (long) r15)
            r13 = r2[r7]
            long r13 = r11 - r13
            r6[r7] = r13
            r13 = 4
            r8.mo25602f(r13)
            r14 = r3[r7]
            long r14 = (long) r14
            long r9 = r9 + r14
            int r7 = r7 + 1
            r15 = r1
            r14 = r2
            r13 = r6
            r2 = r24
            r6 = 1
            r1 = r26
            goto L_0x0363
        L_0x03aa:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03b2:
            r6 = r13
            r2 = r14
            r1 = r15
            java.lang.Long r4 = java.lang.Long.valueOf(r20)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.a r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a
            r5.<init>(r3, r1, r6, r2)
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f12431t = r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r2 = r0.f12437z
            java.lang.Object r1 = r1.second
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m) r1
            r2.mo25174a(r1)
            r1 = 1
            r0.f12411C = r1
            goto L_0x0435
        L_0x03d9:
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12299G0
            if (r4 != r1) goto L_0x0435
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r1 = r0.f12409A
            if (r1 != 0) goto L_0x03e2
            goto L_0x0435
        L_0x03e2:
            r1 = 12
            r8.mo25600e(r1)
            r8.mo25606j()
            r8.mo25606j()
            long r6 = r8.mo25609m()
            long r2 = r8.mo25609m()
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r2, (long) r4, (long) r6)
            r8.mo25600e(r1)
            int r13 = r8.mo25588a()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r1 = r0.f12409A
            r1.mo25150a(r8, r13)
            long r4 = r0.f12431t
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x041e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r9 = r0.f12409A
            long r10 = r4 + r2
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo25147a(r10, r12, r13, r14, r15)
            goto L_0x0435
        L_0x041e:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a> r1 = r0.f12422k
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a
            r4.<init>(r2, r13)
            r1.addLast(r4)
            int r1 = r0.f12429r
            int r1 = r1 + r13
            r0.f12429r = r1
            goto L_0x0435
        L_0x042e:
            r1 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r1
            r1.mo25139c(r2)
        L_0x0435:
            r1 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r1
            long r1 = r1.f11871c
            r0.mo25267a((long) r1)
            goto L_0x0002
        L_0x0440:
            int r1 = r0.f12426o
            if (r1 != 0) goto L_0x046f
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12419h
            byte[] r1 = r1.f13444a
            r2 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r2
            r4 = 8
            r5 = 1
            boolean r1 = r2.mo25138b(r1, r7, r4, r5)
            if (r1 != 0) goto L_0x0458
            r6 = r7
            goto L_0x05d2
        L_0x0458:
            r0.f12426o = r4
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12419h
            r1.mo25600e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12419h
            long r1 = r1.mo25609m()
            r0.f12425n = r1
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12419h
            int r1 = r1.mo25595c()
            r0.f12424m = r1
        L_0x046f:
            long r1 = r0.f12425n
            r4 = 1
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0491
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12419h
            byte[] r1 = r1.f13444a
            r2 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r2
            r4 = 8
            r2.mo25138b(r1, r4, r4, r7)
            int r1 = r0.f12426o
            int r1 = r1 + r4
            r0.f12426o = r1
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12419h
            long r1 = r1.mo25612p()
            r0.f12425n = r1
        L_0x0491:
            long r1 = r0.f12425n
            int r4 = r0.f12426o
            long r4 = (long) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x05de
            r1 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r1
            long r8 = r1.f11871c
            long r8 = r8 - r4
            int r2 = r0.f12424m
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12308L
            if (r2 != r4) goto L_0x04c4
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12413b
            int r2 = r2.size()
            r4 = r7
        L_0x04ae:
            if (r4 >= r2) goto L_0x04c4
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r5 = r0.f12413b
            java.lang.Object r5 = r5.valueAt(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.C4795b) r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r5 = r5.f12440a
            r5.getClass()
            r5.f12513c = r8
            r5.f12512b = r8
            int r4 = r4 + 1
            goto L_0x04ae
        L_0x04c4:
            int r2 = r0.f12424m
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12342i
            if (r2 != r4) goto L_0x04ea
            r4 = 0
            r0.f12432u = r4
            long r1 = r0.f12425n
            long r8 = r8 + r1
            r0.f12428q = r8
            boolean r1 = r0.f12411C
            if (r1 != 0) goto L_0x04e5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r1 = r0.f12437z
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a
            long r4 = r0.f12430s
            r2.<init>(r4)
            r1.mo25174a(r2)
            r1 = 1
            r0.f12411C = r1
        L_0x04e5:
            r0.f12423l = r3
            r6 = 1
            goto L_0x05d2
        L_0x04ea:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12290C
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12294E
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12296F
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12298G
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12300H
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12308L
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12310M
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12312N
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12317Q
            if (r2 != r3) goto L_0x050f
            goto L_0x0511
        L_0x050f:
            r3 = r7
            goto L_0x0512
        L_0x0511:
            r3 = 1
        L_0x0512:
            if (r3 == 0) goto L_0x053b
            long r1 = r1.f11871c
            long r3 = r0.f12425n
            long r1 = r1 + r3
            r3 = 8
            long r1 = r1 - r3
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12421j
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a
            int r5 = r0.f12424m
            r4.<init>(r5, r1)
            r3.add(r4)
            long r3 = r0.f12425n
            int r5 = r0.f12426o
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0535
            r0.mo25267a((long) r1)
            goto L_0x0538
        L_0x0535:
            r25.mo25266a()
        L_0x0538:
            r1 = 1
            goto L_0x05d1
        L_0x053b:
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12320T
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12319S
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12292D
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12288B
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12321U
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12372x
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12374y
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12316P
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12376z
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12286A
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12322V
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12333d0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12335e0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12343i0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12341h0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12337f0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12339g0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12318R
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12314O
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12299G0
            if (r2 != r1) goto L_0x058c
            goto L_0x058e
        L_0x058c:
            r1 = r7
            goto L_0x058f
        L_0x058e:
            r1 = 1
        L_0x058f:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x05c5
            int r1 = r0.f12426o
            r4 = 8
            if (r1 != r4) goto L_0x05bd
            long r5 = r0.f12425n
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x05b5
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            int r2 = (int) r5
            r1.<init>((int) r2)
            r0.f12427p = r1
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f12419h
            byte[] r2 = r2.f13444a
            byte[] r1 = r1.f13444a
            java.lang.System.arraycopy(r2, r7, r1, r7, r4)
            r1 = 1
            r0.f12423l = r1
            goto L_0x05d1
        L_0x05b5:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05bd:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05c5:
            long r4 = r0.f12425n
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x05d6
            r1 = 0
            r0.f12427p = r1
            r1 = 1
            r0.f12423l = r1
        L_0x05d1:
            r6 = r1
        L_0x05d2:
            if (r6 != 0) goto L_0x0002
            r1 = -1
            return r1
        L_0x05d6:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05de:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final void mo25266a() {
        this.f12423l = 0;
        this.f12426o = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:256:0x05fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25267a(long r57) throws com.fyber.inneractive.sdk.player.exoplayer2.C4873l {
        /*
            r56 = this;
        L_0x0000:
            r0 = r56
        L_0x0002:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r1 = r0.f12421j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x070e
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r1 = r0.f12421j
            java.lang.Object r1 = r1.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r1
            long r1 = r1.f12379P0
            int r1 = (r1 > r57 ? 1 : (r1 == r57 ? 0 : -1))
            if (r1 != 0) goto L_0x070e
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r1 = r0.f12421j
            java.lang.Object r1 = r1.pop()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r1
            int r2 = r1.f12378a
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12290C
            r4 = 12
            r5 = 8
            r7 = 1
            if (r2 != r3) goto L_0x015d
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r2 = r1.f12380Q0
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = m14716a((java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b>) r2)
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12312N
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = r1.mo25261c(r3)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r10 = r3.f12380Q0
            int r10 = r10.size()
            r15 = r8
            r8 = 0
        L_0x0049:
            if (r8 >= r10) goto L_0x00b0
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r9 = r3.f12380Q0
            java.lang.Object r9 = r9.get(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r9 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b) r9
            int r11 = r9.f12378a
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12376z
            if (r11 != r12) goto L_0x008e
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r9.f12382P0
            r9.mo25600e(r4)
            int r11 = r9.mo25595c()
            int r12 = r9.mo25611o()
            int r12 = r12 - r7
            int r13 = r9.mo25611o()
            int r6 = r9.mo25611o()
            int r9 = r9.mo25595c()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
            r4.<init>(r12, r13, r6, r9)
            android.util.Pair r4 = android.util.Pair.create(r11, r4)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            r14.put(r6, r4)
            goto L_0x00ab
        L_0x008e:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12314O
            if (r11 != r4) goto L_0x00ab
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r9.f12382P0
            r4.mo25600e(r5)
            int r6 = r4.mo25595c()
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r6)
            if (r6 != 0) goto L_0x00a6
            long r11 = r4.mo25609m()
            goto L_0x00aa
        L_0x00a6:
            long r11 = r4.mo25612p()
        L_0x00aa:
            r15 = r11
        L_0x00ab:
            int r8 = r8 + 1
            r4 = 12
            goto L_0x0049
        L_0x00b0:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r4 = r1.f12381R0
            int r4 = r4.size()
            r5 = 0
        L_0x00bc:
            if (r5 >= r4) goto L_0x00e4
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r6 = r1.f12381R0
            java.lang.Object r6 = r6.get(r5)
            r8 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r8 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r8
            int r6 = r8.f12378a
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12294E
            if (r6 != r9) goto L_0x00e1
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12292D
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r9 = r1.mo25262d(r6)
            r13 = 0
            r10 = r15
            r12 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4787b.m14706a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r8, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b) r9, (long) r10, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a) r12, (boolean) r13)
            if (r6 == 0) goto L_0x00e1
            int r8 = r6.f12498a
            r3.put(r8, r6)
        L_0x00e1:
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00e4:
            int r1 = r3.size()
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12413b
            int r2 = r2.size()
            if (r2 != 0) goto L_0x012f
            r6 = 0
        L_0x00f1:
            if (r6 >= r1) goto L_0x0125
            java.lang.Object r2 = r3.valueAt(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4800h) r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r5 = r0.f12437z
            int r7 = r2.f12499b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r5 = r5.mo25173a(r6, r7)
            r4.<init>(r5)
            int r5 = r2.f12498a
            java.lang.Object r5 = r14.get(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4792c) r5
            r4.mo25270a(r2, r5)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r5 = r0.f12413b
            int r7 = r2.f12498a
            r5.put(r7, r4)
            long r4 = r0.f12430s
            long r7 = r2.f12502e
            long r4 = java.lang.Math.max(r4, r7)
            r0.f12430s = r4
            int r6 = r6 + 1
            goto L_0x00f1
        L_0x0125:
            r56.mo25268c()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r1 = r0.f12437z
            r1.mo25175c()
            goto L_0x0002
        L_0x012f:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12413b
            int r2 = r2.size()
            if (r2 != r1) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r7 = 0
        L_0x0139:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r7)
            r6 = 0
        L_0x013d:
            if (r6 >= r1) goto L_0x0002
            java.lang.Object r2 = r3.valueAt(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4800h) r2
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r4 = r0.f12413b
            int r5 = r2.f12498a
            java.lang.Object r4 = r4.get(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.C4795b) r4
            int r5 = r2.f12498a
            java.lang.Object r5 = r14.get(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4792c) r5
            r4.mo25270a(r2, r5)
            int r6 = r6 + 1
            goto L_0x013d
        L_0x015d:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12308L
            if (r2 != r3) goto L_0x06f1
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12413b
            int r3 = r0.f12412a
            byte[] r4 = r0.f12420i
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r6 = r1.f12381R0
            int r6 = r6.size()
            r8 = 0
        L_0x016e:
            if (r8 >= r6) goto L_0x0662
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r9 = r1.f12381R0
            java.lang.Object r9 = r9.get(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r9 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r9
            int r10 = r9.f12378a
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12310M
            if (r10 != r11) goto L_0x0642
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12374y
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r10 = r9.mo25262d(r10)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r10.f12382P0
            r10.mo25600e(r5)
            int r11 = r10.mo25595c()
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12328b
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r12
            int r13 = r10.mo25595c()
            r14 = r3 & 16
            if (r14 != 0) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r13 = 0
        L_0x019d:
            java.lang.Object r13 = r2.get(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r13 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.C4795b) r13
            if (r13 != 0) goto L_0x01a7
            r13 = 0
            goto L_0x01ef
        L_0x01a7:
            r14 = r11 & 1
            if (r14 == 0) goto L_0x01b5
            long r14 = r10.mo25612p()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r12 = r13.f12440a
            r12.f12512b = r14
            r12.f12513c = r14
        L_0x01b5:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r12 = r13.f12443d
            r14 = r11 & 2
            if (r14 == 0) goto L_0x01c1
            int r14 = r10.mo25611o()
            int r14 = r14 - r7
            goto L_0x01c3
        L_0x01c1:
            int r14 = r12.f12403a
        L_0x01c3:
            r15 = r11 & 8
            if (r15 == 0) goto L_0x01cc
            int r15 = r10.mo25611o()
            goto L_0x01ce
        L_0x01cc:
            int r15 = r12.f12404b
        L_0x01ce:
            r19 = r11 & 16
            if (r19 == 0) goto L_0x01d9
            int r19 = r10.mo25611o()
            r7 = r19
            goto L_0x01db
        L_0x01d9:
            int r7 = r12.f12405c
        L_0x01db:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x01e4
            int r10 = r10.mo25611o()
            goto L_0x01e6
        L_0x01e4:
            int r10 = r12.f12406d
        L_0x01e6:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r11 = r13.f12440a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
            r12.<init>(r14, r15, r7, r10)
            r11.f12511a = r12
        L_0x01ef:
            if (r13 != 0) goto L_0x01fe
            r34 = r1
            r21 = r2
            r48 = r3
            r23 = r6
            r32 = r8
            r1 = 1
            goto L_0x064d
        L_0x01fe:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r7 = r13.f12440a
            long r10 = r7.f12528r
            r13.mo25269a()
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12372x
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r14 = r9.mo25262d(r12)
            if (r14 == 0) goto L_0x022e
            r14 = r3 & 2
            if (r14 != 0) goto L_0x022e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r10 = r9.mo25262d(r12)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r10.f12382P0
            r10.mo25600e(r5)
            int r11 = r10.mo25595c()
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r11)
            r12 = 1
            if (r11 != r12) goto L_0x022a
            long r10 = r10.mo25612p()
            goto L_0x022e
        L_0x022a:
            long r10 = r10.mo25609m()
        L_0x022e:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r12 = r9.f12380Q0
            int r14 = r12.size()
            r21 = r2
            r2 = 0
            r5 = 0
            r15 = 0
        L_0x0239:
            if (r15 >= r14) goto L_0x0267
            java.lang.Object r22 = r12.get(r15)
            r23 = r6
            r6 = r22
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b) r6
            r24 = r10
            int r10 = r6.f12378a
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12286A
            if (r10 != r11) goto L_0x025e
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r6.f12382P0
            r10 = 12
            r6.mo25600e(r10)
            int r6 = r6.mo25611o()
            if (r6 <= 0) goto L_0x0260
            int r2 = r2 + r6
            int r5 = r5 + 1
            goto L_0x0260
        L_0x025e:
            r10 = 12
        L_0x0260:
            int r15 = r15 + 1
            r6 = r23
            r10 = r24
            goto L_0x0239
        L_0x0267:
            r23 = r6
            r24 = r10
            r6 = 0
            r10 = 12
            r13.f12446g = r6
            r13.f12445f = r6
            r13.f12444e = r6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r6 = r13.f12440a
            r6.f12514d = r5
            r6.f12515e = r2
            int[] r11 = r6.f12517g
            if (r11 == 0) goto L_0x0281
            int r11 = r11.length
            if (r11 >= r5) goto L_0x0289
        L_0x0281:
            long[] r11 = new long[r5]
            r6.f12516f = r11
            int[] r5 = new int[r5]
            r6.f12517g = r5
        L_0x0289:
            int[] r5 = r6.f12518h
            if (r5 == 0) goto L_0x0290
            int r5 = r5.length
            if (r5 >= r2) goto L_0x02a8
        L_0x0290:
            int r2 = r2 * 125
            int r2 = r2 / 100
            int[] r5 = new int[r2]
            r6.f12518h = r5
            int[] r5 = new int[r2]
            r6.f12519i = r5
            long[] r5 = new long[r2]
            r6.f12520j = r5
            boolean[] r5 = new boolean[r2]
            r6.f12521k = r5
            boolean[] r2 = new boolean[r2]
            r6.f12523m = r2
        L_0x02a8:
            r2 = 0
            r5 = 0
            r6 = 0
        L_0x02ab:
            r26 = 0
            if (r2 >= r14) goto L_0x044b
            java.lang.Object r18 = r12.get(r2)
            r10 = r18
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r10 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b) r10
            int r15 = r10.f12378a
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12286A
            if (r15 != r11) goto L_0x041c
            int r11 = r5 + 1
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r10.f12382P0
            r15 = 8
            r10.mo25600e(r15)
            int r15 = r10.mo25595c()
            int r29 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12328b
            r16 = 16777215(0xffffff, float:2.3509886E-38)
            r15 = r15 & r16
            r29 = r11
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r11 = r13.f12442c
            r30 = r12
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r12 = r13.f12440a
            r31 = r14
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r14 = r12.f12511a
            int[] r0 = r12.f12517g
            int r32 = r10.mo25611o()
            r0[r5] = r32
            long[] r0 = r12.f12516f
            r33 = r7
            r32 = r8
            long r7 = r12.f12512b
            r0[r5] = r7
            r7 = r15 & 1
            if (r7 == 0) goto L_0x0302
            r7 = r0[r5]
            r34 = r1
            int r1 = r10.mo25595c()
            r35 = r2
            long r1 = (long) r1
            long r7 = r7 + r1
            r0[r5] = r7
            goto L_0x0306
        L_0x0302:
            r34 = r1
            r35 = r2
        L_0x0306:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x030c
            r0 = 1
            goto L_0x030d
        L_0x030c:
            r0 = 0
        L_0x030d:
            int r1 = r14.f12406d
            if (r0 == 0) goto L_0x0315
            int r1 = r10.mo25611o()
        L_0x0315:
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x031b
            r2 = 1
            goto L_0x031c
        L_0x031b:
            r2 = 0
        L_0x031c:
            r7 = r15 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x0322
            r7 = 1
            goto L_0x0323
        L_0x0322:
            r7 = 0
        L_0x0323:
            r8 = r15 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0329
            r8 = 1
            goto L_0x032a
        L_0x0329:
            r8 = 0
        L_0x032a:
            r15 = r15 & 2048(0x800, float:2.87E-42)
            r36 = r1
            if (r15 == 0) goto L_0x0332
            r15 = 1
            goto L_0x0333
        L_0x0332:
            r15 = 0
        L_0x0333:
            long[] r1 = r11.f12506i
            r37 = r4
            if (r1 == 0) goto L_0x035a
            int r4 = r1.length
            r38 = r13
            r13 = 1
            if (r4 != r13) goto L_0x0357
            r4 = 0
            r39 = r1[r4]
            int r1 = (r39 > r26 ? 1 : (r39 == r26 ? 0 : -1))
            if (r1 != 0) goto L_0x0357
            long[] r1 = r11.f12507j
            r39 = r1[r4]
            r4 = r8
            r1 = r9
            long r8 = r11.f12500c
            r41 = 1000(0x3e8, double:4.94E-321)
            r43 = r8
            long r26 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r39, (long) r41, (long) r43)
            goto L_0x035e
        L_0x0357:
            r4 = r8
            r1 = r9
            goto L_0x035e
        L_0x035a:
            r4 = r8
            r1 = r9
            r38 = r13
        L_0x035e:
            int[] r8 = r12.f12518h
            int[] r9 = r12.f12519i
            long[] r13 = r12.f12520j
            r39 = r1
            boolean[] r1 = r12.f12521k
            r40 = r1
            int r1 = r11.f12499b
            r41 = r8
            r8 = 2
            if (r1 != r8) goto L_0x0377
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0377
            r1 = 1
            goto L_0x0378
        L_0x0377:
            r1 = 0
        L_0x0378:
            int[] r8 = r12.f12517g
            r8 = r8[r5]
            int r8 = r8 + r6
            r48 = r3
            r28 = r4
            long r3 = r11.f12500c
            if (r5 <= 0) goto L_0x0389
            r11 = r6
            long r5 = r12.f12528r
            goto L_0x038c
        L_0x0389:
            r11 = r6
            r5 = r24
        L_0x038c:
            if (r11 >= r8) goto L_0x0413
            if (r2 == 0) goto L_0x0399
            int r42 = r10.mo25611o()
            r49 = r2
            r2 = r42
            goto L_0x039d
        L_0x0399:
            r49 = r2
            int r2 = r14.f12404b
        L_0x039d:
            if (r7 == 0) goto L_0x03a8
            int r42 = r10.mo25611o()
            r50 = r7
            r7 = r42
            goto L_0x03ac
        L_0x03a8:
            r50 = r7
            int r7 = r14.f12405c
        L_0x03ac:
            if (r11 != 0) goto L_0x03b5
            if (r0 == 0) goto L_0x03b5
            r51 = r0
            r0 = r36
            goto L_0x03c4
        L_0x03b5:
            if (r28 == 0) goto L_0x03c0
            int r42 = r10.mo25595c()
            r51 = r0
            r0 = r42
            goto L_0x03c4
        L_0x03c0:
            r51 = r0
            int r0 = r14.f12406d
        L_0x03c4:
            if (r15 == 0) goto L_0x03d8
            r52 = r8
            int r8 = r10.mo25595c()
            int r8 = r8 * 1000
            r53 = r14
            r54 = r15
            long r14 = (long) r8
            long r14 = r14 / r3
            int r8 = (int) r14
            r9[r11] = r8
            goto L_0x03e1
        L_0x03d8:
            r52 = r8
            r53 = r14
            r54 = r15
            r8 = 0
            r9[r11] = r8
        L_0x03e1:
            r44 = 1000(0x3e8, double:4.94E-321)
            r42 = r5
            r46 = r3
            long r14 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15388a((long) r42, (long) r44, (long) r46)
            long r14 = r14 - r26
            r13[r11] = r14
            r41[r11] = r7
            r7 = 16
            int r0 = r0 >> r7
            r7 = 1
            r0 = r0 & r7
            if (r0 != 0) goto L_0x03fe
            if (r1 == 0) goto L_0x03fc
            if (r11 != 0) goto L_0x03fe
        L_0x03fc:
            r0 = 1
            goto L_0x03ff
        L_0x03fe:
            r0 = 0
        L_0x03ff:
            r40[r11] = r0
            long r7 = (long) r2
            long r5 = r5 + r7
            int r11 = r11 + 1
            r2 = r49
            r7 = r50
            r0 = r51
            r8 = r52
            r14 = r53
            r15 = r54
            goto L_0x038c
        L_0x0413:
            r52 = r8
            r12.f12528r = r5
            r5 = r29
            r6 = r52
            goto L_0x0431
        L_0x041c:
            r34 = r1
            r35 = r2
            r48 = r3
            r37 = r4
            r11 = r6
            r33 = r7
            r32 = r8
            r39 = r9
            r30 = r12
            r38 = r13
            r31 = r14
        L_0x0431:
            int r2 = r35 + 1
            r0 = r56
            r12 = r30
            r14 = r31
            r8 = r32
            r7 = r33
            r1 = r34
            r4 = r37
            r13 = r38
            r9 = r39
            r3 = r48
            r10 = 12
            goto L_0x02ab
        L_0x044b:
            r34 = r1
            r48 = r3
            r37 = r4
            r33 = r7
            r32 = r8
            r39 = r9
            r38 = r13
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12333d0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r9.mo25262d(r0)
            if (r0 == 0) goto L_0x04df
            r13 = r38
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r1 = r13.f12442c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r1 = r1.f12505h
            r2 = r33
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r3 = r2.f12511a
            int r3 = r3.f12403a
            r1 = r1[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12382P0
            int r1 = r1.f12509a
            r3 = 8
            r0.mo25600e(r3)
            int r4 = r0.mo25595c()
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12328b
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r6
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0489
            r0.mo25602f(r3)
        L_0x0489:
            int r3 = r0.mo25608l()
            int r4 = r0.mo25611o()
            int r5 = r2.f12515e
            if (r4 != r5) goto L_0x04be
            if (r3 != 0) goto L_0x04ac
            boolean[] r3 = r2.f12523m
            r5 = 0
            r6 = 0
        L_0x049b:
            if (r5 >= r4) goto L_0x04ba
            int r7 = r0.mo25608l()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x04a6
            r7 = 1
            goto L_0x04a7
        L_0x04a6:
            r7 = 0
        L_0x04a7:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x049b
        L_0x04ac:
            if (r3 <= r1) goto L_0x04b0
            r0 = 1
            goto L_0x04b1
        L_0x04b0:
            r0 = 0
        L_0x04b1:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.f12523m
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x04ba:
            r2.mo25273a(r6)
            goto L_0x04e1
        L_0x04be:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Length mismatch: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ", "
            r1.append(r3)
            int r2 = r2.f12515e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04df:
            r2 = r33
        L_0x04e1:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12335e0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r9.mo25262d(r0)
            if (r0 == 0) goto L_0x0534
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12382P0
            r1 = 8
            r0.mo25600e(r1)
            int r3 = r0.mo25595c()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12328b
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r3 & r5
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0502
            r0.mo25602f(r1)
        L_0x0502:
            int r1 = r0.mo25611o()
            if (r1 != r5) goto L_0x051d
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r3)
            long r3 = r2.f12513c
            if (r1 != 0) goto L_0x0515
            long r0 = r0.mo25609m()
            goto L_0x0519
        L_0x0515:
            long r0 = r0.mo25612p()
        L_0x0519:
            long r3 = r3 + r0
            r2.f12513c = r3
            goto L_0x0534
        L_0x051d:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected saio entry count: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0534:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12343i0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r9.mo25262d(r0)
            if (r0 == 0) goto L_0x0542
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12382P0
            r1 = 0
            m14717a(r0, r1, r2)
        L_0x0542:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12337f0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r9.mo25262d(r0)
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12339g0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r1 = r9.mo25262d(r1)
            if (r0 == 0) goto L_0x05f3
            if (r1 == 0) goto L_0x05f3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12382P0
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r1.f12382P0
            r3 = 8
            r0.mo25600e(r3)
            int r3 = r0.mo25595c()
            int r4 = r0.mo25595c()
            int r5 = f12407D
            if (r4 == r5) goto L_0x0569
            goto L_0x05f3
        L_0x0569:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r3)
            r4 = 4
            r6 = 1
            if (r3 != r6) goto L_0x0574
            r0.mo25602f(r4)
        L_0x0574:
            int r0 = r0.mo25595c()
            if (r0 != r6) goto L_0x05eb
            r0 = 8
            r1.mo25600e(r0)
            int r0 = r1.mo25595c()
            int r3 = r1.mo25595c()
            if (r3 == r5) goto L_0x058b
            r1 = r6
            goto L_0x05f4
        L_0x058b:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r0)
            if (r0 != r6) goto L_0x05a3
            long r3 = r1.mo25609m()
            int r0 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r0 == 0) goto L_0x059b
            r3 = 2
            goto L_0x05a9
        L_0x059b:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05a3:
            r3 = 2
            if (r0 < r3) goto L_0x05a9
            r1.mo25602f(r4)
        L_0x05a9:
            long r4 = r1.mo25609m()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x05e3
            r1.mo25602f(r3)
            int r0 = r1.mo25608l()
            r3 = 1
            if (r0 != r3) goto L_0x05bf
            r12 = 1
            goto L_0x05c0
        L_0x05bf:
            r12 = 0
        L_0x05c0:
            if (r12 != 0) goto L_0x05c3
            goto L_0x05f3
        L_0x05c3:
            int r0 = r1.mo25608l()
            r3 = 16
            byte[] r4 = new byte[r3]
            byte[] r5 = r1.f13444a
            int r6 = r1.f13445b
            r7 = 0
            java.lang.System.arraycopy(r5, r6, r4, r7, r3)
            int r5 = r1.f13445b
            int r5 = r5 + r3
            r1.f13445b = r5
            r1 = 1
            r2.f12522l = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i
            r3.<init>(r12, r0, r4)
            r2.f12524n = r3
            goto L_0x05f4
        L_0x05e3:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05eb:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05f3:
            r1 = 1
        L_0x05f4:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r0 = r9.f12380Q0
            int r0 = r0.size()
            r6 = 0
        L_0x05fb:
            if (r6 >= r0) goto L_0x063c
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r9.f12380Q0
            java.lang.Object r3 = r3.get(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b) r3
            int r4 = r3.f12378a
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12341h0
            if (r4 != r5) goto L_0x0630
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r3.f12382P0
            r4 = 8
            r3.mo25600e(r4)
            byte[] r5 = r3.f13444a
            int r7 = r3.f13445b
            r8 = r37
            r10 = 16
            r11 = 0
            java.lang.System.arraycopy(r5, r7, r8, r11, r10)
            int r5 = r3.f13445b
            int r5 = r5 + r10
            r3.f13445b = r5
            byte[] r5 = f12408E
            boolean r5 = java.util.Arrays.equals(r8, r5)
            if (r5 != 0) goto L_0x062c
            goto L_0x0637
        L_0x062c:
            m14717a(r3, r10, r2)
            goto L_0x0637
        L_0x0630:
            r8 = r37
            r4 = 8
            r10 = 16
            r11 = 0
        L_0x0637:
            int r6 = r6 + 1
            r37 = r8
            goto L_0x05fb
        L_0x063c:
            r8 = r37
            r4 = 8
            r11 = 0
            goto L_0x0650
        L_0x0642:
            r34 = r1
            r21 = r2
            r48 = r3
            r23 = r6
            r1 = r7
            r32 = r8
        L_0x064d:
            r11 = 0
            r8 = r4
            r4 = r5
        L_0x0650:
            int r0 = r32 + 1
            r7 = r1
            r5 = r4
            r4 = r8
            r2 = r21
            r6 = r23
            r1 = r34
            r3 = r48
            r8 = r0
            r0 = r56
            goto L_0x016e
        L_0x0662:
            r0 = r1
            r11 = 0
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r0 = r0.f12380Q0
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r0 = m14716a((java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b>) r0)
            if (r0 == 0) goto L_0x0000
            r1 = r56
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r1.f12413b
            int r2 = r2.size()
            r6 = r11
        L_0x0675:
            if (r6 >= r2) goto L_0x070b
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r3 = r1.f12413b
            java.lang.Object r3 = r3.valueAt(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.C4795b) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r4 = r3.f12441b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r3 = r3.f12442c
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r3.f12503f
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r12 = r5
            java.lang.String r13 = r3.f12951a
            java.lang.String r14 = r3.f12955e
            java.lang.String r15 = r3.f12956f
            java.lang.String r7 = r3.f12953c
            r16 = r7
            int r7 = r3.f12952b
            r17 = r7
            int r7 = r3.f12957g
            r18 = r7
            int r7 = r3.f12960j
            r19 = r7
            int r7 = r3.f12961k
            r20 = r7
            float r7 = r3.f12962l
            r21 = r7
            int r7 = r3.f12963m
            r22 = r7
            float r7 = r3.f12964n
            r23 = r7
            byte[] r7 = r3.f12966p
            r24 = r7
            int r7 = r3.f12965o
            r25 = r7
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r7 = r3.f12967q
            r26 = r7
            int r7 = r3.f12968r
            r27 = r7
            int r7 = r3.f12969s
            r28 = r7
            int r7 = r3.f12970t
            r29 = r7
            int r7 = r3.f12971u
            r30 = r7
            int r7 = r3.f12972v
            r31 = r7
            int r7 = r3.f12974x
            r32 = r7
            java.lang.String r7 = r3.f12975y
            r33 = r7
            int r7 = r3.f12976z
            r34 = r7
            long r7 = r3.f12973w
            r35 = r7
            java.util.List<byte[]> r7 = r3.f12958h
            r37 = r7
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r3 = r3.f12954d
            r39 = r3
            r38 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39)
            r4.mo25149a(r5)
            int r6 = r6 + 1
            goto L_0x0675
        L_0x06f1:
            r55 = r1
            r1 = r0
            r0 = r55
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r2 = r1.f12421j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x070b
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r2 = r1.f12421j
            java.lang.Object r2 = r2.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4785a) r2
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r2 = r2.f12381R0
            r2.add(r0)
        L_0x070b:
            r0 = r1
            goto L_0x0002
        L_0x070e:
            r1 = r0
            r56.mo25266a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.mo25267a(long):void");
    }

    /* renamed from: a */
    public static void m14717a(C5036k kVar, int i, C4802j jVar) throws C4873l {
        kVar.mo25600e(i + 8);
        int c = kVar.mo25595c();
        int i2 = C4784a.f12328b;
        int i3 = c & ViewCompat.MEASURED_SIZE_MASK;
        if ((i3 & 1) == 0) {
            boolean z = (i3 & 2) != 0;
            int o = kVar.mo25611o();
            if (o == jVar.f12515e) {
                Arrays.fill(jVar.f12523m, 0, o, z);
                jVar.mo25273a(kVar.mo25588a());
                kVar.mo25592a(jVar.f12526p.f13444a, 0, jVar.f12525o);
                jVar.f12526p.mo25600e(0);
                jVar.f12527q = false;
                return;
            }
            throw new C4873l("Length mismatch: " + o + ", " + jVar.f12515e);
        }
        throw new C4873l("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a m14716a(java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L_0x0008:
            if (r3 >= r0) goto L_0x00bc
            java.lang.Object r5 = r14.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.C4786b) r5
            int r6 = r5.f12378a
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.f12322V
            if (r6 != r7) goto L_0x00b8
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r5.f12382P0
            byte[] r5 = r5.f13444a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r6.<init>((byte[]) r5)
            int r8 = r6.f13446c
            r9 = 32
            if (r8 >= r9) goto L_0x002d
            goto L_0x0088
        L_0x002d:
            r6.mo25600e(r1)
            int r8 = r6.mo25595c()
            int r9 = r6.mo25588a()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x003d
            goto L_0x0088
        L_0x003d:
            int r8 = r6.mo25595c()
            if (r8 == r7) goto L_0x0044
            goto L_0x0088
        L_0x0044:
            int r7 = r6.mo25595c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4784a.m14700b(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x0066
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x0088
        L_0x0066:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo25605i()
            long r12 = r6.mo25605i()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x007e
            int r7 = r6.mo25611o()
            int r7 = r7 * 16
            r6.mo25602f(r7)
        L_0x007e:
            int r7 = r6.mo25611o()
            int r8 = r6.mo25588a()
            if (r7 == r8) goto L_0x008a
        L_0x0088:
            r6 = r2
            goto L_0x009c
        L_0x008a:
            byte[] r8 = new byte[r7]
            byte[] r10 = r6.f13444a
            int r11 = r6.f13445b
            java.lang.System.arraycopy(r10, r11, r8, r1, r7)
            int r10 = r6.f13445b
            int r10 = r10 + r7
            r6.f13445b = r10
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x009c:
            if (r6 != 0) goto L_0x00a0
            r6 = r2
            goto L_0x00a4
        L_0x00a0:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x00a4:
            if (r6 != 0) goto L_0x00ae
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00b8
        L_0x00ae:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        L_0x00b8:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00bc:
            if (r4 != 0) goto L_0x00bf
            goto L_0x00d0
        L_0x00bf:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a
            int r14 = r4.size()
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a.C4704b[r14]
            java.lang.Object[] r14 = r4.toArray(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4702a.C4704b[]) r14
            r2.<init>(r1, r14)
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4793d.m14716a(java.util.List):com.fyber.inneractive.sdk.player.exoplayer2.drm.a");
    }
}
