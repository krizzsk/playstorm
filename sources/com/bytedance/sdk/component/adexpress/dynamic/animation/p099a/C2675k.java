package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.k */
/* compiled from: TranslateAnimation */
public class C2675k extends C2662d {
    public C2675k(View view, C2680a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16879a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5750c, "translationX", new float[]{C2642b.m6894a(C2640c.m6890a(), (float) this.f5749b.mo16928e()), 0.0f}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f5750c, "translationY", new float[]{C2642b.m6894a(C2640c.m6890a(), (float) this.f5749b.mo16932f()), 0.0f}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16883a(duration));
        arrayList.add(mo16883a(duration2));
        return arrayList;
    }
}
