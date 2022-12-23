package com.smaato.sdk.core.util.notifier;

import android.os.Handler;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.notifier.Timer;

public class SingleTimer extends StandardTimer {
    private volatile boolean alreadyPassed;

    SingleTimer(Handler handler, long j) {
        super(handler, j);
    }

    public void start(Timer.Listener listener) {
        if (this.alreadyPassed) {
            Objects.onNotNull(listener, $$Lambda$pT498UUR2aZfhfxkzTbsb9200M.INSTANCE);
        } else {
            super.start(new Timer.Listener(listener) {
                public final /* synthetic */ Timer.Listener f$1;

                {
                    this.f$1 = r2;
                }

                public final void onTimePassed() {
                    SingleTimer.this.lambda$start$0$SingleTimer(this.f$1);
                }
            });
        }
    }

    public /* synthetic */ void lambda$start$0$SingleTimer(Timer.Listener listener) {
        this.alreadyPassed = true;
        Objects.onNotNull(listener, $$Lambda$pT498UUR2aZfhfxkzTbsb9200M.INSTANCE);
    }
}
