package com.p374my.target;

/* renamed from: com.my.target.j3 */
public final class C9778j3 extends C9734h3<String> {
    /* renamed from: d */
    public static C9778j3 m28395d() {
        return new C9778j3();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo63942a(java.lang.String r5, java.lang.String r6, android.content.Context r7) {
        /*
            r4 = this;
            com.my.target.h8 r6 = com.p374my.target.C9740h8.m28156a((android.content.Context) r7)
            r7 = 0
            r0 = 0
            if (r6 == 0) goto L_0x00b3
            java.lang.String r1 = r6.mo64199c(r5)
            r4.f23991d = r1
            r2 = 1
            if (r1 == 0) goto L_0x0016
            r4.f23989b = r2
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r1.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "send video request: "
            r1.append(r3)     // Catch:{ all -> 0x0089 }
            r1.append(r5)     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0089 }
            com.p374my.target.C9672e0.m27882a(r1)     // Catch:{ all -> 0x0089 }
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0089 }
            r1.<init>(r5)     // Catch:{ all -> 0x0089 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x0089 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x0089 }
            r7 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r7)     // Catch:{ all -> 0x0086 }
            r1.setConnectTimeout(r7)     // Catch:{ all -> 0x0086 }
            r1.setInstanceFollowRedirects(r2)     // Catch:{ all -> 0x0086 }
            java.lang.String r7 = "connection"
            java.lang.String r2 = "close"
            r1.setRequestProperty(r7, r2)     // Catch:{ all -> 0x0086 }
            r1.connect()     // Catch:{ all -> 0x0086 }
            int r7 = r1.getResponseCode()     // Catch:{ all -> 0x0086 }
            r4.f23990c = r7     // Catch:{ all -> 0x0086 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r7 != r2) goto L_0x006c
            java.io.InputStream r7 = r1.getInputStream()     // Catch:{ all -> 0x0086 }
            java.io.File r5 = r6.mo64196b((java.io.InputStream) r7, (java.lang.String) r5)     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0065
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x0086 }
            r4.f23991d = r5     // Catch:{ all -> 0x0086 }
            goto L_0x00a9
        L_0x0065:
            r4.f23988a = r0     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "video request error: can't save video to disk cache"
        L_0x0069:
            r4.f23992e = r5     // Catch:{ all -> 0x0086 }
            goto L_0x0082
        L_0x006c:
            r4.f23988a = r0     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            r5.<init>()     // Catch:{ all -> 0x0086 }
            java.lang.String r6 = "video request error: response code "
            r5.append(r6)     // Catch:{ all -> 0x0086 }
            int r6 = r4.f23990c     // Catch:{ all -> 0x0086 }
            r5.append(r6)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0086 }
            goto L_0x0069
        L_0x0082:
            com.p374my.target.C9672e0.m27882a(r5)     // Catch:{ all -> 0x0086 }
            goto L_0x00a9
        L_0x0086:
            r5 = move-exception
            r7 = r1
            goto L_0x008a
        L_0x0089:
            r5 = move-exception
        L_0x008a:
            r4.f23988a = r0
            java.lang.String r5 = r5.getMessage()
            r4.f23992e = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "video request error: "
            r5.append(r6)
            java.lang.String r6 = r4.f23992e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.p374my.target.C9672e0.m27882a(r5)
            r1 = r7
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            r1.disconnect()
        L_0x00ae:
            T r5 = r4.f23991d
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L_0x00b3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "unable to open disk cache and load/save video "
            r6.append(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.p374my.target.C9672e0.m27882a(r5)
            r4.f23988a = r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9778j3.mo63942a(java.lang.String, java.lang.String, android.content.Context):java.lang.String");
    }
}
