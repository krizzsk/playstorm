package com.p374my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p374my.target.common.views.StarsRatingView;
import java.util.HashMap;

/* renamed from: com.my.target.g7 */
public class C9721g7 extends ViewGroup implements View.OnTouchListener {

    /* renamed from: a */
    public final C9804k6 f23958a;

    /* renamed from: b */
    public final TextView f23959b;

    /* renamed from: c */
    public final TextView f23960c;

    /* renamed from: d */
    public final Button f23961d;

    /* renamed from: e */
    public final C10059y8 f23962e;

    /* renamed from: f */
    public final StarsRatingView f23963f;

    /* renamed from: g */
    public final TextView f23964g;

    /* renamed from: h */
    public final HashMap<View, Boolean> f23965h = new HashMap<>();

    /* renamed from: i */
    public final boolean f23966i;

    /* renamed from: j */
    public View.OnClickListener f23967j;

    /* renamed from: k */
    public int f23968k;

    /* renamed from: l */
    public int f23969l;

    /* renamed from: m */
    public int f23970m;

    public C9721g7(boolean z, Context context) {
        super(context);
        this.f23966i = z;
        this.f23962e = C10059y8.m29843c(context);
        this.f23958a = new C9804k6(context);
        this.f23959b = new TextView(context);
        this.f23960c = new TextView(context);
        this.f23961d = new Button(context);
        this.f23963f = new StarsRatingView(context);
        this.f23964g = new TextView(context);
        mo64107a();
    }

