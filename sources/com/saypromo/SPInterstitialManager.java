package com.saypromo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.saypromo.SPAdManager;
import com.saypromo.base.AdData;
import com.saypromo.base.AdSettings;
import com.saypromo.base.AdStateType;
import com.saypromo.base.AdType;
import com.saypromo.base.CreativeData;
import com.saypromo.base.SPBaseManager;
import com.saypromo.base.SPDebugLog;
import com.saypromo.core.ExecutorService;
import com.saypromo.core.FileSystemService;
import com.saypromo.core.InternetService;
import com.saypromo.core.device.Device;
import com.saypromo.core.log.DeviceLog;
import com.saypromo.core.misc.Utilities;
import com.saypromo.core.properties.ClientProperties;
import com.saypromo.listeners.ISayPromoAdsExtendedListener;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.Advertisement;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Iterator;

public class SPInterstitialManager {
    public static String DebugId;
    private static AdSettings _adSettings = new AdSettings();
    private static String _appId;
    private static long _htmlLoadTimestamp;
    private static String _htmlUrl;
    private static Boolean _isHtmlDownloaded = false;
    private static Boolean _isVideoDownloaded = false;
    /* access modifiers changed from: private */
    public static String _placeId;
    private static long _videoLoadTimestamp;
    private static String _videoUrl;
    /* access modifiers changed from: private */
    public static long adStartTimestamp;
    /* access modifiers changed from: private */
    public static ISayPromoAdsExtendedListener adsListener;
    private static AdData data;

    public static AdStateType GetStateType() {
        return _adSettings.AdStateType;
    }

    public static void initInterstitialRequest(ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener, String str, String str2) {
        adsListener = iSayPromoAdsExtendedListener;
        _appId = str;
        _placeId = str2;
        AdSettings adSettings = new AdSettings();
        _adSettings = adSettings;
        adSettings.AppId = str;
        _adSettings.PlaceId = str2;
        _adSettings.DebugId = DebugId;
        UpdateAdStateType(AdStateType.AdLoadingStateType);
        _isVideoDownloaded = false;
        _isHtmlDownloaded = false;
        _videoUrl = null;
        _htmlUrl = null;
        TrackDebugEvent("manager_init", _appId + "," + _placeId, 0, 0, 0);
    }

    public static void requestSyncInterstitial(ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener, String str, String str2) {
        initInterstitialRequest(iSayPromoAdsExtendedListener, str, str2);
        requestInterstitialData();
    }

    public static void requestInterstitial(ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener, String str, String str2) {
        initInterstitialRequest(iSayPromoAdsExtendedListener, str, str2);
        ExecutorService.getInstance().ExecuteTask(new Runnable() {
            public void run() {
                SPInterstitialManager.requestInterstitialData();
            }
        });
    }

    /* access modifiers changed from: private */
    public static void requestInterstitialData() {
        try {
            String GetURL = SPBaseManager.GetURL("interstitial", _appId, _placeId);
            long timestampInMillis = Device.getTimestampInMillis();
            TrackDebugEvent("api_request_start", GetURL, 0, 0, 0);
            String GetData = InternetService.GetData(GetURL, SPBaseManager.ConnectionTimeout);
            if (GetData.isEmpty()) {
                SendSayPromoAdsError(SPAdManager.SayPromoAdsError.INITIALIZE_FAILED, "requestInterstitial Ads are not downloaded. TimeoutException.");
                return;
            }
            TrackDebugEvent("api_request_end", GetURL, Device.getTimestampInMillis() - timestampInMillis, 0, 0);
            readInterstitialData(GetData);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            SPAdManager.SayPromoAdsError sayPromoAdsError = SPAdManager.SayPromoAdsError.INTERNAL_ERROR;
            SendSayPromoAdsError(sayPromoAdsError, "requestInterstitial Ads are not downloaded. MalformedURLException: " + e.getMessage());
        } catch (IOException e2) {
            e2.printStackTrace();
            SPAdManager.SayPromoAdsError sayPromoAdsError2 = SPAdManager.SayPromoAdsError.INTERNAL_ERROR;
            SendSayPromoAdsError(sayPromoAdsError2, "requestInterstitial Ads are not downloaded. IOException: " + e2.getMessage());
        } catch (Exception e3) {
            e3.printStackTrace();
            SPAdManager.SayPromoAdsError sayPromoAdsError3 = SPAdManager.SayPromoAdsError.INTERNAL_ERROR;
            SendSayPromoAdsError(sayPromoAdsError3, "requestInterstitial Ads are not downloaded. Exception: " + e3.getMessage());
        }
    }

