package com.bytedance.sdk.component.p110d.p113c.p114a.p115a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.d.c.a.a.c */
/* compiled from: StrictLineReader */
class C2846c implements Closeable {

    /* renamed from: a */
    private final InputStream f6424a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Charset f6425b;

    /* renamed from: c */
    private byte[] f6426c;

    /* renamed from: d */
    private int f6427d;

    /* renamed from: e */
    private int f6428e;

    public C2846c(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public C2846c(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C2848d.f6430a)) {
            this.f6424a = inputStream;
            this.f6425b = charset;
            this.f6426c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public void close() throws IOException {
        synchronized (this.f6424a) {
            if (this.f6426c != null) {
                this.f6426c = null;
                this.f6424a.close();
            }
        }
    }

    /* renamed from: a */
    public String mo17653a() throws IOException {
        int i;
        int i2;
        synchronized (this.f6424a) {
            if (this.f6426c != null) {
                if (this.f6427d >= this.f6428e) {
                    m7880c();
                }
                for (int i3 = this.f6427d; i3 != this.f6428e; i3++) {
                    if (this.f6426c[i3] == 10) {
                        if (i3 != this.f6427d) {
                            i2 = i3 - 1;
                            if (this.f6426c[i2] == 13) {
                                String str = new String(this.f6426c, this.f6427d, i2 - this.f6427d, this.f6425b.name());
                                this.f6427d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f6426c, this.f6427d, i2 - this.f6427d, this.f6425b.name());
                        this.f6427d = i3 + 1;
                        return str2;
                    }
                }
                C28471 r1 = new ByteArrayOutputStream((this.f6428e - this.f6427d) + 80) {
                    public String toString() {
                        try {
                            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, C2846c.this.f6425b.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1:
                while (true) {
                    r1.write(this.f6426c, this.f6427d, this.f6428e - this.f6427d);
                    this.f6428e = -1;
                    m7880c();
                    i = this.f6427d;
                    while (true) {
                        if (i != this.f6428e) {
                            if (this.f6426c[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f6427d) {
                    r1.write(this.f6426c, this.f6427d, i - this.f6427d);
                }
                this.f6427d = i + 1;
                String byteArrayOutputStream = r1.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    /* renamed from: b */
    public boolean mo17654b() {
        return this.f6428e == -1;
    }

    /* renamed from: c */
    private void m7880c() throws IOException {
        InputStream inputStream = this.f6424a;
        byte[] bArr = this.f6426c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f6427d = 0;
            this.f6428e = read;
            return;
        }
        throw new EOFException();
    }
}
