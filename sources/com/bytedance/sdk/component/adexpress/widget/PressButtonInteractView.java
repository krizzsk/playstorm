package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class PressButtonInteractView extends FrameLayout {

    /* renamed from: a */
    private Context f6142a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f6143b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SplashDiffuseView f6144c;

    /* renamed from: d */
    private AnimatorSet f6145d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f6146e = true;

    public PressButtonInteractView(Context context) {
        super(context);
        this.f6142a = context;
        this.f6145d = new AnimatorSet();
        m7529c();
        m7531d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressButtonInteractView.this.f6143b.getLayoutParams();
                layoutParams.topMargin = (int) ((((float) PressButtonInteractView.this.f6144c.getMeasuredHeight()) / 2.0f) - C2642b.m6894a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.leftMargin = (int) ((((float) PressButtonInteractView.this.f6144c.getMeasuredWidth()) / 2.0f) - C2642b.m6894a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.bottomMargin = (int) ((((float) (-PressButtonInteractView.this.f6144c.getMeasuredHeight())) / 2.0f) + C2642b.m6894a(PressButtonInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-PressButtonInteractView.this.f6144c.getMeasuredWidth())) / 2.0f) + C2642b.m6894a(PressButtonInteractView.this.getContext(), 5.0f));
                PressButtonInteractView.this.f6143b.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m7529c() {
        this.f6144c = new SplashDiffuseView(this.f6142a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6142a, 40.0f), (int) C2642b.m6894a(this.f6142a, 40.0f));
        layoutParams.gravity = 19;
        addView(this.f6144c, layoutParams);
        this.f6143b = new ImageView(this.f6142a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6142a, 62.0f), (int) C2642b.m6894a(this.f6142a, 62.0f));
        layoutParams2.gravity = 16;
        this.f6143b.setImageResource(C2984t.m8431d(this.f6142a, "tt_splash_hand"));
        addView(this.f6143b, layoutParams2);
    }

    /* renamed from: d */
    private void m7531d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6143b, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setDuration(800);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PressButtonInteractView.this.f6143b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.start();
                PressButtonInteractView.this.f6143b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (PressButtonInteractView.this.f6146e) {
                    PressButtonInteractView.this.f6144c.mo17431a();
                }
                PressButtonInteractView pressButtonInteractView = PressButtonInteractView.this;
                boolean unused = pressButtonInteractView.f6146e = !pressButtonInteractView.f6146e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6143b, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(800);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f6145d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    /* renamed from: a */
    public void mo17367a() {
        this.f6145d.start();
    }

    /* renamed from: b */
    public void mo17368b() {
        AnimatorSet animatorSet = this.f6145d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
