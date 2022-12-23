package com.mbridge.msdk.click;

import com.mbridge.msdk.foundation.controller.C2350a;
import com.mbridge.msdk.p054c.C2278a;
import com.mbridge.msdk.p054c.C2283b;

/* renamed from: com.mbridge.msdk.click.e */
/* compiled from: JavaHttpSpider */
public class C2315e {

    /* renamed from: a */
    private static final String f4773a = C2315e.class.getSimpleName();

    /* renamed from: b */
    private C2278a f4774b;

    /* renamed from: c */
    private String f4775c;

    /* renamed from: d */
    private boolean f4776d = true;

    /* renamed from: e */
    private final int f4777e = 3145728;

    /* renamed from: f */
    private C2316a f4778f;

    public C2315e() {
        C2278a b = C2283b.m5275a().mo15563b(C2350a.m5601e().mo15793h());
        this.f4774b = b;
        if (b == null) {
            this.f4774b = C2283b.m5275a().mo15562b();
        }
    }

    /* renamed from: com.mbridge.msdk.click.e$a */
    /* compiled from: JavaHttpSpider */
    public static class C2316a {

        /* renamed from: a */
        public String f4779a;

        /* renamed from: b */
        public String f4780b;

        /* renamed from: c */
        public String f4781c;

        /* renamed from: d */
        public String f4782d;

        /* renamed from: e */
        public int f4783e;

        /* renamed from: f */
        public int f4784f;

        /* renamed from: g */
        public String f4785g;

        /* renamed from: h */
        public String f4786h;

        public final String toString() {
            return "http response header：...\nstatusCode=" + this.f4784f + ", location=" + this.f4779a + ", contentType=" + this.f4780b + ", contentLength=" + this.f4783e + ", contentEncoding=" + this.f4781c + ", referer=" + this.f4782d;
        }

