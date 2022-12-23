package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.os.Handler;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C4864h;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4744j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4749a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4756e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4926f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4929h;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4940m;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4944o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4945p;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4948s;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4964e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4971b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.g */
public final class C4741g implements C4940m, C4744j.C4746b, C4756e.C4758b {

    /* renamed from: a */
    public final C4756e f11988a;

    /* renamed from: b */
    public final C4738d f11989b;

    /* renamed from: c */
    public final int f11990c;

    /* renamed from: d */
    public final C4926f.C4927a f11991d;

    /* renamed from: e */
    public final C4971b f11992e;

    /* renamed from: f */
    public final IdentityHashMap<C4944o, Integer> f11993f = new IdentityHashMap<>();

    /* renamed from: g */
    public final C4747k f11994g = new C4747k();

    /* renamed from: h */
    public final Handler f11995h = new Handler();

    /* renamed from: i */
    public final long f11996i;

    /* renamed from: j */
    public C4940m.C4941a f11997j;

    /* renamed from: k */
    public int f11998k;

    /* renamed from: l */
    public boolean f11999l;

    /* renamed from: m */
    public C4948s f12000m;

    /* renamed from: n */
    public C4744j[] f12001n;

    /* renamed from: o */
    public C4744j[] f12002o;

    /* renamed from: p */
    public C4929h f12003p;

    public C4741g(C4756e eVar, C4738d dVar, int i, C4926f.C4927a aVar, C4971b bVar, long j) {
        this.f11988a = eVar;
        this.f11989b = dVar;
        this.f11990c = i;
        this.f11991d = aVar;
        this.f11992e = bVar;
        this.f11996i = j;
    }

