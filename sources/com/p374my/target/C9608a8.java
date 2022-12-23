package com.p374my.target;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p374my.target.C10080z7;
import com.p374my.target.common.models.ImageData;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.my.target.a8 */
public final class C9608a8 extends LinearLayout implements View.OnTouchListener, C10080z7 {

    /* renamed from: a */
    public final C9804k6 f23621a;

    /* renamed from: b */
    public final TextView f23622b;

    /* renamed from: c */
    public final TextView f23623c;

    /* renamed from: d */
    public final Button f23624d;

    /* renamed from: e */
    public final C10038x7 f23625e;

    /* renamed from: f */
    public final Set<View> f23626f = new HashSet();

    /* renamed from: g */
    public final int f23627g;

    /* renamed from: h */
    public final int f23628h;

    /* renamed from: i */
    public final int f23629i;

    /* renamed from: j */
    public C10080z7.C10081a f23630j;

    /* renamed from: k */
    public ImageData f23631k;

    /* renamed from: l */
    public boolean f23632l;

    public C9608a8(Context context, C9996v1 v1Var, C10038x7 x7Var) {
        super(context);
        setOrientation(1);
        this.f23625e = x7Var;
        this.f23621a = new C9804k6(context);
        this.f23622b = new TextView(context);
        this.f23623c = new TextView(context);
        this.f23624d = new Button(context);
        this.f23627g = x7Var.mo65713a(C10038x7.f24920Q);
        this.f23628h = x7Var.mo65713a(C10038x7.f24932f);
        this.f23629i = x7Var.mo65713a(C10038x7.f24908E);
        mo63488a(v1Var);
    }

    private void setClickArea(C9929r1 r1Var) {
        setOnTouchListener(this);
        this.f23621a.setOnTouchListener(this);
        this.f23622b.setOnTouchListener(this);
        this.f23623c.setOnTouchListener(this);
        this.f23624d.setOnTouchListener(this);
        this.f23626f.clear();
        if (r1Var.f24595o) {
            this.f23632l = true;
            return;
        }
        if (r1Var.f24589i) {
            this.f23626f.add(this.f23624d);
        } else {
            this.f23624d.setEnabled(false);
            this.f23626f.remove(this.f23624d);
        }
        if (r1Var.f24594n) {
            this.f23626f.add(this);
        } else {
            this.f23626f.remove(this);
        }
        if (r1Var.f24583c) {
            this.f23626f.add(this.f23622b);
        } else {
            this.f23626f.remove(this.f23622b);
        }
        if (r1Var.f24584d) {
            this.f23626f.add(this.f23623c);
        } else {
            this.f23626f.remove(this.f23623c);
        }
        if (r1Var.f24586f) {
            this.f23626f.add(this.f23621a);
        } else {
            this.f23626f.remove(this.f23621a);
        }
    }

    /* renamed from: a */
    public View mo63486a() {
        return this;
    }

    /* renamed from: a */
    public final void mo63487a(int i, int i2) {
        this.f23621a.measure(i, i2);
        if (this.f23622b.getVisibility() == 0) {
            this.f23622b.measure(i, i2);
        }
        if (this.f23623c.getVisibility() == 0) {
            this.f23623c.measure(i, i2);
        }
        if (this.f23624d.getVisibility() == 0) {
            C10059y8.m29830a(this.f23624d, this.f23621a.getMeasuredWidth() - (this.f23625e.mo65713a(C10038x7.f24916M) * 2), this.f23627g, 1073741824);
        }
    }

