package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import com.inmobi.media.C6158g;

/* renamed from: com.inmobi.media.co */
/* compiled from: ChromeTabManager */
public final class C5932co implements Application.ActivityLifecycleCallbacks, C6158g.C6161a {

    /* renamed from: a */
    private final C6158g f15038a;

    /* renamed from: b */
    private String f15039b;

    /* renamed from: c */
    private Context f15040c;

    /* renamed from: d */
    private C6060f f15041d;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public C5932co(String str, Context context, C6060f fVar) {
        this.f15039b = str;
        C6158g gVar = new C6158g();
        this.f15038a = gVar;
        gVar.f15616c = this;
        this.f15040c = context.getApplicationContext();
        this.f15041d = fVar;
        C6227ho.m18539a(context, (Application.ActivityLifecycleCallbacks) this);
    }

    /* renamed from: b */
    public final void mo34925b() {
        this.f15038a.mo35342a(this.f15040c);
    }

    /* renamed from: a */
    public final void mo34923a() {
        Uri parse = Uri.parse(this.f15039b);
        C6158g gVar = this.f15038a;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(gVar.f15614a == null ? null : gVar.f15614a.newSession(new CustomTabsCallback() {
            public final void onNavigationEvent(int i, Bundle bundle) {
                super.onNavigationEvent(i, bundle);
                String unused = C6158g.f15613d;
                if (C6158g.this.f15616c != null) {
                    C6158g.this.f15616c.mo34924a(i);
                }
            }
        }));
        builder.enableUrlBarHiding();
        C6158g.m18362a(this.f15040c, builder.build(), parse, this.f15041d);
    }

    /* renamed from: a */
    public final void mo34924a(int i) {
        if (i == 5) {
            this.f15041d.mo35210a();
        } else if (i == 6) {
            this.f15041d.mo35212b();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        C6158g gVar = this.f15038a;
        Context context = this.f15040c;
        if (gVar.f15615b != null) {
            context.unbindService(gVar.f15615b);
            gVar.f15614a = null;
            gVar.f15615b = null;
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}
