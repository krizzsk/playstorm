package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaos implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzaos(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzaok(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzaoq(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzaon(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzaom(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzaop(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzaol(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzaoo(this, activity));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzaor zzaor) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzaor.zza(activityLifecycleCallbacks);
            } else if (!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception unused) {
        }
    }
}
