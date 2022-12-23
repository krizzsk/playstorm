package com.tapjoy;

import androidx.browser.trusted.sharing.ShareTarget;
import com.tapjoy.internal.C11631fl;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class TapjoyURLConnection {
    public static final int TYPE_GET = 0;
    public static final int TYPE_POST = 1;

    public TapjoyHttpURLResponse getRedirectFromURL(String str) {
        return getResponseFromURL(str, "", 0, true, (Map<String, String>) null, (String) null, (String) null);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, Map<String, String> map) {
        return getResponseFromURL(str, TapjoyUtil.convertURLParams(map, false), 0);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, Map<String, String> map, int i) {
        return getResponseFromURL(str, TapjoyUtil.convertURLParams(map, false), i);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str) {
        return getResponseFromURL(str, "", 0);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, String str2) {
        return getResponseFromURL(str, str2, 0);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, String str2, int i) {
        return getResponseFromURL(str, str2, i, false, (Map<String, String>) null, (String) null, (String) null);
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        return getResponseFromURL(str, map != null ? TapjoyUtil.convertURLParams(map, false) : "", 1, false, map2, ShareTarget.ENCODING_TYPE_URL_ENCODED, TapjoyUtil.convertURLParams(map3, false));
    }

    public TapjoyHttpURLResponse getResponseFromURL(String str, Map<String, String> map, Map<String, String> map2, String str2) {
        return getResponseFromURL(str, map != null ? TapjoyUtil.convertURLParams(map, false) : "", 1, false, map2, "application/json;charset=utf-8", str2);
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0168 A[SYNTHETIC, Splitter:B:47:0x0168] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tapjoy.TapjoyHttpURLResponse getResponseFromURL(java.lang.String r8, java.lang.String r9, int r10, boolean r11, java.util.Map<java.lang.String, java.lang.String> r12, java.lang.String r13, java.lang.String r14) {
        /*
            r7 = this;
            java.lang.String r0 = "Exception: "
            java.lang.String r1 = "TapjoyURLConnection"
            com.tapjoy.TapjoyHttpURLResponse r2 = new com.tapjoy.TapjoyHttpURLResponse
            r2.<init>()
            r3 = 10
            r4 = 0
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            r6.<init>()     // Catch:{ Exception -> 0x0150 }
            r6.append(r8)     // Catch:{ Exception -> 0x0150 }
            r6.append(r9)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r8 = r6.toString()     // Catch:{ Exception -> 0x0150 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0150 }
            java.lang.String r6 = "http "
            r9.<init>(r6)     // Catch:{ Exception -> 0x0150 }
            if (r10 != 0) goto L_0x0028
            java.lang.String r6 = "get"
            goto L_0x002a
        L_0x0028:
            java.lang.String r6 = "post"
        L_0x002a:
            r9.append(r6)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r6 = ": "
            r9.append(r6)     // Catch:{ Exception -> 0x0150 }
            r9.append(r8)     // Catch:{ Exception -> 0x0150 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0150 }
            com.tapjoy.TapjoyLog.m33197i(r1, r9)     // Catch:{ Exception -> 0x0150 }
            java.net.URL r9 = new java.net.URL     // Catch:{ Exception -> 0x0150 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x0150 }
            java.net.URLConnection r8 = com.tapjoy.internal.C11631fl.m33789a(r9)     // Catch:{ Exception -> 0x0150 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x0150 }
            if (r11 == 0) goto L_0x004c
            r8.setInstanceFollowRedirects(r4)     // Catch:{ Exception -> 0x014c }
        L_0x004c:
            r9 = 15000(0x3a98, float:2.102E-41)
            r8.setConnectTimeout(r9)     // Catch:{ Exception -> 0x014c }
            r9 = 30000(0x7530, float:4.2039E-41)
            r8.setReadTimeout(r9)     // Catch:{ Exception -> 0x014c }
            if (r12 == 0) goto L_0x007c
            java.util.Set r9 = r12.entrySet()     // Catch:{ Exception -> 0x014c }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x014c }
        L_0x0060:
            boolean r12 = r9.hasNext()     // Catch:{ Exception -> 0x014c }
            if (r12 == 0) goto L_0x007c
            java.lang.Object r12 = r9.next()     // Catch:{ Exception -> 0x014c }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ Exception -> 0x014c }
            java.lang.Object r6 = r12.getKey()     // Catch:{ Exception -> 0x014c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x014c }
            java.lang.Object r12 = r12.getValue()     // Catch:{ Exception -> 0x014c }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x014c }
            r8.setRequestProperty(r6, r12)     // Catch:{ Exception -> 0x014c }
            goto L_0x0060
        L_0x007c:
            r9 = 1
            if (r10 != r9) goto L_0x00c0
            java.lang.String r10 = "POST"
            r8.setRequestMethod(r10)     // Catch:{ Exception -> 0x014c }
            if (r14 == 0) goto L_0x00c0
            java.lang.String r10 = "Content-Type: "
            java.lang.String r12 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = r10.concat(r12)     // Catch:{ Exception -> 0x014c }
            com.tapjoy.TapjoyLog.m33197i(r1, r10)     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = "Content:"
            com.tapjoy.TapjoyLog.m33197i(r1, r10)     // Catch:{ Exception -> 0x014c }
            com.tapjoy.TapjoyLog.m33197i(r1, r14)     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = "Content-Type"
            r8.setRequestProperty(r10, r13)     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = "Connection"
            java.lang.String r12 = "close"
            r8.setRequestProperty(r10, r12)     // Catch:{ Exception -> 0x014c }
            r8.setDoOutput(r9)     // Catch:{ Exception -> 0x014c }
            int r9 = r14.length()     // Catch:{ Exception -> 0x014c }
            r8.setFixedLengthStreamingMode(r9)     // Catch:{ Exception -> 0x014c }
            java.io.OutputStreamWriter r9 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x014c }
            java.io.OutputStream r10 = r8.getOutputStream()     // Catch:{ Exception -> 0x014c }
            r9.<init>(r10)     // Catch:{ Exception -> 0x014c }
            r9.write(r14)     // Catch:{ Exception -> 0x014c }
            r9.close()     // Catch:{ Exception -> 0x014c }
        L_0x00c0:
            r8.connect()     // Catch:{ Exception -> 0x014c }
            int r9 = r8.getResponseCode()     // Catch:{ Exception -> 0x014c }
            r2.statusCode = r9     // Catch:{ Exception -> 0x014c }
            java.util.Map r9 = r8.getHeaderFields()     // Catch:{ Exception -> 0x014c }
            r2.headerFields = r9     // Catch:{ Exception -> 0x014c }
            long r9 = r8.getDate()     // Catch:{ Exception -> 0x014c }
            r2.date = r9     // Catch:{ Exception -> 0x014c }
            long r9 = r8.getExpiration()     // Catch:{ Exception -> 0x014c }
            r2.expires = r9     // Catch:{ Exception -> 0x014c }
            if (r11 != 0) goto L_0x00eb
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x014c }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x014c }
            java.io.InputStream r10 = r8.getInputStream()     // Catch:{ Exception -> 0x014c }
            r9.<init>(r10)     // Catch:{ Exception -> 0x014c }
            r5.<init>(r9)     // Catch:{ Exception -> 0x014c }
        L_0x00eb:
            if (r11 != 0) goto L_0x0111
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r9.<init>()     // Catch:{ Exception -> 0x014c }
        L_0x00f2:
            java.lang.String r10 = r5.readLine()     // Catch:{ Exception -> 0x014c }
            if (r10 == 0) goto L_0x010b
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r11.<init>()     // Catch:{ Exception -> 0x014c }
            r11.append(r10)     // Catch:{ Exception -> 0x014c }
            r11.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x014c }
            r9.append(r10)     // Catch:{ Exception -> 0x014c }
            goto L_0x00f2
        L_0x010b:
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x014c }
            r2.response = r9     // Catch:{ Exception -> 0x014c }
        L_0x0111:
            int r9 = r2.statusCode     // Catch:{ Exception -> 0x014c }
            r10 = 302(0x12e, float:4.23E-43)
            if (r9 != r10) goto L_0x011f
            java.lang.String r9 = "Location"
            java.lang.String r9 = r8.getHeaderField(r9)     // Catch:{ Exception -> 0x014c }
            r2.redirectURL = r9     // Catch:{ Exception -> 0x014c }
        L_0x011f:
            java.lang.String r9 = "content-length"
            java.lang.String r9 = r8.getHeaderField(r9)     // Catch:{ Exception -> 0x014c }
            if (r9 == 0) goto L_0x0146
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0132 }
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x0132 }
            r2.contentLength = r9     // Catch:{ Exception -> 0x0132 }
            goto L_0x0146
        L_0x0132:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r10.<init>(r0)     // Catch:{ Exception -> 0x014c }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x014c }
            r10.append(r9)     // Catch:{ Exception -> 0x014c }
            java.lang.String r9 = r10.toString()     // Catch:{ Exception -> 0x014c }
            com.tapjoy.TapjoyLog.m33196e((java.lang.String) r1, (java.lang.String) r9)     // Catch:{ Exception -> 0x014c }
        L_0x0146:
            if (r5 == 0) goto L_0x01b5
            r5.close()     // Catch:{ Exception -> 0x014c }
            goto L_0x01b5
        L_0x014c:
            r9 = move-exception
            r5 = r8
            r8 = r9
            goto L_0x0151
        L_0x0150:
            r8 = move-exception
        L_0x0151:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            java.lang.String r8 = r8.toString()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tapjoy.TapjoyLog.m33196e((java.lang.String) r1, (java.lang.String) r8)
            r2.statusCode = r4
            if (r5 == 0) goto L_0x01b5
            java.lang.String r8 = r2.response     // Catch:{ Exception -> 0x019f }
            if (r8 != 0) goto L_0x01b5
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ Exception -> 0x019f }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x019f }
            java.io.InputStream r10 = r5.getErrorStream()     // Catch:{ Exception -> 0x019f }
            r9.<init>(r10)     // Catch:{ Exception -> 0x019f }
            r8.<init>(r9)     // Catch:{ Exception -> 0x019f }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019f }
            r9.<init>()     // Catch:{ Exception -> 0x019f }
        L_0x017f:
            java.lang.String r10 = r8.readLine()     // Catch:{ Exception -> 0x019f }
            if (r10 == 0) goto L_0x0198
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x019f }
            r11.<init>()     // Catch:{ Exception -> 0x019f }
            r11.append(r10)     // Catch:{ Exception -> 0x019f }
            r11.append(r3)     // Catch:{ Exception -> 0x019f }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x019f }
            r9.append(r10)     // Catch:{ Exception -> 0x019f }
            goto L_0x017f
        L_0x0198:
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x019f }
            r2.response = r8     // Catch:{ Exception -> 0x019f }
            goto L_0x01b5
        L_0x019f:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Exception trying to get error code/content: "
            r9.<init>(r10)
            java.lang.String r8 = r8.toString()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tapjoy.TapjoyLog.m33196e((java.lang.String) r1, (java.lang.String) r8)
        L_0x01b5:
            java.lang.String r8 = "--------------------"
            com.tapjoy.TapjoyLog.m33197i(r1, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "response status: "
            r9.<init>(r10)
            int r10 = r2.statusCode
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tapjoy.TapjoyLog.m33197i(r1, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "response size: "
            r9.<init>(r10)
            int r10 = r2.contentLength
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tapjoy.TapjoyLog.m33197i(r1, r9)
            java.lang.String r9 = r2.redirectURL
            if (r9 == 0) goto L_0x01ff
            java.lang.String r9 = r2.redirectURL
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x01ff
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "redirectURL: "
            r9.<init>(r10)
            java.lang.String r10 = r2.redirectURL
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tapjoy.TapjoyLog.m33197i(r1, r9)
        L_0x01ff:
            com.tapjoy.TapjoyLog.m33197i(r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.TapjoyURLConnection.getResponseFromURL(java.lang.String, java.lang.String, int, boolean, java.util.Map, java.lang.String, java.lang.String):com.tapjoy.TapjoyHttpURLResponse");
    }

    public String getContentLength(String str) {
        String str2;
        try {
            String replaceAll = str.replaceAll(" ", "%20");
            TapjoyLog.m33194d("TapjoyURLConnection", "requestURL: ".concat(String.valueOf(replaceAll)));
            HttpURLConnection httpURLConnection = (HttpURLConnection) C11631fl.m33789a(new URL(replaceAll));
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(30000);
            str2 = httpURLConnection.getHeaderField("content-length");
        } catch (Exception e) {
            TapjoyLog.m33196e("TapjoyURLConnection", "Exception: " + e.toString());
            str2 = null;
        }
        TapjoyLog.m33194d("TapjoyURLConnection", "content-length: ".concat(String.valueOf(str2)));
        return str2;
    }
}
