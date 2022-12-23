package com.smaato.sdk.core.p380ub;

import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.p379di.DiRegistry;

/* renamed from: com.smaato.sdk.core.ub.DiUnifiedBidding */
public final class DiUnifiedBidding {
    private DiUnifiedBidding() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m32956of($$Lambda$DiUnifiedBidding$VfucDHDE4tqP1gflCzhRThSaSRg.INSTANCE);
    }

    static /* synthetic */ void lambda$createRegistry$3(DiRegistry diRegistry) {
        diRegistry.registerFactory(AdCache.class, $$Lambda$DiUnifiedBidding$ReJ3otu0MAyAc_Njfs3I1J8R3F8.INSTANCE);
        diRegistry.registerSingletonFactory(UbCache.class, $$Lambda$DiUnifiedBidding$5UecbA8yFV9LdfIax_ZKDrtWWM.INSTANCE);
    }

    static /* synthetic */ boolean lambda$createRegistry$0(AdMarkup adMarkup) {
        return adMarkup.expiresAt().getTimestamp() - System.currentTimeMillis() > 0;
    }

    static /* synthetic */ AdCache lambda$createRegistry$1(DiConstructor diConstructor) {
        return new AdCache(20, $$Lambda$DiUnifiedBidding$mp13bwxsQBTgle_wq0ZZdxEyOo.INSTANCE);
    }

    static /* synthetic */ UbCache lambda$createRegistry$2(DiConstructor diConstructor) {
        return new UbCache((AdCache) diConstructor.get(AdCache.class), (Logger) diConstructor.get(Logger.class));
    }
}
