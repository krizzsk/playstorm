package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.r */
public final class C5046r {

    /* renamed from: a */
    public long f13468a;

    /* renamed from: b */
    public long f13469b;

    /* renamed from: c */
    public volatile long f13470c = -9223372036854775807L;

    public C5046r(long j) {
        mo25636c(j);
    }

    /* renamed from: a */
    public long mo25633a() {
        if (this.f13468a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f13470c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f13469b;
    }

    /* renamed from: b */
    public long mo25635b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13470c != -9223372036854775807L) {
            long j2 = (this.f13470c * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return mo25634a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public synchronized void mo25636c(long j) {
        C5023a.m15304b(this.f13470c == -9223372036854775807L);
        this.f13468a = j;
    }

    /* renamed from: a */
    public long mo25634a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13470c != -9223372036854775807L) {
            this.f13470c = j;
        } else {
            long j2 = this.f13468a;
            if (j2 != Long.MAX_VALUE) {
                this.f13469b = j2 - j;
            }
            synchronized (this) {
                this.f13470c = j;
                notifyAll();
            }
        }
        return j + this.f13469b;
    }
}
