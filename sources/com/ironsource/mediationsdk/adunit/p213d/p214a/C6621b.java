package com.ironsource.mediationsdk.adunit.p213d.p214a;

import com.google.android.exoplayer2.upstream.cache.ContentMetadata;
import com.ironsource.mediationsdk.C6490J;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.p210c.p211a.C6605c;
import com.ironsource.mediationsdk.adunit.p213d.C6619a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C6691a;
import com.ironsource.mediationsdk.utils.C6769f;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.mediationsdk.adunit.d.a.b */
public class C6621b<Listener extends C6605c> extends C6620a<Listener> implements AdapterAdRewardListener {

    /* renamed from: h */
    private C6769f f17185h;

    public C6621b(C6619a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, C6691a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    public void onAdClosed() {
        this.f17185h = new C6769f();
        super.onAdClosed();
    }

    public void onAdOpened() {
        this.f17185h = null;
        super.onAdOpened();
    }

    public void onAdRewarded() {
        if (this.f17190e != null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose(mo36597c("placement name = " + mo36609q()));
            if (this.f17188c != null) {
                HashMap hashMap = new HashMap();
                if (C6490J.m19474a().f16548n != null) {
                    for (String next : C6490J.m19474a().f16548n.keySet()) {
                        hashMap.put(ContentMetadata.KEY_CUSTOM_PREFIX + next, C6490J.m19474a().f16548n.get(next));
                    }
                }
                long currentTimeMillis = System.currentTimeMillis();
                this.f17188c.f17102d.mo36498a(mo36609q(), this.f17190e.getRewardName(), this.f17190e.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, mo36401k()), C6769f.m20576a(this.f17185h), hashMap, C6490J.m19474a().f16547m);
            }
            ((C6605c) this.f17187b).mo36561a(this, this.f17190e);
            return;
        }
        IronLog.INTERNAL.verbose(mo36597c("placement is null "));
        if (this.f17188c != null) {
            this.f17188c.f17103e.mo36545n("mCurrentPlacement is null");
        }
    }
}
