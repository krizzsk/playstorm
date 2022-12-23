package com.smaato.sdk.interstitial.csm;

import com.smaato.sdk.core.csm.CsmAdInteractor;
import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.csm.CsmAdPresenterBuilderImpl;
import com.smaato.sdk.core.csm.CsmAdResponseParser;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.p382fi.Function;
import com.smaato.sdk.core.util.p382fi.Predicate;

final class InterstitialCsmAdPresenterBuilderImpl extends CsmAdPresenterBuilderImpl<InterstitialCsmAdPresenter> {
    InterstitialCsmAdPresenterBuilderImpl(Function<CsmAdObject, CsmAdInteractor> function, Iterable<SMAInterstitialNetworkEvent> iterable, CsmAdResponseParser csmAdResponseParser, Logger logger) {
        super(logger, csmAdResponseParser, function, new Function(iterable, logger) {
            public final /* synthetic */ Iterable f$0;
            public final /* synthetic */ Logger f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final Object apply(Object obj) {
                return InterstitialCsmAdPresenterBuilderImpl.lambda$new$1(this.f$0, this.f$1, (CsmAdInteractor) obj);
            }
        });
    }

    static /* synthetic */ InterstitialCsmAdPresenter lambda$new$1(Iterable iterable, Logger logger, CsmAdInteractor csmAdInteractor) {
        String str;
        if (((CsmAdObject) csmAdInteractor.getAdObject()).getNetwork().isCustomCsmNetwork()) {
            str = ((CsmAdObject) csmAdInteractor.getAdObject()).getNetwork().getClassName();
        } else {
            str = ((CsmAdObject) csmAdInteractor.getAdObject()).getNetwork().getName();
        }
        return new InterstitialCsmAdPresenterImpl(csmAdInteractor, logger, (SMAInterstitialNetworkEvent) Iterables.filterFirst(iterable, new Predicate(str) {
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            public final boolean test(Object obj) {
                return ((SMAInterstitialNetworkEvent) obj).getNetworkName().equalsIgnoreCase(this.f$0);
            }
        }));
    }
}
