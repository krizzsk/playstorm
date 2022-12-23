package com.unity3d.services.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LifecycleCache implements Application.ActivityLifecycleCallbacks {
    private boolean _appActive = true;
    private Map<String, IAppActiveListener> _appActiveListeners = new ConcurrentHashMap();
    private LifecycleEvent _currentState = LifecycleEvent.RESUMED;

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.CREATED;
    }

    public void onActivityStarted(Activity activity) {
        this._currentState = LifecycleEvent.STARTED;
    }

    public void onActivityResumed(Activity activity) {
        this._currentState = LifecycleEvent.RESUMED;
        this._appActive = true;
        if (this._appActiveListeners.containsKey(activity.getClass().getName())) {
            notifyListeners(activity.getClass().getName());
        }
    }

    public void onActivityPaused(Activity activity) {
        this._currentState = LifecycleEvent.PAUSED;
        this._appActive = false;
        if (this._appActiveListeners.containsKey(activity.getClass().getName())) {
            notifyListeners(activity.getClass().getName());
        }
    }

    public void onActivityStopped(Activity activity) {
        this._currentState = LifecycleEvent.STOPPED;
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.SAVE_INSTANCE_STATE;
    }

    public void onActivityDestroyed(Activity activity) {
        this._currentState = LifecycleEvent.DESTROYED;
    }

    public LifecycleEvent getCurrentState() {
        return this._currentState;
    }

    public boolean isAppActive() {
        return this._appActive;
    }

    public void notifyListeners(String str) {
        if (this._appActiveListeners.get(str) != null) {
            this._appActiveListeners.get(str).onAppStateChanged(this._appActive ? LifecycleEvent.RESUMED : LifecycleEvent.PAUSED);
        }
    }

    public void addListener(String str, IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.put(str, iAppActiveListener);
    }

    public void removeListener(String str) {
        this._appActiveListeners.remove(str);
    }
}
