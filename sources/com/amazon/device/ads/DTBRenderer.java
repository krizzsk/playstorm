package com.amazon.device.ads;

import android.app.Activity;
import android.view.View;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.List;

public class DTBRenderer {
    private static final String LOG_TAG = DTBRenderer.class.getSimpleName();
    Activity activity;
    String adUnitId;
    protected DTBAdResponse dtbAdResponse;
    protected boolean showOnLoad = false;

    public void onCustomBannerFailure(View view) {
    }

    public void onCustomBannerSuccess(View view) {
    }

    DTBRenderer(String str, Activity activity2, DTBAdResponse dTBAdResponse) {
        this.adUnitId = str;
        this.dtbAdResponse = dTBAdResponse;
        this.activity = activity2;
    }

    /* access modifiers changed from: protected */
    public EventDistributor getEventDistributer() {
        return AdRegistration.getEventDistributer();
    }

    public boolean isShowOnLoad() {
        return this.showOnLoad;
    }

    public DTBAdSize getSize() {
        try {
            if (this.dtbAdResponse == null) {
                return null;
            }
            List<DTBAdSize> dTBAds = this.dtbAdResponse.getDTBAds();
            if (dTBAds.size() > 0) {
                return dTBAds.get(0);
            }
            return null;
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute getSize method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute getSize method", e);
            return null;
        }
    }
}
