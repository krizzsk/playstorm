package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.c */
public final class C4972c implements C4996g {

    /* renamed from: a */
    public final AssetManager f13241a;

    /* renamed from: b */
    public final C4970a0<? super C4972c> f13242b;

    /* renamed from: c */
    public Uri f13243c;

    /* renamed from: d */
    public InputStream f13244d;

    /* renamed from: e */
    public long f13245e;

    /* renamed from: f */
    public boolean f13246f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.c$a */
    public static final class C4973a extends IOException {
        public C4973a(IOException iOException) {
            super(iOException);
        }
    }

    public C4972c(Context context, C4970a0<? super C4972c> a0Var) {
        this.f13241a = context.getAssets();
        this.f13242b = a0Var;
    }

    /* renamed from: a */
    public long mo24831a(C5000j jVar) throws C4973a {
        try {
            Uri uri = jVar.f13327a;
            this.f13243c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f13241a.open(path, 1);
            this.f13244d = open;
            if (open.skip(jVar.f13330d) >= jVar.f13330d) {
                long j = jVar.f13331e;
                if (j != -1) {
                    this.f13245e = j;
                } else {
                    long available = (long) this.f13244d.available();
                    this.f13245e = available;
                    if (available == 2147483647L) {
                        this.f13245e = -1;
                    }
                }
                this.f13246f = true;
                C4970a0<? super C4972c> a0Var = this.f13242b;
                if (a0Var != null) {
                    ((C5002l) a0Var).mo25559a(this, jVar);
                }
                return this.f13245e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C4973a(e);
        }
    }

    public void close() throws C4973a {
        this.f13243c = null;
        try {
            InputStream inputStream = this.f13244d;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f13244d = null;
            if (this.f13246f) {
                this.f13246f = false;
                C4970a0<? super C4972c> a0Var = this.f13242b;
                if (a0Var != null) {
                    ((C5002l) a0Var).mo25558a(this);
                }
            }
        } catch (IOException e) {
            throw new C4973a(e);
        } catch (Throwable th) {
            this.f13244d = null;
            if (this.f13246f) {
                this.f13246f = false;
                C4970a0<? super C4972c> a0Var2 = this.f13242b;
                if (a0Var2 != null) {
                    ((C5002l) a0Var2).mo25558a(this);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public int mo24830a(byte[] bArr, int i, int i2) throws C4973a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13245e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C4973a(e);
            }
        }
        int read = this.f13244d.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f13245e;
            if (j2 != -1) {
                this.f13245e = j2 - ((long) read);
            }
            C4970a0<? super C4972c> a0Var = this.f13242b;
            if (a0Var != null) {
                C5002l lVar = (C5002l) a0Var;
                synchronized (lVar) {
                    lVar.f13345d += (long) read;
                }
            }
            return read;
        } else if (this.f13245e == -1) {
            return -1;
        } else {
            throw new C4973a(new EOFException());
        }
    }

    /* renamed from: a */
    public Uri mo24832a() {
        return this.f13243c;
    }
}
