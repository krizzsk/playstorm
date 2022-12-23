package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C4864h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4717d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4731h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4767m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4804n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4734c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4918b;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4919c;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4944o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4945p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4920a;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4971b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5015x;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5031h;
import java.io.IOException;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j */
public final class C4744j implements C5015x.C5016a<C4920a>, C4945p, C4731h, C4717d.C4721d {

    /* renamed from: a */
    public final int f12011a;

    /* renamed from: b */
    public final C4746b f12012b;

    /* renamed from: c */
    public final C4734c f12013c;

    /* renamed from: d */
    public final C4971b f12014d;

    /* renamed from: e */
    public final C4869i f12015e;

    /* renamed from: f */
    public final int f12016f;

    /* renamed from: g */
    public final C5015x f12017g = new C5015x("Loader:HlsSampleStreamWrapper");

    /* renamed from: h */
    public final C4926f.C4927a f12018h;

    /* renamed from: i */
    public final C4734c.C4736b f12019i = new C4734c.C4736b();

    /* renamed from: j */
    public final SparseArray<C4717d> f12020j = new SparseArray<>();

    /* renamed from: k */
    public final LinkedList<C4740f> f12021k = new LinkedList<>();

    /* renamed from: l */
    public final Runnable f12022l = new C4745a();

    /* renamed from: m */
    public final Handler f12023m = new Handler();

    /* renamed from: n */
    public boolean f12024n;

    /* renamed from: o */
    public boolean f12025o;

    /* renamed from: p */
    public int f12026p;

    /* renamed from: q */
    public C4869i f12027q;

    /* renamed from: r */
    public int f12028r;

    /* renamed from: s */
    public boolean f12029s;

    /* renamed from: t */
    public C4948s f12030t;

    /* renamed from: u */
    public int f12031u;

    /* renamed from: v */
    public boolean[] f12032v;

    /* renamed from: w */
    public long f12033w;

    /* renamed from: x */
    public long f12034x;

    /* renamed from: y */
    public boolean f12035y;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$a */
    public class C4745a implements Runnable {
        public C4745a() {
        }

        public void run() {
            C4744j.this.mo25222i();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b */
    public interface C4746b {
    }

    public C4744j(int i, C4746b bVar, C4734c cVar, C4971b bVar2, long j, C4869i iVar, int i2, C4926f.C4927a aVar) {
        this.f12011a = i;
        this.f12012b = bVar;
        this.f12013c = cVar;
        this.f12014d = bVar2;
        this.f12015e = iVar;
        this.f12016f = i2;
        this.f12018h = aVar;
        this.f12033w = j;
        this.f12034x = j;
    }

    /* renamed from: a */
    public void mo25174a(C4767m mVar) {
    }

    /* renamed from: a */
    public void mo25217a(C5015x.C5018c cVar, long j, long j2, boolean z) {
        C4920a aVar = (C4920a) cVar;
        C4926f.C4927a aVar2 = this.f12018h;
        C5000j jVar = aVar.f13101a;
        int i = aVar.f13102b;
        int i2 = this.f12011a;
        C4869i iVar = aVar.f13103c;
        int i3 = aVar.f13104d;
        Object obj = aVar.f13105e;
        long j3 = aVar.f13106f;
        long j4 = aVar.f13107g;
        long c = aVar.mo25187c();
        if (aVar2.f13122b != null) {
            Handler handler = aVar2.f13121a;
            C4919c cVar2 = r2;
            C4919c cVar3 = new C4919c(aVar2, jVar, i, i2, iVar, i3, obj, j3, j4, j, j2, c);
            handler.post(cVar2);
        }
        if (!z) {
            int size = this.f12020j.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f12020j.valueAt(i4).mo25151a(this.f12032v[i4]);
            }
            ((C4741g) this.f12012b).mo25194a((C4945p) this);
        }
    }

