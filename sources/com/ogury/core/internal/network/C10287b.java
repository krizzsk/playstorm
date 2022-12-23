package com.ogury.core.internal.network;

import com.ogury.core.internal.C10204a;
import com.ogury.core.internal.C10219ai;
import com.ogury.core.internal.C10233au;
import com.ogury.core.internal.network.OguryNetworkResponse;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: com.ogury.core.internal.network.b */
/* compiled from: NetworkCall.kt */
public final class C10287b implements Call {

    /* renamed from: a */
    private final NetworkRequest f26084a;

    /* renamed from: b */
    private final int f26085b;

    /* renamed from: c */
    private final int f26086c;

    public C10287b(NetworkRequest networkRequest, int i, int i2) {
        C10219ai.m31036b(networkRequest, "request");
        this.f26084a = networkRequest;
        this.f26085b = i;
        this.f26086c = i2;
    }

    public final OguryNetworkResponse execute() {
        OguryNetworkResponse.Success success;
        byte[] bArr;
        try {
            URLConnection openConnection = new URL(this.f26084a.getUrl()).openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.setReadTimeout(this.f26085b);
                httpURLConnection.setConnectTimeout(this.f26086c);
                httpURLConnection.setRequestMethod(this.f26084a.getMethod());
                boolean z = true;
                httpURLConnection.setDoOutput(this.f26084a.getBody().length() > 0);
                m31133a(httpURLConnection);
                if (this.f26084a.getBody().length() > 0) {
                    if (C10285a.m31131a(this.f26084a.getHeaders())) {
                        bArr = C10204a.m31008a(this.f26084a.getBody());
                    } else {
                        String body = this.f26084a.getBody();
                        Charset charset = C10233au.f26004a;
                        if (body != null) {
                            bArr = body.getBytes(charset);
                            C10219ai.m31034a((Object) bArr, "(this as java.lang.String).getBytes(charset)");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(bArr);
                    if (outputStream != null) {
                        CloseableUtilKt.closeSafely(outputStream);
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    z = false;
                }
                if (!z) {
                    return new OguryNetworkResponse.Failure(new OguryNetworkException(responseCode));
                }
                if (httpURLConnection.getContentLength() == 0) {
                    success = new OguryNetworkResponse.Success("");
                } else {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    C10219ai.m31034a((Object) inputStream, "inputStream");
                    C10219ai.m31036b(inputStream, "$this$readBytes");
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
                    C10204a.m31003a(inputStream, (OutputStream) byteArrayOutputStream, 0, 2);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    C10219ai.m31034a((Object) byteArray, "buffer.toByteArray()");
                    inputStream.close();
                    if (C10285a.m31132a(httpURLConnection)) {
                        success = new OguryNetworkResponse.Success(C10204a.m31007a(byteArray));
                    } else {
                        success = new OguryNetworkResponse.Success(new String(byteArray, C10233au.f26004a));
                    }
                }
                return success;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Exception e) {
            return new OguryNetworkResponse.Failure(e);
        } catch (Throwable th) {
            if (0 != 0) {
                CloseableUtilKt.closeSafely((Closeable) null);
            }
            throw th;
        }
    }

    /* renamed from: a */
    private final void m31133a(HttpURLConnection httpURLConnection) {
        for (Map.Entry next : this.f26084a.getHeaders().loadHeaders().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }
}
