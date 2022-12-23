package com.amazon.device.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.iab.omid.library.amazon.Omid;
import com.iab.omid.library.amazon.adsession.AdEvents;
import com.iab.omid.library.amazon.adsession.AdSession;
import com.iab.omid.library.amazon.adsession.AdSessionConfiguration;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.CreativeType;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.amazon.adsession.ImpressionType;
import com.iab.omid.library.amazon.adsession.Owner;
import com.iab.omid.library.amazon.adsession.Partner;
import java.util.List;

class DtbOmSdkSessionManager {
    private static final String LOGTAG = DtbOmSdkSessionManager.class.getSimpleName();
    private static boolean featureEnabled;
    private static boolean isOmSdkActive;
    private AdEvents dtbOmSdkAdEvents;
    private AdSession dtbOmSdkAdSession;
    private Partner dtbOmSdkPartner;

    private DtbOmSdkSessionManager() {
        computeFeatureEnabledFlag();
        if (featureEnabled) {
            try {
                this.dtbOmSdkPartner = Partner.createPartner(DTBMetricsConfiguration.getClientConfigVal("partner_name", "Amazon1", "om_sdk_feature"), DtbCommonUtils.getSDKVersion());
            } catch (IllegalArgumentException e) {
                DtbLog.error(LOGTAG, "Fail to create Partner Object");
                APSAnalytics.logEvent(APSEventSeverity.ERROR, APSEventType.EXCEPTION, "Fail to create Partner Object", e);
            }
        }
    }

    private void computeFeatureEnabledFlag() {
        List<String> deniedOmSdkVersionList = DTBMetricsConfiguration.getDeniedOmSdkVersionList("denied_version_list");
        if (deniedOmSdkVersionList.isEmpty()) {
            featureEnabled = true;
        } else {
            featureEnabled = !deniedOmSdkVersionList.contains("1_3_28".replaceAll("_", "."));
        }
    }

    protected static boolean activateOMSDK(Context context) {
        try {
            Class.forName("com.iab.omid.library.amazon.Omid");
            Omid.activate(context);
            boolean isActive = Omid.isActive();
            isOmSdkActive = isActive;
            return isActive;
        } catch (Throwable th) {
            DtbLog.error(LOGTAG, "Fail to activate Open Measurement SDK");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to create Partner Object", th);
            return false;
        }
    }

    protected static DtbOmSdkSessionManager getNewInstance() {
        if (isOmSdkActive) {
            return new DtbOmSdkSessionManager();
        }
        DtbLog.error(LOGTAG, "OM SDK Integration status not available , cannot create OM SDK session");
        return null;
    }

    /* access modifiers changed from: protected */
    public void initHtmlDisplayOmAdSession(WebView webView, String str) {
        initOmAdSession(webView, str, CreativeType.HTML_DISPLAY, Owner.NATIVE, Owner.NONE, false);
    }

    /* access modifiers changed from: protected */
    public void initJavaScriptOmAdSession(WebView webView, String str) {
        initOmAdSession(webView, str, CreativeType.DEFINED_BY_JAVASCRIPT, Owner.JAVASCRIPT, Owner.JAVASCRIPT, true);
    }

