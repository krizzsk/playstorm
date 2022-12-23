package com.smaato.sdk.richmedia.mraid.presenter;

import android.app.Activity;
import android.content.Context;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidOrientationProperties;
import com.smaato.sdk.richmedia.util.ActivityHelper;
import com.smaato.sdk.richmedia.util.DeviceUtils;

public final class OrientationManager {
    private final ActivityHelper activityHelper;
    private final Logger logger;
    private Integer originalOrientation;

    public OrientationManager(Logger logger2, ActivityHelper activityHelper2) {
        this.logger = logger2;
        this.activityHelper = activityHelper2;
    }

    /* access modifiers changed from: package-private */
    public void applyOrientationProperties(Context context, MraidOrientationProperties mraidOrientationProperties) {
        Threads.ensureMainThread();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            boolean z = false;
            if (this.activityHelper.isLockedByUserOrDeveloper(activity)) {
                this.logger.error(LogDomain.MRAID, "Won't apply orientation properties. Reason: Activity is locked", new Object[0]);
            } else if (this.activityHelper.isDestroyedOnOrientationChange(activity)) {
                this.logger.error(LogDomain.MRAID, "Won't apply orientation properties. Reason: Activity might be destroyed on orientation change", new Object[0]);
            } else {
                DeviceUtils.ScreenOrientation screenOrientation = mraidOrientationProperties.forceOrientation;
                if (screenOrientation == DeviceUtils.ScreenOrientation.PORTRAIT || screenOrientation == DeviceUtils.ScreenOrientation.LANDSCAPE) {
                    z = true;
                }
                if (z) {
                    lockOrientation(activity, screenOrientation);
                } else if (mraidOrientationProperties.allowOrientationChange) {
                    unlockOrientation(activity);
                } else {
                    lockOrientation(activity, DeviceUtils.getScreenOrientation(context));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void restoreOriginalOrientation(Context context) {
        Threads.ensureMainThread();
        Integer num = this.originalOrientation;
        if (num != null && (context instanceof Activity)) {
            setOrientation((Activity) context, num.intValue());
            this.originalOrientation = null;
        }
    }

    private void lockOrientation(Activity activity, DeviceUtils.ScreenOrientation screenOrientation) {
        this.originalOrientation = Integer.valueOf(activity.getRequestedOrientation());
        setOrientation(activity, DeviceUtils.getActivityInfoOrientation(screenOrientation));
    }

    private void unlockOrientation(Activity activity) {
        setOrientation(activity, -1);
    }

    private void setOrientation(Activity activity, int i) {
        activity.setRequestedOrientation(i);
    }
}
