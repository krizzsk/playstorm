package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;
import com.bytedance.sdk.component.utils.C2984t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.f */
/* compiled from: RippleAnimation */
public class C2668f extends C2662d {
    public C2668f(View view, C2680a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16879a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5750c, "rippleValue", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        this.f5750c.setTag(C2984t.m8432e(this.f5750c.getContext(), "tt_id_ripple_bg"), this.f5749b.mo16934g());
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16883a(duration));
        return arrayList;
    }
}
