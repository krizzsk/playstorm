package com.smaato.sdk.iahb;

import android.util.JsonReader;
import com.smaato.sdk.core.api.ExpirationTimestampFactory;
import com.smaato.sdk.core.flow.Action1;
import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Function1;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p380ub.AdMarkup;
import com.smaato.sdk.core.p380ub.UbCache;
import com.smaato.sdk.core.p380ub.UbId;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.iahb.InAppBiddingException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.concurrent.Callable;

final class IahbInteractor {
    private final ExpirationTimestampFactory expirationTimestampFactory;
    private final IahbJsonAdapter iahbJsonAdapter;
    private final Logger logger;
    private final UbCache ubCache;

    IahbInteractor(UbCache ubCache2, IahbJsonAdapter iahbJsonAdapter2, ExpirationTimestampFactory expirationTimestampFactory2, Logger logger2) {
        this.ubCache = ubCache2;
        this.iahbJsonAdapter = iahbJsonAdapter2;
        this.expirationTimestampFactory = expirationTimestampFactory2;
        this.logger = logger2;
    }

    /* access modifiers changed from: package-private */
    public void saveBid(InAppBid inAppBid, Consumer<String> consumer, Consumer<InAppBiddingException> consumer2) {
        if (inAppBid == null) {
            throw new NullPointerException("'inAppBid' specified as non-null is null");
        } else if (consumer == null) {
            throw new NullPointerException("'onSaved' specified as non-null is null");
        } else if (consumer2 != null) {
            saveAdMarkup(inAppBid.getJson()).doOnError(new Action1() {
                public final void invoke(Object obj) {
                    IahbInteractor.this.lambda$saveBid$0$IahbInteractor((Throwable) obj);
                }
            }).subscribe(new Action1() {
                public final void invoke(Object obj) {
                    Consumer.this.accept(((UbId) obj).toString());
                }
            }, (Action1<? super Throwable>) new Action1() {
                public final void invoke(Object obj) {
                    IahbInteractor.lambda$saveBid$2(Consumer.this, (Throwable) obj);
                }
            });
        } else {
            throw new NullPointerException("'onFailedToSave' specified as non-null is null");
        }
    }

    public /* synthetic */ void lambda$saveBid$0$IahbInteractor(Throwable th) throws Throwable {
        if (th.getMessage() != null) {
            this.logger.error(LogDomain.INAPP_BIDDING, th.getMessage(), new Object[0]);
        } else {
            this.logger.error(LogDomain.INAPP_BIDDING, "Error saving bid", new Object[0]);
        }
    }

    static /* synthetic */ void lambda$saveBid$2(Consumer consumer, Throwable th) throws Throwable {
        if (th instanceof InAppBiddingException) {
            consumer.accept((InAppBiddingException) th);
        } else {
            consumer.accept(new InAppBiddingException(InAppBiddingException.InApBiddingError.INTERNAL_ERROR, th));
        }
    }

    private Flow<UbId> saveAdMarkup(String str) {
        if (str != null) {
            Flow map = Flow.fromCallable(new Callable(str) {
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                public final Object call() {
                    return IahbInteractor.this.lambda$saveAdMarkup$3$IahbInteractor(this.f$1);
                }
            }).map(new Function1() {
                public final Object apply(Object obj) {
                    return IahbInteractor.this.lambda$saveAdMarkup$4$IahbInteractor((IahbResponse) obj);
                }
            });
            UbCache ubCache2 = this.ubCache;
            Objects.requireNonNull(ubCache2);
            return map.map(new Function1() {
                public final Object apply(Object obj) {
                    return UbCache.this.put((AdMarkup) obj);
                }
            });
        }
        throw new NullPointerException("'json' specified as non-null is null");
    }

    public /* synthetic */ IahbResponse lambda$saveAdMarkup$3$IahbInteractor(String str) throws Exception {
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(new ByteArrayInputStream(str.getBytes()));
            IahbResponse fromJson = this.iahbJsonAdapter.fromJson(new JsonReader(inputStreamReader));
            if (fromJson != null) {
                inputStreamReader.close();
                return fromJson;
            }
            throw new InAppBiddingException(InAppBiddingException.InApBiddingError.INVALID_JSON);
        } catch (IOException e) {
            throw new InAppBiddingException(InAppBiddingException.InApBiddingError.INVALID_JSON, e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* synthetic */ AdMarkup lambda$saveAdMarkup$4$IahbInteractor(IahbResponse iahbResponse) throws Throwable {
        IahbBid bid = iahbResponse.bid();
        return AdMarkup.builder().markup(bid.adm()).adFormat(bid.ext().adtype()).impressionCountingType(bid.ext().impressionMeasurement()).expiresAt(this.expirationTimestampFactory.createExpirationTimestampFor(bid.ext().expiresAt(), (Long) null)).sessionId(iahbResponse.bidId()).adSpaceId(bid.ext().adspaceid()).build();
    }
}
