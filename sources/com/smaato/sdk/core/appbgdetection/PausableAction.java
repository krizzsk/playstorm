package com.smaato.sdk.core.appbgdetection;

import android.os.Handler;
import android.os.SystemClock;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;

public class PausableAction implements Runnable {
    private final Handler handler;
    public final String name;
    private final PauseUnpauseListener pauseUnpauseListener;
    private long pausedAt = 0;
    private long remainingDelay;
    private final Runnable runnable;
    private long startedAt;

    PausableAction(String str, Handler handler2, Runnable runnable2, long j, PauseUnpauseListener pauseUnpauseListener2) {
        this.name = (String) Objects.requireNonNull(str);
        this.handler = (Handler) Objects.requireNonNull(handler2);
        this.runnable = (Runnable) Objects.requireNonNull(runnable2);
        if (j > 0) {
            this.remainingDelay = j;
            this.pauseUnpauseListener = pauseUnpauseListener2;
            this.startedAt = SystemClock.uptimeMillis();
            return;
        }
        throw new IllegalArgumentException("delay must be positive for " + getClass().getSimpleName() + "::new");
    }

    public void run() {
        Threads.ensureHandlerThread(this.handler);
        this.runnable.run();
    }

    /* access modifiers changed from: package-private */
    public boolean isPaused() {
        Threads.ensureHandlerThread(this.handler);
        return this.pausedAt > 0;
    }

    /* access modifiers changed from: package-private */
    public void pause() {
        Threads.ensureHandlerThread(this.handler);
        if (!isPaused()) {
            this.handler.removeCallbacks(this);
            long uptimeMillis = SystemClock.uptimeMillis();
            this.pausedAt = uptimeMillis;
            this.remainingDelay -= uptimeMillis - this.startedAt;
            PauseUnpauseListener pauseUnpauseListener2 = this.pauseUnpauseListener;
            if (pauseUnpauseListener2 != null) {
                pauseUnpauseListener2.onActionPaused();
                return;
            }
            return;
        }
        throw new RuntimeException("unexpected pause call - action has been already paused");
    }

    /* access modifiers changed from: package-private */
    public void unpause() {
        Threads.ensureHandlerThread(this.handler);
        if (isPaused()) {
            this.pausedAt = 0;
            this.startedAt = SystemClock.uptimeMillis();
            PauseUnpauseListener pauseUnpauseListener2 = this.pauseUnpauseListener;
            if (pauseUnpauseListener2 != null) {
                pauseUnpauseListener2.onBeforeActionUnpaused();
            }
            this.handler.postDelayed(this, this.remainingDelay);
            return;
        }
        throw new RuntimeException("unexpected unpause call - action has not been paused");
    }
}
