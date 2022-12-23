package com.smaato.sdk.video.vast.build;

import com.smaato.sdk.core.util.collections.Lists;
import com.smaato.sdk.core.util.p382fi.NullableFunction;
import com.smaato.sdk.video.vast.model.C11286Ad;
import com.smaato.sdk.video.vast.model.VastTree;
import com.smaato.sdk.video.vast.model.Wrapper;

final class ResolvedWrapperMergeUtils {
    static /* synthetic */ C11286Ad lambda$mergeParsedResultWithParents$0(C11286Ad ad, C11286Ad ad2, C11286Ad ad3) {
        return ad3 == ad ? ad2 : ad3;
    }

    static VastTree mergeParsedResultWithParents(VastTree vastTree, VastTree vastTree2, AdContainer<Wrapper> adContainer) {
        if (vastTree2.ads.contains(adContainer.f27158ad)) {
            return vastTree2.newBuilder().setAds(Lists.mapLazy(vastTree2.ads, new NullableFunction(adContainer.f27158ad.newBuilder().setWrapper(((Wrapper) adContainer.model).newBuilder().setVastTree(vastTree).build()).build()) {
                public final /* synthetic */ C11286Ad f$1;

                {
                    this.f$1 = r2;
                }

                public final Object apply(Object obj) {
                    return ResolvedWrapperMergeUtils.lambda$mergeParsedResultWithParents$0(C11286Ad.this, this.f$1, (C11286Ad) obj);
                }
            })).build();
        }
        throw new IllegalArgumentException("parentVastTree parameter should contains same ad that passed in parentWrapperContainer. Wrong argument passed for WrapperMergeUtilsTest::mergeParsedResultWithParents");
    }
}
