package com.bytedance.sdk.openadsdk.component.p140e;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;

/* renamed from: com.bytedance.sdk.openadsdk.component.e.b */
/* compiled from: TTAppOpenAdTopManager */
public class C3277b {

    /* renamed from: g */
    private static String f7767g = "Skip";

    /* renamed from: a */
    private TextView f7768a;

    /* renamed from: b */
    private TextView f7769b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3276a f7770c;

    /* renamed from: d */
    private int f7771d = 0;

    /* renamed from: e */
    private float f7772e = 5.0f;

    /* renamed from: f */
    private int f7773f = 0;

    /* renamed from: h */
    private ValueAnimator f7774h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public boolean f7775i;

    /* renamed from: j */
    private boolean f7776j;

    public C3277b() {
        f7767g = C2984t.m8425a(C3578m.m11231a(), "tt_txt_skip");
    }

    /* renamed from: a */
    public void mo18961a(Activity activity) {
        this.f7768a = (TextView) activity.findViewById(C2984t.m8432e(activity, "tt_top_dislike"));
        this.f7769b = (TextView) activity.findViewById(C2984t.m8432e(activity, "tt_top_skip"));
        this.f7768a.setText(C2984t.m8425a(C3578m.m11231a(), "tt_reward_feedback"));
        m9571g();
    }

    /* renamed from: g */
    private void m9571g() {
        this.f7768a.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3277b.this.f7770c != null) {
                    C3277b.this.f7770c.mo18397b(view);
                }
            }
        });
        this.f7769b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (C3277b.this.f7770c != null && C3277b.this.f7775i) {
                    C3277b.this.f7770c.mo18396a(view);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo18958a() {
        int i = (int) (this.f7772e * 1000.0f);
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i});
        this.f7774h = ofInt;
        ofInt.setDuration((long) i);
        this.f7774h.setInterpolator(new LinearInterpolator());
        this.f7774h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C3277b.this.mo18960a(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
    }

    /* renamed from: a */
    public void mo18960a(int i) {
        this.f7771d = i;
        float f = (((float) i) * 1.0f) / 1000.0f;
        int ceil = (int) Math.ceil((double) (this.f7772e - f));
        if (ceil <= 0) {
            ceil = 0;
            C3276a aVar = this.f7770c;
            if (aVar != null && !this.f7776j) {
                aVar.mo18395a();
                this.f7776j = true;
            }
        }
        String valueOf = String.valueOf(ceil);
        if (f >= ((float) this.f7773f)) {
            valueOf = valueOf + " | " + f7767g;
            this.f7775i = true;
        }
        this.f7769b.setText(valueOf);
    }

    /* renamed from: a */
    public void mo18959a(float f) {
        this.f7772e = f;
        if (f <= 0.0f) {
            this.f7772e = 5.0f;
        }
        mo18958a();
    }

    /* renamed from: b */
    public void mo18964b(int i) {
        this.f7773f = i;
    }

    /* renamed from: a */
    public void mo18962a(C3276a aVar) {
        this.f7770c = aVar;
    }

    /* renamed from: b */
    public ValueAnimator mo18963b() {
        return this.f7774h;
    }

    /* renamed from: c */
    public void mo18965c() {
        TextView textView = this.f7769b;
        if (textView != null) {
            textView.performClick();
        }
    }

    /* renamed from: d */
    public int mo18966d() {
        return this.f7771d;
    }

    /* renamed from: e */
    public float mo18967e() {
        return this.f7772e;
    }

    /* renamed from: f */
    public int mo18968f() {
        return this.f7773f;
    }
}
