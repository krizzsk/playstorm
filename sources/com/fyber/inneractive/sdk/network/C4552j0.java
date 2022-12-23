package com.fyber.inneractive.sdk.network;

import android.graphics.Bitmap;

/* renamed from: com.fyber.inneractive.sdk.network.j0 */
public class C4552j0 extends C4540e0<C4553a> {

    /* renamed from: g */
    public final String f11248g;

    /* renamed from: com.fyber.inneractive.sdk.network.j0$a */
    public static class C4553a {

        /* renamed from: a */
        public Bitmap f11249a = null;

        /* renamed from: b */
        public String f11250b = null;

        public C4553a(Bitmap bitmap, String str) {
        }
    }

    public C4552j0(C4579u<C4553a> uVar, String str) {
        super(uVar, C4580v.m14056b().mo24773a());
        this.f11248g = str;
    }

    /* renamed from: a */
    public String mo24715a() {
        return this.f11248g;
    }

    /* renamed from: f */
    public C4557l0 mo24722f() {
        return C4557l0.LOW;
    }

    /* renamed from: j */
    public boolean mo24726j() {
        return false;
    }

    /* renamed from: n */
    public C4586y mo24730n() {
        return C4586y.f11398d;
    }

    /* renamed from: p */
    public int mo24731p() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.network.C4530a0 mo24713a(java.io.InputStream r18, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r19, int r20) throws java.lang.Exception {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            com.fyber.inneractive.sdk.network.a0 r2 = new com.fyber.inneractive.sdk.network.a0
            r2.<init>()
            com.fyber.inneractive.sdk.network.j0$a r3 = new com.fyber.inneractive.sdk.network.j0$a
            r4 = 0
            r3.<init>(r4, r4)
            if (r0 == 0) goto L_0x00cf
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0028
            java.lang.String r7 = "Content-Length"
            java.lang.Object r1 = r1.get(r7)     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            goto L_0x0029
        L_0x001e:
            r0 = move-exception
            r4 = r17
            goto L_0x0099
        L_0x0023:
            r0 = move-exception
            r4 = r17
            goto L_0x00b4
        L_0x0028:
            r1 = r4
        L_0x0029:
            r7 = -1
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r1.get(r6)     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            int r1 = com.fyber.inneractive.sdk.util.C5370s.m16783a((java.lang.String) r1, (int) r7)     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            goto L_0x0038
        L_0x0037:
            r1 = r7
        L_0x0038:
            java.util.concurrent.atomic.AtomicInteger r8 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            r8.<init>(r6)     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            com.fyber.inneractive.sdk.util.i0 r9 = new com.fyber.inneractive.sdk.util.i0     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            r9.<init>(r0, r8)     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r9)     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            int r8 = r8.get()     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            if (r8 != r1) goto L_0x004d
            r4 = r0
        L_0x004d:
            if (r4 == 0) goto L_0x0087
            int r15 = r4.getWidth()     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            int r16 = r4.getHeight()     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            int r0 = r15 * r16
            int[] r1 = new int[r0]     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            r11 = 0
            r13 = 0
            r14 = 0
            r9 = r4
            r10 = r1
            r12 = r15
            r9.getPixels(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            r8 = r6
        L_0x0065:
            if (r8 >= r0) goto L_0x0073
            r9 = r1[r8]     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            if (r8 == 0) goto L_0x006f
            if (r9 == r7) goto L_0x0070
            r0 = r5
            goto L_0x0074
        L_0x006f:
            r7 = r9
        L_0x0070:
            int r8 = r8 + 1
            goto L_0x0065
        L_0x0073:
            r0 = r6
        L_0x0074:
            if (r0 != 0) goto L_0x0077
            goto L_0x0087
        L_0x0077:
            r3.f11249a = r4     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            java.lang.String r0 = "SimpleImageLoader: Got a valid bitmap %s"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0023, OutOfMemoryError -> 0x001e }
            r4 = r17
            java.lang.String r7 = r4.f11248g     // Catch:{ Exception -> 0x0097, OutOfMemoryError -> 0x0095 }
            r1[r6] = r7     // Catch:{ Exception -> 0x0097, OutOfMemoryError -> 0x0095 }
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r0, r1)     // Catch:{ Exception -> 0x0097, OutOfMemoryError -> 0x0095 }
            goto L_0x00d1
        L_0x0087:
            r4 = r17
            java.lang.String r0 = "SimpleImageLoader: Got an invalid bitmap"
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0097, OutOfMemoryError -> 0x0095 }
            com.fyber.inneractive.sdk.util.IAlog.m16699a(r0, r1)     // Catch:{ Exception -> 0x0097, OutOfMemoryError -> 0x0095 }
            java.lang.String r0 = "Got an invalid bitmap"
            r3.f11250b = r0     // Catch:{ Exception -> 0x0097, OutOfMemoryError -> 0x0095 }
            goto L_0x00d1
        L_0x0095:
            r0 = move-exception
            goto L_0x0099
        L_0x0097:
            r0 = move-exception
            goto L_0x00b4
        L_0x0099:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r5 = r0.getMessage()
            r1[r6] = r5
            java.lang.String r5 = "SimpleImageLoader: OutOfMemoryError on load image %s"
            com.fyber.inneractive.sdk.util.IAlog.m16701c(r5, r1)
            android.graphics.Bitmap r1 = r3.f11249a
            if (r1 == 0) goto L_0x00ad
            r1.recycle()
        L_0x00ad:
            java.lang.String r0 = r0.getMessage()
            r3.f11250b = r0
            goto L_0x00d1
        L_0x00b4:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r7 = r0.getMessage()
            r1[r6] = r7
            java.lang.String r6 = r0.toString()
            r1[r5] = r6
            java.lang.String r5 = "SimpleImageLoader: Exception on load image %s %s"
            com.fyber.inneractive.sdk.util.IAlog.m16701c(r5, r1)
            java.lang.String r0 = r0.getMessage()
            r3.f11250b = r0
            goto L_0x00d1
        L_0x00cf:
            r4 = r17
        L_0x00d1:
            r2.f11197a = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C4552j0.mo24713a(java.io.InputStream, java.util.Map, int):com.fyber.inneractive.sdk.network.a0");
    }
}
