package com.p374my.target.mediation;

import android.content.Context;
import android.view.View;
import com.p374my.target.ads.MyTargetView;

/* renamed from: com.my.target.mediation.MediationStandardAdAdapter */
public interface MediationStandardAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationStandardAdAdapter$MediationStandardAdListener */
    public interface MediationStandardAdListener {
        void onClick(MediationStandardAdAdapter mediationStandardAdAdapter);

        void onLoad(View view, MediationStandardAdAdapter mediationStandardAdAdapter);

        void onNoAd(String str, MediationStandardAdAdapter mediationStandardAdAdapter);

        void onShow(MediationStandardAdAdapter mediationStandardAdAdapter);
    }

    void load(MediationAdConfig mediationAdConfig, MyTargetView.AdSize adSize, MediationStandardAdListener mediationStandardAdListener, Context context);
}
