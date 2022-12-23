package com.applovin.impl.sdk;

import android.os.Process;
import com.tapjoy.TJAdUnitConstants;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private static final AppLovinExceptionHandler f2808a = new AppLovinExceptionHandler();

    /* renamed from: b */
    private final Set<C1959m> f2809b = new HashSet(2);

    /* renamed from: c */
    private final AtomicBoolean f2810c = new AtomicBoolean();

    /* renamed from: d */
    private Thread.UncaughtExceptionHandler f2811d;

    public static AppLovinExceptionHandler shared() {
        return f2808a;
    }

    public void addSdk(C1959m mVar) {
        this.f2809b.add(mVar);
    }

    public void enable() {
        if (this.f2810c.compareAndSet(false, true)) {
            this.f2811d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        for (C1959m next : this.f2809b) {
            if (C2092v.m5047a()) {
                next.mo14286A().mo14789b("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            ((EventServiceImpl) next.mo14371w()).trackEventSynchronously(TJAdUnitConstants.String.VIDEO_PAUSED);
            ((EventServiceImpl) next.mo14371w()).trackEventSynchronously("crashed");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f2811d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
