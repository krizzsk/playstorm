package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.smaato.sdk.core.util.ActivityLifecycleCallbacksAdapter;
import java.lang.ref.WeakReference;

public final class ActivityProvider {
    private static final ActivityProvider instance = new ActivityProvider();
    /* access modifiers changed from: private */
    public WeakReference<Activity> activityWeakReference = new WeakReference<>((Object) null);

    private ActivityProvider() {
    }

    public static ActivityProvider get() {
        return instance;
    }

    public static void init(Context context) {
        instance.attach(context);
    }

    public Activity getCurrentActivity() {
        return (Activity) this.activityWeakReference.get();
    }

    private void attach(Context context) {
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacksAdapter() {
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    WeakReference unused = ActivityProvider.this.activityWeakReference = new WeakReference(activity);
                }

                public void onActivityStarted(Activity activity) {
                    WeakReference unused = ActivityProvider.this.activityWeakReference = new WeakReference(activity);
                }

                public void onActivityResumed(Activity activity) {
                    WeakReference unused = ActivityProvider.this.activityWeakReference = new WeakReference(activity);
                }

                public void onActivityPaused(Activity activity) {
                    if (ActivityProvider.this.activityWeakReference.get() == activity) {
                        ActivityProvider.this.activityWeakReference.clear();
                    }
                }

                public void onActivityStopped(Activity activity) {
                    if (ActivityProvider.this.activityWeakReference.get() == activity) {
                        ActivityProvider.this.activityWeakReference.clear();
                    }
                }
            });
        }
    }
}
