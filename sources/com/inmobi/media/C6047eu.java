package com.inmobi.media;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.inmobi.media.C5916cc;
import com.inmobi.media.C6058ez;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.inmobi.media.eu */
/* compiled from: AnimationManager */
public class C6047eu {

    /* renamed from: b */
    private static final String f15381b = C6047eu.class.getSimpleName();

    /* renamed from: a */
    public List<C6050a> f15382a = new ArrayList();

    /* renamed from: c */
    private boolean f15383c = false;

    /* renamed from: com.inmobi.media.eu$a */
    /* compiled from: AnimationManager */
    public class C6050a {

        /* renamed from: a */
        public Animator f15390a;

        /* renamed from: b */
        long f15391b;

        /* renamed from: c */
        boolean f15392c;

        C6050a(Animator animator) {
            this.f15390a = animator;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<C6050a> mo35181a(final View view, C5901bt btVar) {
        LinkedList linkedList = new LinkedList();
        try {
            float c = (float) C6103fl.m18254c(btVar.f14894c.f14919c.x);
            float c2 = (float) C6103fl.m18254c(btVar.f14894c.f14920d.x);
            if (c != c2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) ((int) c), (float) ((int) c2)});
                final C6058ez.C6059a aVar = (C6058ez.C6059a) view.getLayoutParams();
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aVar.f15412a = ((Float) valueAnimator.getAnimatedValue()).intValue();
                        view.setLayoutParams(aVar);
                        view.requestLayout();
                    }
                });
                linkedList.add(m18102a((Animator) ofFloat, btVar));
            }
            float c3 = (float) C6103fl.m18254c(btVar.f14894c.f14919c.y);
            float c4 = (float) C6103fl.m18254c(btVar.f14894c.f14920d.y);
            if (c3 != c4) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) ((int) c3), (float) ((int) c4)});
                final C6058ez.C6059a aVar2 = (C6058ez.C6059a) view.getLayoutParams();
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aVar2.f15413b = ((Float) valueAnimator.getAnimatedValue()).intValue();
                        view.setLayoutParams(aVar2);
                        view.requestLayout();
                    }
                });
                linkedList.add(m18102a((Animator) ofFloat2, btVar));
            }
            float c5 = (float) C6103fl.m18254c(btVar.f14894c.f14917a.x);
            float c6 = (float) C6103fl.m18254c(btVar.f14894c.f14918b.x);
            if (c5 != c6) {
                linkedList.add(m18102a(m18101a(view, "scaleX", c5, c6), btVar));
            }
            float c7 = (float) C6103fl.m18254c(btVar.f14894c.f14917a.y);
            float c8 = (float) C6103fl.m18254c(btVar.f14894c.f14918b.y);
            if (c7 != c8) {
                linkedList.add(m18102a(m18101a(view, "scaleY", c7, c8), btVar));
            }
        } catch (Exception unused) {
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    /* renamed from: a */
    private C6050a m18102a(Animator animator, C5901bt btVar) {
        m18103b(animator, btVar);
        return new C6050a(animator);
    }

    /* renamed from: b */
    private static void m18103b(Animator animator, C5901bt btVar) {
        animator.setDuration(0);
        animator.setStartDelay(0);
        C5916cc g = btVar.f14894c.mo34886g();
        if (g != null) {
            C5916cc.C5917a aVar = g.f14976a;
            C5916cc.C5917a aVar2 = g.f14977b;
            if (aVar2 != null) {
                animator.setDuration(aVar2.mo34906a() * 1000);
            }
            if (aVar != null) {
                animator.setStartDelay(aVar.mo34906a() * 1000);
            }
        }
    }

    /* renamed from: a */
    private static Animator m18101a(View view, String str, float f, float f2) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        return ObjectAnimator.ofFloat(view, str, new float[]{f2 / f});
    }

    /* renamed from: a */
    public final void mo35182a() {
        if (!this.f15383c) {
            this.f15383c = true;
            mo35183a(this.f15382a);
        }
    }

    /* renamed from: a */
    public final void mo35183a(List<C6050a> list) {
        if (list != null) {
            for (C6050a next : list) {
                if (!next.f15392c) {
                    ValueAnimator valueAnimator = (ValueAnimator) next.f15390a;
                    valueAnimator.setCurrentPlayTime(next.f15391b);
                    valueAnimator.start();
                }
                if (!this.f15382a.contains(next)) {
                    this.f15382a.add(next);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo35184b() {
        if (this.f15383c) {
            this.f15383c = false;
            for (C6050a next : this.f15382a) {
                ValueAnimator valueAnimator = (ValueAnimator) next.f15390a;
                next.f15391b = valueAnimator.getCurrentPlayTime();
                if (((double) valueAnimator.getAnimatedFraction()) == 1.0d) {
                    next.f15392c = true;
                }
                valueAnimator.cancel();
            }
        }
    }
}
