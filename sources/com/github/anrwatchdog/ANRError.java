package com.github.anrwatchdog;

import android.os.Looper;
import com.github.anrwatchdog.ANRError$$;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class ANRError extends Error {
    private static final long serialVersionUID = 1;
    public final long duration;

    private ANRError(ANRError$$._Thread _thread, long j) {
        super("Application Not Responding for at least " + j + " ms.", _thread);
        this.duration = j;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    static ANRError New(long j, String str, boolean z) {
        final Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new Comparator<Thread>() {
            public int compare(Thread thread, Thread thread2) {
                if (thread == thread2) {
                    return 0;
                }
                Thread thread3 = thread;
                if (thread == thread3) {
                    return 1;
                }
                if (thread2 == thread3) {
                    return -1;
                }
                return thread2.getName().compareTo(thread.getName());
            }
        });
        for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
            if (next.getKey() == thread || (((Thread) next.getKey()).getName().startsWith(str) && (z || ((StackTraceElement[]) next.getValue()).length > 0))) {
                treeMap.put(next.getKey(), next.getValue());
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        ANRError$$._Thread _thread = null;
        for (Map.Entry entry : treeMap.entrySet()) {
            ANRError$$ aNRError$$ = new ANRError$$(getThreadTitle((Thread) entry.getKey()), (StackTraceElement[]) entry.getValue());
            aNRError$$.getClass();
            _thread = new ANRError$$._Thread(_thread);
        }
        return new ANRError(_thread, j);
    }

    static ANRError NewMainOnly(long j) {
        Thread thread = Looper.getMainLooper().getThread();
        ANRError$$ aNRError$$ = new ANRError$$(getThreadTitle(thread), thread.getStackTrace());
        aNRError$$.getClass();
        return new ANRError(new ANRError$$._Thread((ANRError$$._Thread) null), j);
    }

    private static String getThreadTitle(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }
}
