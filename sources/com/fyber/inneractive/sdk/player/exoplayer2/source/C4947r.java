package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C4869i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C5023a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.r */
public final class C4947r {

    /* renamed from: a */
    public final int f13194a;

    /* renamed from: b */
    public final C4869i[] f13195b;

    /* renamed from: c */
    public int f13196c;

    public C4947r(C4869i... iVarArr) {
        C5023a.m15304b(iVarArr.length > 0);
        this.f13195b = iVarArr;
        this.f13194a = iVarArr.length;
    }

    /* renamed from: a */
    public C4869i mo25482a(int i) {
        return this.f13195b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4947r.class != obj.getClass()) {
            return false;
        }
        C4947r rVar = (C4947r) obj;
        if (this.f13194a != rVar.f13194a || !Arrays.equals(this.f13195b, rVar.f13195b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f13196c == 0) {
            this.f13196c = Arrays.hashCode(this.f13195b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f13196c;
    }

    /* renamed from: a */
    public int mo25481a(C4869i iVar) {
        int i = 0;
        while (true) {
            C4869i[] iVarArr = this.f13195b;
            if (i >= iVarArr.length) {
                return -1;
            }
            if (iVar == iVarArr[i]) {
                return i;
            }
            i++;
        }
    }
}
