package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.y */
public final class C5250y extends C5125c<Integer> implements C5252z.C5259g, RandomAccess, C5264z0 {

    /* renamed from: d */
    public static final C5250y f13960d;

    /* renamed from: b */
    public int[] f13961b;

    /* renamed from: c */
    public int f13962c;

    static {
        C5250y yVar = new C5250y(new int[0], 0);
        f13960d = yVar;
        yVar.f13728a = false;
    }

    public C5250y() {
        this(new int[10], 0);
    }

    public void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo25844e();
        if (i < 0 || i > (i2 = this.f13962c)) {
            throw new IndexOutOfBoundsException(mo26309f(i));
        }
        int[] iArr = this.f13961b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f13961b, i, iArr2, i + 1, this.f13962c - i);
            this.f13961b = iArr2;
        }
        this.f13961b[i] = intValue;
        this.f13962c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo25844e();
        Charset charset = C5252z.f13963a;
        collection.getClass();
        if (!(collection instanceof C5250y)) {
            return super.addAll(collection);
        }
        C5250y yVar = (C5250y) collection;
        int i = yVar.f13962c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13962c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f13961b;
            if (i3 > iArr.length) {
                this.f13961b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(yVar.f13961b, 0, this.f13961b, this.f13962c, yVar.f13962c);
            this.f13962c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void mo26305c(int i) {
        mo25844e();
        int i2 = this.f13962c;
        int[] iArr = this.f13961b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f13961b = iArr2;
        }
        int[] iArr3 = this.f13961b;
        int i3 = this.f13962c;
        this.f13962c = i3 + 1;
        iArr3[i3] = i;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo26307d(int i) {
        if (i < 0 || i >= this.f13962c) {
            throw new IndexOutOfBoundsException(mo26309f(i));
        }
    }

    /* renamed from: e */
    public int mo26308e(int i) {
        mo26307d(i);
        return this.f13961b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5250y)) {
            return super.equals(obj);
        }
        C5250y yVar = (C5250y) obj;
        if (this.f13962c != yVar.f13962c) {
            return false;
        }
        int[] iArr = yVar.f13961b;
        for (int i = 0; i < this.f13962c; i++) {
            if (this.f13961b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo26309f(int i) {
        return "Index:" + i + ", Size:" + this.f13962c;
    }

    /* renamed from: g */
    public C5252z.C5259g mo25861b(int i) {
        if (i >= this.f13962c) {
            return new C5250y(Arrays.copyOf(this.f13961b, i), this.f13962c);
        }
        throw new IllegalArgumentException();
    }

    public Object get(int i) {
        mo26307d(i);
        return Integer.valueOf(this.f13961b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13962c; i2++) {
            i = (i * 31) + this.f13961b[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f13962c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13961b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25844e();
        mo26307d(i);
        int[] iArr = this.f13961b;
        int i2 = iArr[i];
        int i3 = this.f13962c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f13962c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public void removeRange(int i, int i2) {
        mo25844e();
        if (i2 >= i) {
            int[] iArr = this.f13961b;
            System.arraycopy(iArr, i2, iArr, i, this.f13962c - i2);
            this.f13962c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo25844e();
        mo26307d(i);
        int[] iArr = this.f13961b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public int size() {
        return this.f13962c;
    }

    public C5250y(int[] iArr, int i) {
        this.f13961b = iArr;
        this.f13962c = i;
    }

    public boolean add(Object obj) {
        mo26305c(((Integer) obj).intValue());
        return true;
    }
}
