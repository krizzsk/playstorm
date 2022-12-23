package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4695b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4874m;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.q */
public final class C5045q implements C5030g {

    /* renamed from: a */
    public boolean f13464a;

    /* renamed from: b */
    public long f13465b;

    /* renamed from: c */
    public long f13466c;

    /* renamed from: d */
    public C4874m f13467d = C4874m.f12978d;

    /* renamed from: a */
    public void mo25631a(long j) {
        this.f13465b = j;
        if (this.f13464a) {
            this.f13466c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: i */
    public C4874m mo25057i() {
        return this.f13467d;
    }

    /* renamed from: o */
    public long mo25059o() {
        long j;
        long j2 = this.f13465b;
        if (!this.f13464a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f13466c;
        C4874m mVar = this.f13467d;
        if (mVar.f12979a == 1.0f) {
            j = C4695b.m14454a(elapsedRealtime);
        } else {
            j = elapsedRealtime * ((long) mVar.f12981c);
        }
        return j2 + j;
    }

    /* renamed from: a */
    public void mo25632a(C5030g gVar) {
        mo25631a(gVar.mo25059o());
        this.f13467d = gVar.mo25057i();
    }

    /* renamed from: a */
    public C4874m mo25048a(C4874m mVar) {
        if (this.f13464a) {
            mo25631a(mo25059o());
        }
        this.f13467d = mVar;
        return mVar;
    }
}
