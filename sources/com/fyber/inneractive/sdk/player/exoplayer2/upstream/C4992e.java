package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.e */
public final class C4992e implements C4996g {

    /* renamed from: a */
    public final ContentResolver f13313a;

    /* renamed from: b */
    public final C4970a0<? super C4992e> f13314b;

    /* renamed from: c */
    public Uri f13315c;

    /* renamed from: d */
    public AssetFileDescriptor f13316d;

    /* renamed from: e */
    public InputStream f13317e;

    /* renamed from: f */
    public long f13318f;

    /* renamed from: g */
    public boolean f13319g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.e$a */
    public static class C4993a extends IOException {
        public C4993a(IOException iOException) {
            super(iOException);
        }
    }

    public C4992e(Context context, C4970a0<? super C4992e> a0Var) {
        this.f13313a = context.getContentResolver();
        this.f13314b = a0Var;
    }

    /* renamed from: a */
    public long mo24831a(C5000j jVar) throws C4993a {
        try {
            Uri uri = jVar.f13327a;
            this.f13315c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f13313a.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
            this.f13316d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f13317e = new FileInputStream(this.f13316d.getFileDescriptor());
                long startOffset = this.f13316d.getStartOffset();
                if (this.f13317e.skip(jVar.f13330d + startOffset) - startOffset == jVar.f13330d) {
                    long j = jVar.f13331e;
                    if (j != -1) {
                        this.f13318f = j;
                    } else {
                        long length = this.f13316d.getLength();
                        this.f13318f = length;
                        if (length == -1) {
                            long available = (long) this.f13317e.available();
                            this.f13318f = available;
                            if (available == 0) {
                                this.f13318f = -1;
                            }
                        }
                    }
                    this.f13319g = true;
                    C4970a0<? super C4992e> a0Var = this.f13314b;
                    if (a0Var != null) {
                        ((C5002l) a0Var).mo25559a(this, jVar);
                    }
                    return this.f13318f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f13315c);
        } catch (IOException e) {
            throw new C4993a(e);
        }
    }

    public void close() throws C4993a {
        this.f13315c = null;
        try {
            InputStream inputStream = this.f13317e;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f13317e = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f13316d;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f13316d = null;
                if (this.f13319g) {
                    this.f13319g = false;
                    C4970a0<? super C4992e> a0Var = this.f13314b;
                    if (a0Var != null) {
                        ((C5002l) a0Var).mo25558a(this);
                    }
                }
            } catch (IOException e) {
                throw new C4993a(e);
            } catch (Throwable th) {
                this.f13316d = null;
                if (this.f13319g) {
                    this.f13319g = false;
                    C4970a0<? super C4992e> a0Var2 = this.f13314b;
                    if (a0Var2 != null) {
                        ((C5002l) a0Var2).mo25558a(this);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C4993a(e2);
        } catch (Throwable th2) {
            this.f13317e = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f13316d;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f13316d = null;
                if (this.f13319g) {
                    this.f13319g = false;
                    C4970a0<? super C4992e> a0Var3 = this.f13314b;
                    if (a0Var3 != null) {
                        ((C5002l) a0Var3).mo25558a(this);
                    }
                }
                throw th2;
            } catch (IOException e3) {
                throw new C4993a(e3);
            } catch (Throwable th3) {
                this.f13316d = null;
                if (this.f13319g) {
                    this.f13319g = false;
                    C4970a0<? super C4992e> a0Var4 = this.f13314b;
                    if (a0Var4 != null) {
                        ((C5002l) a0Var4).mo25558a(this);
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    public int mo24830a(byte[] bArr, int i, int i2) throws C4993a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13318f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C4993a(e);
            }
        }
        int read = this.f13317e.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f13318f;
            if (j2 != -1) {
                this.f13318f = j2 - ((long) read);
            }
            C4970a0<? super C4992e> a0Var = this.f13314b;
            if (a0Var != null) {
                C5002l lVar = (C5002l) a0Var;
                synchronized (lVar) {
                    lVar.f13345d += (long) read;
                }
            }
            return read;
        } else if (this.f13318f == -1) {
            return -1;
        } else {
            throw new C4993a(new EOFException());
        }
    }

    /* renamed from: a */
    public Uri mo24832a() {
        return this.f13315c;
    }
}
