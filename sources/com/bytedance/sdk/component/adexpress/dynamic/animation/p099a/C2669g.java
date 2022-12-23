package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.g */
/* compiled from: RubInAnimation */
public class C2669g extends C2662d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2671a f5760d;

    public C2669g(View view, C2680a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16879a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5750c, "alpha", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        this.f5760d = new C2671a(this.f5750c);
        final int i = this.f5750c.getLayoutParams().height;
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.f5760d, "height", new int[]{0, i}).setDuration((long) ((int) (this.f5749b.mo16938i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16883a(duration));
        arrayList.add(mo16883a(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator, boolean z) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationStart(Animator animator, boolean z) {
            }

            public void onAnimationEnd(Animator animator) {
                C2669g.this.f5760d.mo16899a(i);
            }
        });
        return arrayList;
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.g$a */
    /* compiled from: RubInAnimation */
    private class C2671a {

        /* renamed from: b */
        private View f5764b;

        public C2671a(View view) {
            this.f5764b = view;
        }

        /* renamed from: a */
        public void mo16899a(int i) {
            ViewGroup.LayoutParams layoutParams = this.f5764b.getLayoutParams();
            layoutParams.height = i;
            this.f5764b.setLayoutParams(layoutParams);
            this.f5764b.requestLayout();
        }
    }
}
