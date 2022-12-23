package com.p374my.target.mediation;

import android.content.Context;
import android.text.TextUtils;
import com.p374my.target.C9672e0;
import com.p374my.target.C9963t2;
import com.p374my.target.ads.InterstitialAd;
import com.p374my.target.common.CustomParams;
import com.p374my.target.mediation.MediationInterstitialAdAdapter;
import java.util.Map;

/* renamed from: com.my.target.mediation.MyTargetInterstitialAdAdapter */
public final class MyTargetInterstitialAdAdapter implements MediationInterstitialAdAdapter {

    /* renamed from: ad */
    private InterstitialAd f24352ad;
    private C9963t2 section;

    /* renamed from: com.my.target.mediation.MyTargetInterstitialAdAdapter$AdListener */
    public class AdListener implements InterstitialAd.InterstitialAdListener {
        private final MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationListener;

        public AdListener(MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationInterstitialAdListener) {
            this.mediationListener = mediationInterstitialAdListener;
        }

        public void onClick(InterstitialAd interstitialAd) {
            C9672e0.m27882a("MyTargetInterstitialAdAdapter: ad clicked");
            this.mediationListener.onClick(MyTargetInterstitialAdAdapter.this);
        }

        public void onDismiss(InterstitialAd interstitialAd) {
            C9672e0.m27882a("MyTargetInterstitialAdAdapter: ad dismissed");
            this.mediationListener.onDismiss(MyTargetInterstitialAdAdapter.this);
        }

        public void onDisplay(InterstitialAd interstitialAd) {
            C9672e0.m27882a("MyTargetInterstitialAdAdapter: ad displayed");
            this.mediationListener.onDisplay(MyTargetInterstitialAdAdapter.this);
        }

        public void onLoad(InterstitialAd interstitialAd) {
            C9672e0.m27882a("MyTargetInterstitialAdAdapter: ad loaded");
            this.mediationListener.onLoad(MyTargetInterstitialAdAdapter.this);
        }

        public void onNoAd(String str, InterstitialAd interstitialAd) {
            C9672e0.m27882a("MyTargetInterstitialAdAdapter: no ad (" + str + ")");
            this.mediationListener.onNoAd(str, MyTargetInterstitialAdAdapter.this);
        }

        public void onVideoCompleted(InterstitialAd interstitialAd) {
            C9672e0.m27882a("MyTargetInterstitialAdAdapter: video completed");
            this.mediationListener.onVideoCompleted(MyTargetInterstitialAdAdapter.this);
        }
    }

    public void destroy() {
        InterstitialAd interstitialAd = this.f24352ad;
        if (interstitialAd != null) {
            interstitialAd.setListener((InterstitialAd.InterstitialAdListener) null);
            this.f24352ad.destroy();
            this.f24352ad = null;
        }
    }

    public void dismiss() {
        InterstitialAd interstitialAd = this.f24352ad;
        if (interstitialAd != null) {
            interstitialAd.dismiss();
        }
    }

    public void load(MediationAdConfig mediationAdConfig, MediationInterstitialAdAdapter.MediationInterstitialAdListener mediationInterstitialAdListener, Context context) {
        String placementId = mediationAdConfig.getPlacementId();
        try {
            int parseInt = Integer.parseInt(placementId);
            InterstitialAd interstitialAd = new InterstitialAd(parseInt, context);
            this.f24352ad = interstitialAd;
            interstitialAd.setMediationEnabled(false);
            this.f24352ad.setListener(new AdListener(mediationInterstitialAdListener));
            CustomParams customParams = this.f24352ad.getCustomParams();
            customParams.setAge(mediationAdConfig.getAge());
            customParams.setGender(mediationAdConfig.getGender());
            for (Map.Entry next : mediationAdConfig.getServerParams().entrySet()) {
                customParams.setCustomParam((String) next.getKey(), (String) next.getValue());
            }
            String payload = mediationAdConfig.getPayload();
            if (this.section != null) {
                C9672e0.m27882a("MyTargetInterstitialAdAdapter: got banner from mediation response");
                this.f24352ad.handleSection(this.section);
            } else if (TextUtils.isEmpty(payload)) {
                C9672e0.m27882a("MyTargetInterstitialAdAdapter: load id " + parseInt);
                this.f24352ad.load();
            } else {
                C9672e0.m27882a("MyTargetInterstitialAdAdapter: load id " + parseInt + " from BID " + payload);
                this.f24352ad.loadFromBid(payload);
            }
        } catch (Throwable unused) {
            String str = "failed to request ad, unable to convert slotId " + placementId + " to int";
            C9672e0.m27883b("MyTargetInterstitialAdAdapter error: " + str);
            mediationInterstitialAdListener.onNoAd(str, this);
        }
    }

    public void setSection(C9963t2 t2Var) {
        this.section = t2Var;
    }

    public void show(Context context) {
        InterstitialAd interstitialAd = this.f24352ad;
        if (interstitialAd != null) {
            interstitialAd.show();
        }
    }
}
