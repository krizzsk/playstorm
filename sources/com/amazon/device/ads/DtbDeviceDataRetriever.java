package com.amazon.device.ads;

import android.content.Context;
import android.view.WindowManager;

class DtbDeviceDataRetriever {
    public static final String ORIENTATION_LANDSCAPE = "landscape";
    public static final String ORIENTATION_PORTRAIT = "portrait";
    public static final String ORIENTATION_UNKNOWN = "unknown";
    private static final int SMALLEST_TABLET_SCREEN_WIDTH = 600;
    private static int[][] rotationArray = {new int[]{1, 0, 9, 8}, new int[]{0, 9, 8, 1}};

    DtbDeviceDataRetriever() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r0 > r3) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getScreenSize(android.util.DisplayMetrics r3, java.lang.String r4) {
        /*
            android.content.Context r0 = com.amazon.device.ads.AdRegistration.getContext()     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ Exception -> 0x004c }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ Exception -> 0x004c }
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch:{ Exception -> 0x004c }
            r0.getRealMetrics(r3)     // Catch:{ Exception -> 0x004c }
            int r0 = r3.widthPixels     // Catch:{ Exception -> 0x004c }
            int r3 = r3.heightPixels     // Catch:{ Exception -> 0x004c }
            int r0 = com.amazon.device.ads.DTBAdUtil.pixelsToDeviceIndependenPixels(r0)     // Catch:{ Exception -> 0x004c }
            int r3 = com.amazon.device.ads.DTBAdUtil.pixelsToDeviceIndependenPixels(r3)     // Catch:{ Exception -> 0x004c }
            java.lang.String r1 = "landscape"
            boolean r4 = r4.equals(r1)     // Catch:{ Exception -> 0x004c }
            if (r4 == 0) goto L_0x002a
            if (r0 >= r3) goto L_0x002f
            goto L_0x002c
        L_0x002a:
            if (r0 <= r3) goto L_0x002f
        L_0x002c:
            r2 = r0
            r0 = r3
            r3 = r2
        L_0x002f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004c }
            r4.<init>()     // Catch:{ Exception -> 0x004c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x004c }
            r4.append(r0)     // Catch:{ Exception -> 0x004c }
            java.lang.String r0 = "x"
            r4.append(r0)     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x004c }
            r4.append(r3)     // Catch:{ Exception -> 0x004c }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x004c }
            return r3
        L_0x004c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DtbDeviceDataRetriever.getScreenSize(android.util.DisplayMetrics, java.lang.String):java.lang.String");
    }

    public static String getOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (rotation == 0 || rotation == 2) ? "portrait" : "landscape";
    }

    public static String getCanonicalOrientation(Context context) {
        int determineCanonicalScreenOrientation = determineCanonicalScreenOrientation(context);
        if (determineCanonicalScreenOrientation != 0) {
            if (determineCanonicalScreenOrientation != 1) {
                if (determineCanonicalScreenOrientation != 8) {
                    if (determineCanonicalScreenOrientation != 9) {
                        return "unknown";
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    private static int determineCanonicalScreenOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i = context.getResources().getConfiguration().orientation;
        boolean z = false;
        if (i != 1 ? i != 2 || rotation == 1 || rotation == 3 : rotation == 0 || rotation == 2) {
            z = true;
        }
        return rotationArray[!z][rotation];
    }

    protected static boolean isTablet() {
        return AdRegistration.getContext().getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }
}
