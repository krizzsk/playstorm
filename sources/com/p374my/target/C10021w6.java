package com.p374my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.p374my.target.common.views.StarsRatingView;
import java.util.HashMap;

/* renamed from: com.my.target.w6 */
public class C10021w6 extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a */
    public final TextView f24864a;

    /* renamed from: b */
    public final TextView f24865b;

    /* renamed from: c */
    public final TextView f24866c;

    /* renamed from: d */
    public final LinearLayout f24867d;

    /* renamed from: e */
    public final LinearLayout f24868e;

    /* renamed from: f */
    public final TextView f24869f;

    /* renamed from: g */
    public final StarsRatingView f24870g;

    /* renamed from: h */
    public final TextView f24871h;

    /* renamed from: i */
    public final C10059y8 f24872i;

    /* renamed from: j */
    public final boolean f24873j;

    /* renamed from: k */
    public final HashMap<View, Boolean> f24874k = new HashMap<>();

    /* renamed from: l */
    public String f24875l;

    /* renamed from: m */
    public View.OnClickListener f24876m;

    public C10021w6(Context context, C10059y8 y8Var, boolean z) {
        super(context);
        TextView textView = new TextView(context);
        this.f24864a = textView;
        this.f24865b = new TextView(context);
        TextView textView2 = new TextView(context);
        this.f24866c = textView2;
        this.f24867d = new LinearLayout(context);
        TextView textView3 = new TextView(context);
        this.f24869f = textView3;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f24870g = starsRatingView;
        TextView textView4 = new TextView(context);
        this.f24871h = textView4;
        this.f24868e = new LinearLayout(context);
        C10059y8.m29840b(textView, "title_text");
        C10059y8.m29840b(textView2, "description_text");
        C10059y8.m29840b(textView3, "disclaimer_text");
        C10059y8.m29840b(starsRatingView, "stars_view");
        C10059y8.m29840b(textView4, "votes_text");
        this.f24872i = y8Var;
        this.f24873j = z;
    }

    /* renamed from: a */
    public void mo65676a(C9929r1 r1Var, View.OnClickListener onClickListener) {
        HashMap<View, Boolean> hashMap;
        boolean z;
        TextView textView;
        if (r1Var.f24595o) {
            setOnClickListener(onClickListener);
            C10059y8.m29829a((View) this, -1, -3806472);
            return;
        }
        this.f24876m = onClickListener;
        this.f24864a.setOnTouchListener(this);
        this.f24865b.setOnTouchListener(this);
        this.f24866c.setOnTouchListener(this);
        this.f24870g.setOnTouchListener(this);
        this.f24871h.setOnTouchListener(this);
        setOnTouchListener(this);
        this.f24874k.put(this.f24864a, Boolean.valueOf(r1Var.f24583c));
        if ("store".equals(this.f24875l)) {
            hashMap = this.f24874k;
            textView = this.f24865b;
            z = r1Var.f24593m;
        } else {
            hashMap = this.f24874k;
            textView = this.f24865b;
            z = r1Var.f24592l;
        }
        hashMap.put(textView, Boolean.valueOf(z));
        this.f24874k.put(this.f24866c, Boolean.valueOf(r1Var.f24584d));
        this.f24874k.put(this.f24870g, Boolean.valueOf(r1Var.f24587g));
        this.f24874k.put(this.f24871h, Boolean.valueOf(r1Var.f24588h));
        this.f24874k.put(this, Boolean.valueOf(r1Var.f24594n));
    }

    /* renamed from: a */
    public void mo65677a(boolean z) {
        int i;
        int i2;
        this.f24868e.setOrientation(1);
        this.f24868e.setGravity(1);
        this.f24864a.setGravity(1);
        this.f24864a.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.leftMargin = this.f24872i.mo65778b(8);
        layoutParams.rightMargin = this.f24872i.mo65778b(8);
        this.f24864a.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        this.f24865b.setLayoutParams(layoutParams2);
        this.f24865b.setLines(1);
        this.f24865b.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.f24866c.setGravity(1);
        this.f24866c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (z) {
            this.f24866c.setTextSize(2, 12.0f);
            this.f24866c.setLines(2);
            this.f24866c.setEllipsize(TextUtils.TruncateAt.END);
            layoutParams3.topMargin = 0;
            layoutParams3.leftMargin = this.f24872i.mo65778b(4);
            i = this.f24872i.mo65778b(4);
        } else {
            this.f24866c.setTextSize(2, 16.0f);
            layoutParams3.topMargin = this.f24872i.mo65778b(8);
            layoutParams3.leftMargin = this.f24872i.mo65778b(16);
            i = this.f24872i.mo65778b(16);
        }
        layoutParams3.rightMargin = i;
        layoutParams3.gravity = 1;
        this.f24866c.setLayoutParams(layoutParams3);
        this.f24867d.setOrientation(0);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        this.f24867d.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(this.f24872i.mo65778b(73), this.f24872i.mo65778b(12));
        layoutParams5.topMargin = this.f24872i.mo65778b(4);
        layoutParams5.rightMargin = this.f24872i.mo65778b(4);
        this.f24870g.setLayoutParams(layoutParams5);
        this.f24871h.setTextColor(-6710887);
        this.f24871h.setTextSize(2, 14.0f);
        this.f24869f.setTextColor(-6710887);
        this.f24869f.setGravity(1);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 1;
        if (z) {
            layoutParams6.leftMargin = this.f24872i.mo65778b(4);
            i2 = this.f24872i.mo65778b(4);
        } else {
            layoutParams6.leftMargin = this.f24872i.mo65778b(16);
            i2 = this.f24872i.mo65778b(16);
        }
        layoutParams6.rightMargin = i2;
        layoutParams6.gravity = 1;
        this.f24869f.setLayoutParams(layoutParams6);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams7.gravity = 17;
        addView(this.f24868e, layoutParams7);
        this.f24868e.addView(this.f24864a);
        this.f24868e.addView(this.f24865b);
        this.f24868e.addView(this.f24867d);
        this.f24868e.addView(this.f24866c);
        this.f24868e.addView(this.f24869f);
        this.f24867d.addView(this.f24870g);
        this.f24867d.addView(this.f24871h);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f24874k.containsKey(view)) {
            return false;
        }
        if (!this.f24874k.get(view).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setBackgroundColor(-3806472);
        } else if (action == 1) {
            setBackgroundColor(-1);
            View.OnClickListener onClickListener = this.f24876m;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        } else if (action == 3) {
            setBackgroundColor(-1);
        }
        return true;
    }

    public void setBanner(C9697f2 f2Var) {
        int i;
        TextView textView;
        float f;
        this.f24875l = f2Var.getNavigationType();
        this.f24864a.setText(f2Var.getTitle());
        this.f24866c.setText(f2Var.getDescription());
        this.f24870g.setRating(f2Var.getRating());
        this.f24871h.setText(String.valueOf(f2Var.getVotes()));
        if ("store".equals(f2Var.getNavigationType())) {
            C10059y8.m29840b(this.f24865b, "category_text");
            String category = f2Var.getCategory();
            String subCategory = f2Var.getSubCategory();
            String str = "";
            if (!TextUtils.isEmpty(category)) {
                str = str + category;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(subCategory)) {
                str = str + ", ";
            }
            if (!TextUtils.isEmpty(subCategory)) {
                str = str + subCategory;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f24865b.setText(str);
                this.f24865b.setVisibility(0);
            } else {
                this.f24865b.setVisibility(8);
            }
            this.f24867d.setVisibility(0);
            this.f24867d.setGravity(16);
            if (f2Var.getRating() > 0.0f) {
                this.f24870g.setVisibility(0);
                if (f2Var.getVotes() > 0) {
                    this.f24871h.setVisibility(0);
                    textView = this.f24865b;
                    i = -3355444;
                }
            } else {
                this.f24870g.setVisibility(8);
            }
            this.f24871h.setVisibility(8);
            textView = this.f24865b;
            i = -3355444;
        } else {
            C10059y8.m29840b(this.f24865b, "domain_text");
            this.f24867d.setVisibility(8);
            this.f24865b.setText(f2Var.getDomain());
            this.f24867d.setVisibility(8);
            textView = this.f24865b;
            i = -16733198;
        }
        textView.setTextColor(i);
        if (TextUtils.isEmpty(f2Var.getDisclaimer())) {
            this.f24869f.setVisibility(8);
        } else {
            this.f24869f.setVisibility(0);
            this.f24869f.setText(f2Var.getDisclaimer());
        }
        if (this.f24873j) {
            this.f24864a.setTextSize(2, 32.0f);
            this.f24866c.setTextSize(2, 24.0f);
            f = 18.0f;
            this.f24869f.setTextSize(2, 18.0f);
        } else {
            this.f24864a.setTextSize(2, 20.0f);
            f = 16.0f;
            this.f24866c.setTextSize(2, 16.0f);
            this.f24869f.setTextSize(2, 14.0f);
        }
        this.f24865b.setTextSize(2, f);
    }
}
