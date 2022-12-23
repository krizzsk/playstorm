package com.tapjoy.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.nio.charset.Charset;

/* renamed from: com.tapjoy.internal.jb */
public final class C11801jb implements C11802jc, C11803jd, Cloneable {

    /* renamed from: c */
    private static final byte[] f28813c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    C11810ji f28814a;

    /* renamed from: b */
    long f28815b;

    /* renamed from: a */
    public final C11802jc mo72748a() {
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    /* renamed from: b */
    public final boolean mo72756b() {
        return this.f28815b == 0;
    }

    /* renamed from: a */
    public final void mo72749a(long j) {
        if (this.f28815b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    public final long mo72757c() {
        long j = this.f28815b;
        if (j == 0) {
            return 0;
        }
        C11810ji jiVar = this.f28814a.f28838g;
        return (jiVar.f28834c >= 8192 || !jiVar.f28836e) ? j : j - ((long) (jiVar.f28834c - jiVar.f28833b));
    }

    /* renamed from: d */
    public final byte mo72762d() {
        if (this.f28815b != 0) {
            C11810ji jiVar = this.f28814a;
            int i = jiVar.f28833b;
            int i2 = jiVar.f28834c;
            int i3 = i + 1;
            byte b = jiVar.f28832a[i];
            this.f28815b--;
            if (i3 == i2) {
                this.f28814a = jiVar.mo72793a();
                C11811jj.m34331a(jiVar);
            } else {
                jiVar.f28833b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: e */
    public final int mo72765e() {
        if (this.f28815b >= 4) {
            C11810ji jiVar = this.f28814a;
            int i = jiVar.f28833b;
            int i2 = jiVar.f28834c;
            if (i2 - i < 4) {
                return ((mo72762d() & 255) << Ascii.CAN) | ((mo72762d() & 255) << Ascii.DLE) | ((mo72762d() & 255) << 8) | (mo72762d() & 255);
            }
            byte[] bArr = jiVar.f28832a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i3] & 255) << Ascii.DLE);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f28815b -= 4;
            if (i6 == i2) {
                this.f28814a = jiVar.mo72793a();
                C11811jj.m34331a(jiVar);
            } else {
                jiVar.f28833b = i6;
            }
            return b3;
        }
        throw new IllegalStateException("size < 4: " + this.f28815b);
    }

    /* renamed from: f */
    public final int mo72769f() {
        return C11817jo.m34346a(mo72765e());
    }

    /* renamed from: b */
    public final C11804je mo72755b(long j) {
        return new C11804je(m34253g(j));
    }

    /* renamed from: c */
    public final String mo72759c(long j) {
        Charset charset = C11817jo.f28846a;
        C11817jo.m34348a(this.f28815b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return "";
        } else {
            C11810ji jiVar = this.f28814a;
            if (((long) jiVar.f28833b) + j > ((long) jiVar.f28834c)) {
                return new String(m34253g(j), charset);
            }
            String str = new String(jiVar.f28832a, jiVar.f28833b, (int) j, charset);
            jiVar.f28833b = (int) (((long) jiVar.f28833b) + j);
            this.f28815b -= j;
            if (jiVar.f28833b == jiVar.f28834c) {
                this.f28814a = jiVar.mo72793a();
                C11811jj.m34331a(jiVar);
            }
            return str;
        }
    }

    /* renamed from: h */
    public final byte[] mo72773h() {
        try {
            return m34253g(this.f28815b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    private byte[] m34253g(long j) {
        C11817jo.m34348a(this.f28815b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            m34252a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    /* renamed from: a */
    private void m34252a(byte[] bArr) {
        int i;
        int i2 = 0;
        while (i2 < bArr.length) {
            int length = bArr.length - i2;
            C11817jo.m34348a((long) bArr.length, (long) i2, (long) length);
            C11810ji jiVar = this.f28814a;
            if (jiVar == null) {
                i = -1;
            } else {
                i = Math.min(length, jiVar.f28834c - jiVar.f28833b);
                System.arraycopy(jiVar.f28832a, jiVar.f28833b, bArr, i2, i);
                jiVar.f28833b += i;
                this.f28815b -= (long) i;
                if (jiVar.f28833b == jiVar.f28834c) {
                    this.f28814a = jiVar.mo72793a();
                    C11811jj.m34331a(jiVar);
                }
            }
            if (i != -1) {
                i2 += i;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: d */
    public final void mo72764d(long j) {
        while (j > 0) {
            C11810ji jiVar = this.f28814a;
            if (jiVar != null) {
                int min = (int) Math.min(j, (long) (jiVar.f28834c - this.f28814a.f28833b));
                long j2 = (long) min;
                this.f28815b -= j2;
                j -= j2;
                this.f28814a.f28833b += min;
                if (this.f28814a.f28833b == this.f28814a.f28834c) {
                    C11810ji jiVar2 = this.f28814a;
                    this.f28814a = jiVar2.mo72793a();
                    C11811jj.m34331a(jiVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public final C11801jb mo72753b(C11804je jeVar) {
        if (jeVar != null) {
            jeVar.mo72780a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: a */
    public final C11801jb mo72754b(String str) {
        char c;
        char charAt;
        int length = str.length();
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (length < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + length + " < 0");
        } else if (length <= str.length()) {
            int i = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    C11810ji c2 = mo72758c(1);
                    byte[] bArr = c2.f28832a;
                    int i2 = c2.f28834c - i;
                    int min = Math.min(length, 8192 - i2);
                    int i3 = i + 1;
                    bArr[i + i2] = (byte) charAt2;
                    while (true) {
                        i = i3;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i4 = (i2 + i) - c2.f28834c;
                            c2.f28834c += i4;
                            this.f28815b += (long) i4;
                        } else {
                            i3 = i + 1;
                            bArr[i + i2] = (byte) charAt;
                        }
                    }
                    int i42 = (i2 + i) - c2.f28834c;
                    c2.f28834c += i42;
                    this.f28815b += (long) i42;
                } else {
                    if (charAt2 < 2048) {
                        mo72767e((charAt2 >> 6) | 192);
                        mo72767e((int) (charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        mo72767e((charAt2 >> 12) | 224);
                        mo72767e(((charAt2 >> 6) & 63) | 128);
                        mo72767e((int) (charAt2 & '?') | 128);
                    } else {
                        int i5 = i + 1;
                        if (i5 < length) {
                            c = str.charAt(i5);
                        } else {
                            c = 0;
                        }
                        if (charAt2 > 56319 || c < 56320 || c > 57343) {
                            mo72767e(63);
                            i = i5;
                        } else {
                            int i6 = (((charAt2 & 10239) << 10) | (9215 & c)) + 0;
                            mo72767e((i6 >> 18) | 240);
                            mo72767e(((i6 >> 12) & 63) | 128);
                            mo72767e(((i6 >> 6) & 63) | 128);
                            mo72767e((i6 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
    }

    /* renamed from: a */
    public final C11801jb mo72747a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C11817jo.m34348a((long) bArr.length, 0, j);
            int i3 = i2 + 0;
            while (i < i3) {
                C11810ji c = mo72758c(1);
                int min = Math.min(i3 - i, 8192 - c.f28834c);
                System.arraycopy(bArr, i, c.f28832a, c.f28834c, min);
                i += min;
                c.f28834c += min;
            }
            this.f28815b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final C11801jb mo72767e(int i) {
        C11810ji c = mo72758c(1);
        byte[] bArr = c.f28832a;
        int i2 = c.f28834c;
        c.f28834c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f28815b++;
        return this;
    }

    /* renamed from: b */
    public final C11801jb mo72763d(int i) {
        int a = C11817jo.m34346a(i);
        C11810ji c = mo72758c(4);
        byte[] bArr = c.f28832a;
        int i2 = c.f28834c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((a >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((a >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((a >>> 8) & 255);
        bArr[i5] = (byte) (a & 255);
        c.f28834c = i5 + 1;
        this.f28815b += 4;
        return this;
    }

    /* renamed from: e */
    public final C11801jb mo72770f(long j) {
        long a = C11817jo.m34347a(j);
        C11810ji c = mo72758c(8);
        byte[] bArr = c.f28832a;
        int i = c.f28834c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((a >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((a >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((a >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((a >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((a >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((a >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((a >>> 8) & 255));
        bArr[i8] = (byte) ((int) (a & 255));
        c.f28834c = i8 + 1;
        this.f28815b += 8;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C11810ji mo72758c(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C11810ji jiVar = this.f28814a;
        if (jiVar == null) {
            C11810ji a = C11811jj.m34330a();
            this.f28814a = a;
            a.f28838g = a;
            a.f28837f = a;
            return a;
        }
        C11810ji jiVar2 = jiVar.f28838g;
        return (jiVar2.f28834c + i > 8192 || !jiVar2.f28836e) ? jiVar2.mo72794a(C11811jj.m34330a()) : jiVar2;
    }

    /* renamed from: a */
    public final void mo72750a(C11801jb jbVar, long j) {
        C11810ji jiVar;
        if (jbVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (jbVar != this) {
            C11817jo.m34348a(jbVar.f28815b, 0, j);
            while (j > 0) {
                int i = 0;
                if (j < ((long) (jbVar.f28814a.f28834c - jbVar.f28814a.f28833b))) {
                    C11810ji jiVar2 = this.f28814a;
                    C11810ji jiVar3 = jiVar2 != null ? jiVar2.f28838g : null;
                    if (jiVar3 != null && jiVar3.f28836e) {
                        if ((((long) jiVar3.f28834c) + j) - ((long) (jiVar3.f28835d ? 0 : jiVar3.f28833b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            jbVar.f28814a.mo72795a(jiVar3, (int) j);
                            jbVar.f28815b -= j;
                            this.f28815b += j;
                            return;
                        }
                    }
                    C11810ji jiVar4 = jbVar.f28814a;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > jiVar4.f28834c - jiVar4.f28833b) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 >= 1024) {
                        jiVar = new C11810ji(jiVar4);
                    } else {
                        jiVar = C11811jj.m34330a();
                        System.arraycopy(jiVar4.f28832a, jiVar4.f28833b, jiVar.f28832a, 0, i2);
                    }
                    jiVar.f28834c = jiVar.f28833b + i2;
                    jiVar4.f28833b += i2;
                    jiVar4.f28838g.mo72794a(jiVar);
                    jbVar.f28814a = jiVar;
                }
                C11810ji jiVar5 = jbVar.f28814a;
                long j2 = (long) (jiVar5.f28834c - jiVar5.f28833b);
                jbVar.f28814a = jiVar5.mo72793a();
                C11810ji jiVar6 = this.f28814a;
                if (jiVar6 == null) {
                    this.f28814a = jiVar5;
                    jiVar5.f28838g = jiVar5;
                    jiVar5.f28837f = jiVar5;
                } else {
                    C11810ji a = jiVar6.f28838g.mo72794a(jiVar5);
                    if (a.f28838g == a) {
                        throw new IllegalStateException();
                    } else if (a.f28838g.f28836e) {
                        int i3 = a.f28834c - a.f28833b;
                        int i4 = 8192 - a.f28838g.f28834c;
                        if (!a.f28838g.f28835d) {
                            i = a.f28838g.f28833b;
                        }
                        if (i3 <= i4 + i) {
                            a.mo72795a(a.f28838g, i3);
                            a.mo72793a();
                            C11811jj.m34331a(a);
                        }
                    }
                }
                jbVar.f28815b -= j2;
                this.f28815b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: b */
    public final long mo72751b(C11801jb jbVar, long j) {
        if (jbVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f28815b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            jbVar.mo72750a(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11801jb)) {
            return false;
        }
        C11801jb jbVar = (C11801jb) obj;
        long j = this.f28815b;
        if (j != jbVar.f28815b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C11810ji jiVar = this.f28814a;
        C11810ji jiVar2 = jbVar.f28814a;
        int i = jiVar.f28833b;
        int i2 = jiVar2.f28833b;
        while (j2 < this.f28815b) {
            long min = (long) Math.min(jiVar.f28834c - i, jiVar2.f28834c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (jiVar.f28832a[i] != jiVar2.f28832a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == jiVar.f28834c) {
                jiVar = jiVar.f28837f;
                i = jiVar.f28833b;
            }
            if (i2 == jiVar2.f28834c) {
                jiVar2 = jiVar2.f28837f;
                i2 = jiVar2.f28833b;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        C11810ji jiVar = this.f28814a;
        if (jiVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jiVar.f28834c;
            for (int i3 = jiVar.f28833b; i3 < i2; i3++) {
                i = (i * 31) + jiVar.f28832a[i3];
            }
            jiVar = jiVar.f28837f;
        } while (jiVar != this.f28814a);
        return i;
    }

    /* renamed from: i */
    public final C11801jb clone() {
        C11801jb jbVar = new C11801jb();
        if (this.f28815b == 0) {
            return jbVar;
        }
        C11810ji jiVar = new C11810ji(this.f28814a);
        jbVar.f28814a = jiVar;
        jiVar.f28838g = jiVar;
        jiVar.f28837f = jiVar;
        C11810ji jiVar2 = this.f28814a;
        while (true) {
            jiVar2 = jiVar2.f28837f;
            if (jiVar2 != this.f28814a) {
                jbVar.f28814a.f28838g.mo72794a(new C11810ji(jiVar2));
            } else {
                jbVar.f28815b = this.f28815b;
                return jbVar;
            }
        }
    }

    /* renamed from: g */
    public final long mo72772g() {
        long j;
        if (this.f28815b >= 8) {
            C11810ji jiVar = this.f28814a;
            int i = jiVar.f28833b;
            int i2 = jiVar.f28834c;
            if (i2 - i < 8) {
                j = ((((long) mo72765e()) & 4294967295L) << 32) | (4294967295L & ((long) mo72765e()));
            } else {
                byte[] bArr = jiVar.f28832a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                long j2 = (((long) bArr[i9]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8);
                this.f28815b -= 8;
                if (i10 == i2) {
                    this.f28814a = jiVar.mo72793a();
                    C11811jj.m34331a(jiVar);
                } else {
                    jiVar.f28833b = i10;
                }
                j = j2;
            }
            return C11817jo.m34347a(j);
        }
        throw new IllegalStateException("size < 8: " + this.f28815b);
    }

    public final String toString() {
        C11804je jeVar;
        long j = this.f28815b;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                jeVar = C11804je.f28817b;
            } else {
                jeVar = new C11812jk(this, i);
            }
            return jeVar.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f28815b);
    }
}
