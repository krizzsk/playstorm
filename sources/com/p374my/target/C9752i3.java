package com.p374my.target;

import android.content.Context;
import android.os.Build;
import com.google.common.net.HttpHeaders;
import java.net.HttpURLConnection;
import java.net.URI;

/* renamed from: com.my.target.i3 */
public class C9752i3 extends C9734h3<String> {

    /* renamed from: f */
    public int f24041f;

    /* renamed from: d */
    public static C9752i3 m28221d() {
        return new C9752i3();
    }

    /* renamed from: a */
    public final String mo64235a(HttpURLConnection httpURLConnection) {
        if (this.f24041f <= 10) {
            try {
                T uri = httpURLConnection.getURL().toURI().resolve(new URI(httpURLConnection.getHeaderField(HttpHeaders.LOCATION))).toString();
                boolean z = true;
                if (Build.VERSION.SDK_INT >= 28 && !C10082z8.m29923d(uri)) {
                    z = false;
                }
                if (!C10082z8.m29924e(uri) && z) {
                    return uri;
                }
                this.f23991d = uri;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64236a(java.lang.String r6, android.content.Context r7) {
        /*
            r5 = this;
            r5.f23991d = r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "send stat request: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.p374my.target.C9672e0.m27882a(r0)
            com.my.target.m3 r0 = com.p374my.target.C9840m3.m28662a((android.content.Context) r7)
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ all -> 0x008b }
            r3.<init>(r6)     // Catch:{ all -> 0x008b }
            java.net.URLConnection r6 = r3.openConnection()     // Catch:{ all -> 0x008b }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x008b }
            r3 = 10000(0x2710, float:1.4013E-41)
            r6.setReadTimeout(r3)     // Catch:{ all -> 0x0089 }
            r6.setConnectTimeout(r3)     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "GET"
            r6.setRequestMethod(r3)     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "http.agent"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch:{ all -> 0x0089 }
            r6.addRequestProperty(r3, r4)     // Catch:{ all -> 0x0089 }
            r6.setInstanceFollowRedirects(r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "connection"
            java.lang.String r4 = "close"
            r6.setRequestProperty(r3, r4)     // Catch:{ all -> 0x0089 }
            r0.mo64728b(r6)     // Catch:{ all -> 0x0089 }
            int r3 = r6.getResponseCode()     // Catch:{ all -> 0x0089 }
            r5.f23990c = r3     // Catch:{ all -> 0x0089 }
            java.io.InputStream r3 = r6.getInputStream()     // Catch:{ all -> 0x0089 }
            if (r3 == 0) goto L_0x005b
            r3.close()     // Catch:{ all -> 0x0089 }
        L_0x005b:
            int r3 = r5.f23990c     // Catch:{ all -> 0x0089 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == r4) goto L_0x0085
            r4 = 204(0xcc, float:2.86E-43)
            if (r3 == r4) goto L_0x0085
            r4 = 404(0x194, float:5.66E-43)
            if (r3 == r4) goto L_0x0085
            r4 = 403(0x193, float:5.65E-43)
            if (r3 != r4) goto L_0x006e
            goto L_0x0085
        L_0x006e:
            r0 = 302(0x12e, float:4.23E-43)
            if (r3 == r0) goto L_0x007a
            r0 = 301(0x12d, float:4.22E-43)
            if (r3 == r0) goto L_0x007a
            r0 = 303(0x12f, float:4.25E-43)
            if (r3 != r0) goto L_0x00ab
        L_0x007a:
            int r0 = r5.f24041f     // Catch:{ all -> 0x0089 }
            int r0 = r0 + 1
            r5.f24041f = r0     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r5.mo64235a(r6)     // Catch:{ all -> 0x0089 }
            goto L_0x00ab
        L_0x0085:
            r0.mo64726a((java.net.URLConnection) r6)     // Catch:{ all -> 0x0089 }
            goto L_0x00ab
        L_0x0089:
            r0 = move-exception
            goto L_0x008d
        L_0x008b:
            r0 = move-exception
            r6 = r2
        L_0x008d:
            r5.f23988a = r1
            java.lang.String r0 = r0.getMessage()
            r5.f23992e = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "stat request error: "
            r0.append(r1)
            java.lang.String r1 = r5.f23992e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p374my.target.C9672e0.m27882a(r0)
        L_0x00ab:
            if (r6 == 0) goto L_0x00b0
            r6.disconnect()
        L_0x00b0:
            if (r2 == 0) goto L_0x00c9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "redirected to: "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.p374my.target.C9672e0.m27882a(r6)
            r5.mo64236a(r2, r7)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9752i3.mo64236a(java.lang.String, android.content.Context):void");
    }

    /* renamed from: c */
    public String mo63942a(String str, String str2, Context context) {
        this.f24041f = 0;
        mo64236a(str, context);
        return (String) this.f23991d;
    }
}
