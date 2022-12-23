package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0817e0;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.model.Advertisement;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import p398ms.p399bd.p400o.Pgl.C12379c;

/* renamed from: com.adcolony.sdk.s */
class C0951s implements Runnable {

    /* renamed from: a */
    private HttpURLConnection f724a;

    /* renamed from: b */
    private InputStream f725b;

    /* renamed from: c */
    private C0841h0 f726c;

    /* renamed from: d */
    private C0952a f727d;

    /* renamed from: e */
    private C0824g f728e = null;

    /* renamed from: f */
    private String f729f;

    /* renamed from: g */
    private int f730g = 0;

    /* renamed from: h */
    private boolean f731h = false;

    /* renamed from: i */
    private Map<String, List<String>> f732i;

    /* renamed from: j */
    private String f733j = "";

    /* renamed from: k */
    private String f734k = "";

    /* renamed from: l */
    String f735l = "";

    /* renamed from: m */
    String f736m = "";

    /* renamed from: n */
    boolean f737n;

    /* renamed from: o */
    int f738o;

    /* renamed from: p */
    int f739p;

    /* renamed from: com.adcolony.sdk.s$a */
    interface C0952a {
        /* renamed from: a */
        void mo10863a(C0951s sVar, C0841h0 h0Var, Map<String, List<String>> map);
    }

