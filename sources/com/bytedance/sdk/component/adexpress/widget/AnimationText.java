package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.C2543R;
import com.bytedance.sdk.component.adexpress.dynamic.p101c.C2710l;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.component.utils.C2989x;
import java.util.ArrayList;
import java.util.List;

public class AnimationText extends TextSwitcher implements ViewSwitcher.ViewFactory, C2989x.C2990a {

    /* renamed from: a */
    Animation.AnimationListener f6091a = new Animation.AnimationListener() {
        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
            if (AnimationText.this.f6096f != null) {
                AnimationText.this.f6096f.setText("");
            }
        }
    };

    /* renamed from: b */
    private List<String> f6092b = new ArrayList();

    /* renamed from: c */
    private int f6093c = 0;

    /* renamed from: d */
    private final int f6094d = 1;

    /* renamed from: e */
    private Context f6095e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f6096f;

    /* renamed from: g */
    private int f6097g;

    /* renamed from: h */
    private int f6098h;

    /* renamed from: i */
    private float f6099i;

    /* renamed from: j */
    private int f6100j;

    /* renamed from: k */
    private int f6101k;

    /* renamed from: l */
    private int f6102l;

    /* renamed from: m */
    private int f6103m;

    /* renamed from: n */
    private Handler f6104n = new C2989x(Looper.getMainLooper(), this);

    public AnimationText(Context context, int i, float f, int i2, int i3) {
        super(context);
        this.f6098h = i;
        this.f6099i = f;
        this.f6100j = i2;
        this.f6103m = i3;
        m7503c();
    }

    /* renamed from: c */
    private void m7503c() {
        setFactory(this);
    }

    public void setAnimationType(int i) {
        this.f6102l = i;
    }

    public void setAnimationDuration(int i) {
        this.f6097g = i;
    }

    /* renamed from: a */
    public void mo17317a() {
        int i = this.f6102l;
        if (i == 1) {
            setInAnimation(getContext(), C2984t.m8439l(this.f6095e, "tt_text_animation_y_in"));
            setOutAnimation(getContext(), C2984t.m8439l(this.f6095e, "tt_text_animation_y_out"));
        } else if (i == 0) {
            setInAnimation(getContext(), C2543R.anim.tt_text_animation_x_in);
            setOutAnimation(getContext(), C2543R.anim.tt_text_animation_x_in);
            getInAnimation().setInterpolator(new LinearInterpolator());
            getOutAnimation().setInterpolator(new LinearInterpolator());
            getInAnimation().setAnimationListener(this.f6091a);
            getOutAnimation().setAnimationListener(this.f6091a);
        }
        this.f6104n.sendEmptyMessage(1);
    }

    public void setAnimationText(List<String> list) {
        this.f6092b = list;
    }

    /* renamed from: b */
    public void mo17319b() {
        List<String> list = this.f6092b;
        if (list != null && list.size() > 0) {
            int i = this.f6093c;
            this.f6093c = i + 1;
            this.f6101k = i;
            setText(this.f6092b.get(i));
            if (this.f6093c > this.f6092b.size() - 1) {
                this.f6093c = 0;
            }
        }
    }

    public void setTextColor(int i) {
        this.f6098h = i;
    }

    public void setTextSize(float f) {
        this.f6099i = f;
    }

    public void setMaxLines(int i) {
        this.f6100j = i;
    }

    public View makeView() {
        TextView textView = new TextView(getContext());
        this.f6096f = textView;
        textView.setTextColor(this.f6098h);
        this.f6096f.setTextSize(this.f6099i);
        this.f6096f.setMaxLines(this.f6100j);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f6096f.setTextAlignment(this.f6103m);
        }
        return this.f6096f;
    }

    /* renamed from: a */
    public void mo17318a(Message message) {
        if (message.what == 1) {
            mo17319b();
            this.f6104n.sendEmptyMessageDelayed(1, (long) this.f6097g);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(C2710l.m7354a(this.f6092b.get(this.f6101k), this.f6099i, false)[0], 1073741824), i);
        } catch (Exception unused) {
            super.onMeasure(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6104n.removeMessages(1);
    }
}
