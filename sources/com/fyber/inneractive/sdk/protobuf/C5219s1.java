package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5212r1;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* renamed from: com.fyber.inneractive.sdk.protobuf.s1 */
public final class C5219s1 {

    /* renamed from: a */
    public static final C5221b f13873a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$b */
    public static abstract class C5221b {
        /* renamed from: a */
        public abstract int mo26242a(int i, byte[] bArr, int i2, int i3);

        /* renamed from: a */
        public abstract int mo26243a(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: a */
        public final String mo26244a(ByteBuffer byteBuffer, int i, int i2) throws C5119a0 {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = byteBuffer.get(r13);
                    if (!C5220a.m16306a(b)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = byteBuffer.get(r13);
                    if (C5220a.m16306a(b2)) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        r13 = i6;
                        while (true) {
                            i5 = i7;
                            if (r13 >= i3) {
                                break;
                            }
                            byte b3 = byteBuffer.get(r13);
                            if (!C5220a.m16306a(b3)) {
                                break;
                            }
                            r13++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else if (C5220a.m16307b(b2)) {
                        if (i6 < i3) {
                            C5220a.m16305a(b2, byteBuffer.get(i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw C5119a0.m15526c();
                        }
                    } else if (C5220a.m16308c(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C5220a.m16304a(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw C5119a0.m15526c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = byteBuffer.get(i6);
                        int i10 = i9 + 1;
                        C5220a.m16303a(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                        i5 = i5 + 1 + 1;
                        r13 = i10 + 1;
                    } else {
                        throw C5119a0.m15526c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public abstract String mo26245a(byte[] bArr, int i, int i2) throws C5119a0;

        /* renamed from: b */
        public abstract String mo26246b(ByteBuffer byteBuffer, int i, int i2) throws C5119a0;
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$d */
    public static class C5223d extends IllegalArgumentException {
        public C5223d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    static {
        C5221b bVar;
        if (!(C5212r1.f13868g && C5212r1.f13867f) || C5130d.m15540a()) {
            bVar = new C5222c();
        } else {
            bVar = new C5224e();
        }
        f13873a = bVar;
    }

    /* renamed from: a */
    public static int m16296a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: a */
    public static int m16297a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: a */
    public static int m16298a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: a */
    public static boolean m16301a(byte[] bArr) {
        if (f13873a.mo26242a(0, bArr, 0, bArr.length) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m16302b(byte[] bArr, int i, int i2) {
        if (f13873a.mo26242a(0, bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m16300a(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m16296a((int) b);
        }
        if (i3 == 1) {
            return m16297a(b, bArr[i]);
        }
        if (i3 == 2) {
            return m16298a((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$a */
    public static class C5220a {
        /* renamed from: a */
        public static void m16305a(byte b, byte b2, char[] cArr, int i) throws C5119a0 {
            if (b < -62 || m16309d(b2)) {
                throw C5119a0.m15526c();
            }
            cArr[i] = (char) (((b & Ascii.f17947US) << 6) | (b2 & 63));
        }

        /* renamed from: a */
        public static boolean m16306a(byte b) {
            return b >= 0;
        }

        /* renamed from: b */
        public static boolean m16307b(byte b) {
            return b < -32;
        }

        /* renamed from: c */
        public static boolean m16308c(byte b) {
            return b < -16;
        }

        /* renamed from: d */
        public static boolean m16309d(byte b) {
            return b > -65;
        }

        /* renamed from: a */
        public static void m16304a(byte b, byte b2, byte b3, char[] cArr, int i) throws C5119a0 {
            if (m16309d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m16309d(b3)))) {
                throw C5119a0.m15526c();
            }
            cArr[i] = (char) (((b & Ascii.f17944SI) << Ascii.f17937FF) | ((b2 & 63) << 6) | (b3 & 63));
        }

        /* renamed from: a */
        public static void m16303a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C5119a0 {
            if (m16309d(b2) || (((b << Ascii.f17938FS) + (b2 + 112)) >> 30) != 0 || m16309d(b3) || m16309d(b4)) {
                throw C5119a0.m15526c();
            }
            byte b5 = ((b & 7) << Ascii.DC2) | ((b2 & 63) << Ascii.f17937FF) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((b5 >>> 10) + 55232);
            cArr[i + 1] = (char) ((b5 & 1023) + 56320);
        }
    }

    /* renamed from: a */
    public static int m16299a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C5223d(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$c */
    public static final class C5222c extends C5221b {
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            if (r13[r14] > -65) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
            if (r13[r14] > -65) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r13[r14] > -65) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo26242a(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = -19
                r1 = 0
                r2 = -62
                r3 = -16
                r4 = -96
                r5 = -1
                r6 = -32
                r7 = -65
                if (r12 == 0) goto L_0x0085
                if (r14 < r15) goto L_0x0013
                return r12
            L_0x0013:
                byte r8 = (byte) r12
                if (r8 >= r6) goto L_0x0023
                if (r8 < r2) goto L_0x0022
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
                goto L_0x0022
            L_0x001f:
                r14 = r12
                goto L_0x0085
            L_0x0022:
                return r5
            L_0x0023:
                if (r8 >= r3) goto L_0x004a
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0039
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x0036
                int r12 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16297a(r8, r14)
                return r12
            L_0x0036:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0039:
                if (r12 > r7) goto L_0x0049
                if (r8 != r6) goto L_0x003f
                if (r12 < r4) goto L_0x0049
            L_0x003f:
                if (r8 != r0) goto L_0x0043
                if (r12 >= r4) goto L_0x0049
            L_0x0043:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0049:
                return r5
            L_0x004a:
                int r9 = r12 >> 8
                int r9 = ~r9
                byte r9 = (byte) r9
                if (r9 != 0) goto L_0x005e
                int r12 = r14 + 1
                byte r9 = r13[r14]
                if (r12 < r15) goto L_0x005b
                int r12 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16297a(r8, r9)
                return r12
            L_0x005b:
                r14 = r12
                r12 = r1
                goto L_0x0061
            L_0x005e:
                int r12 = r12 >> 16
                byte r12 = (byte) r12
            L_0x0061:
                if (r12 != 0) goto L_0x0071
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x006e
                int r12 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16298a((int) r8, (int) r9, (int) r14)
                return r12
            L_0x006e:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0071:
                if (r9 > r7) goto L_0x0084
                int r8 = r8 << 28
                int r9 = r9 + 112
                int r8 = r8 + r9
                int r8 = r8 >> 30
                if (r8 != 0) goto L_0x0084
                if (r12 > r7) goto L_0x0084
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0084:
                return r5
            L_0x0085:
                if (r14 >= r15) goto L_0x008e
                byte r12 = r13[r14]
                if (r12 < 0) goto L_0x008e
                int r14 = r14 + 1
                goto L_0x0085
            L_0x008e:
                if (r14 < r15) goto L_0x0092
                goto L_0x00ef
            L_0x0092:
                if (r14 < r15) goto L_0x0095
                goto L_0x00ef
            L_0x0095:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 >= 0) goto L_0x00f0
                if (r14 >= r6) goto L_0x00aa
                if (r12 < r15) goto L_0x00a1
                r1 = r14
                goto L_0x00ef
            L_0x00a1:
                if (r14 < r2) goto L_0x00ee
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00aa:
                if (r14 >= r3) goto L_0x00ca
                int r8 = r15 + -1
                if (r12 < r8) goto L_0x00b5
                int r1 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16300a((byte[]) r13, (int) r12, (int) r15)
                goto L_0x00ef
            L_0x00b5:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00ee
                if (r14 != r6) goto L_0x00bf
                if (r12 < r4) goto L_0x00ee
            L_0x00bf:
                if (r14 != r0) goto L_0x00c3
                if (r12 >= r4) goto L_0x00ee
            L_0x00c3:
                int r14 = r8 + 1
                byte r12 = r13[r8]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00ca:
                int r8 = r15 + -2
                if (r12 < r8) goto L_0x00d3
                int r1 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16300a((byte[]) r13, (int) r12, (int) r15)
                goto L_0x00ef
            L_0x00d3:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00ee
                int r14 = r14 << 28
                int r12 = r12 + 112
                int r14 = r14 + r12
                int r12 = r14 >> 30
                if (r12 != 0) goto L_0x00ee
                int r12 = r8 + 1
                byte r14 = r13[r8]
                if (r14 > r7) goto L_0x00ee
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0092
            L_0x00ee:
                r1 = r5
            L_0x00ef:
                return r1
            L_0x00f0:
                r14 = r12
                goto L_0x0092
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5219s1.C5222c.mo26242a(int, byte[], int, int):int");
        }

        /* renamed from: b */
        public String mo26246b(ByteBuffer byteBuffer, int i, int i2) throws C5119a0 {
            return mo26244a(byteBuffer, i, i2);
        }

        /* renamed from: a */
        public String mo26245a(byte[] bArr, int i, int i2) throws C5119a0 {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = bArr[r13];
                    if (!C5220a.m16306a(b)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = bArr[r13];
                    if (C5220a.m16306a(b2)) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        r13 = i6;
                        while (true) {
                            i5 = i7;
                            if (r13 >= i3) {
                                break;
                            }
                            byte b3 = bArr[r13];
                            if (!C5220a.m16306a(b3)) {
                                break;
                            }
                            r13++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else if (C5220a.m16307b(b2)) {
                        if (i6 < i3) {
                            C5220a.m16305a(b2, bArr[i6], cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw C5119a0.m15526c();
                        }
                    } else if (C5220a.m16308c(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C5220a.m16304a(b2, bArr[i6], bArr[i8], cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw C5119a0.m15526c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = bArr[i6];
                        int i10 = i9 + 1;
                        C5220a.m16303a(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                        i5 = i5 + 1 + 1;
                        r13 = i10 + 1;
                    } else {
                        throw C5119a0.m15526c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public int mo26243a(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i4 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i4 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i6 - 4) {
                    int i12 = i7 + 1;
                    if (i12 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i15 + 1;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i7 = i12;
                            i7++;
                        } else {
                            i7 = i12;
                        }
                    }
                    throw new C5223d(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                } else {
                    throw new C5223d(i7, length);
                }
                i8 = i4;
                i7++;
            }
            return i8;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.s1$e */
    public static final class C5224e extends C5221b {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
            if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a(r1, r8) > -65) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
            if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a(r1, r8) > -65) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00aa, code lost:
            if (com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a(r1, r8) > -65) goto L_0x00ac;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo26242a(int r22, byte[] r23, int r24, int r25) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                r2 = r24
                r3 = r25
                r4 = r2 | r3
                int r5 = r1.length
                int r5 = r5 - r3
                r4 = r4 | r5
                r5 = 2
                if (r4 < 0) goto L_0x014d
                long r8 = (long) r2
                long r2 = (long) r3
                r4 = -19
                r10 = -62
                r11 = -16
                r12 = 16
                r13 = -96
                r14 = -32
                r15 = -1
                r7 = -65
                r16 = 1
                if (r0 == 0) goto L_0x00ad
                int r18 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r18 < 0) goto L_0x002a
                return r0
            L_0x002a:
                byte r6 = (byte) r0
                if (r6 >= r14) goto L_0x003d
                if (r6 < r10) goto L_0x003c
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                if (r0 <= r7) goto L_0x0038
                goto L_0x003c
            L_0x0038:
                r8 = r19
                goto L_0x00ad
            L_0x003c:
                return r15
            L_0x003d:
                if (r6 >= r11) goto L_0x0069
                int r0 = r0 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0056
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                int r8 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
                if (r8 < 0) goto L_0x0054
                int r0 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16297a(r6, r0)
                return r0
            L_0x0054:
                r8 = r19
            L_0x0056:
                if (r0 > r7) goto L_0x0068
                if (r6 != r14) goto L_0x005c
                if (r0 < r13) goto L_0x0068
            L_0x005c:
                if (r6 != r4) goto L_0x0060
                if (r0 >= r13) goto L_0x0068
            L_0x0060:
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                if (r0 <= r7) goto L_0x0038
            L_0x0068:
                return r15
            L_0x0069:
                int r4 = r0 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L_0x0082
                long r19 = r8 + r16
                byte r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                int r0 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x007e
                int r0 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16297a(r6, r4)
                return r0
            L_0x007e:
                r8 = r19
                r0 = 0
                goto L_0x0084
            L_0x0082:
                int r0 = r0 >> r12
                byte r0 = (byte) r0
            L_0x0084:
                if (r0 != 0) goto L_0x0097
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                int r8 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
                if (r8 < 0) goto L_0x0095
                int r0 = com.fyber.inneractive.sdk.protobuf.C5219s1.m16298a((int) r6, (int) r4, (int) r0)
                return r0
            L_0x0095:
                r8 = r19
            L_0x0097:
                if (r4 > r7) goto L_0x00ac
                int r6 = r6 << 28
                int r4 = r4 + 112
                int r6 = r6 + r4
                int r4 = r6 >> 30
                if (r4 != 0) goto L_0x00ac
                if (r0 > r7) goto L_0x00ac
                long r19 = r8 + r16
                byte r0 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                if (r0 <= r7) goto L_0x0038
            L_0x00ac:
                return r15
            L_0x00ad:
                long r2 = r2 - r8
                int r0 = (int) r2
                if (r0 >= r12) goto L_0x00b3
                r2 = 0
                goto L_0x00c6
            L_0x00b3:
                r3 = r8
                r2 = 0
            L_0x00b5:
                if (r2 >= r0) goto L_0x00c5
                long r19 = r3 + r16
                byte r3 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r3)
                if (r3 >= 0) goto L_0x00c0
                goto L_0x00c6
            L_0x00c0:
                int r2 = r2 + 1
                r3 = r19
                goto L_0x00b5
            L_0x00c5:
                r2 = r0
            L_0x00c6:
                int r0 = r0 - r2
                long r2 = (long) r2
                long r8 = r8 + r2
            L_0x00c9:
                r2 = 0
            L_0x00ca:
                if (r0 <= 0) goto L_0x00db
                long r2 = r8 + r16
                byte r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                if (r4 < 0) goto L_0x00d9
                int r0 = r0 + -1
                r8 = r2
                r2 = r4
                goto L_0x00ca
            L_0x00d9:
                r8 = r2
                r2 = r4
            L_0x00db:
                if (r0 != 0) goto L_0x00e0
                r7 = 0
                goto L_0x014c
            L_0x00e0:
                int r0 = r0 + -1
                if (r2 >= r14) goto L_0x00f8
                if (r0 != 0) goto L_0x00e9
                r7 = r2
                goto L_0x014c
            L_0x00e9:
                int r0 = r0 + -1
                if (r2 < r10) goto L_0x014b
                long r2 = r8 + r16
                byte r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                if (r4 <= r7) goto L_0x00f6
                goto L_0x014b
            L_0x00f6:
                r8 = r2
                goto L_0x00c9
            L_0x00f8:
                if (r2 >= r11) goto L_0x011e
                if (r0 >= r5) goto L_0x0101
                int r7 = m16319a((byte[]) r1, (int) r2, (long) r8, (int) r0)
                goto L_0x014c
            L_0x0101:
                int r0 = r0 + -2
                long r3 = r8 + r16
                byte r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                if (r6 > r7) goto L_0x014b
                if (r2 != r14) goto L_0x010f
                if (r6 < r13) goto L_0x014b
            L_0x010f:
                r12 = -19
                if (r2 != r12) goto L_0x0115
                if (r6 >= r13) goto L_0x014b
            L_0x0115:
                long r8 = r3 + r16
                byte r2 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r3)
                if (r2 <= r7) goto L_0x00c9
                goto L_0x014b
            L_0x011e:
                r3 = 3
                r12 = -19
                if (r0 >= r3) goto L_0x0128
                int r7 = m16319a((byte[]) r1, (int) r2, (long) r8, (int) r0)
                goto L_0x014c
            L_0x0128:
                int r0 = r0 + -3
                long r3 = r8 + r16
                byte r6 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                if (r6 > r7) goto L_0x014b
                int r2 = r2 << 28
                int r6 = r6 + 112
                int r2 = r2 + r6
                int r2 = r2 >> 30
                if (r2 != 0) goto L_0x014b
                long r8 = r3 + r16
                byte r2 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r3)
                if (r2 > r7) goto L_0x014b
                long r2 = r8 + r16
                byte r4 = com.fyber.inneractive.sdk.protobuf.C5212r1.m16214a((byte[]) r1, (long) r8)
                if (r4 <= r7) goto L_0x00f6
            L_0x014b:
                r7 = r15
            L_0x014c:
                return r7
            L_0x014d:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r1 = r1.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6 = 0
                r4[r6] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
                r2 = 1
                r4[r2] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
                r4[r5] = r1
                java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5219s1.C5224e.mo26242a(int, byte[], int, int):int");
        }

        /* renamed from: b */
        public String mo26246b(ByteBuffer byteBuffer, int i, int i2) throws C5119a0 {
            long j;
            int i3 = i;
            int i4 = i2;
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) >= 0) {
                long a = C5212r1.m16216a(byteBuffer) + ((long) i3);
                long j2 = ((long) i4) + a;
                char[] cArr = new char[i4];
                int i5 = 0;
                while (j < j2) {
                    byte a2 = C5212r1.f13866e.mo26230a(j);
                    if (!C5220a.m16306a(a2)) {
                        break;
                    }
                    a = j + 1;
                    cArr[i5] = (char) a2;
                    i5++;
                }
                int i6 = i5;
                while (j < j2) {
                    long j3 = j + 1;
                    C5212r1.C5216d dVar = C5212r1.f13866e;
                    byte a3 = dVar.mo26230a(j);
                    if (C5220a.m16306a(a3)) {
                        cArr[i6] = (char) a3;
                        i6++;
                        j = j3;
                        while (j < j2) {
                            byte a4 = C5212r1.f13866e.mo26230a(j);
                            if (!C5220a.m16306a(a4)) {
                                break;
                            }
                            j++;
                            cArr[i6] = (char) a4;
                            i6++;
                        }
                    } else if (C5220a.m16307b(a3)) {
                        if (j3 < j2) {
                            C5220a.m16305a(a3, dVar.mo26230a(j3), cArr, i6);
                            i6++;
                            j = j3 + 1;
                        } else {
                            throw C5119a0.m15526c();
                        }
                    } else if (C5220a.m16308c(a3)) {
                        if (j3 < j2 - 1) {
                            long j4 = j3 + 1;
                            C5220a.m16304a(a3, dVar.mo26230a(j3), dVar.mo26230a(j4), cArr, i6);
                            i6++;
                            j = j4 + 1;
                        } else {
                            throw C5119a0.m15526c();
                        }
                    } else if (j3 < j2 - 2) {
                        long j5 = j3 + 1;
                        long j6 = j5 + 1;
                        C5220a.m16303a(a3, dVar.mo26230a(j3), dVar.mo26230a(j5), dVar.mo26230a(j6), cArr, i6);
                        i6 = i6 + 1 + 1;
                        j = j6 + 1;
                    } else {
                        throw C5119a0.m15526c();
                    }
                }
                return new String(cArr, 0, i6);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: a */
        public String mo26245a(byte[] bArr, int i, int i2) throws C5119a0 {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte a = C5212r1.m16214a(bArr, (long) r13);
                    if (!C5220a.m16306a(a)) {
                        break;
                    }
                    i = r13 + 1;
                    cArr[i4] = (char) a;
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte a2 = C5212r1.m16214a(bArr, (long) r13);
                    if (C5220a.m16306a(a2)) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) a2;
                        r13 = i6;
                        while (true) {
                            i5 = i7;
                            if (r13 >= i3) {
                                break;
                            }
                            byte a3 = C5212r1.m16214a(bArr, (long) r13);
                            if (!C5220a.m16306a(a3)) {
                                break;
                            }
                            r13++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) a3;
                        }
                    } else if (C5220a.m16307b(a2)) {
                        if (i6 < i3) {
                            C5220a.m16305a(a2, C5212r1.m16214a(bArr, (long) i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw C5119a0.m15526c();
                        }
                    } else if (C5220a.m16308c(a2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C5220a.m16304a(a2, C5212r1.m16214a(bArr, (long) i6), C5212r1.m16214a(bArr, (long) i8), cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw C5119a0.m15526c();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte a4 = C5212r1.m16214a(bArr, (long) i6);
                        int i10 = i9 + 1;
                        C5220a.m16303a(a2, a4, C5212r1.m16214a(bArr, (long) i9), C5212r1.m16214a(bArr, (long) i10), cArr, i5);
                        i5 = i5 + 1 + 1;
                        r13 = i10 + 1;
                    } else {
                        throw C5119a0.m15526c();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:37:0x00fc, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo26243a(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                r2 = r24
                r3 = r25
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r22.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0144
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r4, (byte) r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004a
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004a
                long r14 = r4 + r11
                byte r13 = (byte) r13
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r4, (byte) r13)
                r4 = r11
                r12 = r14
                r11 = r3
                goto L_0x00fc
            L_0x004a:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x0074
                r14 = 2
                long r14 = r6 - r14
                int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r14 > 0) goto L_0x0074
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r4, (byte) r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r14, (byte) r5)
                r19 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r19
                goto L_0x00fc
            L_0x0074:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007e
                if (r3 >= r13) goto L_0x00af
            L_0x007e:
                r15 = 3
                long r15 = r6 - r15
                int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r15 > 0) goto L_0x00af
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r4, (byte) r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r14, (byte) r5)
                r14 = 1
                long r17 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r3, (byte) r5)
                r12 = r17
                r4 = 1
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x00fc
            L_0x00af:
                r11 = 4
                long r11 = r6 - r11
                int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r11 > 0) goto L_0x010f
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r4, (byte) r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r13, (byte) r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r4, (byte) r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                com.fyber.inneractive.sdk.protobuf.C5212r1.m16226a((byte[]) r1, (long) r14, (byte) r2)
                r2 = r3
            L_0x00fc:
                int r2 = r2 + 1
                r3 = r11
                r19 = r4
                r4 = r12
                r11 = r19
                goto L_0x0033
            L_0x0106:
                r2 = r3
            L_0x0107:
                com.fyber.inneractive.sdk.protobuf.s1$d r0 = new com.fyber.inneractive.sdk.protobuf.s1$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010f:
                if (r14 > r13) goto L_0x0127
                if (r13 > r3) goto L_0x0127
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0127
            L_0x0121:
                com.fyber.inneractive.sdk.protobuf.s1$d r0 = new com.fyber.inneractive.sdk.protobuf.s1$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0142:
                int r0 = (int) r4
                return r0
            L_0x0144:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5219s1.C5224e.mo26243a(java.lang.CharSequence, byte[], int, int):int");
        }

        /* renamed from: a */
        public static int m16319a(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return C5219s1.m16296a(i);
            }
            if (i2 == 1) {
                return C5219s1.m16297a(i, C5212r1.m16214a(bArr, j));
            }
            if (i2 == 2) {
                return C5219s1.m16298a(i, (int) C5212r1.m16214a(bArr, j), (int) C5212r1.m16214a(bArr, j + 1));
            }
            throw new AssertionError();
        }
    }
}
