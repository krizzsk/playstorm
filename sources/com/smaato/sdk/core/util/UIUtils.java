package com.smaato.sdk.core.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.smaato.sdk.core.util.p382fi.Function;

public final class UIUtils {
    public static int dpToPx(float f, float f2) {
        return (int) ((f * f2) + 0.5f);
    }

    private UIUtils() {
    }

    public static int dpToPx(Context context, float f) {
        return (int) (f * context.getResources().getDisplayMetrics().density);
    }

    public static int pxToDp(Context context, float f) {
        return Math.round(f / context.getResources().getDisplayMetrics().density);
    }

    public static int getDisplayWidthInDp() {
        return scale($$Lambda$UIUtils$xu200yBj8PmxTRAePrfoyKqe0k.INSTANCE);
    }

    public static int getDisplayHeightInDp() {
        return scale($$Lambda$UIUtils$RA8IVAqFSsKoSeUiSrTL2y1jFi8.INSTANCE);
    }

    public static float getNormalizedSize(Float f) {
        if (f == null || f.floatValue() <= 0.0f) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public static Size getDisplaySizeInDp(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return new Size(pxToDp(context, (float) displayMetrics.widthPixels), pxToDp(context, (float) displayMetrics.heightPixels));
    }

    private static int scale(Function<DisplayMetrics, Integer> function) {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        return (int) (((float) function.apply(displayMetrics).intValue()) / displayMetrics.density);
    }
}
