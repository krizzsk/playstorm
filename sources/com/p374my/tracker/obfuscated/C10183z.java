package com.p374my.tracker.obfuscated;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.z */
public final class C10183z {

    /* renamed from: a */
    private static final Integer f25512a = 1;

    /* renamed from: b */
    private static final AtomicBoolean f25513b = new AtomicBoolean();

    /* renamed from: a */
    static boolean m30503a(Context context) {
        if (String.valueOf(f25512a).equals(C10169s0.m30423a(String.format("%s_mytracker_debug", new Object[]{context.getPackageName()})))) {
            C10175u0.m30440a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        C10175u0.m30440a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    /* renamed from: b */
    public static void m30504b(Context context) {
        if (!f25513b.compareAndSet(false, true)) {
            C10175u0.m30440a("LoggingHandler: instance has already been initialized");
        } else if (C10175u0.m30443a()) {
            C10175u0.m30440a("LoggingHandler: tracing has already been enabled");
        } else {
            C10104d.m30023a(new Runnable(context) {
                public final /* synthetic */ Context f$0;

                {
                    this.f$0 = r1;
                }

                public final void run() {
                    C10183z.m30505c(this.f$0);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m30505c(Context context) {
        if (f25512a.equals((Integer) C10169s0.m30422a(context, "com.my.tracker.debugMode", Integer.class))) {
            C10175u0.m30442a(true);
        } else if (m30503a(context)) {
            C10175u0.m30442a(true);
        }
    }
}
