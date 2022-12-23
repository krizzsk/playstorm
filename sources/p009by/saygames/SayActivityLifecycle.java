package p009by.saygames;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: by.saygames.SayActivityLifecycle */
public class SayActivityLifecycle implements Application.ActivityLifecycleCallbacks {
    public static SayActivityLifecycle instance = new SayActivityLifecycle();
    private boolean _isSubscribed = false;
    private int _stateChangeCounter = 0;

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public boolean IsApplicationPaused() {
        return this._stateChangeCounter == 0;
    }

    public void registerActivityLifecycle(Application application) {
        if (!this._isSubscribed) {
            this._isSubscribed = true;
            application.registerActivityLifecycleCallbacks(instance);
        }
    }

    public void onActivityResumed(Activity activity) {
        this._stateChangeCounter++;
    }

    public void onActivityPaused(Activity activity) {
        this._stateChangeCounter--;
    }
}
