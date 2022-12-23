package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class SlideRightView extends FrameLayout {

    /* renamed from: a */
    private Context f6190a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f6191b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f6192c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f6193d;

    /* renamed from: e */
    private TextView f6194e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AnimatorSet f6195f = new AnimatorSet();

    /* renamed from: g */
    private AnimatorSet f6196g = new AnimatorSet();

    /* renamed from: h */
    private AnimatorSet f6197h = new AnimatorSet();

    /* renamed from: i */
    private AnimatorSet f6198i = new AnimatorSet();

    public SlideRightView(Context context) {
        super(context);
        this.f6190a = context;
        m7559b();
    }

    /* renamed from: b */
    private void m7559b() {
        ImageView imageView = new ImageView(this.f6190a);
        this.f6193d = imageView;
        imageView.setBackgroundResource(C2984t.m8431d(this.f6190a, "tt_splash_slide_right_bg"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, -2);
        layoutParams.gravity = 48;
        addView(this.f6193d, layoutParams);
        setClipChildren(false);
        setClipToPadding(false);
        ImageView imageView2 = new ImageView(this.f6190a);
        this.f6192c = imageView2;
        imageView2.setImageResource(C2984t.m8431d(this.f6190a, "tt_splash_slide_right_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6190a, 50.0f), (int) C2642b.m6894a(this.f6190a, 50.0f));
        layoutParams2.gravity = 48;
        addView(this.f6192c, layoutParams2);
        ImageView imageView3 = new ImageView(this.f6190a);
        this.f6191b = imageView3;
        imageView3.setImageResource(C2984t.m8431d(this.f6190a, "tt_splash_hand2"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6190a, 80.0f), (int) C2642b.m6894a(this.f6190a, 80.0f));
        layoutParams3.gravity = 48;
        addView(this.f6191b, layoutParams3);
        TextView textView = new TextView(this.f6190a);
        this.f6194e = textView;
        textView.setTextColor(-1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 80;
        addView(this.f6194e, layoutParams4);
        post(new Runnable() {
            public void run() {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.f6191b.getLayoutParams();
                layoutParams.topMargin = (int) ((((float) SlideRightView.this.f6192c.getMeasuredHeight()) / 2.0f) - C2642b.m6894a(SlideRightView.this.getContext(), 7.0f));
                layoutParams.leftMargin = -SlideRightView.this.f6192c.getMeasuredWidth();
                SlideRightView.this.f6191b.setLayoutParams(layoutParams);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) SlideRightView.this.f6193d.getLayoutParams();
                layoutParams2.topMargin = (int) ((((float) SlideRightView.this.f6192c.getMeasuredHeight()) / 2.0f) - C2642b.m6894a(SlideRightView.this.getContext(), 5.0f));
                layoutParams2.leftMargin = (int) (((float) SlideRightView.this.f6192c.getMeasuredWidth()) / 2.0f);
                SlideRightView.this.f6193d.setLayoutParams(layoutParams2);
            }
        });
    }

    /* renamed from: c */
    private void m7561c() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6191b, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6192c, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f6192c, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f6193d, "alpha", new float[]{0.0f, 1.0f});
        this.f6197h.setDuration(300);
        this.f6197h.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f6191b, "translationX", new float[]{0.0f, C2642b.m6894a(getContext(), 80.0f)});
        ofFloat5.setInterpolator(new C2780a(0.2f, 0.0f, 0.3f, 1.0f));
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) C2642b.m6894a(getContext(), 80.0f)});
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SlideRightView.this.f6193d.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                SlideRightView.this.f6193d.setLayoutParams(layoutParams);
            }
        });
        ofInt.setInterpolator(new C2780a(0.2f, 0.0f, 0.3f, 1.0f));
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f6192c, "translationX", new float[]{0.0f, C2642b.m6894a(getContext(), 80.0f)});
        ofFloat6.setInterpolator(new C2780a(0.2f, 0.0f, 0.3f, 1.0f));
        this.f6198i.setDuration(1500);
        this.f6198i.playTogether(new Animator[]{ofFloat5, ofInt, ofFloat6});
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f6191b, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f6193d, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f6192c, "alpha", new float[]{1.0f, 0.0f});
        this.f6196g.setDuration(50);
        this.f6196g.playTogether(new Animator[]{ofFloat7, ofFloat8, ofFloat9});
        this.f6195f.playSequentially(new Animator[]{this.f6197h, this.f6198i, this.f6196g});
    }

    /* renamed from: a */
    public void mo17415a() {
        m7561c();
        this.f6195f.start();
        this.f6195f.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                SlideRightView.this.postDelayed(new Runnable() {
                    public void run() {
                        SlideRightView.this.f6195f.start();
                    }
                }, 200);
            }
        });
    }

    public void setGuideText(String str) {
        this.f6194e.setText(str);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
