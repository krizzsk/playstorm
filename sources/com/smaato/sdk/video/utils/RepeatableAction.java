package com.smaato.sdk.video.utils;

import android.os.Handler;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

public class RepeatableAction implements Runnable {
    private final Handler handler;
    private final Listener listener;
    private boolean scheduled;
    private final long throttleMillis;

    @FunctionalInterface
    public interface Listener {
        void doAction();
    }

    private RepeatableAction(Handler handler2, long j, Listener listener2) {
        this.handler = (Handler) Objects.requireNonNull(handler2);
        this.throttleMillis = j;
        this.listener = (Listener) Objects.requireNonNull(listener2);
    }

    public RepeatableAction(Handler handler2, Listener listener2) {
        this(handler2, 50, listener2);
    }

    public void start() {
        Threads.ensureHandlerThread(this.handler);
        if (!this.scheduled) {
            this.handler.postDelayed(this, this.throttleMillis);
            this.scheduled = true;
        }
    }

    public void stop() {
        Threads.ensureHandlerThread(this.handler);
        if (this.scheduled) {
            this.handler.removeCallbacks(this);
            this.scheduled = false;
        }
    }

    public void run() {
        Threads.ensureHandlerThread(this.handler);
        this.scheduled = false;
        start();
        this.listener.doAction();
    }
}
