package com.p374my.target;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.target.f0 */
public abstract class C9693f0 {

    /* renamed from: a */
    public static final Executor f23860a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public static final Executor f23861b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public static final Executor f23862c = new C9694a();

    /* renamed from: d */
    public static final Handler f23863d = new Handler(Looper.getMainLooper());

    /* renamed from: com.my.target.f0$a */
    public static class C9694a implements Executor {
        public void execute(Runnable runnable) {
            C9693f0.f23863d.post(runnable);
        }
    }

    /* renamed from: a */
    public static void m27979a(Runnable runnable) {
        f23860a.execute(runnable);
    }

    /* renamed from: a */
    public static void m27980a(Runnable runnable, int i) {
        f23863d.postDelayed(runnable, (long) i);
    }

    /* renamed from: b */
    public static void m27981b(Runnable runnable) {
        f23861b.execute(runnable);
    }

    /* renamed from: b */
    public static boolean m27982b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: c */
    public static void m27983c(Runnable runnable) {
        f23862c.execute(runnable);
    }
}
