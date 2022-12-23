package com.smaato.sdk.interstitial;

import android.util.Log;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.KeyValuePairs;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.diinjection.Inject;
import java.util.Map;

public final class Interstitial {
    private static final String LOG_TAG = "Interstitial";
    @Inject
    private static volatile InterstitialLoader interstitialLoader;
    private static String mediationAdapterVersion;
    private static String mediationNetworkName;
    private static String mediationNetworkSDKVersion;

    private Interstitial() {
    }

    public static void loadAd(String str, EventListener eventListener) {
        loadAd(str, eventListener, (AdRequestParams) null);
    }

    public static void loadAd(String str, EventListener eventListener, AdRequestParams adRequestParams) {
        loadAd(str, eventListener, adRequestParams, false);
    }

    static void loadAd(String str, EventListener eventListener, AdRequestParams adRequestParams, boolean z) {
        InterstitialLoader initInstance = initInstance();
        if (initInstance == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized. SmaatoSdk.init() should be called before ad request");
            return;
        }
        if (!SmaatoSdk.isGPSEnabled()) {
            Log.w(LOG_TAG, "Usage of the GPS coordinates for advertising purposes is disabled. You can change that by setting setGPSLocation to TRUE.");
        }
        if (eventListener == null) {
            Log.e(LOG_TAG, "Failed to proceed with Interstitial::loadAd. Missing required parameter: eventListener");
            return;
        }
        String publisherId = SmaatoSdk.getPublisherId();
        if (TextUtils.isEmpty(publisherId)) {
            Log.e(LOG_TAG, "Failed to proceed with Interstitial::loadAd. Missing required parameter: publisherId");
            Threads.runOnUi(new Runnable(publisherId, str) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    EventListener.this.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.INVALID_REQUEST, this.f$1, this.f$2));
                }
            });
        } else if (TextUtils.isEmpty(str)) {
            Log.e(LOG_TAG, "Failed to proceed with Interstitial::loadAd. Missing required parameter: adSpaceId");
            Threads.runOnUi(new Runnable(publisherId, str) {
                public final /* synthetic */ String f$1;
                public final /* synthetic */ String f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    EventListener.this.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.INVALID_REQUEST, this.f$1, this.f$2));
                }
            });
        } else {
            initInstance.loadAd(publisherId, str, eventListener, AdFormat.INTERSTITIAL, mediationNetworkName, mediationNetworkSDKVersion, mediationAdapterVersion, adRequestParams, z);
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

    public static KeyValuePairs getKeyValuePairs() {
        InterstitialLoader initInstance = initInstance();
        if (initInstance != null) {
            return initInstance.getKeyValuePairs();
        }
        Log.e(LOG_TAG, "SmaatoSdk is not initialized. SmaatoSdk.init() should be called before ad request");
        return null;
    }

    public static void setKeyValuePairs(KeyValuePairs keyValuePairs) {
        InterstitialLoader initInstance = initInstance();
        if (initInstance == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized. SmaatoSdk.init() should be called before ad request");
        } else {
            initInstance.setKeyValuePairs(keyValuePairs);
        }
    }

    public static void setObjectExtras(Map<String, Object> map) {
        InterstitialLoader initInstance = initInstance();
        if (initInstance == null) {
            Log.e(LOG_TAG, "SmaatoSdk is not initialized. SmaatoSdk.init() should be called before ad request");
        } else if (map != null) {
            initInstance.setObjectExtras(map);
        }
    }

    private static InterstitialLoader initInstance() {
        if (interstitialLoader == null) {
            synchronized (InterstitialLoader.class) {
                if (interstitialLoader == null) {
                    AndroidsInjector.injectStatic(Interstitial.class);
                }
            }
        }
        return interstitialLoader;
    }
}
