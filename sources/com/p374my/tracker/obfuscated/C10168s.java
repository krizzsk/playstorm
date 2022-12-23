package com.p374my.tracker.obfuscated;

import com.p374my.tracker.obfuscated.C10170t;

/* renamed from: com.my.tracker.obfuscated.s */
public final class C10168s extends C10170t<String> {

    /* renamed from: a */
    final C10170t.C10171a f25469a;

    /* renamed from: b */
    final boolean f25470b;

    C10168s(C10170t.C10171a aVar, boolean z) {
        this.f25469a = aVar;
        this.f25470b = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.util.zip.GZIPOutputStream} */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.io.FilterOutputStream] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v12, types: [java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0100, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        r4 = r3;
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0107, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f9 A[Catch:{ all -> 0x00f1, all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0107 A[Catch:{ all -> 0x00f1, all -> 0x010b }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p374my.tracker.obfuscated.C10170t.C10172b<java.lang.String> mo66167a(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "HttpPostRequest error: error while sending data"
            com.my.tracker.obfuscated.t$b r1 = com.p374my.tracker.obfuscated.C10170t.C10172b.m30430c()
            r2 = 0
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x010d }
            r4.<init>()     // Catch:{ all -> 0x010d }
            java.lang.String r5 = "HttpPostRequest: send request to "
            r4.append(r5)     // Catch:{ all -> 0x010d }
            r4.append(r10)     // Catch:{ all -> 0x010d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x010d }
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r4)     // Catch:{ all -> 0x010d }
            java.net.URL r4 = new java.net.URL     // Catch:{ all -> 0x010d }
            r4.<init>(r10)     // Catch:{ all -> 0x010d }
            java.net.URLConnection r10 = r4.openConnection()     // Catch:{ all -> 0x010d }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ all -> 0x010d }
            r4 = 10000(0x2710, float:1.4013E-41)
            r10.setConnectTimeout(r4)     // Catch:{ all -> 0x010b }
            r10.setReadTimeout(r4)     // Catch:{ all -> 0x010b }
            r4 = 1
            r10.setInstanceFollowRedirects(r4)     // Catch:{ all -> 0x010b }
            java.lang.String r5 = "POST"
            r10.setRequestMethod(r5)     // Catch:{ all -> 0x010b }
            java.lang.String r5 = "Connection"
            java.lang.String r6 = "close"
            r10.setRequestProperty(r5, r6)     // Catch:{ all -> 0x010b }
            java.lang.String r5 = "Content-Type"
            com.my.tracker.obfuscated.t$a r6 = r9.f25469a     // Catch:{ all -> 0x010b }
            java.lang.String r6 = r6.mo66257a()     // Catch:{ all -> 0x010b }
            r10.setRequestProperty(r5, r6)     // Catch:{ all -> 0x010b }
            r10.setUseCaches(r2)     // Catch:{ all -> 0x010b }
            r10.setDoOutput(r4)     // Catch:{ all -> 0x010b }
            boolean r5 = r9.f25470b     // Catch:{ all -> 0x0103 }
            if (r5 == 0) goto L_0x006c
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r10.setRequestProperty(r5, r6)     // Catch:{ all -> 0x0103 }
            java.util.zip.GZIPOutputStream r5 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0103 }
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0103 }
            java.io.OutputStream r7 = r10.getOutputStream()     // Catch:{ all -> 0x0103 }
            r6.<init>(r7)     // Catch:{ all -> 0x0103 }
            r5.<init>(r6)     // Catch:{ all -> 0x0103 }
            java.lang.String r6 = "HttpPostRequest: populating post request body using gzip"
            goto L_0x0077
        L_0x006c:
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x0103 }
            java.io.OutputStream r6 = r10.getOutputStream()     // Catch:{ all -> 0x0103 }
            r5.<init>(r6)     // Catch:{ all -> 0x0103 }
            java.lang.String r6 = "HttpPostRequest: populating post request body without using gzip"
        L_0x0077:
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r6)     // Catch:{ all -> 0x0100 }
            com.my.tracker.obfuscated.t$a r6 = r9.f25469a     // Catch:{ all -> 0x00fd }
            r6.mo66264a(r5)     // Catch:{ all -> 0x00fd }
            boolean r6 = r9.f25470b     // Catch:{ all -> 0x00fd }
            if (r6 == 0) goto L_0x0089
            r6 = r5
            java.util.zip.GZIPOutputStream r6 = (java.util.zip.GZIPOutputStream) r6     // Catch:{ all -> 0x00fd }
            r6.finish()     // Catch:{ all -> 0x00fd }
        L_0x0089:
            r5.close()     // Catch:{ all -> 0x010b }
            int r5 = r10.getResponseCode()     // Catch:{ all -> 0x010b }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x00b0
            r7 = 204(0xcc, float:2.86E-43)
            if (r5 != r7) goto L_0x0099
            goto L_0x00b0
        L_0x0099:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x010b }
            r4.<init>()     // Catch:{ all -> 0x010b }
            java.lang.String r7 = "HttpPostRequest error: response code "
            r4.append(r7)     // Catch:{ all -> 0x010b }
            r4.append(r5)     // Catch:{ all -> 0x010b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x010b }
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r4)     // Catch:{ all -> 0x010b }
            r1.f25471a = r2     // Catch:{ all -> 0x010b }
            goto L_0x00b7
        L_0x00b0:
            java.lang.String r7 = "HttpPostRequest: response successfully received"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r7)     // Catch:{ all -> 0x010b }
            r1.f25471a = r4     // Catch:{ all -> 0x010b }
        L_0x00b7:
            if (r5 != r6) goto L_0x011a
            java.lang.String r4 = "HttpPostRequest: processing server response"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r4)     // Catch:{ all -> 0x00f6 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ all -> 0x00f6 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ all -> 0x00f6 }
            java.io.InputStream r6 = r10.getInputStream()     // Catch:{ all -> 0x00f6 }
            r5.<init>(r6)     // Catch:{ all -> 0x00f6 }
            r4.<init>(r5)     // Catch:{ all -> 0x00f6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            r3.<init>()     // Catch:{ all -> 0x00f1 }
        L_0x00d1:
            java.lang.String r5 = r4.readLine()     // Catch:{ all -> 0x00f1 }
            if (r5 == 0) goto L_0x00db
            r3.append(r5)     // Catch:{ all -> 0x00f1 }
            goto L_0x00d1
        L_0x00db:
            int r5 = r3.length()     // Catch:{ all -> 0x00f1 }
            if (r5 <= 0) goto L_0x00e8
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00f1 }
            r1.f25472b = r3     // Catch:{ all -> 0x00f1 }
            goto L_0x00ed
        L_0x00e8:
            java.lang.String r3 = "HttpPostRequest: response data is empty"
            com.p374my.tracker.obfuscated.C10175u0.m30440a((java.lang.String) r3)     // Catch:{ all -> 0x00f1 }
        L_0x00ed:
            r4.close()     // Catch:{ all -> 0x010b }
            goto L_0x011a
        L_0x00f1:
            r3 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x00f7
        L_0x00f6:
            r4 = move-exception
        L_0x00f7:
            if (r3 == 0) goto L_0x010a
            r3.close()     // Catch:{ all -> 0x010b }
            goto L_0x010a
        L_0x00fd:
            r4 = move-exception
            r3 = r5
            goto L_0x0104
        L_0x0100:
            r3 = move-exception
            r4 = r3
            goto L_0x0105
        L_0x0103:
            r4 = move-exception
        L_0x0104:
            r5 = r3
        L_0x0105:
            if (r5 == 0) goto L_0x010a
            r5.close()     // Catch:{ all -> 0x010b }
        L_0x010a:
            throw r4     // Catch:{ all -> 0x010b }
        L_0x010b:
            r3 = move-exception
            goto L_0x0111
        L_0x010d:
            r10 = move-exception
            r8 = r3
            r3 = r10
            r10 = r8
        L_0x0111:
            com.p374my.tracker.obfuscated.C10175u0.m30441a(r0, r3)     // Catch:{ all -> 0x011e }
            r1.f25471a = r2     // Catch:{ all -> 0x011e }
            r1.f25473c = r0     // Catch:{ all -> 0x011e }
            if (r10 == 0) goto L_0x011d
        L_0x011a:
            r10.disconnect()
        L_0x011d:
            return r1
        L_0x011e:
            r0 = move-exception
            if (r10 == 0) goto L_0x0124
            r10.disconnect()
        L_0x0124:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.tracker.obfuscated.C10168s.mo66167a(java.lang.String):com.my.tracker.obfuscated.t$b");
    }
}
