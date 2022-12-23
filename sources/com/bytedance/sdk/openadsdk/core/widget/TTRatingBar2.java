package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.C2984t;
import com.bytedance.sdk.openadsdk.core.C3578m;
import com.bytedance.sdk.openadsdk.utils.C4020v;

public class TTRatingBar2 extends FrameLayout {

    /* renamed from: h */
    private static final int f9687h = ((int) C4020v.m13305c(C3578m.m11231a(), 1.0f));

    /* renamed from: i */
    private static final int f9688i = ((int) C4020v.m13305c(C3578m.m11231a(), 0.0f));

    /* renamed from: j */
    private static final int f9689j = ((int) C4020v.m13305c(C3578m.m11231a(), 1.0f));

    /* renamed from: k */
    private static final int f9690k = ((int) C4020v.m13305c(C3578m.m11231a(), 3.0f));

    /* renamed from: a */
    LinearLayout f9691a = new LinearLayout(getContext());

    /* renamed from: b */
    LinearLayout f9692b = new LinearLayout(getContext());

    /* renamed from: c */
    private float f9693c;

    /* renamed from: d */
    private float f9694d;

    /* renamed from: e */
    private Drawable f9695e;

    /* renamed from: f */
    private Drawable f9696f;

    /* renamed from: g */
    private double f9697g;

    public TTRatingBar2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9691a.setOrientation(0);
        this.f9691a.setGravity(GravityCompat.START);
        this.f9692b.setOrientation(0);
        this.f9692b.setGravity(GravityCompat.START);
        this.f9695e = C2984t.m8430c(context, "tt_star_thick");
        this.f9696f = C2984t.m8430c(context, "tt_star");
    }

    public Drawable getStarEmptyDrawable() {
        return this.f9695e;
    }

    public Drawable getStarFillDrawable() {
        return this.f9696f;
    }

    /* renamed from: a */
    public void mo20511a(double d, int i, int i2) {
        float f = (float) i2;
        this.f9693c = (float) ((int) C4020v.m13305c(C3578m.m11231a(), f));
        this.f9694d = (float) ((int) C4020v.m13305c(C3578m.m11231a(), f));
        this.f9697g = d;
        this.f9691a.removeAllViews();
        this.f9692b.removeAllViews();
        removeAllViews();
        for (int i3 = 0; i3 < 5; i3++) {
            ImageView starImageView = getStarImageView();
            starImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView.setColorFilter(i);
            starImageView.setImageDrawable(getStarFillDrawable());
            this.f9692b.addView(starImageView);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            ImageView starImageView2 = getStarImageView();
            starImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
            starImageView2.setImageDrawable(getStarEmptyDrawable());
            this.f9691a.addView(starImageView2);
        }
        addView(this.f9691a);
        addView(this.f9692b);
        requestLayout();
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new ViewGroup.LayoutParams((int) this.f9693c, (int) this.f9694d));
        imageView.setPadding(f9687h, f9688i, f9689j, f9690k);
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f9691a.measure(i, i2);
        double d = this.f9697g;
        float f = this.f9693c;
        int i3 = f9687h;
        this.f9692b.measure(View.MeasureSpec.makeMeasureSpec((int) (((double) ((((float) ((int) d)) * f) + ((float) i3))) + (((double) (f - ((float) (i3 + f9689j)))) * (d - ((double) ((int) d))))), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f9691a.getMeasuredHeight(), 1073741824));
    }
}
