package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4723f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5035j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5036k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r;
import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p */
public final class C4844p implements C4723f {

    /* renamed from: a */
    public final C5046r f12794a;

    /* renamed from: b */
    public final SparseArray<C4845a> f12795b = new SparseArray<>();

    /* renamed from: c */
    public final C5036k f12796c = new C5036k(4096);

    /* renamed from: d */
    public boolean f12797d;

    /* renamed from: e */
    public boolean f12798e;

    /* renamed from: f */
    public boolean f12799f;

    /* renamed from: g */
    public C4731h f12800g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a */
    public static final class C4845a {

        /* renamed from: a */
        public final C4831h f12801a;

        /* renamed from: b */
        public final C5046r f12802b;

        /* renamed from: c */
        public final C5035j f12803c = new C5035j(new byte[64]);

        /* renamed from: d */
        public boolean f12804d;

        /* renamed from: e */
        public boolean f12805e;

        /* renamed from: f */
        public boolean f12806f;

        /* renamed from: g */
        public long f12807g;

        public C4845a(C4831h hVar, C5046r rVar) {
            this.f12801a = hVar;
            this.f12802b = rVar;
        }
    }

    public C4844p(C5046r rVar) {
        this.f12794a = rVar;
    }

    /* renamed from: b */
    public void mo25167b() {
    }

