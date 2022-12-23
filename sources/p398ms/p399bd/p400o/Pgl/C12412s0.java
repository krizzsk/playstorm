package p398ms.p399bd.p400o.Pgl;

import com.google.common.base.Ascii;

/* renamed from: ms.bd.o.Pgl.s0 */
public class C12412s0 {

    /* renamed from: a */
    private static final String f29430a = ((String) pblk.m34714a(16777217, 0, 0, "34ae67", new byte[]{54, 34, 45, Ascii.f17947US, 8, 110, 51, Ascii.f17944SI, 60}));

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c0 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9 A[SYNTHETIC, Splitter:B:40:0x00b9] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m34780a(android.content.Context r14) {
        /*
            r0 = 3
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 255(0xff, float:3.57E-43)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            r6.<init>()     // Catch:{ all -> 0x0095 }
            java.io.File r7 = r14.getFilesDir()     // Catch:{ all -> 0x0095 }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x0095 }
            r6.append(r7)     // Catch:{ all -> 0x0095 }
            r8 = 16777217(0x1000001, float:2.350989E-38)
            r9 = 0
            r10 = 0
            java.lang.String r12 = "1a0248"
            byte[] r13 = new byte[r2]     // Catch:{ all -> 0x0095 }
            r7 = 111(0x6f, float:1.56E-43)
            r13[r4] = r7     // Catch:{ all -> 0x0095 }
            java.lang.Object r7 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r8, r9, r10, r12, r13)     // Catch:{ all -> 0x0095 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0095 }
            r6.append(r7)     // Catch:{ all -> 0x0095 }
            java.lang.String r7 = f29430a     // Catch:{ all -> 0x0095 }
            r6.append(r7)     // Catch:{ all -> 0x0095 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0095 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0095 }
            r7.<init>(r6)     // Catch:{ all -> 0x0095 }
            boolean r8 = r7.exists()     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0049
            r7.delete()     // Catch:{ all -> 0x0047 }
            r5 = r1
            goto L_0x0049
        L_0x0047:
            r5 = r1
            goto L_0x0095
        L_0x0049:
            android.content.res.Resources r14 = r14.getResources()     // Catch:{ all -> 0x0095 }
            android.content.res.AssetManager r14 = r14.getAssets()     // Catch:{ all -> 0x0095 }
            java.lang.String r7 = f29430a     // Catch:{ all -> 0x0095 }
            java.io.InputStream r14 = r14.open(r7)     // Catch:{ all -> 0x0095 }
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0096 }
            r7.<init>()     // Catch:{ all -> 0x0096 }
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r8 = new byte[r3]     // Catch:{ all -> 0x0093 }
        L_0x0060:
            int r9 = r14.read(r8, r4, r3)     // Catch:{ all -> 0x0093 }
            r10 = -1
            if (r9 == r10) goto L_0x006b
            r7.write(r8, r4, r9)     // Catch:{ all -> 0x0093 }
            goto L_0x0060
        L_0x006b:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0093 }
            r3.<init>(r6)     // Catch:{ all -> 0x0093 }
            byte[] r8 = r7.toByteArray()     // Catch:{ all -> 0x0093 }
            r3.write(r8)     // Catch:{ all -> 0x0093 }
            r3.close()     // Catch:{ all -> 0x0093 }
            int r3 = r7.size()     // Catch:{ all -> 0x0093 }
            if (r3 > 0) goto L_0x0081
            goto L_0x008f
        L_0x0081:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0093 }
            r3.<init>(r6)     // Catch:{ all -> 0x0093 }
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x008e
            r0 = r4
            goto L_0x008f
        L_0x008e:
            r0 = r5
        L_0x008f:
            r14.close()     // Catch:{ all -> 0x00c0 }
            goto L_0x00c0
        L_0x0093:
            r3 = r7
            goto L_0x0096
        L_0x0095:
            r14 = r3
        L_0x0096:
            r6 = 16777217(0x1000001, float:2.350989E-38)
            r7 = 0
            r8 = 0
            java.lang.String r10 = "9e0a0a"
            r11 = 4
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x00c5 }
            r12 = 41
            r11[r4] = r12     // Catch:{ all -> 0x00c5 }
            r4 = 100
            r11[r2] = r4     // Catch:{ all -> 0x00c5 }
            r2 = 124(0x7c, float:1.74E-43)
            r11[r1] = r2     // Catch:{ all -> 0x00c5 }
            r1 = 18
            r11[r0] = r1     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r6, r7, r8, r10, r11)     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00c5 }
            if (r14 == 0) goto L_0x00bc
            r14.close()     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            if (r3 == 0) goto L_0x00c4
            r7 = r3
            r0 = r5
        L_0x00c0:
            r7.close()     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r5 = r0
        L_0x00c4:
            return r5
        L_0x00c5:
            r0 = move-exception
            if (r14 == 0) goto L_0x00cb
            r14.close()     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            if (r3 == 0) goto L_0x00d0
            r3.close()     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p398ms.p399bd.p400o.Pgl.C12412s0.m34780a(android.content.Context):int");
    }
}
