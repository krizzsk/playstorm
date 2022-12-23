package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.i */
public final class C4999i extends InputStream {

    /* renamed from: a */
    public final C4996g f13321a;

    /* renamed from: b */
    public final C5000j f13322b;

    /* renamed from: c */
    public final byte[] f13323c;

    /* renamed from: d */
    public boolean f13324d = false;

    /* renamed from: e */
    public boolean f13325e = false;

    /* renamed from: f */
    public long f13326f;

    public C4999i(C4996g gVar, C5000j jVar) {
        this.f13321a = gVar;
        this.f13322b = jVar;
        this.f13323c = new byte[1];
    }

    public void close() throws IOException {
        if (!this.f13325e) {
            this.f13321a.close();
            this.f13325e = true;
        }
    }

    public int read() throws IOException {
        if (read(this.f13323c) == -1) {
            return -1;
        }
        return this.f13323c[0] & 255;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C5023a.m15304b(!this.f13325e);
        if (!this.f13324d) {
            this.f13321a.mo24831a(this.f13322b);
            this.f13324d = true;
        }
        int a = this.f13321a.mo24830a(bArr, i, i2);
        if (a == -1) {
            return -1;
        }
        this.f13326f += (long) a;
        return a;
    }
}
