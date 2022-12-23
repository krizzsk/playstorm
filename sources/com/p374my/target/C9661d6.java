package com.p374my.target;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.my.target.d6 */
public final class C9661d6 extends FrameLayout {

    /* renamed from: a */
    public final C10020w5 f23757a;

    /* renamed from: b */
    public int f23758b;

    /* renamed from: c */
    public int f23759c;

    public C9661d6(Context context) {
        this(context, (AttributeSet) null);
    }

    public C9661d6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9661d6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C10020w5 w5Var = new C10020w5(context);
        this.f23757a = w5Var;
        int a = C10059y8.m29824a(2, context);
        w5Var.setPadding(a, a, a, a);
        w5Var.setFixedHeight(C10059y8.m29824a(17, context));
        addView(w5Var);
    }

    /* renamed from: a */
    public void mo63869a(int i, int i2) {
        this.f23758b = i;
        this.f23759c = i2;
    }

    public C10020w5 getAdChoicesView() {
        return this.f23757a;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.f23758b;
        if (i3 > 0 && this.f23759c > 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
            i2 = View.MeasureSpec.makeMeasureSpec(this.f23759c, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
