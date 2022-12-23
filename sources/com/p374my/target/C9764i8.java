package com.p374my.target;

import android.util.Base64;
import com.vungle.warren.model.AdvertisementDBAdapter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.my.target.i8 */
public class C9764i8 {
    /* renamed from: a */
    public static String m28303a(String str) {
        try {
            return new String(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r6.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006d, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0079, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m28304a(java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x007a }
            r0.<init>()     // Catch:{ all -> 0x007a }
            java.util.zip.DeflaterOutputStream r1 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x006e }
            android.util.Base64OutputStream r2 = new android.util.Base64OutputStream     // Catch:{ all -> 0x006e }
            r3 = 2
            r2.<init>(r0, r3)     // Catch:{ all -> 0x006e }
            r1.<init>(r2)     // Catch:{ all -> 0x006e }
            r2 = 1
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x0062 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0062 }
        L_0x0019:
            boolean r3 = r6.hasNext()     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x0054
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x0062 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0062 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0062 }
            if (r4 == 0) goto L_0x0019
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = com.p374my.target.C10082z8.m29921b((java.lang.String) r4)     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x003f
            r5 = 38
            r1.write(r5)     // Catch:{ all -> 0x0062 }
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            byte[] r3 = r3.getBytes()     // Catch:{ all -> 0x0062 }
            r1.write(r3)     // Catch:{ all -> 0x0062 }
            r3 = 61
            r1.write(r3)     // Catch:{ all -> 0x0062 }
            byte[] r3 = r4.getBytes()     // Catch:{ all -> 0x0062 }
            r1.write(r3)     // Catch:{ all -> 0x0062 }
            goto L_0x0019
        L_0x0054:
            r1.close()     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0062 }
            r1.close()     // Catch:{ all -> 0x006e }
            r0.close()     // Catch:{ all -> 0x007a }
            return r6
        L_0x0062:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0069 }
            goto L_0x006d
        L_0x0069:
            r1 = move-exception
            r6.addSuppressed(r1)     // Catch:{ all -> 0x006e }
        L_0x006d:
            throw r2     // Catch:{ all -> 0x006e }
        L_0x006e:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r0 = move-exception
            r6.addSuppressed(r0)     // Catch:{ all -> 0x007a }
        L_0x0079:
            throw r1     // Catch:{ all -> 0x007a }
        L_0x007a:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cannot encode message: "
            r0.append(r1)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            com.p374my.target.C9672e0.m27882a(r6)
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9764i8.m28304a(java.util.Map):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0033, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003c, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m28305b(java.lang.String r4) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            java.util.zip.DeflaterOutputStream r1 = new java.util.zip.DeflaterOutputStream     // Catch:{ all -> 0x0031 }
            android.util.Base64OutputStream r2 = new android.util.Base64OutputStream     // Catch:{ all -> 0x0031 }
            r3 = 2
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0031 }
            r1.<init>(r2)     // Catch:{ all -> 0x0031 }
            byte[] r4 = r4.getBytes()     // Catch:{ all -> 0x0025 }
            r1.write(r4)     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x0025 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x0031 }
            r0.close()     // Catch:{ all -> 0x003d }
            return r4
        L_0x0025:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch:{ all -> 0x0031 }
        L_0x0030:
            throw r2     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0038 }
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch:{ all -> 0x003d }
        L_0x003c:
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cannot obtain bidder token: "
            r0.append(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            com.p374my.target.C9672e0.m27882a(r4)
            java.lang.String r4 = ""
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9764i8.m28305b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static String m28306c(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(AdvertisementDBAdapter.AdvertisementColumns.COLUMN_MD5);
            instance.update(str.getBytes(Charset.forName("UTF-8")));
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(digest[i])}));
            }
            return sb.toString().toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            return null;
        }
    }
}
