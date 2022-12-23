package com.fyber.inneractive.sdk.player.controller;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.fyber.inneractive.sdk.player.p191ui.C5100i;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.m */
public class C4656m implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ C4652k f11636a;

    public C4656m(C4652k kVar) {
        this.f11636a = kVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        if (activity.equals(this.f11636a.f11613d.getContext())) {
            C5100i iVar = this.f11636a.f11613d;
            iVar.f13645h = true;
            if (iVar.f13653F != null) {
                IAlog.m16699a("Autoclick paused", new Object[0]);
                iVar.f13653F.mo26483a();
            }
            this.f11636a.f11613d.mo25727b();
        }
    }

    public void onActivityResumed(Activity activity) {
        if (activity.equals(this.f11636a.f11613d.getContext())) {
            C5100i iVar = this.f11636a.f11613d;
            iVar.f13645h = false;
            if (iVar.f13653F != null) {
                IAlog.m16699a("Autoclick resumed", new Object[0]);
                iVar.f13653F.mo26485b();
            }
            this.f11636a.f11613d.mo25727b();
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
