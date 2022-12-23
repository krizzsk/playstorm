package com.p374my.target.mediation;

import android.content.Context;
import android.view.View;
import com.p374my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.mediation.MediationNativeBannerAdAdapter */
public interface MediationNativeBannerAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationNativeBannerAdAdapter$MediationNativeBannerAdListener */
    public interface MediationNativeBannerAdListener {
        void onClick(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onLoad(NativeBanner nativeBanner, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onNoAd(String str, MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);

        void onShow(MediationNativeBannerAdAdapter mediationNativeBannerAdAdapter);
    }

    View getIconView(Context context);

    void load(MediationNativeBannerAdConfig mediationNativeBannerAdConfig, MediationNativeBannerAdListener mediationNativeBannerAdListener, Context context);

    void registerView(View view, List<View> list, int i);

    void unregisterView();
}
