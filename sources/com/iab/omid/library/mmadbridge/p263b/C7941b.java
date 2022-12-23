package com.iab.omid.library.mmadbridge.p263b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C7938a;

/* renamed from: com.iab.omid.library.mmadbridge.b.b */
public class C7941b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7941b f18897a = new C7941b();

    /* renamed from: b */
    private boolean f18898b;

    /* renamed from: c */
    private boolean f18899c;

    /* renamed from: d */
    private C7942a f18900d;

    /* renamed from: com.iab.omid.library.mmadbridge.b.b$a */
    public interface C7942a {
        /* renamed from: a */
        void mo55597a(boolean z);
    }

    private C7941b() {
    }

    /* renamed from: a */
    public static C7941b m22532a() {
        return f18897a;
    }

    /* renamed from: a */
    private void m22533a(boolean z) {
        if (this.f18899c != z) {
            this.f18899c = z;
            if (this.f18898b) {
                m22534e();
                C7942a aVar = this.f18900d;
                if (aVar != null) {
                    aVar.mo55597a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m22534e() {
        boolean z = !this.f18899c;
        for (C7938a adSessionStatePublisher : C7940a.m22525a().mo55580b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55644a(z);
        }
    }

    /* renamed from: a */
    public void mo55585a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo55586a(C7942a aVar) {
        this.f18900d = aVar;
    }

    /* renamed from: b */
    public void mo55587b() {
        this.f18898b = true;
        this.f18899c = false;
        m22534e();
    }

    /* renamed from: c */
    public void mo55588c() {
        this.f18898b = false;
        this.f18899c = false;
        this.f18900d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo55589d() {
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
        m22533a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo55589d().importance != 100;
            boolean z3 = true;
            for (C7938a next : C7940a.m22525a().mo55582c()) {
                if (next.mo55549f() && (e = next.mo55548e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m22533a(z);
        }
    }
}
