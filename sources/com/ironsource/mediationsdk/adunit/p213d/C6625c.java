package com.ironsource.mediationsdk.adunit.p213d;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.adunit.p210c.p211a.C6605c;
import com.ironsource.mediationsdk.adunit.p213d.p214a.C6621b;
import com.ironsource.mediationsdk.model.C6691a;

/* renamed from: com.ironsource.mediationsdk.adunit.d.c */
public final class C6625c extends C6621b<C6605c> implements RewardedVideoAdListener {
    public C6625c(C6619a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, C6605c cVar) {
        super(aVar, baseAdInteractionAdapter, new C6691a(aVar.f17177c, aVar.f17177c.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), cVar);
    }
}
