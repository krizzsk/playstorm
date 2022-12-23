package com.smaato.sdk.interstitial;

import android.app.Activity;
import androidx.core.view.ViewCompat;

public abstract class InterstitialAd {
    protected int backgroundColor = ViewCompat.MEASURED_STATE_MASK;

    public abstract String getAdSpaceId();

    public abstract String getCreativeId();

    public abstract String getSessionId();

    public abstract boolean isAvailableForPresentation();

    /* access modifiers changed from: protected */
    public abstract void showAdInternal(Activity activity, boolean z);

    public final void showAd(Activity activity) {
        showAdInternal(activity, false);
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }
}
