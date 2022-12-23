package p398ms.p399bd.p400o.Pgl;

import com.bytedance.retrofit2.client.Header;
import com.google.common.base.Ascii;
import java.util.List;

/* renamed from: ms.bd.o.Pgl.pbla */
public final class pbla extends pblo {
    /* renamed from: a */
    private String m34691a(List<Header> list) {
        if (list != null && list.size() > 0) {
            for (Header next : list) {
                if (next != null && ((String) pblk.m34714a(16777217, 0, 0, "95a3b9", new byte[]{48, 122, 6, 83, Ascii.DLE, 34, 53, 19, 57, 103})).equalsIgnoreCase(next.getName())) {
                    return next.getValue();
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0411 A[Catch:{ all -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x041a A[Catch:{ all -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0426 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object[] m34692a(java.lang.String r36, byte[] r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, boolean r41) {
        /*
            r35 = this;
            r1 = r35
            r0 = r36
            r2 = r39
            r3 = r40
            ms.bd.o.Pgl.pblm$pgla r4 = new ms.bd.o.Pgl.pblm$pgla
            r4.<init>()
            r6 = 49
            r9 = 5
            r10 = 4
            r11 = 1
            r12 = 2
            r13 = 6
            r14 = 3
            r15 = 0
            r16 = -1
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x03d4 }
            r8.<init>()     // Catch:{ all -> 0x03d4 }
            com.bytedance.retrofit2.client.Header r5 = new com.bytedance.retrofit2.client.Header     // Catch:{ all -> 0x03d4 }
            r18 = 16777217(0x1000001, float:2.350989E-38)
            r19 = 0
            r20 = 0
            java.lang.String r22 = "d29e0b"
            byte[] r7 = new byte[r13]     // Catch:{ all -> 0x03d4 }
            r23 = 86
            r7[r15] = r23     // Catch:{ all -> 0x03d4 }
            r23 = 63
            r7[r11] = r23     // Catch:{ all -> 0x03d4 }
            r23 = 69
            r7[r12] = r23     // Catch:{ all -> 0x03d4 }
            r23 = 26
            r7[r14] = r23     // Catch:{ all -> 0x03d4 }
            r7[r10] = r13     // Catch:{ all -> 0x03d4 }
            r23 = 112(0x70, float:1.57E-43)
            r7[r9] = r23     // Catch:{ all -> 0x03d4 }
            r23 = r7
            java.lang.Object r7 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r18, r19, r20, r22, r23)     // Catch:{ all -> 0x03d4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03d4 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x03d4 }
            r13.<init>()     // Catch:{ all -> 0x03d4 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            java.lang.String r29 = "262d47"
            r9 = 10
            byte[] r10 = new byte[r9]     // Catch:{ all -> 0x03d4 }
            r21 = 48
            r10[r15] = r21     // Catch:{ all -> 0x03d4 }
            r10[r11] = r6     // Catch:{ all -> 0x03d4 }
            r21 = 82
            r10[r12] = r21     // Catch:{ all -> 0x03d4 }
            r10[r14] = r14     // Catch:{ all -> 0x03d4 }
            r20 = 4
            r10[r20] = r12     // Catch:{ all -> 0x03d4 }
            r21 = 47
            r19 = 5
            r10[r19] = r21     // Catch:{ all -> 0x03d4 }
            r21 = 63
            r18 = 6
            r10[r18] = r21     // Catch:{ all -> 0x03d4 }
            r21 = 30
            r22 = 7
            r10[r22] = r21     // Catch:{ all -> 0x03d4 }
            r21 = 103(0x67, float:1.44E-43)
            r23 = 8
            r10[r23] = r21     // Catch:{ all -> 0x03d4 }
            r30 = 105(0x69, float:1.47E-43)
            r31 = 9
            r10[r31] = r30     // Catch:{ all -> 0x03d4 }
            r30 = r10
            java.lang.Object r10 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x03d4 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x03d4 }
            r13.append(r10)     // Catch:{ all -> 0x03d4 }
            r10 = r38
            r13.append(r10)     // Catch:{ all -> 0x03d4 }
            java.lang.String r10 = r13.toString()     // Catch:{ all -> 0x03d4 }
            r5.<init>(r7, r10)     // Catch:{ all -> 0x03d4 }
            r8.add(r5)     // Catch:{ all -> 0x03d4 }
            com.bytedance.retrofit2.client.Header r5 = new com.bytedance.retrofit2.client.Header     // Catch:{ all -> 0x03d4 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            java.lang.String r29 = "810288"
            r7 = 6
            byte[] r10 = new byte[r7]     // Catch:{ all -> 0x03d4 }
            r10[r15] = r23     // Catch:{ all -> 0x03d4 }
            r7 = 48
            r10[r11] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 64
            r10[r12] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 67
            r10[r14] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 23
            r13 = 4
            r10[r13] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 59
            r13 = 5
            r10[r13] = r7     // Catch:{ all -> 0x03d4 }
            r30 = r10
            java.lang.Object r7 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x03d4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03d4 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            java.lang.String r29 = "a1f748"
            byte[] r10 = new byte[r14]     // Catch:{ all -> 0x03d4 }
            r13 = 58
            r10[r15] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 124(0x7c, float:1.74E-43)
            r10[r11] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 95
            r10[r12] = r13     // Catch:{ all -> 0x03d4 }
            r30 = r10
            java.lang.Object r10 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x03d4 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x03d4 }
            r5.<init>(r7, r10)     // Catch:{ all -> 0x03d4 }
            r8.add(r5)     // Catch:{ all -> 0x03d4 }
            com.bytedance.retrofit2.client.Header r5 = new com.bytedance.retrofit2.client.Header     // Catch:{ all -> 0x03d4 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            java.lang.String r29 = "5c829a"
            byte[] r7 = new byte[r9]     // Catch:{ all -> 0x03d4 }
            r10 = 17
            r7[r15] = r10     // Catch:{ all -> 0x03d4 }
            r13 = 114(0x72, float:1.6E-43)
            r7[r11] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 78
            r7[r12] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 84
            r7[r14] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 75
            r20 = 4
            r7[r20] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 87
            r19 = 5
            r7[r19] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 6
            r7[r13] = r6     // Catch:{ all -> 0x03d4 }
            r13 = 71
            r7[r22] = r13     // Catch:{ all -> 0x03d4 }
            r7[r23] = r21     // Catch:{ all -> 0x03d4 }
            r13 = 118(0x76, float:1.65E-43)
            r7[r31] = r13     // Catch:{ all -> 0x03d4 }
            r30 = r7
            java.lang.Object r7 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x03d4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03d4 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            java.lang.String r29 = "5923e1"
            r13 = 15
            byte[] r6 = new byte[r13]     // Catch:{ all -> 0x03d4 }
            r13 = 6
            r6[r15] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 34
            r6[r11] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 85
            r6[r12] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 66
            r6[r14] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 126(0x7e, float:1.77E-43)
            r20 = 4
            r6[r20] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 39
            r19 = 5
            r6[r19] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 56
            r18 = 6
            r6[r18] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 27
            r6[r22] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 102(0x66, float:1.43E-43)
            r6[r23] = r13     // Catch:{ all -> 0x03d4 }
            r13 = 46
            r6[r31] = r13     // Catch:{ all -> 0x03d4 }
            r6[r9] = r31     // Catch:{ all -> 0x03d4 }
            r13 = 11
            r6[r13] = r23     // Catch:{ all -> 0x03d4 }
            r30 = 114(0x72, float:1.6E-43)
            r10 = 12
            r6[r10] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 99
            r32 = 13
            r6[r32] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 113(0x71, float:1.58E-43)
            r33 = 14
            r6[r33] = r30     // Catch:{ all -> 0x03d4 }
            r30 = r6
            java.lang.Object r6 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x03d4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x03d4 }
            r5.<init>(r7, r6)     // Catch:{ all -> 0x03d4 }
            r8.add(r5)     // Catch:{ all -> 0x03d4 }
            com.bytedance.retrofit2.client.Header r5 = new com.bytedance.retrofit2.client.Header     // Catch:{ all -> 0x03d4 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            java.lang.String r29 = "6f4769"
            byte[] r6 = new byte[r10]     // Catch:{ all -> 0x03d4 }
            r7 = 4
            r6[r15] = r7     // Catch:{ all -> 0x03d4 }
            r20 = 107(0x6b, float:1.5E-43)
            r6[r11] = r20     // Catch:{ all -> 0x03d4 }
            r20 = 73
            r6[r12] = r20     // Catch:{ all -> 0x03d4 }
            r20 = 87
            r6[r14] = r20     // Catch:{ all -> 0x03d4 }
            r6[r7] = r10     // Catch:{ all -> 0x03d4 }
            r7 = 32
            r19 = 5
            r6[r19] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 33
            r18 = 6
            r6[r18] = r7     // Catch:{ all -> 0x03d4 }
            r6[r22] = r9     // Catch:{ all -> 0x03d4 }
            r30 = 81
            r6[r23] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 126(0x7e, float:1.77E-43)
            r6[r31] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 55
            r6[r9] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 97
            r6[r13] = r30     // Catch:{ all -> 0x03d4 }
            r30 = r6
            java.lang.Object r6 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x03d4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x03d4 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            java.lang.String r29 = "015d33"
            r7 = 24
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x03d4 }
            r30 = 32
            r7[r15] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 35
            r7[r11] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 86
            r7[r12] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 28
            r7[r14] = r30     // Catch:{ all -> 0x03d4 }
            r19 = 5
            r20 = 4
            r7[r20] = r19     // Catch:{ all -> 0x03d4 }
            r30 = 39
            r7[r19] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 50
            r18 = 6
            r7[r18] = r30     // Catch:{ all -> 0x03d4 }
            r7[r22] = r20     // Catch:{ all -> 0x03d4 }
            r30 = 109(0x6d, float:1.53E-43)
            r7[r23] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 59
            r7[r31] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 47
            r7[r9] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 124(0x7c, float:1.74E-43)
            r7[r13] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 73
            r7[r10] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 19
            r7[r32] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 24
            r7[r33] = r30     // Catch:{ all -> 0x03d4 }
            r24 = 33
            r30 = 15
            r7[r30] = r24     // Catch:{ all -> 0x03d4 }
            r30 = 16
            r34 = 39
            r7[r30] = r34     // Catch:{ all -> 0x03d4 }
            r30 = 93
            r34 = 17
            r7[r34] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 18
            r34 = 119(0x77, float:1.67E-43)
            r7[r30] = r34     // Catch:{ all -> 0x03d4 }
            r30 = 19
            r34 = 32
            r7[r30] = r34     // Catch:{ all -> 0x03d4 }
            r30 = 20
            r34 = 51
            r7[r30] = r34     // Catch:{ all -> 0x03d4 }
            r30 = 54
            r17 = 21
            r7[r17] = r30     // Catch:{ all -> 0x03d4 }
            r30 = 22
            r34 = 71
            r7[r30] = r34     // Catch:{ all -> 0x03d4 }
            r30 = 23
            r34 = 29
            r7[r30] = r34     // Catch:{ all -> 0x03d4 }
            r30 = r7
            java.lang.Object r7 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x03d4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03d4 }
            r5.<init>(r6, r7)     // Catch:{ all -> 0x03d4 }
            r8.add(r5)     // Catch:{ all -> 0x03d4 }
            if (r2 == 0) goto L_0x02cd
            java.lang.String r5 = r39.trim()     // Catch:{ all -> 0x03d4 }
            int r5 = r5.length()     // Catch:{ all -> 0x03d4 }
            if (r5 <= 0) goto L_0x02cd
            com.bytedance.retrofit2.client.Header r5 = new com.bytedance.retrofit2.client.Header     // Catch:{ all -> 0x03d4 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            java.lang.String r29 = "ed2c94"
            r6 = 16
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x03d4 }
            r7 = 108(0x6c, float:1.51E-43)
            r6[r15] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 43
            r6[r11] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 85
            r6[r12] = r7     // Catch:{ all -> 0x03d4 }
            r6[r14] = r14     // Catch:{ all -> 0x03d4 }
            r7 = 75
            r20 = 4
            r6[r20] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 49
            r19 = 5
            r6[r19] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 99
            r18 = 6
            r6[r18] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 84
            r6[r22] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 118(0x76, float:1.65E-43)
            r6[r23] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 54
            r6[r31] = r7     // Catch:{ all -> 0x03d4 }
            r6[r9] = r21     // Catch:{ all -> 0x03d4 }
            r7 = 114(0x72, float:1.6E-43)
            r6[r13] = r7     // Catch:{ all -> 0x03d4 }
            r6[r10] = r10     // Catch:{ all -> 0x03d4 }
            r6[r32] = r14     // Catch:{ all -> 0x03d4 }
            r6[r33] = r22     // Catch:{ all -> 0x03d4 }
            r7 = 36
            r21 = 15
            r6[r21] = r7     // Catch:{ all -> 0x03d4 }
            r30 = r6
            java.lang.Object r6 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x03d4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x03d4 }
            r5.<init>(r6, r2)     // Catch:{ all -> 0x03d4 }
            r8.add(r5)     // Catch:{ all -> 0x03d4 }
        L_0x02cd:
            com.bytedance.retrofit2.Retrofit r2 = com.bytedance.ttnet.utils.RetrofitUtils.getSsRetrofit(r36)     // Catch:{ all -> 0x03d4 }
            java.lang.Class<ms.bd.o.Pgl.a> r5 = p398ms.p399bd.p400o.Pgl.C12375a.class
            java.lang.Object r2 = r2.create(r5)     // Catch:{ all -> 0x03d4 }
            ms.bd.o.Pgl.a r2 = (p398ms.p399bd.p400o.Pgl.C12375a) r2     // Catch:{ all -> 0x03d4 }
            if (r41 == 0) goto L_0x0370
            com.bytedance.retrofit2.mime.TypedByteArray r5 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ all -> 0x03d4 }
            r25 = 16777217(0x1000001, float:2.350989E-38)
            r26 = 0
            r27 = 0
            java.lang.String r29 = "13c0da"
            r6 = 24
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x03d4 }
            r7 = 33
            r6[r15] = r7     // Catch:{ all -> 0x03d4 }
            r6[r11] = r7     // Catch:{ all -> 0x03d4 }
            r6[r12] = r15     // Catch:{ all -> 0x03d4 }
            r7 = 72
            r6[r14] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 82
            r20 = 4
            r6[r20] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 117(0x75, float:1.64E-43)
            r19 = 5
            r6[r19] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 51
            r18 = 6
            r6[r18] = r7     // Catch:{ all -> 0x03d4 }
            r6[r22] = r18     // Catch:{ all -> 0x03d4 }
            r7 = 59
            r6[r23] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 111(0x6f, float:1.56E-43)
            r6[r31] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 46
            r6[r9] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 126(0x7e, float:1.77E-43)
            r6[r13] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 31
            r6[r10] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 71
            r6[r32] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 79
            r6[r33] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 115(0x73, float:1.61E-43)
            r9 = 15
            r6[r9] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 16
            r9 = 38
            r6[r7] = r9     // Catch:{ all -> 0x03d4 }
            r7 = 95
            r9 = 17
            r6[r9] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 18
            r9 = 33
            r6[r7] = r9     // Catch:{ all -> 0x03d4 }
            r7 = 19
            r9 = 116(0x74, float:1.63E-43)
            r6[r7] = r9     // Catch:{ all -> 0x03d4 }
            r7 = 20
            r9 = 50
            r6[r7] = r9     // Catch:{ all -> 0x03d4 }
            r7 = 52
            r9 = 21
            r6[r9] = r7     // Catch:{ all -> 0x03d4 }
            r7 = 22
            r9 = 17
            r6[r7] = r9     // Catch:{ all -> 0x03d4 }
            r7 = 23
            r9 = 73
            r6[r7] = r9     // Catch:{ all -> 0x03d4 }
            r30 = r6
            java.lang.Object r6 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r25, r26, r27, r29, r30)     // Catch:{ all -> 0x03d4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x03d4 }
            java.lang.String[] r7 = new java.lang.String[r15]     // Catch:{ all -> 0x03d4 }
            r9 = r37
            r5.<init>(r6, r9, r7)     // Catch:{ all -> 0x03d4 }
            com.bytedance.retrofit2.Call r2 = r2.mo76427a(r0, r8, r5)     // Catch:{ all -> 0x03d4 }
            goto L_0x0374
        L_0x0370:
            com.bytedance.retrofit2.Call r2 = r2.mo76426a(r0, r8)     // Catch:{ all -> 0x03d4 }
        L_0x0374:
            r4.mo76455a(r0)     // Catch:{ all -> 0x03d0 }
            com.bytedance.retrofit2.SsResponse r0 = r2.execute()     // Catch:{ all -> 0x03d0 }
            int r5 = r0.code()     // Catch:{ all -> 0x03d1 }
            java.util.List r6 = r0.headers()     // Catch:{ all -> 0x03cd }
            java.lang.String r6 = r1.m34691a(r6)     // Catch:{ all -> 0x03cd }
            r4.mo76457b(r6, r5)     // Catch:{ all -> 0x03cd }
            if (r3 == 0) goto L_0x0392
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x03cd }
            r6.<init>(r3)     // Catch:{ all -> 0x03cd }
            goto L_0x0397
        L_0x0392:
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x03cd }
            r6.<init>()     // Catch:{ all -> 0x03cd }
        L_0x0397:
            java.lang.Object r3 = r0.body()     // Catch:{ all -> 0x03cb }
            com.bytedance.retrofit2.mime.TypedInput r3 = (com.bytedance.retrofit2.mime.TypedInput) r3     // Catch:{ all -> 0x03cb }
            java.io.InputStream r3 = r3.in()     // Catch:{ all -> 0x03cb }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x03da }
        L_0x03a5:
            r8 = 1024(0x400, float:1.435E-42)
            int r8 = r3.read(r7, r15, r8)     // Catch:{ all -> 0x03da }
            if (r8 <= 0) goto L_0x03b1
            r6.write(r7, r15, r8)     // Catch:{ all -> 0x03da }
            goto L_0x03a5
        L_0x03b1:
            r6.flush()     // Catch:{ all -> 0x03da }
            boolean r7 = r6 instanceof java.io.ByteArrayOutputStream     // Catch:{ all -> 0x03da }
            if (r7 == 0) goto L_0x03c0
            r7 = r6
            java.io.ByteArrayOutputStream r7 = (java.io.ByteArrayOutputStream) r7     // Catch:{ all -> 0x03da }
            byte[] r8 = r7.toByteArray()     // Catch:{ all -> 0x03da }
            goto L_0x03c1
        L_0x03c0:
            r8 = 0
        L_0x03c1:
            com.bytedance.frameworks.baselib.network.http.parser.StreamParser.safeClose(r3)
            com.bytedance.frameworks.baselib.network.http.parser.StreamParser.safeClose(r6)
            r2.cancel()
            goto L_0x042a
        L_0x03cb:
            r3 = 0
            goto L_0x03da
        L_0x03cd:
            r16 = r5
            goto L_0x03d1
        L_0x03d0:
            r0 = 0
        L_0x03d1:
            r5 = r16
            goto L_0x03d8
        L_0x03d4:
            r5 = r16
            r0 = 0
            r2 = 0
        L_0x03d8:
            r3 = 0
            r6 = 0
        L_0x03da:
            r7 = 16777217(0x1000001, float:2.350989E-38)
            r8 = 0
            java.lang.String r13 = "84e687"
            r9 = 6
            byte[] r9 = new byte[r9]     // Catch:{ all -> 0x0435 }
            r10 = 61
            r9[r15] = r10     // Catch:{ all -> 0x0435 }
            r10 = 62
            r9[r11] = r10     // Catch:{ all -> 0x0435 }
            r10 = 21
            r9[r12] = r10     // Catch:{ all -> 0x0435 }
            r10 = 125(0x7d, float:1.75E-43)
            r9[r14] = r10     // Catch:{ all -> 0x0435 }
            r10 = 15
            r14 = 4
            r9[r14] = r10     // Catch:{ all -> 0x0435 }
            r10 = 49
            r14 = 5
            r9[r14] = r10     // Catch:{ all -> 0x0435 }
            r36 = r7
            r37 = r8
            r7 = 0
            r38 = r7
            r40 = r13
            r41 = r9
            java.lang.Object r7 = p398ms.p399bd.p400o.Pgl.pblk.m34714a(r36, r37, r38, r40, r41)     // Catch:{ all -> 0x0435 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0435 }
            if (r0 == 0) goto L_0x041a
            java.util.List r0 = r0.headers()     // Catch:{ all -> 0x0435 }
            java.lang.String r0 = r1.m34691a(r0)     // Catch:{ all -> 0x0435 }
            goto L_0x041b
        L_0x041a:
            r0 = 0
        L_0x041b:
            r4.mo76456a(r0, r5)     // Catch:{ all -> 0x0435 }
            com.bytedance.frameworks.baselib.network.http.parser.StreamParser.safeClose(r3)
            com.bytedance.frameworks.baselib.network.http.parser.StreamParser.safeClose(r6)
            if (r2 == 0) goto L_0x0429
            r2.cancel()
        L_0x0429:
            r8 = 0
        L_0x042a:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r0[r15] = r2
            r0[r11] = r8
            return r0
        L_0x0435:
            r0 = move-exception
            com.bytedance.frameworks.baselib.network.http.parser.StreamParser.safeClose(r3)
            com.bytedance.frameworks.baselib.network.http.parser.StreamParser.safeClose(r6)
            if (r2 == 0) goto L_0x0441
            r2.cancel()
        L_0x0441:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p398ms.p399bd.p400o.Pgl.pbla.m34692a(java.lang.String, byte[], java.lang.String, java.lang.String, java.lang.String, boolean):java.lang.Object[]");
    }

    /* renamed from: a */
    public Object[] mo76447a(String str, String str2, String str3) {
        return m34692a(str, (byte[]) null, (String) null, str3, str2, false);
    }

    /* renamed from: a */
    public Object[] mo76448a(String str, byte[] bArr, String str2, String str3) {
        return m34692a(str, bArr, str2, str3, (String) null, true);
    }

    /* renamed from: b */
    public Object[] mo76449b(String str, String str2, String str3) {
        return m34692a(str, (byte[]) null, str2, str3, (String) null, false);
    }
}
