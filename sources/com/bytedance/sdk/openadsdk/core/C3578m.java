package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.component.utils.C2975l;
import com.bytedance.sdk.component.utils.C2979o;
import com.bytedance.sdk.openadsdk.core.p155i.C3536e;
import com.bytedance.sdk.openadsdk.core.p155i.C3537f;
import com.bytedance.sdk.openadsdk.multipro.C3953b;
import com.bytedance.sdk.openadsdk.p130b.C3126a;
import com.bytedance.sdk.openadsdk.p130b.C3152c;
import com.bytedance.sdk.openadsdk.p130b.C3155d;
import com.bytedance.sdk.openadsdk.p130b.C3159f;
import com.bytedance.sdk.openadsdk.p130b.C3160g;
import com.bytedance.sdk.openadsdk.p130b.C3161h;
import com.bytedance.sdk.openadsdk.p130b.C3181q;
import com.bytedance.sdk.openadsdk.p130b.C3182r;
import com.bytedance.sdk.openadsdk.p130b.C3183s;
import com.bytedance.sdk.openadsdk.p130b.C3184t;
import com.bytedance.sdk.openadsdk.p172h.p175c.C3835a;
import com.bytedance.sdk.openadsdk.p172h.p175c.C3837c;
import com.bytedance.sdk.openadsdk.p172h.p175c.C3841d;
import com.bytedance.sdk.openadsdk.p179k.C3902a;
import com.bytedance.sdk.openadsdk.p179k.C3903b;
import com.bytedance.sdk.openadsdk.p179k.C3907c;
import com.bytedance.sdk.openadsdk.p179k.C3912h;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.openadsdk.core.m */
/* compiled from: InternalContainer */
public class C3578m {

    /* renamed from: a */
    public static int f9006a = 8;

    /* renamed from: b */
    private static volatile C3152c<C3126a> f9007b;

    /* renamed from: c */
    private static volatile C3152c<C3837c.C3840a> f9008c;

    /* renamed from: d */
    private static volatile C3152c<C3837c.C3840a> f9009d;

    /* renamed from: e */
    private static volatile C3581n<C3126a> f9010e;

    /* renamed from: f */
    private static volatile C3902a f9011f;

    /* renamed from: g */
    private static volatile C3835a f9012g;

    /* renamed from: h */
    private static volatile Context f9013h;

    /* renamed from: i */
    private static volatile C3537f f9014i;

