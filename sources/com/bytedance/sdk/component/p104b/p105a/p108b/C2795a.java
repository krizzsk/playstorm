package com.bytedance.sdk.component.p104b.p105a.p108b;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.b.a.b.a */
/* compiled from: Buffer */
public final class C2795a implements C2796b, C2797c, Cloneable, ByteChannel {

    /* renamed from: c */
    private static final byte[] f6285c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    C2799e f6286a;

    /* renamed from: b */
    long f6287b;

    public void close() {
    }

    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: a */
    public boolean mo17517a() {
        return this.f6287b == 0;
    }

    /* renamed from: b */
    public byte mo17519b() {
        if (this.f6287b != 0) {
            C2799e eVar = this.f6286a;
            int i = eVar.f6295b;
            int i2 = eVar.f6296c;
            int i3 = i + 1;
            byte b = eVar.f6294a[i];
            this.f6287b--;
            if (i3 == i2) {
                this.f6286a = eVar.mo17552b();
                C2800f.m7655a(eVar);
            } else {
                eVar.f6295b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: c */
    public String mo17524c() {
        try {
            return mo17515a(this.f6287b, C2803i.f6305a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public String mo17515a(long j, Charset charset) throws EOFException {
        C2803i.m7672a(this.f6287b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C2799e eVar = this.f6286a;
            if (((long) eVar.f6295b) + j > ((long) eVar.f6296c)) {
                return new String(mo17518a(j), charset);
            }
            String str = new String(eVar.f6294a, eVar.f6295b, (int) j, charset);
            eVar.f6295b = (int) (((long) eVar.f6295b) + j);
            this.f6287b -= j;
            if (eVar.f6295b == eVar.f6296c) {
                this.f6286a = eVar.mo17552b();
                C2800f.m7655a(eVar);
            }
            return str;
        }
    }

    /* renamed from: a */
    public byte[] mo17518a(long j) throws EOFException {
        C2803i.m7672a(this.f6287b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            mo17516a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* renamed from: a */
    public void mo17516a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a = mo17510a(bArr, i, bArr.length - i);
            if (a != -1) {
                i += a;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public int mo17510a(byte[] bArr, int i, int i2) {
        C2803i.m7672a((long) bArr.length, (long) i, (long) i2);
        C2799e eVar = this.f6286a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(i2, eVar.f6296c - eVar.f6295b);
        System.arraycopy(eVar.f6294a, eVar.f6295b, bArr, i, min);
        eVar.f6295b += min;
        this.f6287b -= (long) min;
        if (eVar.f6295b == eVar.f6296c) {
            this.f6286a = eVar.mo17552b();
            C2800f.m7655a(eVar);
        }
        return min;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C2799e eVar = this.f6286a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), eVar.f6296c - eVar.f6295b);
        byteBuffer.put(eVar.f6294a, eVar.f6295b, min);
        eVar.f6295b += min;
        this.f6287b -= (long) min;
        if (eVar.f6295b == eVar.f6296c) {
            this.f6286a = eVar.mo17552b();
            C2800f.m7655a(eVar);
        }
        return min;
    }

    /* renamed from: a */
    public C2795a mo17512a(String str) {
        return mo17513a(str, 0, str.length());
    }

    /* renamed from: a */
    public C2795a mo17513a(String str, int i, int i2) {
        char c;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C2799e c2 = mo17523c(1);
                    byte[] bArr = c2.f6294a;
                    int i3 = c2.f6296c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = (i3 + i4) - c2.f6296c;
                    c2.f6296c += i5;
                    this.f6287b += (long) i5;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        mo17520b((charAt >> 6) | 192);
                        mo17520b((int) (charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo17520b((charAt >> 12) | 224);
                        mo17520b(((charAt >> 6) & 63) | 128);
                        mo17520b((int) (charAt & '?') | 128);
                    } else {
                        int i6 = i + 1;
                        if (i6 < i2) {
                            c = str.charAt(i6);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            mo17520b(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt & 10239) << 10) | (9215 & c)) + 0;
                            mo17520b((i7 >> 18) | 240);
                            mo17520b(((i7 >> 12) & 63) | 128);
                            mo17520b(((i7 >> 6) & 63) | 128);
                            mo17520b((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    /* renamed from: a */
    public C2795a mo17511a(int i) {
        if (i < 128) {
            mo17520b(i);
        } else if (i < 2048) {
            mo17520b((i >> 6) | 192);
            mo17520b((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                mo17520b((i >> 12) | 224);
                mo17520b(((i >> 6) & 63) | 128);
                mo17520b((i & 63) | 128);
            } else {
                mo17520b(63);
            }
        } else if (i <= 1114111) {
            mo17520b((i >> 18) | 240);
            mo17520b(((i >> 12) & 63) | 128);
            mo17520b(((i >> 6) & 63) | 128);
            mo17520b((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    /* renamed from: a */
    public C2795a mo17514a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C2803i.f6305a)) {
            return mo17513a(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return mo17522b(bytes, 0, bytes.length);
        }
    }

    /* renamed from: b */
    public C2795a mo17522b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C2803i.m7672a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C2799e c = mo17523c(1);
                int min = Math.min(i3 - i, 8192 - c.f6296c);
                System.arraycopy(bArr, i, c.f6294a, c.f6296c, min);
                i += min;
                c.f6296c += min;
            }
            this.f6287b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C2799e c = mo17523c(1);
                int min = Math.min(i, 8192 - c.f6296c);
                byteBuffer.get(c.f6294a, c.f6296c, min);
                i -= min;
                c.f6296c += min;
            }
            this.f6287b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public C2795a mo17520b(int i) {
        C2799e c = mo17523c(1);
        byte[] bArr = c.f6294a;
        int i2 = c.f6296c;
        c.f6296c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f6287b++;
        return this;
    }

    /* renamed from: b */
    public C2795a mo17521b(long j) {
        if (j == 0) {
            return mo17520b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C2799e c = mo17523c(numberOfTrailingZeros);
        byte[] bArr = c.f6294a;
        int i = c.f6296c;
        for (int i2 = (c.f6296c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f6285c[(int) (15 & j)];
            j >>>= 4;
        }
        c.f6296c += numberOfTrailingZeros;
        this.f6287b += (long) numberOfTrailingZeros;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2799e mo17523c(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C2799e eVar = this.f6286a;
        if (eVar == null) {
            C2799e a = C2800f.m7654a();
            this.f6286a = a;
            a.f6300g = a;
            a.f6299f = a;
            return a;
        }
        C2799e eVar2 = eVar.f6300g;
        return (eVar2.f6296c + i > 8192 || !eVar2.f6298e) ? eVar2.mo17551a(C2800f.m7654a()) : eVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2795a)) {
            return false;
        }
        C2795a aVar = (C2795a) obj;
        long j = this.f6287b;
        if (j != aVar.f6287b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C2799e eVar = this.f6286a;
        C2799e eVar2 = aVar.f6286a;
        int i = eVar.f6295b;
        int i2 = eVar2.f6295b;
        while (j2 < this.f6287b) {
            long min = (long) Math.min(eVar.f6296c - i, eVar2.f6296c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (eVar.f6294a[i] != eVar2.f6294a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == eVar.f6296c) {
                eVar = eVar.f6299f;
                i = eVar.f6295b;
            }
            if (i2 == eVar2.f6296c) {
                eVar2 = eVar2.f6299f;
                i2 = eVar2.f6295b;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        C2799e eVar = this.f6286a;
        if (eVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = eVar.f6296c;
            for (int i3 = eVar.f6295b; i3 < i2; i3++) {
                i = (i * 31) + eVar.f6294a[i3];
            }
            eVar = eVar.f6299f;
        } while (eVar != this.f6286a);
        return i;
    }

    public String toString() {
        return mo17529e().toString();
    }

    /* renamed from: d */
    public C2795a clone() {
        C2795a aVar = new C2795a();
        if (this.f6287b == 0) {
            return aVar;
        }
        C2799e a = this.f6286a.mo17550a();
        aVar.f6286a = a;
        a.f6300g = a;
        a.f6299f = a;
        C2799e eVar = this.f6286a;
        while (true) {
            eVar = eVar.f6299f;
            if (eVar != this.f6286a) {
                aVar.f6286a.f6300g.mo17551a(eVar.mo17550a());
            } else {
                aVar.f6287b = this.f6287b;
                return aVar;
            }
        }
    }

    /* renamed from: e */
    public final C2798d mo17529e() {
        long j = this.f6287b;
        if (j <= 2147483647L) {
            return mo17528d((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f6287b);
    }

    /* renamed from: d */
    public final C2798d mo17528d(int i) {
        if (i == 0) {
            return C2798d.f6290c;
        }
        return new C2801g(this, i);
    }
}
