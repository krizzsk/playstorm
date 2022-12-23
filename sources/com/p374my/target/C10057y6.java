package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.my.target.y6 */
public class C10057y6 extends FrameLayout {

    /* renamed from: a */
    public final ImageView f25021a;

    public C10057y6(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f25021a = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f25021a.setImageBitmap(bitmap);
    }
}
