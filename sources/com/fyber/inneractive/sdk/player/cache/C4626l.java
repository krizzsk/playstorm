package com.fyber.inneractive.sdk.player.cache;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.cache.l */
public class C4626l implements Closeable {

    /* renamed from: a */
    public final InputStream f11527a;

    /* renamed from: b */
    public final Charset f11528b;

    /* renamed from: c */
    public byte[] f11529c;

    /* renamed from: d */
    public int f11530d;

    /* renamed from: e */
    public int f11531e;

    /* renamed from: com.fyber.inneractive.sdk.player.cache.l$a */
    public class C4627a extends ByteArrayOutputStream {
        public C4627a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            if (i > 0) {
                int i2 = i - 1;
                if (this.buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(this.buf, 0, i, C4626l.this.f11528b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C4626l(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C4628m.f11533a)) {
            this.f11527a = inputStream;
            this.f11528b = charset;
            this.f11529c = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public final void mo24849a() throws IOException {
        InputStream inputStream = this.f11527a;
        byte[] bArr = this.f11529c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f11530d = 0;
            this.f11531e = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public String mo24850b() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f11527a) {
            if (this.f11529c != null) {
                if (this.f11530d >= this.f11531e) {
                    mo24849a();
                }
                for (int i3 = this.f11530d; i3 != this.f11531e; i3++) {
                    byte[] bArr2 = this.f11529c;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f11530d;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                String str = new String(bArr2, i4, i2 - i4, this.f11528b.name());
                                this.f11530d = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(bArr2, i4, i2 - i4, this.f11528b.name());
                        this.f11530d = i3 + 1;
                        return str2;
                    }
                }
                C4627a aVar = new C4627a((this.f11531e - this.f11530d) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f11529c;
                    int i5 = this.f11530d;
                    aVar.write(bArr3, i5, this.f11531e - i5);
                    this.f11531e = -1;
                    mo24849a();
                    i = this.f11530d;
                    while (true) {
                        if (i != this.f11531e) {
                            bArr = this.f11529c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f11530d;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f11530d = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() throws IOException {
        synchronized (this.f11527a) {
            if (this.f11529c != null) {
                this.f11529c = null;
                this.f11527a.close();
            }
        }
    }
}
