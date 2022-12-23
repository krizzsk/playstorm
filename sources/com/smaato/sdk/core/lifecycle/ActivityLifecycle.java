package com.smaato.sdk.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.lifecycle.Lifecycle;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.lang.ref.WeakReference;

public class ActivityLifecycle extends Lifecycle implements Application.ActivityLifecycleCallbacks {
    @Inject
    public static Application application;
    WeakReference<Activity> activity;

    public void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }

    public ActivityLifecycle(Activity activity2) {
        this.activity = new WeakReference<>(activity2);
        AndroidsInjector.injectStatic(ActivityLifecycle.class);
        application.registerActivityLifecycleCallbacks(this);
    }

    public void onActivityCreated(Activity activity2, Bundle bundle) {
        if (activity2 == this.activity.get()) {
            notifyObservers(new Consumer() {
                public final void accept(Object obj) {
                    ActivityLifecycle.this.lambda$onActivityCreated$0$ActivityLifecycle((Lifecycle.Observer) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onActivityCreated$0$ActivityLifecycle(Lifecycle.Observer observer) {
        observer.onCreate(this);
    }

    public void onActivityStarted(Activity activity2) {
        if (activity2 == this.activity.get()) {
            notifyObservers(new Consumer() {
                public final void accept(Object obj) {
                    ActivityLifecycle.this.lambda$onActivityStarted$1$ActivityLifecycle((Lifecycle.Observer) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onActivityStarted$1$ActivityLifecycle(Lifecycle.Observer observer) {
        observer.onStart(this);
    }

    public void onActivityResumed(Activity activity2) {
        if (activity2 == this.activity.get()) {
            notifyObservers(new Consumer() {
                public final void accept(Object obj) {
                    ActivityLifecycle.this.lambda$onActivityResumed$2$ActivityLifecycle((Lifecycle.Observer) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onActivityResumed$2$ActivityLifecycle(Lifecycle.Observer observer) {
        observer.onResume(this);
    }

    public void onActivityPaused(Activity activity2) {
        if (activity2 == this.activity.get()) {
            notifyObservers(new Consumer() {
                public final void accept(Object obj) {
                    ActivityLifecycle.this.lambda$onActivityPaused$3$ActivityLifecycle((Lifecycle.Observer) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onActivityPaused$3$ActivityLifecycle(Lifecycle.Observer observer) {
        observer.onPause(this);
    }

    public void onActivityStopped(Activity activity2) {
        if (activity2 == this.activity.get()) {
            notifyObservers(new Consumer() {
                public final void accept(Object obj) {
                    ActivityLifecycle.this.lambda$onActivityStopped$4$ActivityLifecycle((Lifecycle.Observer) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onActivityStopped$4$ActivityLifecycle(Lifecycle.Observer observer) {
        observer.onStop(this);
    }

    public void onActivityDestroyed(Activity activity2) {
        if (activity2 == this.activity.get()) {
            notifyObservers(new Consumer() {
                public final void accept(Object obj) {
                    ActivityLifecycle.this.lambda$onActivityDestroyed$5$ActivityLifecycle((Lifecycle.Observer) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onActivityDestroyed$5$ActivityLifecycle(Lifecycle.Observer observer) {
        observer.onDestroy(this);
    }
}
