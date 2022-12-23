package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.g */
public final class C5142g extends C5125c<Boolean> implements C5252z.C5253a, RandomAccess, C5264z0 {

    /* renamed from: d */
    public static final C5142g f13753d;

    /* renamed from: b */
    public boolean[] f13754b;

    /* renamed from: c */
    public int f13755c;

    static {
        C5142g gVar = new C5142g(new boolean[0], 0);
        f13753d = gVar;
        gVar.f13728a = false;
    }

    public C5142g() {
        this(new boolean[10], 0);
    }

    /* renamed from: a */
    public void mo25953a(boolean z) {
        mo25844e();
        int i = this.f13755c;
        boolean[] zArr = this.f13754b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f13754b = zArr2;
        }
        boolean[] zArr3 = this.f13754b;
        int i2 = this.f13755c;
        this.f13755c = i2 + 1;
        zArr3[i2] = z;
    }

    public void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo25844e();
        if (i < 0 || i > (i2 = this.f13755c)) {
            throw new IndexOutOfBoundsException(mo25957d(i));
        }
        boolean[] zArr = this.f13754b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f13754b, i, zArr2, i + 1, this.f13755c - i);
            this.f13754b = zArr2;
        }
        this.f13754b[i] = booleanValue;
        this.f13755c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo25844e();
        Charset charset = C5252z.f13963a;
        collection.getClass();
        if (!(collection instanceof C5142g)) {
            return super.addAll(collection);
        }
        C5142g gVar = (C5142g) collection;
        int i = gVar.f13755c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13755c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f13754b;
            if (i3 > zArr.length) {
                this.f13754b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(gVar.f13754b, 0, this.f13754b, this.f13755c, gVar.f13755c);
            this.f13755c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo25955c(int i) {
        if (i < 0 || i >= this.f13755c) {
            throw new IndexOutOfBoundsException(mo25957d(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final String mo25957d(int i) {
        return "Index:" + i + ", Size:" + this.f13755c;
    }

    /* renamed from: e */
    public C5252z.C5253a mo25861b(int i) {
        if (i >= this.f13755c) {
            return new C5142g(Arrays.copyOf(this.f13754b, i), this.f13755c);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5142g)) {
            return super.equals(obj);
        }
        C5142g gVar = (C5142g) obj;
        if (this.f13755c != gVar.f13755c) {
            return false;
        }
        boolean[] zArr = gVar.f13754b;
        for (int i = 0; i < this.f13755c; i++) {
            if (this.f13754b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo25955c(i);
        return Boolean.valueOf(this.f13754b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13755c; i2++) {
            i = (i * 31) + C5252z.m16433a(this.f13754b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f13755c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13754b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25844e();
        mo25955c(i);
        boolean[] zArr = this.f13754b;
        boolean z = zArr[i];
        int i2 = this.f13755c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f13755c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public void removeRange(int i, int i2) {
        mo25844e();
        if (i2 >= i) {
            boolean[] zArr = this.f13754b;
            System.arraycopy(zArr, i2, zArr, i, this.f13755c - i2);
            this.f13755c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo25844e();
        mo25955c(i);
        boolean[] zArr = this.f13754b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public int size() {
        return this.f13755c;
    }

    public C5142g(boolean[] zArr, int i) {
        this.f13754b = zArr;
        this.f13755c = i;
    }

    public boolean add(Object obj) {
        mo25953a(((Boolean) obj).booleanValue());
        return true;
    }
}
