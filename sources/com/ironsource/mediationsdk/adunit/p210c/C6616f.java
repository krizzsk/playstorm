package com.ironsource.mediationsdk.adunit.p210c;

import com.ironsource.mediationsdk.C6569ac;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.adunit.p210c.p211a.C6605c;
import com.ironsource.mediationsdk.adunit.p213d.p214a.C6621b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.Placement;
import java.util.Set;

/* renamed from: com.ironsource.mediationsdk.adunit.c.f */
public abstract class C6616f<Smash extends C6621b<?>> extends C6611d<Smash, BaseAdInteractionAdapter<?, AdapterAdRewardListener>> implements C6605c {
    public C6616f(C6602a aVar, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(aVar, set, ironSourceSegment);
    }

    /* renamed from: a */
    public final void mo36561a(C6621b<?> bVar, Placement placement) {
        IronLog.INTERNAL.verbose(mo36575a(bVar.mo36605m()));
        C6606b bVar2 = this.f17157r;
        AdInfo a = this.f17140a.mo36610a(bVar.mo36607o());
        if (bVar2.f17127a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            C6569ac.m19976a().mo36419a(placement, a);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + bVar2.f17127a);
    }
}
