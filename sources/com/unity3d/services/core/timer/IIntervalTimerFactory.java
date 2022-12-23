package com.unity3d.services.core.timer;

public interface IIntervalTimerFactory {
    IIntervalTimer createTimer(String str, Integer num, Integer num2, IIntervalTimerListener iIntervalTimerListener);
}
