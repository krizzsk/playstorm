package p398ms.p399bd.p400o.Pgl;

import javax.net.ssl.SSLSocketFactory;

/* renamed from: ms.bd.o.Pgl.pblp */
public final class pblp extends pblo {

    /* renamed from: a */
    private SSLSocketFactory f29407a;

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x04f3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x04f3 A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v18 java.io.DataOutputStream) = (r2v19 java.io.DataOutputStream), (r2v27 java.io.DataOutputStream) binds: [B:93:0x0448, B:88:0x0431] A[DONT_GENERATE, DONT_INLINE], Splitter:B:88:0x0431] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x053c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x058a A[Catch:{ all -> 0x05c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0596 A[SYNTHETIC, Splitter:B:145:0x0596] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x05d0 A[SYNTHETIC, Splitter:B:156:0x05d0] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object[] m34740a(java.lang.String r36, byte[] r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, boolean r41) {
        /*
            r35 = this;
            r1 = r35
            r0 = r36
            r2 = r39
            r3 = r40
            ms.bd.o.Pgl.pblm$pgla r4 = new ms.bd.o.Pgl.pblm$pgla
            r4.<init>()
            r6 = 86
            r13 = 7
            r15 = 4
            r5 = 3
            r7 = 2
            r9 = 1
            r10 = 0
            r20 = -1
            java.net.URL r11 = new java.net.URL     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            java.net.URLConnection r11 = r11.openConnection()     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ Exception -> 0x0500, all -> 0x04fa }
            boolean r8 = r11 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r14 = 20
            r23 = 115(0x73, float:1.61E-43)
            if (r8 == 0) goto L_0x00ad
            javax.net.ssl.SSLSocketFactory r8 = r1.f29407a     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            if (r8 != 0) goto L_0x0097
            java.lang.Class<ms.bd.o.Pgl.pblp> r8 = p398ms.p399bd.p400o.Pgl.pblp.class
            monitor-enter(r8)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            javax.net.ssl.SSLSocketFactory r12 = r1.f29407a     // Catch:{ all -> 0x0093 }
            if (r12 != 0) goto L_0x008e
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0093 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            if (r12 < r14) goto L_0x0055
            java.lang.String r29 = "b53eff"
            byte[] r12 = new byte[r5]     // Catch:{ all -> 0x0093 }
            r30 = 71
            r12[r10] = r30     // Catch:{ all -> 0x0093 }
            r30 = 27
            r12[r9] = r30     // Catch:{ all -> 0x0093 }
            r12[r7] = r23     // Catch:{ all -> 0x0093 }
            r30 = r12
            java.lang.Object r12 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x0093 }
            goto L_0x007d
        L_0x0055:
            java.lang.String r29 = "b4f464"
            byte[] r12 = new byte[r13]     // Catch:{ all -> 0x0093 }
            r30 = 71
            r12[r10] = r30     // Catch:{ all -> 0x0093 }
            r30 = 26
            r12[r9] = r30     // Catch:{ all -> 0x0093 }
            r30 = 38
            r12[r7] = r30     // Catch:{ all -> 0x0093 }
            r12[r5] = r6     // Catch:{ all -> 0x0093 }
            r30 = 88
            r12[r15] = r30     // Catch:{ all -> 0x0093 }
            r30 = 109(0x6d, float:1.53E-43)
            r24 = 5
            r12[r24] = r30     // Catch:{ all -> 0x0093 }
            r30 = 51
            r22 = 6
            r12[r22] = r30     // Catch:{ all -> 0x0093 }
            r30 = r12
            java.lang.Object r12 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x0093 }
        L_0x007d:
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0093 }
            javax.net.ssl.SSLContext r12 = javax.net.ssl.SSLContext.getInstance(r12)     // Catch:{ all -> 0x0093 }
            r13 = 0
            r12.init(r13, r13, r13)     // Catch:{ all -> 0x0091 }
            javax.net.ssl.SSLSocketFactory r12 = r12.getSocketFactory()     // Catch:{ all -> 0x0091 }
            r1.f29407a = r12     // Catch:{ all -> 0x0091 }
            goto L_0x008f
        L_0x008e:
            r13 = 0
        L_0x008f:
            monitor-exit(r8)     // Catch:{ all -> 0x0091 }
            goto L_0x0098
        L_0x0091:
            r0 = move-exception
            goto L_0x0095
        L_0x0093:
            r0 = move-exception
            r13 = 0
        L_0x0095:
            monitor-exit(r8)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
        L_0x0097:
            r13 = 0
        L_0x0098:
            r8 = r11
            javax.net.ssl.HttpsURLConnection r8 = (javax.net.ssl.HttpsURLConnection) r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            if (r12 < r14) goto L_0x00a5
            javax.net.ssl.SSLSocketFactory r12 = r1.f29407a     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
        L_0x00a1:
            r8.setSSLSocketFactory(r12)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            goto L_0x00ad
        L_0x00a5:
            ms.bd.o.Pgl.pblr r12 = new ms.bd.o.Pgl.pblr     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            javax.net.ssl.SSLSocketFactory r13 = r1.f29407a     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12.<init>(r13)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            goto L_0x00a1
        L_0x00ad:
            r8 = 10000(0x2710, float:1.4013E-41)
            r11.setConnectTimeout(r8)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 5000(0x1388, float:7.006E-42)
            r11.setReadTimeout(r8)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "f15ada"
            r8 = 6
            byte[] r12 = new byte[r8]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12[r10] = r6     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 48
            r12[r9] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 69
            r12[r7] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 16
            r12[r5] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 75
            r12[r15] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 98
            r13 = 5
            r12[r13] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r12
            java.lang.Object r8 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "6897e1"
            byte[] r12 = new byte[r5]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 109(0x6d, float:1.53E-43)
            r12[r10] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 117(0x75, float:1.64E-43)
            r12[r9] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12[r7] = r10     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r12
            java.lang.Object r12 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r11.setRequestProperty(r8, r12)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "b651cb"
            r8 = 10
            byte[] r12 = new byte[r8]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 80
            r12[r10] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 59
            r12[r9] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 72
            r12[r7] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 75
            r12[r5] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 89
            r12[r15] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 118(0x76, float:1.65E-43)
            r24 = 5
            r12[r24] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 6
            r12[r8] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 30
            r25 = 7
            r12[r25] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 107(0x6b, float:1.5E-43)
            r19 = 8
            r12[r19] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 111(0x6f, float:1.56E-43)
            r18 = 9
            r12[r18] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r12
            java.lang.Object r8 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "eb40f8"
            r12 = 10
            byte[] r6 = new byte[r12]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 95
            r6[r10] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 101(0x65, float:1.42E-43)
            r6[r9] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 66
            r6[r7] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 84
            r6[r5] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r6[r15] = r14     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 14
            r17 = 5
            r6[r17] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 106(0x6a, float:1.49E-43)
            r22 = 6
            r6[r22] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 74
            r25 = 7
            r6[r25] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 8
            r6[r12] = r23     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 101(0x65, float:1.42E-43)
            r18 = 9
            r6[r18] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r6
            java.lang.Object r6 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r11.setRequestProperty(r8, r6)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "3fbfa9"
            r6 = 10
            byte[] r8 = new byte[r6]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r6 = 23
            r8[r10] = r6     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r6 = 119(0x77, float:1.67E-43)
            r8[r9] = r6     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8[r7] = r14     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8[r5] = r10     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r6 = 19
            r8[r15] = r6     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r6 = 15
            r12 = 5
            r8[r12] = r6     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 55
            r22 = 6
            r8[r22] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 66
            r25 = 7
            r8[r25] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 61
            r19 = 8
            r8[r19] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 34
            r18 = 9
            r8[r18] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r8
            java.lang.Object r8 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "3155c1"
            byte[] r12 = new byte[r6]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12[r10] = r10     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 42
            r12[r9] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r32 = 82
            r12[r7] = r32     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 68
            r12[r5] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 120(0x78, float:1.68E-43)
            r12[r15] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 39
            r24 = 5
            r12[r24] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 62
            r22 = 6
            r12[r22] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 19
            r25 = 7
            r12[r25] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 97
            r19 = 8
            r12[r19] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 40
            r18 = 9
            r12[r18] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r21 = 10
            r12[r21] = r6     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r33 = 11
            r12[r33] = r10     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r14 = 12
            r12[r14] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 13
            r34 = 101(0x65, float:1.42E-43)
            r12[r31] = r34     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r16 = 119(0x77, float:1.67E-43)
            r17 = 14
            r12[r17] = r16     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r12
            java.lang.Object r12 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r11.setRequestProperty(r8, r12)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "2a06bc"
            byte[] r8 = new byte[r14]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8[r10] = r10     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 108(0x6c, float:1.51E-43)
            r8[r9] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 77
            r8[r7] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 86
            r8[r5] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 88
            r8[r15] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 122(0x7a, float:1.71E-43)
            r24 = 5
            r8[r24] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 37
            r22 = 6
            r8[r22] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 13
            r25 = 7
            r8[r25] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 85
            r19 = 8
            r8[r19] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 127(0x7f, float:1.78E-43)
            r18 = 9
            r8[r18] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 51
            r21 = 10
            r8[r21] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 102(0x66, float:1.43E-43)
            r8[r33] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r8
            java.lang.Object r8 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "d64e8a"
            r12 = 24
            byte[] r12 = new byte[r12]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 116(0x74, float:1.63E-43)
            r12[r10] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 36
            r12[r9] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 87
            r12[r7] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = 29
            r12[r5] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r17 = 14
            r12[r15] = r17     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r24 = 5
            r12[r24] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 102(0x66, float:1.43E-43)
            r22 = 6
            r12[r22] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 7
            r12[r13] = r5     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 108(0x6c, float:1.51E-43)
            r19 = 8
            r12[r19] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 58
            r18 = 9
            r12[r18] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 123(0x7b, float:1.72E-43)
            r21 = 10
            r12[r21] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 123(0x7b, float:1.72E-43)
            r12[r33] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 72
            r12[r14] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 13
            r31 = 18
            r12[r13] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 19
            r17 = 14
            r12[r17] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12[r6] = r23     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 16
            r12[r13] = r23     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 17
            r31 = 90
            r12[r13] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 18
            r31 = 118(0x76, float:1.65E-43)
            r12[r13] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 19
            r31 = 33
            r12[r13] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 103(0x67, float:1.44E-43)
            r31 = 20
            r12[r31] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 21
            r31 = 49
            r12[r13] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 22
            r31 = 70
            r12[r13] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 23
            r31 = 28
            r12[r13] = r31     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r12
            java.lang.Object r12 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r11.setRequestProperty(r8, r12)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            if (r38 == 0) goto L_0x0398
            java.lang.String r8 = r38.trim()     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            int r8 = r8.length()     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            if (r8 <= 0) goto L_0x0398
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "bea2ce"
            r8 = 6
            byte[] r12 = new byte[r8]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 80
            r12[r10] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 104(0x68, float:1.46E-43)
            r12[r9] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 29
            r12[r7] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 77
            r12[r5] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 85
            r12[r15] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8 = 119(0x77, float:1.67E-43)
            r13 = 5
            r12[r13] = r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r12
            java.lang.Object r8 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "cc601b"
            byte[] r12 = new byte[r14]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 97
            r12[r10] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 100
            r12[r9] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 86
            r12[r7] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 87
            r12[r5] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 7
            r12[r15] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r25 = 122(0x7a, float:1.71E-43)
            r24 = 5
            r12[r24] = r25     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r25 = 110(0x6e, float:1.54E-43)
            r22 = 6
            r12[r22] = r25     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r25 = 75
            r12[r13] = r25     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 99
            r19 = 8
            r12[r19] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 61
            r18 = 9
            r12[r18] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 55
            r21 = 10
            r12[r21] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13 = 114(0x72, float:1.6E-43)
            r12[r33] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r12
            java.lang.Object r12 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.Object[] r13 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r13[r10] = r38     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r12 = java.lang.String.format(r12, r13)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r11.setRequestProperty(r8, r12)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
        L_0x0398:
            if (r2 == 0) goto L_0x03fc
            java.lang.String r8 = r39.trim()     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            int r8 = r8.length()     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            if (r8 <= 0) goto L_0x03fc
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "6b528c"
            r8 = 16
            byte[] r8 = new byte[r8]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 63
            r8[r10] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 45
            r8[r9] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8[r7] = r32     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8[r5] = r32     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 74
            r8[r15] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 102(0x66, float:1.43E-43)
            r13 = 5
            r8[r13] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 48
            r13 = 6
            r8[r13] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 7
            r8[r12] = r32     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 113(0x71, float:1.58E-43)
            r13 = 8
            r8[r13] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 103(0x67, float:1.44E-43)
            r13 = 9
            r8[r13] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 52
            r13 = 10
            r8[r13] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 116(0x74, float:1.63E-43)
            r8[r33] = r12     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8[r14] = r33     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 13
            r8[r12] = r32     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r12 = 14
            r13 = 6
            r8[r12] = r13     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r8[r6] = r23     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r8
            java.lang.Object r6 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r11.setRequestProperty(r6, r2)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
        L_0x03fc:
            r4.mo76455a(r0)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            if (r41 == 0) goto L_0x0438
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "d13332"
            byte[] r0 = new byte[r15]     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r2 = 69
            r0[r10] = r2     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r2 = 28
            r0[r9] = r2     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r0[r7] = r23     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r0[r5] = r23     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r31 = r0
            java.lang.Object r0 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r11.setRequestMethod(r0)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r11.setDoOutput(r9)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            java.io.OutputStream r0 = r11.getOutputStream()     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0501, all -> 0x04f8 }
            r0 = r37
            r2.write(r0)     // Catch:{ Exception -> 0x04f5, all -> 0x04f3 }
            r2.flush()     // Catch:{ Exception -> 0x04f5, all -> 0x04f3 }
            goto L_0x0439
        L_0x0438:
            r2 = 0
        L_0x0439:
            int r0 = r11.getResponseCode()     // Catch:{ Exception -> 0x04f5, all -> 0x04f3 }
            r26 = 16777217(0x1000001, float:2.350989E-38)
            r27 = 0
            r28 = 0
            java.lang.String r30 = "0a3e2c"
            r6 = 10
            byte[] r8 = new byte[r6]     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6 = 57
            r8[r10] = r6     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6 = 46
            r8[r9] = r6     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6 = 84
            r8[r7] = r6     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6 = 5
            r8[r5] = r6     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r12 = 64
            r8[r15] = r12     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r12 = 120(0x78, float:1.68E-43)
            r8[r6] = r12     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6 = 60
            r12 = 6
            r8[r12] = r6     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6 = 71
            r12 = 7
            r8[r12] = r6     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6 = 107(0x6b, float:1.5E-43)
            r12 = 8
            r8[r12] = r6     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6 = 49
            r12 = 9
            r8[r12] = r6     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r31 = r8
            java.lang.Object r6 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r26, r27, r28, r30, r31)     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            java.lang.String r6 = r11.getHeaderField(r6)     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r4.mo76457b(r6, r0)     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r0 != r6) goto L_0x04c3
            java.io.BufferedInputStream r6 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            java.io.InputStream r8 = r11.getInputStream()     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x04f0, all -> 0x04f3 }
            if (r3 == 0) goto L_0x049b
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0505 }
            r8.<init>(r3)     // Catch:{ Exception -> 0x0505 }
            goto L_0x04a0
        L_0x049b:
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0505 }
            r8.<init>()     // Catch:{ Exception -> 0x0505 }
        L_0x04a0:
            r3 = 256(0x100, float:3.59E-43)
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x0505 }
        L_0x04a4:
            int r12 = r6.read(r3)     // Catch:{ Exception -> 0x0505 }
            if (r12 <= 0) goto L_0x04ae
            r8.write(r3, r10, r12)     // Catch:{ Exception -> 0x0505 }
            goto L_0x04a4
        L_0x04ae:
            r8.flush()     // Catch:{ Exception -> 0x0505 }
            boolean r3 = r8 instanceof java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0505 }
            if (r3 == 0) goto L_0x04bd
            r3 = r8
            java.io.ByteArrayOutputStream r3 = (java.io.ByteArrayOutputStream) r3     // Catch:{ Exception -> 0x0505 }
            byte[] r3 = r3.toByteArray()     // Catch:{ Exception -> 0x0505 }
            goto L_0x04be
        L_0x04bd:
            r3 = 0
        L_0x04be:
            r8.close()     // Catch:{ Exception -> 0x0505 }
            r8 = r6
            goto L_0x04c5
        L_0x04c3:
            r3 = 0
            r8 = 0
        L_0x04c5:
            r1.mo76460a((java.io.InputStream) r8)
            r1.mo76461a((java.io.OutputStream) r2)
            r11.disconnect()     // Catch:{ Exception -> 0x04cf }
            goto L_0x04ed
        L_0x04cf:
            r2 = 7
            byte[] r2 = new byte[r2]
            r2 = {58, 59, 22, 122, 5, 52, 105} // fill-array
            r4 = 16777217(0x1000001, float:2.350989E-38)
            r5 = 0
            r11 = 0
            java.lang.String r6 = "81f122"
            r36 = r4
            r37 = r5
            r38 = r11
            r40 = r6
            r41 = r2
            java.lang.Object r2 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r36, r37, r38, r40, r41)
            java.lang.String r2 = (java.lang.String) r2
        L_0x04ed:
            r8 = r3
            goto L_0x05b9
        L_0x04f0:
            r20 = r0
            goto L_0x04f5
        L_0x04f3:
            r0 = move-exception
            goto L_0x04fd
        L_0x04f5:
            r0 = r20
            goto L_0x0504
        L_0x04f8:
            r0 = move-exception
            goto L_0x04fc
        L_0x04fa:
            r0 = move-exception
            r11 = 0
        L_0x04fc:
            r2 = 0
        L_0x04fd:
            r8 = 0
            goto L_0x05c8
        L_0x0500:
            r11 = 0
        L_0x0501:
            r0 = r20
            r2 = 0
        L_0x0504:
            r6 = 0
        L_0x0505:
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r8 = 0
            java.lang.String r14 = "cfed9d"
            r12 = 6
            byte[] r13 = new byte[r12]     // Catch:{ all -> 0x05c4 }
            r12 = 97
            r13[r10] = r12     // Catch:{ all -> 0x05c4 }
            r12 = 108(0x6c, float:1.51E-43)
            r13[r9] = r12     // Catch:{ all -> 0x05c4 }
            r12 = 21
            r13[r7] = r12     // Catch:{ all -> 0x05c4 }
            r12 = 47
            r13[r5] = r12     // Catch:{ all -> 0x05c4 }
            r12 = 14
            r13[r15] = r12     // Catch:{ all -> 0x05c4 }
            r12 = 98
            r17 = 5
            r13[r17] = r12     // Catch:{ all -> 0x05c4 }
            r36 = r3
            r37 = r8
            r26 = 0
            r38 = r26
            r40 = r14
            r41 = r13
            java.lang.Object r3 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r36, r37, r38, r40, r41)     // Catch:{ all -> 0x05c4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x05c4 }
            if (r11 == 0) goto L_0x058a
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r8 = 0
            java.lang.String r14 = "781d0b"
            r12 = 10
            byte[] r12 = new byte[r12]     // Catch:{ all -> 0x05c4 }
            r13 = 62
            r12[r10] = r13     // Catch:{ all -> 0x05c4 }
            r13 = 119(0x77, float:1.67E-43)
            r12[r9] = r13     // Catch:{ all -> 0x05c4 }
            r13 = 86
            r12[r7] = r13     // Catch:{ all -> 0x05c4 }
            r12[r5] = r15     // Catch:{ all -> 0x05c4 }
            r5 = 66
            r12[r15] = r5     // Catch:{ all -> 0x05c4 }
            r5 = 121(0x79, float:1.7E-43)
            r13 = 5
            r12[r13] = r5     // Catch:{ all -> 0x05c4 }
            r5 = 59
            r13 = 6
            r12[r13] = r5     // Catch:{ all -> 0x05c4 }
            r5 = 30
            r13 = 7
            r12[r13] = r5     // Catch:{ all -> 0x05c4 }
            r5 = 105(0x69, float:1.47E-43)
            r13 = 8
            r12[r13] = r5     // Catch:{ all -> 0x05c4 }
            r5 = 48
            r13 = 9
            r12[r13] = r5     // Catch:{ all -> 0x05c4 }
            r36 = r3
            r37 = r8
            r15 = 0
            r38 = r15
            r40 = r14
            r41 = r12
            java.lang.Object r3 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r36, r37, r38, r40, r41)     // Catch:{ all -> 0x05c4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x05c4 }
            java.lang.String r3 = r11.getHeaderField(r3)     // Catch:{ all -> 0x05c4 }
            goto L_0x058b
        L_0x058a:
            r3 = 0
        L_0x058b:
            r4.mo76456a(r3, r0)     // Catch:{ all -> 0x05c4 }
            r1.mo76460a((java.io.InputStream) r6)
            r1.mo76461a((java.io.OutputStream) r2)
            if (r11 == 0) goto L_0x05b8
            r11.disconnect()     // Catch:{ Exception -> 0x059a }
            goto L_0x05b8
        L_0x059a:
            r2 = 7
            byte[] r2 = new byte[r2]
            r2 = {97, 56, 66, 121, 85, 48, 50} // fill-array
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r8 = "c222b6"
            r36 = r3
            r37 = r4
            r38 = r5
            r40 = r8
            r41 = r2
            java.lang.Object r2 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r36, r37, r38, r40, r41)
            java.lang.String r2 = (java.lang.String) r2
        L_0x05b8:
            r8 = 0
        L_0x05b9:
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r10] = r0
            r2[r9] = r8
            return r2
        L_0x05c4:
            r0 = move-exception
            r8 = r2
            r2 = r8
            r8 = r6
        L_0x05c8:
            r1.mo76460a((java.io.InputStream) r8)
            r1.mo76461a((java.io.OutputStream) r2)
            if (r11 == 0) goto L_0x05f2
            r11.disconnect()     // Catch:{ Exception -> 0x05d4 }
            goto L_0x05f2
        L_0x05d4:
            r2 = 7
            byte[] r2 = new byte[r2]
            r2 = {96, 107, 19, 45, 83, 63, 51} // fill-array
            r3 = 16777217(0x1000001, float:2.350989E-38)
            r4 = 0
            r5 = 0
            java.lang.String r7 = "bacfd9"
            r36 = r3
            r37 = r4
            r38 = r5
            r40 = r7
            r41 = r2
            java.lang.Object r2 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r36, r37, r38, r40, r41)
            java.lang.String r2 = (java.lang.String) r2
        L_0x05f2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p398ms.p399bd.p400o.Pgl.pblp.m34740a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.Object[]");
    }

    /* renamed from: a */
    public Object[] mo76447a(String str, String str2, String str3) {
        return m34740a(str, (byte[]) null, (String) null, str3, str2, false);
    }

    /* renamed from: a */
    public Object[] mo76448a(String str, byte[] bArr, String str2, String str3) {
        return m34740a(str, bArr, str2, str3, (String) null, true);
    }

    /* renamed from: b */
    public Object[] mo76449b(String str, String str2, String str3) {
        return m34740a(str, (byte[]) null, str2, str3, (String) null, false);
    }
}
