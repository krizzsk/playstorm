package com.smaato.sdk.core.api;

import com.smaato.sdk.core.p378ad.Expiration;
import com.smaato.sdk.core.util.CurrentTimeProvider;
import com.smaato.sdk.core.util.Objects;

public class ExpirationTimestampFactory {
    public static final long DEFAULT_AD_EXPIRATION_PERIOD_MS = 300000;
    private final CurrentTimeProvider currentTimeProvider;

    ExpirationTimestampFactory(CurrentTimeProvider currentTimeProvider2) {
        this.currentTimeProvider = (CurrentTimeProvider) Objects.requireNonNull(currentTimeProvider2);
    }

    public Expiration createExpirationTimestampFor(long j, Long l) {
        long currentMillisUtc = j - this.currentTimeProvider.currentMillisUtc();
        if (l != null) {
            long longValue = j - l.longValue();
            if (longValue >= 30000) {
                return new Expiration(this.currentTimeProvider.currentMillisUtc() + longValue, this.currentTimeProvider);
            }
        } else if (currentMillisUtc >= 30000) {
            return new Expiration(j, this.currentTimeProvider);
        }
        return createDefaultExpirationTimestamp();
    }

    public Expiration createDefaultExpirationTimestamp() {
        return new Expiration(this.currentTimeProvider.currentMillisUtc() + 300000, this.currentTimeProvider);
    }
}
