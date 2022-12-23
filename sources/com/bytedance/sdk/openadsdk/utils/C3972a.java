package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.sdk.component.adexpress.C2598a;
import com.bytedance.sdk.component.p120e.p123c.C2921a;
import com.bytedance.sdk.component.p125f.C2952e;
import com.bytedance.sdk.component.p125f.C2955g;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.C3568k;
import com.bytedance.sdk.openadsdk.p172h.C3815b;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.openadsdk.utils.a */
/* compiled from: ActivityLifecycleListener */
public class C3972a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public static String f10194a = "pangle_event_timer_three_min";

    /* renamed from: b */
    public static boolean f10195b = false;

    /* renamed from: c */
    public static long f10196c;

    /* renamed from: d */
    public static long f10197d;

    /* renamed from: e */
    private AtomicInteger f10198e = new AtomicInteger(0);

    /* renamed from: f */
    private AtomicBoolean f10199f = new AtomicBoolean(false);

    /* renamed from: g */
    private HashSet<Integer> f10200g = new HashSet<>();

    /* renamed from: h */
    private final C3975a f10201h = new C3975a();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f10202i = 0;

    /* renamed from: j */
    private volatile CopyOnWriteArrayList<C2598a> f10203j = new CopyOnWriteArrayList<>();

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.f10198e.incrementAndGet() > 0) {
            this.f10199f.set(false);
        }
    }

    public void onActivityResumed(final Activity activity) {
        C3568k.m11192d().removeMessages(1001);
        if (activity != null) {
            this.f10200g.add(Integer.valueOf(activity.hashCode()));
            C2952e.m8308a(new C2955g("AppConfig_onActivityResume") {
                public void run() {
                    if (C3972a.this.f10202i == 0) {
                        long unused = C3972a.this.f10202i = SystemClock.elapsedRealtime();
                    } else if (SystemClock.elapsedRealtime() - C3972a.this.f10202i > 180000) {
                        long unused2 = C3972a.this.f10202i = SystemClock.elapsedRealtime();
                        try {
                            activity.sendBroadcast(new Intent(C3972a.f10194a));
                        } catch (Exception unused3) {
                        }
                    }
                    C2921a.m8199b((Context) activity);
                }
            }, 5);
            if (!f10195b) {
                f10196c = System.currentTimeMillis();
                f10195b = true;
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        Handler d = C3568k.m11192d();
        Message obtain = Message.obtain(d, this.f10201h);
        obtain.what = 1001;
        d.sendMessageDelayed(obtain, 30000);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.a$a */
    /* compiled from: ActivityLifecycleListener */
    static class C3975a implements Runnable {
        C3975a() {
        }

        public void run() {
            C2952e.m8311b().execute(new C2955g("reportPvFromBackGround") {
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.f10198e.decrementAndGet() == 0) {
            this.f10199f.set(true);
        }
        m13028b();
    }

    public void onActivityDestroyed(Activity activity) {
        if (activity != null) {
            this.f10200g.remove(Integer.valueOf(activity.hashCode()));
        }
        if (this.f10203j != null && this.f10203j.size() > 0) {
            Iterator<C2598a> it = this.f10203j.iterator();
            while (it.hasNext()) {
                C2598a next = it.next();
                if (next != null) {
                    next.mo16622a(activity);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo20886a(C2598a aVar) {
        this.f10203j.add(new WeakReference(aVar).get());
    }

    /* renamed from: b */
    public boolean mo20888b(C2598a aVar) {
        return this.f10203j.remove(new WeakReference(aVar).get());
    }

    /* renamed from: a */
    public boolean mo20887a() {
        return this.f10199f.get();
    }

    /* renamed from: b */
    private void m13028b() {
        C2952e.m8313b((C2955g) new C2955g("reportSdkUseTime") {
            public void run() {
                if (C3972a.this.mo20887a()) {
                    C3972a.f10195b = false;
                    C3972a.f10197d = System.currentTimeMillis();
                    C3815b.m12552a().mo20657a(C3972a.f10196c / 1000, C3972a.f10197d / 1000, C3568k.f8981b.get() ^ true ? 1 : 0);
                    C3568k.f8981b.set(false);
                }
            }
        });
    }
}
