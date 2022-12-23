package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4994f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4996g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4998h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5000j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C5022z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C4974a;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d */
public final class C4980d implements C4996g {

    /* renamed from: a */
    public final C4974a f13259a;

    /* renamed from: b */
    public final C4996g f13260b;

    /* renamed from: c */
    public final C4996g f13261c;

    /* renamed from: d */
    public final C4996g f13262d;

    /* renamed from: e */
    public final C4981a f13263e;

    /* renamed from: f */
    public final boolean f13264f;

    /* renamed from: g */
    public final boolean f13265g;

    /* renamed from: h */
    public final boolean f13266h;

    /* renamed from: i */
    public C4996g f13267i;

    /* renamed from: j */
    public boolean f13268j;

    /* renamed from: k */
    public Uri f13269k;

    /* renamed from: l */
    public int f13270l;

    /* renamed from: m */
    public String f13271m;

    /* renamed from: n */
    public long f13272n;

    /* renamed from: o */
    public long f13273o;

    /* renamed from: p */
    public C4984g f13274p;

    /* renamed from: q */
    public boolean f13275q;

    /* renamed from: r */
    public boolean f13276r;

    /* renamed from: s */
    public long f13277s;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d$a */
    public interface C4981a {
        /* renamed from: a */
        void mo25531a(long j, long j2);
    }

    public C4980d(C4974a aVar, C4996g gVar, C4996g gVar2, C4994f fVar, int i, C4981a aVar2) {
        this.f13259a = aVar;
        this.f13260b = gVar2;
        boolean z = false;
        this.f13264f = (i & 1) != 0;
        this.f13265g = (i & 2) != 0;
        this.f13266h = (i & 4) != 0 ? true : z;
        this.f13262d = gVar;
        if (fVar != null) {
            this.f13261c = new C5022z(gVar, fVar);
        } else {
            this.f13261c = null;
        }
        this.f13263e = aVar2;
    }

