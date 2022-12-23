package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.h */
public final class C4929h implements C4945p {

    /* renamed from: a */
    public final C4945p[] f13124a;

    public C4929h(C4945p[] pVarArr) {
        this.f13124a = pVarArr;
    }

    /* renamed from: a */
    public long mo25189a() {
        long j = Long.MAX_VALUE;
        for (C4945p a : this.f13124a) {
            long a2 = a.mo25189a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: a */
    public boolean mo25195a(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long a = mo25189a();
            if (a == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (C4945p pVar : this.f13124a) {
                if (pVar.mo25189a() == a) {
                    z |= pVar.mo25195a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
