package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.b */
public final class C11441b {

    /* renamed from: a */
    private static Application f27684a;

    /* renamed from: b */
    private static int f27685b;

    /* renamed from: c */
    private static final C11468bs<Activity> f27686c = new C11468bs<>();

    /* renamed from: d */
    private static final Set<Activity> f27687d = Collections.synchronizedSet(new C11433as());

    /* renamed from: e */
    private static final C11468bs<Activity> f27688e = new C11468bs<>();

    /* renamed from: b */
    public static boolean m33238b() {
        return f27685b > 0;
    }

    @Nullable
    /* renamed from: c */
    public static Activity m33239c() {
        Activity a = f27686c.mo72251a();
        if (a != null) {
            return a;
        }
        synchronized (f27687d) {
            if (!f27687d.iterator().hasNext()) {
                return null;
            }
            Activity next = f27687d.iterator().next();
            return next;
        }
    }

    /* renamed from: a */
    public static void m33235a(Activity activity) {
        f27686c.mo72252a(activity);
    }

    /* renamed from: a */
    public static synchronized void m33236a(Application application) {
        synchronized (C11441b.class) {
            if (f27684a != application) {
                f27684a = application;
            }
        }
    }

    /* renamed from: b */
    public static void m33237b(Activity activity) {
        f27685b++;
        f27686c.mo72252a(activity);
        f27687d.add(activity);
    }

    /* renamed from: c */
    public static void m33240c(Activity activity) {
        f27685b--;
        f27686c.f27742a = null;
        f27687d.remove(activity);
        if (f27685b < 0) {
            f27685b = 0;
        }
    }

    @Nullable
    /* renamed from: a */
    public static Activity m33234a() {
        Activity a = f27688e.mo72251a();
        return a == null ? m33239c() : a;
    }
}