    private void initOmAdSession(WebView webView, String str, CreativeType creativeType, Owner owner, Owner owner2, boolean z) {
        if (!featureEnabled) {
            DtbLog.error(LOGTAG, "OM SDK Feature Turned Off");
        } else if (this.dtbOmSdkPartner == null) {
            DtbLog.error(LOGTAG, "OM SDK Partner information not found");
        } else {
            try {
                createOmAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, owner, owner2, z), AdSessionContext.createHtmlAdSessionContext(this.dtbOmSdkPartner, webView, str, ""));
                if (CreativeType.HTML_DISPLAY.equals(creativeType)) {
                    createOmAdEvents();
                }
            } catch (IllegalArgumentException | IllegalStateException e) {
                DtbLog.error(LOGTAG, "Failed to create Open measurement Ad Session");
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to create Open measurement Ad Session", e);
            }
        }
    }

    private void createOmAdSession(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        if (adSessionConfiguration == null || adSessionContext == null) {
            DtbLog.error(LOGTAG, "Open measurement ad Session Configuration not created");
            return;
        }
        this.dtbOmSdkAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
        DtbLog.info(LOGTAG, "Open measurement ad Session Created");
    }

    private void createOmAdEvents() {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null) {
            DtbLog.error(LOGTAG, "Open measurement ad Session not created");
            return;
        }
        this.dtbOmSdkAdEvents = AdEvents.createAdEvents(adSession);
        DtbLog.info(LOGTAG, "Open measurement ad Event created");
    }

    /* access modifiers changed from: protected */
    public void registerAdView(WebView webView) {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null) {
            DtbLog.error(LOGTAG, "Open measurement ad Session not created");
            return;
        }
        try {
            adSession.registerAdView(webView);
            DtbLog.info(LOGTAG, "Open measurement ad view registered");
        } catch (IllegalArgumentException e) {
            DtbLog.error(LOGTAG, "Failed to register Ad View to Open measurement Ad Session");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to register Ad View to Open measurement Ad Session", e);
        }
    }

    /* access modifiers changed from: protected */
    public void startAdSession() {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null) {
            DtbLog.error(LOGTAG, "Open measurement ad Session not created");
            return;
        }
        try {
            adSession.start();
            String str = LOGTAG;
            DtbLog.info(str, "Open measurement ad session id: " + this.dtbOmSdkAdSession.getAdSessionId());
        } catch (RuntimeException e) {
            DtbLog.error(LOGTAG, "Failed to start to Open measurement Ad Session");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to register Ad View to Open measurement Ad Session", e);
        }
    }

    /* access modifiers changed from: protected */
    public void displayAdEventLoaded() {
        AdEvents adEvents = this.dtbOmSdkAdEvents;
        if (adEvents == null) {
            DtbLog.error(LOGTAG, "Open measurement ad events not created");
            return;
        }
        try {
            adEvents.loaded();
        } catch (IllegalArgumentException | IllegalStateException e) {
            DtbLog.error(LOGTAG, "Failed to load AdEvents for Open measurement Ad Session");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to load AdEvents for Open measurement Ad Session", e);
        }
    }

    /* access modifiers changed from: protected */
    public AdSession getCurrentAdSession() {
        return this.dtbOmSdkAdSession;
    }

    /* access modifiers changed from: protected */
    public AdEvents getCurrentAdEvents() {
        return this.dtbOmSdkAdEvents;
    }

    /* access modifiers changed from: protected */
    public void impressionOccured() {
        AdEvents adEvents = this.dtbOmSdkAdEvents;
        if (adEvents == null) {
            DtbLog.error(LOGTAG, "Open measurement ad events not created");
            return;
        }
        try {
            adEvents.impressionOccurred();
        } catch (RuntimeException e) {
            DtbLog.error(LOGTAG, "Failed to trigger impression occurred for Open measurement Ad Session");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to trigger impression occurred for Open measurement Ad Session", e);
        }
    }

    /* access modifiers changed from: protected */
    public void stopOmAdSession() {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession != null && isOmSdkActive) {
            try {
                adSession.finish();
                this.dtbOmSdkAdSession = null;
                this.dtbOmSdkAdEvents = null;
            } catch (RuntimeException unused) {
                DtbLog.error("Failed to stop open measurement AdSession");
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to stop open measurement AdSession");
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.dtbOmSdkAdSession;
        if (adSession == null) {
            DtbLog.error(LOGTAG, "Open measurement ad Session not created");
            return;
        }
        try {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, (String) null);
        } catch (IllegalArgumentException unused) {
            DtbLog.error("Fail to add friendly obstruction to open measurement AdSession");
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to add friendly obstruction to open measurement AdSession");
        }
    }

    protected static boolean getFeatureEnableFlag() {
        return featureEnabled;
    }
}