    C0951s(C0841h0 h0Var, C0952a aVar) {
        this.f726c = h0Var;
        this.f727d = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        r1 = "UTF-8";
        r2 = r7.f729f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r2 == null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r2.isEmpty() != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r1 = r7.f729f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if ((r9 instanceof java.io.ByteArrayOutputStream) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        r2 = r7.f724a.getHeaderField("Content-Type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r7.f728e == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        if (r2 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r2.contains("application/octet-stream") == false) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0087, code lost:
        if (((java.io.ByteArrayOutputStream) r9).size() == 0) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        r7.f736m = r7.f728e.mo10754b(((java.io.ByteArrayOutputStream) r9).toByteArray());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        r7.f736m = ((java.io.ByteArrayOutputStream) r9).toString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        if (r9 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ac, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m948a(java.io.InputStream r8, java.io.OutputStream r9) throws java.lang.Exception {
        /*
            r7 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00ba }
            r0.<init>(r8)     // Catch:{ all -> 0x00ba }
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x00b0 }
        L_0x0009:
            r3 = 0
            int r4 = r0.read(r2, r3, r1)     // Catch:{ all -> 0x00b0 }
            r5 = -1
            if (r4 == r5) goto L_0x0058
            int r5 = r7.f738o     // Catch:{ all -> 0x00b0 }
            int r5 = r5 + r4
            r7.f738o = r5     // Catch:{ all -> 0x00b0 }
            boolean r6 = r7.f731h     // Catch:{ all -> 0x00b0 }
            if (r6 == 0) goto L_0x0054
            int r6 = r7.f730g     // Catch:{ all -> 0x00b0 }
            if (r5 > r6) goto L_0x001f
            goto L_0x0054
        L_0x001f:
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r2.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "Data exceeds expected maximum ("
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            int r3 = r7.f738o     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            int r3 = r7.f730g     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "): "
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.net.HttpURLConnection r3 = r7.f724a     // Catch:{ all -> 0x00b0 }
            java.net.URL r3 = r3.getURL()     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b0 }
            r2.append(r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00b0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b0 }
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x0054:
            r9.write(r2, r3, r4)     // Catch:{ all -> 0x00b0 }
            goto L_0x0009
        L_0x0058:
            java.lang.String r1 = "UTF-8"
            java.lang.String r2 = r7.f729f     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0066
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b0 }
            if (r2 != 0) goto L_0x0066
            java.lang.String r1 = r7.f729f     // Catch:{ all -> 0x00b0 }
        L_0x0066:
            boolean r2 = r9 instanceof java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00a2
            java.net.HttpURLConnection r2 = r7.f724a     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r2 = r2.getHeaderField(r3)     // Catch:{ all -> 0x00b0 }
            com.adcolony.sdk.g r3 = r7.f728e     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x0099
            if (r2 == 0) goto L_0x0099
            java.lang.String r3 = "application/octet-stream"
            boolean r2 = r2.contains(r3)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0099
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            int r2 = r2.size()     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x0099
            com.adcolony.sdk.g r1 = r7.f728e     // Catch:{ all -> 0x00b0 }
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            byte[] r2 = r2.toByteArray()     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r1.mo10754b(r2)     // Catch:{ all -> 0x00b0 }
            r7.f736m = r1     // Catch:{ all -> 0x00b0 }
            goto L_0x00a2
        L_0x0099:
            r2 = r9
            java.io.ByteArrayOutputStream r2 = (java.io.ByteArrayOutputStream) r2     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r2.toString(r1)     // Catch:{ all -> 0x00b0 }
            r7.f736m = r1     // Catch:{ all -> 0x00b0 }
        L_0x00a2:
            r0.close()     // Catch:{ all -> 0x00ba }
            if (r9 == 0) goto L_0x00aa
            r9.close()
        L_0x00aa:
            if (r8 == 0) goto L_0x00af
            r8.close()
        L_0x00af:
            return
        L_0x00b0:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00ba }
        L_0x00b9:
            throw r1     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            if (r9 == 0) goto L_0x00c0
            r9.close()
        L_0x00c0:
            if (r8 == 0) goto L_0x00c5
            r8.close()
        L_0x00c5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0951s.m948a(java.io.InputStream, java.io.OutputStream):void");
    }

    /* renamed from: c */
    private boolean m950c() throws IOException {
        C0823f1 a = this.f726c.mo10772a();
        String h = C0764c0.m336h(a, FirebaseAnalytics.Param.CONTENT_TYPE);
        String h2 = C0764c0.m336h(a, "content");
        C0823f1 n = a.mo10745n("dictionaries");
        C0823f1 n2 = a.mo10745n("dictionaries_mapping");
        this.f735l = C0764c0.m336h(a, "url");
        if (n != null) {
            C0824g.m522a(n.mo10736f());
        }
        if (C0714a.m136b().mo10808H() && n2 != null) {
            this.f728e = C0824g.m520a(C0764c0.m337i(n2, "request"), C0764c0.m337i(n2, "response"));
        }
        String h3 = C0764c0.m336h(a, "user_agent");
        int a2 = C0764c0.m306a(a, "read_timeout", 60000);
        int a3 = C0764c0.m306a(a, "connect_timeout", 60000);
        boolean b = C0764c0.m325b(a, "no_redirect");
        this.f735l = C0764c0.m336h(a, "url");
        this.f733j = C0764c0.m336h(a, "filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(C0714a.m136b().mo10855z().mo11095d());
        String str = this.f733j;
        sb.append(str.substring(str.lastIndexOf("/") + 1));
        this.f734k = sb.toString();
        this.f729f = C0764c0.m336h(a, "encoding");
        int a4 = C0764c0.m306a(a, "max_size", 0);
        this.f730g = a4;
        this.f731h = a4 != 0;
        this.f738o = 0;
        this.f725b = null;
        this.f724a = null;
        this.f732i = null;
        if (!this.f735l.startsWith(Advertisement.FILE_SCHEME)) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f735l).openConnection();
            this.f724a = httpURLConnection;
            httpURLConnection.setReadTimeout(a2);
            this.f724a.setConnectTimeout(a3);
            this.f724a.setInstanceFollowRedirects(!b);
            if (h3 != null && !h3.equals("")) {
                this.f724a.setRequestProperty("User-Agent", h3);
            }
            if (this.f728e != null) {
                this.f724a.setRequestProperty("Content-Type", "application/octet-stream");
                this.f724a.setRequestProperty("Req-Dict-Id", this.f728e.mo10753b());
                this.f724a.setRequestProperty("Resp-Dict-Id", this.f728e.mo10755c());
            } else {
                this.f724a.setRequestProperty(HttpHeaders.ACCEPT_CHARSET, C0840h.f478a.name());
                if (!h.equals("")) {
                    this.f724a.setRequestProperty("Content-Type", h);
                }
            }
            if (this.f726c.mo10774b().equals("WebServices.post")) {
                this.f724a.setDoOutput(true);
                C0824g gVar = this.f728e;
                if (gVar != null) {
                    byte[] a5 = gVar.mo10751a(h2);
                    this.f724a.setFixedLengthStreamingMode(a5.length);
                    this.f724a.getOutputStream().write(a5);
                    this.f724a.getOutputStream().flush();
                } else {
                    this.f724a.setFixedLengthStreamingMode(h2.getBytes(C0840h.f478a).length);
                    new PrintStream(this.f724a.getOutputStream()).print(h2);
                }
            }
        } else if (this.f735l.startsWith("file:///android_asset/")) {
            Context a6 = C0714a.m129a();
            if (a6 != null) {
                this.f725b = a6.getAssets().open(this.f735l.substring(22));
            }
        } else {
            this.f725b = new FileInputStream(this.f735l.substring(7));
        }
        if (this.f724a == null && this.f725b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m951d() throws Exception {
        OutputStream outputStream;
        InputStream inputStream;
        String b = this.f726c.mo10774b();
        if (this.f725b != null) {
            outputStream = this.f733j.length() == 0 ? new ByteArrayOutputStream(4096) : new FileOutputStream(new File(this.f733j).getAbsolutePath());
        } else if (b.equals("WebServices.download")) {
            this.f725b = this.f724a.getInputStream();
            outputStream = new FileOutputStream(this.f734k);
        } else if (b.equals("WebServices.get")) {
            this.f725b = this.f724a.getInputStream();
            outputStream = new ByteArrayOutputStream(4096);
        } else if (b.equals("WebServices.post")) {
            this.f724a.connect();
            if (this.f724a.getResponseCode() < 200 || this.f724a.getResponseCode() > 299) {
                inputStream = this.f724a.getErrorStream();
            } else {
                inputStream = this.f724a.getInputStream();
            }
            this.f725b = inputStream;
            outputStream = new ByteArrayOutputStream(4096);
        } else {
            outputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f724a;
        if (httpURLConnection != null) {
            this.f739p = httpURLConnection.getResponseCode();
            this.f732i = this.f724a.getHeaderFields();
        }
        m948a(this.f725b, outputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0841h0 mo11024b() {
        return this.f726c;
    }

    public void run() {
        boolean z;
        boolean z2 = false;
        this.f737n = false;
        try {
            if (m950c()) {
                m951d();
                if (this.f726c.mo10774b().equals("WebServices.post")) {
                    if (this.f739p != 200) {
                        z = false;
                        this.f737n = z;
                    }
                }
                z = true;
                this.f737n = z;
            }
        } catch (MalformedURLException e) {
            new C0817e0.C0818a().mo10684a("MalformedURLException: ").mo10684a(e.toString()).mo10685a(C0817e0.f434i);
            this.f737n = true;
        } catch (OutOfMemoryError unused) {
            new C0817e0.C0818a().mo10684a("Out of memory error - disabling AdColony. (").mo10682a(this.f738o).mo10684a("/").mo10682a(this.f730g).mo10684a("): " + this.f735l).mo10685a(C0817e0.f433h);
            C0714a.m136b().mo10826b(true);
        } catch (IOException e2) {
            new C0817e0.C0818a().mo10684a("Download of ").mo10684a(this.f735l).mo10684a(" failed: ").mo10684a(e2.toString()).mo10685a(C0817e0.f432g);
            int i = this.f739p;
            if (i == 0) {
                i = C12379c.COLLECT_MODE_TIKTOK_GUEST;
            }
            this.f739p = i;
        } catch (IllegalStateException e3) {
            new C0817e0.C0818a().mo10684a("okhttp error: ").mo10684a(e3.toString()).mo10685a(C0817e0.f433h);
            e3.printStackTrace();
        } catch (DataFormatException e4) {
            new C0817e0.C0818a().mo10684a("Exception, possibly trying to decompress plain response: ").mo10684a(e4.toString()).mo10685a(C0817e0.f434i);
            e4.printStackTrace();
        } catch (IllegalArgumentException e5) {
            new C0817e0.C0818a().mo10684a("Exception, possibly response encoded with different dictionary: ").mo10684a(e5.toString()).mo10685a(C0817e0.f434i);
            e5.printStackTrace();
        } catch (AssertionError e6) {
            new C0817e0.C0818a().mo10684a("okhttp error: ").mo10684a(e6.toString()).mo10685a(C0817e0.f433h);
            e6.printStackTrace();
        } catch (Exception e7) {
            new C0817e0.C0818a().mo10684a("Exception: ").mo10684a(e7.toString()).mo10685a(C0817e0.f433h);
            e7.printStackTrace();
        }
        z2 = true;
        if (z2) {
            if (this.f726c.mo10774b().equals("WebServices.download")) {
                m949a(this.f734k, this.f733j);
            }
            this.f727d.mo10863a(this, this.f726c, this.f732i);
        }
    }

    /* renamed from: a */
    private void m949a(String str, String str2) {
        try {
            String substring = str2.substring(0, str2.lastIndexOf("/") + 1);
            if (!str2.equals("") && !substring.equals(C0714a.m136b().mo10855z().mo11095d()) && !new File(str).renameTo(new File(str2))) {
                new C0817e0.C0818a().mo10684a("Moving of ").mo10684a(str).mo10684a(" failed.").mo10685a(C0817e0.f432g);
            }
        } catch (Exception e) {
            new C0817e0.C0818a().mo10684a("Exception: ").mo10684a(e.toString()).mo10685a(C0817e0.f433h);
            e.printStackTrace();
        }
    }
}
