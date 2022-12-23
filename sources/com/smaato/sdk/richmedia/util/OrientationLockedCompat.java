package com.smaato.sdk.richmedia.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Build;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.Supplier;

final class OrientationLockedCompat {
    static boolean isLockedInManifest(Activity activity) {
        try {
            return isLockedInternal(activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0).screenOrientation, new Supplier(activity) {
                public final /* synthetic */ Activity f$0;

                {
                    this.f$0 = r1;
                }

                public final Object get() {
                    return Boolean.valueOf(OrientationLockedCompat.isParentActivityLocked(this.f$0, $$Lambda$aRkGwxNpj3UQRxXlag_MZ4yW8T4.INSTANCE));
                }
            });
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    static boolean isLocked(Activity activity) {
        return isLockedInternal(activity.getRequestedOrientation(), new Supplier(activity) {
            public final /* synthetic */ Activity f$0;

            {
                this.f$0 = r1;
            }

            public final Object get() {
                return Boolean.valueOf(OrientationLockedCompat.isParentActivityLocked(this.f$0, $$Lambda$TU_ODqwvsrXSHKjB57wiKtsz5gQ.INSTANCE));
            }
        });
    }

    private static boolean isLockedInternal(int i, Supplier<Boolean> supplier) {
        if (Build.VERSION.SDK_INT >= 18) {
            return isOrientationLockedJellyBeanMR2(i, supplier);
        }
        return isOrientationLockedBase(i, supplier);
    }

    private static boolean isOrientationLockedBase(int i, Supplier<Boolean> supplier) {
        if (!(i == 0 || i == 1)) {
            if (i == 3) {
                return supplier.get().booleanValue();
            }
            switch (i) {
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private static boolean isOrientationLockedJellyBeanMR2(int i, Supplier<Boolean> supplier) {
        if (i == 11 || i == 12 || i == 14) {
            return true;
        }
        return isOrientationLockedBase(i, supplier);
    }

    private static boolean isParentActivityLocked(Activity activity, Function<Activity, Boolean> function) {
        if (!activity.isChild()) {
            return false;
        }
        return function.apply(activity.getParent()).booleanValue();
    }
}
