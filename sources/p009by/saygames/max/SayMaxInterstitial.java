package p009by.saygames.max;

import android.app.Activity;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.unity3d.player.UnityPlayer;

/* renamed from: by.saygames.max.SayMaxInterstitial */
public class SayMaxInterstitial implements MaxAdListener {
    private static MaxInterstitialAd _interstitialAd;
    public static SayMaxInterstitial instance = new SayMaxInterstitial();
    private String _interstitialId;

    static Activity getActivity() {
        return UnityPlayer.currentActivity;
    }

    public void init(String str) {
        if (_interstitialAd == null) {
            this._interstitialId = str;
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(this._interstitialId, getActivity());
            _interstitialAd = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
        }
    }

    public void loadAdWithInit(String str) {
        init(str);
        MaxInterstitialAd maxInterstitialAd = _interstitialAd;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.loadAd();
        }
    }

    public void loadAd() {
        MaxInterstitialAd maxInterstitialAd = _interstitialAd;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.loadAd();
        }
    }

    public void setLocalExtraParameterAndLoad(DTBAdResponse dTBAdResponse) {
        _interstitialAd.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
    }

    public void setLocalExtraParameterAndLoad(AdError adError) {
        _interstitialAd.setLocalExtraParameter("amazon_ad_error", adError);
    }

    public boolean hasInterstitial() {
        MaxInterstitialAd maxInterstitialAd = _interstitialAd;
        if (maxInterstitialAd == null) {
            return false;
        }
        return maxInterstitialAd.isReady();
    }

    public void showAd() {
        MaxInterstitialAd maxInterstitialAd = _interstitialAd;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.showAd(this._interstitialId);
        }
    }

    public void onAdLoaded(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnInterstitialLoadedEvent", maxAd, (MaxError) null);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnInterstitialDisplayedEvent", maxAd, (MaxError) null);
    }

    public void onAdHidden(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnInterstitialHiddenEvent", maxAd, (MaxError) null);
    }

    public void onAdClicked(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnInterstitialClickedEvent", maxAd, (MaxError) null);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        SayMaxManager.SendEventToUnityMaxMediation("OnInterstitialLoadFailedEvent", (MaxAd) null, maxError);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        SayMaxManager.SendEventToUnityMaxMediation("OnInterstitialAdFailedToDisplayEvent", maxAd, maxError);
    }
}
