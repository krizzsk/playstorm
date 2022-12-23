package com.iab.omid.library.inmobi.p251b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.C7838a;

/* renamed from: com.iab.omid.library.inmobi.b.b */
public class C7841b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C7841b f18669a = new C7841b();

    /* renamed from: b */
    private boolean f18670b;

    /* renamed from: c */
    private boolean f18671c;

    /* renamed from: d */
    private C7842a f18672d;

    /* renamed from: com.iab.omid.library.inmobi.b.b$a */
    public interface C7842a {
        /* renamed from: a */
        void mo55213a(boolean z);
    }

    private C7841b() {
    }

    /* renamed from: a */
    public static C7841b m22085a() {
        return f18669a;
    }

    /* renamed from: a */
    private void m22086a(boolean z) {
        if (this.f18671c != z) {
            this.f18671c = z;
            if (this.f18670b) {
                m22087e();
                C7842a aVar = this.f18672d;
                if (aVar != null) {
                    aVar.mo55213a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m22087e() {
        boolean z = !this.f18671c;
        for (C7838a adSessionStatePublisher : C7840a.m22078a().mo55196b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo55260a(z);
        }
    }

    /* renamed from: a */
    public void mo55201a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo55202a(C7842a aVar) {
        this.f18672d = aVar;
    }

    /* renamed from: b */
    public void mo55203b() {
        this.f18670b = true;
        this.f18671c = false;
        m22087e();
    }

    /* renamed from: c */
    public void mo55204c() {
        this.f18670b = false;
        this.f18671c = false;
        this.f18672d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo55205d() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        View d;
        if (Build.VERSION.SDK_INT >= 16) {
            boolean z = true;
            boolean z2 = mo55205d().importance != 100;
            boolean z3 = true;
            for (C7838a next : C7840a.m22078a().mo55198c()) {
                if (next.mo55165e() && (d = next.mo55164d()) != null && d.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m22086a(z);
        }
    }

    public void onActivityResumed(Activity activity) {
        m22086a(false);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
