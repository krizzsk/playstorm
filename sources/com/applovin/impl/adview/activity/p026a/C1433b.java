package com.applovin.impl.adview.activity.p026a;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1540m;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1829e;

/* renamed from: com.applovin.impl.adview.activity.a.b */
public class C1433b extends C1432a {
    public C1433b(C1829e eVar, Activity activity, C1959m mVar) {
        super(eVar, activity, mVar);
    }

    /* renamed from: a */
    public void mo12749a(C1540m mVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f1664d.addView(appLovinAdView);
        if (mVar != null) {
            mo12748a(this.f1663c.mo13961X(), (this.f1663c.mo13982ab() ? 3 : 5) | 48, mVar);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f1664d);
        } else {
            this.f1662b.setContentView(this.f1664d);
        }
    }
}