    /* renamed from: a */
    public final void mo64107a() {
        int i;
        C10059y8 y8Var;
        StarsRatingView starsRatingView;
        C10059y8.m29832a(this, 0, 0, -3355444, this.f23962e.mo65778b(1), 0);
        this.f23969l = this.f23962e.mo65778b(2);
        this.f23970m = this.f23962e.mo65778b(12);
        this.f23961d.setPadding(this.f23962e.mo65778b(15), this.f23962e.mo65778b(10), this.f23962e.mo65778b(15), this.f23962e.mo65778b(10));
        this.f23961d.setMinimumWidth(this.f23962e.mo65778b(100));
        this.f23961d.setTransformationMethod((TransformationMethod) null);
        this.f23961d.setSingleLine();
        if (this.f23966i) {
            this.f23961d.setTextSize(20.0f);
        } else {
            this.f23961d.setTextSize(18.0f);
        }
        this.f23961d.setEllipsize(TextUtils.TruncateAt.END);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f23961d.setElevation((float) this.f23962e.mo65778b(2));
        }
        this.f23968k = this.f23962e.mo65778b(12);
        C10059y8.m29839b(this.f23961d, -16733198, -16746839, this.f23962e.mo65778b(2));
        this.f23961d.setTextColor(-1);
        if (this.f23966i) {
            this.f23959b.setTextSize(20.0f);
        } else {
            this.f23959b.setTextSize(18.0f);
        }
        this.f23959b.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f23959b.setTypeface((Typeface) null, 1);
        this.f23959b.setLines(1);
        this.f23959b.setEllipsize(TextUtils.TruncateAt.END);
        this.f23960c.setTextColor(-7829368);
        this.f23960c.setLines(2);
        if (this.f23966i) {
            this.f23960c.setTextSize(20.0f);
        } else {
            this.f23960c.setTextSize(18.0f);
        }
        this.f23960c.setEllipsize(TextUtils.TruncateAt.END);
        if (this.f23966i) {
            starsRatingView = this.f23963f;
            y8Var = this.f23962e;
            i = 24;
        } else {
            starsRatingView = this.f23963f;
            y8Var = this.f23962e;
            i = 18;
        }
        starsRatingView.setStarSize(y8Var.mo65778b(i));
        this.f23963f.setStarsPadding((float) this.f23962e.mo65778b(4));
        C10059y8.m29840b(this, "card_view");
        C10059y8.m29840b(this.f23959b, "card_title_text");
        C10059y8.m29840b(this.f23960c, "card_description_text");
        C10059y8.m29840b(this.f23964g, "card_domain_text");
        C10059y8.m29840b(this.f23961d, "card_cta_button");
        C10059y8.m29840b(this.f23963f, "card_stars_view");
        C10059y8.m29840b(this.f23958a, "card_image");
        addView(this.f23958a);
        addView(this.f23960c);
        addView(this.f23959b);
        addView(this.f23961d);
        addView(this.f23963f);
        addView(this.f23964g);
    }

    /* renamed from: a */
    public final void mo64108a(int i, int i2, boolean z, int i3) {
        int i4 = this.f23969l * 2;
        int i5 = i2 - i4;
        int i6 = i - i4;
        if (z) {
            this.f23959b.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            this.f23960c.measure(0, 0);
            this.f23963f.measure(0, 0);
            this.f23964g.measure(0, 0);
            this.f23961d.measure(0, 0);
            return;
        }
        this.f23959b.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.f23970m * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23960c.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.f23970m * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23963f.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23964g.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f23961d.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.f23970m * 2), i3), View.MeasureSpec.makeMeasureSpec(i5 - (this.f23970m * 2), Integer.MIN_VALUE));
    }

    /* renamed from: a */
    public void mo64109a(View.OnClickListener onClickListener, C9929r1 r1Var) {
        this.f23967j = onClickListener;
        if (onClickListener == null || r1Var == null) {
            super.setOnClickListener((View.OnClickListener) null);
            this.f23961d.setOnClickListener((View.OnClickListener) null);
            return;
        }
        setOnTouchListener(this);
        this.f23958a.setOnTouchListener(this);
        this.f23959b.setOnTouchListener(this);
        this.f23960c.setOnTouchListener(this);
        this.f23963f.setOnTouchListener(this);
        this.f23964g.setOnTouchListener(this);
        this.f23961d.setOnTouchListener(this);
        boolean z = false;
        this.f23965h.put(this.f23958a, Boolean.valueOf(r1Var.f24586f || r1Var.f24595o));
        this.f23965h.put(this, Boolean.valueOf(r1Var.f24594n || r1Var.f24595o));
        this.f23965h.put(this.f23959b, Boolean.valueOf(r1Var.f24583c || r1Var.f24595o));
        this.f23965h.put(this.f23960c, Boolean.valueOf(r1Var.f24584d || r1Var.f24595o));
        this.f23965h.put(this.f23963f, Boolean.valueOf(r1Var.f24587g || r1Var.f24595o));
        this.f23965h.put(this.f23964g, Boolean.valueOf(r1Var.f24592l || r1Var.f24595o));
        HashMap<View, Boolean> hashMap = this.f23965h;
        Button button = this.f23961d;
        if (r1Var.f24589i || r1Var.f24595o) {
            z = true;
        }
        hashMap.put(button, Boolean.valueOf(z));
    }

    public Button getCtaButtonView() {
        return this.f23961d;
    }

    public TextView getDescriptionTextView() {
        return this.f23960c;
    }

    public TextView getDomainTextView() {
        return this.f23964g;
    }

    public StarsRatingView getRatingView() {
        return this.f23963f;
    }

    public C9804k6 getSmartImageView() {
        return this.f23958a;
    }

    public TextView getTitleTextView() {
        return this.f23959b;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = (i3 - i) - (this.f23969l * 2);
        boolean z2 = !this.f23966i && getResources().getConfiguration().orientation == 2;
        C9804k6 k6Var = this.f23958a;
        k6Var.layout(0, 0, k6Var.getMeasuredWidth(), this.f23958a.getMeasuredHeight());
        if (z2) {
            this.f23959b.setTypeface((Typeface) null, 1);
            this.f23959b.layout(0, this.f23958a.getBottom(), i5, this.f23958a.getBottom() + this.f23959b.getMeasuredHeight());
            C10059y8.m29829a((View) this, 0, 0);
            this.f23960c.layout(0, 0, 0, 0);
            this.f23961d.layout(0, 0, 0, 0);
            this.f23963f.layout(0, 0, 0, 0);
            this.f23964g.layout(0, 0, 0, 0);
            return;
        }
        this.f23959b.setTypeface((Typeface) null, 0);
        C10059y8.m29832a(this, 0, 0, -3355444, this.f23962e.mo65778b(1), 0);
        this.f23959b.layout(this.f23969l + this.f23970m, this.f23958a.getBottom(), this.f23959b.getMeasuredWidth() + this.f23969l + this.f23970m, this.f23958a.getBottom() + this.f23959b.getMeasuredHeight());
        this.f23960c.layout(this.f23969l + this.f23970m, this.f23959b.getBottom(), this.f23960c.getMeasuredWidth() + this.f23969l + this.f23970m, this.f23959b.getBottom() + this.f23960c.getMeasuredHeight());
        int measuredWidth = (i5 - this.f23961d.getMeasuredWidth()) / 2;
        Button button = this.f23961d;
        button.layout(measuredWidth, (i4 - button.getMeasuredHeight()) - this.f23970m, this.f23961d.getMeasuredWidth() + measuredWidth, i4 - this.f23970m);
        int measuredWidth2 = (i5 - this.f23963f.getMeasuredWidth()) / 2;
        this.f23963f.layout(measuredWidth2, (this.f23961d.getTop() - this.f23970m) - this.f23963f.getMeasuredHeight(), this.f23963f.getMeasuredWidth() + measuredWidth2, this.f23961d.getTop() - this.f23970m);
        int measuredWidth3 = (i5 - this.f23964g.getMeasuredWidth()) / 2;
        this.f23964g.layout(measuredWidth3, (this.f23961d.getTop() - this.f23964g.getMeasuredHeight()) - this.f23970m, this.f23964g.getMeasuredWidth() + measuredWidth3, this.f23961d.getTop() - this.f23970m);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        boolean z = !this.f23966i && getResources().getConfiguration().orientation == 2;
        if (size != 0) {
            i5 = Integer.MIN_VALUE;
        }
        mo64108a(size, size2, z, i5);
        if (z) {
            i4 = size2 - this.f23959b.getMeasuredHeight();
            i3 = this.f23969l;
        } else {
            i4 = (((size2 - this.f23961d.getMeasuredHeight()) - (this.f23968k * 2)) - Math.max(this.f23963f.getMeasuredHeight(), this.f23964g.getMeasuredHeight())) - this.f23960c.getMeasuredHeight();
            i3 = this.f23959b.getMeasuredHeight();
        }
        int i6 = i4 - i3;
        if (i6 <= size) {
            size = i6;
        }
        this.f23958a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        setMeasuredDimension(size, size2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r10 == r11) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r10 == r11) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        com.p374my.target.C10059y8.m29832a(r9, 0, 0, -3355444, r9.f23962e.mo65778b(1), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.util.HashMap<android.view.View, java.lang.Boolean> r0 = r9.f23965h
            boolean r0 = r0.containsKey(r10)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            java.util.HashMap<android.view.View, java.lang.Boolean> r0 = r9.f23965h
            java.lang.Object r0 = r0.get(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10.setClickable(r0)
            int r11 = r11.getAction()
            r2 = 1
            if (r11 == 0) goto L_0x004f
            if (r11 == r2) goto L_0x002d
            r3 = 3
            if (r11 == r3) goto L_0x0026
            goto L_0x005f
        L_0x0026:
            if (r0 == 0) goto L_0x005f
            android.widget.Button r11 = r9.f23961d
            if (r10 != r11) goto L_0x003e
            goto L_0x003a
        L_0x002d:
            android.view.View$OnClickListener r11 = r9.f23967j
            if (r11 == 0) goto L_0x0034
            r11.onClick(r10)
        L_0x0034:
            if (r0 == 0) goto L_0x005f
            android.widget.Button r11 = r9.f23961d
            if (r10 != r11) goto L_0x003e
        L_0x003a:
            r11.setPressed(r1)
            goto L_0x005f
        L_0x003e:
            com.my.target.y8 r10 = r9.f23962e
            int r7 = r10.mo65778b((int) r2)
            r4 = 0
            r5 = 0
            r6 = -3355444(0xffffffffffcccccc, float:NaN)
            r8 = 0
            r3 = r9
            com.p374my.target.C10059y8.m29832a(r3, r4, r5, r6, r7, r8)
            goto L_0x005f
        L_0x004f:
            if (r0 == 0) goto L_0x005f
            android.widget.Button r11 = r9.f23961d
            if (r10 != r11) goto L_0x0059
            r11.setPressed(r2)
            goto L_0x005f
        L_0x0059:
            r10 = -3806472(0xffffffffffc5eaf8, float:NaN)
            r9.setBackgroundColor(r10)
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p374my.target.C9721g7.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
