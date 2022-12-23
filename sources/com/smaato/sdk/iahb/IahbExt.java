package com.smaato.sdk.iahb;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.iahb.AutoValue_IahbExt;

abstract class IahbExt {
    /* access modifiers changed from: package-private */
    public abstract String adspaceid();

    /* access modifiers changed from: package-private */
    public abstract String adtype();

    /* access modifiers changed from: package-private */
    public abstract long expiresAt();

    /* access modifiers changed from: package-private */
    public abstract ImpressionCountingType impressionMeasurement();

    IahbExt() {
    }

    static Builder builder() {
        return new AutoValue_IahbExt.Builder().impressionMeasurement(ImpressionCountingType.STANDARD);
    }

    static abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract Builder adspaceid(String str);

        /* access modifiers changed from: package-private */
        public abstract Builder adtype(String str);

        /* access modifiers changed from: package-private */
        public abstract IahbExt autoBuild();

        /* access modifiers changed from: package-private */
        public abstract Builder expiresAt(long j);

        /* access modifiers changed from: package-private */
        public abstract Builder impressionMeasurement(ImpressionCountingType impressionCountingType);

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public IahbExt build() {
            try {
                return autoBuild();
            } catch (IllegalStateException unused) {
                return null;
            }
        }
    }
}
