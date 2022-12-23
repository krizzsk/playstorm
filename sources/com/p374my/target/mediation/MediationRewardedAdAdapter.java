package com.p374my.target.mediation;

import android.content.Context;
import com.p374my.target.ads.Reward;

/* renamed from: com.my.target.mediation.MediationRewardedAdAdapter */
public interface MediationRewardedAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationRewardedAdAdapter$MediationRewardedAdListener */
    public interface MediationRewardedAdListener {
        void onClick(MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDismiss(MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onDisplay(MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onLoad(MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onNoAd(String str, MediationRewardedAdAdapter mediationRewardedAdAdapter);

        void onReward(Reward reward, MediationRewardedAdAdapter mediationRewardedAdAdapter);
    }

    void dismiss();

    void load(MediationAdConfig mediationAdConfig, MediationRewardedAdListener mediationRewardedAdListener, Context context);

    void show(Context context);
}
