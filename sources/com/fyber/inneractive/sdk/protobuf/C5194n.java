package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.n */
public final class C5194n extends C5125c<Double> implements C5252z.C5254b, RandomAccess, C5264z0 {

    /* renamed from: d */
    public static final C5194n f13842d;

    /* renamed from: b */
    public double[] f13843b;

    /* renamed from: c */
    public int f13844c;

    static {
        C5194n nVar = new C5194n(new double[0], 0);
        f13842d = nVar;
        nVar.f13728a = false;
    }

    public C5194n() {
        this(new double[10], 0);
    }

    /* renamed from: a */
    public void mo26183a(double d) {
        mo25844e();
        int i = this.f13844c;
        double[] dArr = this.f13843b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f13843b = dArr2;
        }
        double[] dArr3 = this.f13843b;
        int i2 = this.f13844c;
        this.f13844c = i2 + 1;
        dArr3[i2] = d;
    }

    public void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo25844e();
        if (i < 0 || i > (i2 = this.f13844c)) {
            throw new IndexOutOfBoundsException(mo26187d(i));
        }
        double[] dArr = this.f13843b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f13843b, i, dArr2, i + 1, this.f13844c - i);
            this.f13843b = dArr2;
        }
        this.f13843b[i] = doubleValue;
        this.f13844c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo25844e();
        Charset charset = C5252z.f13963a;
        collection.getClass();
        if (!(collection instanceof C5194n)) {
            return super.addAll(collection);
        }
        C5194n nVar = (C5194n) collection;
        int i = nVar.f13844c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13844c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f13843b;
            if (i3 > dArr.length) {
                this.f13843b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(nVar.f13843b, 0, this.f13843b, this.f13844c, nVar.f13844c);
            this.f13844c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo26185c(int i) {
        if (i < 0 || i >= this.f13844c) {
            throw new IndexOutOfBoundsException(mo26187d(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final String mo26187d(int i) {
        return "Index:" + i + ", Size:" + this.f13844c;
    }

    /* renamed from: e */
    public C5252z.C5254b mo25861b(int i) {
        if (i >= this.f13844c) {
            return new C5194n(Arrays.copyOf(this.f13843b, i), this.f13844c);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5194n)) {
            return super.equals(obj);
        }
        C5194n nVar = (C5194n) obj;
        if (this.f13844c != nVar.f13844c) {
            return false;
        }
        double[] dArr = nVar.f13843b;
        for (int i = 0; i < this.f13844c; i++) {
            if (Double.doubleToLongBits(this.f13843b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo26185c(i);
        return Double.valueOf(this.f13843b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13844c; i2++) {
            i = (i * 31) + C5252z.m16432a(Double.doubleToLongBits(this.f13843b[i2]));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f13844c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13843b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25844e();
        mo26185c(i);
        double[] dArr = this.f13843b;
        double d = dArr[i];
        int i2 = this.f13844c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f13844c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public void removeRange(int i, int i2) {
        mo25844e();
        if (i2 >= i) {
            double[] dArr = this.f13843b;
            System.arraycopy(dArr, i2, dArr, i, this.f13844c - i2);
            this.f13844c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo25844e();
        mo26185c(i);
        double[] dArr = this.f13843b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public int size() {
        return this.f13844c;
    }

    public C5194n(double[] dArr, int i) {
        this.f13843b = dArr;
        this.f13844c = i;
    }

    public boolean add(Object obj) {
        mo26183a(((Double) obj).doubleValue());
        return true;
    }
}