    /* renamed from: a */
    public boolean mo25166a(C4730g gVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        C4715b bVar = (C4715b) gVar;
        bVar.mo25136a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bVar.mo25135a(bArr[13] & 7, false);
        bVar.mo25136a(bArr, 0, 3, false);
        if (1 == (((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo25165a(C4731h hVar) {
        this.f12800g = hVar;
        hVar.mo25174a(new C4767m.C4768a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo25164a(long j, long j2) {
        this.f12794a.f13470c = -9223372036854775807L;
        for (int i = 0; i < this.f12795b.size(); i++) {
            C4845a valueAt = this.f12795b.valueAt(i);
            valueAt.f12806f = false;
            valueAt.f12801a.mo25293a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4730g r14, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4766l r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r13 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            byte[] r15 = r15.f13444a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4715b) r14
            r0 = 0
            r1 = 4
            r2 = 1
            boolean r15 = r14.mo25136a(r15, r0, r1, r2)
            r3 = -1
            if (r15 != 0) goto L_0x0011
            return r3
        L_0x0011:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            r15.mo25600e(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            int r15 = r15.mo25595c()
            r4 = 441(0x1b9, float:6.18E-43)
            if (r15 != r4) goto L_0x0021
            return r3
        L_0x0021:
            r3 = 442(0x1ba, float:6.2E-43)
            if (r15 != r3) goto L_0x0043
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            byte[] r15 = r15.f13444a
            r1 = 10
            r14.mo25136a(r15, r0, r1, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            r1 = 9
            r15.mo25600e(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            int r15 = r15.mo25608l()
            r15 = r15 & 7
            int r15 = r15 + 14
            r14.mo25139c(r15)
            return r0
        L_0x0043:
            r3 = 443(0x1bb, float:6.21E-43)
            r4 = 2
            r5 = 6
            if (r15 != r3) goto L_0x0060
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            byte[] r15 = r15.f13444a
            r14.mo25136a(r15, r0, r4, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            r15.mo25600e(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            int r15 = r15.mo25613q()
            int r15 = r15 + r5
            r14.mo25139c(r15)
            return r0
        L_0x0060:
            r3 = r15 & -256(0xffffffffffffff00, float:NaN)
            r6 = 8
            int r3 = r3 >> r6
            if (r3 == r2) goto L_0x006b
            r14.mo25139c(r2)
            return r0
        L_0x006b:
            r15 = r15 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a> r3 = r13.f12795b
            java.lang.Object r3 = r3.get(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4844p.C4845a) r3
            boolean r7 = r13.f12797d
            if (r7 != 0) goto L_0x00e2
            if (r3 != 0) goto L_0x00ca
            boolean r7 = r13.f12798e
            r8 = 0
            if (r7 != 0) goto L_0x008d
            r9 = 189(0xbd, float:2.65E-43)
            if (r15 != r9) goto L_0x008d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b
            r7.<init>(r8)
            r13.f12798e = r2
        L_0x008b:
            r8 = r7
            goto L_0x00ae
        L_0x008d:
            if (r7 != 0) goto L_0x009d
            r7 = r15 & 224(0xe0, float:3.14E-43)
            r9 = 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x009d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m
            r7.<init>(r8)
            r13.f12798e = r2
            goto L_0x008b
        L_0x009d:
            boolean r7 = r13.f12799f
            if (r7 != 0) goto L_0x00ae
            r7 = r15 & 240(0xf0, float:3.36E-43)
            r9 = 224(0xe0, float:3.14E-43)
            if (r7 != r9) goto L_0x00ae
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i
            r8.<init>()
            r13.f12799f = r2
        L_0x00ae:
            if (r8 == 0) goto L_0x00ca
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 256(0x100, float:3.59E-43)
            r3.<init>(r7, r15, r9)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r7 = r13.f12800g
            r8.mo25295a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h) r7, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4853v.C4857d) r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r7 = r13.f12794a
            r3.<init>(r8, r7)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a> r7 = r13.f12795b
            r7.put(r15, r3)
        L_0x00ca:
            boolean r15 = r13.f12798e
            if (r15 == 0) goto L_0x00d2
            boolean r15 = r13.f12799f
            if (r15 != 0) goto L_0x00db
        L_0x00d2:
            long r7 = r14.f11871c
            r9 = 1048576(0x100000, double:5.180654E-318)
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 <= 0) goto L_0x00e2
        L_0x00db:
            r13.f12797d = r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r15 = r13.f12800g
            r15.mo25175c()
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            byte[] r15 = r15.f13444a
            r14.mo25136a(r15, r0, r4, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            r15.mo25600e(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12796c
            int r15 = r15.mo25613q()
            int r15 = r15 + r5
            if (r3 != 0) goto L_0x00fc
            r14.mo25139c(r15)
            goto L_0x01df
        L_0x00fc:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r13.f12796c
            r4.mo25596c(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r13.f12796c
            byte[] r4 = r4.f13444a
            r14.mo25138b(r4, r0, r15, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r13.f12796c
            r14.mo25600e(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r13.f12796c
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            byte[] r15 = r15.f13440a
            r4 = 3
            r14.mo25592a(r15, r0, r4)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            r15.mo25585b(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            r15.mo25587c(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            boolean r15 = r15.mo25586b()
            r3.f12804d = r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            boolean r15 = r15.mo25586b()
            r3.f12805e = r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            r15.mo25587c(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            int r15 = r15.mo25583a(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r5 = r3.f12803c
            byte[] r5 = r5.f13440a
            r14.mo25592a(r5, r0, r15)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            r15.mo25585b(r0)
            r5 = 0
            r3.f12807g = r5
            boolean r15 = r3.f12804d
            if (r15 == 0) goto L_0x01c5
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            r15.mo25587c(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            int r15 = r15.mo25583a(r4)
            long r5 = (long) r15
            r15 = 30
            long r5 = r5 << r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12803c
            r7.mo25587c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12803c
            r8 = 15
            int r7 = r7.mo25583a(r8)
            int r7 = r7 << r8
            long r9 = (long) r7
            long r5 = r5 | r9
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12803c
            r7.mo25587c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12803c
            int r7 = r7.mo25583a(r8)
            long r9 = (long) r7
            long r5 = r5 | r9
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12803c
            r7.mo25587c(r2)
            boolean r7 = r3.f12806f
            if (r7 != 0) goto L_0x01bd
            boolean r7 = r3.f12805e
            if (r7 == 0) goto L_0x01bd
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12803c
            r7.mo25587c(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r1 = r3.f12803c
            int r1 = r1.mo25583a(r4)
            long r9 = (long) r1
            long r9 = r9 << r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            r15.mo25587c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            int r15 = r15.mo25583a(r8)
            int r15 = r15 << r8
            long r11 = (long) r15
            long r9 = r9 | r11
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            r15.mo25587c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            int r15 = r15.mo25583a(r8)
            long r7 = (long) r15
            long r7 = r7 | r9
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12803c
            r15.mo25587c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r15 = r3.f12802b
            r15.mo25635b(r7)
            r3.f12806f = r2
        L_0x01bd:
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r15 = r3.f12802b
            long r4 = r15.mo25635b(r5)
            r3.f12807g = r4
        L_0x01c5:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h r15 = r3.f12801a
            long r4 = r3.f12807g
            r15.mo25294a((long) r4, (boolean) r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h r15 = r3.f12801a
            r15.mo25296a(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h r14 = r3.f12801a
            r14.mo25297b()
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r13.f12796c
            int r15 = r14.mo25593b()
            r14.mo25598d(r15)
        L_0x01df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p190ts.C4844p.mo25163a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }
}
