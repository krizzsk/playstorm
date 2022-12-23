package com.applovin.impl.adview.activity.p026a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1423a;
import com.applovin.impl.adview.C1540m;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1829e;
import com.applovin.impl.sdk.p048c.C1857b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.activity.a.d */
public class C1438d extends C1432a {
    public C1438d(C1829e eVar, Activity activity, C1959m mVar) {
        super(eVar, activity, mVar);
    }

    /* renamed from: a */
    public void mo12755a(ImageView imageView, C1540m mVar, C1540m mVar2, C1423a aVar, AppLovinAdView appLovinAdView, ViewGroup viewGroup) {
        this.f1664d.addView(appLovinAdView);
        int i = 3;
        if (mVar != null) {
            mo12748a(this.f1663c.mo13961X(), (this.f1663c.mo13983ac() ? 3 : 5) | 48, mVar);
        }
        if (mVar2 != null) {
            if (!this.f1663c.mo13982ab()) {
                i = 5;
            }
            mo12748a(this.f1663c.mo13961X(), i | 48, mVar2);
        }
        if (imageView != null) {
            int dpToPx = AppLovinSdkUtils.dpToPx(this.f1662b, ((Integer) this.f1661a.mo14311a(C1857b.f3223cv)).intValue());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, ((Integer) this.f1661a.mo14311a(C1857b.f3225cx)).intValue());
            int dpToPx2 = AppLovinSdkUtils.dpToPx(this.f1662b, ((Integer) this.f1661a.mo14311a(C1857b.f3224cw)).intValue());
            layoutParams.setMargins(dpToPx2, dpToPx2, dpToPx2, dpToPx2);
            this.f1664d.addView(imageView, layoutParams);
        }
        if (aVar != null) {
            this.f1664d.addView(aVar, this.f1665e);
        }
        if (viewGroup != null) {
            viewGroup.addView(this.f1664d);
        } else {
            this.f1662b.setContentView(this.f1664d);
        }
    }
}
