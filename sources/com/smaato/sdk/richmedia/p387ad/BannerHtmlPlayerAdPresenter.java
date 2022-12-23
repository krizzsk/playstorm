package com.smaato.sdk.richmedia.p387ad;

import android.content.Context;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTrackerCreator;

/* renamed from: com.smaato.sdk.richmedia.ad.BannerHtmlPlayerAdPresenter */
public class BannerHtmlPlayerAdPresenter extends BannerRichMediaAdPresenter {
    public /* bridge */ /* synthetic */ AdContentView getAdContentView(Context context) {
        return super.getAdContentView(context);
    }

    public /* bridge */ /* synthetic */ void initialize() {
        super.initialize();
    }

    public /* bridge */ /* synthetic */ void setListener(BannerAdPresenter.Listener listener) {
        super.setListener(listener);
    }

    BannerHtmlPlayerAdPresenter(Logger logger, RichMediaAdInteractor richMediaAdInteractor, RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator, AppBackgroundDetector appBackgroundDetector, MraidConfigurator mraidConfigurator, OMWebViewViewabilityTracker oMWebViewViewabilityTracker) {
        super(logger, richMediaAdInteractor, richMediaVisibilityTrackerCreator, appBackgroundDetector, mraidConfigurator, oMWebViewViewabilityTracker);
    }
}
