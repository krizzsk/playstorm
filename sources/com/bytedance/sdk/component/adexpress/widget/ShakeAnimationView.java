package com.bytedance.sdk.component.adexpress.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2986v;

public class ShakeAnimationView extends LinearLayout {

    /* renamed from: a */
    private TextView f6178a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f6179b;

    /* renamed from: c */
    private C2986v f6180c;

    /* renamed from: d */
    private TextView f6181d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2761a f6182e;

    /* renamed from: f */
    private LinearLayout f6183f;

    /* renamed from: g */
    private int f6184g;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$a */
    public interface C2761a {
        /* renamed from: a */
        void mo17310a();
    }

    public ShakeAnimationView(Context context, int i, int i2) {
        super(context);
        this.f6184g = i2;
        m7552a(context, i);
    }

    /* renamed from: a */
    private void m7552a(Context context, int i) {
        inflate(context, i, this);
        this.f6183f = (LinearLayout) findViewById(C2984t.m8432e(context, "tt_hand_container"));
        this.f6179b = (ImageView) findViewById(C2984t.m8432e(context, "tt_splash_rock_img"));
        this.f6178a = (TextView) findViewById(C2984t.m8432e(context, "tt_splash_rock_top_text"));
        this.f6181d = (TextView) findViewById(C2984t.m8432e(context, "tt_splash_rock_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f6183f.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        this.f6181d.setText(str);
    }

    public LinearLayout getShakeLayout() {
        return this.f6183f;
    }

    public void setOnShakeViewListener(C2761a aVar) {
        this.f6182e = aVar;
    }

    /* renamed from: a */
    public void mo17401a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.start();
        postDelayed(new Runnable() {
            public void run() {
                if (ShakeAnimationView.this.f6179b != null) {
                    final RotateAnimation rotateAnimation = new RotateAnimation(-14.0f, 14.0f, 1, 0.9f, 1, 0.9f);
                    rotateAnimation.setInterpolator(new C2762b());
                    rotateAnimation.setDuration(1000);
                    rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }

                        public void onAnimationEnd(Animation animation) {
                            ShakeAnimationView.this.postDelayed(new Runnable() {
                                public void run() {
                                    ShakeAnimationView.this.f6179b.startAnimation(rotateAnimation);
                                }
                            }, 250);
                        }
                    });
                    ShakeAnimationView.this.f6179b.startAnimation(rotateAnimation);
                }
            }
        }, 500);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView$b */
    private static class C2762b implements Interpolator {
        public float getInterpolation(float f) {
            return f <= 0.25f ? (f * -2.0f) + 0.5f : f <= 0.5f ? (f * 4.0f) - 1.0f : f <= 0.75f ? (f * -4.0f) + 3.0f : (f * 2.0f) - 1.5f;
        }

        private C2762b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f6180c == null) {
                this.f6180c = new C2986v(getContext().getApplicationContext());
            }
            this.f6180c.mo17916a((C2986v.C2987a) new C2986v.C2987a() {
                /* renamed from: a */
                public void mo17413a(int i) {
                    if (i == 1 && ShakeAnimationView.this.isShown() && ShakeAnimationView.this.f6182e != null) {
                        ShakeAnimationView.this.f6182e.mo17310a();
                    }
                }
            });
            this.f6180c.mo17915a((float) this.f6184g);
            this.f6180c.mo17914a();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C2986v vVar = this.f6180c;
        if (vVar == null) {
            return;
        }
        if (z) {
            vVar.mo17914a();
        } else {
            vVar.mo17917b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2986v vVar = this.f6180c;
        if (vVar != null) {
            vVar.mo17917b();
        }
    }
}
