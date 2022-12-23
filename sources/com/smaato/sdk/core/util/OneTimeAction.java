package com.smaato.sdk.core.util;

import android.os.Handler;
import java.lang.ref.WeakReference;

public class OneTimeAction {
    /* access modifiers changed from: private */
    public final Handler handler;
    /* access modifiers changed from: private */
    public final WeakReference<Listener> listener;
    private final Runnable runnable = new Runnable() {
        public void run() {
            Threads.ensureHandlerThread(OneTimeAction.this.handler);
            boolean unused = OneTimeAction.this.scheduled = false;
            Objects.onNotNull((Listener) OneTimeAction.this.listener.get(), $$Lambda$VuraK4iFlzV8mcxB2guKZa3GZo.INSTANCE);
        }
    };
    /* access modifiers changed from: private */
    public boolean scheduled;

    @FunctionalInterface
    public interface Listener {
        void doAction();
    }

    OneTimeAction(Handler handler2, Listener listener2) {
        this.handler = (Handler) Objects.requireNonNull(handler2);
        this.listener = new WeakReference<>((Listener) Objects.requireNonNull(listener2));
    }

    public void start(long j) {
        Threads.ensureHandlerThread(this.handler);
        if (!this.scheduled) {
            this.scheduled = true;
            this.handler.postDelayed(this.runnable, j);
        }
    }

    public void stop() {
        Threads.ensureHandlerThread(this.handler);
        if (this.scheduled) {
            this.handler.removeCallbacks(this.runnable);
            this.scheduled = false;
        }
    }

    public boolean isScheduled() {
        return this.scheduled;
    }
}
