package com.smaato.sdk.core.util;

public final class Bytes {
    private Bytes() {
    }

    public static int getIntValueFrom(byte[] bArr, int i, int i2) {
        if (bArr.length < 1) {
            return -1;
        }
        int i3 = i + i2;
        byte b = 0;
        while (i < i3) {
            byte b2 = 0;
            for (int i4 = 0; i4 < 8 && i < i3; i4++) {
                b2 = (byte) (b2 | ((byte) (getByteFrom(bArr, i) << (7 - i4))));
                i++;
            }
            b = (b << 8) | (b2 & 255);
        }
        return b >> ((8 - (i2 % 8)) % 8);
    }

    public static byte getByteFrom(byte[] bArr, int i) {
        return (byte) ((bArr[i / 8] >> (7 - (i % 8))) & 1);
    }
}