    /* renamed from: c */
    public void mo25175c() {
        this.f12024n = true;
        this.f12023m.post(this.f12022l);
    }

    /* renamed from: d */
    public void mo25219d(long j) {
        this.f12033w = j;
        this.f12034x = j;
        this.f12035y = false;
        this.f12021k.clear();
        if (this.f12017g.mo25567b()) {
            this.f12017g.mo25566a();
            return;
        }
        int size = this.f12020j.size();
        for (int i = 0; i < size; i++) {
            this.f12020j.valueAt(i).mo25151a(this.f12032v[i]);
        }
    }

    /* renamed from: g */
    public void mo25220g() {
        if (!this.f12025o) {
            mo25195a(this.f12033w);
        }
    }

    /* renamed from: h */
    public final boolean mo25221h() {
        return this.f12034x != -9223372036854775807L;
    }

    /* renamed from: i */
    public final void mo25222i() {
        if (!this.f12029s && !this.f12025o && this.f12024n) {
            int size = this.f12020j.size();
            int i = 0;
            while (i < size) {
                if (this.f12020j.valueAt(i).mo25156e() != null) {
                    i++;
                } else {
                    return;
                }
            }
            int size2 = this.f12020j.size();
            int i2 = 0;
            char c = 0;
            int i3 = -1;
            while (true) {
                char c2 = 3;
                if (i2 >= size2) {
                    break;
                }
                String str = this.f12020j.valueAt(i2).mo25156e().f12956f;
                if (!C5031h.m15319e(str)) {
                    if (C5031h.m15318d(str)) {
                        c2 = 2;
                    } else {
                        c2 = "text".equals(C5031h.m15316b(str)) ? (char) 1 : 0;
                    }
                }
                if (c2 > c) {
                    i3 = i2;
                    c = c2;
                } else if (c2 == c && i3 != -1) {
                    i3 = -1;
                }
                i2++;
            }
            C4947r rVar = this.f12013c.f11947f;
            int i4 = rVar.f13194a;
            this.f12031u = -1;
            this.f12032v = new boolean[size2];
            C4947r[] rVarArr = new C4947r[size2];
            for (int i5 = 0; i5 < size2; i5++) {
                C4869i e = this.f12020j.valueAt(i5).mo25156e();
                if (i5 == i3) {
                    C4869i[] iVarArr = new C4869i[i4];
                    for (int i6 = 0; i6 < i4; i6++) {
                        iVarArr[i6] = m14587a(rVar.f13195b[i6], e);
                    }
                    rVarArr[i5] = new C4947r(iVarArr);
                    this.f12031u = i5;
                } else {
                    rVarArr[i5] = new C4947r(m14587a((c != 3 || !C5031h.m15318d(e.f12956f)) ? null : this.f12015e, e));
                }
            }
            this.f12030t = new C4948s(rVarArr);
            this.f12025o = true;
            C4741g gVar = (C4741g) this.f12012b;
            int i7 = gVar.f11998k - 1;
            gVar.f11998k = i7;
            if (i7 <= 0) {
                int i8 = 0;
                for (C4744j jVar : gVar.f12001n) {
                    i8 += jVar.f12030t.f13198a;
                }
                C4947r[] rVarArr2 = new C4947r[i8];
                int i9 = 0;
                for (C4744j jVar2 : gVar.f12001n) {
                    int i10 = jVar2.f12030t.f13198a;
                    int i11 = 0;
                    while (i11 < i10) {
                        rVarArr2[i9] = jVar2.f12030t.f13199b[i11];
                        i11++;
                        i9++;
                    }
                }
                gVar.f12000m = new C4948s(rVarArr2);
                ((C4864h) gVar.f11997j).f12899f.obtainMessage(8, gVar).sendToTarget();
            }
        }
    }

