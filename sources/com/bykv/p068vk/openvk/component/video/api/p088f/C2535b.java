package com.bykv.p068vk.openvk.component.video.api.p088f;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.bykv.vk.openvk.component.video.api.f.b */
/* compiled from: MD5 */
public class C2535b {

    /* renamed from: a */
    private static final MessageDigest f5421a = m6428a();

    /* renamed from: b */
    private static final char[] f5422b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private C2535b() {
    }

    /* renamed from: a */
    private static MessageDigest m6428a() {
        try {
            return MessageDigest.getInstance(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m6426a(String str) {
        byte[] digest;
        MessageDigest messageDigest = f5421a;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (C2535b.class) {
            digest = messageDigest.digest(bytes);
        }
        return m6427a(digest);
    }

    /* renamed from: a */
    public static String m6427a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f5422b;
            cArr[i] = cArr2[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f17944SI];
        }
        return new String(cArr);
    }
}
