package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;
import com.bytedance.sdk.component.utils.C2984t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.i */
/* compiled from: ShineAnimation */
public class C2673i extends C2662d {
    public C2673i(View view, C2680a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16879a() {
        this.f5750c.setTag(C2984t.m8432e(this.f5750c.getContext(), "tt_id_shine_width"), Integer.valueOf(this.f5749b.mo16920c()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5750c, "shineValue", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16883a(duration));
        return arrayList;
    }
}
