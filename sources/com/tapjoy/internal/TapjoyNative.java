package com.tapjoy.internal;

import android.content.Context;
import com.tapjoy.TJPlacementListener;

public class TapjoyNative {
    public static Object createPlacement(Context context, String str, TJPlacementListener tJPlacementListener) {
        return C11673gf.m33863a().mo72552a(context, str, tJPlacementListener);
    }

    public static Object getPrivacyPolicy() {
        return C11673gf.m33863a().mo72553b();
    }
}
