package p009by.saygames.max;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.player.UnityPlayer;
import java.lang.Thread;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;
import p009by.saygames.SayKitEvents;
import p009by.saygames.aps.SayAmazonAdapter;

/* renamed from: by.saygames.max.SayMaxManager */
public class SayMaxManager {
    public static BackgroundCallback _backgroundCallback;
    /* access modifiers changed from: private */
    public static boolean _isAPSEnabled = false;
    /* access modifiers changed from: private */
    public static boolean sIsSdkInitialized = false;
    /* access modifiers changed from: private */
    public static AppLovinSdk sSdk;
    private static final ScheduledThreadPoolExecutor sThreadPoolExecutor = new ScheduledThreadPoolExecutor(3, new SdkThreadFactory());
    private static String sUserIdToSet;
    private static Boolean sVerboseLogging;

    /* renamed from: by.saygames.max.SayMaxManager$BackgroundCallback */
    public interface BackgroundCallback {
        void onEvent(String str);
    }

    public static void setSdkKey(String str) {
    }

    /* renamed from: by.saygames.max.SayMaxManager$SdkThreadFactory */
    private static class SdkThreadFactory implements ThreadFactory {
        private SdkThreadFactory() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "SayMax:Plugin:shared");
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable th) {
                    Log.e("SayMaxManager", "Caught unhandled exception", th);
                    SayKitEvents.track("max_exception", 0, 0, th.getMessage());
                }
            });
            return thread;
        }
    }

    private static Activity getCurrentActivity() {
        return UnityPlayer.currentActivity;
    }

    public static void initializeSdkWithAPS(String str, String str2, String str3, String str4, String str5, String str6, BackgroundCallback backgroundCallback) {
        final String str7 = str;
        final String str8 = str2;
        final String str9 = str3;
        final String str10 = str4;
        final String str11 = str5;
        final String str12 = str6;
        final BackgroundCallback backgroundCallback2 = backgroundCallback;
        getCurrentActivity().runOnUiThread(new Runnable() {
            public void run() {
                SayAmazonAdapter.instance.init(str7, str8, str9, str10);
                SayMaxManager.initializeSdk(str11, str12, backgroundCallback2);
                boolean unused = SayMaxManager._isAPSEnabled = true;
            }
        });
    }

    public static void initializeSdk(String str, String str2, BackgroundCallback backgroundCallback) {
        _backgroundCallback = backgroundCallback;
        AppLovinSdk instance = AppLovinSdk.getInstance(UnityPlayer.currentActivity.getApplicationContext());
        sSdk = instance;
        instance.setMediationProvider("max");
        AppLovinSdk.initializeSdk(UnityPlayer.currentActivity.getApplicationContext(), new AppLovinSdk.SdkInitializationListener() {
            public void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                boolean unused = SayMaxManager.sIsSdkInitialized = true;
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putString(jSONObject, "name", "OnSdkInitializedEvent");
                JsonUtils.putString(jSONObject, "consentDialogState", Integer.toString(appLovinSdkConfiguration.getConsentDialogState().ordinal()));
                JsonUtils.putString(jSONObject, "countryCode", appLovinSdkConfiguration.getCountryCode());
                JsonUtils.putString(jSONObject, "isSuccessfullyInitialized", String.valueOf(SayMaxManager.sSdk.isInitialized()));
                SayMaxManager.forwardUnityEvent(jSONObject);
            }
        });
        if (!TextUtils.isEmpty(sUserIdToSet)) {
            sSdk.setUserIdentifier(sUserIdToSet);
            sUserIdToSet = null;
        }
    }

    public static boolean isInitialized() {
        return sIsSdkInitialized;
    }

    public static void setUserId(String str) {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk != null) {
            appLovinSdk.setUserIdentifier(str);
            sUserIdToSet = null;
            return;
        }
        sUserIdToSet = str;
    }

    public static void showMediationDebugger() {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk == null) {
            Log.d("[MaxUnityPlugin]", "Failed to show mediation debugger - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
        } else {
            appLovinSdk.showMediationDebugger();
        }
    }

    public static String getSdkConfiguration() {
        if (sSdk == null) {
            Log.e("[MaxUnityPlugin]", "Failed to get SDK configuration - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        AppLovinSdkConfiguration configuration = sSdk.getConfiguration();
        JsonUtils.putString(jSONObject, "consentDialogState", Integer.toString(configuration.getConsentDialogState().ordinal()));
        JsonUtils.putString(jSONObject, "countryCode", configuration.getCountryCode());
        return jSONObject.toString();
    }

    public static int getConsentDialogState() {
        return (!sIsSdkInitialized ? AppLovinSdkConfiguration.ConsentDialogState.UNKNOWN : sSdk.getConfiguration().getConsentDialogState()).ordinal();
    }

    public static void setHasUserConsent(boolean z) {
        AppLovinPrivacySettings.setHasUserConsent(z, getCurrentActivity());
    }

    public static boolean hasUserConsent() {
        return AppLovinPrivacySettings.hasUserConsent(getCurrentActivity());
    }

    public static boolean isUserConsentSet() {
        return AppLovinPrivacySettings.isUserConsentSet(getCurrentActivity());
    }

    public static void setIsAgeRestrictedUser(boolean z) {
        AppLovinPrivacySettings.setIsAgeRestrictedUser(z, getCurrentActivity());
    }

    public static boolean isAgeRestrictedUser() {
        return AppLovinPrivacySettings.isAgeRestrictedUser(getCurrentActivity());
    }

    public static boolean isAgeRestrictedUserSet() {
        return AppLovinPrivacySettings.isAgeRestrictedUserSet(getCurrentActivity());
    }

    public static void setDoNotSell(boolean z) {
        AppLovinPrivacySettings.setDoNotSell(z, getCurrentActivity());
    }

    public static boolean isDoNotSell() {
        return AppLovinPrivacySettings.isDoNotSell(getCurrentActivity());
    }

    public static boolean isDoNotSellSet() {
        return AppLovinPrivacySettings.isDoNotSellSet(getCurrentActivity());
    }

    public static void createBanner(String str, String str2) {
        if (_isAPSEnabled) {
            SayAmazonAdapter.instance.createBanner();
        }
        SayMaxBanner.instance.createBanner(str.trim());
    }

    public static void showBanner(String str) {
        if (_isAPSEnabled) {
            SayAmazonAdapter.instance.loadBanner();
        } else {
            SayMaxBanner.instance.loadBanner();
        }
    }

    public static void destroyBanner(String str) {
        SayMaxBanner.instance.destroyBanner();
    }

    public static void hideBanner(String str) {
        SayMaxBanner.instance.hideBanner();
    }

    public static void setBannerBackgroundColor(String str, String str2) {
        SayMaxBanner.instance.setBannerBackgroundColor(str2);
    }

    public static void loadInterstitial(String str) {
        if (_isAPSEnabled) {
            SayAmazonAdapter.instance.loadInterstitial(str);
        } else {
            SayMaxInterstitial.instance.loadAdWithInit(str);
        }
    }

    public static boolean isInterstitialReady(String str) {
        return SayMaxInterstitial.instance.hasInterstitial();
    }

    public static void showInterstitial(String str, String str2, String str3) {
        SayMaxInterstitial.instance.showAd();
    }

    public static void loadRewardedAd(String str) {
        SayMaxRewarded.instance.loadAdWithInit(str);
    }

    public static boolean isRewardedAdReady(String str) {
        return SayMaxRewarded.instance.hasRewarded();
    }

    public static void showRewardedAd(String str, String str2, String str3) {
        SayMaxRewarded.instance.showAd();
    }

    public static boolean isTablet() {
        return AppLovinSdkUtils.isTablet(getCurrentActivity());
    }

    public static boolean getBoolean(String str, boolean z) {
        AppLovinSdk appLovinSdk = sSdk;
        return appLovinSdk == null ? z : appLovinSdk.getVariableService().getBoolean(str, z);
    }

    public static String getString(String str, String str2) {
        AppLovinSdk appLovinSdk = sSdk;
        return appLovinSdk == null ? str2 : appLovinSdk.getVariableService().getString(str, str2);
    }

    public static boolean isMuted() {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk == null) {
            return false;
        }
        return appLovinSdk.getSettings().isMuted();
    }

    public static void setMuted(boolean z) {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk != null) {
            appLovinSdk.getSettings().setMuted(z);
        }
    }

    public static float getScreenDensity() {
        return getCurrentActivity().getResources().getDisplayMetrics().density;
    }

    public static void setVerboseLogging(boolean z) {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk != null) {
            appLovinSdk.getSettings().setVerboseLogging(z);
            sVerboseLogging = null;
            return;
        }
        sVerboseLogging = Boolean.valueOf(z);
    }

    public static boolean isVerboseLoggingEnabled() {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk != null) {
            return appLovinSdk.getSettings().isVerboseLoggingEnabled();
        }
        Boolean bool = sVerboseLogging;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void setCreativeDebuggerEnabled(boolean z) {
        AppLovinSdk appLovinSdk = sSdk;
        if (appLovinSdk != null) {
            appLovinSdk.getSettings().setCreativeDebuggerEnabled(z);
        }
    }

    private static MaxAdFormat getDeviceSpecificAdViewAdFormat() {
        return AppLovinSdkUtils.isTablet(getCurrentActivity()) ? MaxAdFormat.LEADER : MaxAdFormat.BANNER;
    }

    public static float getAdaptiveBannerHeight(float f) {
        return (float) getDeviceSpecificAdViewAdFormat().getAdaptiveSize((int) f, getCurrentActivity()).getHeight();
    }

    /* access modifiers changed from: private */
    public static void forwardUnityEvent(JSONObject jSONObject) {
        forwardUnityEvent(jSONObject, false);
    }

    private static void forwardUnityEvent(final JSONObject jSONObject, final boolean z) {
        sThreadPoolExecutor.execute(new Runnable() {
            public void run() {
                String jSONObject = jSONObject.toString();
                if (z) {
                    SayMaxManager._backgroundCallback.onEvent(jSONObject);
                } else {
                    UnityPlayer.UnitySendMessage("MaxSdkCallbacks", "ForwardEvent", jSONObject);
                }
            }
        });
    }

    private static void logUninitializedAccessError(String str) {
        Log.e("AppLovinSdk", "[MaxUnityPlugin] ERROR: Failed to execute " + str + "() - please ensure the AppLovin MAX Unity Plugin has been initialized by calling 'MaxSdk.InitializeSdk();'!");
    }

    public static void SendEventToUnityMaxMediation(String str, MaxAd maxAd, MaxError maxError) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "name", str);
        String str2 = "";
        if (maxAd != null) {
            try {
                JsonUtils.putString(jSONObject, "adUnitId", maxAd.getAdUnitId());
                JsonUtils.putString(jSONObject, "adFormat", maxAd.getFormat().getLabel());
                JsonUtils.putString(jSONObject, "networkName", maxAd.getNetworkName());
                JsonUtils.putString(jSONObject, "networkPlacement", maxAd.getNetworkPlacement());
                JsonUtils.putString(jSONObject, "creativeId", !TextUtils.isEmpty(maxAd.getCreativeId()) ? maxAd.getCreativeId() : str2);
                JsonUtils.putString(jSONObject, "placement", !TextUtils.isEmpty(maxAd.getPlacement()) ? maxAd.getPlacement() : str2);
                JsonUtils.putString(jSONObject, "revenue", String.valueOf(maxAd.getRevenue()));
                JsonUtils.putString(jSONObject, "revenuePrecision", maxAd.getRevenuePrecision());
                if (maxAd.getWaterfall() != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    JsonUtils.putString(jSONObject2, "latencyMillis", String.valueOf(maxAd.getWaterfall().getLatencyMillis()));
                    JsonUtils.putJSONObject(jSONObject, "waterfallInfo", jSONObject2);
                }
                JsonUtils.putString(jSONObject, "dspName", maxAd.getDspName());
            } catch (Error | Exception e) {
                String message = e.getMessage();
                SayKitEvents.track("sk_exception", 0, 0, message, "SendEventToUnityMaxMediation: " + str);
            }
        }
        if (maxError != null) {
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putString(jSONObject3, IronSourceConstants.EVENTS_ERROR_CODE, Integer.toString(maxError.getCode()));
            JsonUtils.putString(jSONObject3, "errorMessage", maxError.getMessage());
            if (maxAd != null) {
                JsonUtils.putString(jSONObject3, "adUnitId", maxAd.getAdUnitId());
                JSONObject jSONObject4 = new JSONObject();
                JsonUtils.putString(jSONObject4, "latencyMillis", String.valueOf(maxAd.getWaterfall().getLatencyMillis()));
                JsonUtils.putJSONObject(jSONObject, "waterfallInfo", jSONObject4);
            }
            String adLoadFailureInfo = maxError.getAdLoadFailureInfo();
            if (!TextUtils.isEmpty(adLoadFailureInfo)) {
                str2 = adLoadFailureInfo;
            }
            JsonUtils.putString(jSONObject3, "adLoadFailureInfo", str2);
        }
        UnityPlayer.UnitySendMessage("MaxSdkCallbacks", "ForwardEvent", jSONObject.toString());
    }
}
