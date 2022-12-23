package com.smaato.sdk.image.p383ad;

import android.graphics.Bitmap;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.resourceloader.ResourceLoader;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p382fi.Function;
import java.io.InputStream;

/* renamed from: com.smaato.sdk.image.ad.InterstitialImageAdPresenterBuilder */
class InterstitialImageAdPresenterBuilder extends ImageAdPresenterBuilder<InterstitialAdPresenter> {
    InterstitialImageAdPresenterBuilder(Logger logger, Function<ImageAdObject, ImageAdInteractor> function, ImageAdResponseParser imageAdResponseParser, VisibilityTrackerCreator visibilityTrackerCreator, Timer timer, ResourceLoader<InputStream, Bitmap> resourceLoader, AppBackgroundDetector appBackgroundDetector, ImageAdPresenterBuilderAdQualityViolationUtils imageAdPresenterBuilderAdQualityViolationUtils) {
        super(logger, imageAdResponseParser, resourceLoader, imageAdPresenterBuilderAdQualityViolationUtils, function, new Function(visibilityTrackerCreator, timer, appBackgroundDetector) {
            public final /* synthetic */ VisibilityTrackerCreator f$1;
            public final /* synthetic */ Timer f$2;
            public final /* synthetic */ AppBackgroundDetector f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final Object apply(Object obj) {
                return InterstitialImageAdPresenterBuilder.lambda$new$0(Logger.this, this.f$1, this.f$2, this.f$3, (ImageAdInteractor) obj);
            }
        });
    }

    static /* synthetic */ InterstitialAdPresenter lambda$new$0(Logger logger, VisibilityTrackerCreator visibilityTrackerCreator, Timer timer, AppBackgroundDetector appBackgroundDetector, ImageAdInteractor imageAdInteractor) {
        return new InterstitialImageAdPresenter(logger, imageAdInteractor, visibilityTrackerCreator, timer, appBackgroundDetector);
    }
}
