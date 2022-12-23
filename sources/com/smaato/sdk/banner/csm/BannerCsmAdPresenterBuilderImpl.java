package com.smaato.sdk.banner.csm;

import com.smaato.sdk.core.csm.CsmAdInteractor;
import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.csm.CsmAdPresenterBuilderImpl;
import com.smaato.sdk.core.csm.CsmAdResponseParser;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.Predicate;

final class BannerCsmAdPresenterBuilderImpl extends CsmAdPresenterBuilderImpl<BannerCsmAdPresenter> {
    BannerCsmAdPresenterBuilderImpl(Function<CsmAdObject, CsmAdInteractor> function, VisibilityTrackerCreator visibilityTrackerCreator, Iterable<SMABannerNetworkEvent> iterable, CsmAdResponseParser csmAdResponseParser, Logger logger) {
        super(logger, csmAdResponseParser, function, new Function(iterable, visibilityTrackerCreator, logger) {
            public final /* synthetic */ Iterable f$0;
            public final /* synthetic */ VisibilityTrackerCreator f$1;
            public final /* synthetic */ Logger f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object apply(Object obj) {
                return BannerCsmAdPresenterBuilderImpl.lambda$new$1(this.f$0, this.f$1, this.f$2, (CsmAdInteractor) obj);
            }
        });
    }

    static /* synthetic */ BannerCsmAdPresenter lambda$new$1(Iterable iterable, VisibilityTrackerCreator visibilityTrackerCreator, Logger logger, CsmAdInteractor csmAdInteractor) {
        String str;
        if (((CsmAdObject) csmAdInteractor.getAdObject()).getNetwork().isCustomCsmNetwork()) {
            str = ((CsmAdObject) csmAdInteractor.getAdObject()).getNetwork().getClassName();
        } else {
            str = ((CsmAdObject) csmAdInteractor.getAdObject()).getNetwork().getName();
        }
        return new BannerCsmAdPresenterImpl(csmAdInteractor, visibilityTrackerCreator, logger, (SMABannerNetworkEvent) Iterables.filterFirst(iterable, new Predicate(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return ((SMABannerNetworkEvent) obj).getNetworkName().equalsIgnoreCase(this.f$0);
            }
        }));
    }
}
