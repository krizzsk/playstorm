package com.smaato.sdk.nativead.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.smaato.sdk.core.FormatType;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.util.HandlerCompat;
import com.smaato.sdk.nativead.viewmodel.NativeAdViewModel;

public class ViewVisibilityObserver implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private static long expectedVisibilityTimeMs = 1000;
    private FormatType formatType;
    private final Handler handler = HandlerCompat.create(Looper.getMainLooper());
    private ImpressionCountingType impressionCountingType;
    private final NativeAdViewModel nativeAdViewModel;
    private View view;
    private VisibilityAnalyzer visibilityAnalyzer;

    public void onViewAttachedToWindow(View view2) {
    }

    public ViewVisibilityObserver(NativeAdViewModel nativeAdViewModel2) {
        this.nativeAdViewModel = nativeAdViewModel2;
    }

    public void observe(View view2, ImpressionCountingType impressionCountingType2, FormatType formatType2) {
        this.view = view2;
        this.impressionCountingType = impressionCountingType2;
        this.formatType = formatType2;
        this.visibilityAnalyzer = new VisibilityAnalyzer(view2, impressionCountingType2);
        view2.getViewTreeObserver().addOnPreDrawListener(this);
        view2.addOnAttachStateChangeListener(this);
    }

    public void onViewDetachedFromWindow(View view2) {
        this.view.getViewTreeObserver().removeOnPreDrawListener(this);
        this.view.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        if (this.visibilityAnalyzer.isImpressed()) {
            if (this.impressionCountingType.equals(ImpressionCountingType.VIEWABLE)) {
                expectedVisibilityTimeMs = checkIfIsViewableVideo() ? 2000 : 1000;
                this.handler.postDelayed(new Runnable() {
                    public final void run() {
                        ViewVisibilityObserver.this.checkIfImpressedAfterTimeElapsedForViewableAgain();
                    }
                }, expectedVisibilityTimeMs);
            } else {
                this.nativeAdViewModel.onAdImpressed();
            }
        }
        if (this.visibilityAnalyzer.is100PercentVisible()) {
            this.handler.postDelayed(new Runnable() {
                public final void run() {
                    ViewVisibilityObserver.this.check100PercentVisibilityAgain();
                }
            }, expectedVisibilityTimeMs);
        }
        if (!this.visibilityAnalyzer.is50PercentVisible()) {
            return true;
        }
        this.handler.postDelayed(new Runnable() {
            public final void run() {
                ViewVisibilityObserver.this.check50PercentVisibilityAgain();
            }
        }, expectedVisibilityTimeMs);
        return true;
    }

    /* access modifiers changed from: private */
    public void check100PercentVisibilityAgain() {
        if (this.visibilityAnalyzer.is100PercentVisible()) {
            this.nativeAdViewModel.on100PercentVisible();
        }
    }

    /* access modifiers changed from: private */
    public void check50PercentVisibilityAgain() {
        if (this.visibilityAnalyzer.is50PercentVisible() || this.visibilityAnalyzer.is100PercentVisible()) {
            this.nativeAdViewModel.on50PercentVisible();
        }
    }

    private boolean checkIfIsViewableVideo() {
        return this.formatType.equals(FormatType.VIDEO) && this.impressionCountingType.equals(ImpressionCountingType.VIEWABLE);
    }

    /* access modifiers changed from: private */
    public void checkIfImpressedAfterTimeElapsedForViewableAgain() {
        if (this.visibilityAnalyzer.isImpressed()) {
            this.nativeAdViewModel.onAdImpressed();
        }
    }
}
