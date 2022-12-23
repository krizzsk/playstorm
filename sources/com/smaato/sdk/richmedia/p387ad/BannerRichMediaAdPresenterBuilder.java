package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTrackerCreator;

/* renamed from: com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenterBuilder */
class BannerRichMediaAdPresenterBuilder extends RichMediaAdPresenterBuilder<BannerAdPresenter> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    BannerRichMediaAdPresenterBuilder(com.smaato.sdk.core.log.Logger r8, com.smaato.sdk.richmedia.p387ad.RichMediaAdResponseParser r9, com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTrackerCreator r10, com.smaato.sdk.core.appbgdetection.AppBackgroundDetector r11, com.smaato.sdk.richmedia.mraid.MraidConfigurator r12, com.smaato.sdk.core.util.p382fi.Function<com.smaato.sdk.richmedia.p387ad.RichMediaAdObject, com.smaato.sdk.richmedia.p387ad.RichMediaAdInteractor> r13, com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker r14, com.smaato.sdk.richmedia.p387ad.WebViewRenderer r15, com.smaato.sdk.richmedia.p387ad.LoadedWebViewCache r16) {
        /*
            r7 = this;
            com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenterBuilder$eZkQFdnC11RBTEInYE3D32viAJ4 r6 = new com.smaato.sdk.richmedia.ad.-$$Lambda$BannerRichMediaAdPresenterBuilder$eZkQFdnC11RBTEInYE3D32viAJ4
            r0 = r6
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r7
            r2 = r9
            r3 = r13
            r4 = r6
            r5 = r15
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p387ad.BannerRichMediaAdPresenterBuilder.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser, com.smaato.sdk.richmedia.ad.tracker.RichMediaVisibilityTrackerCreator, com.smaato.sdk.core.appbgdetection.AppBackgroundDetector, com.smaato.sdk.richmedia.mraid.MraidConfigurator, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker, com.smaato.sdk.richmedia.ad.WebViewRenderer, com.smaato.sdk.richmedia.ad.LoadedWebViewCache):void");
    }

    static /* synthetic */ BannerAdPresenter lambda$new$0(Logger logger, RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator, AppBackgroundDetector appBackgroundDetector, MraidConfigurator mraidConfigurator, OMWebViewViewabilityTracker oMWebViewViewabilityTracker, RichMediaAdInteractor richMediaAdInteractor) {
        return new BannerRichMediaAdPresenter(logger, richMediaAdInteractor, richMediaVisibilityTrackerCreator, appBackgroundDetector, mraidConfigurator, oMWebViewViewabilityTracker);
    }
}
