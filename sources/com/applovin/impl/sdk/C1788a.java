package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.applovin.impl.sdk.utils.C2032a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.sdk.a */
public class C1788a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private final List<C2032a> f2838a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b */
    private WeakReference<Activity> f2839b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private WeakReference<Activity> f2840c = new WeakReference<>((Object) null);

    public C1788a(Context context) {
        if (C2092v.m5047a()) {
            C2092v.m5050f("AppLovinSdk", "Attaching Activity lifecycle manager...");
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f2839b = new WeakReference<>(activity);
            if (activity.hasWindowFocus()) {
                this.f2840c = this.f2839b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* renamed from: a */
    public Activity mo13822a() {
        return (Activity) this.f2839b.get();
    }

    /* renamed from: a */
    public void mo13823a(C2032a aVar) {
        this.f2838a.add(aVar);
    }

    /* renamed from: b */
    public Activity mo13824b() {
        return (Activity) this.f2840c.get();
    }

    /* renamed from: b */
    public void mo13825b(C2032a aVar) {
        this.f2838a.remove(aVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (C2032a onActivityCreated : new ArrayList(this.f2838a)) {
            onActivityCreated.onActivityCreated(activity, bundle);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        for (C2032a onActivityDestroyed : new ArrayList(this.f2838a)) {
            onActivityDestroyed.onActivityDestroyed(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        this.f2840c = new WeakReference<>((Object) null);
        for (C2032a onActivityPaused : new ArrayList(this.f2838a)) {
            onActivityPaused.onActivityPaused(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.f2839b = weakReference;
        this.f2840c = weakReference;
        for (C2032a onActivityResumed : new ArrayList(this.f2838a)) {
            onActivityResumed.onActivityResumed(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (C2032a onActivitySaveInstanceState : new ArrayList(this.f2838a)) {
            onActivitySaveInstanceState.onActivitySaveInstanceState(activity, bundle);
        }
    }

    public void onActivityStarted(Activity activity) {
        for (C2032a onActivityStarted : new ArrayList(this.f2838a)) {
            onActivityStarted.onActivityStarted(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        for (C2032a onActivityStopped : new ArrayList(this.f2838a)) {
            onActivityStopped.onActivityStopped(activity);
        }
    }
}
