package com.smaato.sdk.core.resourceloader;

import com.google.common.base.Ascii;
import com.smaato.sdk.core.util.Objects;

public class HexEncoder {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public String encodeHexString(byte[] bArr) {
        Objects.requireNonNull(bArr);
        char[] cArr = new char[(r0 << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b & 240) >>> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f17944SI];
        }
        return new String(cArr);
    }
}
