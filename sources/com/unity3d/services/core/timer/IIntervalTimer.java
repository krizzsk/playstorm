package com.unity3d.services.core.timer;

import java.util.concurrent.ScheduledExecutorService;

public interface IIntervalTimer {
    void kill();

    void onNextInterval();

    void start(ScheduledExecutorService scheduledExecutorService);
}
