package p009by.saygames;

import com.google.android.gms.measurement.AppMeasurement;
import java.lang.Thread;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: by.saygames.SayExceptionHandler */
public class SayExceptionHandler {
    public static void initUncaughtExceptionHandler() {
        new ScheduledThreadPoolExecutor(1).schedule(new Runnable() {
            public void run() {
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    public void uncaughtException(Thread thread, Throwable th) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(th.getLocalizedMessage());
                        for (StackTraceElement append : th.getStackTrace()) {
                            sb.append("\tat ");
                            sb.append(append);
                        }
                        SayKitEvents.trackImmediately(AppMeasurement.CRASH_ORIGIN, 0, 0, sb.toString());
                        defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                });
            }
        }, 5, TimeUnit.SECONDS);
    }
}
