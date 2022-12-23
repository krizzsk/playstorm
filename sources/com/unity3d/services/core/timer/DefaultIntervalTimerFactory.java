package com.unity3d.services.core.timer;

import com.unity3d.services.core.lifecycle.CachedLifecycle;

public class DefaultIntervalTimerFactory implements IIntervalTimerFactory {
    public IIntervalTimer createTimer(String str, Integer num, Integer num2, IIntervalTimerListener iIntervalTimerListener) {
        return new IntervalTimer(str, num, num2, iIntervalTimerListener, CachedLifecycle.getLifecycleListener());
    }
}
