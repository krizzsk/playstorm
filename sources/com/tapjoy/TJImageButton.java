package com.tapjoy;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class TJImageButton extends ImageButton {

    /* renamed from: a */
    private Bitmap f27404a;

    /* renamed from: b */
    private Bitmap f27405b;

    public TJImageButton(Context context) {
        super(context);
    }

    public TJImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TJImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TJImageButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setEnabledImageBitmap(Bitmap bitmap) {
        this.f27404a = bitmap;
    }

    public void setDisableImageBitmap(Bitmap bitmap) {
        this.f27405b = bitmap;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setImageBitmap(z ? this.f27404a : this.f27405b);
    }
}
