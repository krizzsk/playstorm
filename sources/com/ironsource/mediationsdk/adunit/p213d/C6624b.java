package com.ironsource.mediationsdk.adunit.p213d;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.adunit.p210c.p211a.C6603a;
import com.ironsource.mediationsdk.adunit.p213d.p214a.C6620a;
import com.ironsource.mediationsdk.model.C6691a;

/* renamed from: com.ironsource.mediationsdk.adunit.d.b */
public final class C6624b extends C6620a<C6603a> implements InterstitialAdListener {
    public C6624b(C6619a aVar, BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter, C6603a aVar2) {
        super(aVar, baseAdInteractionAdapter, new C6691a(aVar.f17177c, aVar.f17177c.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), aVar2);
    }
}
