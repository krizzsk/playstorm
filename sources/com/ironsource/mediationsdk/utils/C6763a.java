package com.ironsource.mediationsdk.utils;

import com.ironsource.mediationsdk.IronSource;

/* renamed from: com.ironsource.mediationsdk.utils.a */
public final class C6763a {

    /* renamed from: a */
    private boolean f17663a = false;

    /* renamed from: b */
    private boolean f17664b = false;

    /* renamed from: c */
    private boolean f17665c = false;

    /* renamed from: a */
    public final void mo36954a(IronSource.AD_UNIT ad_unit, boolean z) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            this.f17663a = z;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            this.f17664b = z;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER) {
            this.f17665c = z;
        }
    }

    /* renamed from: a */
    public final boolean mo36955a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return this.f17663a;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return this.f17664b;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return this.f17665c;
        }
        return false;
    }
}
