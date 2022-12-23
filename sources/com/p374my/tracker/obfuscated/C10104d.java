package com.p374my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.my.tracker.obfuscated.d */
public class C10104d {

    /* renamed from: a */
    public static final Handler f25156a;

    /* renamed from: b */
    public static final Executor f25157b = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public static final Executor f25158c = Executors.newSingleThreadExecutor();

    /* renamed from: d */
    private static final Executor f25159d;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        f25156a = handler;
        f25159d = new Executor(handler) {
            public final /* synthetic */ Handler f$0;

            {
                this.f$0 = r1;
            }

            public final void execute(Runnable runnable) {
                boolean unused = this.f$0.post(runnable);
            }
        };
    }

    /* renamed from: a */
    public static void m30023a(Runnable runnable) {
        f25157b.execute(runnable);
    }

    /* renamed from: b */
    public static void m30024b(Runnable runnable) {
        f25158c.execute(runnable);
    }

    /* renamed from: c */
    public static void m30025c(Runnable runnable) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            f25159d.execute(runnable);
        }
    }
}
