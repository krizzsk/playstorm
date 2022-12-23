package p009by.saygames.max;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.player.UnityPlayer;

/* renamed from: by.saygames.max.SayMaxBanner */
public class SayMaxBanner implements MaxAdViewAdListener {
    public static SayMaxBanner instance = new SayMaxBanner();
    /* access modifiers changed from: private */
    public MaxAdView _bannerAd;

    public void onAdCollapsed(MaxAd maxAd) {
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
    }

    public void onAdDisplayed(MaxAd maxAd) {
    }

    public void onAdExpanded(MaxAd maxAd) {
    }

    public void onAdHidden(MaxAd maxAd) {
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
    }

    static Activity getActivity() {
        return UnityPlayer.currentActivity;
    }

    public void createBanner(final String str) {
        if (str == null || !str.isEmpty()) {
            getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    MaxAdView unused = SayMaxBanner.this._bannerAd = new MaxAdView(str, MaxAdFormat.BANNER, (Context) SayMaxBanner.getActivity());
                    SayMaxBanner.this._bannerAd.setListener(SayMaxBanner.instance);
                    SayMaxBanner.this._bannerAd.setLayoutParams(new FrameLayout.LayoutParams(-1, AppLovinSdkUtils.dpToPx(SayMaxBanner.getActivity(), MaxAdFormat.BANNER.getAdaptiveSize(SayMaxBanner.getActivity()).getHeight()), 80));
                    SayMaxBanner.this._bannerAd.setExtraParameter("adaptive_banner", "true");
                    ((ViewGroup) SayMaxBanner.getActivity().findViewById(16908290)).addView(SayMaxBanner.this._bannerAd);
                }
            });
        }
    }

    public void hideBanner() {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                if (SayMaxBanner.this._bannerAd != null) {
                    SayMaxBanner.this._bannerAd.setVisibility(8);
                    SayMaxBanner.this._bannerAd.stopAutoRefresh();
                }
            }
        });
    }

    public void destroyBanner() {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                if (SayMaxBanner.this._bannerAd != null) {
                    SayMaxBanner.this._bannerAd.destroy();
                }
            }
        });
    }

    public void loadBanner() {
        getActivity().runOnUiThread(new Runnable() {
            public void run() {
                if (SayMaxBanner.this._bannerAd != null) {
                    SayMaxBanner.this._bannerAd.loadAd();
                    SayMaxBanner.this._bannerAd.setVisibility(0);
                    SayMaxBanner.this._bannerAd.startAutoRefresh();
                }
            }
        });
    }

    public void setBannerBackgroundColor(String str) {
        int parseColor = Color.parseColor(str);
        MaxAdView maxAdView = this._bannerAd;
        if (maxAdView != null) {
            maxAdView.setBackgroundColor(parseColor);
        }
    }

    public void setLocalExtraParameterAndLoad(DTBAdResponse dTBAdResponse) {
        MaxAdView maxAdView = this._bannerAd;
        if (maxAdView != null) {
            maxAdView.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            loadBanner();
        }
    }

    public void setLocalExtraParameterAndLoad(AdError adError) {
        MaxAdView maxAdView = this._bannerAd;
        if (maxAdView != null) {
            maxAdView.setLocalExtraParameter("amazon_ad_error", adError);
            loadBanner();
        }
    }

    public void onAdLoaded(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnBannerAdLoadedEvent", maxAd, (MaxError) null);
    }

    public void onAdClicked(MaxAd maxAd) {
        SayMaxManager.SendEventToUnityMaxMediation("OnBannerAdClickedEvent", maxAd, (MaxError) null);
    }
}
