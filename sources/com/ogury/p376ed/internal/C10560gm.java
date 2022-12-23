package com.ogury.p376ed.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.ogury.ed.internal.gm */
public final class C10560gm {

    /* renamed from: a */
    public static final C10560gm f26679a = new C10560gm();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static WeakReference<Activity> f26680b = new WeakReference<>((Object) null);

    /* renamed from: c */
    private static boolean f26681c;

    private C10560gm() {
    }

    /* renamed from: a */
    public static Activity m32095a() {
        return (Activity) f26680b.get();
    }

    /* renamed from: a */
    public final synchronized void mo67496a(Context context) {
        C10765mq.m32773b(context, "context");
        if (!f26681c) {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                f26681c = true;
                application.registerActivityLifecycleCallbacks(new C10561a());
            }
        }
    }

    /* renamed from: com.ogury.ed.internal.gm$a */
    public static final class C10561a extends C10422cx {
        C10561a() {
        }

        public final void onActivityResumed(Activity activity) {
            C10765mq.m32773b(activity, "activity");
            C10560gm gmVar = C10560gm.f26679a;
            C10560gm.f26680b = new WeakReference(activity);
        }
    }
}
