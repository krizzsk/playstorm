package com.iab.omid.library.adcolony.p221b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.adcolony.adsession.C7586a;

/* renamed from: com.iab.omid.library.adcolony.b.b */
public class C7589b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7589b f18089a = new C7589b();

    /* renamed from: b */
    private boolean f18090b;

    /* renamed from: c */
    private boolean f18091c;

    /* renamed from: d */
    private C7590a f18092d;

    /* renamed from: com.iab.omid.library.adcolony.b.b$a */
    public interface C7590a {
        /* renamed from: a */
        void mo54227a(boolean z);
    }

    private C7589b() {
    }

    /* renamed from: a */
    public static C7589b m20943a() {
        return f18089a;
    }

    /* renamed from: a */
    private void m20944a(boolean z) {
        if (this.f18091c != z) {
            this.f18091c = z;
            if (this.f18090b) {
                m20945e();
                C7590a aVar = this.f18092d;
                if (aVar != null) {
                    aVar.mo54227a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m20945e() {
        boolean z = !this.f18091c;
        for (C7586a adSessionStatePublisher : C7588a.m20936a().mo54210b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo54274a(z);
        }
    }

    /* renamed from: a */
    public void mo54215a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo54216a(C7590a aVar) {
        this.f18092d = aVar;
    }

    /* renamed from: b */
    public void mo54217b() {
        this.f18090b = true;
        this.f18091c = false;
        m20945e();
    }

    /* renamed from: c */
    public void mo54218c() {
        this.f18090b = false;
        this.f18091c = false;
        this.f18092d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo54219d() {
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
        m20944a(false);
    }

    public void onActivityStopped(Activity activity) {
        View e;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo54219d().importance != 100;
            boolean z3 = true;
            for (C7586a next : C7588a.m20936a().mo54212c()) {
                if (next.mo54179f() && (e = next.mo54178e()) != null && e.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m20944a(z);
        }
    }
}