        /* renamed from: a */
        public final String mo15684a() {
            return "statusCode=" + this.f4784f + ", location=" + this.f4779a + ", contentType=" + this.f4780b + ", contentLength=" + this.f4783e + ", contentEncoding=" + this.f4781c + ", referer=" + this.f4782d;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.mbridge.msdk.click.e$a] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0122 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mbridge.msdk.click.C2315e.C2316a mo15683a(java.lang.String r5, boolean r6, boolean r7, com.mbridge.msdk.foundation.entity.CampaignEx r8) {
        /*
            r4 = this;
            java.lang.String r0 = "gzip"
            boolean r1 = android.webkit.URLUtil.isNetworkUrl(r5)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = " "
            java.lang.String r3 = "%20"
            java.lang.String r5 = r5.replace(r1, r3)
            com.mbridge.msdk.click.e$a r1 = new com.mbridge.msdk.click.e$a
            r1.<init>()
            r4.f4778f = r1
            java.net.URL r1 = new java.net.URL     // Catch:{ all -> 0x0115 }
            r1.<init>(r5)     // Catch:{ all -> 0x0115 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ all -> 0x0115 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ all -> 0x0115 }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x0112 }
            java.lang.String r2 = "User-Agent"
            if (r6 != 0) goto L_0x002f
            if (r7 == 0) goto L_0x0031
        L_0x002f:
            if (r8 != 0) goto L_0x0038
        L_0x0031:
            java.lang.String r3 = com.mbridge.msdk.foundation.tools.C8596q.m24829d()     // Catch:{ all -> 0x0112 }
            r1.setRequestProperty(r2, r3)     // Catch:{ all -> 0x0112 }
        L_0x0038:
            r3 = 1
            if (r6 == 0) goto L_0x004a
            if (r8 == 0) goto L_0x004a
            int r6 = r8.getcUA()     // Catch:{ all -> 0x0112 }
            if (r6 != r3) goto L_0x004a
            java.lang.String r6 = com.mbridge.msdk.foundation.tools.C8596q.m24829d()     // Catch:{ all -> 0x0112 }
            r1.setRequestProperty(r2, r6)     // Catch:{ all -> 0x0112 }
        L_0x004a:
            if (r7 == 0) goto L_0x005b
            if (r8 == 0) goto L_0x005b
            int r6 = r8.getImpUA()     // Catch:{ all -> 0x0112 }
            if (r6 != r3) goto L_0x005b
            java.lang.String r6 = com.mbridge.msdk.foundation.tools.C8596q.m24829d()     // Catch:{ all -> 0x0112 }
            r1.setRequestProperty(r2, r6)     // Catch:{ all -> 0x0112 }
        L_0x005b:
            java.lang.String r6 = "Accept-Encoding"
            r1.setRequestProperty(r6, r0)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.c.a r6 = r4.f4774b     // Catch:{ all -> 0x0112 }
            boolean r6 = r6.mo15441O()     // Catch:{ all -> 0x0112 }
            if (r6 == 0) goto L_0x0077
            java.lang.String r6 = r4.f4775c     // Catch:{ all -> 0x0112 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0112 }
            if (r6 != 0) goto L_0x0077
            java.lang.String r6 = "referer"
            java.lang.String r7 = r4.f4775c     // Catch:{ all -> 0x0112 }
            r1.setRequestProperty(r6, r7)     // Catch:{ all -> 0x0112 }
        L_0x0077:
            r6 = 60000(0xea60, float:8.4078E-41)
            r1.setConnectTimeout(r6)     // Catch:{ all -> 0x0112 }
            r1.setReadTimeout(r6)     // Catch:{ all -> 0x0112 }
            r6 = 0
            r1.setInstanceFollowRedirects(r6)     // Catch:{ all -> 0x0112 }
            r1.connect()     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.click.e$a r6 = r4.f4778f     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = "Location"
            java.lang.String r7 = r1.getHeaderField(r7)     // Catch:{ all -> 0x0112 }
            r6.f4779a = r7     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.click.e$a r6 = r4.f4778f     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = "Referer"
            java.lang.String r7 = r1.getHeaderField(r7)     // Catch:{ all -> 0x0112 }
            r6.f4782d = r7     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.click.e$a r6 = r4.f4778f     // Catch:{ all -> 0x0112 }
            int r7 = r1.getResponseCode()     // Catch:{ all -> 0x0112 }
            r6.f4784f = r7     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.click.e$a r6 = r4.f4778f     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r1.getContentType()     // Catch:{ all -> 0x0112 }
            r6.f4780b = r7     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.click.e$a r6 = r4.f4778f     // Catch:{ all -> 0x0112 }
            int r7 = r1.getContentLength()     // Catch:{ all -> 0x0112 }
            r6.f4783e = r7     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.click.e$a r6 = r4.f4778f     // Catch:{ all -> 0x0112 }
            java.lang.String r7 = r1.getContentEncoding()     // Catch:{ all -> 0x0112 }
            r6.f4781c = r7     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.click.e$a r6 = r4.f4778f     // Catch:{ all -> 0x0112 }
            java.lang.String r6 = r6.f4781c     // Catch:{ all -> 0x0112 }
            boolean r6 = r0.equalsIgnoreCase(r6)     // Catch:{ all -> 0x0112 }
            com.mbridge.msdk.click.e$a r7 = r4.f4778f     // Catch:{ all -> 0x0112 }
            int r7 = r7.f4784f     // Catch:{ all -> 0x0112 }
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 != r8) goto L_0x0108
            boolean r7 = r4.f4776d     // Catch:{ all -> 0x0112 }
            if (r7 == 0) goto L_0x0108
            com.mbridge.msdk.click.e$a r7 = r4.f4778f     // Catch:{ all -> 0x0112 }
            int r7 = r7.f4783e     // Catch:{ all -> 0x0112 }
            if (r7 <= 0) goto L_0x0108
            com.mbridge.msdk.click.e$a r7 = r4.f4778f     // Catch:{ all -> 0x0112 }
            int r7 = r7.f4783e     // Catch:{ all -> 0x0112 }
            r8 = 3145728(0x300000, float:4.408104E-39)
            if (r7 >= r8) goto L_0x0108
            boolean r7 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0112 }
            if (r7 != 0) goto L_0x0108
            java.io.InputStream r7 = r1.getInputStream()     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = r4.m5458a(r7, r6)     // Catch:{ all -> 0x0104 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0104 }
            if (r7 != 0) goto L_0x0108
            byte[] r7 = r6.getBytes()     // Catch:{ all -> 0x0104 }
            int r0 = r7.length     // Catch:{ all -> 0x0104 }
            if (r0 <= 0) goto L_0x0108
            int r7 = r7.length     // Catch:{ all -> 0x0104 }
            if (r7 >= r8) goto L_0x0108
            com.mbridge.msdk.click.e$a r7 = r4.f4778f     // Catch:{ all -> 0x0104 }
            java.lang.String r6 = r6.trim()     // Catch:{ all -> 0x0104 }
            r7.f4785g = r6     // Catch:{ all -> 0x0104 }
            goto L_0x0108
        L_0x0104:
            r6 = move-exception
            r6.printStackTrace()     // Catch:{ all -> 0x0112 }
        L_0x0108:
            r4.f4775c = r5     // Catch:{ all -> 0x0112 }
            if (r1 == 0) goto L_0x010f
            r1.disconnect()
        L_0x010f:
            com.mbridge.msdk.click.e$a r5 = r4.f4778f
            return r5
        L_0x0112:
            r5 = move-exception
            r2 = r1
            goto L_0x0116
        L_0x0115:
            r5 = move-exception
        L_0x0116:
            com.mbridge.msdk.click.e$a r6 = r4.f4778f     // Catch:{ all -> 0x0126 }
            java.lang.String r5 = r5.getMessage()     // Catch:{ all -> 0x0126 }
            r6.f4786h = r5     // Catch:{ all -> 0x0126 }
            com.mbridge.msdk.click.e$a r5 = r4.f4778f     // Catch:{ all -> 0x0126 }
            if (r2 == 0) goto L_0x0125
            r2.disconnect()
        L_0x0125:
            return r5
        L_0x0126:
            r5 = move-exception
            if (r2 == 0) goto L_0x012c
            r2.disconnect()
        L_0x012c:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C2315e.mo15683a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx):com.mbridge.msdk.click.e$a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0045 A[SYNTHETIC, Splitter:B:23:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0054 A[SYNTHETIC, Splitter:B:30:0x0054] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m5458a(java.io.InputStream r4, boolean r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            if (r5 == 0) goto L_0x000e
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x002e }
            r5.<init>(r4)     // Catch:{ Exception -> 0x002e }
            r4 = r5
        L_0x000e:
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ Exception -> 0x002e }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x002e }
            r2.<init>(r4)     // Catch:{ Exception -> 0x002e }
            r5.<init>(r2)     // Catch:{ Exception -> 0x002e }
        L_0x0018:
            java.lang.String r4 = r5.readLine()     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            if (r4 == 0) goto L_0x0022
            r0.append(r4)     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            goto L_0x0018
        L_0x0022:
            r5.close()     // Catch:{ Exception -> 0x0049 }
            goto L_0x004d
        L_0x0026:
            r4 = move-exception
            r1 = r5
            goto L_0x0052
        L_0x0029:
            r4 = move-exception
            r1 = r5
            goto L_0x002f
        L_0x002c:
            r4 = move-exception
            goto L_0x0052
        L_0x002e:
            r4 = move-exception
        L_0x002f:
            com.mbridge.msdk.click.e$a r5 = r3.f4778f     // Catch:{ all -> 0x002c }
            if (r5 != 0) goto L_0x0040
            com.mbridge.msdk.click.e$a r5 = new com.mbridge.msdk.click.e$a     // Catch:{ all -> 0x002c }
            r5.<init>()     // Catch:{ all -> 0x002c }
            r3.f4778f = r5     // Catch:{ all -> 0x002c }
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x002c }
            r5.f4786h = r2     // Catch:{ all -> 0x002c }
        L_0x0040:
            r4.printStackTrace()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x004d
            r1.close()     // Catch:{ Exception -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r4 = move-exception
            r4.printStackTrace()
        L_0x004d:
            java.lang.String r4 = r0.toString()
            return r4
        L_0x0052:
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ Exception -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r5 = move-exception
            r5.printStackTrace()
        L_0x005c:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C2315e.m5458a(java.io.InputStream, boolean):java.lang.String");
    }
}
