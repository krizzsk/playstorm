package com.fyber.inneractive.sdk.player.exoplayer2;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.m */
public final class C4874m {

    /* renamed from: d */
    public static final C4874m f12978d = new C4874m(1.0f, 1.0f);

    /* renamed from: a */
    public final float f12979a;

    /* renamed from: b */
    public final float f12980b;

    /* renamed from: c */
    public final int f12981c;

    public C4874m(float f, float f2) {
        this.f12979a = f;
        this.f12980b = f2;
        this.f12981c = Math.round(f * 1000.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4874m.class != obj.getClass()) {
            return false;
        }
        C4874m mVar = (C4874m) obj;
        if (this.f12979a == mVar.f12979a && this.f12980b == mVar.f12980b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((Float.floatToRawIntBits(this.f12979a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToRawIntBits(this.f12980b);
    }
}
