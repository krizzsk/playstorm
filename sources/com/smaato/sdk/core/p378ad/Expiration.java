package com.smaato.sdk.core.p378ad;

import com.smaato.sdk.core.util.CurrentTimeProvider;
import com.smaato.sdk.core.util.Objects;

/* renamed from: com.smaato.sdk.core.ad.Expiration */
public class Expiration {
    private final CurrentTimeProvider currentTimeProvider;
    private final long expirationTimestamp;

    public Expiration(long j, CurrentTimeProvider currentTimeProvider2) {
        this.expirationTimestamp = j;
        this.currentTimeProvider = (CurrentTimeProvider) Objects.requireNonNull(currentTimeProvider2);
    }

    public long getTimestamp() {
        return this.expirationTimestamp;
    }

    public boolean isExpired() {
        return this.expirationTimestamp <= this.currentTimeProvider.currentMillisUtc();
    }

    public long getRemainingTime() {
        long currentMillisUtc = this.expirationTimestamp - this.currentTimeProvider.currentMillisUtc();
        if (currentMillisUtc > 0) {
            return currentMillisUtc;
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(this.expirationTimestamp);
    }
}
