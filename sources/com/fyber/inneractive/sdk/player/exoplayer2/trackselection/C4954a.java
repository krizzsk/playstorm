package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4947r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a */
public abstract class C4954a implements C4964e {

    /* renamed from: a */
    public final C4947r f13204a;

    /* renamed from: b */
    public final int f13205b;

    /* renamed from: c */
    public final int[] f13206c;

    /* renamed from: d */
    public final C4869i[] f13207d;

    /* renamed from: e */
    public final long[] f13208e;

    /* renamed from: f */
    public int f13209f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a$b */
    public static final class C4956b implements Comparator<C4869i> {
        public C4956b() {
        }

        public int compare(Object obj, Object obj2) {
            return ((C4869i) obj2).f12952b - ((C4869i) obj).f12952b;
        }
    }

    public C4954a(C4947r rVar, int... iArr) {
        int i = 0;
        C5023a.m15304b(iArr.length > 0);
        this.f13204a = (C4947r) C5023a.m15300a(rVar);
        int length = iArr.length;
        this.f13205b = length;
        this.f13207d = new C4869i[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f13207d[i2] = rVar.mo25482a(iArr[i2]);
        }
        Arrays.sort(this.f13207d, new C4956b());
        this.f13206c = new int[this.f13205b];
        while (true) {
            int i3 = this.f13205b;
            if (i < i3) {
                this.f13206c[i] = rVar.mo25481a(this.f13207d[i]);
                i++;
            } else {
                this.f13208e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final C4869i mo25490a(int i) {
        return this.f13207d[i];
    }

    /* renamed from: b */
    public final C4947r mo25493b() {
        return this.f13204a;
    }

    /* renamed from: c */
    public final int mo25495c(int i) {
        for (int i2 = 0; i2 < this.f13205b; i2++) {
            if (this.f13206c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4954a aVar = (C4954a) obj;
        if (this.f13204a != aVar.f13204a || !Arrays.equals(this.f13206c, aVar.f13206c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo25498f() {
        return this.f13206c.length;
    }

    public int hashCode() {
        if (this.f13209f == 0) {
            this.f13209f = (System.identityHashCode(this.f13204a) * 31) + Arrays.hashCode(this.f13206c);
        }
        return this.f13209f;
    }

    /* renamed from: a */
    public final int mo25489a(C4869i iVar) {
        for (int i = 0; i < this.f13205b; i++) {
            if (this.f13207d[i] == iVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo25492b(int i) {
        return this.f13206c[i];
    }

    /* renamed from: b */
    public final boolean mo25494b(int i, long j) {
        return this.f13208e[i] > j;
    }

    /* renamed from: c */
    public final C4869i mo25496c() {
        return this.f13207d[mo25181e()];
    }

    /* renamed from: a */
    public final int mo25488a() {
        return this.f13206c[mo25181e()];
    }

    /* renamed from: a */
    public final boolean mo25491a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = mo25494b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f13205b && !b) {
            b = i2 != i && !mo25494b(i2, elapsedRealtime);
            i2++;
        }
        if (!b) {
            return false;
        }
        long[] jArr = this.f13208e;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + j);
        return true;
    }
}
