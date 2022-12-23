package com.fyber.inneractive.sdk.network;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import com.fyber.inneractive.sdk.network.C4534c;

/* renamed from: com.fyber.inneractive.sdk.network.d */
public class C4537d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C4534c f11216a;

    public C4537d(C4534c cVar) {
        this.f11216a = cVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C4534c cVar = this.f11216a;
        Handler handler = cVar.f11202d;
        if (handler != null) {
            handler.post(new C4534c.C4535a(20150330, 3500));
        }
    }

    public void onActivityResumed(Activity activity) {
        Handler handler = this.f11216a.f11202d;
        if (handler != null) {
            handler.removeMessages(20150330);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
