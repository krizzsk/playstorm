package com.bytedance.sdk.component.adexpress.widget;

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

public class WriggleGuideAnimationView extends LinearLayout {

    /* renamed from: a */
    private TextView f6232a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f6233b;

    /* renamed from: c */
    private C2986v f6234c;

    /* renamed from: d */
    private TextView f6235d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2776a f6236e;

    /* renamed from: f */
    private LinearLayout f6237f;

    /* renamed from: g */
    private WriggleGuideView f6238g;

    /* renamed from: h */
    private int f6239h;

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView$a */
    public interface C2776a {
        /* renamed from: a */
        void mo17313a();
    }

    public WriggleGuideAnimationView(Context context, int i, int i2) {
        super(context);
        this.f6239h = i2;
        m7577a(context, i);
    }

    /* renamed from: a */
    private void m7577a(Context context, int i) {
        inflate(context, i, this);
        this.f6237f = (LinearLayout) findViewById(C2984t.m8432e(context, "tt_interact_splash_wriggle_layout"));
        this.f6233b = (ImageView) findViewById(C2984t.m8432e(context, "tt_interact_splash_top_img"));
        this.f6238g = (WriggleGuideView) findViewById(C2984t.m8432e(context, "tt_interact_splash_progress_img"));
        this.f6232a = (TextView) findViewById(C2984t.m8432e(context, "tt_interact_splash_top_text"));
        this.f6235d = (TextView) findViewById(C2984t.m8432e(context, "tt_interact_splash_click_bar_text"));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor("#57000000"));
        this.f6237f.setBackground(gradientDrawable);
    }

    public void setShakeText(String str) {
        this.f6235d.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.f6237f;
    }

    public WriggleGuideView getWriggleProgressIv() {
        return this.f6238g;
    }

    public TextView getTopTextView() {
        return this.f6232a;
    }

    public void setOnShakeViewListener(C2776a aVar) {
        this.f6236e = aVar;
    }

    /* renamed from: a */
    public void mo17446a() {
        postDelayed(new Runnable() {
            public void run() {
                if (WriggleGuideAnimationView.this.f6233b != null) {
                    final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -35.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setInterpolator(new C2777b());
                    rotateAnimation.setDuration(1500);
                    rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
                        public void onAnimationRepeat(Animation animation) {
                        }

                        public void onAnimationStart(Animation animation) {
                        }

                        public void onAnimationEnd(Animation animation) {
                            WriggleGuideAnimationView.this.postDelayed(new Runnable() {
                                public void run() {
                                    WriggleGuideAnimationView.this.f6233b.startAnimation(rotateAnimation);
                                }
                            }, 300);
                        }
                    });
                    WriggleGuideAnimationView.this.f6233b.startAnimation(rotateAnimation);
                }
            }
        }, 500);
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView$b */
    private static class C2777b implements Interpolator {
        public float getInterpolation(float f) {
            return f <= 0.4f ? f * 2.5f : f <= 0.8f ? (f * -2.2f) + 1.86f : (f * -0.7f) + 0.7f;
        }

        private C2777b() {
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.f6234c == null) {
                this.f6234c = new C2986v(getContext().getApplicationContext());
            }
            this.f6234c.mo17916a((C2986v.C2987a) new C2986v.C2987a() {
                /* renamed from: a */
                public void mo17413a(int i) {
                    if (i == 2 && WriggleGuideAnimationView.this.isShown() && WriggleGuideAnimationView.this.f6236e != null) {
                        WriggleGuideAnimationView.this.f6236e.mo17313a();
                    }
                }
            });
            this.f6234c.mo17918b((float) this.f6239h);
            this.f6234c.mo17914a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2986v vVar = this.f6234c;
        if (vVar != null) {
            vVar.mo17917b();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        C2986v vVar = this.f6234c;
        if (vVar == null) {
            return;
        }
        if (z) {
            vVar.mo17914a();
        } else {
            vVar.mo17917b();
        }
    }
}
