package com.smaato.sdk.core.p381ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.smaato.sdk.core.ui.AdContentView */
public abstract class AdContentView extends FrameLayout {
    public abstract void showProgressIndicator(boolean z);

    public AdContentView(Context context) {
        super(context);
    }

    public AdContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AdContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected static FrameLayout.LayoutParams generateDefaultLayoutParams(int i, int i2) {
        return new FrameLayout.LayoutParams(i, i2, 17);
    }
}
