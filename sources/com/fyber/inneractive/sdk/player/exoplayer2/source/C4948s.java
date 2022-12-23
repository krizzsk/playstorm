package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.s */
public final class C4948s {

    /* renamed from: d */
    public static final C4948s f13197d = new C4948s(new C4947r[0]);

    /* renamed from: a */
    public final int f13198a;

    /* renamed from: b */
    public final C4947r[] f13199b;

    /* renamed from: c */
    public int f13200c;

    public C4948s(C4947r... rVarArr) {
        this.f13199b = rVarArr;
        this.f13198a = rVarArr.length;
    }

    /* renamed from: a */
    public int mo25485a(C4947r rVar) {
        for (int i = 0; i < this.f13198a; i++) {
            if (this.f13199b[i] == rVar) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4948s.class != obj.getClass()) {
            return false;
        }
        C4948s sVar = (C4948s) obj;
        if (this.f13198a != sVar.f13198a || !Arrays.equals(this.f13199b, sVar.f13199b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f13200c == 0) {
            this.f13200c = Arrays.hashCode(this.f13199b);
        }
        return this.f13200c;
    }
}
