package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.p374my.target.C9955s7;

/* renamed from: com.my.target.u7 */
public class C9992u7 extends C9976t7 {

    /* renamed from: P */
    public final int f24795P;

    public C9992u7(boolean z, View view, View view2, C9955s7.C9956a aVar, View view3, C10038x7 x7Var, Context context) {
        super(view, view2, aVar, view3, x7Var, context);
        this.f24795P = z ? 0 : 1;
    }

    /* renamed from: a */
    public final void mo65559a(int i, int i2) {
        this.f24729q.setVisibility(8);
        this.f24730r.setVisibility(8);
        this.f24726n.setVisibility(8);
        this.f24716d.setVisibility(0);
        this.f24727o.setVisibility(0);
        C10059y8.m29830a(this.f24716d, i, i2, Integer.MIN_VALUE);
        C10059y8.m29830a(this.f24727o, this.f24716d.getMeasuredWidth(), this.f24716d.getMeasuredHeight(), 1073741824);
    }

    /* renamed from: a */
    public final void mo65560a(int i, int i2, int i3, int i4) {
        int i5;
        View view;
        if (this.f24715c.getVisibility() == 0) {
            view = this.f24715c;
            i5 = this.f24705H - this.f24701D;
        } else {
            view = this.f24732t;
            i5 = this.f24705H;
        }
        C10059y8.m29838b(view, i2 + i5, (i3 - i) - i5);
        C10059y8.m29847e(this.f24716d, i4, i);
        C10059y8.m29847e(this.f24707J, this.f24716d.getTop(), 0);
        this.f24726n.layout(0, 0, 0, 0);
        View view2 = this.f24727o;
        View view3 = this.f24707J;
        if (view3 != null) {
            i4 = view3.getBottom();
        }
        C10059y8.m29844c(view2, i4, 0);
        C10059y8.m29845d(this.f24723k, this.f24716d.getTop() - this.f24738z, i3 - this.f24705H);
    }

