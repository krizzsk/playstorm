package com.tapjoy.internal;

import com.google.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.tapjoy.internal.je */
public class C11804je implements Serializable, Comparable<C11804je> {

    /* renamed from: a */
    static final char[] f28816a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final C11804je f28817b = new C11804je((byte[]) new byte[0].clone());

    /* renamed from: c */
    final byte[] f28818c;

    /* renamed from: d */
    transient int f28819d;

    /* renamed from: e */
    transient String f28820e;

    public /* synthetic */ int compareTo(Object obj) {
        C11804je jeVar = (C11804je) obj;
        int c = mo72783c();
        int c2 = jeVar.mo72783c();
        int min = Math.min(c, c2);
        for (int i = 0; i < min; i++) {
            byte a = mo72777a(i) & 255;
            byte a2 = jeVar.mo72777a(i) & 255;
            if (a != a2) {
                return a < a2 ? -1 : 1;
            }
        }
        if (c == c2) {
            return 0;
        }
        return c < c2 ? -1 : 1;
    }

    public C11804je(byte[] bArr) {
        this.f28818c = bArr;
    }

    /* renamed from: a */
    public String mo72779a() {
        String str = this.f28820e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f28818c, C11817jo.f28846a);
        this.f28820e = str2;
        return str2;
    }

    /* renamed from: b */
    public String mo72782b() {
        byte[] bArr = this.f28818c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f28816a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f17944SI];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public C11804je mo72778a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f28818c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f28818c, i, bArr2, 0, i3);
                    return new C11804je(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f28818c.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a */
    public byte mo72777a(int i) {
        return this.f28818c[i];
    }

    /* renamed from: c */
    public int mo72783c() {
        return this.f28818c.length;
    }

    /* renamed from: d */
    public byte[] mo72785d() {
        return (byte[]) this.f28818c.clone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72780a(C11801jb jbVar) {
        byte[] bArr = this.f28818c;
        jbVar.mo72747a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo72781a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f28818c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C11817jo.m34350a(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11804je) {
            C11804je jeVar = (C11804je) obj;
            int c = jeVar.mo72783c();
            byte[] bArr = this.f28818c;
            return c == bArr.length && jeVar.mo72781a(0, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        int i = this.f28819d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f28818c);
        this.f28819d = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.f28818c.length == 0) {
            return "[size=0]";
        }
        String a = mo72779a();
        int length = a.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = a.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = a.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i != -1) {
            String replace = a.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a.length()) {
                return "[size=" + this.f28818c.length + " text=" + replace + "…]";
            }
            return "[text=" + replace + "]";
        } else if (this.f28818c.length <= 64) {
            return "[hex=" + mo72782b() + "]";
        } else {
            return "[size=" + this.f28818c.length + " hex=" + mo72778a(0, 64).mo72782b() + "…]";
        }
    }
}
