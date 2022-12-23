package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.inmobi.media.di */
/* compiled from: PicassoWrapper */
public class C5981di {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f15198a = C5981di.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static volatile Picasso f15199b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Object f15200c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static List<WeakReference<Context>> f15201d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static Application.ActivityLifecycleCallbacks f15202e = new Application.ActivityLifecycleCallbacks() {
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

        public final void onActivityDestroyed(Activity activity) {
            synchronized (C5981di.f15200c) {
                if (C5981di.f15199b != null && C5981di.m17857c(activity)) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks(C5981di.f15202e);
                    C5981di.f15201d.remove(activity);
                    if (C5981di.f15201d.isEmpty()) {
                        String unused = C5981di.f15198a;
                        Picasso unused2 = C5981di.f15199b;
                        C5981di.f15199b.shutdown();
                        Picasso unused3 = C5981di.f15199b = null;
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public static Picasso m17851a(Context context) {
        synchronized (f15200c) {
            if (!m17857c(context)) {
                f15201d.add(new WeakReference(context));
            }
            if (f15199b == null) {
                f15199b = new Picasso.Builder(context).build();
                C6227ho.m18539a(context, f15202e);
            }
        }
        return f15199b;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m17857c(Context context) {
        for (int i = 0; i < f15201d.size(); i++) {
            Context context2 = (Context) f15201d.get(i).get();
            if (context2 != null && context2.equals(context)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Object m17853a(InvocationHandler invocationHandler) {
        try {
            Class<?> cls = Class.forName("com.squareup.picasso.Callback");
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
        } catch (Exception unused) {
            return null;
        }
    }
}
