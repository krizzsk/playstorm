package com.iab.omid.library.corpmailru.p239b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.corpmailru.adsession.C7736a;

/* renamed from: com.iab.omid.library.corpmailru.b.b */
public class C7739b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7739b f18439a = new C7739b();

    /* renamed from: b */
    private boolean f18440b;

    /* renamed from: c */
    private boolean f18441c;

    /* renamed from: d */
    private C7740a f18442d;

    /* renamed from: com.iab.omid.library.corpmailru.b.b$a */
    public interface C7740a {
        /* renamed from: a */
        void mo54820a(boolean z);
    }

    private C7739b() {
    }

    /* renamed from: a */
    public static C7739b m21631a() {
        return f18439a;
    }

    /* renamed from: a */
    private void m21632a(boolean z) {
        if (this.f18441c != z) {
            this.f18441c = z;
            if (this.f18440b) {
                m21633e();
                C7740a aVar = this.f18442d;
                if (aVar != null) {
                    aVar.mo54820a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m21633e() {
        boolean z = !this.f18441c;
        for (C7736a adSessionStatePublisher : C7738a.m21624a().mo54803b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54867a(z);
        }
    }

    /* renamed from: a */
    public void mo54808a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo54809a(C7740a aVar) {
        this.f18442d = aVar;
    }

    /* renamed from: b */
    public void mo54810b() {
        this.f18440b = true;
        this.f18441c = false;
        m21633e();
    }

    /* renamed from: c */
    public void mo54811c() {
        this.f18440b = false;
        this.f18441c = false;
        this.f18442d = null;
    }

    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo54812d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        m21632a(false);
    }

    public void onActivityStopped(Activity activity) {
        View d;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo54812d().importance != 100;
            boolean z3 = true;
            for (C7736a next : C7738a.m21624a().mo54805c()) {
                if (next.mo54772e() && (d = next.mo54771d()) != null && d.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m21632a(z);
        }
    }
}
