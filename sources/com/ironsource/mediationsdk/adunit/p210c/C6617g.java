package com.ironsource.mediationsdk.adunit.p210c;

import com.ironsource.mediationsdk.C6653d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.p213d.C6619a;
import com.ironsource.mediationsdk.adunit.p213d.C6624b;
import com.ironsource.mediationsdk.adunit.p213d.p214a.C6622c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* renamed from: com.ironsource.mediationsdk.adunit.c.g */
public final class C6617g extends C6611d<C6624b, BaseAdInteractionAdapter<?, AdapterAdInteractionListener>> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6617g(java.util.List<com.ironsource.mediationsdk.model.NetworkSettings> r18, com.ironsource.mediationsdk.model.C6698h r19, java.lang.String r20, java.util.Set<com.ironsource.mediationsdk.impressionData.ImpressionDataListener> r21, com.ironsource.mediationsdk.IronSourceSegment r22) {
        /*
            r17 = this;
            r0 = r19
            com.ironsource.mediationsdk.adunit.c.a r10 = new com.ironsource.mediationsdk.adunit.c.a
            com.ironsource.mediationsdk.IronSource$AD_UNIT r1 = com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL
            com.ironsource.mediationsdk.utils.c r4 = r0.f17509i
            int r5 = r0.f17503c
            int r6 = r0.f17505e
            int r7 = r0.f17506f
            com.ironsource.mediationsdk.adunit.c.b.a r9 = new com.ironsource.mediationsdk.adunit.c.b.a
            com.ironsource.mediationsdk.adunit.c.b.a$a r12 = com.ironsource.mediationsdk.adunit.p210c.p212b.C6607a.C6608a.MANUAL
            com.ironsource.mediationsdk.utils.c r2 = r0.f17509i
            long r13 = r2.f17679k
            com.ironsource.mediationsdk.utils.c r0 = r0.f17509i
            long r2 = r0.f17678j
            r11 = r9
            r15 = r2
            r11.<init>(r12, r13, r15)
            r8 = -1
            r0 = r10
            r2 = r20
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r17
            r1 = r21
            r2 = r22
            r0.<init>(r10, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.p210c.C6617g.<init>(java.util.List, com.ironsource.mediationsdk.model.h, java.lang.String, java.util.Set, com.ironsource.mediationsdk.IronSourceSegment):void");
    }

    /* renamed from: b */
    private static BaseAdInteractionAdapter<?, AdapterAdInteractionListener> m20172b(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> b = C6653d.m20285a().mo36667b(networkSettings, ad_unit);
        if (b == null || !(b instanceof BaseAdInteractionAdapter)) {
            return null;
        }
        try {
            return (BaseAdInteractionAdapter) b;
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception creating adapter - " + e.getMessage());
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ BaseAdAdapter mo36573a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        return m20172b(networkSettings, ad_unit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ C6622c mo36574a(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str) {
        return new C6624b(new C6619a(IronSource.AD_UNIT.INTERSTITIAL, this.f17152m.f17119b, i, this.f17147h, str, this.f17145f, this.f17146g, networkSettings, this.f17152m.f17124g), (BaseAdInteractionAdapter) baseAdAdapter, this);
    }
}
