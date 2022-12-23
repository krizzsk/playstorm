package com.smaato.sdk.core.util.notifier;

import android.os.Handler;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.p382fi.Consumer;

public class StandardTimer implements Timer {
    private final Consumer<Runnable> actionCleaner;
    private final Handler handler;
    private Runnable scheduledAction;
    private final long throttleMillis;

    StandardTimer(Handler handler2, long j) {
        this.handler = (Handler) Objects.requireNonNull(handler2);
        this.throttleMillis = j;
        this.actionCleaner = new Consumer(handler2) {
            public final /* synthetic */ Handler f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                StandardTimer.this.lambda$new$0$StandardTimer(this.f$1, (Runnable) obj);
            }
        };
    }

    public /* synthetic */ void lambda$new$0$StandardTimer(Handler handler2, Runnable runnable) {
        handler2.removeCallbacks(runnable);
        this.scheduledAction = null;
    }

    public void start(Timer.Listener listener) {
        Objects.onNotNull(this.scheduledAction, this.actionCleaner);
        $$Lambda$StandardTimer$9G1313bHOcBE4l373deI7pggQ r0 = new Runnable() {
            public final void run() {
                Objects.onNotNull(Timer.Listener.this, $$Lambda$pT498UUR2aZfhfxkzTbsb9200M.INSTANCE);
            }
        };
        this.scheduledAction = r0;
        this.handler.postDelayed(r0, this.throttleMillis);
    }
}
