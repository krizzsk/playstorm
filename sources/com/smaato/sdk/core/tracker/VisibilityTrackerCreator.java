package com.smaato.sdk.core.tracker;

import android.view.View;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

public class VisibilityTrackerCreator {
    private final String actionName;
    private final AppBackgroundDetector appBackgroundDetector;
    private final Logger logger;
    private final long millis;
    private final double ratio;

    public VisibilityTrackerCreator(Logger logger2, double d, long j, AppBackgroundDetector appBackgroundDetector2, String str) {
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger cannot be null for VisibilityTrackerCreator::VisibilityTrackerCreator");
        this.ratio = d;
        this.millis = j;
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        this.actionName = (String) Objects.requireNonNull(str);
    }

    public VisibilityTracker createTracker(View view, VisibilityTrackerListener visibilityTrackerListener, ImpressionCountingType impressionCountingType) {
        return new VisibilityTracker(this.logger, view, this.ratio, this.millis, visibilityTrackerListener, new AppBackgroundAwareHandler(this.logger, Threads.newUiHandler(), this.appBackgroundDetector), this.actionName, impressionCountingType);
    }
}
