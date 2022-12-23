package com.iab.omid.library.smaato.p275b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.iab.omid.library.smaato.adsession.C8039a;

/* renamed from: com.iab.omid.library.smaato.b.b */
public class C8042b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    private static C8042b f19134a = new C8042b();

    /* renamed from: b */
    private boolean f19135b;

    /* renamed from: c */
    private boolean f19136c;

    /* renamed from: d */
    private C8043a f19137d;

    /* renamed from: com.iab.omid.library.smaato.b.b$a */
    public interface C8043a {
        /* renamed from: a */
        void mo56006a(boolean z);
    }

    private C8042b() {
    }

    /* renamed from: a */
    public static C8042b m22989a() {
        return f19134a;
    }

    /* renamed from: a */
    private void m22990a(boolean z) {
        if (this.f19136c != z) {
            this.f19136c = z;
            if (this.f19135b) {
                m22991e();
                C8043a aVar = this.f19137d;
                if (aVar != null) {
                    aVar.mo56006a(!z);
                }
            }
        }
    }

    /* renamed from: e */
    private void m22991e() {
        boolean z = !this.f19136c;
        for (C8039a adSessionStatePublisher : C8041a.m22982a().mo55989b()) {
            adSessionStatePublisher.getAdSessionStatePublisher().mo56053a(z);
        }
    }

    /* renamed from: a */
    public void mo55994a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    /* renamed from: a */
    public void mo55995a(C8043a aVar) {
        this.f19137d = aVar;
    }

    /* renamed from: b */
    public void mo55996b() {
        this.f19135b = true;
        this.f19136c = false;
        m22991e();
    }

    /* renamed from: c */
    public void mo55997c() {
        this.f19135b = false;
        this.f19136c = false;
        this.f19137d = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ActivityManager.RunningAppProcessInfo mo55998d() {
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
            boolean z2 = mo55998d().importance != 100;
            boolean z3 = true;
            for (C8039a next : C8041a.m22982a().mo55991c()) {
                if (next.mo55958e() && (d = next.mo55957d()) != null && d.hasWindowFocus()) {
                    z3 = false;
                }
            }
            if (!z2 || !z3) {
                z = false;
            }
            m22990a(z);
        }
    }

    public void onActivityResumed(Activity activity) {
        m22990a(false);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
