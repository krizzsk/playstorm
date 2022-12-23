package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.mbridge.msdk.foundation.tools.h */
/* compiled from: DomainSameTool */
public class C8578h {

    /* renamed from: a */
    private static String f20730a = "DomainSameTool";

    /* renamed from: a */
    public static boolean m24769a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            if (resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C8608u.m24881a(f20730a, th.getMessage(), th);
            return false;
        }
    }
}
