package com.smaato.sdk.richmedia.p387ad.tracker;

import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.smaato.sdk.core.FormatType;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.PauseUnpauseListener;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTracker;
import java.lang.ref.WeakReference;

/* renamed from: com.smaato.sdk.richmedia.ad.tracker.RichMediaVisibilityTracker */
public class RichMediaVisibilityTracker {
    private final AppBackgroundAwareHandler appBackgroundAwareHandler;
    private final FormatType formatType;
    private ImpressionCountingType impressionCountingType;
    private VisibilityTrackerListener listener;
    private ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() {
        public boolean onPreDraw() {
            boolean unused = RichMediaVisibilityTracker.this.viewOnScreen = true;
            RichMediaVisibilityTracker.this.attemptToStartTracking();
            return true;
        }
    };
    private boolean trackingRequested = false;
    private boolean trackingStarted = false;
    /* access modifiers changed from: private */
    public boolean viewOnScreen = false;
    private final double visibilityRatio;
    private final long visibilityTimeInMillis;
    private WeakReference<View> weakContentView;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver = new WeakReference<>((Object) null);

    RichMediaVisibilityTracker(Logger logger, View view, double d, long j, VisibilityTrackerListener visibilityTrackerListener, AppBackgroundAwareHandler appBackgroundAwareHandler2, ImpressionCountingType impressionCountingType2, FormatType formatType2) {
        Objects.requireNonNull(logger);
        this.weakContentView = new WeakReference<>((View) Objects.requireNonNull(view));
        if (d <= 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("visibilityRatio should be in range (0..1]");
        }
        this.visibilityRatio = d;
        if (((double) j) >= 0.0d) {
            this.visibilityTimeInMillis = j;
            this.formatType = formatType2;
            this.listener = (VisibilityTrackerListener) Objects.requireNonNull(visibilityTrackerListener);
            this.appBackgroundAwareHandler = (AppBackgroundAwareHandler) Objects.requireNonNull(appBackgroundAwareHandler2);
            View rootView = view.getRootView();
            if (rootView != null) {
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver);
                if (!viewTreeObserver.isAlive()) {
                    logger.error(LogDomain.AD, "Cannot start RichMediaVisibilityTracker due to no available root view", new Object[0]);
                } else {
                    viewTreeObserver.addOnPreDrawListener(this.onPreDrawListener);
                }
            } else {
                logger.error(LogDomain.AD, "Cannot start RichMediaVisibilityTracker due to no available root view", new Object[0]);
            }
            this.impressionCountingType = impressionCountingType2;
            return;
        }
        throw new IllegalArgumentException("visibilityTimeInMillis should be bigger or equal to 0");
    }

    /* access modifiers changed from: private */
    public void attemptToStartTracking() {
        if (this.listener != null && this.viewOnScreen && this.trackingRequested && this.weakContentView.get() != null && !this.trackingStarted) {
            this.trackingStarted = true;
            checkVisibility(new CheckContext(SystemClock.uptimeMillis()));
        }
    }

    public void requestStartTracking() {
        Threads.ensureMainThread();
        this.trackingRequested = true;
        attemptToStartTracking();
    }

    private void checkVisibility(CheckContext checkContext) {
        this.appBackgroundAwareHandler.postDelayed("rich-media visibility tracker", new Runnable(checkContext) {
            public final /* synthetic */ RichMediaVisibilityTracker.CheckContext f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                RichMediaVisibilityTracker.this.lambda$checkVisibility$0$RichMediaVisibilityTracker(this.f$1);
            }
        }, 250, checkContext);
    }

    public /* synthetic */ void lambda$checkVisibility$0$RichMediaVisibilityTracker(CheckContext checkContext) {
        View view = (View) this.weakContentView.get();
        if (view != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            boolean checkVisibility = VisibilityTrackerUtils.checkVisibility(view, this.visibilityRatio, this.impressionCountingType, this.formatType);
            if (checkContext.wasVisible) {
                long j = checkContext.totalVisibilityTime + (uptimeMillis - checkContext.previousCheckTime);
                checkContext.totalVisibilityTime = j;
                if (j >= this.visibilityTimeInMillis) {
                    Log.i("AD:", "STATUS_onVisibilityHappen");
                    Objects.onNotNull(this.listener, $$Lambda$ZRw1a1F8uUHh6CN_JPq0mog3Qw.INSTANCE);
                    return;
                }
                checkContext.previousCheckTime = uptimeMillis;
                checkContext.wasVisible = checkVisibility;
                checkVisibility(checkContext);
                return;
            }
            checkContext.previousCheckTime = uptimeMillis;
            checkContext.wasVisible = checkVisibility;
            checkVisibility(checkContext);
        }
    }

    public void destroy() {
        Threads.ensureMainThread();
        this.appBackgroundAwareHandler.stop();
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakContentView.clear();
        this.weakViewTreeObserver.clear();
        this.listener = null;
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.tracker.RichMediaVisibilityTracker$CheckContext */
    static class CheckContext implements PauseUnpauseListener {
        long pausedAt = 0;
        long previousCheckTime;
        long totalVisibilityTime = 0;
        boolean wasVisible = false;

        CheckContext(long j) {
            this.previousCheckTime = j;
        }

        public void onActionPaused() {
            this.pausedAt = SystemClock.uptimeMillis();
        }

        public void onBeforeActionUnpaused() {
            long uptimeMillis = SystemClock.uptimeMillis() - this.pausedAt;
            this.pausedAt = 0;
            this.previousCheckTime += uptimeMillis;
        }
    }
}
