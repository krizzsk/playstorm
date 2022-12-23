package com.amazon.device.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DTBAdInterstitial {
    private static final String LOG_TAG = DTBAdInterstitial.class.getSimpleName();
    static Map<String, DTBAdInterstitial> dtbAdInterstitialCache = new HashMap();
    static DTBAdInterstitial theRecent;
    DTBAdView adView;
    private Context context;
    private String dtbAdIntersitialId;

    static DTBAdInterstitial getRecent() {
        return theRecent;
    }

    /* access modifiers changed from: package-private */
    public DTBAdView getAdView() {
        return this.adView;
    }

    public DTBAdInterstitial(Context context2, DTBAdInterstitialListener dTBAdInterstitialListener) {
        try {
            this.context = context2;
            this.adView = new DTBAdView(context2, dTBAdInterstitialListener);
            theRecent = this;
            String uuid = UUID.randomUUID().toString();
            this.dtbAdIntersitialId = uuid;
            dtbAdInterstitialCache.put(uuid, this);
            this.adView.setInterstitialId(this.dtbAdIntersitialId);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdInterstitial class");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to initialize DTBAdInterstitial class", e);
        }
    }

    private DTBAdMRAIDInterstitialController getInterstitialController() {
        return (DTBAdMRAIDInterstitialController) this.adView.getController();
    }

    private DTBAdInterstitialListener getInterstitialListener() {
        return getInterstitialController().getInterstitialListener();
    }

    /* access modifiers changed from: package-private */
    public void setListener(DTBAdInterstitialListener dTBAdInterstitialListener) {
        getInterstitialController().setInterstitialListener(dTBAdInterstitialListener);
    }

    public void fetchAd(Map<String, Object> map) {
        this.adView.fetchAd(map);
    }

    public void fetchAd(Bundle bundle) {
        try {
            this.adView.fetchAd(bundle.getString(DTBAdView.BID_HTML, ""), bundle);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with bundle argument");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with extraData argument", e);
        }
    }

    public void fetchAd(String str) {
        try {
            this.adView.fetchAd(str);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with bundle argument");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with adHtml argument", e);
        }
    }

    public void fetchAd(String str, Bundle bundle) {
        try {
            this.adView.fetchAd(str, bundle);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with adHtml and bundle argument");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with adHtml and  bundle argument", e);
        }
    }

    public void show() {
        try {
            if (!isDTBAdInterstitialInstanceValid()) {
                DtbLog.error(LOG_TAG, "Unable to start interstitial activity");
                return;
            }
            Intent intent = new Intent(this.context, DTBInterstitialActivity.class);
            if (AdRegistration.getCustomDictionary() != null && DTBAdNetwork.MAX.toString().equals(AdRegistration.getCustomDictionary().get("mediationName"))) {
                intent.putExtra("DTBAdInterstitialID", this.dtbAdIntersitialId);
            }
            this.context.startActivity(intent);
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute show method");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute show method", e);
        }
    }

    public static int getWidth(Context context2) {
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context2.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute getWidth method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getWidth method", e);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isDTBAdInterstitialInstanceValid() {
        if (AdRegistration.getCustomDictionary() == null || !DTBAdNetwork.MAX.toString().equals(AdRegistration.getCustomDictionary().get("mediationName"))) {
            if (theRecent != null) {
                return true;
            }
            return false;
        } else if (DtbCommonUtils.isNullOrEmpty((Map) dtbAdInterstitialCache) || !dtbAdInterstitialCache.containsKey(this.dtbAdIntersitialId)) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void onAdClosed() {
        DTBAdInterstitialListener interstitialListener = getInterstitialListener();
        if (interstitialListener != null) {
            interstitialListener.onAdClosed(this.adView);
        }
    }
}
