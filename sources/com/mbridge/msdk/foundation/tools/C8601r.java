package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import java.io.PrintStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.mbridge.msdk.foundation.tools.r */
/* compiled from: SameFileMD5 */
public class C8601r {

    /* renamed from: a */
    protected static char[] f20791a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    protected static MessageDigest f20792b = null;

    /* renamed from: c */
    private static String f20793c = "SameFileMD5";

    static {
        f20792b = null;
        try {
            f20792b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e) {
            PrintStream printStream = System.err;
            printStream.println(C8601r.class.getName() + "初始化失败，MessageDigest不支持MD5Util.");
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24860a(java.io.File r8) throws java.io.IOException {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0033 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x0033 }
            java.nio.channels.FileChannel r2 = r1.getChannel()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r4 = 0
            long r6 = r8.length()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.nio.MappedByteBuffer r8 = r2.map(r3, r4, r6)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.security.MessageDigest r0 = f20792b     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r0.update(r8)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.security.MessageDigest r8 = f20792b     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            byte[] r8 = r8.digest()     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r0 = 0
            int r2 = r8.length     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            java.lang.String r8 = m24861a(r8, r0, r2)     // Catch:{ Exception -> 0x002e, all -> 0x002b }
            r1.close()
            return r8
        L_0x002b:
            r8 = move-exception
            r0 = r1
            goto L_0x0043
        L_0x002e:
            r8 = move-exception
            r0 = r1
            goto L_0x0034
        L_0x0031:
            r8 = move-exception
            goto L_0x0043
        L_0x0033:
            r8 = move-exception
        L_0x0034:
            java.lang.String r1 = f20793c     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "FILE EXCEPTION"
            com.mbridge.msdk.foundation.tools.C8608u.m24881a(r1, r2, r8)     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0040
            r0.close()
        L_0x0040:
            java.lang.String r8 = ""
            return r8
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            r0.close()
        L_0x0048:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8601r.m24860a(java.io.File):java.lang.String");
    }

    /* renamed from: a */
    private static String m24861a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            char[] cArr = f20791a;
            char c = cArr[(b & 240) >> 4];
            char c2 = cArr[b & Ascii.f17944SI];
            stringBuffer.append(c);
            stringBuffer.append(c2);
            i++;
        }
        return stringBuffer.toString();
    }
}
