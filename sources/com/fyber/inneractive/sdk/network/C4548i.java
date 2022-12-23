package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.i */
public class C4548i extends C4546h implements C4544g {

    /* renamed from: com.fyber.inneractive.sdk.network.i$a */
    public static class C4549a extends C4551j {

        /* renamed from: f */
        public final HttpURLConnection f11241f;

        public C4549a(HttpURLConnection httpURLConnection, int i, InputStream inputStream, Map<String, List<String>> map, String str) {
            this.f11241f = httpURLConnection;
            mo24757a(i);
            mo24758a(inputStream);
            mo24760a(map);
            mo24759a(str);
        }

        /* renamed from: a */
        public void mo24755a() throws IOException {
            try {
                HttpURLConnection httpURLConnection = this.f11241f;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
            InputStream inputStream = this.f11245c;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: a */
    public <T> C4551j mo24748a(C4532b0<T> b0Var, String str, String str2) throws Exception {
        InputStream inputStream;
        IAlog.m16699a("%s hurl network stack is in use", "HttpExecutorImpl");
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(b0Var.mo24715a()).openConnection();
            C4566o0 i = b0Var.mo24725i();
            httpURLConnection.setConnectTimeout(i.f11333a);
            httpURLConnection.setReadTimeout(i.f11334b);
            mo24753a(httpURLConnection, "User-Agent", str);
            mo24753a(httpURLConnection, HttpHeaders.IF_MODIFIED_SINCE, str2);
            mo24753a(httpURLConnection, HttpHeaders.ACCEPT_ENCODING, "gzip");
            mo24752a(httpURLConnection, b0Var);
            if (b0Var.mo24730n() != C4586y.f11396b) {
                if (b0Var.mo24730n() != C4586y.PUT) {
                    httpURLConnection.connect();
                    inputStream = mo24751a(httpURLConnection.getInputStream(), TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
                    C4551j a = mo24750a(inputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField(HttpHeaders.LAST_MODIFIED));
                    return new C4549a(httpURLConnection, a.f11243a, a.f11245c, a.f11246d, a.f11247e);
                }
            }
            mo24754b(httpURLConnection, b0Var);
            try {
                inputStream = mo24751a(httpURLConnection.getInputStream(), TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
            } catch (Exception unused) {
                inputStream = null;
            }
            try {
                C4551j a2 = mo24750a(inputStream, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField(HttpHeaders.LAST_MODIFIED));
                return new C4549a(httpURLConnection, a2.f11243a, a2.f11245c, a2.f11246d, a2.f11247e);
            } catch (IOException e) {
                IAlog.m16698a("failed reading network response", e, new Object[0]);
                throw new C4573q0(e);
            }
        } catch (MalformedURLException e2) {
            IAlog.m16698a("failed creating request URL", e2, new Object[0]);
            throw e2;
        } catch (Exception e3) {
            IAlog.m16698a("failed executing network request", e3, new Object[0]);
            throw new C4531b((Throwable) e3);
        }
    }

    /* renamed from: b */
    public void mo24749b() {
    }

    /* renamed from: b */
    public final void mo24754b(HttpURLConnection httpURLConnection, C4532b0 b0Var) throws Exception {
        httpURLConnection.setRequestMethod(b0Var.mo24730n().f11400a);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] k = b0Var.mo24727k();
        int length = k != null ? k.length : 0;
        httpURLConnection.setRequestProperty("Content-Length", "" + length);
        httpURLConnection.setRequestProperty("Content-Type", b0Var.mo24729m());
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(k);
        try {
            outputStream.close();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final <T> void mo24752a(HttpURLConnection httpURLConnection, C4532b0<T> b0Var) {
        Map<String, String> q = b0Var.mo24732q();
        if (q != null) {
            for (String next : q.keySet()) {
                mo24753a(httpURLConnection, next, q.get(next));
            }
        }
    }

    /* renamed from: a */
    public final void mo24753a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (httpURLConnection != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            int i = IAlog.f14137a;
            IAlog.m16697a(1, (Exception) null, "%s %s : %s", "REQUEST_HEADER", str, str2);
            httpURLConnection.addRequestProperty(str, str2);
        }
    }
}
