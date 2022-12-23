package com.p374my.target;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.common.views.StarsRatingView;
import com.p374my.target.nativeads.views.MediaAdView;
import java.util.ArrayList;

/* renamed from: com.my.target.b7 */
public class C9630b7 extends ViewGroup {

    /* renamed from: a */
    public final TextView f23674a;

    /* renamed from: b */
    public final C9829l6 f23675b;

    /* renamed from: c */
    public final TextView f23676c;

    /* renamed from: d */
    public final LinearLayout f23677d;

    /* renamed from: e */
    public final StarsRatingView f23678e;

    /* renamed from: f */
    public final TextView f23679f;

    /* renamed from: g */
    public final TextView f23680g;

    /* renamed from: h */
    public final Button f23681h;

    /* renamed from: i */
    public final C9804k6 f23682i;

    /* renamed from: j */
    public final C10059y8 f23683j;

    /* renamed from: k */
    public final int f23684k;

    /* renamed from: l */
    public final int f23685l;

    /* renamed from: m */
    public final int f23686m;

    /* renamed from: com.my.target.b7$a */
    public class C9631a implements Animator.AnimatorListener {
        public C9631a() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C9630b7.this.f23676c.setVisibility(8);
            C9630b7.this.f23674a.setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: com.my.target.b7$b */
    public class C9632b implements Animator.AnimatorListener {
        public C9632b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            if (C9630b7.this.f23677d.isEnabled()) {
                C9630b7.this.f23677d.setVisibility(8);
            }
            if (C9630b7.this.f23680g.isEnabled()) {
                C9630b7.this.f23680g.setVisibility(8);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public C9630b7(Context context, C10059y8 y8Var) {
        super(context);
        this.f23683j = y8Var;
        Button button = new Button(context);
        this.f23681h = button;
        C10059y8.m29840b(button, "cta_button");
        C9804k6 k6Var = new C9804k6(context);
        this.f23682i = k6Var;
        C10059y8.m29840b(k6Var, ViewHierarchyConstants.ICON_BITMAP);
        this.f23675b = new C9829l6(context);
        TextView textView = new TextView(context);
        this.f23674a = textView;
        C10059y8.m29840b(textView, "description_text");
        TextView textView2 = new TextView(context);
        this.f23676c = textView2;
        C10059y8.m29840b(textView2, "disclaimer_text");
        this.f23677d = new LinearLayout(context);
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f23678e = starsRatingView;
        C10059y8.m29840b(starsRatingView, "stars_view");
        TextView textView3 = new TextView(context);
        this.f23679f = textView3;
        C10059y8.m29840b(textView3, "votes_text");
        TextView textView4 = new TextView(context);
        this.f23680g = textView4;
        C10059y8.m29840b(textView4, "domain_text");
        this.f23684k = y8Var.mo65778b(16);
        this.f23686m = y8Var.mo65778b(8);
        this.f23685l = y8Var.mo65778b(64);
    }

    /* renamed from: a */
    public void mo63626a() {
        setBackgroundColor(1711276032);
        this.f23674a.setTextColor(-2236963);
        this.f23674a.setEllipsize(TextUtils.TruncateAt.END);
        this.f23680g.setTextColor(-6710887);
        this.f23680g.setVisibility(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(1, -3355444);
        this.f23676c.setPadding(this.f23683j.mo65778b(4), this.f23683j.mo65778b(4), this.f23683j.mo65778b(4), this.f23683j.mo65778b(4));
        this.f23676c.setBackgroundDrawable(gradientDrawable);
        this.f23676c.setTextSize(2, 12.0f);
        this.f23676c.setTextColor(-3355444);
        this.f23676c.setVisibility(8);
        this.f23677d.setOrientation(0);
        this.f23677d.setGravity(16);
        this.f23677d.setVisibility(8);
        this.f23679f.setTextColor(-6710887);
        this.f23679f.setGravity(16);
        this.f23679f.setTextSize(2, 14.0f);
        this.f23681h.setPadding(this.f23683j.mo65778b(15), 0, this.f23683j.mo65778b(15), 0);
        this.f23681h.setMinimumWidth(this.f23683j.mo65778b(100));
        this.f23681h.setTransformationMethod((TransformationMethod) null);
        this.f23681h.setTextSize(2, 22.0f);
        this.f23681h.setMaxEms(10);
        this.f23681h.setSingleLine();
        this.f23681h.setEllipsize(TextUtils.TruncateAt.END);
        C9629b6 rightBorderedView = this.f23675b.getRightBorderedView();
        rightBorderedView.mo63621a(1, -7829368);
        rightBorderedView.setPadding(this.f23683j.mo65778b(2), 0, 0, 0);
        rightBorderedView.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
        rightBorderedView.mo63622a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f23683j.mo65778b(3));
        rightBorderedView.setBackgroundColor(1711276032);
        this.f23678e.setStarSize(this.f23683j.mo65778b(12));
        this.f23677d.addView(this.f23678e);
        this.f23677d.addView(this.f23679f);
        this.f23677d.setVisibility(8);
        this.f23680g.setVisibility(8);
        addView(this.f23675b);
        addView(this.f23677d);
        addView(this.f23680g);
        addView(this.f23674a);
        addView(this.f23676c);
        addView(this.f23682i);
        addView(this.f23681h);
    }

    /* renamed from: a */
    public final void mo63627a(int i, View... viewArr) {
        int height = this.f23682i.getHeight();
        int height2 = getHeight();
        int width = this.f23681h.getWidth();
        int height3 = this.f23681h.getHeight();
        int width2 = this.f23682i.getWidth();
        this.f23682i.setPivotX(0.0f);
        this.f23682i.setPivotY(((float) height) / 2.0f);
        this.f23681h.setPivotX((float) width);
        this.f23681h.setPivotY(((float) height3) / 2.0f);
        float f = ((float) height2) * 0.3f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f23681h, View.SCALE_X, new float[]{0.7f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23681h, View.SCALE_Y, new float[]{0.7f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23682i, View.SCALE_X, new float[]{0.7f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23682i, View.SCALE_Y, new float[]{0.7f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23674a, View.ALPHA, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23676c, View.ALPHA, new float[]{0.0f}));
        if (this.f23677d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.f23677d, View.ALPHA, new float[]{1.0f}));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{0.6f}));
        float f2 = -(((float) width2) * 0.3f);
        arrayList.add(ObjectAnimator.ofFloat(this.f23675b, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23677d, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23680g, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23674a, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23676c, View.TRANSLATION_X, new float[]{f2}));
        arrayList.add(ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{f}));
        float f3 = (-f) / 2.0f;
        arrayList.add(ObjectAnimator.ofFloat(this.f23681h, View.TRANSLATION_Y, new float[]{f3}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23682i, View.TRANSLATION_Y, new float[]{f3}));
        for (View ofFloat : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(ofFloat, View.TRANSLATION_Y, new float[]{f}));
        }
        if (this.f23677d.isEnabled()) {
            this.f23677d.setVisibility(0);
        }
        if (this.f23680g.isEnabled()) {
            this.f23680g.setVisibility(0);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new C9631a());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration((long) i);
        animatorSet.start();
    }

