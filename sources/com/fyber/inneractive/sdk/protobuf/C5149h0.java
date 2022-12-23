package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.h0 */
public final class C5149h0 extends C5125c<Long> implements C5252z.C5262i, RandomAccess, C5264z0 {

    /* renamed from: d */
    public static final C5149h0 f13759d;

    /* renamed from: b */
    public long[] f13760b;

    /* renamed from: c */
    public int f13761c;

    static {
        C5149h0 h0Var = new C5149h0(new long[0], 0);
        f13759d = h0Var;
        h0Var.f13728a = false;
    }

    public C5149h0() {
        this(new long[10], 0);
    }

    /* renamed from: a */
    public void mo25968a(long j) {
        mo25844e();
        int i = this.f13761c;
        long[] jArr = this.f13760b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f13760b = jArr2;
        }
        long[] jArr3 = this.f13760b;
        int i2 = this.f13761c;
        this.f13761c = i2 + 1;
        jArr3[i2] = j;
    }

    public void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo25844e();
        if (i < 0 || i > (i2 = this.f13761c)) {
            throw new IndexOutOfBoundsException(mo25973e(i));
        }
        long[] jArr = this.f13760b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f13760b, i, jArr2, i + 1, this.f13761c - i);
            this.f13760b = jArr2;
        }
        this.f13760b[i] = longValue;
        this.f13761c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo25844e();
        Charset charset = C5252z.f13963a;
        collection.getClass();
        if (!(collection instanceof C5149h0)) {
            return super.addAll(collection);
        }
        C5149h0 h0Var = (C5149h0) collection;
        int i = h0Var.f13761c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13761c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f13760b;
            if (i3 > jArr.length) {
                this.f13760b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(h0Var.f13760b, 0, this.f13760b, this.f13761c, h0Var.f13761c);
            this.f13761c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo25970c(int i) {
        if (i < 0 || i >= this.f13761c) {
            throw new IndexOutOfBoundsException(mo25973e(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public long mo25972d(int i) {
        mo25970c(i);
        return this.f13760b[i];
    }

    /* renamed from: e */
    public final String mo25973e(int i) {
        return "Index:" + i + ", Size:" + this.f13761c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5149h0)) {
            return super.equals(obj);
        }
        C5149h0 h0Var = (C5149h0) obj;
        if (this.f13761c != h0Var.f13761c) {
            return false;
        }
        long[] jArr = h0Var.f13760b;
        for (int i = 0; i < this.f13761c; i++) {
            if (this.f13760b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public C5252z.C5262i mo25861b(int i) {
        if (i >= this.f13761c) {
            return new C5149h0(Arrays.copyOf(this.f13760b, i), this.f13761c);
        }
        throw new IllegalArgumentException();
    }

    public Object get(int i) {
        mo25970c(i);
        return Long.valueOf(this.f13760b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13761c; i2++) {
            i = (i * 31) + C5252z.m16432a(this.f13760b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f13761c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13760b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25844e();
        mo25970c(i);
        long[] jArr = this.f13760b;
        long j = jArr[i];
        int i2 = this.f13761c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f13761c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public void removeRange(int i, int i2) {
        mo25844e();
        if (i2 >= i) {
            long[] jArr = this.f13760b;
            System.arraycopy(jArr, i2, jArr, i, this.f13761c - i2);
            this.f13761c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo25844e();
        mo25970c(i);
        long[] jArr = this.f13760b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public int size() {
        return this.f13761c;
    }

    public C5149h0(long[] jArr, int i) {
        this.f13760b = jArr;
        this.f13761c = i;
    }

    public boolean add(Object obj) {
        mo25968a(((Long) obj).longValue());
        return true;
    }
}