    /* renamed from: a */
    public void mo25193a(C4940m.C4941a aVar) {
        this.f11988a.f12109h.add(this);
        this.f11997j = aVar;
        C4749a aVar2 = this.f11988a.f12112k;
        ArrayList arrayList = new ArrayList(aVar2.f12046b);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C4749a.C4750a aVar3 = (C4749a.C4750a) arrayList.get(i);
            if (aVar3.f12052b.f12961k > 0 || m14563a(aVar3, "avc")) {
                arrayList2.add(aVar3);
            } else if (m14563a(aVar3, "mp4a")) {
                arrayList3.add(aVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList = arrayList2;
        } else if (arrayList3.size() < arrayList.size()) {
            arrayList.removeAll(arrayList3);
        }
        List<C4749a.C4750a> list = aVar2.f12047c;
        List<C4749a.C4750a> list2 = aVar2.f12048d;
        int size = list.size() + 1 + list2.size();
        this.f12001n = new C4744j[size];
        this.f11998k = size;
        C5023a.m15302a(!arrayList.isEmpty());
        C4749a.C4750a[] aVarArr = new C4749a.C4750a[arrayList.size()];
        arrayList.toArray(aVarArr);
        C4744j a = mo25191a(0, aVarArr, aVar2.f12049e, aVar2.f12050f);
        this.f12001n[0] = a;
        a.f12013c.f11949h = true;
        a.mo25220g();
        int i2 = 0;
        int i3 = 1;
        while (i2 < list.size()) {
            C4744j a2 = mo25191a(1, new C4749a.C4750a[]{list.get(i2)}, (C4869i) null, Collections.emptyList());
            this.f12001n[i3] = a2;
            a2.mo25220g();
            i2++;
            i3++;
        }
        int i4 = 0;
        while (i4 < list2.size()) {
            C4749a.C4750a aVar4 = list2.get(i4);
            C4744j a3 = mo25191a(3, new C4749a.C4750a[]{aVar4}, (C4869i) null, Collections.emptyList());
            a3.mo25214a(0).mo25149a(aVar4.f12052b);
            a3.f12024n = true;
            a3.mo25222i();
            this.f12001n[i3] = a3;
            i4++;
            i3++;
        }
    }

    /* renamed from: b */
    public C4948s mo25197b() {
        return this.f12000m;
    }

    /* renamed from: c */
    public void mo25198c() {
        mo25203g();
    }

    /* renamed from: c */
    public void mo25199c(long j) {
    }

    /* renamed from: d */
    public long mo25200d() {
        long j;
        long j2 = Long.MAX_VALUE;
        for (C4744j jVar : this.f12002o) {
            if (jVar.f12035y) {
                j = Long.MIN_VALUE;
            } else if (jVar.mo25221h()) {
                j = jVar.f12034x;
            } else {
                long j3 = jVar.f12033w;
                C4740f last = jVar.f12021k.getLast();
                if (!last.f11970F) {
                    if (jVar.f12021k.size() > 1) {
                        LinkedList<C4740f> linkedList = jVar.f12021k;
                        last = linkedList.get(linkedList.size() - 2);
                    } else {
                        last = null;
                    }
                }
                if (last != null) {
                    j3 = Math.max(j3, last.f13107g);
                }
                int size = jVar.f12020j.size();
                for (int i = 0; i < size; i++) {
                    j3 = Math.max(j3, jVar.f12020j.valueAt(i).mo25155d());
                }
                j = j3;
            }
            if (j != Long.MIN_VALUE) {
                j2 = Math.min(j2, j);
            }
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j2;
    }

    /* renamed from: e */
    public void mo25201e() throws IOException {
        C4744j[] jVarArr = this.f12001n;
        if (jVarArr != null) {
            for (C4744j j : jVarArr) {
                j.mo25223j();
            }
        }
    }

    /* renamed from: f */
    public long mo25202f() {
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public final void mo25203g() {
        if (this.f12000m != null) {
            ((C4864h) this.f11997j).mo25345a((C4945p) this);
            return;
        }
        for (C4744j g : this.f12001n) {
            g.mo25220g();
        }
    }

    /* renamed from: b */
    public long mo25196b(long j) {
        this.f11994g.f12037a.clear();
        for (C4744j d : this.f12002o) {
            d.mo25219d(j);
        }
        return j;
    }

    /* renamed from: a */
    public long mo25190a(C4964e[] eVarArr, boolean[] zArr, C4944o[] oVarArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        C4964e[] eVarArr2 = eVarArr;
        C4944o[] oVarArr2 = oVarArr;
        long j3 = j;
        int[] iArr = new int[eVarArr2.length];
        int[] iArr2 = new int[eVarArr2.length];
        for (int i2 = 0; i2 < eVarArr2.length; i2++) {
            if (oVarArr2[i2] == null) {
                i = -1;
            } else {
                i = this.f11993f.get(oVarArr2[i2]).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            if (eVarArr2[i2] != null) {
                C4947r b = eVarArr2[i2].mo25493b();
                int i3 = 0;
                while (true) {
                    C4744j[] jVarArr = this.f12001n;
                    if (i3 >= jVarArr.length) {
                        break;
                    } else if (jVarArr[i3].f12030t.mo25485a(b) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        this.f11993f.clear();
        int length = eVarArr2.length;
        C4944o[] oVarArr3 = new C4944o[length];
        C4944o[] oVarArr4 = new C4944o[eVarArr2.length];
        C4964e[] eVarArr3 = new C4964e[eVarArr2.length];
        ArrayList arrayList = new ArrayList(this.f12001n.length);
        int i4 = 0;
        boolean z = false;
        while (i4 < this.f12001n.length) {
            for (int i5 = 0; i5 < eVarArr2.length; i5++) {
                C4964e eVar = null;
                oVarArr4[i5] = iArr[i5] == i4 ? oVarArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    eVar = eVarArr2[i5];
                }
                eVarArr3[i5] = eVar;
            }
            int i6 = i4;
            ArrayList arrayList2 = arrayList;
            C4964e[] eVarArr4 = eVarArr3;
            z |= this.f12001n[i4].mo25218a(eVarArr3, zArr, oVarArr4, zArr2, !this.f11999l);
            boolean z2 = false;
            for (int i7 = 0; i7 < eVarArr2.length; i7++) {
                if (iArr2[i7] == i6) {
                    C5023a.m15304b(oVarArr4[i7] != null);
                    oVarArr3[i7] = oVarArr4[i7];
                    this.f11993f.put(oVarArr4[i7], Integer.valueOf(i6));
                    z2 = true;
                } else if (iArr[i7] == i6) {
                    C5023a.m15304b(oVarArr4[i7] == null);
                }
            }
            if (z2) {
                arrayList2.add(this.f12001n[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            eVarArr3 = eVarArr4;
            long j4 = j;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(oVarArr3, 0, oVarArr2, 0, length);
        C4744j[] jVarArr2 = new C4744j[arrayList3.size()];
        this.f12002o = jVarArr2;
        arrayList3.toArray(jVarArr2);
        C4744j[] jVarArr3 = this.f12002o;
        if (jVarArr3.length > 0) {
            jVarArr3[0].f12013c.f11949h = true;
            int i8 = 1;
            while (true) {
                C4744j[] jVarArr4 = this.f12002o;
                if (i8 >= jVarArr4.length) {
                    break;
                }
                jVarArr4[i8].f12013c.f11949h = false;
                i8++;
            }
        }
        this.f12003p = new C4929h(this.f12002o);
        if (!this.f11999l || !z) {
            j2 = j;
        } else {
            j2 = j;
            mo25196b(j2);
            for (int i9 = 0; i9 < eVarArr2.length; i9++) {
                if (oVarArr2[i9] != null) {
                    zArr2[i9] = true;
                }
            }
        }
        this.f11999l = true;
        return j2;
    }

    /* renamed from: a */
    public boolean mo25195a(long j) {
        return this.f12003p.mo25195a(j);
    }

    /* renamed from: a */
    public long mo25189a() {
        return this.f12003p.mo25189a();
    }

    /* renamed from: a */
    public void mo25194a(C4945p pVar) {
        if (this.f12000m != null) {
            ((C4864h) this.f11997j).mo25345a((C4945p) this);
        }
    }

    /* renamed from: a */
    public void mo25192a(C4749a.C4750a aVar, long j) {
        int c;
        for (C4744j jVar : this.f12001n) {
            C4734c cVar = jVar.f12013c;
            int a = cVar.f11947f.mo25481a(aVar.f12052b);
            if (!(a == -1 || (c = cVar.f11957p.mo25495c(a)) == -1)) {
                cVar.f11957p.mo25491a(c, j);
            }
        }
        mo25203g();
    }

    /* renamed from: a */
    public final C4744j mo25191a(int i, C4749a.C4750a[] aVarArr, C4869i iVar, List<C4869i> list) {
        C4734c cVar = new C4734c(this.f11988a, aVarArr, this.f11989b, this.f11994g, list);
        C4971b bVar = this.f11992e;
        long j = this.f11996i;
        return new C4744j(i, this, cVar, bVar, j, iVar, this.f11990c, this.f11991d);
    }

    /* renamed from: a */
    public static boolean m14563a(C4749a.C4750a aVar, String str) {
        String str2 = aVar.f12052b.f12953c;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String startsWith : str2.split("(\\s*,\\s*)|(\\s*$)")) {
            if (startsWith.startsWith(str)) {
                return true;
            }
        }
        return false;
    }
}
