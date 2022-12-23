package com.smaato.sdk.richmedia.p387ad.tracker;

import android.graphics.Rect;
import android.view.View;
import com.smaato.sdk.core.FormatType;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Supplier;

/* renamed from: com.smaato.sdk.richmedia.ad.tracker.VisibilityTrackerUtils */
final class VisibilityTrackerUtils {
    /* renamed from: lambda$PzjyZN0vWTQvhPzfQ0m-_4MkcEw  reason: not valid java name */
    public static /* synthetic */ Rect m35111lambda$PzjyZN0vWTQvhPzfQ0m_4MkcEw() {
        return new Rect();
    }

    static boolean checkVisibility(View view, double d, ImpressionCountingType impressionCountingType, FormatType formatType) {
        Threads.ensureMainThread();
        return checkVisibility(view, d, $$Lambda$VisibilityTrackerUtils$PzjyZN0vWTQvhPzfQ0m_4MkcEw.INSTANCE, impressionCountingType, formatType);
    }

    static boolean checkVisibility(View view, double d, Supplier<Rect> supplier, ImpressionCountingType impressionCountingType, FormatType formatType) {
        if (!view.hasWindowFocus() || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            return false;
        }
        Rect rect = supplier.get();
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        int width = rect.width() * rect.height();
        if (impressionCountingType.equals(ImpressionCountingType.VIEWABLE)) {
            return checkVisibilityForDv360(width, view, formatType);
        }
        if (((double) width) >= ((double) (view.getHeight() * view.getWidth())) * d) {
            return true;
        }
        return false;
    }

    private static boolean checkVisibilityForDv360(int i, View view, FormatType formatType) {
        int height = view.getHeight() * view.getWidth();
        return formatType.equals(FormatType.VIDEO) ? ((double) i) >= ((double) height) * 0.5d : height < 242500 ? ((double) i) >= ((double) height) * 0.5d : ((double) i) >= ((double) height) * 0.3d;
    }
}
