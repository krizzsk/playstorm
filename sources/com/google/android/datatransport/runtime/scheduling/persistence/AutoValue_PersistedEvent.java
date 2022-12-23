package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

final class AutoValue_PersistedEvent extends PersistedEvent {
    private final EventInternal event;

    /* renamed from: id */
    private final long f14456id;
    private final TransportContext transportContext;

    AutoValue_PersistedEvent(long j, TransportContext transportContext2, EventInternal eventInternal) {
        this.f14456id = j;
        if (transportContext2 != null) {
            this.transportContext = transportContext2;
            if (eventInternal != null) {
                this.event = eventInternal;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    public long getId() {
        return this.f14456id;
    }

    public TransportContext getTransportContext() {
        return this.transportContext;
    }

    public EventInternal getEvent() {
        return this.event;
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f14456id + ", transportContext=" + this.transportContext + ", event=" + this.event + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        if (this.f14456id != persistedEvent.getId() || !this.transportContext.equals(persistedEvent.getTransportContext()) || !this.event.equals(persistedEvent.getEvent())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f14456id;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.transportContext.hashCode()) * 1000003) ^ this.event.hashCode();
    }
}
