package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5252z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.w */
public final class C5246w extends C5125c<Float> implements C5252z.C5258f, RandomAccess, C5264z0 {

    /* renamed from: d */
    public static final C5246w f13954d;

    /* renamed from: b */
    public float[] f13955b;

    /* renamed from: c */
    public int f13956c;

    static {
        C5246w wVar = new C5246w(new float[0], 0);
        f13954d = wVar;
        wVar.f13728a = false;
    }

    public C5246w() {
        this(new float[10], 0);
    }

    /* renamed from: a */
    public void mo26293a(float f) {
        mo25844e();
        int i = this.f13956c;
        float[] fArr = this.f13955b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f13955b = fArr2;
        }
        float[] fArr3 = this.f13955b;
        int i2 = this.f13956c;
        this.f13956c = i2 + 1;
        fArr3[i2] = f;
    }

    public void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo25844e();
        if (i < 0 || i > (i2 = this.f13956c)) {
            throw new IndexOutOfBoundsException(mo26297d(i));
        }
        float[] fArr = this.f13955b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f13955b, i, fArr2, i + 1, this.f13956c - i);
            this.f13955b = fArr2;
        }
        this.f13955b[i] = floatValue;
        this.f13956c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo25844e();
        Charset charset = C5252z.f13963a;
        collection.getClass();
        if (!(collection instanceof C5246w)) {
            return super.addAll(collection);
        }
        C5246w wVar = (C5246w) collection;
        int i = wVar.f13956c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13956c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f13955b;
            if (i3 > fArr.length) {
                this.f13955b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(wVar.f13955b, 0, this.f13955b, this.f13956c, wVar.f13956c);
            this.f13956c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo26295c(int i) {
        if (i < 0 || i >= this.f13956c) {
            throw new IndexOutOfBoundsException(mo26297d(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final String mo26297d(int i) {
        return "Index:" + i + ", Size:" + this.f13956c;
    }

    /* renamed from: e */
    public C5252z.C5258f mo25861b(int i) {
        if (i >= this.f13956c) {
            return new C5246w(Arrays.copyOf(this.f13955b, i), this.f13956c);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5246w)) {
            return super.equals(obj);
        }
        C5246w wVar = (C5246w) obj;
        if (this.f13956c != wVar.f13956c) {
            return false;
        }
        float[] fArr = wVar.f13955b;
        for (int i = 0; i < this.f13956c; i++) {
            if (Float.floatToIntBits(this.f13955b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo26295c(i);
        return Float.valueOf(this.f13955b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13956c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f13955b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f13956c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13955b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25844e();
        mo26295c(i);
        float[] fArr = this.f13955b;
        float f = fArr[i];
        int i2 = this.f13956c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f13956c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public void removeRange(int i, int i2) {
        mo25844e();
        if (i2 >= i) {
            float[] fArr = this.f13955b;
            System.arraycopy(fArr, i2, fArr, i, this.f13956c - i2);
            this.f13956c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo25844e();
        mo26295c(i);
        float[] fArr = this.f13955b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public int size() {
        return this.f13956c;
    }

    public C5246w(float[] fArr, int i) {
        this.f13955b = fArr;
        this.f13956c = i;
    }

    public boolean add(Object obj) {
        mo26293a(((Float) obj).floatValue());
        return true;
    }
}
