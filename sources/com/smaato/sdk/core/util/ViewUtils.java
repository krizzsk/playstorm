package com.smaato.sdk.core.util;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;

public final class ViewUtils {
    private ViewUtils() {
    }

    public static View getRootView(View view) {
        View rootViewOfActivity = getRootViewOfActivity(view.getContext());
        return rootViewOfActivity == null ? getRootViewOfView(view) : rootViewOfActivity;
    }

    private static View getRootViewOfActivity(Context context) {
        Window window;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
            return window.getDecorView().findViewById(16908290);
        }
        return null;
    }

    private static View getRootViewOfView(View view) {
        if (!isAttachedToWindow(view)) {
            Log.d("SmaatoSDK", "Attempting to call View#getRootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        return findViewById == null ? rootView : findViewById;
    }

    public static ViewGroup getParent(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public static void removeFromParent(View view) {
        ViewGroup parent = getParent(view);
        if (parent != null) {
            parent.removeView(view);
        }
    }

    private static boolean isAttachedToWindow(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }
}