    /* renamed from: b */
    public final void mo65561b(int i, int i2) {
        this.f24716d.setVisibility(0);
        this.f24726n.setVisibility(0);
        C10059y8.m29830a(this.f24716d, i - this.f24700C, i2, Integer.MIN_VALUE);
        C10059y8.m29830a(this.f24726n, i, this.f24716d.getMeasuredHeight(), 1073741824);
        if (!TextUtils.isEmpty(this.f24729q.getText())) {
            this.f24729q.setVisibility(0);
        } else {
            this.f24729q.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f24730r.getText())) {
            this.f24730r.setVisibility(0);
        } else {
            this.f24730r.setVisibility(8);
        }
        if (this.f24795P == 0) {
            int i3 = this.f24738z;
            int i4 = i3 * 2;
            this.f24728p.measure(View.MeasureSpec.makeMeasureSpec(((i - (i3 * 4)) - this.f24723k.getMeasuredWidth()) - this.f24722j.getMeasuredWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(this.f24704G, 1073741824));
            int i5 = i - i4;
            int i6 = i2 - i4;
            C10059y8.m29830a(this.f24729q, i5, i6, Integer.MIN_VALUE);
            C10059y8.m29830a(this.f24730r, i5, i6, Integer.MIN_VALUE);
            this.f24727o.setVisibility(0);
            C10059y8.m29830a(this.f24727o, i, i2, 1073741824);
            return;
        }
        this.f24727o.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo65562b(int i, int i2, int i3, int i4) {
        int i5;
        View view;
        int i6;
        if (this.f24715c.getVisibility() == 0) {
            view = this.f24715c;
            i5 = this.f24738z - this.f24701D;
        } else {
            view = this.f24732t;
            i5 = this.f24738z;
        }
        C10059y8.m29838b(view, i2 + i5, (i3 - i) - i5);
        C10059y8.m29844c(this.f24716d, i2, i);
        int measuredHeight = (i4 - this.f24722j.getMeasuredHeight()) - this.f24738z;
        Button button = this.f24728p;
        C10059y8.m29831a((View) button, 0, measuredHeight - button.getMeasuredHeight(), i3, measuredHeight);
        if (this.f24795P == 1) {
            C10059y8.m29831a(this.f24707J, i, this.f24716d.getBottom(), i3, i4);
        }
        int top = this.f24728p.getTop() - this.f24738z;
        TextView textView = this.f24730r;
        C10059y8.m29831a((View) textView, 0, top - textView.getMeasuredHeight(), i3, top);
        int top2 = (this.f24730r.getVisibility() == 0 ? this.f24730r.getTop() : top + this.f24730r.getMeasuredHeight()) - this.f24738z;
        TextView textView2 = this.f24729q;
        C10059y8.m29831a((View) textView2, 0, top2 - textView2.getMeasuredHeight(), i3, top2);
        if (this.f24795P == 0) {
            C10059y8.m29831a(this.f24707J, i, this.f24716d.getBottom(), i3, this.f24730r.getTop());
            View view2 = this.f24707J;
            if (view2 != null) {
                i6 = view2.getBottom();
                C10059y8.m29844c(this.f24726n, this.f24716d.getTop(), this.f24716d.getLeft());
                C10059y8.m29844c(this.f24727o, i6, i);
                C10020w5 w5Var = this.f24723k;
                int i7 = this.f24738z;
                C10059y8.m29845d(w5Var, i4 - i7, i3 - i7);
                C9804k6 k6Var = this.f24722j;
                int i8 = this.f24705H;
                C10059y8.m29847e(k6Var, i4 - i8, i8);
            }
        }
        i6 = i4;
        C10059y8.m29844c(this.f24726n, this.f24716d.getTop(), this.f24716d.getLeft());
        C10059y8.m29844c(this.f24727o, i6, i);
        C10020w5 w5Var2 = this.f24723k;
        int i72 = this.f24738z;
        C10059y8.m29845d(w5Var2, i4 - i72, i3 - i72);
        C9804k6 k6Var2 = this.f24722j;
        int i82 = this.f24705H;
        C10059y8.m29847e(k6Var2, i4 - i82, i82);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i3 - i < i4 - i2) {
            mo65562b(i, i2, i3, i4);
        } else {
            mo65560a(i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        View view;
        int measuredHeight;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size < size2) {
            mo65561b(size, size2);
            int i4 = this.f24795P;
            if (i4 == 1) {
                view = this.f24707J;
                measuredHeight = size2 - this.f24726n.getMeasuredHeight();
                i3 = this.f24738z * 2;
            } else if (i4 == 0) {
                view = this.f24707J;
                measuredHeight = (((size2 - this.f24716d.getMeasuredHeight()) - this.f24729q.getMeasuredHeight()) - this.f24728p.getMeasuredHeight()) - this.f24730r.getMeasuredHeight();
                i3 = this.f24738z * 8;
            }
            C10059y8.m29830a(view, size, measuredHeight - i3, Integer.MIN_VALUE);
        } else {
            mo65559a(size, size2);
            C10059y8.m29830a(this.f24707J, size, (size2 - this.f24716d.getMeasuredHeight()) - (this.f24738z * 2), 1073741824);
        }
        C9862n6 n6Var = this.f24732t;
        int i5 = this.f24700C;
        C10059y8.m29830a(n6Var, i5, i5, 1073741824);
        C9702f6 f6Var = this.f24715c;
        int i6 = this.f24700C + (this.f24701D * 2);
        C10059y8.m29830a(f6Var, i6, i6, 1073741824);
        C10020w5 w5Var = this.f24723k;
        int i7 = this.f24700C + (this.f24701D * 2);
        C10059y8.m29830a(w5Var, i7, i7, 1073741824);
        setMeasuredDimension(size, size2);
    }

    public void setBanner(C9697f2 f2Var) {
        super.setBanner(f2Var);
        this.f24718f.mo65407a(true);
        View view = this.f24707J;
        if (view != null) {
            view.setVisibility(0);
        }
    }
}