    /* renamed from: a */
    public final void mo63488a(C9996v1 v1Var) {
        this.f23624d.setTransformationMethod((TransformationMethod) null);
        this.f23624d.setSingleLine();
        this.f23624d.setTextSize(1, (float) this.f23625e.mo65713a(C10038x7.f24946t));
        this.f23624d.setEllipsize(TextUtils.TruncateAt.END);
        this.f23624d.setGravity(17);
        this.f23624d.setIncludeFontPadding(false);
        Button button = this.f23624d;
        int i = this.f23628h;
        button.setPadding(i, 0, i, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C10038x7 x7Var = this.f23625e;
        int i2 = C10038x7.f24916M;
        layoutParams.leftMargin = x7Var.mo65713a(i2);
        layoutParams.rightMargin = this.f23625e.mo65713a(i2);
        layoutParams.topMargin = this.f23629i;
        layoutParams.gravity = 1;
        this.f23624d.setLayoutParams(layoutParams);
        C10059y8.m29839b(this.f23624d, v1Var.mo65588d(), v1Var.mo65592f(), this.f23625e.mo65713a(C10038x7.f24938l));
        this.f23624d.setTextColor(v1Var.mo65590e());
        this.f23622b.setTextSize(1, (float) this.f23625e.mo65713a(C10038x7.f24917N));
        this.f23622b.setTextColor(v1Var.mo65601k());
        this.f23622b.setIncludeFontPadding(false);
        TextView textView = this.f23622b;
        C10038x7 x7Var2 = this.f23625e;
        int i3 = C10038x7.f24915L;
        textView.setPadding(x7Var2.mo65713a(i3), 0, this.f23625e.mo65713a(i3), 0);
        this.f23622b.setTypeface((Typeface) null, 1);
        this.f23622b.setLines(this.f23625e.mo65713a(C10038x7.f24904A));
        this.f23622b.setEllipsize(TextUtils.TruncateAt.END);
        this.f23622b.setGravity(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = this.f23628h;
        this.f23622b.setLayoutParams(layoutParams2);
        this.f23623c.setTextColor(v1Var.mo65600j());
        this.f23623c.setIncludeFontPadding(false);
        this.f23623c.setLines(this.f23625e.mo65713a(C10038x7.f24905B));
        this.f23623c.setTextSize(1, (float) this.f23625e.mo65713a(C10038x7.f24918O));
        this.f23623c.setEllipsize(TextUtils.TruncateAt.END);
        this.f23623c.setPadding(this.f23625e.mo65713a(i3), 0, this.f23625e.mo65713a(i3), 0);
        this.f23623c.setGravity(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        this.f23623c.setLayoutParams(layoutParams3);
        C10059y8.m29840b(this, "card_view");
        C10059y8.m29840b(this.f23622b, "card_title_text");
        C10059y8.m29840b(this.f23623c, "card_description_text");
        C10059y8.m29840b(this.f23624d, "card_cta_button");
        C10059y8.m29840b(this.f23621a, "card_image");
        addView(this.f23621a);
        addView(this.f23622b);
        addView(this.f23623c);
        addView(this.f23624d);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mo63487a(i, i2);
        if (getMeasuredHeight() <= 0 || getMeasuredWidth() <= 0 || getMeasuredWidth() != size) {
            int measuredWidth = this.f23621a.getMeasuredWidth();
            int measuredHeight = this.f23621a.getMeasuredHeight();
            if (size <= size2) {
                measuredHeight = getPaddingBottom() + 0 + getPaddingTop();
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    View childAt = getChildAt(i3);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                    measuredHeight = measuredHeight + childAt.getMeasuredHeight() + childAt.getPaddingTop() + childAt.getPaddingBottom() + layoutParams.topMargin + layoutParams.bottomMargin;
                }
            }
            setMeasuredDimension(measuredWidth, measuredHeight);
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z = false;
            if (action == 1) {
                setBackgroundColor(0);
                this.f23624d.setPressed(false);
                C10080z7.C10081a aVar = this.f23630j;
                if (aVar != null) {
                    if (this.f23632l || this.f23626f.contains(view)) {
                        z = true;
                    }
                    aVar.mo65330a(z);
                }
            } else if (action == 3) {
                setBackgroundColor(0);
                this.f23624d.setPressed(false);
            }
        } else if (this.f23632l || this.f23626f.contains(view)) {
            Button button = this.f23624d;
            if (view == button) {
                button.setPressed(true);
            } else {
                setBackgroundColor(-13421773);
            }
        }
        return true;
    }

    public void setBanner(C9640c2 c2Var) {
        if (c2Var != null) {
            ImageData image = c2Var.getImage();
            this.f23631k = image;
            if (image != null) {
                this.f23621a.setPlaceholderDimensions(image.getWidth(), this.f23631k.getHeight());
                C9807k8.m28516b(this.f23631k, this.f23621a);
            }
            if (c2Var.isImageOnly()) {
                this.f23622b.setVisibility(8);
                this.f23623c.setVisibility(8);
                this.f23624d.setVisibility(8);
            } else {
                this.f23622b.setVisibility(0);
                this.f23623c.setVisibility(0);
                this.f23624d.setVisibility(0);
                this.f23622b.setText(c2Var.getTitle());
                this.f23623c.setText(c2Var.getDescription());
                this.f23624d.setText(c2Var.getCtaText());
            }
            setClickArea(c2Var.getClickArea());
            return;
        }
        this.f23626f.clear();
        ImageData imageData = this.f23631k;
        if (imageData != null) {
            C9807k8.m28512a(imageData, (ImageView) this.f23621a);
        }
        this.f23621a.setPlaceholderDimensions(0, 0);
        this.f23622b.setVisibility(8);
        this.f23623c.setVisibility(8);
        this.f23624d.setVisibility(8);
    }

    public void setListener(C10080z7.C10081a aVar) {
        this.f23630j = aVar;
    }
}
