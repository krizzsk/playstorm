package com.tapjoy.internal;

import android.app.Activity;
import android.opengl.GLSurfaceView;

/* renamed from: com.tapjoy.internal.hb */
public final class C11700hb {

    /* renamed from: a */
    public static final C11435au f28440a = new C11435au() {
        /* renamed from: a */
        public final boolean mo72182a(Runnable runnable) {
            GLSurfaceView gLSurfaceView = (GLSurfaceView) C11700hb.f28442c.mo72251a();
            if (gLSurfaceView == null) {
                return false;
            }
            gLSurfaceView.queueEvent(runnable);
            return true;
        }
    };

    /* renamed from: b */
    private static Activity f28441b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C11468bs<GLSurfaceView> f28442c = new C11468bs<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C11468bs<Thread> f28443d = new C11468bs<>();

    private C11700hb() {
    }

    /* renamed from: a */
    static void m33955a(GLSurfaceView gLSurfaceView) {
        Object[] objArr = new Object[1];
        f28442c.mo72252a(gLSurfaceView);
        gLSurfaceView.queueEvent(new Runnable() {
            public final void run() {
                Class<C11700hb> cls = C11700hb.class;
                Object[] objArr = new Object[1];
                C11700hb.f28443d.mo72252a(Thread.currentThread());
            }
        });
    }

    /* renamed from: a */
    public static Activity m33954a() {
        Activity activity = f28441b;
        return activity == null ? C11441b.m33234a() : activity;
    }

    /* renamed from: b */
    public static Thread m33956b() {
        return f28443d.mo72251a();
    }
}
