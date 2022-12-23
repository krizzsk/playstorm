package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.j */
/* compiled from: SwingAnimation */
public class C2674j extends C2662d {
    public C2674j(View view, C2680a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16879a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5750c, "rotation", new float[]{0.0f, (float) this.f5749b.mo16924d(), 0.0f, (float) this.f5749b.mo16924d(), 0.0f}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16883a(duration));
        return arrayList;
    }
}
