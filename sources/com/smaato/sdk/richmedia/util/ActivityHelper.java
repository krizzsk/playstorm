package com.smaato.sdk.richmedia.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;

public final class ActivityHelper {
    public boolean isDestroyedOnOrientationChange(Activity activity) {
        try {
            int i = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0).configChanges;
            boolean z = (i & 128) != 0;
            boolean z2 = (i & 1024) != 0;
            if (!z || !z2) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public boolean isLockedByUserOrDeveloper(Activity activity) {
        return DeviceUtils.isAutoRotateLocked(activity) || OrientationLockedCompat.isLockedInManifest(activity);
    }
}
