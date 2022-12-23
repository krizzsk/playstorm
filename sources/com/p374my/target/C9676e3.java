package com.p374my.target;

import android.os.Build;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: com.my.target.e3 */
public final class C9676e3 extends C9734h3<String> {

    /* renamed from: f */
    public static final Charset f23799f = (Build.VERSION.SDK_INT >= 19 ? StandardCharsets.UTF_8 : Charset.forName("UTF-8"));

    /* renamed from: d */
    public static C9676e3 m27900d() {
        return new C9676e3();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0067, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        if (r0 != null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0072, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d9, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo63942a(java.lang.String r5, java.lang.String r6, android.content.Context r7) {
        /*
            r4 = this;
            r7 = 0
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r1.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r2 = "send ad request: "
            r1.append(r2)     // Catch:{ all -> 0x00fc }
            r1.append(r5)     // Catch:{ all -> 0x00fc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00fc }
            com.p374my.target.C9672e0.m27882a(r1)     // Catch:{ all -> 0x00fc }
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x00fc }
            r1.<init>(r5)     // Catch:{ all -> 0x00fc }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x00fc }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x00fc }
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r0)     // Catch:{ all -> 0x00f9 }
            r1.setConnectTimeout(r0)     // Catch:{ all -> 0x00f9 }
            r0 = 1
            r1.setInstanceFollowRedirects(r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "connection"
            java.lang.String r3 = "close"
            r1.setRequestProperty(r2, r3)     // Catch:{ all -> 0x00f9 }
            if (r6 == 0) goto L_0x0073
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r5.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "body: "
            r5.append(r2)     // Catch:{ all -> 0x00f9 }
            r5.append(r6)     // Catch:{ all -> 0x00f9 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f9 }
            r1.setDoOutput(r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "POST"
            r1.setRequestMethod(r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/x-mtrgdata-v1"
            r1.setRequestProperty(r0, r2)     // Catch:{ all -> 0x00f9 }
            java.io.OutputStream r0 = r1.getOutputStream()     // Catch:{ all -> 0x00f9 }
            byte[] r6 = r6.getBytes()     // Catch:{ all -> 0x0065 }
            r0.write(r6)     // Catch:{ all -> 0x0065 }
            r0.close()     // Catch:{ all -> 0x00f9 }
            goto L_0x0087
        L_0x0065:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r6 = move-exception
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch:{ all -> 0x00f9 }
        L_0x0072:
            throw r6     // Catch:{ all -> 0x00f9 }
        L_0x0073:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r6.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "url: "
            r6.append(r0)     // Catch:{ all -> 0x00f9 }
            r6.append(r5)     // Catch:{ all -> 0x00f9 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00f9 }
            r1.connect()     // Catch:{ all -> 0x00f9 }
        L_0x0087:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r6.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "send ad request "
            r6.append(r0)     // Catch:{ all -> 0x00f9 }
            r6.append(r5)     // Catch:{ all -> 0x00f9 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x00f9 }
            com.p374my.target.C9672e0.m27882a(r5)     // Catch:{ all -> 0x00f9 }
            int r5 = r1.getResponseCode()     // Catch:{ all -> 0x00f9 }
            r4.f23990c = r5     // Catch:{ all -> 0x00f9 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x00da
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x00f9 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x00f9 }
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ all -> 0x00f9 }
            java.nio.charset.Charset r2 = f23799f     // Catch:{ all -> 0x00f9 }
            r6.<init>(r0, r2)     // Catch:{ all -> 0x00f9 }
            r5.<init>(r6)     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ce }
            r6.<init>()     // Catch:{ all -> 0x00ce }
        L_0x00ba:
            java.lang.String r0 = r5.readLine()     // Catch:{ all -> 0x00ce }
            if (r0 == 0) goto L_0x00c4
            r6.append(r0)     // Catch:{ all -> 0x00ce }
            goto L_0x00ba
        L_0x00c4:
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00ce }
            r4.f23991d = r6     // Catch:{ all -> 0x00ce }
            r5.close()     // Catch:{ all -> 0x00f9 }
            goto L_0x011c
        L_0x00ce:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00d5 }
            goto L_0x00d9
        L_0x00d5:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch:{ all -> 0x00f9 }
        L_0x00d9:
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00da:
            r6 = 204(0xcc, float:2.86E-43)
            if (r5 == r6) goto L_0x011c
            r4.f23988a = r7     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r5.<init>()     // Catch:{ all -> 0x00f9 }
            java.lang.String r6 = "ad request error: response code "
            r5.append(r6)     // Catch:{ all -> 0x00f9 }
            int r6 = r4.f23990c     // Catch:{ all -> 0x00f9 }
            r5.append(r6)     // Catch:{ all -> 0x00f9 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f9 }
            r4.f23992e = r5     // Catch:{ all -> 0x00f9 }
            com.p374my.target.C9672e0.m27882a(r5)     // Catch:{ all -> 0x00f9 }
            goto L_0x011c
        L_0x00f9:
            r5 = move-exception
            r0 = r1
            goto L_0x00fd
        L_0x00fc:
            r5 = move-exception
        L_0x00fd:
            r4.f23988a = r7
            java.lang.String r5 = r5.getMessage()
            r4.f23992e = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "ad request error: "
            r5.append(r6)
            java.lang.String r6 = r4.f23992e
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.p374my.target.C9672e0.m27882a(r5)
            r1 = r0
        L_0x011c:
            if (r1 == 0) goto L_0x0121
            r1.disconnect()
        L_0x0121:
            T r5 = r4.f23991d
            java.lang.String r5 = (java.lang.String) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9676e3.mo63942a(java.lang.String, java.lang.String, android.content.Context):java.lang.String");
    }
}
