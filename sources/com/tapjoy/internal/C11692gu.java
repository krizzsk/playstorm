package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.gu */
public final class C11692gu {

    /* renamed from: a */
    public long f28437a;

    /* renamed from: b */
    public long f28438b;

    /* renamed from: c */
    public long f28439c;

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo72582a(java.lang.String r20, int r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = 0
            r2 = 0
            java.net.DatagramSocket r3 = new java.net.DatagramSocket     // Catch:{ Exception -> 0x00f9, all -> 0x00f1 }
            r3.<init>()     // Catch:{ Exception -> 0x00f9, all -> 0x00f1 }
            r2 = r21
            r3.setSoTimeout(r2)     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            java.net.InetAddress r2 = java.net.InetAddress.getByName(r20)     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            r4 = 48
            byte[] r5 = new byte[r4]     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            java.net.DatagramPacket r6 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            r7 = 123(0x7b, float:1.72E-43)
            r6.<init>(r5, r4, r2, r7)     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            r2 = 27
            r5[r0] = r2     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r13 = r7 / r11
            long r15 = r13 * r11
            long r15 = r7 - r15
            r17 = 2208988800(0x83aa7e80, double:1.091385478E-314)
            long r13 = r13 + r17
            r2 = 24
            long r11 = r13 >> r2
            int r11 = (int) r11     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            byte r11 = (byte) r11     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            r12 = 40
            r5[r12] = r11     // Catch:{ Exception -> 0x00ed, all -> 0x00e8 }
            r11 = 41
            r17 = 16
            r18 = r3
            long r2 = r13 >> r17
            int r2 = (int) r2
            byte r2 = (byte) r2
            r5[r11] = r2     // Catch:{ Exception -> 0x00e4, all -> 0x00df }
            r2 = 42
            r3 = 8
            long r0 = r13 >> r3
            int r0 = (int) r0
            byte r0 = (byte) r0
            r5[r2] = r0     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r0 = 43
            r1 = 0
            long r13 = r13 >> r1
            int r1 = (int) r13     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r5[r0] = r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r15 = r15 * r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r15 = r15 / r0
            r0 = 44
            r1 = 24
            long r13 = r15 >> r1
            int r1 = (int) r13     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r5[r0] = r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r0 = 45
            long r1 = r15 >> r17
            int r1 = (int) r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r5[r0] = r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r0 = 46
            long r1 = r15 >> r3
            int r1 = (int) r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r5[r0] = r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r0 = 47
            double r1 = java.lang.Math.random()     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r13 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r1 = r1 * r13
            int r1 = (int) r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            byte r1 = (byte) r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r5[r0] = r1     // Catch:{ Exception -> 0x00dc, all -> 0x00d8 }
            r1 = r18
            r1.send(r6)     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            java.net.DatagramPacket r0 = new java.net.DatagramPacket     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            r0.<init>(r5, r4)     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            r1.receive(r0)     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            long r9 = r2 - r9
            long r7 = r7 + r9
            r0 = 24
            long r13 = m33933b(r5, r0)     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            r0 = 32
            long r15 = m33933b(r5, r0)     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            long r4 = m33933b(r5, r12)     // Catch:{ Exception -> 0x00d5, all -> 0x00d1 }
            long r17 = r4 - r15
            long r9 = r9 - r17
            long r15 = r15 - r13
            long r4 = r4 - r7
            long r15 = r15 + r4
            r4 = 2
            long r15 = r15 / r4
            long r7 = r7 + r15
            r4 = r19
            r4.f28437a = r7     // Catch:{ Exception -> 0x00ef, all -> 0x00cf }
            r4.f28438b = r2     // Catch:{ Exception -> 0x00ef, all -> 0x00cf }
            r4.f28439c = r9     // Catch:{ Exception -> 0x00ef, all -> 0x00cf }
            r1.close()
            r0 = 1
            return r0
        L_0x00cf:
            r0 = move-exception
            goto L_0x00eb
        L_0x00d1:
            r0 = move-exception
            r4 = r19
            goto L_0x00eb
        L_0x00d5:
            r4 = r19
            goto L_0x00ef
        L_0x00d8:
            r0 = move-exception
            r4 = r19
            goto L_0x00e1
        L_0x00dc:
            r4 = r19
            goto L_0x00e5
        L_0x00df:
            r0 = move-exception
            r4 = r1
        L_0x00e1:
            r1 = r18
            goto L_0x00eb
        L_0x00e4:
            r4 = r1
        L_0x00e5:
            r1 = r18
            goto L_0x00ef
        L_0x00e8:
            r0 = move-exception
            r4 = r1
            r1 = r3
        L_0x00eb:
            r2 = r1
            goto L_0x00f3
        L_0x00ed:
            r4 = r1
            r1 = r3
        L_0x00ef:
            r2 = r1
            goto L_0x00fa
        L_0x00f1:
            r0 = move-exception
            r4 = r1
        L_0x00f3:
            if (r2 == 0) goto L_0x00f8
            r2.close()
        L_0x00f8:
            throw r0
        L_0x00f9:
            r4 = r1
        L_0x00fa:
            if (r2 == 0) goto L_0x00ff
            r2.close()
        L_0x00ff:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11692gu.mo72582a(java.lang.String, int):boolean");
    }

    /* renamed from: a */
    private static long m33932a(byte[] bArr, int i) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        byte b5 = b & true;
        int i2 = b;
        if (b5 == true) {
            i2 = (b & Byte.MAX_VALUE) + 128;
        }
        byte b6 = b2 & true;
        int i3 = b2;
        if (b6 == true) {
            i3 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i4 = b3;
        if (b7 == true) {
            i4 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i5 = b4;
        if (b8 == true) {
            i5 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    /* renamed from: b */
    private static long m33933b(byte[] bArr, int i) {
        return ((m33932a(bArr, i) - 2208988800L) * 1000) + ((m33932a(bArr, i + 4) * 1000) / 4294967296L);
    }
}
