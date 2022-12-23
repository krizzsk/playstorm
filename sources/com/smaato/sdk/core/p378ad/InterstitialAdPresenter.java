package com.smaato.sdk.core.p378ad;

import android.view.View;
import com.smaato.sdk.core.p378ad.AdPresenter;

/* renamed from: com.smaato.sdk.core.ad.InterstitialAdPresenter */
public interface InterstitialAdPresenter extends AdPresenter {

    /* renamed from: com.smaato.sdk.core.ad.InterstitialAdPresenter$Listener */
    public interface Listener extends AdPresenter.Listener<InterstitialAdPresenter> {
        void onAdUnload(InterstitialAdPresenter interstitialAdPresenter);

        void onClose(InterstitialAdPresenter interstitialAdPresenter);

        void onOpen(InterstitialAdPresenter interstitialAdPresenter);
    }

    void onCloseClicked();

    void onError();

    void setFriendlyObstructionView(View view);

    void setListener(Listener listener);

    void setOnFinishListener(Runnable runnable);

    void setOnShowCloseButtonListener(Runnable runnable);
}