    /* renamed from: j */
    public void mo25223j() throws IOException {
        this.f12017g.mo25568c();
        C4734c cVar = this.f12013c;
        IOException iOException = cVar.f11951j;
        if (iOException == null) {
            C4749a.C4750a aVar = cVar.f11952k;
            if (aVar != null) {
                C4756e.C4757a aVar2 = cVar.f11946e.f12106e.get(aVar);
                aVar2.f12117b.mo25568c();
                IOException iOException2 = aVar2.f12125j;
                if (iOException2 != null) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public void mo25216a(C5015x.C5018c cVar, long j, long j2) {
        C4920a aVar = (C4920a) cVar;
        C4734c cVar2 = this.f12013c;
        cVar2.getClass();
        if (aVar instanceof C4734c.C4735a) {
            C4734c.C4735a aVar2 = (C4734c.C4735a) aVar;
            cVar2.f11950i = aVar2.f13109i;
            cVar2.mo25177a(aVar2.f13101a.f13327a, aVar2.f11958l, aVar2.f11959m);
        }
        C4926f.C4927a aVar3 = this.f12018h;
        C5000j jVar = aVar.f13101a;
        int i = aVar.f13102b;
        int i2 = this.f12011a;
        C4869i iVar = aVar.f13103c;
        int i3 = aVar.f13104d;
        Object obj = aVar.f13105e;
        long j3 = aVar.f13106f;
        long j4 = aVar.f13107g;
        long c = aVar.mo25187c();
        if (aVar3.f13122b != null) {
            aVar3.f13121a.post(new C4918b(aVar3, jVar, i, i2, iVar, i3, obj, j3, j4, j, j2, c));
        }
        if (!this.f12025o) {
            mo25195a(this.f12033w);
        } else {
            ((C4741g) this.f12012b).mo25194a((C4945p) this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25213a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5015x.C5018c r30, long r31, long r33, java.io.IOException r35) {
        /*
            r29 = this;
            r0 = r29
            r1 = r30
            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4920a) r1
            long r2 = r1.mo25187c()
            boolean r4 = r1 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4740f
            r5 = 1
            if (r4 == 0) goto L_0x0018
            r7 = 0
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            r2 = 0
            goto L_0x0019
        L_0x0018:
            r2 = r5
        L_0x0019:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c r3 = r0.f12013c
            r3.getClass()
            if (r2 == 0) goto L_0x003b
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r2 = r3.f11957p
            com.fyber.inneractive.sdk.player.exoplayer2.source.r r3 = r3.f11947f
            com.fyber.inneractive.sdk.player.exoplayer2.i r7 = r1.f13103c
            int r3 = r3.mo25481a((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r7)
            int r3 = r2.mo25495c(r3)
            r7 = 60000(0xea60, double:2.9644E-319)
            r15 = r35
            boolean r2 = com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4921b.m15080a(r2, r3, r15, r7)
            if (r2 == 0) goto L_0x003d
            r2 = r5
            goto L_0x003e
        L_0x003b:
            r15 = r35
        L_0x003d:
            r2 = 0
        L_0x003e:
            if (r2 == 0) goto L_0x005f
            if (r4 == 0) goto L_0x0060
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.f12021k
            java.lang.Object r2 = r2.removeLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4740f) r2
            if (r2 != r1) goto L_0x004e
            r2 = r5
            goto L_0x004f
        L_0x004e:
            r2 = 0
        L_0x004f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a.m15304b(r2)
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r2 = r0.f12021k
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0060
            long r2 = r0.f12033w
            r0.f12034x = r2
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            com.fyber.inneractive.sdk.player.exoplayer2.source.f$a r10 = r0.f12018h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r11 = r1.f13101a
            int r12 = r1.f13102b
            int r13 = r0.f12011a
            com.fyber.inneractive.sdk.player.exoplayer2.i r14 = r1.f13103c
            int r2 = r1.f13104d
            java.lang.Object r3 = r1.f13105e
            long r7 = r1.f13106f
            r17 = r7
            long r6 = r1.f13107g
            long r25 = r1.mo25187c()
            com.fyber.inneractive.sdk.player.exoplayer2.source.f r1 = r10.f13122b
            if (r1 == 0) goto L_0x0094
            android.os.Handler r1 = r10.f13121a
            com.fyber.inneractive.sdk.player.exoplayer2.source.d r4 = new com.fyber.inneractive.sdk.player.exoplayer2.source.d
            r9 = r4
            r15 = r2
            r16 = r3
            r19 = r6
            r21 = r31
            r23 = r33
            r27 = r35
            r28 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27, r28)
            r1.post(r4)
        L_0x0094:
            if (r5 == 0) goto L_0x00a9
            boolean r1 = r0.f12025o
            if (r1 != 0) goto L_0x00a0
            long r1 = r0.f12033w
            r0.mo25195a((long) r1)
            goto L_0x00a7
        L_0x00a0:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b r1 = r0.f12012b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4741g) r1
            r1.mo25194a((com.fyber.inneractive.sdk.player.exoplayer2.source.C4945p) r0)
        L_0x00a7:
            r6 = 2
            goto L_0x00aa
        L_0x00a9:
            r6 = 0
        L_0x00aa:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4744j.mo25213a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$c, long, long, java.io.IOException):int");
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C4804n mo25173a(int i, int i2) {
        return mo25214a(i);
    }

    /* renamed from: a */
    public boolean mo25218a(C4964e[] eVarArr, boolean[] zArr, C4944o[] oVarArr, boolean[] zArr2, boolean z) {
        C5023a.m15304b(this.f12025o);
        for (int i = 0; i < eVarArr.length; i++) {
            if (oVarArr[i] != null && (eVarArr[i] == null || !zArr[i])) {
                int i2 = oVarArr[i].f12009a;
                mo25215a(i2, false);
                this.f12020j.valueAt(i2).mo25153b();
                oVarArr[i] = null;
            }
        }
        boolean z2 = false;
        C4964e eVar = null;
        for (int i3 = 0; i3 < eVarArr.length; i3++) {
            if (oVarArr[i3] == null && eVarArr[i3] != null) {
                C4964e eVar2 = eVarArr[i3];
                int a = this.f12030t.mo25485a(eVar2.mo25493b());
                mo25215a(a, true);
                if (a == this.f12031u) {
                    this.f12013c.f11957p = eVar2;
                    eVar = eVar2;
                }
                oVarArr[i3] = new C4743i(this, a);
                zArr2[i3] = true;
                z2 = true;
            }
        }
        if (z) {
            int size = this.f12020j.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f12032v[i4]) {
                    this.f12020j.valueAt(i4).mo25153b();
                }
            }
            if (eVar != null && !this.f12021k.isEmpty()) {
                eVar.mo25179a(0);
                if (eVar.mo25488a() != this.f12013c.f11947f.mo25481a(this.f12021k.getLast().f13103c)) {
                    mo25219d(this.f12033w);
                }
            }
        }
        if (this.f12026p == 0) {
            this.f12013c.f11951j = null;
            this.f12027q = null;
            this.f12021k.clear();
            if (this.f12017g.mo25567b()) {
                this.f12017g.mo25566a();
            }
        }
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0112  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo25195a(long r37) {
        /*
            r36 = this;
            r0 = r36
            boolean r1 = r0.f12035y
            if (r1 != 0) goto L_0x02fd
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.x r1 = r0.f12017g
            boolean r1 = r1.mo25567b()
            if (r1 == 0) goto L_0x0010
            goto L_0x02fd
        L_0x0010:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c r1 = r0.f12013c
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r3 = r0.f12021k
            boolean r3 = r3.isEmpty()
            r4 = 0
            if (r3 == 0) goto L_0x001d
            r3 = r4
            goto L_0x0025
        L_0x001d:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r3 = r0.f12021k
            java.lang.Object r3 = r3.getLast()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4740f) r3
        L_0x0025:
            long r5 = r0.f12034x
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r5 = r37
        L_0x0033:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$b r9 = r0.f12019i
            if (r3 != 0) goto L_0x0039
            r8 = -1
            goto L_0x0041
        L_0x0039:
            com.fyber.inneractive.sdk.player.exoplayer2.source.r r8 = r1.f11947f
            com.fyber.inneractive.sdk.player.exoplayer2.i r10 = r3.f13103c
            int r8 = r8.mo25481a((com.fyber.inneractive.sdk.player.exoplayer2.C4869i) r10)
        L_0x0041:
            r1.f11952k = r4
            r10 = 0
            if (r3 != 0) goto L_0x0048
            goto L_0x004f
        L_0x0048:
            long r13 = r3.f13106f
            long r13 = r13 - r5
            long r10 = java.lang.Math.max(r10, r13)
        L_0x004f:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r12 = r1.f11957p
            r12.mo25179a((long) r10)
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r10 = r1.f11957p
            int r10 = r10.mo25488a()
            r13 = 1
            if (r8 == r10) goto L_0x005f
            r11 = r13
            goto L_0x0060
        L_0x005f:
            r11 = 0
        L_0x0060:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a[] r12 = r1.f11945d
            r12 = r12[r10]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r14 = r1.f11946e
            boolean r14 = r14.mo25231b((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a.C4750a) r12)
            if (r14 != 0) goto L_0x0072
            r9.f11962c = r12
            r1.f11952k = r12
            goto L_0x0257
        L_0x0072:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r14 = r1.f11946e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r14 = r14.mo25230a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a.C4750a) r12)
            if (r3 == 0) goto L_0x0085
            if (r11 == 0) goto L_0x007d
            goto L_0x0085
        L_0x007d:
            int r5 = r3.f13112i
            int r5 = r5 + r13
            r15 = r5
        L_0x0081:
            r8 = r10
            r2 = r12
            goto L_0x0105
        L_0x0085:
            if (r3 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            long r5 = r3.f13106f
        L_0x008a:
            boolean r11 = r14.f12061j
            if (r11 != 0) goto L_0x00a9
            r11 = r8
            long r7 = r14.f12055d
            r21 = r3
            long r2 = r14.f12066o
            long r7 = r7 + r2
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ac
            int r2 = r14.f12058g
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r3 = r14.f12064m
            int r3 = r3.size()
            int r2 = r2 + r3
            r15 = r2
            r8 = r10
            r2 = r12
            r3 = r21
            goto L_0x0105
        L_0x00a9:
            r21 = r3
            r11 = r8
        L_0x00ac:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r2 = r14.f12064m
            long r7 = r14.f12055d
            long r5 = r5 - r7
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r5 = r1.f11946e
            boolean r5 = r5.f12115n
            if (r5 == 0) goto L_0x00c0
            if (r21 != 0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r5 = 0
            goto L_0x00c1
        L_0x00c0:
            r5 = r13
        L_0x00c1:
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.f13471a
            int r6 = java.util.Collections.binarySearch(r2, r3)
            if (r6 >= 0) goto L_0x00cd
            int r6 = r6 + 2
            int r2 = -r6
            goto L_0x00e0
        L_0x00cd:
            r7 = -1
        L_0x00ce:
            int r6 = r6 + r7
            if (r6 < 0) goto L_0x00de
            java.lang.Object r8 = r2.get(r6)
            java.lang.Comparable r8 = (java.lang.Comparable) r8
            int r8 = r8.compareTo(r3)
            if (r8 != 0) goto L_0x00de
            goto L_0x00ce
        L_0x00de:
            int r2 = r6 + 1
        L_0x00e0:
            if (r5 == 0) goto L_0x00e7
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x00e7:
            int r3 = r14.f12058g
            int r2 = r2 + r3
            if (r2 >= r3) goto L_0x0100
            if (r21 == 0) goto L_0x0100
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a[] r2 = r1.f11945d
            r2 = r2[r11]
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r3 = r1.f11946e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b r14 = r3.mo25230a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a.C4750a) r2)
            r3 = r21
            int r5 = r3.f13112i
            int r5 = r5 + r13
            r15 = r5
            r8 = r11
            goto L_0x0105
        L_0x0100:
            r3 = r21
            r15 = r2
            goto L_0x0081
        L_0x0105:
            int r5 = r14.f12058g
            if (r15 >= r5) goto L_0x0112
            com.fyber.inneractive.sdk.player.exoplayer2.source.g r2 = new com.fyber.inneractive.sdk.player.exoplayer2.source.g
            r2.<init>()
            r1.f11951j = r2
            goto L_0x0257
        L_0x0112:
            int r5 = r15 - r5
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r6 = r14.f12064m
            int r6 = r6.size()
            if (r5 < r6) goto L_0x012a
            boolean r3 = r14.f12061j
            if (r3 == 0) goto L_0x0124
            r9.f11961b = r13
            goto L_0x0257
        L_0x0124:
            r9.f11962c = r2
            r1.f11952k = r2
            goto L_0x0257
        L_0x012a:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a> r6 = r14.f12064m
            java.lang.Object r5 = r6.get(r5)
            r12 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r12 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4751b.C4752a) r12
            boolean r5 = r12.f12071e
            if (r5 == 0) goto L_0x019f
            java.lang.String r5 = r14.f12076a
            java.lang.String r6 = r12.f12072f
            android.net.Uri r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5048t.m15381a(r5, r6)
            android.net.Uri r6 = r1.f11953l
            boolean r6 = r5.equals(r6)
            if (r6 != 0) goto L_0x018d
            java.lang.String r2 = r12.f12073g
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r3 = r1.f11957p
            int r3 = r3.mo25180d()
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r6 = r1.f11957p
            java.lang.Object r6 = r6.mo25182g()
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r7 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j
            r27 = 0
            r29 = 0
            r31 = -1
            r33 = 0
            r34 = 1
            r26 = 0
            r24 = r7
            r25 = r5
            r24.<init>(r25, r26, r27, r29, r31, r33, r34)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$a r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$a
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r10 = r1.f11943b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a[] r11 = r1.f11945d
            r8 = r11[r8]
            com.fyber.inneractive.sdk.player.exoplayer2.i r8 = r8.f12052b
            byte[] r1 = r1.f11950i
            r24 = r5
            r25 = r10
            r26 = r7
            r27 = r8
            r28 = r3
            r29 = r6
            r30 = r1
            r31 = r2
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r9.f11960a = r5
            goto L_0x0257
        L_0x018d:
            java.lang.String r6 = r12.f12073g
            java.lang.String r7 = r1.f11955n
            boolean r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u.m15393a((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 != 0) goto L_0x01a7
            java.lang.String r6 = r12.f12073g
            byte[] r7 = r1.f11954m
            r1.mo25177a(r5, r6, r7)
            goto L_0x01a7
        L_0x019f:
            r1.f11953l = r4
            r1.f11954m = r4
            r1.f11955n = r4
            r1.f11956o = r4
        L_0x01a7:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b$a r5 = r14.f12063l
            if (r5 == 0) goto L_0x01cc
            java.lang.String r6 = r14.f12076a
            java.lang.String r7 = r5.f12067a
            android.net.Uri r25 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5048t.m15381a(r6, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r6 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j
            long r7 = r5.f12074h
            long r10 = r5.f12075i
            r33 = 0
            r34 = 0
            r26 = 0
            r24 = r6
            r27 = r7
            r29 = r7
            r31 = r10
            r24.<init>(r25, r26, r27, r29, r31, r33, r34)
            r8 = r6
            goto L_0x01cd
        L_0x01cc:
            r8 = r4
        L_0x01cd:
            long r5 = r14.f12055d
            long r10 = r12.f12070d
            long r20 = r5 + r10
            int r5 = r14.f12057f
            int r6 = r12.f12069c
            int r11 = r5 + r6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.k r5 = r1.f11944c
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r6 = r5.f12037a
            java.lang.Object r6 = r6.get(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r6 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C5046r) r6
            if (r6 != 0) goto L_0x01f6
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r6 = new com.fyber.inneractive.sdk.player.exoplayer2.util.r
            r7 = r14
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6.<init>(r13)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r5 = r5.f12037a
            r5.put(r11, r6)
            goto L_0x01f7
        L_0x01f6:
            r7 = r14
        L_0x01f7:
            r24 = r6
            java.lang.String r5 = r7.f12076a
            java.lang.String r6 = r12.f12067a
            android.net.Uri r26 = com.fyber.inneractive.sdk.player.exoplayer2.util.C5048t.m15381a(r5, r6)
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r25 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j
            r7 = r25
            long r5 = r12.f12074h
            long r13 = r12.f12075i
            r34 = 0
            r35 = 0
            r27 = 0
            r28 = r5
            r30 = r5
            r32 = r13
            r25.<init>(r26, r27, r28, r30, r32, r34, r35)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r13 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f
            r5 = r13
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r6 = r1.f11942a
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.i> r10 = r1.f11948g
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r14 = r1.f11957p
            int r14 = r14.mo25180d()
            r25 = r11
            r11 = r14
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r14 = r1.f11957p
            java.lang.Object r14 = r14.mo25182g()
            r4 = r12
            r12 = r14
            r38 = r13
            long r13 = r4.f12068b
            long r13 = r20 + r13
            r4 = r15
            r15 = r13
            boolean r13 = r1.f11949h
            r19 = r13
            byte[] r13 = r1.f11954m
            r22 = r13
            byte[] r1 = r1.f11956o
            r23 = r1
            r1 = r9
            r9 = r2
            r2 = r38
            r13 = r20
            r17 = r4
            r18 = r25
            r20 = r24
            r21 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17, r18, r19, r20, r21, r22, r23)
            r1.f11960a = r2
        L_0x0257:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$b r1 = r0.f12019i
            boolean r2 = r1.f11961b
            com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.a r3 = r1.f11960a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r4 = r1.f11962c
            r5 = 0
            r1.f11960a = r5
            r6 = 0
            r1.f11961b = r6
            r1.f11962c = r5
            if (r2 == 0) goto L_0x026d
            r1 = 1
            r0.f12035y = r1
            return r1
        L_0x026d:
            r1 = 1
            if (r3 != 0) goto L_0x0285
            if (r4 == 0) goto L_0x0283
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j$b r1 = r0.f12012b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4741g) r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e r1 = r1.f11988a
            java.util.IdentityHashMap<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$a> r1 = r1.f12106e
            java.lang.Object r1 = r1.get(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e$a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e.C4757a) r1
            r1.mo25234b()
        L_0x0283:
            r1 = 0
            return r1
        L_0x0285:
            boolean r2 = r3 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4740f
            if (r2 == 0) goto L_0x02d0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f12034x = r4
            r2 = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4740f) r2
            r2.f11968D = r0
            int r4 = r2.f11971j
            boolean r5 = r2.f11981t
            r0.f12028r = r4
            r6 = 0
        L_0x029c:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r7 = r0.f12020j
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x02b3
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r7 = r0.f12020j
            java.lang.Object r7 = r7.valueAt(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r7 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4717d) r7
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$c r7 = r7.f11878c
            r7.f11911r = r4
            int r6 = r6 + 1
            goto L_0x029c
        L_0x02b3:
            if (r5 == 0) goto L_0x02cb
            r4 = 0
        L_0x02b6:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r5 = r0.f12020j
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x02cb
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.d> r5 = r0.f12020j
            java.lang.Object r5 = r5.valueAt(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.d r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4717d) r5
            r5.f11888m = r1
            int r4 = r4 + 1
            goto L_0x02b6
        L_0x02cb:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f> r4 = r0.f12021k
            r4.add(r2)
        L_0x02d0:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.x r2 = r0.f12017g
            int r4 = r0.f12016f
            long r17 = r2.mo25565a(r3, r0, r4)
            com.fyber.inneractive.sdk.player.exoplayer2.source.f$a r6 = r0.f12018h
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r7 = r3.f13101a
            int r8 = r3.f13102b
            int r9 = r0.f12011a
            com.fyber.inneractive.sdk.player.exoplayer2.i r10 = r3.f13103c
            int r11 = r3.f13104d
            java.lang.Object r12 = r3.f13105e
            long r13 = r3.f13106f
            long r2 = r3.f13107g
            com.fyber.inneractive.sdk.player.exoplayer2.source.f r4 = r6.f13122b
            if (r4 == 0) goto L_0x02fc
            android.os.Handler r4 = r6.f13121a
            com.fyber.inneractive.sdk.player.exoplayer2.source.a r15 = new com.fyber.inneractive.sdk.player.exoplayer2.source.a
            r5 = r15
            r1 = r15
            r15 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
            r4.post(r1)
            r1 = 1
        L_0x02fc:
            return r1
        L_0x02fd:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4744j.mo25195a(long):boolean");
    }

    /* renamed from: a */
    public long mo25189a() {
        if (mo25221h()) {
            return this.f12034x;
        }
        if (this.f12035y) {
            return Long.MIN_VALUE;
        }
        return this.f12021k.getLast().f13107g;
    }

    /* renamed from: a */
    public C4717d mo25214a(int i) {
        if (this.f12020j.indexOfKey(i) >= 0) {
            return this.f12020j.get(i);
        }
        C4717d dVar = new C4717d(this.f12014d);
        dVar.f11889n = this;
        dVar.f11878c.f11911r = this.f12028r;
        this.f12020j.put(i, dVar);
        return dVar;
    }

    /* renamed from: a */
    public void mo25162a(C4869i iVar) {
        this.f12023m.post(this.f12022l);
    }

    /* renamed from: a */
    public final void mo25215a(int i, boolean z) {
        int i2 = 1;
        C5023a.m15304b(this.f12032v[i] != z);
        this.f12032v[i] = z;
        int i3 = this.f12026p;
        if (!z) {
            i2 = -1;
        }
        this.f12026p = i3 + i2;
    }

    /* renamed from: a */
    public static C4869i m14587a(C4869i iVar, C4869i iVar2) {
        C4869i iVar3 = iVar;
        C4869i iVar4 = iVar2;
        if (iVar3 == null) {
            return iVar4;
        }
        String str = null;
        int c = C5031h.m15317c(iVar4.f12956f);
        if (c == 1) {
            str = m14588a(iVar3.f12953c, 1);
        } else if (c == 2) {
            str = m14588a(iVar3.f12953c, 2);
        }
        return new C4869i(iVar3.f12951a, iVar4.f12955e, iVar4.f12956f, str, iVar3.f12952b, iVar4.f12957g, iVar3.f12960j, iVar3.f12961k, iVar4.f12962l, iVar4.f12963m, iVar4.f12964n, iVar4.f12966p, iVar4.f12965o, iVar4.f12967q, iVar4.f12968r, iVar4.f12969s, iVar4.f12970t, iVar4.f12971u, iVar4.f12972v, iVar3.f12974x, iVar3.f12975y, iVar4.f12976z, iVar4.f12973w, iVar4.f12958h, iVar4.f12959i, iVar4.f12954d);
    }

    /* renamed from: a */
    public static String m14588a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("(\\s*,\\s*)|(\\s*$)");
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            if (i == C5031h.m15317c(C5031h.m15315a(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