    /* renamed from: a */
    public static synchronized Context m11231a() {
        Context context;
        synchronized (C3578m.class) {
            if (f9013h == null) {
                m11233a((Context) null);
            }
            context = f9013h;
        }
        return context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m11233a(android.content.Context r2) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.core.m> r0 = com.bytedance.sdk.openadsdk.core.C3578m.class
            monitor-enter(r0)
            android.content.Context r1 = f9013h     // Catch:{ all -> 0x0031 }
            if (r1 != 0) goto L_0x002f
            android.app.Application r1 = com.bytedance.sdk.openadsdk.core.C3578m.C3580a.m11245a()     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0019
            android.app.Application r1 = com.bytedance.sdk.openadsdk.core.C3578m.C3580a.m11245a()     // Catch:{ all -> 0x0019 }
            f9013h = r1     // Catch:{ all -> 0x0019 }
            android.content.Context r1 = f9013h     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x0019
            monitor-exit(r0)
            return
        L_0x0019:
            if (r2 == 0) goto L_0x002f
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0031 }
            f9013h = r2     // Catch:{ all -> 0x0031 }
            android.content.Context r2 = m11231a()     // Catch:{ all -> 0x0031 }
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)     // Catch:{ all -> 0x0031 }
            int r2 = r2.getScaledTouchSlop()     // Catch:{ all -> 0x0031 }
            f9006a = r2     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r0)
            return
        L_0x0031:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3578m.m11233a(android.content.Context):void");
    }

    /* renamed from: b */
    public static void m11235b() {
        f9007b = null;
        f9011f = null;
        f9012g = null;
    }

    /* renamed from: c */
    public static C3152c<C3126a> m11236c() {
        if (!C3536e.m10968a()) {
            return C3152c.m9146c();
        }
        if (f9007b == null) {
            synchronized (C3578m.class) {
                if (f9007b == null) {
                    if (C3953b.m12901c()) {
                        f9007b = new C3155d();
                    } else {
                        f9007b = new C3152c<>(new C3160g(f9013h), m11239f(), m11243j(), m11234b(f9013h));
                    }
                }
            }
        }
        return f9007b;
    }

    /* renamed from: d */
    public static C3152c<C3837c.C3840a> m11237d() {
        if (!C3536e.m10968a()) {
            return C3152c.m9147d();
        }
        if (f9009d == null) {
            synchronized (C3578m.class) {
                if (f9009d == null) {
                    if (C3953b.m12901c()) {
                        f9009d = new C3182r(false);
                    } else {
                        f9009d = m11232a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                    }
                }
            }
        }
        return f9009d;
    }

    /* renamed from: e */
    public static C3152c<C3837c.C3840a> m11238e() {
        if (!C3536e.m10968a()) {
            return C3152c.m9147d();
        }
        if (f9008c == null) {
            synchronized (C3578m.class) {
                if (f9008c == null) {
                    if (C3953b.m12901c()) {
                        f9008c = new C3182r(true);
                    } else {
                        f9008c = m11232a("ttad_bk_stats", "AdStatsEventThread", true);
                    }
                }
            }
        }
        return f9008c;
    }

    /* renamed from: f */
    public static C3581n<C3126a> m11239f() {
        if (f9010e == null) {
            synchronized (C3578m.class) {
                if (f9010e == null) {
                    f9010e = new C3627o(f9013h);
                }
            }
        }
        return f9010e;
    }

    /* renamed from: g */
    public static C3902a m11240g() {
        if (!C3536e.m10968a()) {
            return C3903b.m12810d();
        }
        if (f9011f == null) {
            synchronized (C3902a.class) {
                if (f9011f == null) {
                    if (C3953b.m12901c()) {
                        f9011f = new C3907c();
                    } else {
                        f9011f = new C3903b(f9013h, new C3912h(f9013h));
                    }
                }
            }
        }
        return f9011f;
    }

    /* renamed from: j */
    private static C3161h.C3164b m11243j() {
        return C3161h.C3164b.m9260a();
    }

    /* renamed from: a */
    public static C3152c<C3837c.C3840a> m11232a(String str, String str2, boolean z) {
        C3159f fVar;
        C3161h.C3164b bVar;
        if (z) {
            fVar = new C3183s(f9013h);
            bVar = C3161h.C3164b.m9260a();
        } else {
            bVar = C3161h.C3164b.m9261b();
            fVar = new C3181q(f9013h);
        }
        C3161h.C3163a b = m11234b(f9013h);
        return new C3152c(fVar, (C3581n) null, bVar, b, new C3184t(str, str2, fVar, (C3581n) null, bVar, b));
    }

    /* renamed from: b */
    private static C3161h.C3163a m11234b(final Context context) {
        return new C3161h.C3163a() {
            /* renamed from: a */
            public boolean mo18766a() {
                Context context = context;
                if (context == null) {
                    context = C3578m.m11231a();
                }
                return C2979o.m8406a(context);
            }
        };
    }

    /* renamed from: h */
    public static C3537f m11241h() {
        if (f9014i == null) {
            synchronized (C3537f.class) {
                if (f9014i == null) {
                    f9014i = new C3537f();
                }
            }
        }
        return f9014i;
    }

    /* renamed from: i */
    public static C3835a m11242i() {
        if (!C3536e.m10968a()) {
            return C3837c.m12599c();
        }
        if (f9012g == null) {
            synchronized (C3837c.class) {
                if (f9012g == null) {
                    if (C3953b.m12901c()) {
                        f9012g = new C3841d();
                    } else {
                        f9012g = new C3837c();
                    }
                }
            }
        }
        return f9012g;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.m$a */
    /* compiled from: InternalContainer */
    private static class C3580a {

        /* renamed from: a */
        private static volatile Application f9016a;

        /* renamed from: a */
        public static Application m11245a() {
            return f9016a;
        }

        static {
            try {
                Object b = m11246b();
                f9016a = (Application) b.getClass().getMethod("getApplication", new Class[0]).invoke(b, new Object[0]);
                C2975l.m8391e("MyApplication", "application get success");
            } catch (Throwable th) {
                C2975l.m8388c("MyApplication", "application get failed", th);
            }
        }

        /* renamed from: b */
        private static Object m11246b() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke((Object) null, new Object[0]);
            } catch (Throwable th) {
                C2975l.m8388c("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
