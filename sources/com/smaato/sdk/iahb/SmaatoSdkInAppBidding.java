package com.smaato.sdk.iahb;

import com.smaato.sdk.core.AndroidsInjector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Either;
import com.smaato.sdk.core.util.diinjection.Inject;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.iahb.InAppBiddingException;
import java.util.concurrent.atomic.AtomicReference;

public final class SmaatoSdkInAppBidding {
    @Inject
    private static IahbInteractor iahbInteractor;
    @Inject
    private static Logger logger;

    private SmaatoSdkInAppBidding() {
    }

    public static String saveBid(InAppBid inAppBid) throws InAppBiddingException {
        if (inAppBid != null) {
            AtomicReference atomicReference = new AtomicReference();
            if (iahbInteractor == null || logger == null) {
                AndroidsInjector.injectStatic(SmaatoSdkInAppBidding.class);
            }
            IahbInteractor iahbInteractor2 = iahbInteractor;
            if (iahbInteractor2 == null) {
                Logger logger2 = logger;
                if (logger2 != null) {
                    logger2.error(LogDomain.INAPP_BIDDING, "InAppBidding module was not initialized", new Object[0]);
                }
                atomicReference.set(Either.right(new InAppBiddingException(InAppBiddingException.InApBiddingError.NOT_INITIALISED)));
            } else {
                iahbInteractor2.saveBid(inAppBid, new Consumer(atomicReference) {
                    public final /* synthetic */ AtomicReference f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        this.f$0.set(Either.left((String) obj));
                    }
                }, new Consumer(atomicReference) {
                    public final /* synthetic */ AtomicReference f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final void accept(Object obj) {
                        this.f$0.set(Either.right((InAppBiddingException) obj));
                    }
                });
            }
            String str = (String) ((Either) atomicReference.get()).left();
            if (str != null) {
                return str;
            }
            InAppBiddingException inAppBiddingException = (InAppBiddingException) ((Either) atomicReference.get()).right();
            if (inAppBiddingException != null) {
                throw inAppBiddingException;
            }
            throw new InAppBiddingException(InAppBiddingException.InApBiddingError.INTERNAL_ERROR);
        }
        throw new NullPointerException("'inAppBid' specified as non-null is null");
    }
}
