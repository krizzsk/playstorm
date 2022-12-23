package com.ironsource.mediationsdk.adunit.p210c;

import com.ironsource.mediationsdk.C6463D;
import com.ironsource.mediationsdk.C6569ac;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.adunit.c.b */
final class C6606b {

    /* renamed from: a */
    IronSource.AD_UNIT f17127a;

    public C6606b(IronSource.AD_UNIT ad_unit) {
        this.f17127a = ad_unit;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36562a(IronSourceError ironSourceError) {
        if (this.f17127a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6463D.m19392a().mo36013a(ironSourceError);
        } else if (this.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36417a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.f17127a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36563a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f17127a == IronSource.AD_UNIT.INTERSTITIAL) {
            C6463D.m19392a().mo36014a(ironSourceError, adInfo);
        } else if (this.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36418a(ironSourceError, adInfo);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.f17127a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36564a(boolean z, AdInfo adInfo) {
        if (this.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36420a(z, adInfo);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + this.f17127a);
    }
}
