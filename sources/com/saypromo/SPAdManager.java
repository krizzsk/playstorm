package com.saypromo;

import android.app.Activity;
import android.text.TextUtils;
import com.saypromo.base.AdStateType;
import com.saypromo.base.AdToken;
import com.saypromo.base.SPDebugLog;
import com.saypromo.core.ExecutorService;
import com.saypromo.core.device.AdvertisingId;
import com.saypromo.core.device.Device;
import com.saypromo.core.log.DeviceLog;
import com.saypromo.core.misc.Utilities;
import com.saypromo.core.properties.ClientProperties;
import com.saypromo.listeners.ISayPromoAdsExtendedListener;
import com.saypromo.listeners.ISayPromoMaxTokenListener;
import java.util.Map;

public class SPAdManager {
    private static final String APP_ID_KEY = "appId";
    public static int InternalVersion = 13;
    private static final String PLACEMENT_ID_KEY = "placeId";
    /* access modifiers changed from: private */
    public static String _advertisingId = null;
    /* access modifiers changed from: private */
    public static String _interstitialAppId = "";
    /* access modifiers changed from: private */
    public static String _rewardedAppId = "";
    /* access modifiers changed from: private */
    public static ISayPromoAdsExtendedListener interstitialListener = null;
    private static boolean isNeedToSkipInterstitialRequestLoading = false;
    private static boolean isNeedToSkipRewardedRequestLoading = false;
    /* access modifiers changed from: private */
    public static ISayPromoAdsExtendedListener rewardedListener;

    public interface AdsFileNames {
        public static final String InterstitialVideo = "InterstitialVideo";
        public static final String InterstitialWeb = "InterstitialWeb.html";
        public static final String RewardedVideo = "RewardedVideo";
        public static final String RewardedWeb = "RewardedWeb.html";
    }

    public enum FinishState {
        ERROR,
        SKIPPED,
        COMPLETED
    }

    public enum PlacementState {
        READY,
        NOT_AVAILABLE,
        DISABLED,
        WAITING,
        NO_FILL
    }

    public enum SayPromoAdsError {
        NOT_INITIALIZED,
        INITIALIZE_FAILED,
        INVALID_ARGUMENT,
        VIDEO_PLAYER_ERROR,
        INIT_SANITY_CHECK_FAIL,
        AD_BLOCKER_DETECTED,
        FILE_IO_ERROR,
        DEVICE_ID_ERROR,
        SHOW_ERROR,
        INTERNAL_ERROR,
        NO_FILL
    }

    public enum SayPromoListenerResult {
        onSayPromoAdsReady,
        onSayPromoAdsStart,
        onSayPromoAdsClick,
        onSayPromoAdsFinish
    }

    public static void setSkipInterstitialRequestLoadingFlag(Boolean bool) {
        isNeedToSkipInterstitialRequestLoading = bool.booleanValue();
    }

    public static void setSkipRewardedRequestLoadingFlag(Boolean bool) {
        isNeedToSkipRewardedRequestLoading = bool.booleanValue();
    }

    public static String getSDKVersion() {
        return Device.getVersionName();
    }

