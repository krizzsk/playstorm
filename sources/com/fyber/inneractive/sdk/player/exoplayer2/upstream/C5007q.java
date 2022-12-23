package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.q */
public final class C5007q implements C4996g {

    /* renamed from: a */
    public final C4970a0<? super C5007q> f13380a;

    /* renamed from: b */
    public RandomAccessFile f13381b;

    /* renamed from: c */
    public Uri f13382c;

    /* renamed from: d */
    public long f13383d;

    /* renamed from: e */
    public boolean f13384e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.q$a */
    public static class C5008a extends IOException {
        public C5008a(IOException iOException) {
            super(iOException);
        }
    }

    public C5007q(C4970a0<? super C5007q> a0Var) {
        this.f13380a = a0Var;
    }

    /* renamed from: a */
    public long mo24831a(C5000j jVar) throws C5008a {
        try {
            this.f13382c = jVar.f13327a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(jVar.f13327a.getPath(), CampaignEx.JSON_KEY_AD_R);
            this.f13381b = randomAccessFile;
            randomAccessFile.seek(jVar.f13330d);
            long j = jVar.f13331e;
            if (j == -1) {
                j = this.f13381b.length() - jVar.f13330d;
            }
            this.f13383d = j;
            if (j >= 0) {
                this.f13384e = true;
                C4970a0<? super C5007q> a0Var = this.f13380a;
                if (a0Var != null) {
                    ((C5002l) a0Var).mo25559a(this, jVar);
                }
                return this.f13383d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C5008a(e);
        }
    }

    public void close() throws C5008a {
        this.f13382c = null;
        try {
            RandomAccessFile randomAccessFile = this.f13381b;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f13381b = null;
            if (this.f13384e) {
                this.f13384e = false;
                C4970a0<? super C5007q> a0Var = this.f13380a;
                if (a0Var != null) {
                    ((C5002l) a0Var).mo25558a(this);
                }
            }
        } catch (IOException e) {
            throw new C5008a(e);
        } catch (Throwable th) {
            this.f13381b = null;
            if (this.f13384e) {
                this.f13384e = false;
                C4970a0<? super C5007q> a0Var2 = this.f13380a;
                if (a0Var2 != null) {
                    ((C5002l) a0Var2).mo25558a(this);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public int mo24830a(byte[] bArr, int i, int i2) throws C5008a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13383d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f13381b.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                long j2 = (long) read;
                this.f13383d -= j2;
                C4970a0<? super C5007q> a0Var = this.f13380a;
                if (a0Var != null) {
                    C5002l lVar = (C5002l) a0Var;
                    synchronized (lVar) {
                        lVar.f13345d += j2;
                    }
                }
            }
            return read;
        } catch (IOException e) {
            throw new C5008a(e);
        }
    }

    /* renamed from: a */
    public Uri mo24832a() {
        return this.f13382c;
    }
}