    /* renamed from: a */
    public long mo24831a(C5000j jVar) throws IOException {
        try {
            Uri uri = jVar.f13327a;
            this.f13269k = uri;
            this.f13270l = jVar.f13333g;
            String str = jVar.f13332f;
            if (str == null) {
                str = uri.toString();
            }
            this.f13271m = str;
            this.f13272n = jVar.f13330d;
            boolean z = (this.f13265g && this.f13275q) || (jVar.f13331e == -1 && this.f13266h);
            this.f13276r = z;
            long j = jVar.f13331e;
            if (j == -1) {
                if (!z) {
                    long a = this.f13259a.mo25512a(str);
                    this.f13273o = a;
                    if (a != -1) {
                        long j2 = a - jVar.f13330d;
                        this.f13273o = j2;
                        if (j2 <= 0) {
                            throw new C4998h(0);
                        }
                    }
                    mo25529a(true);
                    return this.f13273o;
                }
            }
            this.f13273o = j;
            mo25529a(true);
            return this.f13273o;
        } catch (IOException e) {
            mo25528a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo25530b() throws IOException {
        C4996g gVar = this.f13267i;
        if (gVar != null) {
            try {
                gVar.close();
                this.f13267i = null;
                this.f13268j = false;
            } finally {
                C4984g gVar2 = this.f13274p;
                if (gVar2 != null) {
                    this.f13259a.mo25518b(gVar2);
                    this.f13274p = null;
                }
            }
        }
    }

    public void close() throws IOException {
        this.f13269k = null;
        C4981a aVar = this.f13263e;
        if (aVar != null && this.f13277s > 0) {
            aVar.mo25531a(this.f13259a.mo25511a(), this.f13277s);
            this.f13277s = 0;
        }
        try {
            mo25530b();
        } catch (IOException e) {
            mo25528a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public int mo24830a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f13273o == 0) {
            return -1;
        }
        try {
            int a = this.f13267i.mo24830a(bArr, i, i2);
            if (a >= 0) {
                if (this.f13267i == this.f13260b) {
                    this.f13277s += (long) a;
                }
                long j = (long) a;
                this.f13272n += j;
                long j2 = this.f13273o;
                if (j2 != -1) {
                    this.f13273o = j2 - j;
                }
            } else {
                if (this.f13268j) {
                    long j3 = this.f13272n;
                    if (this.f13267i == this.f13261c) {
                        this.f13259a.mo25516a(this.f13271m, j3);
                    }
                    this.f13273o = 0;
                }
                mo25530b();
                long j4 = this.f13273o;
                if ((j4 > 0 || j4 == -1) && mo25529a(false)) {
                    return mo24830a(bArr, i, i2);
                }
            }
            return a;
        } catch (IOException e) {
            mo25528a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public Uri mo24832a() {
        C4996g gVar = this.f13267i;
        return gVar == this.f13262d ? gVar.mo24832a() : this.f13269k;
    }

    /* renamed from: a */
    public final boolean mo25529a(boolean z) throws IOException {
        C4984g gVar;
        C5000j jVar;
        IOException iOException = null;
        if (this.f13276r) {
            gVar = null;
        } else if (this.f13264f) {
            try {
                gVar = this.f13259a.mo25517b(this.f13271m, this.f13272n);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            gVar = this.f13259a.mo25519c(this.f13271m, this.f13272n);
        }
        boolean z2 = true;
        if (gVar == null) {
            this.f13267i = this.f13262d;
            Uri uri = this.f13269k;
            long j = this.f13272n;
            jVar = new C5000j(uri, (byte[]) null, j, j, this.f13273o, this.f13271m, this.f13270l);
        } else if (gVar.f13285d) {
            Uri fromFile = Uri.fromFile(gVar.f13286e);
            long j2 = this.f13272n - gVar.f13283b;
            long j3 = gVar.f13284c - j2;
            long j4 = this.f13273o;
            if (j4 != -1) {
                j3 = Math.min(j3, j4);
            }
            C5000j jVar2 = new C5000j(fromFile, (byte[]) null, this.f13272n, j2, j3, this.f13271m, this.f13270l);
            this.f13267i = this.f13260b;
            jVar = jVar2;
        } else {
            long j5 = gVar.f13284c;
            if (j5 == -1) {
                j5 = this.f13273o;
            } else {
                long j6 = this.f13273o;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
            }
            Uri uri2 = this.f13269k;
            long j7 = this.f13272n;
            jVar = new C5000j(uri2, (byte[]) null, j7, j7, j5, this.f13271m, this.f13270l);
            C4996g gVar2 = this.f13261c;
            if (gVar2 != null) {
                this.f13267i = gVar2;
                this.f13274p = gVar;
            } else {
                this.f13267i = this.f13262d;
                this.f13259a.mo25518b(gVar);
            }
        }
        this.f13268j = jVar.f13331e == -1;
        long j8 = 0;
        try {
            j8 = this.f13267i.mo24831a(jVar);
        } catch (IOException e) {
            if (!z && this.f13268j) {
                Throwable th = e;
                while (true) {
                    if (th != null) {
                        if ((th instanceof C4998h) && ((C4998h) th).f13320a == 0) {
                            break;
                        }
                        th = th.getCause();
                    } else {
                        break;
                    }
                }
            }
            iOException = e;
            if (iOException == null) {
                z2 = false;
            } else {
                throw iOException;
            }
        }
        if (this.f13268j && j8 != -1) {
            this.f13273o = j8;
            long j9 = jVar.f13330d + j8;
            if (this.f13267i == this.f13261c) {
                this.f13259a.mo25516a(this.f13271m, j9);
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final void mo25528a(IOException iOException) {
        if (this.f13267i == this.f13260b || (iOException instanceof C4974a.C4975a)) {
            this.f13275q = true;
        }
    }
}
