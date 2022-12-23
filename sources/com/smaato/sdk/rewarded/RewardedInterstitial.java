package com.smaato.sdk.rewarded;

import android.util.Log;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.KeyValuePairs;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.diinjection.Inject;
import java.util.Map;

public final class RewardedInterstitial {
    private static final String LOG_TAG = "RewardedInterstitial";
    private static String mediationAdapterVersion;
    private static String mediationNetworkName;
    private static String mediationNetworkSDKVersion;
    @Inject
    private static volatile RewardedInterstitialInstance rewardedAdsInstance;

    private RewardedInterstitial() {
    }

    private static RewardedInterstitialInstance initInstance() {
        Class<RewardedInterstitial> cls = RewardedInterstitial.class;
        if (rewardedAdsInstance == null) {
            synchronized (cls) {
                if (rewardedAdsInstance == null) {
                    AndroidsInjector.injectStatic(cls);
                }
            }
        }
        return rewardedAdsInstance;
    }

    public static void loadAd(String str, EventListener eventListener) {
        loadAd(str, eventListener, (AdRequestParams) null);
    }

    public static void loadAd(String str, EventListener eventListener, AdRequestParams adRequestParams) {
        RewardedInterstitialInstance initInstance = initInstance();
        if (initInstance == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized. SmaatoSdk.init() should be called before ad request");
            return;
        }
        if (!SmaatoSdk.isGPSEnabled()) {
            Log.w(LOG_TAG, "Usage of the GPS coordinates for advertising purposes is disabled. You can change that by setting setGPSLocation to TRUE.");
        }
        String publisherId = SmaatoSdk.getPublisherId();
        if (TextUtils.isEmpty(publisherId)) {
            Log.e(LOG_TAG, "Failed to proceed with RewardedInterstitial::loadAd. Missing required parameter: publisherId");
            Threads.runOnUi(new Runnable(publisherId, str) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    EventListener.this.onAdFailedToLoad(new RewardedRequestError(RewardedError.INVALID_REQUEST, this.f$1, this.f$2));
                }
            });
            return;
        }
        initInstance.loadAd(publisherId, str, eventListener, mediationNetworkName, mediationNetworkSDKVersion, mediationAdapterVersion, adRequestParams);
    }

    public static KeyValuePairs getKeyValuePairs() {
        RewardedInterstitialInstance initInstance = initInstance();
        if (initInstance != null) {
            return initInstance.getKeyValuePairs();
        }
        Log.e(LOG_TAG, "SmaatoSdk is not initialized. SmaatoSdk.init() should be called before ad request");
        return null;
    }

    public static void setKeyValuePairs(KeyValuePairs keyValuePairs) {
        RewardedInterstitialInstance initInstance = initInstance();
        if (initInstance == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized. SmaatoSdk.init() should be called before ad request");
        } else {
            initInstance.setKeyValuePairs(keyValuePairs);
        }
    }

    public static void setMediationNetworkName(String str) {
        mediationNetworkName = str;
    }

    public static void setMediationNetworkSDKVersion(String str) {
        mediationNetworkSDKVersion = str;
    }

    public static void setMediationAdapterVersion(String str) {
        mediationAdapterVersion = str;
    }

    public static void setObjectExtras(Map<String, Object> map) {
        RewardedInterstitialInstance initInstance = initInstance();
        if (initInstance == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized. SmaatoSdk.init() should be called before ad request");
        } else if (map != null) {
            initInstance.setObjectExtras(map);
        }
    }
}
