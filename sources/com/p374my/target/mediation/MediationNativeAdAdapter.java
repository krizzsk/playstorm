package com.p374my.target.mediation;

import android.content.Context;
import android.view.View;
import com.p374my.target.nativeads.banners.NativePromoBanner;
import java.util.List;

/* renamed from: com.my.target.mediation.MediationNativeAdAdapter */
public interface MediationNativeAdAdapter extends MediationAdapter {

    /* renamed from: com.my.target.mediation.MediationNativeAdAdapter$MediationNativeAdListener */
    public interface MediationNativeAdListener {
        void onClick(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onLoad(NativePromoBanner nativePromoBanner, MediationNativeAdAdapter mediationNativeAdAdapter);

        void onNoAd(String str, MediationNativeAdAdapter mediationNativeAdAdapter);

        void onShow(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoComplete(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoPause(MediationNativeAdAdapter mediationNativeAdAdapter);

        void onVideoPlay(MediationNativeAdAdapter mediationNativeAdAdapter);
    }

    View getMediaView(Context context);

    void load(MediationNativeAdConfig mediationNativeAdConfig, MediationNativeAdListener mediationNativeAdListener, Context context);

    void registerView(View view, List<View> list, int i);

    void unregisterView();
}
