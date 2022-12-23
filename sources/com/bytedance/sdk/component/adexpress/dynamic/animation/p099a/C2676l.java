package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2640c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.l */
/* compiled from: WaggleAnimation */
public class C2676l extends C2662d {
    public C2676l(View view, C2680a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16879a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5750c, "translationX", new float[]{0.0f, C2642b.m6894a(C2640c.m6890a(), 20.0f), 0.0f, -C2642b.m6894a(C2640c.m6890a(), 20.0f), 0.0f}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16883a(duration));
        return arrayList;
    }
}
