package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.api.ApiAdRequest;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.api.SomaApiContext;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.flow.Action1;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker;
import com.smaato.sdk.core.p378ad.AdDimension;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdPresenterBuilder;
import com.smaato.sdk.core.p378ad.AdPresenterBuilderException;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTrackerCreator;
import com.smaato.sdk.richmedia.util.HtmlPlayerUtils;

/* renamed from: com.smaato.sdk.richmedia.ad.BannerHtmlPlayerAdPresenterBuilder */
public class BannerHtmlPlayerAdPresenterBuilder extends RichMediaAdPresenterBuilder<BannerAdPresenter> {
    private final HtmlPlayerUtils htmlPlayerUtils;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    BannerHtmlPlayerAdPresenterBuilder(com.smaato.sdk.core.log.Logger r8, com.smaato.sdk.richmedia.p387ad.RichMediaAdResponseParser r9, com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTrackerCreator r10, com.smaato.sdk.core.appbgdetection.AppBackgroundDetector r11, com.smaato.sdk.richmedia.mraid.MraidConfigurator r12, com.smaato.sdk.core.util.p382fi.Function<com.smaato.sdk.richmedia.p387ad.RichMediaAdObject, com.smaato.sdk.richmedia.p387ad.RichMediaAdInteractor> r13, com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker r14, com.smaato.sdk.richmedia.p387ad.WebViewRenderer r15, com.smaato.sdk.richmedia.p387ad.LoadedWebViewCache r16, com.smaato.sdk.richmedia.util.HtmlPlayerUtils r17) {
        /*
            r7 = this;
            com.smaato.sdk.richmedia.ad.-$$Lambda$BannerHtmlPlayerAdPresenterBuilder$O-nsM98LX3-2Tebo9TfX7s8iSo8 r6 = new com.smaato.sdk.richmedia.ad.-$$Lambda$BannerHtmlPlayerAdPresenterBuilder$O-nsM98LX3-2Tebo9TfX7s8iSo8
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
            r1 = r17
            r0.htmlPlayerUtils = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p387ad.BannerHtmlPlayerAdPresenterBuilder.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.richmedia.ad.RichMediaAdResponseParser, com.smaato.sdk.richmedia.ad.tracker.RichMediaVisibilityTrackerCreator, com.smaato.sdk.core.appbgdetection.AppBackgroundDetector, com.smaato.sdk.richmedia.mraid.MraidConfigurator, com.smaato.sdk.core.util.fi.Function, com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker, com.smaato.sdk.richmedia.ad.WebViewRenderer, com.smaato.sdk.richmedia.ad.LoadedWebViewCache, com.smaato.sdk.richmedia.util.HtmlPlayerUtils):void");
    }

    static /* synthetic */ BannerAdPresenter lambda$new$0(Logger logger, RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator, AppBackgroundDetector appBackgroundDetector, MraidConfigurator mraidConfigurator, OMWebViewViewabilityTracker oMWebViewViewabilityTracker, RichMediaAdInteractor richMediaAdInteractor) {
        return new BannerHtmlPlayerAdPresenter(logger, richMediaAdInteractor, richMediaVisibilityTrackerCreator, appBackgroundDetector, mraidConfigurator, oMWebViewViewabilityTracker);
    }

    public void buildAdPresenter(SomaApiContext somaApiContext, AdPresenterBuilder.Listener listener) {
        ApiAdRequest apiAdRequest = somaApiContext.getApiAdRequest();
        ApiAdResponse apiAdResponse = somaApiContext.getApiAdResponse();
        AdDimension adDimension = this.htmlPlayerUtils.getAdDimension(somaApiContext.getApiAdRequest().getAdDimension());
        String str = new String(apiAdResponse.getBody());
        AdFormat adFormat = apiAdResponse.getAdFormat();
        if (adFormat == AdFormat.VIDEO) {
            this.htmlPlayerUtils.vastToRichMedia(str, adDimension.getWidth(), adDimension.getHeight()).subscribe(new Action1(apiAdResponse, apiAdRequest, listener) {
                public final /* synthetic */ ApiAdResponse f$1;
                public final /* synthetic */ ApiAdRequest f$2;
                public final /* synthetic */ AdPresenterBuilder.Listener f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void invoke(Object obj) {
                    BannerHtmlPlayerAdPresenterBuilder.this.lambda$buildAdPresenter$1$BannerHtmlPlayerAdPresenterBuilder(this.f$1, this.f$2, this.f$3, (String) obj);
                }
            });
            return;
        }
        AdPresenterBuilder.Error error = AdPresenterBuilder.Error.INVALID_RESPONSE;
        listener.onAdPresenterBuildError(this, new AdPresenterBuilderException(error, new IllegalArgumentException("Wrong Ad Format:" + adFormat)));
    }

    public /* synthetic */ void lambda$buildAdPresenter$1$BannerHtmlPlayerAdPresenterBuilder(ApiAdResponse apiAdResponse, ApiAdRequest apiAdRequest, AdPresenterBuilder.Listener listener, String str) throws Throwable {
        super.buildAdPresenter(new SomaApiContext(apiAdRequest, apiAdResponse.newBuilder().adFormat(AdFormat.RICH_MEDIA).body(str.getBytes()).build()), listener);
    }
}
