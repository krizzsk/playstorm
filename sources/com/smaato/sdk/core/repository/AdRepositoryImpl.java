package com.smaato.sdk.core.repository;

import com.smaato.sdk.core.UbErrorReporting;
import com.smaato.sdk.core.api.ApiAdResponse;
import com.smaato.sdk.core.api.ExpirationTimestampFactory;
import com.smaato.sdk.core.flow.Action1;
import com.smaato.sdk.core.flow.Emitter;
import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Schedulers;
import com.smaato.sdk.core.gdpr.PiiParam;
import com.smaato.sdk.core.gdpr.SomaGdprDataSource;
import com.smaato.sdk.core.lgpd.SomaLgpdDataSource;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.p378ad.AdLoaderException;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdRequest;
import com.smaato.sdk.core.p380ub.AdMarkup;
import com.smaato.sdk.core.p380ub.UbCache;
import com.smaato.sdk.core.p380ub.UbId;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.Supplier;
import java.util.Map;

final class AdRepositoryImpl implements AdRepository {
    private Supplier<AdLoader> adLoaderSupplier;
    private final Schedulers executors;
    private final ExpirationTimestampFactory expirationTimestampFactory;
    private final AdLoadersRegistry loadersRegistry;
    private final Logger logger;
    private final SomaGdprDataSource somaGdprDataSource;
    private final SomaLgpdDataSource somaLgpdDataSource;
    private final UbCache ubCache;
    private final UbErrorReporting ubErrorReporting;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.smaato.sdk.core.util.fi.Supplier<com.smaato.sdk.core.ad.AdLoader>, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    AdRepositoryImpl(com.smaato.sdk.core.log.Logger r1, com.smaato.sdk.core.p380ub.UbCache r2, com.smaato.sdk.core.repository.AdLoadersRegistry r3, com.smaato.sdk.core.util.p382fi.Supplier<com.smaato.sdk.core.p378ad.AdLoader> r4, com.smaato.sdk.core.flow.Schedulers r5, com.smaato.sdk.core.gdpr.SomaGdprDataSource r6, com.smaato.sdk.core.lgpd.SomaLgpdDataSource r7, com.smaato.sdk.core.UbErrorReporting r8, com.smaato.sdk.core.api.ExpirationTimestampFactory r9) {
        /*
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r1)
            com.smaato.sdk.core.log.Logger r1 = (com.smaato.sdk.core.log.Logger) r1
            r0.logger = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r2)
            com.smaato.sdk.core.ub.UbCache r1 = (com.smaato.sdk.core.p380ub.UbCache) r1
            r0.ubCache = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r3)
            com.smaato.sdk.core.repository.AdLoadersRegistry r1 = (com.smaato.sdk.core.repository.AdLoadersRegistry) r1
            r0.loadersRegistry = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r4)
            com.smaato.sdk.core.util.fi.Supplier r1 = (com.smaato.sdk.core.util.p382fi.Supplier) r1
            r0.adLoaderSupplier = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r5)
            com.smaato.sdk.core.flow.Schedulers r1 = (com.smaato.sdk.core.flow.Schedulers) r1
            r0.executors = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r6)
            com.smaato.sdk.core.gdpr.SomaGdprDataSource r1 = (com.smaato.sdk.core.gdpr.SomaGdprDataSource) r1
            r0.somaGdprDataSource = r1
            java.lang.Object r1 = com.smaato.sdk.core.util.Objects.requireNonNull(r7)
            com.smaato.sdk.core.lgpd.SomaLgpdDataSource r1 = (com.smaato.sdk.core.lgpd.SomaLgpdDataSource) r1
            r0.somaLgpdDataSource = r1
            r0.ubErrorReporting = r8
            r0.expirationTimestampFactory = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.repository.AdRepositoryImpl.<init>(com.smaato.sdk.core.log.Logger, com.smaato.sdk.core.ub.UbCache, com.smaato.sdk.core.repository.AdLoadersRegistry, com.smaato.sdk.core.util.fi.Supplier, com.smaato.sdk.core.flow.Schedulers, com.smaato.sdk.core.gdpr.SomaGdprDataSource, com.smaato.sdk.core.lgpd.SomaLgpdDataSource, com.smaato.sdk.core.UbErrorReporting, com.smaato.sdk.core.api.ExpirationTimestampFactory):void");
    }

    public void loadAd(AdTypeStrategy adTypeStrategy, AdRequest adRequest, AdRepository.Listener listener, Map<String, Object> map) {
        Objects.requireNonNull(listener);
        loadAd(adTypeStrategy, adRequest, map).subscribe(new Action1(adTypeStrategy) {
            public final /* synthetic */ AdTypeStrategy f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                AdRepository.Listener.this.onAdLoadSuccess(this.f$1, (AdPresenter) obj);
            }
        }, (Action1<? super Throwable>) new Action1(adTypeStrategy) {
            public final /* synthetic */ AdTypeStrategy f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                AdRepository.Listener.this.onAdLoadError(this.f$1, (AdLoaderException) ((Throwable) obj));
            }
        });
    }

    public Flow<AdPresenter> loadAd(AdTypeStrategy adTypeStrategy, AdRequest adRequest, Map<String, Object> map) {
        Objects.requireNonNull(adRequest);
        Objects.requireNonNull(adTypeStrategy);
        if (!this.somaGdprDataSource.getSomaGdprData().isUsageAllowedFor(PiiParam.LOAD_ADS)) {
            return Flow.error((Throwable) new AdLoaderException(AdLoader.Error.NO_AD, new RuntimeException("GDPR permissions do not allow ad loading!")));
        }
        return loadAdFlow(adTypeStrategy, adRequest, map).doOnError(new Action1() {
            public final void invoke(Object obj) {
                AdRepositoryImpl.this.lambda$loadAd$2$AdRepositoryImpl((Throwable) obj);
            }
        }).subscribeOn(this.executors.mo68934io()).observeOn(this.executors.main());
    }

    public /* synthetic */ void lambda$loadAd$2$AdRepositoryImpl(Throwable th) throws Throwable {
        this.logger.error(LogDomain.CORE, th.getMessage(), new Object[0]);
    }

    private Flow<AdPresenter> loadAdFlow(AdTypeStrategy adTypeStrategy, AdRequest adRequest, Map<String, Object> map) {
        UbId create = UbId.create(adRequest.getAdSettings().getAdSpaceId(), adRequest.getUbUniqueId());
        if (create != null) {
            return ubPipeline(adTypeStrategy, adRequest, create);
        }
        return waterfallPipeline(adTypeStrategy, adRequest, map);
    }

    private Flow<AdPresenter> ubPipeline(AdTypeStrategy adTypeStrategy, AdRequest adRequest, UbId ubId) {
        return Flow.create(new Action1(ubId, adRequest, adTypeStrategy) {
            public final /* synthetic */ UbId f$1;
            public final /* synthetic */ AdRequest f$2;
            public final /* synthetic */ AdTypeStrategy f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void invoke(Object obj) {
                AdRepositoryImpl.this.lambda$ubPipeline$5$AdRepositoryImpl(this.f$1, this.f$2, this.f$3, (Emitter) obj);
            }
        });
    }

    public /* synthetic */ void lambda$ubPipeline$5$AdRepositoryImpl(UbId ubId, AdRequest adRequest, AdTypeStrategy adTypeStrategy, Emitter emitter) throws Throwable {
        AdMarkup adMarkup = this.ubCache.get(ubId);
        if (adMarkup != null) {
            ApiAdResponse build = ApiAdResponse.builder().adFormat(createAdFormat(adMarkup.adFormat())).body(adMarkup.markup().getBytes()).expiration(adMarkup.expiresAt()).sessionId(adMarkup.sessionId()).impressionCountingType(adMarkup.impressionCountingType()).build();
            if (!build.getExpiration().isExpired()) {
                AdLoader adLoader = this.adLoaderSupplier.get();
                adLoader.setListener(new AdLoaderListener(emitter, this.loadersRegistry, adTypeStrategy));
                adLoader.buildAdPresenter(adTypeStrategy, adRequest, build);
                return;
            }
            AdLoaderException adLoaderException = new AdLoaderException(AdLoader.Error.TTL_EXPIRED, new UbCacheException("Cached UB Ad Response has been already expired."));
            Objects.onNotNull(this.ubErrorReporting, new Consumer(UbErrorReporting.Param.builder().setAdSpaceId(adRequest.getAdSettings().getAdSpaceId()).setPublisherId(adRequest.getAdSettings().getPublisherId()).setAdFormat(build.getAdFormat()).setCreativeId(build.getCreativeId()).setSessionId(build.getSessionId()).build()) {
                public final /* synthetic */ UbErrorReporting.Param f$1;

                {
                    this.f$1 = r2;
                }

                public final void accept(Object obj) {
                    ((UbErrorReporting) obj).report(AdLoaderException.this.getErrorType(), this.f$1);
                }
            });
            throw adLoaderException;
        }
        AdLoaderException adLoaderException2 = new AdLoaderException(AdLoader.Error.NO_AD, new UbCacheException("Cached Ad Response is not found."));
        Objects.onNotNull(this.ubErrorReporting, new Consumer(UbErrorReporting.Param.builder().setAdSpaceId(adRequest.getAdSettings().getAdSpaceId()).setPublisherId(adRequest.getAdSettings().getPublisherId()).build()) {
            public final /* synthetic */ UbErrorReporting.Param f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((UbErrorReporting) obj).report(AdLoaderException.this.getErrorType(), this.f$1);
            }
        });
        throw adLoaderException2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.smaato.sdk.core.p378ad.AdFormat createAdFormat(java.lang.String r5) {
        /*
            r4 = this;
            r5.hashCode()
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1968751561: goto L_0x002f;
                case 73635: goto L_0x0024;
                case 82650203: goto L_0x0019;
                case 1173835880: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x003a
        L_0x000e:
            java.lang.String r0 = "Richmedia"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0017
            goto L_0x003a
        L_0x0017:
            r0 = r1
            goto L_0x003b
        L_0x0019:
            java.lang.String r0 = "Video"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0022
            goto L_0x003a
        L_0x0022:
            r0 = r2
            goto L_0x003b
        L_0x0024:
            java.lang.String r0 = "Img"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x002d
            goto L_0x003a
        L_0x002d:
            r0 = r3
            goto L_0x003b
        L_0x002f:
            java.lang.String r0 = "Native"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r0 = 0
            goto L_0x003b
        L_0x003a:
            r0 = -1
        L_0x003b:
            if (r0 == 0) goto L_0x0051
            if (r0 == r3) goto L_0x004e
            if (r0 == r2) goto L_0x004b
            if (r0 == r1) goto L_0x0048
            com.smaato.sdk.core.ad.AdFormat r5 = com.smaato.sdk.core.p378ad.AdFormat.valueOf(r5)
            return r5
        L_0x0048:
            com.smaato.sdk.core.ad.AdFormat r5 = com.smaato.sdk.core.p378ad.AdFormat.RICH_MEDIA
            return r5
        L_0x004b:
            com.smaato.sdk.core.ad.AdFormat r5 = com.smaato.sdk.core.p378ad.AdFormat.VIDEO
            return r5
        L_0x004e:
            com.smaato.sdk.core.ad.AdFormat r5 = com.smaato.sdk.core.p378ad.AdFormat.STATIC_IMAGE
            return r5
        L_0x0051:
            com.smaato.sdk.core.ad.AdFormat r5 = com.smaato.sdk.core.p378ad.AdFormat.NATIVE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.core.repository.AdRepositoryImpl.createAdFormat(java.lang.String):com.smaato.sdk.core.ad.AdFormat");
    }

    private Flow<AdPresenter> waterfallPipeline(AdTypeStrategy adTypeStrategy, AdRequest adRequest, Map<String, Object> map) {
        return loadAdFromNetwork(adTypeStrategy, adRequest, map);
    }

    private Flow<AdPresenter> loadAdFromNetwork(AdTypeStrategy adTypeStrategy, AdRequest adRequest, Map<String, Object> map) {
        return Flow.create(new Action1(adTypeStrategy, map, adRequest) {
            public final /* synthetic */ AdTypeStrategy f$1;
            public final /* synthetic */ Map f$2;
            public final /* synthetic */ AdRequest f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void invoke(Object obj) {
                AdRepositoryImpl.this.lambda$loadAdFromNetwork$6$AdRepositoryImpl(this.f$1, this.f$2, this.f$3, (Emitter) obj);
            }
        });
    }

    public /* synthetic */ void lambda$loadAdFromNetwork$6$AdRepositoryImpl(AdTypeStrategy adTypeStrategy, Map map, AdRequest adRequest, Emitter emitter) throws Throwable {
        String uniqueKey = adTypeStrategy.getUniqueKey();
        if (this.loadersRegistry.remainingCapacity(uniqueKey) <= 0) {
            this.logger.info(LogDomain.CORE, "Ad loading request for provided publisherId and adSpaceId was already in progress", new Object[0]);
            emitter.onComplete();
            return;
        }
        AdLoader adLoader = this.adLoaderSupplier.get();
        adLoader.setListener(new AdLoaderListener(emitter, this.loadersRegistry, adTypeStrategy));
        adLoader.setObjectExtras(map);
        this.loadersRegistry.register(uniqueKey, adLoader);
        adLoader.requestAd(adRequest, adTypeStrategy);
    }

    private static class AdLoaderListener implements AdLoader.Listener {
        private final Emitter<? super AdPresenter> emitter;
        private final AdLoadersRegistry loadersRegistry;
        private final AdTypeStrategy strategy;

        AdLoaderListener(Emitter<? super AdPresenter> emitter2, AdLoadersRegistry adLoadersRegistry, AdTypeStrategy adTypeStrategy) {
            this.emitter = emitter2;
            this.loadersRegistry = adLoadersRegistry;
            this.strategy = adTypeStrategy;
        }

        public void onAdLoadSuccess(AdLoader adLoader, AdPresenter adPresenter) {
            this.loadersRegistry.unregister(this.strategy.getUniqueKey(), adLoader);
            this.emitter.onNext(adPresenter);
            this.emitter.onComplete();
        }

        public void onAdLoadError(AdLoader adLoader, AdLoaderException adLoaderException) {
            this.loadersRegistry.unregister(this.strategy.getUniqueKey(), adLoader);
            this.emitter.onError(adLoaderException);
        }
    }

    private static final class UbCacheException extends Exception {
        UbCacheException(String str) {
            super(str);
        }
    }
}
