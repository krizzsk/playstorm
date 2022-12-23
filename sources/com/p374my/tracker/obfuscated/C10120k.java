package com.p374my.tracker.obfuscated;

import com.vungle.warren.model.AdvertisementDBAdapter;
import java.security.MessageDigest;

/* renamed from: com.my.tracker.obfuscated.k */
public final class C10120k {
    /* renamed from: a */
    public static String m30103a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5);
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(digest[i])}));
            }
            return sb.toString().toLowerCase();
        } catch (Throwable unused) {
            return null;
        }
    }
}
