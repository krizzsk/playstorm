package com.amazon.device.ads;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.HashSet;

class AdUtils {
    public static final String REQUIRED_ACTIVITY = "com.amazon.device.ads.AdActivity";
    private static AdUtilsExecutor executor = new AdUtilsExecutor();

    private AdUtils() {
    }

    public static double calculateScalingMultiplier(int i, int i2, int i3, int i4) {
        return executor.calculateScalingMultiplier(i, i2, i3, i4);
    }

    public static int pixelToDeviceIndependentPixel(int i) {
        return executor.pixelToDeviceIndependentPixel(i);
    }

    public static int deviceIndependentPixelToPixel(int i) {
        return executor.deviceIndependentPixelToPixel(i);
    }

    public static float getScalingFactorAsFloat() {
        return executor.getScalingFactorAsFloat();
    }

    static class AdUtilsExecutor {
        private boolean hasRequiredActivities = false;
        private final HashSet<String> requiredActivities;

        /* access modifiers changed from: package-private */
        public double calculateScalingMultiplier(int i, int i2, int i3, int i4) {
            double d = ((double) i3) / ((double) i);
            double d2 = ((double) i4) / ((double) i2);
            if ((d2 < d || d == 0.0d) && d2 != 0.0d) {
                d = d2;
            }
            if (d == 0.0d) {
                return 1.0d;
            }
            return d;
        }

        AdUtilsExecutor() {
            HashSet<String> hashSet = new HashSet<>();
            this.requiredActivities = hashSet;
            hashSet.add(AdUtils.REQUIRED_ACTIVITY);
        }

        /* access modifiers changed from: package-private */
        public int pixelToDeviceIndependentPixel(int i) {
            return (int) (((float) i) / getScalingFactorAsFloat());
        }

        /* access modifiers changed from: package-private */
        public int deviceIndependentPixelToPixel(int i) {
            return (int) (i == -1 ? (float) i : ((float) i) * getScalingFactorAsFloat());
        }

        /* access modifiers changed from: package-private */
        public float getScalingFactorAsFloat() {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) AdRegistration.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.scaledDensity;
        }
    }
}
