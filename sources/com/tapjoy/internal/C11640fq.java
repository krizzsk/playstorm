package com.tapjoy.internal;

import android.util.Base64;
import com.tapjoy.TapjoyUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import java.util.zip.CRC32;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.fq */
public final class C11640fq {

    /* renamed from: a */
    public final C11641a f28305a;

    /* renamed from: b */
    public final String f28306b;

    /* renamed from: c */
    public final String f28307c;

    /* renamed from: d */
    public final String f28308d;

    /* renamed from: e */
    private final String f28309e;

    /* renamed from: f */
    private final int f28310f;

    /* renamed from: com.tapjoy.internal.fq$a */
    public enum C11641a {
        SDK_ANDROID((byte) 2),
        RPC_ANALYTICS((byte) 49);
        

        /* renamed from: c */
        public byte f28314c;

        private C11641a(byte b) {
            this.f28314c = b;
        }

        @Nullable
        /* renamed from: a */
        public static C11641a m33805a(byte b) {
            for (C11641a aVar : values()) {
                if (aVar.f28314c == b) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C11640fq(String str) {
        int length = str.length();
        if (!str.matches("[A-Za-z0-9\\-_]*") || length < 60 || (length & 3) != 0) {
            throw new IllegalArgumentException("The given API key was malformed.");
        }
        try {
            byte[] decode = Base64.decode(str, 8);
            int length2 = decode.length;
            ByteBuffer wrap = ByteBuffer.wrap(decode);
            wrap.order(ByteOrder.BIG_ENDIAN);
            int length3 = decode.length - 4;
            int i = wrap.getInt(length3);
            CRC32 crc32 = new CRC32();
            crc32.update(decode, 0, length3);
            if (i == ((int) crc32.getValue())) {
                this.f28309e = str;
                this.f28306b = new UUID(wrap.getLong(0), wrap.getLong(8)).toString();
                this.f28310f = wrap.get(16);
                this.f28305a = C11641a.m33805a(wrap.get(17));
                this.f28307c = str.substring(24, 44);
                int i2 = this.f28310f;
                if (i2 == 1) {
                    this.f28308d = null;
                } else if (i2 != 2 || this.f28305a != C11641a.SDK_ANDROID) {
                    throw new IllegalArgumentException("The given API key was not supported.");
                } else if (length2 >= 57) {
                    byte[] bArr = new byte[12];
                    System.arraycopy(decode, 33, bArr, 0, 12);
                    this.f28308d = TapjoyUtil.convertToHex(bArr);
                } else {
                    throw new IllegalArgumentException("The given API key was invalid.");
                }
            } else {
                throw new IllegalArgumentException("The given API key was invalid.");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("The given API key was malformed.", e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C11640fq) {
            return this.f28309e.equals(((C11640fq) obj).f28309e);
        }
        return false;
    }

    public final String toString() {
        return this.f28309e;
    }

    /* renamed from: a */
    public static String m33804a(String str) {
        if (str.regionMatches(13, "-8000-8000-", 0, 11)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str.substring(0, 8));
            stringBuffer.append(str.substring(24, 30));
            stringBuffer.append(str.substring(9, 13));
            stringBuffer.append(str.substring(30));
            return stringBuffer.toString();
        }
        throw new IllegalArgumentException("The given UUID did not come from 5Rocks.");
    }
}
