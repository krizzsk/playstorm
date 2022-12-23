package com.tapjoy.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: com.tapjoy.internal.ac */
public final class C11415ac {
    /* renamed from: a */
    public static void m33205a(Window window, View view, ViewGroup.LayoutParams layoutParams) {
        Window.Callback callback = window.getCallback();
        window.setCallback((Window.Callback) null);
        window.addContentView(view, layoutParams);
        window.setCallback(callback);
    }

    /* renamed from: a */
    public static int m33204a(Window window) {
        Rect rect = new Rect();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }
}
