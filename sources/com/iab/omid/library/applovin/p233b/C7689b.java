package com.iab.omid.library.applovin.p233b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.applovin.adsession.C7686a;

/* renamed from: com.iab.omid.library.applovin.b.b */
public class C7689b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7689b f18323a = new C7689b();

    /* renamed from: b */
    private boolean f18324b;

    /* renamed from: c */
    private boolean f18325c;

    /* renamed from: d */
    private C7690a f18326d;

    /* renamed from: com.iab.omid.library.applovin.b.b$a */
    public interface C7690a {
        /* renamed from: a */
        void mo54625a(boolean z);
    }

    private C7689b() {
    }

    /* renamed from: a */
    public static C7689b m21403a() {
        return f18323a;
    }

    /* renamed from: a */
    private void m21404a(boolean z) {
        if (this.f18325c != z) {
            this.f18325c = z;
            if (this.f18324b) {
                m21405e();
                C7690a aVar = this.f18326d;
                if (aVar != null) {
                    aVar.mo54625a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m21405e() {
        boolean z = !this.f18325c;
        for (C7686a adSessionStatePublisher : C7688a.m21396a().mo54608b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54672a(z);
        }
    }

    /* renamed from: a */
    public void mo54613a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo54614a(C7690a aVar) {
        this.f18326d = aVar;
    }

    /* renamed from: b */
    public void mo54615b() {
        this.f18324b = true;
        this.f18325c = false;
        m21405e();
    }

    /* renamed from: c */
    public void mo54616c() {
        this.f18324b = false;
        this.f18325c = false;
        this.f18326d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo54617d() {
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
        m21404a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo54617d().importance != 100;
            boolean z3 = true;
            for (C7686a next : C7688a.m21396a().mo54610c()) {
                if (next.mo54577f() && (e = next.mo54576e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m21404a(z);
        }
    }
}
