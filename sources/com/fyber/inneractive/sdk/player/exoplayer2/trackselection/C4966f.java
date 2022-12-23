package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f */
public final class C4966f {

    /* renamed from: a */
    public final int f13232a;

    /* renamed from: b */
    public final C4964e[] f13233b;

    /* renamed from: c */
    public int f13234c;

    public C4966f(C4964e... eVarArr) {
        this.f13233b = eVarArr;
        this.f13232a = eVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4966f.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13233b, ((C4966f) obj).f13233b);
    }

    public int hashCode() {
        if (this.f13234c == 0) {
            this.f13234c = Arrays.hashCode(this.f13233b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f13234c;
    }
}
