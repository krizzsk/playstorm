package com.amazon.device.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebViewClient;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.util.Map;
import org.json.JSONException;

class DTBAdMRAIDInterstitialController extends DTBAdMRAIDController implements DTBAdViewDisplayListener {
    DTBAdInterstitialListener interstitialListener;
    boolean pageDisplayed = false;
    boolean pageLoaded = false;

    /* access modifiers changed from: protected */
    public String getPlacementType() {
        return "interstitial";
    }

    DTBAdMRAIDInterstitialController(DTBAdView dTBAdView, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(dTBAdView);
        this.interstitialListener = dTBAdInterstitialListener;
    }

    /* access modifiers changed from: package-private */
    public DTBAdInterstitialListener getInterstitialListener() {
        return this.interstitialListener;
    }

    /* access modifiers changed from: package-private */
    public void setInterstitialListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        this.interstitialListener = dTBAdInterstitialListener;
    }

    /* access modifiers changed from: protected */
    public void onPageLoad() {
        this.pageLoaded = true;
        try {
            initializeOnLoadAndDisplay();
            if (this.interstitialListener != null) {
                this.interstitialListener.onAdLoaded(this.adView);
                if (!this.adView.isVideo() && getDtbOmSdkSessionManager() != null) {
                    getDtbOmSdkSessionManager().displayAdEventLoaded();
                }
            }
        } catch (JSONException e) {
            DtbLog.error("Error:" + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void initializeOnLoadAndDisplay() throws JSONException {
        if (!this.pageLoaded || !this.pageDisplayed) {
            createLoadReport();
        } else {
            prepareMraid();
        }
    }

    public void onInitialDisplay() {
        this.pageDisplayed = true;
        try {
            initializeOnLoadAndDisplay();
        } catch (JSONException e) {
            DtbLog.error("JSON exception:" + e.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    public void onMRAIDClose() {
        executeClose("close");
    }

    private void executeClose(String str) {
        commandCompleted(str);
        setState(MraidStateType.HIDDEN);
        fireViewableChange(false);
        DTBInterstitialActivity recentInterstitialActivity = DTBInterstitialActivity.getRecentInterstitialActivity();
        if (recentInterstitialActivity != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable(recentInterstitialActivity) {
                public final /* synthetic */ Activity f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    DTBAdMRAIDInterstitialController.this.lambda$executeClose$0$DTBAdMRAIDInterstitialController(this.f$1);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: cleanOnCloseHandler */
    public void lambda$executeClose$0$DTBAdMRAIDInterstitialController(Activity activity) {
        if (this.adView != null) {
            this.adView.setWebViewClient((WebViewClient) null);
            DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
            if (dTBAdInterstitialListener != null) {
                dTBAdInterstitialListener.onAdClosed(this.adView);
                if (!DtbCommonUtils.isNullOrEmpty(this.adView.getDtbAdInterstitialId())) {
                    DTBAdInterstitial.dtbAdInterstitialCache.remove(this.adView.getDtbAdInterstitialId());
                }
            }
            getAdView().cleanup();
        }
        if (!activity.isFinishing()) {
            activity.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onMRAIDUnload() {
        executeClose(MraidJsMethods.UNLOAD);
    }

    /* access modifiers changed from: protected */
    public void onResize(Map<String, Object> map) {
        fireErrorEvent(MraidJsMethods.RESIZE, "invalid placement type");
        commandCompleted(MraidJsMethods.RESIZE);
    }

    /* access modifiers changed from: protected */
    public void expand(Map<String, Object> map) {
        fireErrorEvent(MraidJsMethods.EXPAND, "invalid placement type for interstitial ");
        commandCompleted(MraidJsMethods.EXPAND);
    }

    /* access modifiers changed from: protected */
    public void onAdOpened(DTBAdView dTBAdView) {
        DTBAdInterstitialListener dTBAdInterstitialListener = this.interstitialListener;
        if (dTBAdInterstitialListener != null) {
            dTBAdInterstitialListener.onAdOpen(this.adView);
        }
    }

    /* access modifiers changed from: protected */
    public void onAdClicked() {
        if (this.interstitialListener != null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    DTBAdMRAIDInterstitialController.this.lambda$onAdClicked$1$DTBAdMRAIDInterstitialController();
                }
            });
        }
    }

    public /* synthetic */ void lambda$onAdClicked$1$DTBAdMRAIDInterstitialController() {
        this.interstitialListener.onAdClicked(this.adView);
    }

    /* access modifiers changed from: package-private */
    public void passLoadError() {
        this.interstitialListener.onAdFailed(this.adView);
    }

    /* access modifiers changed from: protected */
    public void onAdLeftApplication() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                DTBAdMRAIDInterstitialController.this.lambda$onAdLeftApplication$2$DTBAdMRAIDInterstitialController();
            }
        });
        ActivityMonitor.getInstance().setActivityListener(this);
    }

    public /* synthetic */ void lambda$onAdLeftApplication$2$DTBAdMRAIDInterstitialController() {
        this.interstitialListener.onAdLeftApplication(this.adView);
    }

    public void onActivityResumed(Activity activity) {
        ActivityMonitor.getInstance().setActivityListener((DTBActivityListener) null);
    }

    public void onActivityDestroyed(Activity activity) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        ActivityMonitor.getInstance().setActivityListener((DTBActivityListener) null);
    }

    /* access modifiers changed from: protected */
    public void impressionFired() {
        this.interstitialListener.onImpressionFired(this.adView);
        super.impressionFired();
    }

    /* access modifiers changed from: protected */
    public void onVideoCompleted() {
        this.interstitialListener.onVideoCompleted(this.adView);
    }
}
