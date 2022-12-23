package com.smaato.sdk.richmedia.util;

import android.content.Context;
import android.graphics.Rect;
import com.smaato.sdk.core.util.UIUtils;
import com.smaato.sdk.richmedia.mraid.MraidUtils;

public final class RectUtils {
    private RectUtils() {
    }

    public static Rect adjust(Rect rect, Rect rect2) {
        if (rect2.contains(rect)) {
            return rect;
        }
        Rect rect3 = new Rect(rect);
        int i = rect3.left;
        int i2 = rect2.left;
        if (i < i2) {
            rect3.left = i2;
            rect3.right = i2 + rect.width();
        }
        int i3 = rect3.right;
        int i4 = rect2.right;
        if (i3 > i4) {
            int max = Math.max(rect2.left, i4 - rect.width());
            rect3.left = max;
            rect3.right = max + Math.min(rect.width(), rect2.width());
        }
        int i5 = rect3.top;
        int i6 = rect2.top;
        if (i5 < i6) {
            rect3.top = i6;
            rect3.bottom = i6 + rect.height();
        }
        int i7 = rect3.bottom;
        int i8 = rect2.bottom;
        if (i7 > i8) {
            int max2 = Math.max(rect2.top, i8 - rect.height());
            rect3.top = max2;
            rect3.bottom = max2 + Math.min(rect.height(), rect2.height());
        }
        return rect3;
    }

    public static String rectToString(Rect rect) {
        if (rect.isEmpty()) {
            return "null";
        }
        return MraidUtils.format("{ \"x\":%d, \"y\":%d, \"width\":%d, \"height\":%d }", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    public static Rect mapToDp(Context context, Rect rect) {
        return new Rect(UIUtils.pxToDp(context, (float) rect.left), UIUtils.pxToDp(context, (float) rect.top), UIUtils.pxToDp(context, (float) rect.right), UIUtils.pxToDp(context, (float) rect.bottom));
    }

    public static Rect mapToPx(Context context, Rect rect) {
        return new Rect(UIUtils.dpToPx(context, (float) rect.left), UIUtils.dpToPx(context, (float) rect.top), UIUtils.dpToPx(context, (float) rect.right), UIUtils.dpToPx(context, (float) rect.bottom));
    }
}
