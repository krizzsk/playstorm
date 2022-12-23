package p009by.saygames.aps;

import android.app.Activity;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdNetwork;
import com.amazon.device.ads.DTBAdNetworkInfo;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.MRAIDPolicy;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdkUtils;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import com.unity3d.player.UnityPlayer;
import p009by.saygames.SayKitEvents;
import p009by.saygames.max.SayMaxBanner;
import p009by.saygames.max.SayMaxInterstitial;

/* renamed from: by.saygames.aps.SayAmazonAdapter */
public class SayAmazonAdapter {
    public static SayAmazonAdapter instance = new SayAmazonAdapter();
    private DTBAdRequest _adLoader;
    private String _bannerLeaderSlotId;
    private String _bannerSlotId;
    private String _interstitialSlotId;
    private boolean _isInterstitialLoaded;
    /* access modifiers changed from: private */
    public String _maxInterstitialAdUnitId;

    static Activity getActivity() {
        return UnityPlayer.currentActivity;
    }

    public void init(String str, String str2, String str3, String str4) {
        this._bannerSlotId = str2;
        this._bannerLeaderSlotId = str3;
        this._interstitialSlotId = str4;
        AdRegistration.getInstance(str, getActivity());
        AdRegistration.setAdNetworkInfo(new DTBAdNetworkInfo(DTBAdNetwork.MAX));
        AdRegistration.setMRAIDSupportedVersions(new String[]{"1.0", "2.0", MraidEnvironmentProperties.VERSION});
        AdRegistration.setMRAIDPolicy(MRAIDPolicy.CUSTOM);
    }

    public void createBanner() {
        MaxAdFormat maxAdFormat;
        String str;
        if (AppLovinSdkUtils.isTablet(getActivity().getApplicationContext())) {
            str = this._bannerLeaderSlotId;
            maxAdFormat = MaxAdFormat.LEADER;
        } else {
            str = this._bannerSlotId;
            maxAdFormat = MaxAdFormat.BANNER;
        }
        AppLovinSdkUtils.Size size = maxAdFormat.getSize();
        DTBAdSize dTBAdSize = new DTBAdSize(size.getWidth(), size.getHeight(), str);
        DTBAdRequest dTBAdRequest = new DTBAdRequest();
        this._adLoader = dTBAdRequest;
        dTBAdRequest.setSizes(dTBAdSize);
    }

    public void loadBanner() {
        DTBAdRequest dTBAdRequest = this._adLoader;
        if (dTBAdRequest != null) {
            dTBAdRequest.loadAd(new DTBAdCallback() {
                public void onSuccess(DTBAdResponse dTBAdResponse) {
                    SayMaxBanner.instance.setLocalExtraParameterAndLoad(dTBAdResponse);
                    SayKitEvents.track("aps_banner_loaded", 0, 0, dTBAdResponse.getImpressionUrl() != null ? dTBAdResponse.getImpressionUrl() : "");
                }

                public void onFailure(AdError adError) {
                    SayMaxBanner.instance.setLocalExtraParameterAndLoad(adError);
                    SayKitEvents.track("aps_banner_error", 0, 0, adError.getMessage() != null ? adError.getMessage() : "");
                }
            });
        }
    }

    public void loadInterstitial(String str) {
        this._maxInterstitialAdUnitId = str;
        if (!this._isInterstitialLoaded) {
            this._isInterstitialLoaded = true;
            DTBAdRequest dTBAdRequest = new DTBAdRequest();
            dTBAdRequest.setSizes(new DTBAdSize.DTBInterstitialAdSize(this._interstitialSlotId));
            dTBAdRequest.loadAd(new DTBAdCallback() {
                public void onSuccess(DTBAdResponse dTBAdResponse) {
                    SayMaxInterstitial.instance.init(SayAmazonAdapter.this._maxInterstitialAdUnitId);
                    SayMaxInterstitial.instance.setLocalExtraParameterAndLoad(dTBAdResponse);
                    SayMaxInterstitial.instance.loadAd();
                    SayKitEvents.track("aps_interstitial_loaded", 0, 0, dTBAdResponse.getImpressionUrl() != null ? dTBAdResponse.getImpressionUrl() : "");
                }

                public void onFailure(AdError adError) {
                    SayMaxInterstitial.instance.init(SayAmazonAdapter.this._maxInterstitialAdUnitId);
                    SayMaxInterstitial.instance.setLocalExtraParameterAndLoad(adError);
                    SayMaxInterstitial.instance.loadAd();
                    SayKitEvents.track("aps_interstitial_error", 0, 0, adError.getMessage() != null ? adError.getMessage() : "");
                }
            });
            return;
        }
        SayMaxInterstitial.instance.loadAdWithInit(this._maxInterstitialAdUnitId);
    }
}
