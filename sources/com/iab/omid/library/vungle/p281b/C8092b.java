package com.iab.omid.library.vungle.p281b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.vungle.adsession.C8089a;

/* renamed from: com.iab.omid.library.vungle.b.b */
public class C8092b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C8092b f19247a = new C8092b();

    /* renamed from: b */
    private boolean f19248b;

    /* renamed from: c */
    private boolean f19249c;

    /* renamed from: d */
    private C8093a f19250d;

    /* renamed from: com.iab.omid.library.vungle.b.b$a */
    public interface C8093a {
        /* renamed from: a */
        void mo56200a(boolean z);
    }

    private C8092b() {
    }

    /* renamed from: a */
    public static C8092b m23213a() {
        return f19247a;
    }

    /* renamed from: a */
    private void m23214a(boolean z) {
        if (this.f19249c != z) {
            this.f19249c = z;
            if (this.f19248b) {
                m23215e();
                C8093a aVar = this.f19250d;
                if (aVar != null) {
                    aVar.mo56200a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m23215e() {
        boolean z = !this.f19249c;
        for (C8089a adSessionStatePublisher : C8091a.m23206a().mo56183b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo56247a(z);
        }
    }

    /* renamed from: a */
    public void mo56188a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo56189a(C8093a aVar) {
        this.f19250d = aVar;
    }

    /* renamed from: b */
    public void mo56190b() {
        this.f19248b = true;
        this.f19249c = false;
        m23215e();
    }

    /* renamed from: c */
    public void mo56191c() {
        this.f19248b = false;
        this.f19249c = false;
        this.f19250d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo56192d() {
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
        m23214a(false);
    }

    public void onActivityStopped(Activity activity) {
        View d;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo56192d().importance != 100;
            boolean z3 = true;
            for (C8089a next : C8091a.m23206a().mo56185c()) {
                if (next.mo56152e() && (d = next.mo56151d()) != null && d.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m23214a(z);
        }
    }
}
