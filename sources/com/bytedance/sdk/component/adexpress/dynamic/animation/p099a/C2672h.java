package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;
import com.bytedance.sdk.component.utils.C2984t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.h */
/* compiled from: ScaleAnimation */
public class C2672h extends C2662d {
    public C2672h(View view, C2680a aVar) {
        super(view, aVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof DynamicBaseWidget)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof DynamicBaseWidget)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16879a() {
        this.f5750c.setTag(C2984t.m8432e(this.f5750c.getContext(), "tt_id_direction"), this.f5749b.mo16911a());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5750c, "scaleX", new float[]{1.0f, (float) this.f5749b.mo16939j()}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f5750c, "scaleY", new float[]{1.0f, (float) this.f5749b.mo16940k()}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16883a(duration));
        arrayList.add(mo16883a(duration2));
        return arrayList;
    }
}
