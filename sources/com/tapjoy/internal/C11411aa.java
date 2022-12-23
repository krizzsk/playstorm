package com.tapjoy.internal;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: com.tapjoy.internal.aa */
public final class C11411aa {
    /* renamed from: a */
    public static void m33202a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
