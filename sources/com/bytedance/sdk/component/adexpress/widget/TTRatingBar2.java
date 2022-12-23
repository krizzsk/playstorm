package com.bytedance.sdk.component.adexpress.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.adexpress.p096c.C2642b;
import com.bytedance.sdk.component.utils.C2984t;

public class TTRatingBar2 extends FrameLayout {

    /* renamed from: a */
    LinearLayout f6221a = new LinearLayout(getContext());

    /* renamed from: b */
    LinearLayout f6222b = new LinearLayout(getContext());

    /* renamed from: c */
    private float f6223c;

    /* renamed from: d */
    private float f6224d;

    /* renamed from: e */
    private Drawable f6225e;

    /* renamed from: f */
    private Drawable f6226f;

    /* renamed from: g */
    private double f6227g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6221a.setOrientation(0);
        this.f6221a.setGravity(GravityCompat.START);
        this.f6222b.setOrientation(0);
        this.f6222b.setGravity(GravityCompat.START);
        this.f6225e = C2984t.m8430c(context, "tt_star_thick");
        this.f6226f = C2984t.m8430c(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.f6225e;
    }

    public Drawable getStarFillDrawable() {
        return this.f6226f;
    }

    /* renamed from: a */
    public void mo17439a(double d, int i, int i2) {
        float f = (float) i2;
        this.f6223c = C2642b.m6899c(getContext(), f);
        this.f6224d = C2642b.m6899c(getContext(), f);
        this.f6227g = d;
        removeAllViews();
        for (int i3 = 0; i3 < 5; i3++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f6222b.addView(starImageView);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f6221a.addView(starImageView2);
        }
        addView(this.f6221a);
        addView(this.f6222b);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f6223c, (int) this.f6224d));
        imageView.setPadding(1, 4, 1, 0);
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f6221a.measure(i, i2);
        double d = this.f6227g;
        float f = this.f6223c;
        this.f6222b.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((float) ((int) d)) * f) + 1.0f)) + (((double) (f - 2.0f)) * (d - ((double) ((int) d))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f6221a.getMeasuredHeight(), 1073741824));
    }
}
