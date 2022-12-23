package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyUtil;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tapjoy.internal.fn */
public final class C11633fn {

    /* renamed from: a */
    private static final C11633fn f28290a = new C11633fn();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Application f28291b;

    /* renamed from: c */
    private Application.ActivityLifecycleCallbacks f28292c;

    /* renamed from: d */
    private final HashSet<String> f28293d = new HashSet<>();

    /* renamed from: a */
    public static void m33795a(Context context) {
        if (Build.VERSION.SDK_INT >= 14 && context != null) {
            C11633fn fnVar = f28290a;
            Context applicationContext = context.getApplicationContext();
            if (fnVar.f28291b == null) {
                try {
                    if (applicationContext instanceof Application) {
                        fnVar.f28291b = (Application) applicationContext;
                    } else {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        TapjoyUtil.runOnMainThread(new Runnable() {
                            public final void run() {
                                try {
                                    Application unused = C11633fn.this.f28291b = C11633fn.m33796b();
                                } catch (Exception e) {
                                    TapjoyLog.m33199w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
                                } catch (Throwable th) {
                                    countDownLatch.countDown();
                                    throw th;
                                }
                                countDownLatch.countDown();
                            }
                        });
                        countDownLatch.await();
                    }
                } catch (Exception e) {
                    TapjoyLog.m33199w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
                }
                if (fnVar.f28291b == null) {
                    return;
                }
            }
            synchronized (fnVar) {
                if (fnVar.f28292c == null) {
                    Activity c = C11441b.m33239c();
                    if (c != null) {
                        fnVar.f28293d.add(m33797b(c));
                    }
                    final HashSet<String> hashSet = fnVar.f28293d;
                    C116352 r1 = new Application.ActivityLifecycleCallbacks() {
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityDestroyed(Activity activity) {
                        }

                        public final void onActivityPaused(Activity activity) {
                        }

                        public final void onActivityResumed(Activity activity) {
                        }

                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityStarted(Activity activity) {
                            hashSet.add(C11633fn.m33797b(activity));
                            if (hashSet.size() == 1) {
                                C11714hj.m33999a().mo72630e();
                            }
                            C11441b.m33235a(activity);
                        }

                        public final void onActivityStopped(Activity activity) {
                            hashSet.remove(C11633fn.m33797b(activity));
                            if (hashSet.size() <= 0) {
                                C11714hj.m33999a().mo72631f();
                            }
                        }
                    };
                    fnVar.f28292c = r1;
                    fnVar.f28291b.registerActivityLifecycleCallbacks(r1);
                    C11714hj.m33999a().mo72630e();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m33794a() {
        if (Build.VERSION.SDK_INT >= 14) {
            C11633fn fnVar = f28290a;
            if (fnVar.f28291b != null) {
                synchronized (fnVar) {
                    if (fnVar.f28292c != null) {
                        fnVar.f28291b.unregisterActivityLifecycleCallbacks(fnVar.f28292c);
                        fnVar.f28292c = null;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m33797b(Activity activity) {
        return activity.getClass().getName() + "@" + System.identityHashCode(activity);
    }

    /* renamed from: b */
    static /* synthetic */ Application m33796b() {
        return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke((Object) null, (Object[]) null);
    }
}
