package com.ogury.core.internal;

/* compiled from: OguryEventBuses.kt */
public final class OguryEventBuses {
    private final OguryEventBus broadcast;
    private final OguryEventBus persistentMessage;

    public OguryEventBuses(OguryEventBus oguryEventBus, OguryEventBus oguryEventBus2) {
        C10219ai.m31036b(oguryEventBus, "persistentMessage");
        C10219ai.m31036b(oguryEventBus2, "broadcast");
        this.persistentMessage = oguryEventBus;
        this.broadcast = oguryEventBus2;
    }

    public final OguryEventBus getBroadcast() {
        return this.broadcast;
    }

    public final OguryEventBus getPersistentMessage() {
        return this.persistentMessage;
    }
}
