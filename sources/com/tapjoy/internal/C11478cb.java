package com.tapjoy.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.tapjoy.internal.cb */
public final class C11478cb {
    /* renamed from: a */
    public static byte[] m33382a(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA-1").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
