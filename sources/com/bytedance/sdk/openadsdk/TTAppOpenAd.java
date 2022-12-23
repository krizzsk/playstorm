package com.bytedance.sdk.openadsdk;

import android.app.Activity;

public interface TTAppOpenAd {

    public interface AppOpenAdInteractionListener {
        void onAdClicked();

        void onAdCountdownToZero();

        void onAdShow();

        void onAdSkip();
    }

    void setOpenAdInteractionListener(AppOpenAdInteractionListener appOpenAdInteractionListener);

    void showAppOpenAd(Activity activity);
}
