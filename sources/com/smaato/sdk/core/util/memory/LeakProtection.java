package com.smaato.sdk.core.util.memory;

public interface LeakProtection {
    void listenToObject(Object obj, Runnable runnable);
}
