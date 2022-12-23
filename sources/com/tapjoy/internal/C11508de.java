package com.tapjoy.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;

/* renamed from: com.tapjoy.internal.de */
public final class C11508de implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d */
    private static C11508de f27853d = new C11508de();

    /* renamed from: a */
    public boolean f27854a;

    /* renamed from: b */
    public boolean f27855b;

    /* renamed from: c */
    public C11509a f27856c;

    /* renamed from: com.tapjoy.internal.de$a */
    public interface C11509a {
        /* renamed from: a */
        void mo72303a(boolean z);
    }

    private C11508de() {
    }

    /* renamed from: a */
    public static C11508de m33407a() {
        return f27853d;
    }

    /* renamed from: a */
    private void m33408a(boolean z) {
        if (this.f27855b != z) {
            this.f27855b = z;
            if (this.f27854a) {
                mo72295b();
                C11509a aVar = this.f27856c;
                if (aVar != null) {
                    aVar.mo72303a(!z);
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        m33408a(false);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        View c;
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z = true;
            boolean z2 = runningAppProcessInfo.importance != 100;
            boolean z3 = true;
            for (T t : Collections.unmodifiableCollection(C11507dd.m33405a().f27852b)) {
                if (t.mo72290d() && (c = t.mo72289c()) != null && c.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m33408a(z);
        }
    }

    /* renamed from: b */
    public final void mo72295b() {
        boolean z = !this.f27855b;
        for (T t : Collections.unmodifiableCollection(C11507dd.m33405a().f27851a)) {
            t.f27819c.mo72321a(z);
        }
    }
}
