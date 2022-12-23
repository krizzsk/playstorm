package com.smaato.sdk.core.util.notifier;

import com.smaato.sdk.core.util.Threads;

public final class TimerUtils {
    private TimerUtils() {
    }

    public static Timer createStandardTimer(long j) {
        return new StandardTimer(Threads.newUiHandler(), j);
    }

    public static Timer createSingleTimer(long j) {
        return new SingleTimer(Threads.newUiHandler(), j);
    }
}
