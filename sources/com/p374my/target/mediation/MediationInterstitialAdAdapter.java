package com.p374my.target.mediation;

import android.content.Context;

/* renamed from: com.my.target.mediation.MediationInterstitialAdAdapter */
public interface MediationInterstitialAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationInterstitialAdAdapter$MediationInterstitialAdListener */
    public interface MediationInterstitialAdListener {
        void onClick(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onDismiss(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onDisplay(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onLoad(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onNoAd(String str, MediationInterstitialAdAdapter mediationInterstitialAdAdapter);

        void onVideoCompleted(MediationInterstitialAdAdapter mediationInterstitialAdAdapter);
    }

    void dismiss();

    void load(MediationAdConfig mediationAdConfig, MediationInterstitialAdListener mediationInterstitialAdListener, Context context);

    void show(Context context);
}
