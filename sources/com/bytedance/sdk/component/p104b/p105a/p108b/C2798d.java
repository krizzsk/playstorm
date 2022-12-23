package com.bytedance.sdk.component.p104b.p105a.p108b;

import com.google.common.base.Ascii;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.b.a.b.d */
/* compiled from: ByteString */
public class C2798d implements Serializable, Comparable<C2798d> {

    /* renamed from: a */
    static final char[] f6288a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final Charset f6289b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final C2798d f6290c = m7641a(new byte[0]);

    /* renamed from: d */
    final byte[] f6291d;

    /* renamed from: e */
    transient int f6292e;

    /* renamed from: f */
    transient String f6293f;

    C2798d(byte[] bArr) {
        this.f6291d = bArr;
    }

    /* renamed from: a */
    public static C2798d m7641a(byte... bArr) {
        if (bArr != null) {
            return new C2798d((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public String mo17540a() {
        String str = this.f6293f;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f6291d, f6289b);
        this.f6293f = str2;
        return str2;
    }

    /* renamed from: b */
    public String mo17543b() {
        byte[] bArr = this.f6291d;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f6288a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f17944SI];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public C2798d mo17539a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f6291d;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f6291d, i, bArr2, 0, i3);
                    return new C2798d(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f6291d.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a */
    public byte mo17537a(int i) {
        return this.f6291d[i];
    }

    /* renamed from: c */
    public int mo17544c() {
        return this.f6291d.length;
    }

    /* renamed from: d */
    public byte[] mo17546d() {
        return (byte[]) this.f6291d.clone();
    }

    /* renamed from: a */
    public boolean mo17541a(int i, C2798d dVar, int i2, int i3) {
        return dVar.mo17542a(i2, this.f6291d, i, i3);
    }

    /* renamed from: a */
    public boolean mo17542a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f6291d;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C2803i.m7674a(bArr2, i, bArr, i2, i3);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2798d) {
            C2798d dVar = (C2798d) obj;
            int c = dVar.mo17544c();
            byte[] bArr = this.f6291d;
            if (c == bArr.length && dVar.mo17542a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f6292e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f6291d);
        this.f6292e = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public int compareTo(C2798d dVar) {
        int c = mo17544c();
        int c2 = dVar.mo17544c();
        int min = Math.min(c, c2);
        int i = 0;
        while (i < min) {
            byte a = mo17537a(i) & 255;
            byte a2 = dVar.mo17537a(i) & 255;
            if (a == a2) {
                i++;
            } else if (a < a2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (c == c2) {
            return 0;
        }
        if (c < c2) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f6291d.length == 0) {
            return "[size=0]";
        }
        String a = mo17540a();
        int a2 = m7640a(a, 64);
        if (a2 != -1) {
            String replace = a.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (a2 < a.length()) {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(this.f6291d.length);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
            } else {
                sb = new StringBuilder();
                sb.append("[text=");
                sb.append(replace);
                sb.append("]");
            }
            return sb.toString();
        } else if (this.f6291d.length <= 64) {
            return "[hex=" + mo17543b() + "]";
        } else {
            return "[size=" + this.f6291d.length + " hex=" + mo17539a(0, 64).mo17543b() + "…]";
        }
    }

    /* renamed from: a */
    static int m7640a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
