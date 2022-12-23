package com.iab.omid.library.amazon.p227b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.amazon.adsession.C7636a;

/* renamed from: com.iab.omid.library.amazon.b.b */
public class C7639b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7639b f18206a = new C7639b();

    /* renamed from: b */
    private boolean f18207b;

    /* renamed from: c */
    private boolean f18208c;

    /* renamed from: d */
    private C7640a f18209d;

    /* renamed from: com.iab.omid.library.amazon.b.b$a */
    public interface C7640a {
        /* renamed from: a */
        void mo54426a(boolean z);
    }

    private C7639b() {
    }

    /* renamed from: a */
    public static C7639b m21173a() {
        return f18206a;
    }

    /* renamed from: a */
    private void m21174a(boolean z) {
        if (this.f18208c != z) {
            this.f18208c = z;
            if (this.f18207b) {
                m21175e();
                C7640a aVar = this.f18209d;
                if (aVar != null) {
                    aVar.mo54426a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m21175e() {
        boolean z = !this.f18208c;
        for (C7636a adSessionStatePublisher : C7638a.m21166a().mo54409b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54473a(z);
        }
    }

    /* renamed from: a */
    public void mo54414a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo54415a(C7640a aVar) {
        this.f18209d = aVar;
    }

    /* renamed from: b */
    public void mo54416b() {
        this.f18207b = true;
        this.f18208c = false;
        m21175e();
    }

    /* renamed from: c */
    public void mo54417c() {
        this.f18207b = false;
        this.f18208c = false;
        this.f18209d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo54418d() {
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
        m21174a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo54418d().importance != 100;
            boolean z3 = true;
            for (C7636a next : C7638a.m21166a().mo54411c()) {
                if (next.mo54378f() && (e = next.mo54377e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m21174a(z);
        }
    }
}
