package com.p374my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p374my.target.common.models.ImageData;
import com.p374my.target.nativeads.views.MediaAdView;

/* renamed from: com.my.target.h6 */
public class C9737h6 extends RelativeLayout {

    /* renamed from: a */
    public static final int f23998a = C10059y8.m29841c();

    /* renamed from: b */
    public final C9720g6 f23999b;

    /* renamed from: c */
    public final RelativeLayout.LayoutParams f24000c;

    /* renamed from: d */
    public final C9804k6 f24001d;

    /* renamed from: e */
    public final C9629b6 f24002e;

    /* renamed from: f */
    public final C10059y8 f24003f;

    /* renamed from: g */
    public ImageData f24004g;

    /* renamed from: h */
    public ImageData f24005h;

    /* renamed from: i */
    public final C10020w5 f24006i;

    public C9737h6(Context context) {
        super(context);
        setBackgroundColor(0);
        C10059y8 c = C10059y8.m29843c(context);
        this.f24003f = c;
        C9804k6 k6Var = new C9804k6(context);
        this.f24001d = k6Var;
        int i = f23998a;
        k6Var.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        k6Var.setLayoutParams(layoutParams);
        C10059y8.m29840b(k6Var, "image_view");
        addView(k6Var);
        C9720g6 g6Var = new C9720g6(context);
        this.f23999b = g6Var;
        g6Var.mo64102a(C9905p5.m28985a((int) TypedValue.applyDimension(1, 28.0f, context.getResources().getDisplayMetrics())), false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        this.f24000c = layoutParams2;
        layoutParams2.addRule(7, i);
        layoutParams2.addRule(6, i);
        g6Var.setLayoutParams(layoutParams2);
        C9629b6 b6Var = new C9629b6(context);
        this.f24002e = b6Var;
        C10020w5 w5Var = new C10020w5(context);
        this.f24006i = w5Var;
        w5Var.setVisibility(8);
        int b = c.mo65778b(10);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = b;
        layoutParams3.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(b, b, b, b);
        layoutParams4.addRule(5, i);
        layoutParams4.addRule(6, i);
        linearLayout.setOrientation(0);
        linearLayout.addView(b6Var);
        linearLayout.addView(w5Var, layoutParams3);
        C10059y8.m29840b(g6Var, "close_button");
        addView(g6Var);
        C10059y8.m29840b(b6Var, "age_bordering");
        addView(linearLayout, layoutParams4);
    }

    /* renamed from: a */
    public final void mo64179a() {
        Point b = C10059y8.m29837b(getContext());
        int i = b.x;
        int i2 = b.y;
        if (i > 0 && i2 > 0) {
            ImageData imageData = ((float) i) / ((float) i2) > 1.0f ? this.f24005h : this.f24004g;
            if (imageData == null && (imageData = this.f24005h) == null) {
                imageData = this.f24004g;
            }
            if (imageData != null) {
                this.f24001d.setImageData(imageData);
            }
        }
    }

    /* renamed from: a */
    public void mo64180a(ImageData imageData, ImageData imageData2, ImageData imageData3) {
        this.f24005h = imageData;
        this.f24004g = imageData2;
        Bitmap bitmap = imageData3 != null ? imageData3.getBitmap() : null;
        if (bitmap != null) {
            this.f23999b.mo64102a(bitmap, true);
            RelativeLayout.LayoutParams layoutParams = this.f24000c;
            int i = -this.f23999b.getMeasuredWidth();
            layoutParams.leftMargin = i;
            layoutParams.bottomMargin = i;
        }
        mo64179a();
    }

    /* renamed from: a */
    public void mo64181a(C9894p1 p1Var, View.OnClickListener onClickListener) {
        this.f24006i.setVisibility(0);
        this.f24006i.setImageBitmap(p1Var.mo65194c().getBitmap());
        this.f24006i.setOnClickListener(onClickListener);
    }

    public C9720g6 getCloseButton() {
        return this.f23999b;
    }

    public ImageView getImageView() {
        return this.f24001d;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo64179a();
    }

    public void setAgeRestrictions(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f24002e.mo63621a(1, -7829368);
            this.f24002e.setPadding(this.f24003f.mo65778b(2), 0, 0, 0);
            this.f24002e.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
            this.f24002e.mo63622a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f24003f.mo65778b(3));
            this.f24002e.setBackgroundColor(1711276032);
            this.f24002e.setText(str);
            return;
        }
        this.f24002e.setVisibility(8);
    }
}