    public static void loadSyncInterstitialAd(ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener, String str, String str2, String str3) {
        initInterstitialRequest(iSayPromoAdsExtendedListener, str, str2);
        readInterstitialData(str3);
    }

    public static void loadInterstitialAd(ISayPromoAdsExtendedListener iSayPromoAdsExtendedListener, String str, String str2, final String str3) {
        initInterstitialRequest(iSayPromoAdsExtendedListener, str, str2);
        ExecutorService.getInstance().ExecuteTask(new Runnable() {
            public void run() {
                SPInterstitialManager.readInterstitialData(str3);
            }
        });
    }

    /* access modifiers changed from: private */
    public static void readInterstitialData(String str) {
        try {
            TrackDebugEvent("read_data", "", 0, 0, 0);
            AdData adData = new AdData();
            data = adData;
            adData.parseJson(str);
            _adSettings.ResultUrl = data.resultUrl;
            _adSettings.StoreId = data.storeId;
            if (data.status == null || !data.status.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED)) {
                TrackDebugEventWithoutCheck("status_not_filled", str, 0, 0);
                UpdateAdStateType(AdStateType.AdNotFoundStateType);
                SendSayPromoAdsError(SPAdManager.SayPromoAdsError.INITIALIZE_FAILED, "readInterstitialData Ads are not found. INITIALIZE_FAILED");
                return;
            }
            if (SPDebugLog.sharedInstance.DebugMode != data.debug) {
                SPDebugLog.sharedInstance.DebugMode = data.debug;
                DebugId = SPDebugLog.sharedInstance.newDebugLogger(DebugId);
            }
            Iterator<CreativeData> it = data.creatives.iterator();
            while (it.hasNext()) {
                CreativeData next = it.next();
                if (next.type.equals("video")) {
                    _videoUrl = next.url;
                    _adSettings.VideoSkipAfter = next.skipAfter.intValue();
                    _adSettings.VideoClickableAfter = next.clickableAfter.intValue();
                    _adSettings.VideoClickableBehavior = next.clickBehaviour.intValue();
                    _adSettings.VideoShowTimer = Boolean.valueOf(next.showTimer);
                    _adSettings.VideoBtnPosition = next.closePosition;
                    _adSettings.VideoSayPosition = next.sayPosition;
                    _adSettings.VideoShowProgressBar = Boolean.valueOf(next.showProgressBar);
                    if (_adSettings.AdType == AdType.AdNoneType) {
                        _adSettings.AdType = AdType.AdVideoType;
                    } else {
                        _adSettings.AdType = AdType.AdVideoAndHtmlType;
                    }
                    _adSettings.VideoWidth = Double.valueOf(next.width);
                    _adSettings.VideoHeight = Double.valueOf(next.height);
                } else if (next.type.equals(TJAdUnitConstants.String.HTML)) {
                    _htmlUrl = next.url;
                    _adSettings.WebSkipAfter = next.skipAfter.intValue();
                    _adSettings.WebShowTimer = Boolean.valueOf(next.showTimer);
                    _adSettings.WebBtnPosition = next.closePosition;
                    _adSettings.WebSayPosition = next.sayPosition;
                    if (_adSettings.AdType == AdType.AdNoneType) {
                        _adSettings.AdType = AdType.AdHtmlType;
                    } else {
                        _adSettings.AdType = AdType.AdVideoAndHtmlType;
                    }
                } else {
                    SendSayPromoAdsError(SPAdManager.SayPromoAdsError.INITIALIZE_FAILED, "readInterstitialData Creative type is not supported.");
                    return;
                }
            }
            TrackDebugEventWithoutCheck("status_filled", "", 0, 0);
            if (_adSettings.AdType == AdType.AdHtmlType || _adSettings.AdType == AdType.AdVideoAndHtmlType) {
                _htmlLoadTimestamp = Device.getTimestampInMillis();
                DownloadFile(SPAdManager.AdsFileNames.InterstitialWeb, _htmlUrl, AdType.AdHtmlType);
            }
            if (_adSettings.AdStateType == AdStateType.AdErrorStateType) {
                return;
            }
            if (_adSettings.AdType == AdType.AdVideoType || _adSettings.AdType == AdType.AdVideoAndHtmlType) {
                _videoLoadTimestamp = Device.getTimestampInMillis();
                DownloadFile(SPAdManager.AdsFileNames.InterstitialVideo, _videoUrl, AdType.AdVideoType);
            }
        } catch (Exception e) {
            e.printStackTrace();
            SPAdManager.SayPromoAdsError sayPromoAdsError = SPAdManager.SayPromoAdsError.INTERNAL_ERROR;
            SendSayPromoAdsError(sayPromoAdsError, "readInterstitialData Ads are not downloaded. Exception: " + e.getMessage());
        }
    }

    private static void DownloadFile(String str, String str2, AdType adType) {
        String str3;
        try {
            int GetTimeout = GetTimeout();
            if (GetTimeout <= 0) {
                SendSayPromoAdsError(SPAdManager.SayPromoAdsError.INTERNAL_ERROR, "DownloadFile timeout error.");
                return;
            }
            TrackDebugEventWithoutCheck("ad_request_start", str2, 0, 0);
            InputStream GetFileFromServerSync = InternetService.GetFileFromServerSync(str2, GetTimeout);
            if (GetFileFromServerSync != null) {
                Pair<String, Integer> SaveDataToFile = FileSystemService.getInstance().SaveDataToFile(FileSystemService.getInstance().fileIdToFilename(str), GetFileFromServerSync);
                if (((Integer) SaveDataToFile.second).intValue() > 0) {
                    DownloadEnd(adType, (long) ((Integer) SaveDataToFile.second).intValue());
                    return;
                }
                str3 = " Exception: save " + ((String) SaveDataToFile.first);
            } else {
                str3 = "";
            }
            SendSayPromoAdsError(SPAdManager.SayPromoAdsError.FILE_IO_ERROR, "DownloadFile error. " + str3);
        } catch (Exception e) {
            DeviceLog.error(e.getLocalizedMessage());
            str3 = " Exception: " + e.getMessage();
        }
    }

    public static void showInterstitial(Activity activity) {
        try {
            TrackDebugEvent("show_call", "interstitial", 0, 0, 0);
            ClientProperties.setActivity(activity);
            ClientProperties.setApplicationContext(activity.getApplicationContext());
            Intent intent = new Intent(activity.getApplicationContext(), SPAdActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("contentType", "interstitial");
            intent.putExtras(bundle);
            activity.startActivity(intent);
            SendSayPromoEvent(SPAdManager.SayPromoListenerResult.onSayPromoAdsStart);
            SendEvent(data.trackImpressionUrl);
            UpdateAdStateType(AdStateType.AdPlayingStateType);
        } catch (Exception e) {
            DeviceLog.error(e.getLocalizedMessage());
            SPAdManager.SayPromoAdsError sayPromoAdsError = SPAdManager.SayPromoAdsError.INTERNAL_ERROR;
            SendSayPromoAdsError(sayPromoAdsError, "show interstitial error:  " + e.toString());
        }
    }

    public static boolean isAdsReady() {
        TrackDebugEvent("ready_call", "", 0, 0, 0);
        return _adSettings.AdStateType == AdStateType.AdLoadedStateType;
    }

    public static void DownloadEnd(AdType adType, long j) {
        long timestampInMillis = Device.getTimestampInMillis();
        if (adType == AdType.AdVideoType) {
            _isVideoDownloaded = true;
            TrackDebugEvent("ad_request_end", _videoUrl, timestampInMillis - _videoLoadTimestamp, 1, j);
        } else {
            _isHtmlDownloaded = true;
            TrackDebugEvent("ad_request_end", _htmlUrl, timestampInMillis - _htmlLoadTimestamp, 2, j);
        }
        int i = C108905.$SwitchMap$com$saypromo$base$AdType[_adSettings.AdType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && _isHtmlDownloaded.booleanValue() && _isVideoDownloaded.booleanValue()) {
                    UpdateAdStateType(AdStateType.AdLoadedStateType);
                    DownloadCompleted();
                }
            } else if (_isHtmlDownloaded.booleanValue()) {
                UpdateAdStateType(AdStateType.AdLoadedStateType);
                DownloadCompleted();
            }
        } else if (_isVideoDownloaded.booleanValue()) {
            UpdateAdStateType(AdStateType.AdLoadedStateType);
            DownloadCompleted();
        }
    }

    private static void DownloadCompleted() {
        SendSayPromoEvent(SPAdManager.SayPromoListenerResult.onSayPromoAdsReady);
        SendEvent(data.trackLoadUrl);
        TrackDebugEventWithoutCheck("sdk_ready", "", (long) ((int) (System.currentTimeMillis() - adStartTimestamp)), 0);
    }

    public static AdSettings GetAdSettings() {
        _adSettings.VideoUrl = FileSystemService.getInstance().getFilePath(SPAdManager.AdsFileNames.InterstitialVideo);
        AdSettings adSettings = _adSettings;
        adSettings.WebUrl = Advertisement.FILE_SCHEME + FileSystemService.getInstance().getFilePath(SPAdManager.AdsFileNames.InterstitialWeb);
        return _adSettings;
    }

    public static void AdsSuccessfulFinish() {
        UpdateAdStateType(AdStateType.AdNoneStateType);
        SendSayPromoEvent(SPAdManager.SayPromoListenerResult.onSayPromoAdsFinish);
        TrackDebugEvent("sdk_complete", _placeId, 0, 0, 0);
        SendEvent(data.trackCloseUrl);
    }

    public static void AdsClicked(String str, String str2) {
        SendSayPromoEvent(SPAdManager.SayPromoListenerResult.onSayPromoAdsClick);
        TrackDebugEvent("sdk_click", "", 0, 0, 0);
        String str3 = data.trackClickUrl.replace("__ORIGIN__", str) + str2;
        SendEvent(str3);
        Log.w("SayTest", str3);
    }

    public static void SendEvent(String str) {
        SPDebugLog.sharedInstance.AddNewEvent(str);
    }

    public static void SendCustomEvent(String str) {
        if (data.trackEventUrl != null) {
            SPDebugLog.sharedInstance.AddNewEvent(data.trackEventUrl.replace("__EVENT__", str));
        }
    }

    public static void SendSayPromoAdsError(final SPAdManager.SayPromoAdsError sayPromoAdsError, final String str) {
        if (_adSettings.AdStateType != AdStateType.AdErrorStateType) {
            TrackDebugEventWithoutCheck("sdk_call_error", str, 0, 0);
            UpdateAdStateType(AdStateType.AdErrorStateType);
            if (adsListener != null) {
                Utilities.runOnUiThread(new Runnable() {
                    public void run() {
                        if (SPInterstitialManager.adsListener != null) {
                            SPInterstitialManager.adsListener.onSayPromoAdsError(SPAdManager.SayPromoAdsError.this, str);
                            SPInterstitialManager.TrackDebugEventWithoutCheck("sdk_error", str, (long) ((int) (System.currentTimeMillis() - SPInterstitialManager.adStartTimestamp)), 0);
                        }
                    }
                });
            }
            try {
                SendEvent((("" + data.trackErrorUrl) + "&extra=" + str).replaceAll(" ", "+"));
            } catch (Exception e) {
                DeviceLog.error(e.getMessage());
            }
        }
    }

    public static void SendSayPromoAdsShowError(String str) {
        if (_adSettings.AdStateType != AdStateType.AdErrorStateType) {
            UpdateAdStateType(AdStateType.AdErrorStateType);
            SendSayPromoEvent(SPAdManager.SayPromoListenerResult.onSayPromoAdsFinish);
            try {
                TrackDebugEventWithoutCheck("view_error", str, (long) ((int) (System.currentTimeMillis() - adStartTimestamp)), 0);
                SendEvent((("" + data.trackErrorUrl) + "&extra=" + str).replaceAll(" ", "+"));
            } catch (Exception e) {
                DeviceLog.error(e.getMessage());
            }
        }
    }

    public static void SendSayPromoEvent(final SPAdManager.SayPromoListenerResult sayPromoListenerResult) {
        if (adsListener != null) {
            Utilities.runOnUiThread(new Runnable() {
                public void run() {
                    if (SPInterstitialManager.adsListener != null) {
                        int i = C108905.$SwitchMap$com$saypromo$SPAdManager$SayPromoListenerResult[SPAdManager.SayPromoListenerResult.this.ordinal()];
                        if (i == 1) {
                            SPInterstitialManager.TrackDebugEventWithoutCheck("sdk_callback", "ready", 0, 0);
                            SPInterstitialManager.adsListener.onSayPromoAdsReady(SPInterstitialManager._placeId);
                        } else if (i == 2) {
                            SPInterstitialManager.TrackDebugEventWithoutCheck("sdk_callback", "start", 1, 0);
                            SPInterstitialManager.adsListener.onSayPromoAdsStart(SPInterstitialManager._placeId);
                        } else if (i == 3) {
                            SPInterstitialManager.TrackDebugEventWithoutCheck("sdk_callback", "click", 2, 0);
                            SPInterstitialManager.adsListener.onSayPromoAdsClick(SPInterstitialManager._placeId);
                        } else if (i == 4) {
                            SPInterstitialManager.TrackDebugEventWithoutCheck("sdk_callback", "finish", 3, 0);
                            SPInterstitialManager.adsListener.onSayPromoAdsFinish(SPInterstitialManager._placeId, SPAdManager.FinishState.COMPLETED);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.saypromo.SPInterstitialManager$5 */
    static /* synthetic */ class C108905 {
        static final /* synthetic */ int[] $SwitchMap$com$saypromo$SPAdManager$SayPromoListenerResult;
        static final /* synthetic */ int[] $SwitchMap$com$saypromo$base$AdType;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        static {
            /*
                com.saypromo.SPAdManager$SayPromoListenerResult[] r0 = com.saypromo.SPAdManager.SayPromoListenerResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$saypromo$SPAdManager$SayPromoListenerResult = r0
                r1 = 1
                com.saypromo.SPAdManager$SayPromoListenerResult r2 = com.saypromo.SPAdManager.SayPromoListenerResult.onSayPromoAdsReady     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$saypromo$SPAdManager$SayPromoListenerResult     // Catch:{ NoSuchFieldError -> 0x001d }
                com.saypromo.SPAdManager$SayPromoListenerResult r3 = com.saypromo.SPAdManager.SayPromoListenerResult.onSayPromoAdsStart     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$com$saypromo$SPAdManager$SayPromoListenerResult     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.saypromo.SPAdManager$SayPromoListenerResult r4 = com.saypromo.SPAdManager.SayPromoListenerResult.onSayPromoAdsClick     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = $SwitchMap$com$saypromo$SPAdManager$SayPromoListenerResult     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.saypromo.SPAdManager$SayPromoListenerResult r4 = com.saypromo.SPAdManager.SayPromoListenerResult.onSayPromoAdsFinish     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.saypromo.base.AdType[] r3 = com.saypromo.base.AdType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                $SwitchMap$com$saypromo$base$AdType = r3
                com.saypromo.base.AdType r4 = com.saypromo.base.AdType.AdVideoType     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = $SwitchMap$com$saypromo$base$AdType     // Catch:{ NoSuchFieldError -> 0x004e }
                com.saypromo.base.AdType r3 = com.saypromo.base.AdType.AdHtmlType     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = $SwitchMap$com$saypromo$base$AdType     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.saypromo.base.AdType r1 = com.saypromo.base.AdType.AdVideoAndHtmlType     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.saypromo.SPInterstitialManager.C108905.<clinit>():void");
        }
    }

    private static void UpdateAdStateType(AdStateType adStateType) {
        _adSettings.AdStateType = adStateType;
        TrackDebugEvent("state_changed", adStateType.getStringValue(), (long) adStateType.getIntValue(), 0, 0);
    }

    public static void TrackDebugEvent(String str, String str2, long j, long j2, long j3) {
        SPDebugLog.sharedInstance.trackEventWithId(DebugId, _appId, _placeId, str, str2, j, j2, j3);
    }

    public static void TrackDebugEventWithoutCheck(String str, String str2, long j, long j2) {
        SPDebugLog.sharedInstance.trackEvent(DebugId, _appId, _placeId, str, str2, j, j2, (long) GetTimeout());
    }

    public static void StartSession() {
        adStartTimestamp = System.currentTimeMillis();
        SPDebugLog.sharedInstance.StartLogging();
    }

    private static int GetTimeout() {
        return SPBaseManager.RequestTimeout - ((int) ((System.currentTimeMillis() - adStartTimestamp) / 1000));
    }
}
