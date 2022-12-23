package com.p374my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: com.my.tracker.obfuscated.o0 */
public final class C10158o0 {

    /* renamed from: a */
    public static final Charset f25433a = Charset.forName("UTF-8");

    /* renamed from: a */
    static int m30357a(double d, OutputStream outputStream) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d);
        outputStream.write(((int) doubleToRawLongBits) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 8)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 16)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 24)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 32)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 40)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 48)) & 255);
        outputStream.write(((int) (doubleToRawLongBits >> 56)) & 255);
        return 8;
    }

    /* renamed from: a */
    static int m30358a(float f, OutputStream outputStream) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        outputStream.write(floatToRawIntBits & 255);
        outputStream.write((floatToRawIntBits >> 8) & 255);
        outputStream.write((floatToRawIntBits >> 16) & 255);
        outputStream.write((floatToRawIntBits >> 24) & 255);
        return 4;
    }

    /* renamed from: a */
    public static int m30359a(int i, double d, OutputStream outputStream) {
        return m30361a(i, 1, outputStream) + m30357a(d, outputStream);
    }

    /* renamed from: a */
    public static int m30360a(int i, float f, OutputStream outputStream) {
        return m30361a(i, 5, outputStream) + m30358a(f, outputStream);
    }

    /* renamed from: a */
    static int m30361a(int i, int i2, OutputStream outputStream) {
        return m30364a((i << 3) | i2, outputStream);
    }

    /* renamed from: a */
    public static int m30362a(int i, long j, OutputStream outputStream) {
        return m30361a(i, 0, outputStream) + m30368a(j, outputStream);
    }

    /* renamed from: a */
    public static int m30363a(int i, ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        if (byteArrayOutputStream == null) {
            return 0;
        }
        return m30361a(i, 2, outputStream) + m30369a(byteArrayOutputStream, outputStream);
    }

    /* renamed from: a */
    static int m30364a(int i, OutputStream outputStream) {
        int i2 = 0;
        while (true) {
            i2++;
            if ((i & -128) == 0) {
                outputStream.write(i);
                return i2;
            }
            outputStream.write((i & 127) | 128);
            i >>>= 7;
        }
    }

    /* renamed from: a */
    public static int m30365a(int i, String str, OutputStream outputStream) {
        if (str == null) {
            return 0;
        }
        return m30361a(i, 2, outputStream) + m30370a(str, outputStream);
    }

    /* renamed from: a */
    public static int m30366a(int i, byte[] bArr, OutputStream outputStream) {
        if (bArr == null) {
            return 0;
        }
        return m30361a(i, 2, outputStream) + m30371a(bArr, outputStream);
    }

    /* renamed from: a */
    public static int m30367a(int i, String[] strArr, OutputStream outputStream) {
        if (strArr == null) {
            return 0;
        }
        int i2 = 0;
        for (String a : strArr) {
            i2 += m30365a(i, a, outputStream);
        }
        return i2;
    }

    /* renamed from: a */
    static int m30368a(long j, OutputStream outputStream) {
        int i = 0;
        while (true) {
            i++;
            if ((-128 & j) == 0) {
                outputStream.write((int) j);
                return i;
            }
            outputStream.write(((int) (127 & j)) | 128);
            j >>>= 7;
        }
    }

    /* renamed from: a */
    static int m30369a(ByteArrayOutputStream byteArrayOutputStream, OutputStream outputStream) {
        int size = byteArrayOutputStream.size();
        int b = m30373b(size, outputStream) + size;
        byteArrayOutputStream.writeTo(outputStream);
        return b;
    }

    /* renamed from: a */
    static int m30370a(String str, OutputStream outputStream) {
        return m30371a(str.getBytes(f25433a), outputStream);
    }

    /* renamed from: a */
    static int m30371a(byte[] bArr, OutputStream outputStream) {
        int b = m30373b(bArr.length, outputStream) + bArr.length;
        outputStream.write(bArr);
        return b;
    }

    /* renamed from: b */
    public static int m30372b(int i, int i2, OutputStream outputStream) {
        return m30361a(i, 0, outputStream) + m30373b(i2, outputStream);
    }

    /* renamed from: b */
    static int m30373b(int i, OutputStream outputStream) {
        return i < 0 ? m30368a((long) i, outputStream) : m30364a(i, outputStream);
    }
}
