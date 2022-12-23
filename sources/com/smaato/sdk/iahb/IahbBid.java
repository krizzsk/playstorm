package com.smaato.sdk.iahb;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.iahb.AutoValue_IahbBid;

abstract class IahbBid {
    /* access modifiers changed from: package-private */
    public abstract String adm();

    /* access modifiers changed from: package-private */
    public abstract IahbExt ext();

    IahbBid() {
    }

    static Builder builder() {
        return new AutoValue_IahbBid.Builder();
    }

    static abstract class Builder {
        /* access modifiers changed from: package-private */
        public abstract Builder adm(String str);

        /* access modifiers changed from: package-private */
        public abstract IahbBid autoBuild();

        /* access modifiers changed from: package-private */
        public abstract Builder ext(IahbExt iahbExt);

        Builder() {
        }

        /* access modifiers changed from: package-private */
        public IahbBid build(Logger logger) {
            try {
                return autoBuild();
            } catch (IllegalStateException e) {
                if (e.getMessage() != null) {
                    logger.error(LogDomain.INAPP_BIDDING, e.getMessage(), new Object[0]);
                    return null;
                }
                logger.error(LogDomain.INAPP_BIDDING, "Error building IahbBid", new Object[0]);
                return null;
            }
        }
    }
}
