package com.ogury.p376ed.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.ogury.ed.internal.cx */
public abstract class C10422cx implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C10765mq.m32773b(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        C10765mq.m32773b(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C10765mq.m32773b(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        C10765mq.m32773b(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C10765mq.m32773b(activity, "activity");
        C10765mq.m32773b(bundle, "p1");
    }

    public void onActivityStarted(Activity activity) {
        C10765mq.m32773b(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        C10765mq.m32773b(activity, "activity");
    }
}
