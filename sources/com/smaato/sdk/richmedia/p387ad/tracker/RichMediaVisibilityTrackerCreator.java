package com.smaato.sdk.richmedia.p387ad.tracker;

import android.view.View;
import com.smaato.sdk.core.FormatType;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

/* renamed from: com.smaato.sdk.richmedia.ad.tracker.RichMediaVisibilityTrackerCreator */
public class RichMediaVisibilityTrackerCreator {
    private final AppBackgroundDetector appBackgroundDetector;
    private final Logger logger;
    private long millis;
    private final double ratio;

    public RichMediaVisibilityTrackerCreator(Logger logger2, double d, long j, AppBackgroundDetector appBackgroundDetector2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.ratio = d;
        this.millis = j;
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
    }

    public RichMediaVisibilityTracker createTracker(View view, VisibilityTrackerListener visibilityTrackerListener, ImpressionCountingType impressionCountingType, FormatType formatType) {
        AppBackgroundAwareHandler appBackgroundAwareHandler = new AppBackgroundAwareHandler(this.logger, Threads.newUiHandler(), this.appBackgroundDetector);
        if (impressionCountingType == ImpressionCountingType.VIEWABLE) {
            this.millis = formatType.equals(FormatType.VIDEO) ? 2000 : 1000;
        } else {
            FormatType formatType2 = formatType;
        }
        return new RichMediaVisibilityTracker(this.logger, view, this.ratio, this.millis, visibilityTrackerListener, appBackgroundAwareHandler, impressionCountingType, formatType);
    }
}
