package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class PressInteractView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Context f6149a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f6150b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public SplashDiffuseView f6151c;

    /* renamed from: d */
    private AnimatorSet f6152d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f6153e = true;

    /* renamed from: f */
    private TextView f6154f;

    public PressInteractView(Context context) {
        super(context);
        this.f6149a = context;
        this.f6152d = new AnimatorSet();
        m7538c();
        m7539d();
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) PressInteractView.this.f6150b.getLayoutParams();
                layoutParams.topMargin = ((int) ((((float) PressInteractView.this.f6151c.getMeasuredHeight()) / 2.0f) - C2642b.m6894a(PressInteractView.this.getContext(), 5.0f))) + ((int) C2642b.m6894a(PressInteractView.this.f6149a, 20.0f));
                layoutParams.leftMargin = ((int) ((((float) PressInteractView.this.f6151c.getMeasuredWidth()) / 2.0f) - C2642b.m6894a(PressInteractView.this.getContext(), 5.0f))) + ((int) C2642b.m6894a(PressInteractView.this.f6149a, 20.0f));
                layoutParams.bottomMargin = (int) ((((float) (-PressInteractView.this.f6151c.getMeasuredHeight())) / 2.0f) + C2642b.m6894a(PressInteractView.this.getContext(), 5.0f));
                layoutParams.rightMargin = (int) ((((float) (-PressInteractView.this.f6151c.getMeasuredWidth())) / 2.0f) + C2642b.m6894a(PressInteractView.this.getContext(), 5.0f));
                PressInteractView.this.f6150b.setLayoutParams(layoutParams);
            }
        });
    }

    /* renamed from: c */
    private void m7538c() {
        this.f6151c = new SplashDiffuseView(this.f6149a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6149a, 50.0f), (int) C2642b.m6894a(this.f6149a, 50.0f));
        layoutParams.gravity = 51;
        layoutParams.topMargin = (int) C2642b.m6894a(this.f6149a, 20.0f);
        layoutParams.leftMargin = (int) C2642b.m6894a(this.f6149a, 20.0f);
        addView(this.f6151c, layoutParams);
        this.f6150b = new ImageView(this.f6149a);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6149a, 78.0f), (int) C2642b.m6894a(this.f6149a, 78.0f));
        this.f6150b.setImageResource(C2984t.m8431d(this.f6149a, "tt_splash_hand"));
        addView(this.f6150b, layoutParams2);
        TextView textView = new TextView(this.f6149a);
        this.f6154f = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = (int) C2642b.m6894a(this.f6149a, 10.0f);
        addView(this.f6154f, layoutParams3);
        this.f6154f.setVisibility(8);
    }

    /* renamed from: d */
    private void m7539d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6150b, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(PressInteractView.this.f6150b, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(200);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.start();
                PressInteractView.this.f6150b.setVisibility(0);
            }

            public void onAnimationRepeat(Animator animator) {
                if (PressInteractView.this.f6153e) {
                    PressInteractView.this.f6151c.mo17431a();
                }
                PressInteractView pressInteractView = PressInteractView.this;
                boolean unused = pressInteractView.f6153e = !pressInteractView.f6153e;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6150b, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setDuration(1000);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.f6152d.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f6154f.setVisibility(0);
        this.f6154f.setText(str);
    }

    public void setGuideTextColor(int i) {
        this.f6154f.setTextColor(i);
    }

    /* renamed from: a */
    public void mo17374a() {
        this.f6152d.start();
    }

    /* renamed from: b */
    public void mo17375b() {
        AnimatorSet animatorSet = this.f6152d;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }
}