    /* renamed from: a */
    public void mo63628a(C9929r1 r1Var, View.OnClickListener onClickListener) {
        if (r1Var.f24595o) {
            setOnClickListener(onClickListener);
            this.f23681h.setOnClickListener(onClickListener);
            return;
        }
        if (r1Var.f24589i) {
            this.f23681h.setOnClickListener(onClickListener);
        } else {
            this.f23681h.setEnabled(false);
        }
        if (r1Var.f24594n) {
            setOnClickListener(onClickListener);
        } else {
            setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24583c) {
            this.f23675b.getLeftText().setOnClickListener(onClickListener);
        } else {
            this.f23675b.getLeftText().setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24590j) {
            this.f23675b.getRightBorderedView().setOnClickListener(onClickListener);
        } else {
            this.f23675b.getRightBorderedView().setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24585e) {
            this.f23682i.setOnClickListener(onClickListener);
        } else {
            this.f23682i.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24584d) {
            this.f23674a.setOnClickListener(onClickListener);
        } else {
            this.f23674a.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24587g) {
            this.f23678e.setOnClickListener(onClickListener);
        } else {
            this.f23678e.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24588h) {
            this.f23679f.setOnClickListener(onClickListener);
        } else {
            this.f23679f.setOnClickListener((View.OnClickListener) null);
        }
        if (r1Var.f24592l) {
            this.f23680g.setOnClickListener(onClickListener);
        } else {
            this.f23680g.setOnClickListener((View.OnClickListener) null);
        }
    }

