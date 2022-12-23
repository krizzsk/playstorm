package com.smaato.sdk.core.util.notifier;

import android.os.Handler;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;

class DebounceChangeSender<D> extends StandardChangeSender<D> {
    private final Consumer<Runnable> actionCleaner;
    private final long delay;
    private final Handler handler;
    private Runnable lastAction;

    DebounceChangeSender(D d, Handler handler2, long j) {
        super(d);
        this.handler = (Handler) Objects.requireNonNull(handler2);
        this.delay = j;
        this.actionCleaner = new Consumer(handler2) {
            public final /* synthetic */ Handler f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                DebounceChangeSender.this.lambda$new$0$DebounceChangeSender(this.f$1, (Runnable) obj);
            }
        };
    }

    public /* synthetic */ void lambda$new$0$DebounceChangeSender(Handler handler2, Runnable runnable) {
        handler2.removeCallbacks(runnable);
        this.lastAction = null;
    }

    public void newValue(D d) {
        synchronized (this.lock) {
            Objects.onNotNull(this.lastAction, this.actionCleaner);
            $$Lambda$DebounceChangeSender$RappemUUbZL4IiWbPZQKeEVygeM r1 = new Runnable(d) {
                public final /* synthetic */ Object f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    DebounceChangeSender.this.lambda$newValue$1$DebounceChangeSender(this.f$1);
                }
            };
            this.lastAction = r1;
            this.handler.postDelayed(r1, this.delay);
        }
    }

    public /* synthetic */ void lambda$newValue$1$DebounceChangeSender(Object obj) {
        super.newValue(obj);
    }
}
