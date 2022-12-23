package com.smaato.sdk.richmedia.mraid;

import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.PauseUnpauseListener;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.RepeatableActionScheduler;
import java.util.concurrent.atomic.AtomicReference;

public final class RepeatableActionScheduler {
    private final Runnable actionDecorator = new Runnable() {
        public void run() {
            Objects.onNotNull((Runnable) RepeatableActionScheduler.this.actionRef.get(), new Consumer() {
                public final void accept(Object obj) {
                    RepeatableActionScheduler.C112431.this.lambda$run$0$RepeatableActionScheduler$1((Runnable) obj);
                }
            });
        }

        public /* synthetic */ void lambda$run$0$RepeatableActionScheduler$1(Runnable runnable) {
            runnable.run();
            RepeatableActionScheduler.this.schedule();
        }
    };
    /* access modifiers changed from: private */
    public final AtomicReference<Runnable> actionRef = new AtomicReference<>();
    private final AppBackgroundAwareHandler appBackgroundAwareHandler;
    private final long delayMillis;
    private final Logger logger;

    RepeatableActionScheduler(Logger logger2, AppBackgroundAwareHandler appBackgroundAwareHandler2, long j) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.appBackgroundAwareHandler = (AppBackgroundAwareHandler) Objects.requireNonNull(appBackgroundAwareHandler2);
        if (j > 0) {
            this.delayMillis = j;
            return;
        }
        throw new IllegalArgumentException("delay must be positive for " + RepeatableActionScheduler.class.getSimpleName() + "::new");
    }

    public void start(Runnable runnable) {
        if (!isScheduled()) {
            if (runnable == null) {
                this.logger.info(LogDomain.MRAID, "No action to schedule", new Object[0]);
                return;
            }
            this.actionRef.set(runnable);
            schedule();
        }
    }

    private boolean isScheduled() {
        return this.actionRef.get() != null;
    }

    /* access modifiers changed from: private */
    public void schedule() {
        this.appBackgroundAwareHandler.postDelayed("Repeatable action timer", this.actionDecorator, this.delayMillis, (PauseUnpauseListener) null);
    }

    public void stop() {
        this.appBackgroundAwareHandler.stop();
        this.actionRef.set((Object) null);
    }
}
