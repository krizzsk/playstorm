package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.net.HttpURLConnection;

/* renamed from: com.fyber.inneractive.sdk.web.r */
public class C5433r {

    /* renamed from: b */
    public static final byte[] f14385b = new byte[0];

    /* renamed from: c */
    public static final C5433r f14386c = new C5433r();

    /* renamed from: a */
    public final C5431p<C5435t> f14387a = new C5431p<>(1048576);

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.web.C5434s m16886a(java.net.HttpURLConnection r11, java.nio.ByteBuffer r12) throws java.io.IOException {
        /*
            r11.connect()
            r0 = 0
            r1 = r0
        L_0x0005:
            r2 = 20
            r3 = 0
            if (r1 >= r2) goto L_0x00d8
            int r9 = r11.getResponseCode()
            r2 = 300(0x12c, float:4.2E-43)
            if (r9 < r2) goto L_0x0038
            r2 = 400(0x190, float:5.6E-43)
            if (r9 < r2) goto L_0x0017
            goto L_0x0038
        L_0x0017:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r11.getHeaderField(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x0024
            return r3
        L_0x0024:
            r11.disconnect()
            java.net.URL r11 = new java.net.URL
            r11.<init>(r2)
            java.net.URLConnection r11 = r11.openConnection()
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11
            r11.connect()
            int r1 = r1 + 1
            goto L_0x0005
        L_0x0038:
            java.io.InputStream r1 = r11.getInputStream()     // Catch:{ all -> 0x0050 }
            byte[] r12 = r12.array()     // Catch:{ all -> 0x0051 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
        L_0x0045:
            int r4 = r1.read(r12)     // Catch:{ all -> 0x0052 }
            r5 = -1
            if (r4 == r5) goto L_0x0052
            r2.write(r12, r0, r4)     // Catch:{ all -> 0x0052 }
            goto L_0x0045
        L_0x0050:
            r1 = r3
        L_0x0051:
            r2 = r3
        L_0x0052:
            com.fyber.inneractive.sdk.util.C5370s.m16792b(r1)
            r11.disconnect()
            java.lang.String r12 = r11.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r4 = ""
            if (r1 != 0) goto L_0x0085
            java.lang.String r1 = ";"
            java.lang.String[] r12 = r12.split(r1)
            int r1 = r12.length
            if (r1 <= 0) goto L_0x0074
            r1 = r12[r0]
            java.lang.String r1 = r1.trim()
            goto L_0x0075
        L_0x0074:
            r1 = r4
        L_0x0075:
            int r5 = r12.length
            r6 = 1
            if (r5 <= r6) goto L_0x0082
            r12 = r12[r6]
            java.lang.String r12 = r12.trim()
            r8 = r12
            r7 = r1
            goto L_0x0087
        L_0x0082:
            r7 = r1
            r8 = r4
            goto L_0x0087
        L_0x0085:
            r7 = r4
            r8 = r7
        L_0x0087:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r12 = r11.getHeaderFields()
            if (r12 == 0) goto L_0x00bc
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x009a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00bc
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r12.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x009a
            int r10 = r5.size()
            if (r10 <= 0) goto L_0x009a
            java.lang.Object r5 = r5.get(r0)
            r6.put(r4, r5)
            goto L_0x009a
        L_0x00bc:
            java.lang.String r10 = r11.getResponseMessage()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto L_0x00c7
            return r3
        L_0x00c7:
            com.fyber.inneractive.sdk.web.s r11 = new com.fyber.inneractive.sdk.web.s
            if (r2 != 0) goto L_0x00ce
            byte[] r12 = f14385b
            goto L_0x00d2
        L_0x00ce:
            byte[] r12 = r2.toByteArray()
        L_0x00d2:
            r5 = r12
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r11
        L_0x00d8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.C5433r.m16886a(java.net.HttpURLConnection, java.nio.ByteBuffer):com.fyber.inneractive.sdk.web.s");
    }

    /* renamed from: a */
    public static void m16887a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() != null && webResourceRequest.getRequestHeaders().size() > 0) {
            for (String next : webResourceRequest.getRequestHeaders().keySet()) {
                if (!(next == null || webResourceRequest.getRequestHeaders().get(next) == null)) {
                    httpURLConnection.setRequestProperty(next, webResourceRequest.getRequestHeaders().get(next));
                }
            }
        }
    }
}
