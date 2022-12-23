package com.mbridge.msdk.foundation.tools;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.mbridge.msdk.foundation.tools.ag */
/* compiled from: ViewUtil */
public final class C8561ag {
    /* renamed from: a */
    public static void m24756a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }
}
