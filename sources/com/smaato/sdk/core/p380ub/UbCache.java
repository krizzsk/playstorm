package com.smaato.sdk.core.p380ub;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.p382fi.Predicate;

/* renamed from: com.smaato.sdk.core.ub.UbCache */
public final class UbCache {
    private final AdCache<AdMarkup> adCache;
    private final Logger logger;

    static /* synthetic */ boolean lambda$put$0(AdMarkup adMarkup) {
        return true;
    }

    public UbCache(AdCache<AdMarkup> adCache2, Logger logger2) {
        this.adCache = adCache2;
        this.logger = logger2;
    }

    public UbId put(AdMarkup adMarkup) {
        this.logger.info(LogDomain.UNIFIED_BIDDING, "Saving an ad: adFormat = \"%1$s\", adSpaceId = \"%2$s\", sessionId = \"%3$s\"", adMarkup.adFormat(), adMarkup.adSpaceId(), adMarkup.sessionId());
        while (!this.adCache.put(adMarkup.adSpaceId(), adMarkup)) {
            AdMarkup andRemove = this.adCache.getAndRemove(adMarkup.adSpaceId(), $$Lambda$UbCache$ib08xneV3Al538TST7qk7NfJIys.INSTANCE);
            if (andRemove != null) {
                this.logger.info(LogDomain.UNIFIED_BIDDING, "Removed an ad: adFormat = \"%1$s\", adSpaceId = \"%2$s\", sessionId = \"%3$s\"", andRemove.adFormat(), andRemove.adSpaceId(), andRemove.sessionId());
            }
        }
        this.logger.info(LogDomain.UNIFIED_BIDDING, "Successfully saved an ad: adFormat = \"%1$s\", adSpaceId = \"%2$s\", sessionId = \"%3$s\"", adMarkup.adFormat(), adMarkup.adSpaceId(), adMarkup.sessionId());
        return UbId.builder().sessionId(adMarkup.sessionId()).adSpaceId(adMarkup.adSpaceId()).build();
    }

    public AdMarkup get(UbId ubId) {
        return this.adCache.getAndRemove(ubId.adSpaceId(), new Predicate() {
            public final boolean test(Object obj) {
                return ((AdMarkup) obj).sessionId().equals(UbId.this.sessionId());
            }
        });
    }
}
