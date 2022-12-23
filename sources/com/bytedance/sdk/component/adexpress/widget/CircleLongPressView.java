package com.bytedance.sdk.component.adexpress.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class CircleLongPressView extends FrameLayout {

    /* renamed from: a */
    private Context f6106a;

    /* renamed from: b */
    private ImageView f6107b;

    /* renamed from: c */
    private ImageView f6108c;

    /* renamed from: d */
    private TextView f6109d;

    /* renamed from: e */
    private RingProgressView f6110e;

    /* renamed from: f */
    private AnimatorSet f6111f = new AnimatorSet();

    public CircleLongPressView(Context context) {
        super(context);
        this.f6106a = context;
        m7507e();
        m7508f();
    }

    /* renamed from: e */
    private void m7507e() {
        FrameLayout frameLayout = new FrameLayout(this.f6106a);
        this.f6110e = new RingProgressView(this.f6106a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6106a, 95.0f), (int) C2642b.m6894a(this.f6106a, 95.0f));
        layoutParams.gravity = 17;
        frameLayout.addView(this.f6110e, layoutParams);
        ImageView imageView = new ImageView(this.f6106a);
        this.f6107b = imageView;
        imageView.setImageResource(C2984t.m8431d(this.f6106a, "tt_interact_circle"));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6106a, 75.0f), (int) C2642b.m6894a(this.f6106a, 75.0f));
        layoutParams2.gravity = 17;
        frameLayout.addView(this.f6107b, layoutParams2);
        ImageView imageView2 = new ImageView(this.f6106a);
        this.f6108c = imageView2;
        imageView2.setImageResource(C2984t.m8431d(this.f6106a, "tt_interact_oval"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) C2642b.m6894a(this.f6106a, 63.0f), (int) C2642b.m6894a(this.f6106a, 63.0f));
        layoutParams3.gravity = 17;
        frameLayout.addView(this.f6108c, layoutParams3);
        addView(frameLayout);
        TextView textView = new TextView(this.f6106a);
        this.f6109d = textView;
        textView.setTextColor(-1);
        this.f6109d.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 81;
        addView(this.f6109d, layoutParams4);
    }

    /* renamed from: f */
    private void m7508f() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f6108c, "scaleX", new float[]{1.0f, 0.9f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f6108c, "scaleY", new float[]{1.0f, 0.9f});
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f6111f.setDuration(800);
        this.f6111f.playTogether(new Animator[]{ofFloat, ofFloat2});
    }

    public void setGuideText(String str) {
        this.f6109d.setText(str);
    }

    /* renamed from: a */
    public void mo17332a() {
        this.f6111f.start();
    }

    /* renamed from: b */
    public void mo17333b() {
        this.f6111f.cancel();
    }

    /* renamed from: c */
    public void mo17334c() {
        this.f6110e.mo17383a();
    }

    /* renamed from: d */
    public void mo17335d() {
        this.f6110e.mo17384b();
        this.f6110e.mo17385c();
    }
}
