package com.iab.omid.library.fyber.p245b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.fyber.adsession.C7787a;

/* renamed from: com.iab.omid.library.fyber.b.b */
public class C7790b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7790b f18553a = new C7790b();

    /* renamed from: b */
    private boolean f18554b;

    /* renamed from: c */
    private boolean f18555c;

    /* renamed from: d */
    private C7791a f18556d;

    /* renamed from: com.iab.omid.library.fyber.b.b$a */
    public interface C7791a {
        /* renamed from: a */
        void mo55018a(boolean z);
    }

    private C7790b() {
    }

    /* renamed from: a */
    public static C7790b m21857a() {
        return f18553a;
    }

    /* renamed from: a */
    private void m21858a(boolean z) {
        if (this.f18555c != z) {
            this.f18555c = z;
            if (this.f18554b) {
                m21859e();
                C7791a aVar = this.f18556d;
                if (aVar != null) {
                    aVar.mo55018a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m21859e() {
        boolean z = !this.f18555c;
        for (C7787a adSessionStatePublisher : C7789a.m21850a().mo55001b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55065a(z);
        }
    }

    /* renamed from: a */
    public void mo55006a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo55007a(C7791a aVar) {
        this.f18556d = aVar;
    }

    /* renamed from: b */
    public void mo55008b() {
        this.f18554b = true;
        this.f18555c = false;
        m21859e();
    }

    /* renamed from: c */
    public void mo55009c() {
        this.f18554b = false;
        this.f18555c = false;
        this.f18556d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo55010d() {
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
        m21858a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo55010d().importance != 100;
            boolean z3 = true;
            for (C7787a next : C7789a.m21850a().mo55003c()) {
                if (next.mo54970f() && (e = next.mo54969e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m21858a(z);
        }
    }
}
