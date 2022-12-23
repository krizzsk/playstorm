package com.amazon.device.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.lang.ref.WeakReference;

public class ActivityMonitor implements Application.ActivityLifecycleCallbacks {
    private static ActivityMonitor theInstance;
    private DTBActivityListener activityListener;
    private WeakReference<Activity> currentActivity;

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    ActivityMonitor(Context context) {
        if (context != null) {
            Application application = (Application) context.getApplicationContext();
            if (application != null) {
                setCurrentActivity(context);
                application.registerActivityLifecycleCallbacks(this);
            }
            theInstance = this;
        }
    }

    /* access modifiers changed from: package-private */
    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.currentActivity;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    static ActivityMonitor getInstance() {
        return theInstance;
    }

    /* access modifiers changed from: package-private */
    public void setActivityListener(DTBActivityListener dTBActivityListener) {
        this.activityListener = dTBActivityListener;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.currentActivity = new WeakReference<>(activity);
    }

    public void onActivityResumed(Activity activity) {
        this.currentActivity = new WeakReference<>(activity);
        DTBActivityListener dTBActivityListener = this.activityListener;
        if (dTBActivityListener != null) {
            dTBActivityListener.onActivityResumed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        DTBActivityListener dTBActivityListener = this.activityListener;
        if (dTBActivityListener != null) {
            dTBActivityListener.onActivityPaused(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        DTBActivityListener dTBActivityListener = this.activityListener;
        if (dTBActivityListener != null) {
            dTBActivityListener.onActivityStopped(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        DTBActivityListener dTBActivityListener = this.activityListener;
        if (dTBActivityListener != null) {
            dTBActivityListener.onActivityDestroyed(activity);
            if (getCurrentActivity() == activity) {
                this.currentActivity = null;
            }
        }
    }

    private void setCurrentActivity(Context context) {
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (context instanceof Activity) {
            this.currentActivity = new WeakReference<>((Activity) context);
        } else {
            setCurrentActivity(((ContextWrapper) context).getBaseContext());
        }
    }
}
