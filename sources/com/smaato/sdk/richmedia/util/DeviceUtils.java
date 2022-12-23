package com.smaato.sdk.richmedia.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import com.smaato.sdk.core.util.AppMetaData;
import com.smaato.sdk.core.util.Intents;

public final class DeviceUtils {

    public enum ScreenOrientation {
        PORTRAIT,
        LANDSCAPE,
        UNKNOWN
    }

    private static boolean containsFlag(int i, int i2) {
        return (i & i2) != 0;
    }

    private DeviceUtils() {
    }

    public static boolean isLocationAvailable(AppMetaData appMetaData) {
        return appMetaData.isPermissionGranted("android.permission.ACCESS_FINE_LOCATION") || appMetaData.isPermissionGranted("android.permission.ACCESS_COARSE_LOCATION");
    }

    public static boolean isInlineVideoSupported(Context context, WebView webView) {
        if (context instanceof Activity) {
            for (View view = webView; view != null; view = (View) view.getParent()) {
                if (!view.isHardwareAccelerated() || containsFlag(view.getLayerType(), 1)) {
                    return false;
                }
                if (!(view.getParent() instanceof View)) {
                    break;
                }
            }
            Window window = ((Activity) context).getWindow();
            if (window != null) {
                return containsFlag(window.getAttributes().flags, 16777216);
            }
        }
        return false;
    }

    public static boolean isSmsAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return Intents.canHandleIntent(context, intent);
    }

    public static boolean isTelAvailable(Context context) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return Intents.canHandleIntent(context, intent);
    }

    public static ScreenOrientation getScreenOrientation(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i == 1) {
            return ScreenOrientation.PORTRAIT;
        }
        if (i != 2) {
            return ScreenOrientation.UNKNOWN;
        }
        return ScreenOrientation.LANDSCAPE;
    }

    /* renamed from: com.smaato.sdk.richmedia.util.DeviceUtils$1 */
    static /* synthetic */ class C112521 {

        /* renamed from: $SwitchMap$com$smaato$sdk$richmedia$util$DeviceUtils$ScreenOrientation */
        static final /* synthetic */ int[] f27150xecb9dd8b;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.smaato.sdk.richmedia.util.DeviceUtils$ScreenOrientation[] r0 = com.smaato.sdk.richmedia.util.DeviceUtils.ScreenOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27150xecb9dd8b = r0
                com.smaato.sdk.richmedia.util.DeviceUtils$ScreenOrientation r1 = com.smaato.sdk.richmedia.util.DeviceUtils.ScreenOrientation.PORTRAIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27150xecb9dd8b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.richmedia.util.DeviceUtils$ScreenOrientation r1 = com.smaato.sdk.richmedia.util.DeviceUtils.ScreenOrientation.LANDSCAPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27150xecb9dd8b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.richmedia.util.DeviceUtils$ScreenOrientation r1 = com.smaato.sdk.richmedia.util.DeviceUtils.ScreenOrientation.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.util.DeviceUtils.C112521.<clinit>():void");
        }
    }

    public static int getActivityInfoOrientation(ScreenOrientation screenOrientation) {
        int i = C112521.f27150xecb9dd8b[screenOrientation.ordinal()];
        if (i != 1) {
            return i != 2 ? -1 : 0;
        }
        return 1;
    }

    public static boolean isOrientationLocked(Context context) {
        if (isAutoRotateLocked(context)) {
            return true;
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        return OrientationLockedCompat.isLocked((Activity) context);
    }

    static boolean isAutoRotateLocked(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 0;
    }
}
