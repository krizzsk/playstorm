package com.mbridge.msdk.interstitial.p319d;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.p307c.C8457b;
import com.mbridge.msdk.out.Frame;
import java.util.List;

/* renamed from: com.mbridge.msdk.interstitial.d.b */
/* compiled from: InterstitialLoadVideoResponseHandler */
public abstract class C8640b extends C8641c {
    /* renamed from: a */
    public abstract void mo57832a(int i, String str);

    /* renamed from: a */
    public abstract void mo57833a(CampaignUnit campaignUnit);

    /* renamed from: a */
    public final void mo57853a(List<Frame> list) {
    }

    /* renamed from: a */
    public final void mo57854a(List<C8457b> list, CampaignUnit campaignUnit) {
        mo57833a(campaignUnit);
    }

    /* renamed from: b */
    public final void mo57855b(int i, String str) {
        mo57832a(i, str);
    }
}
