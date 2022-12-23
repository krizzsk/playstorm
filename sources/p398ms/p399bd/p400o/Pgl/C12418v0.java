package p398ms.p399bd.p400o.Pgl;

import com.google.common.base.Ascii;
import java.io.BufferedInputStream;

/* renamed from: ms.bd.o.Pgl.v0 */
public class C12418v0 {

    /* renamed from: a */
    private static final String f29442a = ((String) pblk.m34714a(16777217, 0, 0, "316475", new byte[]{54, 39, 122, 78, Ascii.f17937FF}));

    static {
        String str = (String) pblk.m34714a(16777217, 0, 0, "21ecdb", new byte[]{Ascii.CAN, 111, 87, 73, 102});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m34790a(android.content.Context r28) {
        /*
            java.lang.Class<ms.bd.o.Pgl.v0> r1 = p398ms.p399bd.p400o.Pgl.C12418v0.class
            monitor-enter(r1)
            r7 = 75
            r8 = 104(0x68, float:1.46E-43)
            r12 = 6
            r13 = 4
            r14 = 3
            r0 = 10
            r16 = 7
            r17 = 5
            r2 = 2
            r3 = 1
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r5.<init>()     // Catch:{ all -> 0x011f }
            java.io.File r18 = r28.getFilesDir()     // Catch:{ all -> 0x011f }
            java.lang.String r9 = r18.getAbsolutePath()     // Catch:{ all -> 0x011f }
            r5.append(r9)     // Catch:{ all -> 0x011f }
            r19 = 16777217(0x1000001, float:2.350989E-38)
            r20 = 0
            r21 = 0
            java.lang.String r23 = "0dac94"
            byte[] r9 = new byte[r3]     // Catch:{ all -> 0x011f }
            r18 = 110(0x6e, float:1.54E-43)
            r9[r4] = r18     // Catch:{ all -> 0x011f }
            r24 = r9
            java.lang.Object r9 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r19, r20, r21, r23, r24)     // Catch:{ all -> 0x011f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x011f }
            r5.append(r9)     // Catch:{ all -> 0x011f }
            java.lang.String r9 = f29442a     // Catch:{ all -> 0x011f }
            r5.append(r9)     // Catch:{ all -> 0x011f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x011f }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x011f }
            r9.<init>(r5)     // Catch:{ all -> 0x011f }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x005f
            java.lang.String r9 = m34792a((java.lang.String) r5)     // Catch:{ all -> 0x011f }
            if (r9 == 0) goto L_0x005f
            int r18 = r9.length()     // Catch:{ all -> 0x011f }
            if (r18 <= 0) goto L_0x005f
            monitor-exit(r1)
            return r9
        L_0x005f:
            android.content.res.Resources r9 = r28.getResources()     // Catch:{ all -> 0x011f }
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch:{ all -> 0x011f }
            java.lang.String r15 = f29442a     // Catch:{ all -> 0x011f }
            java.io.InputStream r9 = r9.open(r15)     // Catch:{ all -> 0x011f }
            java.io.ByteArrayOutputStream r15 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x011f }
            r15.<init>()     // Catch:{ all -> 0x011f }
            r10 = 4096(0x1000, float:5.74E-42)
            byte[] r10 = new byte[r10]     // Catch:{ all -> 0x011f }
        L_0x0076:
            r11 = 4096(0x1000, float:5.74E-42)
            int r11 = r9.read(r10, r4, r11)     // Catch:{ all -> 0x011f }
            r6 = -1
            if (r11 == r6) goto L_0x0083
            r15.write(r10, r4, r11)     // Catch:{ all -> 0x011f }
            goto L_0x0076
        L_0x0083:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x011f }
            r6.<init>(r5)     // Catch:{ all -> 0x011f }
            byte[] r9 = r15.toByteArray()     // Catch:{ all -> 0x011f }
            r6.write(r9)     // Catch:{ all -> 0x011f }
            r6.close()     // Catch:{ all -> 0x011f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r6.<init>()     // Catch:{ all -> 0x011f }
            r22 = 16777217(0x1000001, float:2.350989E-38)
            r23 = 0
            r24 = 0
            java.lang.String r26 = "bba013"
            byte[] r9 = new byte[r0]     // Catch:{ all -> 0x011f }
            r10 = 112(0x70, float:1.57E-43)
            r9[r4] = r10     // Catch:{ all -> 0x011f }
            r9[r3] = r8     // Catch:{ all -> 0x011f }
            r10 = 31
            r9[r2] = r10     // Catch:{ all -> 0x011f }
            r9[r14] = r7     // Catch:{ all -> 0x011f }
            r9[r13] = r0     // Catch:{ all -> 0x011f }
            r10 = 100
            r9[r17] = r10     // Catch:{ all -> 0x011f }
            r10 = 54
            r9[r12] = r10     // Catch:{ all -> 0x011f }
            r10 = 20
            r9[r16] = r10     // Catch:{ all -> 0x011d }
            r10 = 103(0x67, float:1.44E-43)
            r11 = 8
            r9[r11] = r10     // Catch:{ all -> 0x011f }
            r10 = 32
            r11 = 9
            r9[r11] = r10     // Catch:{ all -> 0x011f }
            r27 = r9
            java.lang.Object r9 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r22, r23, r24, r26, r27)     // Catch:{ all -> 0x011f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x011f }
            r6.append(r9)     // Catch:{ all -> 0x011f }
            r6.append(r5)     // Catch:{ all -> 0x011f }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x011f }
            m34792a((java.lang.String) r6)     // Catch:{ all -> 0x011f }
            java.lang.String r6 = m34792a((java.lang.String) r5)     // Catch:{ all -> 0x011f }
            if (r6 == 0) goto L_0x00e9
            int r9 = r6.length()     // Catch:{ all -> 0x011f }
            if (r9 != 0) goto L_0x018f
        L_0x00e9:
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ all -> 0x011f }
            r22 = 16777217(0x1000001, float:2.350989E-38)
            r23 = 0
            r24 = 0
            java.lang.String r26 = "5ee262"
            byte[] r9 = new byte[r2]     // Catch:{ all -> 0x011f }
            r10 = 54
            r9[r4] = r10     // Catch:{ all -> 0x011f }
            r10 = 112(0x70, float:1.57E-43)
            r9[r3] = r10     // Catch:{ all -> 0x011f }
            r27 = r9
            java.lang.Object r9 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r22, r23, r24, r26, r27)     // Catch:{ all -> 0x011f }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x011f }
            r6.<init>(r5, r9)     // Catch:{ all -> 0x011f }
            byte[] r9 = new byte[r3]     // Catch:{ all -> 0x011f }
            r9[r4] = r2     // Catch:{ all -> 0x011f }
            r10 = 16
            r6.seek(r10)     // Catch:{ all -> 0x011f }
            r6.write(r9)     // Catch:{ all -> 0x011f }
            r6.close()     // Catch:{ all -> 0x011f }
            java.lang.String r6 = m34792a((java.lang.String) r5)     // Catch:{ all -> 0x011f }
            goto L_0x018f
        L_0x011d:
            r5 = r10
            goto L_0x0121
        L_0x011f:
            r5 = 20
        L_0x0121:
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x01f5 }
            r6 = 118(0x76, float:1.65E-43)
            r5[r4] = r6     // Catch:{ all -> 0x01f5 }
            r6 = 88
            r5[r3] = r6     // Catch:{ all -> 0x01f5 }
            r6 = 29
            r5[r2] = r6     // Catch:{ all -> 0x01f5 }
            r5[r14] = r16     // Catch:{ all -> 0x01f5 }
            r9 = 83
            r5[r13] = r9     // Catch:{ all -> 0x01f5 }
            r5[r17] = r6     // Catch:{ all -> 0x01f5 }
            r6 = 17
            r5[r12] = r6     // Catch:{ all -> 0x01f5 }
            r9 = 120(0x78, float:1.68E-43)
            r5[r16] = r9     // Catch:{ all -> 0x01f5 }
            r9 = 64
            r10 = 8
            r5[r10] = r9     // Catch:{ all -> 0x01f5 }
            r9 = 71
            r10 = 9
            r5[r10] = r9     // Catch:{ all -> 0x01f5 }
            r9 = 22
            r5[r0] = r9     // Catch:{ all -> 0x01f5 }
            r9 = 11
            r10 = 87
            r5[r9] = r10     // Catch:{ all -> 0x01f5 }
            r9 = 12
            r5[r9] = r8     // Catch:{ all -> 0x01f5 }
            r9 = 105(0x69, float:1.47E-43)
            r10 = 13
            r5[r10] = r9     // Catch:{ all -> 0x01f5 }
            r9 = 35
            r10 = 14
            r5[r10] = r9     // Catch:{ all -> 0x01f5 }
            r9 = 27
            r10 = 15
            r5[r10] = r9     // Catch:{ all -> 0x01f5 }
            r9 = 16
            r5[r9] = r8     // Catch:{ all -> 0x01f5 }
            r5[r6] = r3     // Catch:{ all -> 0x01f5 }
            r6 = 18
            r8 = 61
            r5[r6] = r8     // Catch:{ all -> 0x01f5 }
            r6 = 19
            r8 = 95
            r5[r6] = r8     // Catch:{ all -> 0x01f5 }
            r21 = 16777217(0x1000001, float:2.350989E-38)
            r22 = 0
            r23 = 0
            java.lang.String r25 = "7a2227"
            r26 = r5
            java.lang.Object r5 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r21, r22, r23, r25, r26)     // Catch:{ all -> 0x01f5 }
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01f5 }
        L_0x018f:
            if (r6 == 0) goto L_0x0197
            int r5 = r6.length()     // Catch:{ all -> 0x01f5 }
            if (r5 != 0) goto L_0x01f3
        L_0x0197:
            r5 = 16
            byte[] r5 = new byte[r5]     // Catch:{ all -> 0x01f5 }
            r6 = 36
            r5[r4] = r6     // Catch:{ all -> 0x01f5 }
            r4 = 91
            r5[r3] = r4     // Catch:{ all -> 0x01f5 }
            r3 = 25
            r5[r2] = r3     // Catch:{ all -> 0x01f5 }
            r2 = 87
            r5[r14] = r2     // Catch:{ all -> 0x01f5 }
            r5[r13] = r17     // Catch:{ all -> 0x01f5 }
            r5[r17] = r7     // Catch:{ all -> 0x01f5 }
            r2 = 67
            r5[r12] = r2     // Catch:{ all -> 0x01f5 }
            r2 = 113(0x71, float:1.58E-43)
            r5[r16] = r2     // Catch:{ all -> 0x01f5 }
            r2 = 85
            r3 = 8
            r5[r3] = r2     // Catch:{ all -> 0x01f5 }
            r2 = 9
            r3 = 29
            r5[r2] = r3     // Catch:{ all -> 0x01f5 }
            r2 = 70
            r5[r0] = r2     // Catch:{ all -> 0x01f5 }
            r0 = 91
            r2 = 11
            r5[r2] = r0     // Catch:{ all -> 0x01f5 }
            r0 = 25
            r2 = 12
            r5[r2] = r0     // Catch:{ all -> 0x01f5 }
            r0 = 13
            r2 = 87
            r5[r0] = r2     // Catch:{ all -> 0x01f5 }
            r0 = 14
            r5[r0] = r17     // Catch:{ all -> 0x01f5 }
            r0 = 15
            r5[r0] = r7     // Catch:{ all -> 0x01f5 }
            r21 = 16777217(0x1000001, float:2.350989E-38)
            r22 = 0
            r23 = 0
            java.lang.String r25 = "eb6bda"
            r26 = r5
            java.lang.Object r0 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r21, r22, r23, r25, r26)     // Catch:{ all -> 0x01f5 }
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x01f5 }
        L_0x01f3:
            monitor-exit(r1)
            return r6
        L_0x01f5:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p398ms.p399bd.p400o.Pgl.C12418v0.m34790a(android.content.Context):java.lang.String");
    }

    /* renamed from: a */
    private static String m34791a(BufferedInputStream bufferedInputStream) {
        int read;
        byte[] bArr = new byte[4096];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    sb.append(new String(bArr, 0, read));
                    continue;
                }
            } catch (Exception unused) {
                String str = (String) pblk.m34714a(16777217, 0, 0, "a9d4e1", new byte[]{117, 50, Ascii.DC4});
            }
        } while (read >= 4096);
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.BufferedInputStream] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.io.BufferedInputStream] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r7v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        r14 = th;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f6, code lost:
        if (r5 != null) goto L_0x00f8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[SYNTHETIC, Splitter:B:44:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00df A[SYNTHETIC, Splitter:B:49:0x00df] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0103 A[SYNTHETIC, Splitter:B:61:0x0103] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x011c A[SYNTHETIC, Splitter:B:66:0x011c] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0135  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m34792a(java.lang.String r14) {
        /*
            r0 = 1
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 5
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x009b, all -> 0x0097 }
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.String r10 = "564c77"
            byte[] r11 = new byte[r2]     // Catch:{ Exception -> 0x009b, all -> 0x0097 }
            r12 = 55
            r11[r1] = r12     // Catch:{ Exception -> 0x009b, all -> 0x0097 }
            r12 = 60
            r11[r0] = r12     // Catch:{ Exception -> 0x009b, all -> 0x0097 }
            java.lang.Object r6 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r6, r7, r8, r10, r11)     // Catch:{ Exception -> 0x009b, all -> 0x0097 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x009b, all -> 0x0097 }
            java.lang.Process r5 = r5.exec(r6)     // Catch:{ Exception -> 0x009b, all -> 0x0097 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.io.OutputStream r7 = r5.getOutputStream()     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x009c, all -> 0x0095 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            java.io.InputStream r8 = r5.getInputStream()     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0091, all -> 0x008e }
            byte[] r14 = r14.getBytes()     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            r6.write(r14)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            r14 = 10
            r6.write(r14)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            r6.flush()     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            r6.close()     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            r5.waitFor()     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            java.lang.String r14 = m34791a((java.io.BufferedInputStream) r7)     // Catch:{ Exception -> 0x008c, all -> 0x0089 }
            if (r14 == 0) goto L_0x0058
            r14.length()     // Catch:{ Exception -> 0x0056, all -> 0x0089 }
            goto L_0x0058
        L_0x0056:
            r3 = r14
            goto L_0x008c
        L_0x0058:
            r6.close()     // Catch:{ IOException -> 0x005c }
            goto L_0x006f
        L_0x005c:
            byte[] r13 = new byte[r4]
            r13 = {33, 51, 66, 46, 8} // fill-array
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.String r12 = "582e22"
            java.lang.Object r0 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r8, r9, r10, r12, r13)
            java.lang.String r0 = (java.lang.String) r0
        L_0x006f:
            r7.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x00f8
        L_0x0074:
            byte[] r13 = new byte[r4]
            r13 = {33, 106, 65, 121, 95} // fill-array
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.String r12 = "5a12ee"
            java.lang.Object r0 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r8, r9, r10, r12, r13)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00f8
        L_0x0089:
            r14 = move-exception
            goto L_0x00fe
        L_0x008c:
            r14 = r3
            goto L_0x0093
        L_0x008e:
            r14 = move-exception
            goto L_0x00ff
        L_0x0091:
            r14 = r3
            r7 = r14
        L_0x0093:
            r3 = r6
            goto L_0x009e
        L_0x0095:
            r14 = move-exception
            goto L_0x0099
        L_0x0097:
            r14 = move-exception
            r5 = r3
        L_0x0099:
            r0 = r3
            goto L_0x0101
        L_0x009b:
            r5 = r3
        L_0x009c:
            r14 = r3
            r7 = r14
        L_0x009e:
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.String r12 = "8b78b1"
            byte[] r13 = new byte[r4]     // Catch:{ all -> 0x00fc }
            r6 = 44
            r13[r1] = r6     // Catch:{ all -> 0x00fc }
            r1 = 105(0x69, float:1.47E-43)
            r13[r0] = r1     // Catch:{ all -> 0x00fc }
            r0 = 71
            r13[r2] = r0     // Catch:{ all -> 0x00fc }
            r0 = 3
            r1 = 115(0x73, float:1.61E-43)
            r13[r0] = r1     // Catch:{ all -> 0x00fc }
            r0 = 4
            r1 = 88
            r13[r0] = r1     // Catch:{ all -> 0x00fc }
            java.lang.Object r0 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r8, r9, r10, r12, r13)     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00fc }
            if (r3 == 0) goto L_0x00dd
            r3.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00dd
        L_0x00ca:
            byte[] r13 = new byte[r4]
            r13 = {33, 61, 73, 41, 91} // fill-array
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.String r12 = "569ba3"
            java.lang.Object r0 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r8, r9, r10, r12, r13)
            java.lang.String r0 = (java.lang.String) r0
        L_0x00dd:
            if (r7 == 0) goto L_0x00f6
            r7.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00f6
        L_0x00e3:
            byte[] r13 = new byte[r4]
            r13 = {45, 58, 65, 115, 3} // fill-array
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.String r12 = "91189d"
            java.lang.Object r0 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r8, r9, r10, r12, r13)
            java.lang.String r0 = (java.lang.String) r0
        L_0x00f6:
            if (r5 == 0) goto L_0x00fb
        L_0x00f8:
            r5.destroy()
        L_0x00fb:
            return r14
        L_0x00fc:
            r14 = move-exception
            r6 = r3
        L_0x00fe:
            r3 = r7
        L_0x00ff:
            r0 = r3
            r3 = r6
        L_0x0101:
            if (r3 == 0) goto L_0x011a
            r3.close()     // Catch:{ IOException -> 0x0107 }
            goto L_0x011a
        L_0x0107:
            byte[] r11 = new byte[r4]
            r11 = {33, 61, 73, 122, 94} // fill-array
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.String r10 = "5691da"
            java.lang.Object r1 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r6, r7, r8, r10, r11)
            java.lang.String r1 = (java.lang.String) r1
        L_0x011a:
            if (r0 == 0) goto L_0x0133
            r0.close()     // Catch:{ IOException -> 0x0120 }
            goto L_0x0133
        L_0x0120:
            byte[] r11 = new byte[r4]
            r11 = {32, 105, 72, 127, 94} // fill-array
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.String r10 = "4b84d2"
            java.lang.Object r0 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r6, r7, r8, r10, r11)
            java.lang.String r0 = (java.lang.String) r0
        L_0x0133:
            if (r5 == 0) goto L_0x0138
            r5.destroy()
        L_0x0138:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p398ms.p399bd.p400o.Pgl.C12418v0.m34792a(java.lang.String):java.lang.String");
    }
}
