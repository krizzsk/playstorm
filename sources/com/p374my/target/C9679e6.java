package com.p374my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: com.my.target.e6 */
public class C9679e6 extends FrameLayout {

    /* renamed from: a */
    public final ImageView f23800a;

    public C9679e6(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f23800a = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f23800a.setImageBitmap(bitmap);
    }
}
