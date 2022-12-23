package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.c1 */
public final class C5129c1<E> extends C5125c<E> implements RandomAccess {

    /* renamed from: d */
    public static final C5129c1<Object> f13731d;

    /* renamed from: b */
    public E[] f13732b;

    /* renamed from: c */
    public int f13733c;

    static {
        C5129c1<Object> c1Var = new C5129c1<>(new Object[0], 0);
        f13731d = c1Var;
        c1Var.f13728a = false;
    }

    public C5129c1(E[] eArr, int i) {
        this.f13732b = eArr;
        this.f13733c = i;
    }

    public boolean add(E e) {
        mo25844e();
        int i = this.f13733c;
        E[] eArr = this.f13732b;
        if (i == eArr.length) {
            this.f13732b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f13732b;
        int i2 = this.f13733c;
        this.f13733c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public C5252z.C5263j mo25861b(int i) {
        if (i >= this.f13733c) {
            return new C5129c1(Arrays.copyOf(this.f13732b, i), this.f13733c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo25862c(int i) {
        if (i < 0 || i >= this.f13733c) {
            throw new IndexOutOfBoundsException(mo25863d(i));
        }
    }

    /* renamed from: d */
    public final String mo25863d(int i) {
        return "Index:" + i + ", Size:" + this.f13733c;
    }

    public E get(int i) {
        mo25862c(i);
        return this.f13732b[i];
    }

    public E remove(int i) {
        mo25844e();
        mo25862c(i);
        E[] eArr = this.f13732b;
        E e = eArr[i];
        int i2 = this.f13733c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f13733c--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo25844e();
        mo25862c(i);
        E[] eArr = this.f13732b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f13733c;
    }

    public void add(int i, E e) {
        int i2;
        mo25844e();
        if (i < 0 || i > (i2 = this.f13733c)) {
            throw new IndexOutOfBoundsException(mo25863d(i));
        }
        E[] eArr = this.f13732b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f13732b, i, eArr2, i + 1, this.f13733c - i);
            this.f13732b = eArr2;
        }
        this.f13732b[i] = e;
        this.f13733c++;
        this.modCount++;
    }
}
