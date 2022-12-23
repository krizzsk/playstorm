package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdInterstitial;
import com.amazon.device.ads.DTBAdInterstitialListener;
import com.amazon.device.ads.DTBAdLoader;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdView;
import com.amazon.device.ads.SDKUtilities;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class AmazonAdMarketplaceMediationAdapter extends MediationAdapterBase implements MaxSignalProvider, MaxAdViewAdapter, MaxInterstitialAdapter {
    /* access modifiers changed from: private */
    public static final Map<MaxAdFormat, DTBAdLoader> adLoaders = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */
    public static final Map<String, MediationHints> mediationHintsCache = new HashMap();
    /* access modifiers changed from: private */
    public static final Object mediationHintsCacheLock = new Object();
    /* access modifiers changed from: private */
    public static final Set<Integer> usedAdLoaders = new HashSet();
    private DTBAdView adView;
    private DTBAdInterstitial interstitialAd;

    public String getAdapterVersion() {
        return "9.5.2.0";
    }

    public AmazonAdMarketplaceMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        if (maxAdapterInitializationParameters.isTesting()) {
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
        }
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public String getSdkVersion() {
        return AdRegistration.getVersion();
    }

    public void onDestroy() {
        this.adView = null;
        this.interstitialAd = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void collectSignal(com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters r9, android.app.Activity r10, com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener r11) {
        /*
            r8 = this;
            com.applovin.mediation.MaxAdFormat r10 = r9.getAdFormat()
            java.util.Map r0 = r9.getLocalExtraParameters()
            java.lang.String r1 = "amazon_ad_response"
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r2 = r9.getLocalExtraParameters()
            java.lang.String r3 = "amazon_ad_error"
            java.lang.Object r2 = r2.get(r3)
            boolean r4 = r0 instanceof com.amazon.device.ads.DTBAdResponse
            if (r4 == 0) goto L_0x004f
            r5 = r0
            com.amazon.device.ads.DTBAdResponse r5 = (com.amazon.device.ads.DTBAdResponse) r5
            com.amazon.device.ads.DTBAdRequest r5 = r5.getAdLoader()
            java.util.Set<java.lang.Integer> r6 = usedAdLoaders
            int r7 = r5.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0048
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "Using ad loader from ad response object: "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r8.mo15008d(r1)
            goto L_0x0050
        L_0x0048:
            java.util.Map r5 = r9.getLocalExtraParameters()
            r5.remove(r1)
        L_0x004f:
            r5 = 0
        L_0x0050:
            boolean r1 = r2 instanceof com.amazon.device.ads.AdError
            if (r1 == 0) goto L_0x0088
            r1 = r2
            com.amazon.device.ads.AdError r1 = (com.amazon.device.ads.AdError) r1
            com.amazon.device.ads.DTBAdRequest r1 = r1.getAdLoader()
            java.util.Set<java.lang.Integer> r6 = usedAdLoaders
            int r7 = r1.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x0081
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Using ad loader from ad error object: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            r8.mo15008d(r3)
            r5 = r1
            goto L_0x0088
        L_0x0081:
            java.util.Map r1 = r9.getLocalExtraParameters()
            r1.remove(r3)
        L_0x0088:
            java.util.Map<com.applovin.mediation.MaxAdFormat, com.amazon.device.ads.DTBAdLoader> r1 = adLoaders
            java.lang.Object r1 = r1.get(r10)
            com.amazon.device.ads.DTBAdLoader r1 = (com.amazon.device.ads.DTBAdLoader) r1
            if (r5 == 0) goto L_0x00f0
            if (r5 != r1) goto L_0x00ac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Passed in ad loader same as current ad loader: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.mo15008d(r0)
            r8.loadSubsequentSignal(r5, r9, r10, r11)
            goto L_0x010f
        L_0x00ac:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "New loader passed in for "
            r3.append(r6)
            r3.append(r10)
            java.lang.String r6 = ": "
            r3.append(r6)
            r3.append(r5)
            java.lang.String r6 = ", replacing current ad loader: "
            r3.append(r6)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r8.mo15008d(r1)
            java.util.Map<com.applovin.mediation.MaxAdFormat, com.amazon.device.ads.DTBAdLoader> r1 = adLoaders
            r1.put(r10, r5)
            java.util.Set<java.lang.Integer> r10 = usedAdLoaders
            int r1 = r5.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.add(r1)
            if (r4 == 0) goto L_0x00ea
            com.amazon.device.ads.DTBAdResponse r0 = (com.amazon.device.ads.DTBAdResponse) r0
            r8.processAdResponse(r9, r0, r11)
            goto L_0x010f
        L_0x00ea:
            com.amazon.device.ads.AdError r2 = (com.amazon.device.ads.AdError) r2
            r8.failSignalCollection((com.amazon.device.ads.AdError) r2, (com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener) r11)
            goto L_0x010f
        L_0x00f0:
            if (r1 == 0) goto L_0x010a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Using cached ad loader: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.mo15008d(r0)
            r8.loadSubsequentSignal(r1, r9, r10, r11)
            goto L_0x010f
        L_0x010a:
            java.lang.String r9 = "DTBAdResponse or AdError not passed in ad load API"
            r8.failSignalCollection((java.lang.String) r9, (com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener) r11)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter.collectSignal(com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters, android.app.Activity, com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener):void");
    }

    private void loadSubsequentSignal(DTBAdLoader dTBAdLoader, final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final MaxAdFormat maxAdFormat, final MaxSignalCollectionListener maxSignalCollectionListener) {
        mo15008d("Found existing ad loader (" + dTBAdLoader + ") for format: " + maxAdFormat + " - loading...");
        dTBAdLoader.loadAd(new DTBAdCallback() {
            public void onSuccess(DTBAdResponse dTBAdResponse) {
                AmazonAdMarketplaceMediationAdapter.adLoaders.put(maxAdFormat, dTBAdResponse.getAdLoader());
                AmazonAdMarketplaceMediationAdapter.usedAdLoaders.add(Integer.valueOf(dTBAdResponse.getAdLoader().hashCode()));
                AmazonAdMarketplaceMediationAdapter amazonAdMarketplaceMediationAdapter = AmazonAdMarketplaceMediationAdapter.this;
                amazonAdMarketplaceMediationAdapter.mo15008d("Signal collected for ad loader: " + dTBAdResponse.getAdLoader());
                AmazonAdMarketplaceMediationAdapter.this.processAdResponse(maxAdapterSignalCollectionParameters, dTBAdResponse, maxSignalCollectionListener);
            }

            public void onFailure(AdError adError) {
                AmazonAdMarketplaceMediationAdapter.adLoaders.put(maxAdFormat, adError.getAdLoader());
                AmazonAdMarketplaceMediationAdapter.usedAdLoaders.add(Integer.valueOf(adError.getAdLoader().hashCode()));
                AmazonAdMarketplaceMediationAdapter amazonAdMarketplaceMediationAdapter = AmazonAdMarketplaceMediationAdapter.this;
                amazonAdMarketplaceMediationAdapter.mo15008d("Signal failed to collect for ad loader: " + adError.getAdLoader());
                AmazonAdMarketplaceMediationAdapter.this.failSignalCollection(adError, maxSignalCollectionListener);
            }
        });
    }

    /* access modifiers changed from: private */
    public void processAdResponse(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, DTBAdResponse dTBAdResponse, MaxSignalCollectionListener maxSignalCollectionListener) {
        mo15008d("Processing ad response...");
        String pricePoint = SDKUtilities.getPricePoint(dTBAdResponse);
        if (AppLovinSdkUtils.isValidString(pricePoint)) {
            MediationHints mediationHints = new MediationHints(SDKUtilities.getBidInfo(dTBAdResponse));
            synchronized (mediationHintsCacheLock) {
                mediationHintsCache.put(pricePoint, mediationHints);
            }
            long millis = TimeUnit.SECONDS.toMillis(maxAdapterSignalCollectionParameters.getServerParameters().getLong("mediation_hints_cleanup_delay_sec", TimeUnit.MINUTES.toSeconds(5)));
            if (millis > 0) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new CleanupMediationHintsTask(pricePoint, mediationHints), millis);
            }
            mo15008d("Successfully loaded encoded bid id: " + pricePoint);
            maxSignalCollectionListener.onSignalCollected(pricePoint);
            return;
        }
        failSignalCollection("Received empty bid id", maxSignalCollectionListener);
    }

    /* access modifiers changed from: private */
    public void failSignalCollection(AdError adError, MaxSignalCollectionListener maxSignalCollectionListener) {
        failSignalCollection("Signal collection failed: " + adError.getCode() + " - " + adError.getMessage(), maxSignalCollectionListener);
    }

    private void failSignalCollection(String str, MaxSignalCollectionListener maxSignalCollectionListener) {
        mo15009e(str);
        maxSignalCollectionListener.onSignalCollectionFailed(str);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        MediationHints mediationHints;
        String string = maxAdapterResponseParameters.getServerParameters().getString("encoded_bid_id");
        mo15008d("Loading " + maxAdFormat.getLabel() + " ad view ad for encoded bid id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (TextUtils.isEmpty(string)) {
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        synchronized (mediationHintsCacheLock) {
            mediationHints = mediationHintsCache.get(string);
            mediationHintsCache.remove(string);
        }
        if (mediationHints != null) {
            DTBAdView dTBAdView = new DTBAdView(getContext(activity), (DTBAdBannerListener) new AdViewListener(maxAdViewAdapterListener));
            this.adView = dTBAdView;
            dTBAdView.fetchAd(mediationHints.value);
            return;
        }
        mo15009e("Unable to find mediation hints");
        maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        MediationHints mediationHints;
        String string = maxAdapterResponseParameters.getServerParameters().getString("encoded_bid_id");
        mo15008d("Loading interstitial ad for encoded bid id: " + string + APSSharedUtil.TRUNCATE_SEPARATOR);
        if (TextUtils.isEmpty(string)) {
            maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        synchronized (mediationHintsCacheLock) {
            mediationHints = mediationHintsCache.get(string);
            mediationHintsCache.remove(string);
        }
        if (mediationHints != null) {
            DTBAdInterstitial dTBAdInterstitial = new DTBAdInterstitial(activity, new InterstitialListener(maxInterstitialAdapterListener));
            this.interstitialAd = dTBAdInterstitial;
            dTBAdInterstitial.fetchAd(mediationHints.value);
            return;
        }
        mo15009e("Unable to find mediation hints");
        maxInterstitialAdapterListener.onInterstitialAdLoadFailed(MaxAdapterError.INVALID_LOAD_STATE);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad...");
        DTBAdInterstitial dTBAdInterstitial = this.interstitialAd;
        if (dTBAdInterstitial != null) {
            dTBAdInterstitial.show();
            return;
        }
        log("Interstitial ad not ready");
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed"));
    }

    private Context getContext(Activity activity) {
        return activity != null ? activity.getApplicationContext() : getApplicationContext();
    }

    private class AdViewListener implements DTBAdBannerListener {
        private final MaxAdViewAdapterListener listener;

        private AdViewListener(MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.listener = maxAdViewAdapterListener;
        }

        public void onAdLoaded(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("AdView ad loaded");
            this.listener.onAdViewAdLoaded(view);
        }

        public void onAdFailed(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15009e("AdView failed to load");
            this.listener.onAdViewAdLoadFailed(MaxAdapterError.UNSPECIFIED);
        }

        public void onAdClicked(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("AdView clicked");
            this.listener.onAdViewAdClicked();
        }

        public void onImpressionFired(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("AdView impression fired");
            this.listener.onAdViewAdDisplayed();
        }

        public void onAdOpen(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("AdView expanded");
            this.listener.onAdViewAdExpanded();
        }

        public void onAdClosed(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("AdView collapsed");
            this.listener.onAdViewAdCollapsed();
        }

        public void onAdLeftApplication(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("AdView left application");
        }
    }

    private class InterstitialListener implements DTBAdInterstitialListener {
        final MaxInterstitialAdapterListener listener;

        InterstitialListener(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        public void onAdLoaded(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("Interstitial loaded");
            this.listener.onInterstitialAdLoaded();
        }

        public void onAdFailed(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15009e("Interstitial failed to load");
            this.listener.onInterstitialAdLoadFailed(MaxAdapterError.NO_FILL);
        }

        public void onImpressionFired(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("Interstitial did fire impression");
            this.listener.onInterstitialAdDisplayed();
        }

        public void onAdOpen(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("Interstitial did open");
        }

        public void onAdClicked(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("Interstitial clicked");
            this.listener.onInterstitialAdClicked();
        }

        public void onAdClosed(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("Interstitial closed");
            this.listener.onInterstitialAdHidden();
        }

        public void onAdLeftApplication(View view) {
            AmazonAdMarketplaceMediationAdapter.this.mo15008d("Interstitial will leave application");
        }
    }

    private static class MediationHints {
        /* access modifiers changed from: private */

        /* renamed from: id */
        public final String f4129id;
        /* access modifiers changed from: private */
        public final String value;

        private MediationHints(String str) {
            this.f4129id = UUID.randomUUID().toString().toLowerCase(Locale.US);
            this.value = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediationHints)) {
                return false;
            }
            MediationHints mediationHints = (MediationHints) obj;
            String str = this.f4129id;
            if (str == null ? mediationHints.f4129id != null : !str.equals(mediationHints.f4129id)) {
                return false;
            }
            String str2 = this.value;
            String str3 = mediationHints.value;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f4129id;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.value;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "MediationHints{id=" + this.f4129id + ", value=" + this.value + '}';
        }
    }

    private static class CleanupMediationHintsTask implements Runnable {
        private final String encodedBidId;
        private final MediationHints mediationHints;

        private CleanupMediationHintsTask(String str, MediationHints mediationHints2) {
            this.encodedBidId = str;
            this.mediationHints = mediationHints2;
        }

        public void run() {
            synchronized (AmazonAdMarketplaceMediationAdapter.mediationHintsCacheLock) {
                MediationHints mediationHints2 = (MediationHints) AmazonAdMarketplaceMediationAdapter.mediationHintsCache.get(this.encodedBidId);
                if (mediationHints2 != null && mediationHints2.f4129id.equals(this.mediationHints.f4129id)) {
                    AmazonAdMarketplaceMediationAdapter.mediationHintsCache.remove(this.encodedBidId);
                }
            }
        }
    }
}
