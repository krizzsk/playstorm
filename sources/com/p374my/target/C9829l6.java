package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: com.my.target.l6 */
public class C9829l6 extends ViewGroup {

    /* renamed from: a */
    public final TextView f24255a;

    /* renamed from: b */
    public final C9629b6 f24256b;

    /* renamed from: c */
    public final int f24257c;

    /* renamed from: d */
    public final int f24258d;

    public C9829l6(Context context) {
        super(context);
        C10059y8 c = C10059y8.m29843c(context);
        TextView textView = new TextView(context);
        this.f24255a = textView;
        C9629b6 b6Var = new C9629b6(context);
        this.f24256b = b6Var;
        b6Var.setLines(1);
        textView.setTextSize(2, 18.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(-1);
        this.f24257c = c.mo65778b(4);
        this.f24258d = c.mo65778b(2);
        C10059y8.m29840b(textView, "title_text");
        C10059y8.m29840b(b6Var, "age_bordering");
        addView(textView);
        addView(b6Var);
    }

    public TextView getLeftText() {
        return this.f24255a;
    }

    public C9629b6 getRightBorderedView() {
        return this.f24256b;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f24255a.getMeasuredWidth();
        int measuredHeight = this.f24255a.getMeasuredHeight();
        int measuredWidth2 = this.f24256b.getMeasuredWidth();
        int measuredHeight2 = this.f24256b.getMeasuredHeight();
        int measuredHeight3 = getMeasuredHeight();
        int i5 = (measuredHeight3 - measuredHeight) / 2;
        int i6 = (measuredHeight3 - measuredHeight2) / 2;
        int i7 = this.f24257c + measuredWidth;
        this.f24255a.layout(0, i5, measuredWidth, measuredHeight + i5);
        this.f24256b.layout(i7, i6, measuredWidth2 + i7, measuredHeight2 + i6);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f24256b.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f24258d * 2), Integer.MIN_VALUE));
        int i3 = size / 2;
        if (this.f24256b.getMeasuredWidth() > i3) {
            this.f24256b.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f24258d * 2), Integer.MIN_VALUE));
        }
        this.f24255a.measure(View.MeasureSpec.makeMeasureSpec((size - this.f24256b.getMeasuredWidth()) - this.f24257c, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - (this.f24258d * 2), Integer.MIN_VALUE));
        setMeasuredDimension(this.f24255a.getMeasuredWidth() + this.f24256b.getMeasuredWidth() + this.f24257c, Math.max(this.f24255a.getMeasuredHeight(), this.f24256b.getMeasuredHeight()));
    }
}
