package com.bytedance.sdk.component.p104b.p105a.p106a.p107a;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: com.bytedance.sdk.component.b.a.a.a.e */
/* compiled from: NetInputStram */
public class C2791e extends InputStream {

    /* renamed from: a */
    InputStream f6279a;

    /* renamed from: b */
    HttpURLConnection f6280b;

    public C2791e(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.f6279a = inputStream;
        this.f6280b = httpURLConnection;
    }

    public int read() throws IOException {
        InputStream inputStream = this.f6279a;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.f6279a;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.f6279a;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return 0;
    }

    public long skip(long j) throws IOException {
        InputStream inputStream = this.f6279a;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0;
    }

    public int available() throws IOException {
        InputStream inputStream = this.f6279a;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    public void close() throws IOException {
        InputStream inputStream = this.f6279a;
        if (inputStream != null) {
            inputStream.close();
            this.f6279a = null;
        }
        HttpURLConnection httpURLConnection = this.f6280b;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f6280b = null;
        }
    }

    public synchronized void mark(int i) {
        if (this.f6279a != null) {
            this.f6279a.mark(i);
        }
    }

    public void reset() throws IOException {
        InputStream inputStream = this.f6279a;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    public boolean markSupported() {
        InputStream inputStream = this.f6279a;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }
}
