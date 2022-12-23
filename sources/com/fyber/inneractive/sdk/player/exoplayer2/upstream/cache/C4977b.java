package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4994f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4974a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5040o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5049u;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b */
public final class C4977b implements C4994f {

    /* renamed from: a */
    public final C4974a f13247a;

    /* renamed from: b */
    public final long f13248b;

    /* renamed from: c */
    public final int f13249c;

    /* renamed from: d */
    public C5000j f13250d;

    /* renamed from: e */
    public File f13251e;

    /* renamed from: f */
    public OutputStream f13252f;

    /* renamed from: g */
    public FileOutputStream f13253g;

    /* renamed from: h */
    public long f13254h;

    /* renamed from: i */
    public long f13255i;

    /* renamed from: j */
    public C5040o f13256j;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b$a */
    public static class C4978a extends C4974a.C4975a {
        public C4978a(IOException iOException) {
            super(iOException);
        }
    }

    public C4977b(C4974a aVar, long j, int i) {
        this.f13247a = (C4974a) C5023a.m15300a(aVar);
        this.f13248b = j;
        this.f13249c = i;
    }

    /* renamed from: a */
    public void mo25524a(C5000j jVar) throws C4978a {
        if (jVar.f13331e != -1 || jVar.mo25553a(2)) {
            this.f13250d = jVar;
            this.f13255i = 0;
            try {
                mo25526b();
            } catch (IOException e) {
                throw new C4978a(e);
            }
        } else {
            this.f13250d = null;
        }
    }

    /* renamed from: b */
    public final void mo25526b() throws IOException {
        long j;
        long j2 = this.f13250d.f13331e;
        if (j2 == -1) {
            j = this.f13248b;
        } else {
            j = Math.min(j2 - this.f13255i, this.f13248b);
        }
        long j3 = j;
        C4974a aVar = this.f13247a;
        C5000j jVar = this.f13250d;
        this.f13251e = aVar.mo25513a(jVar.f13332f, this.f13255i + jVar.f13329c, j3);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f13251e);
        this.f13253g = fileOutputStream;
        if (this.f13249c > 0) {
            C5040o oVar = this.f13256j;
            if (oVar == null) {
                this.f13256j = new C5040o(this.f13253g, this.f13249c);
            } else {
                oVar.mo25627a(fileOutputStream);
            }
            this.f13252f = this.f13256j;
        } else {
            this.f13252f = fileOutputStream;
        }
        this.f13254h = 0;
    }

    public void close() throws C4978a {
        if (this.f13250d != null) {
            try {
                mo25523a();
            } catch (IOException e) {
                throw new C4978a(e);
            }
        }
    }

    /* renamed from: a */
    public void mo25525a(byte[] bArr, int i, int i2) throws C4978a {
        if (this.f13250d != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f13254h == this.f13248b) {
                        mo25523a();
                        mo25526b();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f13248b - this.f13254h);
                    this.f13252f.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f13254h += j;
                    this.f13255i += j;
                } catch (IOException e) {
                    throw new C4978a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo25523a() throws IOException {
        OutputStream outputStream = this.f13252f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f13253g.getFD().sync();
                C5049u.m15391a((Closeable) this.f13252f);
                this.f13252f = null;
                File file = this.f13251e;
                this.f13251e = null;
                this.f13247a.mo25515a(file);
            } catch (Throwable th) {
                C5049u.m15391a((Closeable) this.f13252f);
                this.f13252f = null;
                File file2 = this.f13251e;
                this.f13251e = null;
                file2.delete();
                throw th;
            }
        }
    }
}
