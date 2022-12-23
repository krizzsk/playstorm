package com.bytedance.sdk.component.p104b.p105a.p108b;

import com.facebook.internal.security.CertificateUtil;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.bytedance.sdk.component.b.a.b.i */
/* compiled from: Util */
public final class C2803i {

    /* renamed from: a */
    public static final Charset f6305a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static int m7666a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static void m7672a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static int m7667a(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    public static int m7675b(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static int m7669a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m7668a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static String m7670a(String str) {
        InetAddress inetAddress;
        if (str.contains(CertificateUtil.DELIMITER)) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = m7677c(str, 0, str.length());
            } else {
                inetAddress = m7677c(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return m7671a(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m7676b(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m7676b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static InetAddress m7677c(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i5 == 16) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i5 != 0) {
                        if (str.regionMatches(i, CertificateUtil.DELIMITER, 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, ".", 0, 1) || !m7673a(str, i4, i2, bArr, i5 - 2)) {
                            return null;
                        } else {
                            i5 += 2;
                        }
                    }
                    i4 = i;
                } else if (i3 != -1) {
                    return null;
                } else {
                    i5 += 2;
                    i3 = i5;
                    if (i6 == i2) {
                        break;
                    }
                    i4 = i6;
                }
                int i7 = 0;
                i = i4;
                while (i < i2) {
                    int a = m7666a(str.charAt(i));
                    if (a == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + a;
                    i++;
                }
                int i8 = i - i4;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i5 + 1;
                bArr[i5] = (byte) ((i7 >>> 8) & 255);
                i5 = i9 + 1;
                bArr[i9] = (byte) (i7 & 255);
            }
        }
        if (i5 != 16) {
            if (i3 == -1) {
                return null;
            }
            int i10 = i5 - i3;
            System.arraycopy(bArr, i3, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i3, (16 - i5) + i3, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static boolean m7673a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m7671a(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C2795a aVar = new C2795a();
        while (i < bArr.length) {
            if (i == i2) {
                aVar.mo17520b(58);
                i += i4;
                if (i == 16) {
                    aVar.mo17520b(58);
                }
            } else {
                if (i > 0) {
                    aVar.mo17520b(58);
                }
                aVar.mo17521b((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return aVar.mo17524c();
    }

    /* renamed from: a */
    public static boolean m7674a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