    public static void getMaxToken(final Activity activity, final String str, final String str2, final ISayPromoMaxTokenListener iSayPromoMaxTokenListener) {
        SPDebugLog.sharedInstance.StartLogging();
        SPDebugLog.sharedInstance.trackEventWithoutId(str, str2, "token_request");
        ClientProperties.setActivity(activity);
        ClientProperties.setApplicationContext(activity.getApplicationContext());
        String str3 = _advertisingId;
        if (str3 == null || str3.isEmpty()) {
            ExecutorService.getInstance().ExecuteTask(new Runnable() {
                public void run() {
                    try {
                        AdvertisingId.init(activity);
                        String unused = SPAdManager._advertisingId = AdvertisingId.getAdvertisingTrackingId();
                        iSayPromoMaxTokenListener.onMaxTokenGenerated(new AdToken().GenerateToken(str, str2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            return;
        }
        try {
            iSayPromoMaxTokenListener.onMaxTokenGenerated(new AdToken().GenerateToken(str, str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadMaxInterstitial(Activity activity, String str, String str2, String str3, ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener) {
        if (str3 != null) {
            SPDebugLog.sharedInstance.trackEventWithoutId(str, str2, "ad_request_markup");
            loadInterstitial(activity, str, str2, Utilities.DecodeAdMarkup(str3), iSayPromoAdsExtendedListener);
            return;
        }
        if (iSayPromoAdsExtendedListener != null) {
            iSayPromoAdsExtendedListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Initialize markup failed.");
        }
        SPDebugLog.sharedInstance.trackEventWithoutId(str, str2, "ad_request_bad_markup", "adMarkup is null", 1, 0, 0);
    }

    public static void loadMaxRewarded(Activity activity, String str, String str2, String str3, ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener) {
        if (str3 != null) {
            SPDebugLog.sharedInstance.trackEventWithoutId(str, str2, "ad_request_load");
            loadRewarded(activity, str, str2, Utilities.DecodeAdMarkup(str3), iSayPromoAdsExtendedListener);
            return;
        }
        if (iSayPromoAdsExtendedListener != null) {
            iSayPromoAdsExtendedListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Initialize markup failed.");
        }
        SPDebugLog.sharedInstance.trackEventWithoutId(str, str2, "ad_request_bad_markup", "adMarkup is null", 2, 0, 0);
    }

    public static void requestInterstitialWithCustomEventInfo(final Activity activity, String str, final String str2, ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener) {
        SPInterstitialManager.StartSession();
        SPInterstitialManager.DebugId = SPDebugLog.sharedInstance.newDebugLogger(SPInterstitialManager.DebugId);
        if (isNeedToSkipInterstitialRequestLoading) {
            DeviceLog.warning("Request Interstitial loading is skipped. Please, check SkipInterstitialRequestLoadingFlag.");
            if (iSayPromoAdsExtendedListener != null) {
                iSayPromoAdsExtendedListener.onSayPromoAdsError(SayPromoAdsError.NO_FILL, "Ad is not filled.");
                return;
            }
            return;
        }
        AdStateType GetStateType = SPInterstitialManager.GetStateType();
        if (GetStateType == AdStateType.AdNoneStateType || GetStateType == AdStateType.AdErrorStateType) {
            _interstitialAppId = str;
            ClientProperties.setActivity(activity);
            ClientProperties.setApplicationContext(activity.getApplicationContext());
            interstitialListener = iSayPromoAdsExtendedListener;
            SPInterstitialManager.TrackDebugEventWithoutCheck("sdk_request", "", 0, 0);
            String str3 = _advertisingId;
            if (str3 == null || str3.isEmpty()) {
                ExecutorService.getInstance().ExecuteTask(new Runnable() {
                    public void run() {
                        try {
                            AdvertisingId.init(activity);
                            String unused = SPAdManager._advertisingId = AdvertisingId.getAdvertisingTrackingId();
                            SPInterstitialManager.requestSyncInterstitial(SPAdManager.interstitialListener, SPAdManager._interstitialAppId, str2);
                        } catch (Exception e) {
                            e.printStackTrace();
                            if (SPAdManager.interstitialListener != null) {
                                SPAdManager.interstitialListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Initialize failed.");
                            }
                        }
                    }
                });
            } else {
                SPInterstitialManager.requestInterstitial(interstitialListener, _interstitialAppId, str2);
            }
        } else {
            DeviceLog.warning("Interstitial ads was loaded from different listener. Please, check loading waterfall.");
            SPInterstitialManager.TrackDebugEvent("ad_request_double_error", "Interstitial ads was loaded from different listener. State: " + GetStateType.getStringValue(), 0, 0, 0);
            iSayPromoAdsExtendedListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Interstitial ads was loaded from different listener.");
        }
    }

    public static void loadInterstitial(final Activity activity, String str, final String str2, final String str3, ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener) {
        SPInterstitialManager.StartSession();
        SPInterstitialManager.DebugId = SPDebugLog.sharedInstance.newDebugLogger(SPInterstitialManager.DebugId);
        AdStateType GetStateType = SPInterstitialManager.GetStateType();
        if (GetStateType == AdStateType.AdNoneStateType || GetStateType == AdStateType.AdErrorStateType) {
            _interstitialAppId = str;
            ClientProperties.setActivity(activity);
            ClientProperties.setApplicationContext(activity.getApplicationContext());
            interstitialListener = iSayPromoAdsExtendedListener;
            String str4 = _advertisingId;
            if (str4 == null || str4.isEmpty()) {
                SPInterstitialManager.TrackDebugEventWithoutCheck("sdk_request", "", 1, 0);
                ExecutorService.getInstance().ExecuteTask(new Runnable() {
                    public void run() {
                        try {
                            AdvertisingId.init(activity);
                            String unused = SPAdManager._advertisingId = AdvertisingId.getAdvertisingTrackingId();
                            SPInterstitialManager.loadSyncInterstitialAd(SPAdManager.interstitialListener, SPAdManager._interstitialAppId, str2, str3);
                        } catch (Exception e) {
                            e.printStackTrace();
                            if (SPAdManager.interstitialListener != null) {
                                SPAdManager.interstitialListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Initialize failed.");
                            }
                        }
                    }
                });
                return;
            }
            SPInterstitialManager.TrackDebugEventWithoutCheck("sdk_request", "", 2, 0);
            SPInterstitialManager.loadInterstitialAd(interstitialListener, _interstitialAppId, str2, str3);
            return;
        }
        DeviceLog.warning("Interstitial ads was loaded from different listener. Please, check loading waterfall.");
        SPInterstitialManager.TrackDebugEvent("ad_request_double_error", "Interstitial ads was loaded from different listener. State: " + GetStateType.getStringValue(), 0, 0, 0);
        iSayPromoAdsExtendedListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Interstitial ads was loaded from different listener.");
    }

    public static void showInterstitialWithCustomEventInfo(Activity activity) {
        SPInterstitialManager.showInterstitial(activity);
    }

    public static void requestRewardedVideoWithCustomEventInfo(final Activity activity, String str, final String str2, ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener) {
        SPRewardedManager.StartSession();
        SPRewardedManager.DebugId = SPDebugLog.sharedInstance.newDebugLogger(SPRewardedManager.DebugId);
        if (isNeedToSkipRewardedRequestLoading) {
            DeviceLog.warning("Request Rewarded loading is skipped. Please, check SkipRewardedRequestLoadingFlag.");
            if (iSayPromoAdsExtendedListener != null) {
                iSayPromoAdsExtendedListener.onSayPromoAdsError(SayPromoAdsError.NO_FILL, "Ad is not filled");
                return;
            }
            return;
        }
        AdStateType GetStateType = SPRewardedManager.GetStateType();
        if (GetStateType == AdStateType.AdNoneStateType || GetStateType == AdStateType.AdErrorStateType) {
            _rewardedAppId = str;
            ClientProperties.setActivity(activity);
            ClientProperties.setApplicationContext(activity.getApplicationContext());
            rewardedListener = iSayPromoAdsExtendedListener;
            SPRewardedManager.TrackDebugEvent("sdk_request", "", 0, 0, 0);
            String str3 = _advertisingId;
            if (str3 == null || str3.isEmpty()) {
                ExecutorService.getInstance().ExecuteTask(new Runnable() {
                    public void run() {
                        try {
                            AdvertisingId.init(activity);
                            String unused = SPAdManager._advertisingId = AdvertisingId.getAdvertisingTrackingId();
                            SPRewardedManager.requestSyncRewarded(SPAdManager.rewardedListener, SPAdManager._rewardedAppId, str2);
                        } catch (Exception e) {
                            e.printStackTrace();
                            if (SPAdManager.rewardedListener != null) {
                                SPAdManager.rewardedListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Initialize failed.");
                            }
                        }
                    }
                });
            } else {
                SPRewardedManager.requestRewarded(rewardedListener, _rewardedAppId, str2);
            }
        } else {
            DeviceLog.warning("Rewarded ads was loaded from different listener. Please, check loading waterfall.");
            SPRewardedManager.TrackDebugEvent("ad_request_double_error", "Rewarded ads was loaded from different listener. State: " + GetStateType.getStringValue(), 0, 0, 0);
            iSayPromoAdsExtendedListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Rewarded ads was loaded from different listener.");
        }
    }

    public static void loadRewarded(final Activity activity, String str, final String str2, final String str3, ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener) {
        SPRewardedManager.StartSession();
        SPRewardedManager.DebugId = SPDebugLog.sharedInstance.newDebugLogger(SPRewardedManager.DebugId);
        AdStateType GetStateType = SPRewardedManager.GetStateType();
        if (GetStateType == AdStateType.AdNoneStateType || GetStateType == AdStateType.AdErrorStateType) {
            _rewardedAppId = str;
            ClientProperties.setActivity(activity);
            ClientProperties.setApplicationContext(activity.getApplicationContext());
            rewardedListener = iSayPromoAdsExtendedListener;
            String str4 = _advertisingId;
            if (str4 == null || str4.isEmpty()) {
                SPRewardedManager.TrackDebugEventWithoutCheck("sdk_request", "", 1, 0);
                ExecutorService.getInstance().ExecuteTask(new Runnable() {
                    public void run() {
                        try {
                            AdvertisingId.init(activity);
                            String unused = SPAdManager._advertisingId = AdvertisingId.getAdvertisingTrackingId();
                            SPRewardedManager.loadSyncRewardedAd(SPAdManager.rewardedListener, SPAdManager._rewardedAppId, str2, str3);
                        } catch (Exception e) {
                            e.printStackTrace();
                            if (SPAdManager.rewardedListener != null) {
                                SPAdManager.rewardedListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Initialize failed.");
                            }
                        }
                    }
                });
                return;
            }
            SPRewardedManager.TrackDebugEventWithoutCheck("sdk_request", "", 2, 0);
            SPRewardedManager.loadRewardedAd(rewardedListener, _rewardedAppId, str2, str3);
            return;
        }
        DeviceLog.warning("Rewarded ads was loaded from different listener. Please, check loading waterfall.");
        SPRewardedManager.TrackDebugEvent("ad_request_double_error", "Rewarded ads was loaded from different listener. State: " + GetStateType.getStringValue(), 0, 0, 0);
        iSayPromoAdsExtendedListener.onSayPromoAdsError(SayPromoAdsError.INITIALIZE_FAILED, "Rewarded ads was loaded from different listener.");
    }

    public static void showRewardedVideoWithCustomEventInfo(Activity activity, String str) {
        SPRewardedManager.showRewarded(activity);
    }

    public static void clearInterstitialDelegate() {
        interstitialListener = null;
    }

    public static void clearRewardedDelegate() {
        rewardedListener = null;
    }

    public static boolean isInterstitialReady(String str) {
        return SPInterstitialManager.isAdsReady();
    }

    public static boolean isRewardedReady(String str) {
        return SPRewardedManager.isAdsReady();
    }

    public static String GetPlacementIdForServerExtras(Map<String, String> map, String str) {
        String str2 = map.containsKey(PLACEMENT_ID_KEY) ? map.get(PLACEMENT_ID_KEY) : null;
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    public static String GetAppIdForServerExtras(Map<String, String> map, String str) {
        String str2 = map.containsKey("appId") ? map.get("appId") : null;
        return TextUtils.isEmpty(str2) ? str : str2;
    }

    public static void SetLogLevel(int i) {
        DeviceLog.setLogLevel(i);
    }
}
