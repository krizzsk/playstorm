package com.amazon.device.ads;

import android.view.ViewGroup;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.Map;

@Deprecated
public class EventDistributor {
    private static final String LOG_TAG = EventDistributor.class.getSimpleName();

    public boolean distribute(String str, String str2, ViewGroup viewGroup, DTBAdResponse dTBAdResponse, DTBRendererObserver dTBRendererObserver, DTBRenderer dTBRenderer, Map<String, Object> map) {
        try {
            for (AdProvider next : AdRegistration.getAdProviders()) {
                if (next.matches(str, str2, dTBAdResponse)) {
                    next.takeOwnership(viewGroup, dTBAdResponse, dTBRendererObserver, dTBRenderer, map);
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute distribute method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute distribute method", e);
            return false;
        }
    }
}
