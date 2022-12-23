package com.smaato.sdk.nativead.repository;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.openmeasurement.ViewabilityTracker;
import com.smaato.sdk.core.p378ad.AdLoaderException;
import com.smaato.sdk.core.p380ub.UbId;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.BiConsumer;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.nativead.NativeAdRequest;
import com.smaato.sdk.nativead.NativeAdResponse;
import com.smaato.sdk.nativead.model.omTracking.OMTrackingRemoteSource;
import com.smaato.sdk.nativead.model.p386ub.UBRemoteSource;
import com.smaato.sdk.nativead.model.soma.SomaRemoteSource;
import com.smaato.sdk.nativead.model.utils.VastTagConverter;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.util.List;

public class NativeAdRepository {
    private final LinkHandler linkHandler;
    private final Logger logger;
    private final OMTrackingRemoteSource omTrackingRemoteSource;
    private final SimpleHttpClient simpleHttpClient;
    private final SomaRemoteSource somaRemoteSource;
    private final UBRemoteSource ubRemoteResource;
    private final VastTagConverter vastTagConverter;

    public NativeAdRepository(SomaRemoteSource somaRemoteSource2, SimpleHttpClient simpleHttpClient2, LinkHandler linkHandler2, OMTrackingRemoteSource oMTrackingRemoteSource, UBRemoteSource uBRemoteSource, Logger logger2, VastTagConverter vastTagConverter2) {
        this.somaRemoteSource = somaRemoteSource2;
        this.simpleHttpClient = simpleHttpClient2;
        this.linkHandler = linkHandler2;
        this.omTrackingRemoteSource = oMTrackingRemoteSource;
        this.ubRemoteResource = uBRemoteSource;
        this.logger = logger2;
        this.vastTagConverter = vastTagConverter2;
    }

    public void loadAd(NativeAdRequest nativeAdRequest, Consumer<NativeAdResponse> consumer, Consumer<Throwable> consumer2) {
        UbId create = UbId.create(nativeAdRequest.adSpaceId(), nativeAdRequest.uniqueUBId());
        if (create != null) {
            loadAdFromUb(nativeAdRequest, create, consumer, consumer2);
        } else {
            loadAdFromNetwork(nativeAdRequest, consumer, consumer2);
        }
    }