    /* renamed from: a */
    public void mo63629a(View... viewArr) {
        if (getVisibility() == 0) {
            mo63627a(300, viewArr);
        }
    }

    /* renamed from: b */
    public void mo63630b(View... viewArr) {
        if (getVisibility() == 0) {
            mo63632d(viewArr);
        }
    }

    /* renamed from: c */
    public final void mo63631c(View... viewArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f23681h, View.SCALE_Y, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23681h, View.SCALE_X, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23682i, View.SCALE_Y, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23682i, View.SCALE_X, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23674a, View.ALPHA, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23676c, View.ALPHA, new float[]{1.0f}));
        if (this.f23677d.isEnabled()) {
            arrayList.add(ObjectAnimator.ofFloat(this.f23677d, View.ALPHA, new float[]{0.0f}));
        }
        arrayList.add(ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23675b, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23677d, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23680g, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23674a, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23676c, View.TRANSLATION_X, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23681h, View.TRANSLATION_Y, new float[]{0.0f}));
        arrayList.add(ObjectAnimator.ofFloat(this.f23682i, View.TRANSLATION_Y, new float[]{0.0f}));
        for (View ofFloat : viewArr) {
            arrayList.add(ObjectAnimator.ofFloat(ofFloat, View.TRANSLATION_Y, new float[]{0.0f}));
        }
        if (!TextUtils.isEmpty(this.f23676c.getText().toString())) {
            this.f23676c.setVisibility(0);
        }
        this.f23674a.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new C9632b());
        animatorSet.setDuration(300);
        animatorSet.start();
    }

    /* renamed from: d */
    public final void mo63632d(View... viewArr) {
        mo63627a(0, viewArr);
    }

    /* renamed from: e */
    public void mo63633e(View... viewArr) {
        mo63631c(viewArr);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredHeight2 = this.f23682i.getMeasuredHeight();
        int measuredWidth2 = this.f23682i.getMeasuredWidth();
        int i5 = (measuredHeight - measuredHeight2) / 2;
        C9804k6 k6Var = this.f23682i;
        int i6 = this.f23684k;
        k6Var.layout(i6, i5, i6 + measuredWidth2, measuredHeight2 + i5);
        int measuredWidth3 = this.f23681h.getMeasuredWidth();
        int measuredHeight3 = this.f23681h.getMeasuredHeight();
        int i7 = (measuredHeight - measuredHeight3) / 2;
        int i8 = this.f23684k;
        this.f23681h.layout((measuredWidth - measuredWidth3) - i8, i7, measuredWidth - i8, measuredHeight3 + i7);
        int i9 = this.f23684k;
        int i10 = measuredWidth2 + i9 + i9;
        C9829l6 l6Var = this.f23675b;
        l6Var.layout(i10, this.f23686m, l6Var.getMeasuredWidth() + i10, this.f23686m + this.f23675b.getMeasuredHeight());
        this.f23677d.layout(i10, this.f23675b.getBottom(), this.f23677d.getMeasuredWidth() + i10, this.f23675b.getBottom() + this.f23677d.getMeasuredHeight());
        this.f23680g.layout(i10, this.f23675b.getBottom(), this.f23680g.getMeasuredWidth() + i10, this.f23675b.getBottom() + this.f23680g.getMeasuredHeight());
        this.f23674a.layout(i10, this.f23675b.getBottom(), this.f23674a.getMeasuredWidth() + i10, this.f23675b.getBottom() + this.f23674a.getMeasuredHeight());
        this.f23676c.layout(i10, this.f23674a.getBottom(), this.f23676c.getMeasuredWidth() + i10, this.f23674a.getBottom() + this.f23676c.getMeasuredHeight());
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = size - (this.f23684k * 2);
        int size2 = (View.MeasureSpec.getSize(i2) / 4) - (this.f23686m * 2);
        int min = Math.min(size2, this.f23685l);
        this.f23682i.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        this.f23681h.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(min - (this.f23686m * 2), 1073741824));
        int measuredWidth = ((i3 - this.f23682i.getMeasuredWidth()) - this.f23681h.getMeasuredWidth()) - (this.f23684k * 2);
        this.f23675b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f23677d.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f23680g.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        this.f23674a.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2 - this.f23675b.getMeasuredHeight(), Integer.MIN_VALUE));
        this.f23676c.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        int measuredHeight = this.f23675b.getMeasuredHeight() + Math.max(this.f23674a.getMeasuredHeight(), this.f23677d.getMeasuredHeight()) + (this.f23686m * 2);
        if (this.f23676c.getVisibility() == 0) {
            measuredHeight += this.f23676c.getMeasuredHeight();
        }
        setMeasuredDimension(size, Math.max(this.f23681h.getMeasuredHeight(), Math.max(this.f23682i.getMeasuredHeight(), measuredHeight)) + (this.f23686m * 2));
    }

    public void setBanner(C9697f2 f2Var) {
        this.f23675b.getLeftText().setText(f2Var.getTitle());
        this.f23674a.setText(f2Var.getDescription());
        String disclaimer = f2Var.getDisclaimer();
        if (!TextUtils.isEmpty(disclaimer)) {
            this.f23676c.setVisibility(0);
            this.f23676c.setText(disclaimer);
        } else {
            this.f23676c.setVisibility(8);
        }
        ImageData icon = f2Var.getIcon();
        if (icon != null) {
            this.f23682i.setVisibility(0);
            this.f23682i.setImageData(icon);
        } else {
            this.f23682i.setVisibility(8);
        }
        this.f23681h.setText(f2Var.getCtaText());
        if (!"".equals(f2Var.getAgeRestrictions())) {
            this.f23675b.getRightBorderedView().setText(f2Var.getAgeRestrictions());
        } else {
            this.f23675b.getRightBorderedView().setVisibility(8);
        }
        C10059y8.m29839b(this.f23681h, -16733198, -16746839, this.f23683j.mo65778b(2));
        this.f23681h.setTextColor(-1);
        if ("store".equals(f2Var.getNavigationType())) {
            if (f2Var.getVotes() == 0 || f2Var.getRating() <= 0.0f) {
                this.f23677d.setEnabled(false);
                this.f23677d.setVisibility(8);
            } else {
                this.f23677d.setEnabled(true);
                this.f23678e.setRating(f2Var.getRating());
                this.f23679f.setText(String.valueOf(f2Var.getVotes()));
            }
            this.f23680g.setEnabled(false);
        } else {
            String domain = f2Var.getDomain();
            if (!TextUtils.isEmpty(domain)) {
                this.f23680g.setEnabled(true);
                this.f23680g.setText(domain);
            } else {
                this.f23680g.setEnabled(false);
                this.f23680g.setVisibility(8);
            }
            this.f23677d.setEnabled(false);
        }
        if (f2Var.getVideoBanner() == null || !f2Var.getVideoBanner().isAutoPlay()) {
            this.f23677d.setVisibility(8);
            this.f23680g.setVisibility(8);
        }
    }
}
