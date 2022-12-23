package com.ogury.core.internal;

/* compiled from: OguryEventBus.kt */
public interface OguryEventBus {
    void dispatch(String str, String str2);

    void register(String str, OguryEventCallback oguryEventCallback);

    void unregister(String str, OguryEventCallback oguryEventCallback);
}
