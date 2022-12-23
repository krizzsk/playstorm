package com.bytedance.sdk.component.adexpress.dynamic.animation.p099a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2725c;
import com.bytedance.sdk.component.adexpress.dynamic.p100b.C2680a;
import com.bytedance.sdk.component.adexpress.p091a.p092a.C2599a;
import com.bytedance.sdk.component.p125f.C2952e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.d */
/* compiled from: BaseAnimation */
public abstract class C2662d implements C2725c {

    /* renamed from: a */
    public List<ObjectAnimator> f5748a = mo16879a();

    /* renamed from: b */
    C2680a f5749b;

    /* renamed from: c */
    public View f5750c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Set<ScheduledFuture<?>> f5751d = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<ObjectAnimator> mo16879a();

    public C2662d(View view, C2680a aVar) {
        this.f5750c = view;
        this.f5749b = aVar;
    }

    /* renamed from: c */
    public void mo16884c() {
        if ("translate".equals(this.f5749b.mo16936h()) || "fade".equals(this.f5749b.mo16936h())) {
            this.f5750c.setVisibility(4);
        }
        List<ObjectAnimator> list = this.f5748a;
        if (list != null) {
            for (final ObjectAnimator next : list) {
                next.start();
                if (this.f5749b.mo16945p() > 0.0d && Build.VERSION.SDK_INT >= 19) {
                    next.addListener(new Animator.AnimatorListener() {
                        public void onAnimationCancel(Animator animator) {
                        }

                        public void onAnimationEnd(Animator animator) {
                        }

                        public void onAnimationStart(Animator animator) {
                        }

                        public void onAnimationRepeat(Animator animator) {
                            next.pause();
                            C2665a aVar = new C2665a(next);
                            ScheduledFuture<?> schedule = C2952e.m8318d().schedule(aVar, (long) (C2662d.this.f5749b.mo16945p() * 1000.0d), TimeUnit.MILLISECONDS);
                            aVar.mo16890a(schedule);
                            C2662d.this.f5751d.add(schedule);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public void mo16881b() {
        List<ObjectAnimator> list = this.f5748a;
        if (list != null) {
            for (ObjectAnimator next : list) {
                next.cancel();
                next.removeAllUpdateListeners();
            }
            for (ScheduledFuture<?> cancel : this.f5751d) {
                cancel.cancel(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ObjectAnimator mo16883a(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f5749b.mo16942m() * 1000.0d));
        if (this.f5749b.mo16943n() > 0) {
            objectAnimator.setRepeatCount(this.f5749b.mo16943n() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.f5749b.mo16944o())) {
            if ("reverse".equals(this.f5749b.mo16944o()) || "alternate".equals(this.f5749b.mo16944o())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f5749b.mo16941l())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f5749b.mo16944o())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f5749b.mo16944o())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    C2662d.this.f5750c.setVisibility(0);
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.d$a */
    /* compiled from: BaseAnimation */
    public class C2665a implements Runnable {

        /* renamed from: a */
        ObjectAnimator f5756a;

        /* renamed from: b */
        ScheduledFuture<?> f5757b;

        C2665a(ObjectAnimator objectAnimator) {
            this.f5756a = objectAnimator;
        }

        /* renamed from: a */
        public void mo16890a(ScheduledFuture<?> scheduledFuture) {
            this.f5757b = scheduledFuture;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 19 && C2599a.m6611a().mo16628c() != null) {
                C2599a.m6611a().mo16628c().mo16637c().post(new Runnable() {
                    public void run() {
                        C2665a.this.f5756a.resume();
                    }
                });
                if (this.f5757b != null) {
                    C2662d.this.f5751d.remove(this.f5757b);
                }
            }
        }
    }
}
