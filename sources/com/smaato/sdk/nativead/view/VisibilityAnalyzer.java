package com.smaato.sdk.nativead.view;

import android.graphics.Rect;
import android.view.View;
import com.smaato.sdk.core.api.ImpressionCountingType;

public class VisibilityAnalyzer {
    private final ImpressionCountingType impressionCountingType;
    private final View view;
    private int visibleArea;

    public VisibilityAnalyzer(View view2, ImpressionCountingType impressionCountingType2) {
        this.view = view2;
        this.impressionCountingType = impressionCountingType2;
    }

    public boolean isImpressed() {
        if (this.impressionCountingType.equals(ImpressionCountingType.VIEWABLE)) {
            if (getViewVisibilityRatio() <= 0.1d || !checkVisibilityForImpressionTypeViewable((double) this.visibleArea, this.view)) {
                return false;
            }
            return true;
        } else if (getViewVisibilityRatio() > 0.1d) {
            return true;
        } else {
            return false;
        }
    }

    public boolean is50PercentVisible() {
        return getViewVisibilityRatio() >= 0.5d;
    }

    public boolean is100PercentVisible() {
        return getViewVisibilityRatio() >= 1.0d;
    }

    private double getViewVisibilityRatio() {
        if (this.view.getWidth() <= 0 || this.view.getHeight() <= 0 || !this.view.isShown()) {
            return 0.0d;
        }
        Rect rect = new Rect();
        if (!this.view.getGlobalVisibleRect(rect)) {
            return 0.0d;
        }
        this.visibleArea = rect.width() * rect.height();
        return ((double) this.visibleArea) / ((double) (this.view.getWidth() * this.view.getHeight()));
    }

    private boolean checkVisibilityForImpressionTypeViewable(double d, View view2) {
        int height = view2.getHeight() * view2.getWidth();
        return height < 242500 ? d >= ((double) height) * 0.5d : d >= ((double) height) * 0.3d;
    }
}
