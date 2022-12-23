package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.protobuf.n1 */
public final class C5196n1 {

    /* renamed from: f */
    public static final C5196n1 f13847f = new C5196n1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f13848a;

    /* renamed from: b */
    public int[] f13849b;

    /* renamed from: c */
    public Object[] f13850c;

    /* renamed from: d */
    public int f13851d;

    /* renamed from: e */
    public boolean f13852e;

    public C5196n1() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static C5196n1 m16167a(C5196n1 n1Var, C5196n1 n1Var2) {
        int i = n1Var.f13848a + n1Var2.f13848a;
        int[] copyOf = Arrays.copyOf(n1Var.f13849b, i);
        System.arraycopy(n1Var2.f13849b, 0, copyOf, n1Var.f13848a, n1Var2.f13848a);
        Object[] copyOf2 = Arrays.copyOf(n1Var.f13850c, i);
        System.arraycopy(n1Var2.f13850c, 0, copyOf2, n1Var.f13848a, n1Var2.f13848a);
        return new C5196n1(i, copyOf, copyOf2, true);
    }

    /* renamed from: c */
    public static C5196n1 m16169c() {
        return new C5196n1(0, new int[8], new Object[8], true);
    }

    /* renamed from: b */
    public int mo26198b() {
        int i;
        int i2 = this.f13851d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f13848a; i4++) {
            int i5 = this.f13849b[i4];
            int i6 = C5227t1.f13895a;
            int i7 = i5 >>> 3;
            int i8 = i5 & 7;
            if (i8 == 0) {
                i = C5183l.m16045e(i7, ((Long) this.f13850c[i4]).longValue());
            } else if (i8 == 1) {
                i = C5183l.m16024a(i7, ((Long) this.f13850c[i4]).longValue());
            } else if (i8 == 2) {
                i = C5183l.m16025a(i7, (C5151i) this.f13850c[i4]);
            } else if (i8 == 3) {
                i = (C5183l.m16034b(i7) * 2) + ((C5196n1) this.f13850c[i4]).mo26198b();
            } else if (i8 == 5) {
                i = C5183l.m16035b(i7, ((Integer) this.f13850c[i4]).intValue());
            } else {
                throw new IllegalStateException(C5119a0.m15527d());
            }
            i3 += i;
        }
        this.f13851d = i3;
        return i3;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5196n1)) {
            return false;
        }
        C5196n1 n1Var = (C5196n1) obj;
        int i = this.f13848a;
        if (i == n1Var.f13848a) {
            int[] iArr = this.f13849b;
            int[] iArr2 = n1Var.f13849b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f13850c;
                Object[] objArr2 = n1Var.f13850c;
                int i3 = this.f13848a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public int hashCode() {
        int i = this.f13848a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f13849b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f13850c;
        int i7 = this.f13848a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public C5196n1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f13851d = -1;
        this.f13848a = i;
        this.f13849b = iArr;
        this.f13850c = objArr;
        this.f13852e = z;
    }

    /* renamed from: a */
    public void mo26194a() {
        if (!this.f13852e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public void mo26196a(C5242u1 u1Var) throws IOException {
        if (this.f13848a != 0) {
            u1Var.getClass();
            for (int i = 0; i < this.f13848a; i++) {
                m16168a(this.f13849b[i], this.f13850c[i], u1Var);
            }
        }
    }

    /* renamed from: a */
    public static void m16168a(int i, Object obj, C5242u1 u1Var) throws IOException {
        int i2 = C5227t1.f13895a;
        int i3 = i >>> 3;
        int i4 = i & 7;
        if (i4 == 0) {
            ((C5191m) u1Var).f13841a.mo26132g(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            ((C5191m) u1Var).f13841a.mo26129f(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            ((C5191m) u1Var).f13841a.mo26120b(i3, (C5151i) obj);
        } else if (i4 == 3) {
            C5191m mVar = (C5191m) u1Var;
            mVar.f13841a.mo26134i(i3, 3);
            ((C5196n1) obj).mo26196a(u1Var);
            mVar.f13841a.mo26134i(i3, 4);
        } else if (i4 == 5) {
            ((C5191m) u1Var).f13841a.mo26131g(i3, ((Integer) obj).intValue());
        } else {
            throw new RuntimeException(C5119a0.m15527d());
        }
    }

    /* renamed from: a */
    public void mo26195a(int i, Object obj) {
        mo26194a();
        int i2 = this.f13848a;
        int[] iArr = this.f13849b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f13849b = Arrays.copyOf(iArr, i3);
            this.f13850c = Arrays.copyOf(this.f13850c, i3);
        }
        int[] iArr2 = this.f13849b;
        int i4 = this.f13848a;
        iArr2[i4] = i;
        this.f13850c[i4] = obj;
        this.f13848a = i4 + 1;
    }

    /* renamed from: a */
    public boolean mo26197a(int i, C5172j jVar) throws IOException {
        int t;
        mo26194a();
        int i2 = C5227t1.f13895a;
        int i3 = i >>> 3;
        int i4 = i & 7;
        if (i4 == 0) {
            mo26195a(i, (Object) Long.valueOf(jVar.mo26062l()));
            return true;
        } else if (i4 == 1) {
            mo26195a(i, (Object) Long.valueOf(jVar.mo26059i()));
            return true;
        } else if (i4 == 2) {
            mo26195a(i, (Object) jVar.mo26054e());
            return true;
        } else if (i4 == 3) {
            C5196n1 n1Var = new C5196n1(0, new int[8], new Object[8], true);
            do {
                t = jVar.mo26070t();
                if (t == 0 || !n1Var.mo26197a(t, jVar)) {
                    jVar.mo26046a(C5227t1.m16370a(i3, 4));
                    mo26195a(i, (Object) n1Var);
                }
                t = jVar.mo26070t();
                break;
            } while (!n1Var.mo26197a(t, jVar));
            jVar.mo26046a(C5227t1.m16370a(i3, 4));
            mo26195a(i, (Object) n1Var);
            return true;
        } else if (i4 == 4) {
            return false;
        } else {
            if (i4 == 5) {
                mo26195a(i, (Object) Integer.valueOf(jVar.mo26058h()));
                return true;
            }
            throw C5119a0.m15527d();
        }
    }
}
