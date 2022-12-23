package com.smaato.sdk.rewarded;

public abstract class RewardedInterstitialAd {
    public abstract String getAdSpaceId();

    public abstract String getCreativeId();

    public abstract String getSessionId();

    public abstract boolean isAvailableForPresentation();

    public abstract void setCloseButtonEnabled(boolean z);

    /* access modifiers changed from: protected */
    public abstract void showAdInternal();

    public final void showAd() {
        showAdInternal();
    }
}