    public void loadAdFromNetwork(NativeAdRequest nativeAdRequest, Consumer<NativeAdResponse> consumer, Consumer<Throwable> consumer2) {
        Threads.runOnBackgroundThread(new Runnable(nativeAdRequest, consumer, consumer2) {
            public final /* synthetic */ NativeAdRequest f$1;
            public final /* synthetic */ Consumer f$2;
            public final /* synthetic */ Consumer f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                NativeAdRepository.this.lambda$loadAdFromNetwork$3$NativeAdRepository(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public /* synthetic */ void lambda$loadAdFromNetwork$3$NativeAdRepository(NativeAdRequest nativeAdRequest, Consumer consumer, Consumer consumer2) {
        try {
            NativeAdResponse loadAd = this.somaRemoteSource.loadAd(nativeAdRequest);
            if (loadAd.isVastTagPresent()) {
                Threads.runOnUi(new Runnable(wrapVastTag(loadAd)) {
                    public final /* synthetic */ NativeAdResponse f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        Consumer.this.accept(this.f$1);
                    }
                });
            } else {
                Threads.runOnUi(new Runnable(loadAd) {
                    public final /* synthetic */ NativeAdResponse f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        Consumer.this.accept(this.f$1);
                    }
                });
            }
        } catch (Exception e) {
            Threads.runOnUi(new Runnable(e) {
                public final /* synthetic */ Exception f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    Consumer.this.accept(this.f$1);
                }
            });
        }
    }

    public void loadAdFromUb(NativeAdRequest nativeAdRequest, UbId ubId, Consumer<NativeAdResponse> consumer, Consumer<Throwable> consumer2) {
        Threads.runOnBackgroundThread(new Runnable(nativeAdRequest, ubId, consumer, consumer2) {
            public final /* synthetic */ NativeAdRequest f$1;
            public final /* synthetic */ UbId f$2;
            public final /* synthetic */ Consumer f$3;
            public final /* synthetic */ Consumer f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                NativeAdRepository.this.lambda$loadAdFromUb$8$NativeAdRepository(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public /* synthetic */ void lambda$loadAdFromUb$8$NativeAdRepository(NativeAdRequest nativeAdRequest, UbId ubId, Consumer consumer, Consumer consumer2) {
        try {
            NativeAdResponse loadAdFromUBCache = this.ubRemoteResource.loadAdFromUBCache(nativeAdRequest, ubId);
            if (loadAdFromUBCache.isVastTagPresent()) {
                Threads.runOnUi(new Runnable(wrapVastTag(loadAdFromUBCache)) {
                    public final /* synthetic */ NativeAdResponse f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        Consumer.this.accept(this.f$1);
                    }
                });
            } else {
                Threads.runOnUi(new Runnable(loadAdFromUBCache) {
                    public final /* synthetic */ NativeAdResponse f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        Consumer.this.accept(this.f$1);
                    }
                });
            }
        } catch (AdLoaderException e) {
            Threads.runOnUi(new Runnable(e) {
                public final /* synthetic */ AdLoaderException f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    Consumer.this.accept(this.f$1);
                }
            });
        } catch (Exception e2) {
            Threads.runOnUi(new Runnable(e2) {
                public final /* synthetic */ Exception f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    Consumer.this.accept(this.f$1);
                }
            });
        }
    }

    public ViewabilityTracker getOMViewabilityTracker(View view, boolean z, List<String> list) {
        if (list.isEmpty()) {
            return null;
        }
        return this.omTrackingRemoteSource.getViewabilityTracker(view, z, list.get(0));
    }

    public void trackOMAdLoaded(ViewabilityTracker viewabilityTracker) {
        this.omTrackingRemoteSource.trackOMAdLoaded(viewabilityTracker);
    }

    public void trackOMImpression(ViewabilityTracker viewabilityTracker) {
        this.omTrackingRemoteSource.trackOMImpression(viewabilityTracker);
    }

    public void trackOMUpdateView(ViewabilityTracker viewabilityTracker, RichMediaWebView richMediaWebView) {
        this.omTrackingRemoteSource.trackOMUpdateView(viewabilityTracker, richMediaWebView);
    }

    public void stopOMTracking(ViewabilityTracker viewabilityTracker) {
        this.omTrackingRemoteSource.stopOMTracking(viewabilityTracker);
    }

    public void handleClickThroughUrl(String str) {
        if (!this.linkHandler.handleUrl(str)) {
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.NATIVE;
            logger2.error(logDomain, "Could not launch click through url: " + str, new Object[0]);
        }
    }

    public void handleTrackerUrls(List<String> list) {
        handleTrackerUrls((String[]) list.toArray(new String[0]));
    }

    public void handleTrackerUrls(String... strArr) {
        this.simpleHttpClient.fireAndForget(strArr);
    }

    public void handleUncheckedIntentUrl(String str) {
        if (!this.linkHandler.launchAsUncheckedIntent(str)) {
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.NATIVE;
            logger2.error(logDomain, "Could not launch url: " + str, new Object[0]);
        }
    }

    public BiConsumer<Uri, ImageView> getImageLoader() {
        return new BiConsumer() {
            public final void accept(Object obj, Object obj2) {
                NativeAdRepository.this.lambda$getImageLoader$11$NativeAdRepository((Uri) obj, (ImageView) obj2);
            }
        };
    }

    public /* synthetic */ void lambda$getImageLoader$11$NativeAdRepository(Uri uri, ImageView imageView) {
        Threads.runOnBackgroundThread(new Runnable(uri, imageView) {
            public final /* synthetic */ Uri f$1;
            public final /* synthetic */ ImageView f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                NativeAdRepository.this.lambda$getImageLoader$10$NativeAdRepository(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$getImageLoader$10$NativeAdRepository(Uri uri, ImageView imageView) {
        try {
            Threads.runOnUi(new Runnable(imageView, this.simpleHttpClient.readBitmap(uri.toString())) {
                public final /* synthetic */ ImageView f$0;
                public final /* synthetic */ Bitmap f$1;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                }

                public final void run() {
                    this.f$0.setImageBitmap(this.f$1);
                }
            });
        } catch (Exception e) {
            Logger logger2 = this.logger;
            LogDomain logDomain = LogDomain.NETWORK;
            logger2.error(logDomain, "Could not load image " + uri, e);
        }
    }

    public void startTimer(long j, Runnable runnable) {
        if (j == Long.MAX_VALUE) {
            this.logger.warning(LogDomain.NATIVE, "No TTL for ad!", new Object[0]);
        } else {
            Threads.scheduleDelayed(Long.valueOf(j), runnable);
        }
    }

    private NativeAdResponse wrapVastTag(NativeAdResponse nativeAdResponse) {
        return nativeAdResponse.buildUpon().mraidWrappedVast(this.vastTagConverter.convertVastRichmedia(nativeAdResponse.assets().vastTag())).build();
    }
}
