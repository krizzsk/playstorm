package com.amazon.device.ads;

import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import java.util.HashMap;
import java.util.Map;

public class DTBFetchFactory {
    private static final String LOG_TAG = DTBFetchFactory.class.getSimpleName();
    private static DTBFetchFactory theFactory;
    private final int EXPIRATION_INTERVAL_MS = 480000;
    private Map<String, DTBFetchManager> managers = new HashMap();

    /* access modifiers changed from: protected */
    public int getExpirationInMillis() {
        return 480000;
    }

    private DTBFetchFactory() {
    }

    public static DTBFetchFactory getInstance() {
        try {
            if (theFactory == null) {
                theFactory = new DTBFetchFactory();
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBFetchFactory");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to initialize DTBFetchFactory", e);
        }
        return theFactory;
    }

    public DTBFetchManager getFetchManager(String str) {
        if (DtbCommonUtils.isNullOrEmpty(str)) {
            DtbLog.debug("The fetch manager label is null or empty");
        }
        return this.managers.get(str);
    }

    public DTBFetchManager createFetchManager(String str, DTBAdLoader dTBAdLoader) {
        return createFetchManager(str, dTBAdLoader, false);
    }

    public DTBFetchManager createFetchManager(String str, DTBAdLoader dTBAdLoader, boolean z) {
        if (DtbCommonUtils.isNullOrEmpty(str) || dTBAdLoader == null) {
            throw new IllegalArgumentException("Fetch manager label and loader cannot be null or empty.");
        }
        DTBFetchManager fetchManager = getFetchManager(str);
        if (fetchManager == null) {
            DTBFetchManager dTBFetchManager = new DTBFetchManager(dTBAdLoader, z);
            this.managers.put(str, dTBFetchManager);
            return dTBFetchManager;
        }
        DtbLog.warn("The fetch manager with the provided label has already been created");
        return fetchManager;
    }

    public void removeFetchManager(String str) {
        try {
            if (DtbCommonUtils.isNullOrEmpty(str)) {
                DtbLog.debug("The fetch manager label is null or empty");
            }
            DTBFetchManager fetchManager = getFetchManager(str);
            if (fetchManager != null) {
                fetchManager.stop();
                fetchManager.submitWasteQueueReport();
                this.managers.remove(str);
            }
        } catch (RuntimeException e) {
            DtbLog.error(LOG_TAG, "Fail to execute removeFetchManager method");
            APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to execute removeFetchManager method", e);
        }
    }
}
