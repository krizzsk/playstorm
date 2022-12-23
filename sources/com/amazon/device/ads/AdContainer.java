package com.amazon.device.ads;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: DTBAdUtil */
class AdContainer extends LinearLayout {
    View adView;
    int orientation = AdRegistration.getContext().getResources().getConfiguration().orientation;

    AdContainer(Context context) {
        super(context);
        setOrientation(1);
    }

    /* access modifiers changed from: package-private */
    public void setAdView(View view) {
        this.adView = view;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.orientation == AdRegistration.getContext().getResources().getConfiguration().orientation) {
            View view = this.adView;
            if (view instanceof DTBAdView) {
                ((DTBAdView) view).onAdRemoved();
            }
            this.adView = null;
        }
    }
}
