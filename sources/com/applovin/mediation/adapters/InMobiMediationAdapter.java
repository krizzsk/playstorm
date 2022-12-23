package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.BannerAdEventListener;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.warren.model.Cookie;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class InMobiMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter, MaxSignalProvider {
    private static final int DEFAULT_IMAGE_TASK_TIMEOUT_SECONDS = 5;
    private static final AtomicBoolean INITIALIZED = new AtomicBoolean();
    private static final String KEY_PARTNER_GDPR_APPLIES = "partner_gdpr_applies";
    private static final String KEY_PARTNER_GDPR_CONSENT = "partner_gdpr_consent_available";
    /* access modifiers changed from: private */
    public static MaxAdapter.InitializationStatus status;
    private InMobiBanner adView;
    private InMobiInterstitial interstitialAd;
    /* access modifiers changed from: private */
    public InMobiNative nativeAd;
    private InMobiInterstitial rewardedAd;

    public String getAdapterVersion() {
        return "10.0.7.0";
    }

    public InMobiMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public String getSdkVersion() {
        return InMobiSdk.getVersion();
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (!InMobiSdk.isSDKInitialized()) {
            maxSignalCollectionListener.onSignalCollectionFailed("InMobi SDK initialization failed.");
            return;
        }
        updateAgeRestrictedUser(maxAdapterSignalCollectionParameters);
        maxSignalCollectionListener.onSignalCollected(InMobiSdk.getToken(getExtras(maxAdapterSignalCollectionParameters), (String) null));
    }

    public void onDestroy() {
        InMobiBanner inMobiBanner = this.adView;
        if (inMobiBanner != null) {
            inMobiBanner.destroy();
            this.adView = null;
        }
        InMobiNative inMobiNative = this.nativeAd;
        if (inMobiNative != null) {
            inMobiNative.destroy();
            this.nativeAd = null;
        }
        this.interstitialAd = null;
        this.rewardedAd = null;
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, final MaxAdapter.OnCompletionListener onCompletionListener) {
        if (INITIALIZED.compareAndSet(false, true)) {
            String string = maxAdapterInitializationParameters.getServerParameters().getString("account_id");
            log("Initializing InMobi SDK with account id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
            Context context = getContext(activity);
            status = MaxAdapter.InitializationStatus.INITIALIZING;
            updateAgeRestrictedUser(maxAdapterInitializationParameters);
            InMobiSdk.init(context, string, getConsentJSONObject(maxAdapterInitializationParameters), new SdkInitializationListener() {
                public void onInitializationComplete(Error error) {
                    if (error != null) {
                        InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
                        inMobiMediationAdapter.log("InMobi SDK initialization failed with error: " + error.getMessage());
                        MaxAdapter.InitializationStatus unused = InMobiMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_FAILURE;
                        onCompletionListener.onCompletion(InMobiMediationAdapter.status, error.getMessage());
                        return;
                    }
                    InMobiMediationAdapter.this.log("InMobi SDK successfully initialized.");
                    MaxAdapter.InitializationStatus unused2 = InMobiMediationAdapter.status = MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS;
                    onCompletionListener.onCompletion(InMobiMediationAdapter.status, (String) null);
                }
            });
            InMobiSdk.setLogLevel(maxAdapterInitializationParameters.isTesting() ? InMobiSdk.LogLevel.DEBUG : InMobiSdk.LogLevel.ERROR);
            return;
        }
        log("InMobi SDK already initialized");
        onCompletionListener.onCompletion(status, (String) null);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        int i;
        int i2;
        long parseLong = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log("Loading " + maxAdFormat.getLabel() + " AdView ad for placement: " + parseLong + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (!InMobiSdk.isSDKInitialized()) {
            log("InMobi SDK not successfully initialized: failing " + maxAdFormat.getLabel() + " ad load...");
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        Context context = getContext(activity);
        InMobiBanner inMobiBanner = new InMobiBanner(context, parseLong);
        this.adView = inMobiBanner;
        inMobiBanner.setExtras(getExtras(maxAdapterResponseParameters));
        this.adView.setAnimationType(InMobiBanner.AnimationType.ANIMATION_OFF);
        this.adView.setEnableAutoRefresh(false);
        this.adView.setListener(new AdViewListener(maxAdViewAdapterListener));
        InMobiSdk.setPartnerGDPRConsent(getConsentJSONObject(maxAdapterResponseParameters));
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (maxAdFormat == MaxAdFormat.BANNER) {
            i2 = 320;
            i = 50;
        } else if (maxAdFormat == MaxAdFormat.LEADER) {
            i2 = 728;
            i = 90;
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            i2 = 300;
            i = 250;
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
        this.adView.setLayoutParams(new LinearLayout.LayoutParams(Math.round(((float) i2) * displayMetrics.density), Math.round(((float) i) * displayMetrics.density)));
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.adView.load(bidResponse.getBytes());
        } else {
            this.adView.load();
        }
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        long parseLong = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log("Loading interstitial ad for placement: " + parseLong + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (!InMobiSdk.isSDKInitialized()) {
            log("InMobi SDK not successfully initialized: failing interstitial ad load...");
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        this.interstitialAd = createFullscreenAd(parseLong, maxAdapterResponseParameters, new InterstitialListener(maxInterstitialAdapterListener), activity);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.interstitialAd.load(bidResponse.getBytes());
        } else {
            this.interstitialAd.load();
        }
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        if (!showFullscreenAd(this.interstitialAd)) {
            log("Interstitial ad not ready");
            maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        }
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        long parseLong = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        log("Loading rewarded ad for placement: " + parseLong + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (!InMobiSdk.isSDKInitialized()) {
            log("InMobi SDK not successfully initialized: failing rewarded ad load...");
            maxRewardedAdapterListener.onRewardedAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        this.rewardedAd = createFullscreenAd(parseLong, maxAdapterResponseParameters, new RewardedAdListener(maxRewardedAdapterListener), activity);
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        if (!TextUtils.isEmpty(bidResponse)) {
            this.rewardedAd.load(bidResponse.getBytes());
        } else {
            this.rewardedAd.load();
        }
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad...");
        configureReward(maxAdapterResponseParameters);
        if (!showFullscreenAd(this.rewardedAd)) {
            log("Rewarded ad not ready");
            maxRewardedAdapterListener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        }
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (!InMobiSdk.isSDKInitialized()) {
            log("InMobi SDK not successfully initialized: failing native ad load...");
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.NOT_INITIALIZED);
            return;
        }
        updateAgeRestrictedUser(maxAdapterResponseParameters);
        long parseLong = Long.parseLong(maxAdapterResponseParameters.getThirdPartyAdPlacementId());
        String bidResponse = maxAdapterResponseParameters.getBidResponse();
        boolean isValidString = AppLovinSdkUtils.isValidString(bidResponse);
        StringBuilder sb = new StringBuilder();
        sb.append("Loading ");
        sb.append(isValidString ? "bidding " : "");
        sb.append("native ad for placement: ");
        sb.append(parseLong);
        sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        log(sb.toString());
        InMobiSdk.setPartnerGDPRConsent(getConsentJSONObject(maxAdapterResponseParameters));
        Context context = getContext(activity);
        InMobiNative inMobiNative = new InMobiNative(context, parseLong, new NativeAdListener(maxAdapterResponseParameters, context, maxNativeAdAdapterListener));
        this.nativeAd = inMobiNative;
        inMobiNative.setExtras(getExtras(maxAdapterResponseParameters));
        if (isValidString) {
            this.nativeAd.load(bidResponse.getBytes());
        } else {
            this.nativeAd.load();
        }
    }

    private InMobiInterstitial createFullscreenAd(long j, MaxAdapterResponseParameters maxAdapterResponseParameters, InterstitialAdEventListener interstitialAdEventListener, Activity activity) {
        InMobiInterstitial inMobiInterstitial = new InMobiInterstitial(activity, j, interstitialAdEventListener);
        inMobiInterstitial.setExtras(getExtras(maxAdapterResponseParameters));
        InMobiSdk.setPartnerGDPRConsent(getConsentJSONObject(maxAdapterResponseParameters));
        return inMobiInterstitial;
    }

    private boolean showFullscreenAd(InMobiInterstitial inMobiInterstitial) {
        if (!inMobiInterstitial.isReady()) {
            return false;
        }
        inMobiInterstitial.show();
        return true;
    }

    private JSONObject getConsentJSONObject(MaxAdapterParameters maxAdapterParameters) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.APPLIES) {
                jSONObject.put(KEY_PARTNER_GDPR_APPLIES, 1);
                Boolean privacySetting = getPrivacySetting("hasUserConsent", maxAdapterParameters);
                if (privacySetting != null) {
                    jSONObject.put(KEY_PARTNER_GDPR_CONSENT, privacySetting);
                }
            } else if (getWrappingSdk().getConfiguration().getConsentDialogState() == AppLovinSdkConfiguration.ConsentDialogState.DOES_NOT_APPLY) {
                jSONObject.put(KEY_PARTNER_GDPR_APPLIES, 0);
            }
        } catch (JSONException e) {
            log("Failed to create consent JSON object", e);
        }
        return jSONObject;
    }

    private void updateAgeRestrictedUser(MaxAdapterParameters maxAdapterParameters) {
        Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting != null) {
            InMobiSdk.setIsAgeRestricted(privacySetting.booleanValue());
        }
    }

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private Map<String, String> getExtras(MaxAdapterParameters maxAdapterParameters) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("tp", "c_applovin");
        hashMap.put("tp-ver", AppLovinSdk.VERSION);
        Boolean privacySetting = getPrivacySetting("isAgeRestrictedUser", maxAdapterParameters);
        if (privacySetting != null) {
            hashMap.put(Cookie.COPPA_KEY, privacySetting.booleanValue() ? "1" : "0");
        }
        return hashMap;
    }

    private Boolean getPrivacySetting(String str, MaxAdapterParameters maxAdapterParameters) {
        try {
            return (Boolean) maxAdapterParameters.getClass().getMethod(str, new Class[0]).invoke(maxAdapterParameters, new Object[0]);
        } catch (Exception e) {
            log("Error getting privacy setting " + str + " with exception: ", e);
            return AppLovinSdk.VERSION_CODE >= 9140000 ? null : false;
        }
    }

    /* access modifiers changed from: private */
    public static MaxAdapterError toMaxError(InMobiAdRequestStatus inMobiAdRequestStatus) {
        InMobiAdRequestStatus.StatusCode statusCode = inMobiAdRequestStatus.getStatusCode();
        MaxAdapterError maxAdapterError = MaxAdapterError.UNSPECIFIED;
        switch (C21342.$SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode[statusCode.ordinal()]) {
            case 1:
                maxAdapterError = MaxAdapterError.UNSPECIFIED;
                break;
            case 2:
                maxAdapterError = MaxAdapterError.NO_CONNECTION;
                break;
            case 3:
                maxAdapterError = MaxAdapterError.NO_FILL;
                break;
            case 4:
                maxAdapterError = MaxAdapterError.BAD_REQUEST;
                break;
            case 5:
                maxAdapterError = MaxAdapterError.TIMEOUT;
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                maxAdapterError = MaxAdapterError.INTERNAL_ERROR;
                break;
            case 13:
                maxAdapterError = MaxAdapterError.SERVER_ERROR;
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                maxAdapterError = MaxAdapterError.INVALID_LOAD_STATE;
                break;
            case 19:
                maxAdapterError = MaxAdapterError.AD_EXPIRED;
                break;
            case 20:
            case 21:
                maxAdapterError = MaxAdapterError.INVALID_CONFIGURATION;
                break;
        }
        return new MaxAdapterError(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), statusCode.ordinal(), inMobiAdRequestStatus.getMessage());
    }

    /* renamed from: com.applovin.mediation.adapters.InMobiMediationAdapter$2 */
    static /* synthetic */ class C21342 {
        static final /* synthetic */ int[] $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode[] r0 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode = r0
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NO_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.NO_FILL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_INVALID     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x003e }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x006c }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.LOW_MEMORY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x009c }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.SERVER_ERROR     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.REQUEST_PENDING     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = $SwitchMap$com$inmobi$ads$InMobiAdRequestStatus$StatusCode     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.inmobi.ads.InMobiAdRequestStatus$StatusCode r1 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.InMobiMediationAdapter.C21342.<clinit>():void");
        }
    }

    private class AdViewListener extends BannerAdEventListener {
        final MaxAdViewAdapterListener listener;

        AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        public void onAdLoadSucceeded(InMobiBanner inMobiBanner, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("AdView loaded");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(adMetaInfo.getCreativeID())) {
                this.listener.onAdViewAdLoaded(inMobiBanner);
            } else {
                Bundle bundle = new Bundle(1);
                bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adMetaInfo.getCreativeID());
                this.listener.onAdViewAdLoaded(inMobiBanner, bundle);
            }
            this.listener.onAdViewAdDisplayed();
        }

        public void onAdLoadFailed(InMobiBanner inMobiBanner, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
            inMobiMediationAdapter.log("AdView failed to load with error code " + inMobiAdRequestStatus.getStatusCode() + " and message: " + inMobiAdRequestStatus.getMessage());
            this.listener.onAdViewAdLoadFailed(InMobiMediationAdapter.toMaxError(inMobiAdRequestStatus));
        }

        public void onAdDisplayed(InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView expanded");
            this.listener.onAdViewAdExpanded();
        }

        public void onAdDismissed(InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView collapsed");
            this.listener.onAdViewAdCollapsed();
        }

        public void onAdClicked(InMobiBanner inMobiBanner, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("AdView clicked");
            this.listener.onAdViewAdClicked();
        }

        public void onUserLeftApplication(InMobiBanner inMobiBanner) {
            InMobiMediationAdapter.this.log("AdView will leave application");
        }
    }

    private class InterstitialListener extends InterstitialAdEventListener {
        final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Interstitial request succeeded");
        }

        public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Interstitial loaded");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(adMetaInfo.getCreativeID())) {
                this.listener.onInterstitialAdLoaded();
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adMetaInfo.getCreativeID());
            this.listener.onInterstitialAdLoaded(bundle);
        }

        public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
            inMobiMediationAdapter.log("Interstitial failed to load with error code " + inMobiAdRequestStatus.getStatusCode() + " and message: " + inMobiAdRequestStatus.getMessage());
            this.listener.onInterstitialAdLoadFailed(InMobiMediationAdapter.toMaxError(inMobiAdRequestStatus));
        }

        public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial failed to display");
            this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
        }

        public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial will show");
        }

        public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Interstitial did show");
            this.listener.onInterstitialAdDisplayed();
        }

        public void onAdClicked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial hidden");
            this.listener.onInterstitialAdHidden();
        }

        public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Interstitial will leave application");
        }
    }

    private class RewardedAdListener extends InterstitialAdEventListener {
        private boolean hasGrantedReward;
        final MaxRewardedAdapterListener listener;

        RewardedAdListener(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            this.listener = maxRewardedAdapterListener;
        }

        public void onAdFetchSuccessful(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Rewarded ad request succeeded");
        }

        public void onAdLoadSucceeded(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Rewarded ad loaded");
            if (AppLovinSdk.VERSION_CODE < 9150000 || TextUtils.isEmpty(adMetaInfo.getCreativeID())) {
                this.listener.onRewardedAdLoaded();
                return;
            }
            Bundle bundle = new Bundle(1);
            bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adMetaInfo.getCreativeID());
            this.listener.onRewardedAdLoaded(bundle);
        }

        public void onAdLoadFailed(InMobiInterstitial inMobiInterstitial, InMobiAdRequestStatus inMobiAdRequestStatus) {
            InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
            inMobiMediationAdapter.log("Rewarded ad failed to load with error code " + inMobiAdRequestStatus.getStatusCode() + " and message: " + inMobiAdRequestStatus.getMessage());
            this.listener.onRewardedAdLoadFailed(InMobiMediationAdapter.toMaxError(inMobiAdRequestStatus));
        }

        public void onAdDisplayFailed(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad failed to display");
            this.listener.onRewardedAdDisplayFailed(MaxAdapterError.UNSPECIFIED);
        }

        public void onAdWillDisplay(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad did show");
        }

        public void onAdDisplayed(InMobiInterstitial inMobiInterstitial, AdMetaInfo adMetaInfo) {
            InMobiMediationAdapter.this.log("Rewarded ad did show");
            this.listener.onRewardedAdDisplayed();
            this.listener.onRewardedAdVideoStarted();
        }

        public void onAdClicked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("Rewarded ad clicked");
            this.listener.onRewardedAdClicked();
        }

        public void onAdDismissed(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad hidden");
            this.listener.onRewardedAdVideoCompleted();
            if (this.hasGrantedReward || InMobiMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = InMobiMediationAdapter.this.getReward();
                InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
                inMobiMediationAdapter.log("Rewarded user with reward: " + reward);
                this.listener.onUserRewarded(reward);
            }
            this.listener.onRewardedAdHidden();
        }

        public void onUserLeftApplication(InMobiInterstitial inMobiInterstitial) {
            InMobiMediationAdapter.this.log("Rewarded ad will leave application");
        }

        public void onRewardsUnlocked(InMobiInterstitial inMobiInterstitial, Map<Object, Object> map) {
            InMobiMediationAdapter.this.log("Rewarded ad granted reward");
            this.hasGrantedReward = true;
        }
    }

    private class NativeAdListener extends NativeAdEventListener {
        /* access modifiers changed from: private */
        public final Context context;
        /* access modifiers changed from: private */
        public final MaxNativeAdAdapterListener listener;
        private final String placementId;
        /* access modifiers changed from: private */
        public final Bundle serverParameters;

        NativeAdListener(MaxAdapterResponseParameters maxAdapterResponseParameters, Context context2, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
            this.placementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            this.serverParameters = maxAdapterResponseParameters.getServerParameters();
            this.context = context2;
            this.listener = maxNativeAdAdapterListener;
        }

        public void onAdLoadSucceeded(final InMobiNative inMobiNative, final AdMetaInfo adMetaInfo) {
            if (InMobiMediationAdapter.this.nativeAd == null || InMobiMediationAdapter.this.nativeAd != inMobiNative) {
                InMobiMediationAdapter.this.log("Native ad failed to load: no fill");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.NO_FILL);
            } else if (!AppLovinSdkUtils.isValidString(BundleUtils.getString("template", "", this.serverParameters)) || !TextUtils.isEmpty(InMobiMediationAdapter.this.nativeAd.getAdTitle())) {
                InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
                inMobiMediationAdapter.log("Native ad loaded: " + this.placementId);
                InMobiMediationAdapter.this.getCachingExecutorService().execute(new Runnable() {
                    public void run() {
                        Drawable drawable;
                        if (AppLovinSdkUtils.isValidString(inMobiNative.getAdIconUrl())) {
                            InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
                            inMobiMediationAdapter.log("Adding native ad icon (" + inMobiNative.getAdIconUrl() + ") to queue to be fetched");
                            try {
                                drawable = InMobiMediationAdapter.this.createDrawableFuture(inMobiNative.getAdIconUrl(), NativeAdListener.this.context.getResources()).get((long) BundleUtils.getInt("image_task_timeout_seconds", 5, NativeAdListener.this.serverParameters), TimeUnit.SECONDS);
                            } catch (Throwable th) {
                                InMobiMediationAdapter inMobiMediationAdapter2 = InMobiMediationAdapter.this;
                                inMobiMediationAdapter2.mo15010e("Failed to fetch icon image from URL: " + inMobiNative.getAdIconUrl(), th);
                            }
                            NativeAdListener nativeAdListener = NativeAdListener.this;
                            nativeAdListener.handleNativeAdLoaded(InMobiMediationAdapter.this.nativeAd, adMetaInfo, drawable, NativeAdListener.this.context);
                        }
                        drawable = null;
                        NativeAdListener nativeAdListener2 = NativeAdListener.this;
                        nativeAdListener2.handleNativeAdLoaded(InMobiMediationAdapter.this.nativeAd, adMetaInfo, drawable, NativeAdListener.this.context);
                    }
                });
            } else {
                InMobiMediationAdapter inMobiMediationAdapter2 = InMobiMediationAdapter.this;
                inMobiMediationAdapter2.mo15009e("Native ad (" + InMobiMediationAdapter.this.nativeAd + ") does not have required assets.");
                this.listener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            }
        }

        /* access modifiers changed from: private */
        public void handleNativeAdLoaded(InMobiNative inMobiNative, AdMetaInfo adMetaInfo, Drawable drawable, Context context2) {
            final Context context3 = context2;
            final Drawable drawable2 = drawable;
            final InMobiNative inMobiNative2 = inMobiNative;
            final AdMetaInfo adMetaInfo2 = adMetaInfo;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    new ImageView(context3).setImageDrawable(drawable2);
                    MaxInMobiNativeAd maxInMobiNativeAd = new MaxInMobiNativeAd(NativeAdListener.this.listener, new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(inMobiNative2.getAdTitle()).setBody(inMobiNative2.getAdDescription()).setMediaView(new FrameLayout(context3)).setIcon(new MaxNativeAd.MaxNativeAdImage(drawable2)).setCallToAction(inMobiNative2.getAdCtaText()));
                    if (AppLovinSdkUtils.isValidString(adMetaInfo2.getCreativeID())) {
                        Bundle bundle = new Bundle(1);
                        bundle.putString(CampaignEx.JSON_KEY_CREATIVE_ID, adMetaInfo2.getCreativeID());
                        NativeAdListener.this.listener.onNativeAdLoaded(maxInMobiNativeAd, bundle);
                        return;
                    }
                    NativeAdListener.this.listener.onNativeAdLoaded(maxInMobiNativeAd, (Bundle) null);
                }
            });
        }

        public void onAdLoadFailed(InMobiNative inMobiNative, InMobiAdRequestStatus inMobiAdRequestStatus) {
            MaxAdapterError access$100 = InMobiMediationAdapter.toMaxError(inMobiAdRequestStatus);
            InMobiMediationAdapter inMobiMediationAdapter = InMobiMediationAdapter.this;
            inMobiMediationAdapter.log("Native ad failed to load with error " + access$100);
            this.listener.onNativeAdLoadFailed(access$100);
        }

        public void onAdImpressed(InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad shown");
            this.listener.onNativeAdDisplayed((Bundle) null);
        }

        public void onAdClicked(InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad clicked");
            this.listener.onNativeAdClicked();
        }

        public void onUserWillLeaveApplication(InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad user will leave application");
        }

        public void onAdFullScreenWillDisplay(InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad fullscreen will display");
        }

        public void onAdFullScreenDisplayed(InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad fullscreen displayed");
        }

        public void onAdFullScreenDismissed(InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad fullscreen dismissed");
        }

        public void onAdStatusChanged(InMobiNative inMobiNative) {
            InMobiMediationAdapter.this.log("Native ad status changed");
        }
    }

    private class MaxInMobiNativeAd extends MaxNativeAd {
        /* access modifiers changed from: private */
        public final MaxNativeAdAdapterListener listener;

        public MaxInMobiNativeAd(MaxNativeAdAdapterListener maxNativeAdAdapterListener, MaxNativeAd.Builder builder) {
            super(builder);
            this.listener = maxNativeAdAdapterListener;
        }

        public void prepareViewForInteraction(final MaxNativeAdView maxNativeAdView) {
            if (InMobiMediationAdapter.this.nativeAd == null) {
                InMobiMediationAdapter.this.mo15009e("Failed to register native ad views: native ad is null.");
                return;
            }
            final FrameLayout frameLayout = (FrameLayout) getMediaView();
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setForegroundGravity(17);
            frameLayout.post(new Runnable() {
                public void run() {
                    InMobiNative access$200 = InMobiMediationAdapter.this.nativeAd;
                    Context context = frameLayout.getContext();
                    FrameLayout frameLayout = frameLayout;
                    View primaryViewOfWidth = access$200.getPrimaryViewOfWidth(context, (View) null, frameLayout, frameLayout.getWidth());
                    if (primaryViewOfWidth != null) {
                        frameLayout.addView(primaryViewOfWidth);
                    }
                }
            });
            final C21362 r0 = new View.OnClickListener() {
                public void onClick(View view) {
                    InMobiMediationAdapter.this.log("Native ad clicked from click listener");
                    InMobiMediationAdapter.this.nativeAd.reportAdClickAndOpenLandingPage();
                    MaxInMobiNativeAd.this.listener.onNativeAdClicked();
                }
            };
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    if (maxNativeAdView.getTitleTextView() != null) {
                        maxNativeAdView.getTitleTextView().setOnClickListener(r0);
                    }
                    if (maxNativeAdView.getAdvertiserTextView() != null) {
                        maxNativeAdView.getAdvertiserTextView().setOnClickListener(r0);
                    }
                    if (maxNativeAdView.getBodyTextView() != null) {
                        maxNativeAdView.getBodyTextView().setOnClickListener(r0);
                    }
                    if (maxNativeAdView.getIconImageView() != null) {
                        maxNativeAdView.getIconImageView().setOnClickListener(r0);
                    }
                    if (maxNativeAdView.getCallToActionButton() != null) {
                        maxNativeAdView.getCallToActionButton().setOnClickListener(r0);
                    }
                }
            });
        }
    }
}
