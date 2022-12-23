package com.applovin.impl.adview.activity.p026a;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1540m;
import com.applovin.impl.sdk.C1959m;
import com.applovin.impl.sdk.p046ad.C1829e;

/* renamed from: com.applovin.impl.adview.activity.a.a */
abstract class C1432a {

    /* renamed from: a */
    final C1959m f1661a;

    /* renamed from: b */
    final Activity f1662b;

    /* renamed from: c */
    final C1829e f1663c;

    /* renamed from: d */
    final ViewGroup f1664d;

    /* renamed from: e */
    final FrameLayout.LayoutParams f1665e = new FrameLayout.LayoutParams(-1, -1, 17);

    C1432a(C1829e eVar, Activity activity, C1959m mVar) {
        this.f1663c = eVar;
        this.f1661a = mVar;
        this.f1662b = activity;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f1664d = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f1664d.setLayoutParams(this.f1665e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12748a(C1829e.C1833c cVar, int i, C1540m mVar) {
        mVar.mo12986a(cVar.f2959a, cVar.f2963e, cVar.f2962d, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(mVar.getLayoutParams());
        layoutParams.setMargins(cVar.f2961c, cVar.f2960b, cVar.f2961c, 0);
        layoutParams.gravity = i;
        this.f1664d.addView(mVar, layoutParams);
    }
}
