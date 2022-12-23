package com.p374my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.r */
public final class C10165r extends C10170t<String> {
    C10165r() {
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (r8 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082 A[Catch:{ Exception -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p374my.tracker.obfuscated.C10170t.C10172b<java.lang.String> mo66167a(java.lang.String r8) {
        /*
            r7 = this;
            com.my.tracker.obfuscated.t$b r0 = com.p374my.tracker.obfuscated.C10170t.C10172b.m30430c()
            r1 = 0
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r3.<init>()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r4 = "HttpGetRequest: send request to "
            r3.append(r4)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r3.append(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r3)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r3.<init>(r8)     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.net.URLConnection r8 = r3.openConnection()     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x00a1, all -> 0x009f }
            r3 = 3000(0xbb8, float:4.204E-42)
            r8.setConnectTimeout(r3)     // Catch:{ Exception -> 0x009d }
            r8.setReadTimeout(r3)     // Catch:{ Exception -> 0x009d }
            java.lang.String r3 = "GET"
            r8.setRequestMethod(r3)     // Catch:{ Exception -> 0x009d }
            int r3 = r8.getResponseCode()     // Catch:{ Exception -> 0x009d }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0086
            java.lang.String r3 = "HttpGetRequest: response successfully received"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r3)     // Catch:{ Exception -> 0x009d }
            r3 = 1
            r0.f25471a = r3     // Catch:{ Exception -> 0x009d }
            java.lang.String r3 = "HttpGetRequest: processing server response"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r3)     // Catch:{ all -> 0x007f }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x007f }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x007f }
            java.io.InputStream r5 = r8.getInputStream()     // Catch:{ all -> 0x007f }
            r4.<init>(r5)     // Catch:{ all -> 0x007f }
            r3.<init>(r4)     // Catch:{ all -> 0x007f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007a }
            r2.<init>()     // Catch:{ all -> 0x007a }
        L_0x005a:
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x007a }
            if (r4 == 0) goto L_0x0064
            r2.append(r4)     // Catch:{ all -> 0x007a }
            goto L_0x005a
        L_0x0064:
            int r4 = r2.length()     // Catch:{ all -> 0x007a }
            if (r4 <= 0) goto L_0x0071
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007a }
            r0.f25472b = r2     // Catch:{ all -> 0x007a }
            goto L_0x0076
        L_0x0071:
            java.lang.String r2 = "HttpGetRequest: response data is empty"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r2)     // Catch:{ all -> 0x007a }
        L_0x0076:
            r3.close()     // Catch:{ Exception -> 0x009d }
            goto L_0x00b2
        L_0x007a:
            r2 = move-exception
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0080
        L_0x007f:
            r3 = move-exception
        L_0x0080:
            if (r2 == 0) goto L_0x0085
            r2.close()     // Catch:{ Exception -> 0x009d }
        L_0x0085:
            throw r3     // Catch:{ Exception -> 0x009d }
        L_0x0086:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d }
            r2.<init>()     // Catch:{ Exception -> 0x009d }
            java.lang.String r4 = "HttpGetRequest error: response code "
            r2.append(r4)     // Catch:{ Exception -> 0x009d }
            r2.append(r3)     // Catch:{ Exception -> 0x009d }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x009d }
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r2)     // Catch:{ Exception -> 0x009d }
            r0.f25471a = r1     // Catch:{ Exception -> 0x009d }
            goto L_0x00b2
        L_0x009d:
            r2 = move-exception
            goto L_0x00a5
        L_0x009f:
            r0 = move-exception
            goto L_0x00b8
        L_0x00a1:
            r8 = move-exception
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x00a5:
            java.lang.String r3 = "HttpGetRequest: error"
            com.p374my.tracker.obfuscated.C10175u0.m30441a(r3, r2)     // Catch:{ all -> 0x00b6 }
            r0.f25471a = r1     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = "HttpGetRequest: error while sending data"
            r0.f25473c = r1     // Catch:{ all -> 0x00b6 }
            if (r8 == 0) goto L_0x00b5
        L_0x00b2:
            r8.disconnect()
        L_0x00b5:
            return r0
        L_0x00b6:
            r0 = move-exception
            r2 = r8
        L_0x00b8:
            if (r2 == 0) goto L_0x00bd
            r2.disconnect()
        L_0x00bd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10165r.mo66167a(java.lang.String):com.my.tracker.obfuscated.t$b");
    }
}
