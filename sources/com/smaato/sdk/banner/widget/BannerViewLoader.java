package com.smaato.sdk.banner.widget;

import com.smaato.sdk.banner.csm.BannerCsmAdPresenter;
import com.smaato.sdk.banner.p377ad.BannerAdSize;
import com.smaato.sdk.banner.widget.BannerViewLoader;
import com.smaato.sdk.core.KeyValuePairs;
import com.smaato.sdk.core.SdkConfiguration;
import com.smaato.sdk.core.appbgdetection.AppBackgroundAwareHandler;
import com.smaato.sdk.core.appbgdetection.PauseUnpauseListener;
import com.smaato.sdk.core.flow.Action0;
import com.smaato.sdk.core.flow.Action1;
import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Function1;
import com.smaato.sdk.core.flow.Publisher;
import com.smaato.sdk.core.flow.Schedulers;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.NetworkStateMonitor;
import com.smaato.sdk.core.p378ad.AdFormat;
import com.smaato.sdk.core.p378ad.AdLoader;
import com.smaato.sdk.core.p378ad.AdLoaderException;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdRequest;
import com.smaato.sdk.core.p378ad.AdSettings;
import com.smaato.sdk.core.p378ad.AutoReloadPolicy;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.p378ad.SharedKeyValuePairsHolder;
import com.smaato.sdk.core.p378ad.UserInfo;
import com.smaato.sdk.core.repository.AdRepository;
import com.smaato.sdk.core.repository.AdRequestParams;
import com.smaato.sdk.core.repository.AdTypeStrategy;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Pair;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.memory.LeakProtection;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.core.util.p382fi.NullableSupplier;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

public final class BannerViewLoader {
    private final AtomicReference<Runnable> actionViewedRef = new AtomicReference<>();
    private AdFormat adFormat = AdFormat.DISPLAY;
    private BannerAdPresenter.Listener adPresenterListener;
    private final AppBackgroundAwareHandler appBackgroundAwareHandler;
    private final AutoReloadPolicy autoReloadPolicy;
    /* access modifiers changed from: private */
    public WeakReference<BannerView> bannerViewRef = new WeakReference<>((Object) null);
    private final BlockingUtils blockingUtils;
    /* access modifiers changed from: private */
    public final AtomicReference<Runnable> clickPendingActionRef = new AtomicReference<>();
    private NetworkStateMonitor.Callback connectionStateListener;
    private AdPresenter.Listener csmAdPresenterListener;
    /* access modifiers changed from: private */
    public final Schedulers executors;
    private final LeakProtection leakProtection;
    /* access modifiers changed from: private */
    public final Runnable loadAdAction = new Runnable() {
        public final void run() {
            BannerViewLoader.this.lambda$new$6$BannerViewLoader();
        }
    };
    /* access modifiers changed from: private */
    public LoadAdParams loadAdParams;
    private final Logger logger;
    private final NetworkStateMonitor networkStateMonitor;
    private Map<String, Object> objectExtras = new HashMap();
    private final Action1<Throwable> onError = new Action1() {
        public final void invoke(Object obj) {
            BannerViewLoader.this.lambda$new$5$BannerViewLoader((Throwable) obj);
        }
    };
    private final Action1<AdPresenter> onNext = new Action1() {
        public final void invoke(Object obj) {
            BannerViewLoader.this.lambda$new$3$BannerViewLoader((AdPresenter) obj);
        }
    };
    private WeakReference<AdPresenter> referenceToPresenter = new WeakReference<>((Object) null);
    private final AdRepository repository;
    private final SdkConfiguration sdkConfiguration;
    private final SharedKeyValuePairsHolder sharedKeyValuePairsHolder;

    public /* synthetic */ void lambda$new$3$BannerViewLoader(AdPresenter adPresenter) throws Throwable {
        if (adPresenter instanceof BannerAdPresenter) {
            Objects.onNotNull((AdPresenter) this.referenceToPresenter.get(), $$Lambda$LSD7uGamlg8DnWY8NYy91cOxow.INSTANCE);
            BannerAdPresenter bannerAdPresenter = (BannerAdPresenter) adPresenter;
            this.adPresenterListener = new BannerAdPresenterListenerImpl(this, (C109291) null);
            this.referenceToPresenter = new WeakReference<>(bannerAdPresenter);
            bannerAdPresenter.setListener(this.adPresenterListener);
            bannerAdPresenter.initialize();
            Objects.onNotNull((BannerView) this.bannerViewRef.get(), new Consumer() {
                public final void accept(Object obj) {
                    ((BannerView) obj).initWithAdPresenter(BannerAdPresenter.this);
                }
            });
            Objects.onNotNull((BannerView) this.bannerViewRef.get(), $$Lambda$OhRzpstR5Nv9SHzVAq9OCgWwVlE.INSTANCE);
        } else if (adPresenter instanceof BannerCsmAdPresenter) {
            Objects.onNotNull((AdPresenter) this.referenceToPresenter.get(), $$Lambda$LSD7uGamlg8DnWY8NYy91cOxow.INSTANCE);
            BannerCsmAdPresenter bannerCsmAdPresenter = (BannerCsmAdPresenter) adPresenter;
            this.csmAdPresenterListener = new CsmAdPresenterListenerImpl(this, (C109291) null);
            this.referenceToPresenter = new WeakReference<>(bannerCsmAdPresenter);
            bannerCsmAdPresenter.setBannerAdPresenterListener(this.csmAdPresenterListener);
            bannerCsmAdPresenter.initialize();
            Objects.onNotNull((BannerView) this.bannerViewRef.get(), new Consumer() {
                public final void accept(Object obj) {
                    ((BannerView) obj).initWithAdPresenter(BannerCsmAdPresenter.this);
                }
            });
            Objects.onNotNull((BannerView) this.bannerViewRef.get(), $$Lambda$OhRzpstR5Nv9SHzVAq9OCgWwVlE.INSTANCE);
        } else {
            Objects.onNotNull((BannerView) this.bannerViewRef.get(), $$Lambda$BannerViewLoader$0uyAnMbDcpj7pKF_IP8IRSXO60.INSTANCE);
        }
    }

    public /* synthetic */ void lambda$new$5$BannerViewLoader(Throwable th) throws Throwable {
        if (th instanceof AdLoaderException) {
            AdLoaderException adLoaderException = (AdLoaderException) th;
            AdLoader.Error errorType = adLoaderException.getErrorType();
            if (errorType == AdLoader.Error.CANCELLED) {
                logIgnored("Ignoring AdLoader adLoaderException: %s", adLoaderException);
                return;
            }
            Objects.onNotNull((BannerView) this.bannerViewRef.get(), new Consumer() {
                public final void accept(Object obj) {
                    ((BannerView) obj).onAdFailedToLoad(BannerError.this);
                }
            });
            scheduleRetryIfApplicable(errorType);
        }
    }

    public /* synthetic */ void lambda$new$6$BannerViewLoader() {
        loadAd(this.loadAdParams);
    }

    public BannerViewLoader(Logger logger2, AutoReloadPolicy autoReloadPolicy2, AppBackgroundAwareHandler appBackgroundAwareHandler2, SdkConfiguration sdkConfiguration2, NetworkStateMonitor networkStateMonitor2, LeakProtection leakProtection2, AdRepository adRepository, SharedKeyValuePairsHolder sharedKeyValuePairsHolder2, Schedulers schedulers, BlockingUtils blockingUtils2) {
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.autoReloadPolicy = (AutoReloadPolicy) Objects.requireNonNull(autoReloadPolicy2);
        this.appBackgroundAwareHandler = (AppBackgroundAwareHandler) Objects.requireNonNull(appBackgroundAwareHandler2);
        this.sdkConfiguration = (SdkConfiguration) Objects.requireNonNull(sdkConfiguration2);
        this.networkStateMonitor = (NetworkStateMonitor) Objects.requireNonNull(networkStateMonitor2);
        this.leakProtection = (LeakProtection) Objects.requireNonNull(leakProtection2);
        this.repository = (AdRepository) Objects.requireNonNull(adRepository);
        this.sharedKeyValuePairsHolder = (SharedKeyValuePairsHolder) Objects.requireNonNull(sharedKeyValuePairsHolder2);
        this.executors = (Schedulers) Objects.requireNonNull(schedulers);
        this.blockingUtils = (BlockingUtils) Objects.requireNonNull(blockingUtils2);
    }

    /* access modifiers changed from: package-private */
    public LoadAdParams getLoadAdParams() {
        return (LoadAdParams) getBlocking(new NullableSupplier() {
            public final Object get() {
                return BannerViewLoader.this.lambda$getLoadAdParams$7$BannerViewLoader();
            }
        });
    }

    public /* synthetic */ LoadAdParams lambda$getLoadAdParams$7$BannerViewLoader() {
        return this.loadAdParams;
    }

    /* access modifiers changed from: package-private */
    public void setView(BannerView bannerView) {
        Objects.requireNonNull(bannerView, "Parameter bannerView cannot be null for BannerViewLoader::setView");
        setViewFlow(bannerView).subscribeOn(this.executors.main()).subscribe();
    }

    private Flow<Void> setViewFlow(BannerView bannerView) {
        return Flow.fromAction(new Action0(bannerView) {
            public final /* synthetic */ BannerView f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke() {
                BannerViewLoader.this.lambda$setViewFlow$8$BannerViewLoader(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$setViewFlow$8$BannerViewLoader(BannerView bannerView) throws Throwable {
        this.bannerViewRef = new WeakReference<>(bannerView);
        this.leakProtection.listenToObject(bannerView, new Runnable() {
            public final void run() {
                BannerViewLoader.this.destroy();
            }
        });
    }

    public void setAdFormat(AdFormat adFormat2) {
        if (adFormat2 == AdFormat.DISPLAY || adFormat2 == AdFormat.VIDEO) {
            this.adFormat = adFormat2;
            return;
        }
        throw new IllegalArgumentException("Unsupported AdFormat: " + adFormat2);
    }

    /* access modifiers changed from: package-private */
    public void bannersWindowFocusChanged(boolean z) {
        bannersWindowFocusChangedFlow(z).subscribeOn(this.executors.main()).subscribe();
    }

    private Flow<Void> bannersWindowFocusChangedFlow(boolean z) {
        if (!z) {
            return Flow.empty();
        }
        AtomicReference<Runnable> atomicReference = this.clickPendingActionRef;
        java.util.Objects.requireNonNull(atomicReference);
        return Flow.maybe(new Callable(atomicReference) {
            public final /* synthetic */ AtomicReference f$0;

            {
                this.f$0 = r1;
            }

            public final Object call() {
                return (Runnable) this.f$0.get();
            }
        }).flatMap($$Lambda$BannerViewLoader$A6RDR7l9kWmavmSPKEDyOnNLnos.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void loadAd(LoadAdParams loadAdParams2) {
        Objects.requireNonNull(loadAdParams2);
        loadAdFlow(loadAdParams2).subscribeOn(this.executors.mo68934io()).observeOn(this.executors.main()).subscribe(this.onNext, (Action1<? super Throwable>) this.onError);
    }

    private Flow<AdPresenter> loadAdFlow(LoadAdParams loadAdParams2) {
        Objects.requireNonNull(loadAdParams2);
        return loadAdFlow(loadAdParams2, this.sharedKeyValuePairsHolder.getKeyValuePairs());
    }

    private Flow<AdPresenter> loadAdFlow(LoadAdParams loadAdParams2, KeyValuePairs keyValuePairs) {
        return buildAdSettings(loadAdParams2).doOnNext(new Action1(loadAdParams2) {
            public final /* synthetic */ BannerViewLoader.LoadAdParams f$1;

            {
                this.f$1 = r2;
            }

            public final void invoke(Object obj) {
                BannerViewLoader.this.lambda$loadAdFlow$9$BannerViewLoader(this.f$1, (AdSettings) obj);
            }
        }).flatMap(new Function1(keyValuePairs, loadAdParams2) {
            public final /* synthetic */ KeyValuePairs f$1;
            public final /* synthetic */ BannerViewLoader.LoadAdParams f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final Object apply(Object obj) {
                return BannerViewLoader.this.lambda$loadAdFlow$10$BannerViewLoader(this.f$1, this.f$2, (AdSettings) obj);
            }
        }).doOnNext(new Action1() {
            public final void invoke(Object obj) {
                BannerViewLoader.this.lambda$loadAdFlow$11$BannerViewLoader((AdRequest) obj);
            }
        }).map(new Function1() {
            public final Object apply(Object obj) {
                return Pair.m32964of((AdRequest) obj, new BannerAdTypeStrategy(((AdRequest) obj).getAdSettings().getPublisherId(), ((AdRequest) obj).getAdSettings().getAdSpaceId(), BannerViewLoader.LoadAdParams.this.bannerAdSize));
            }
        }).flatMap(new Function1() {
            public final Object apply(Object obj) {
                return BannerViewLoader.this.lambda$loadAdFlow$13$BannerViewLoader((Pair) obj);
            }
        });
    }

    public /* synthetic */ void lambda$loadAdFlow$9$BannerViewLoader(LoadAdParams loadAdParams2, AdSettings adSettings) throws Throwable {
        this.loadAdParams = loadAdParams2;
    }

    public /* synthetic */ Publisher lambda$loadAdFlow$10$BannerViewLoader(KeyValuePairs keyValuePairs, LoadAdParams loadAdParams2, AdSettings adSettings) throws Throwable {
        return buildAdRequest(adSettings, this.sdkConfiguration.getUserInfo(), keyValuePairs, loadAdParams2.adRequestParams);
    }

    public /* synthetic */ void lambda$loadAdFlow$11$BannerViewLoader(AdRequest adRequest) throws Throwable {
        disableAllTimersAndPendingActions();
    }

    public /* synthetic */ Publisher lambda$loadAdFlow$13$BannerViewLoader(Pair pair) throws Throwable {
        return this.repository.loadAd((AdTypeStrategy) Objects.requireNonNull((BannerAdTypeStrategy) pair.second()), (AdRequest) Objects.requireNonNull((AdRequest) pair.first()), this.objectExtras);
    }

    private Flow<AdSettings> buildAdSettings(LoadAdParams loadAdParams2) {
        return Flow.fromCallable(new Callable(loadAdParams2) {
            public final /* synthetic */ BannerViewLoader.LoadAdParams f$1;

            {
                this.f$1 = r2;
            }

            public final Object call() {
                return BannerViewLoader.this.lambda$buildAdSettings$14$BannerViewLoader(this.f$1);
            }
        }).doOnError(new Action1() {
            public final void invoke(Object obj) {
                BannerViewLoader.this.lambda$buildAdSettings$15$BannerViewLoader((Throwable) obj);
            }
        }).switchIfError($$Lambda$BannerViewLoader$EGelGyU7lbNmC7WIYTj6zHQfIiw.INSTANCE);
    }

    public /* synthetic */ AdSettings lambda$buildAdSettings$14$BannerViewLoader(LoadAdParams loadAdParams2) throws Exception {
        AdSettings.Builder adFormat2 = new AdSettings.Builder().setPublisherId(loadAdParams2.publisherId).setAdSpaceId(loadAdParams2.adSpaceId).setAdFormat(this.adFormat);
        BannerAdSize bannerAdSize = loadAdParams2.bannerAdSize;
        return adFormat2.setAdDimension(bannerAdSize != null ? bannerAdSize.adDimension : null).setMediationNetworkName(loadAdParams2.mediationNetworkName).setMediationNetworkSDKVersion(loadAdParams2.mediationNetworkSDKVersion).setMediationAdapterVersion(loadAdParams2.mediationAdapterVersion).build();
    }

    public /* synthetic */ void lambda$buildAdSettings$15$BannerViewLoader(Throwable th) throws Throwable {
        this.logger.error(LogDomain.WIDGET, th.getMessage(), th);
    }

    private Flow<AdRequest> buildAdRequest(AdSettings adSettings, UserInfo userInfo, KeyValuePairs keyValuePairs, AdRequestParams adRequestParams) {
        return Flow.fromCallable(new Callable(userInfo, keyValuePairs, adRequestParams) {
            public final /* synthetic */ UserInfo f$1;
            public final /* synthetic */ KeyValuePairs f$2;
            public final /* synthetic */ AdRequestParams f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final Object call() {
                return BannerViewLoader.lambda$buildAdRequest$17(AdSettings.this, this.f$1, this.f$2, this.f$3);
            }
        }).doOnError(new Action1() {
            public final void invoke(Object obj) {
                BannerViewLoader.this.lambda$buildAdRequest$18$BannerViewLoader((Throwable) obj);
            }
        }).switchIfError($$Lambda$BannerViewLoader$17Zx2PWwXwcAFrmNPRAUejLgI.INSTANCE);
    }

    static /* synthetic */ AdRequest lambda$buildAdRequest$17(AdSettings adSettings, UserInfo userInfo, KeyValuePairs keyValuePairs, AdRequestParams adRequestParams) throws Exception {
        String str;
        AdRequest.Builder keyValuePairs2 = new AdRequest.Builder().setAdSettings(adSettings).setUserInfo(userInfo).setKeyValuePairs(keyValuePairs);
        if (adRequestParams == null) {
            str = null;
        } else {
            str = adRequestParams.getUBUniqueId();
        }
        return keyValuePairs2.setUbUniqueId(str).build();
    }

    public /* synthetic */ void lambda$buildAdRequest$18$BannerViewLoader(Throwable th) throws Throwable {
        this.logger.error(LogDomain.WIDGET, th.getMessage(), th);
    }

    /* access modifiers changed from: package-private */
    public void setObjectExtras(Map<String, Object> map) {
        this.objectExtras = map;
    }

    private void disableAllTimersAndPendingActions() {
        this.clickPendingActionRef.set((Object) null);
        this.appBackgroundAwareHandler.stop();
        this.networkStateMonitor.removeCallback(this.connectionStateListener);
        this.connectionStateListener = null;
        disableAutoReload();
    }

    /* access modifiers changed from: private */
    public void startAutoReloadInterval(Runnable runnable) {
        this.actionViewedRef.set(runnable);
        this.autoReloadPolicy.startWithAction(runnable);
    }

    /* access modifiers changed from: package-private */
    public int getAutoReloadInterval() {
        return ((Integer) getBlocking(new NullableSupplier() {
            public final Object get() {
                return BannerViewLoader.this.lambda$getAutoReloadInterval$20$BannerViewLoader();
            }
        })).intValue();
    }

    public /* synthetic */ Integer lambda$getAutoReloadInterval$20$BannerViewLoader() {
        return Integer.valueOf(this.autoReloadPolicy.getAutoReloadInterval());
    }

    /* access modifiers changed from: package-private */
    public void setAutoReloadInterval(int i) {
        doBlocking(new Runnable(i) {
            public final /* synthetic */ int f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                BannerViewLoader.this.lambda$setAutoReloadInterval$21$BannerViewLoader(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$setAutoReloadInterval$21$BannerViewLoader(int i) {
        this.autoReloadPolicy.setAutoReloadInterval(i);
        this.autoReloadPolicy.startWithAction(this.actionViewedRef.get());
    }

    /* access modifiers changed from: package-private */
    public String getSessionId() {
        return (String) getBlocking(new NullableSupplier() {
            public final Object get() {
                return BannerViewLoader.this.lambda$getSessionId$22$BannerViewLoader();
            }
        });
    }

    public /* synthetic */ String lambda$getSessionId$22$BannerViewLoader() {
        AdPresenter adPresenter = (AdPresenter) this.referenceToPresenter.get();
        if (adPresenter == null) {
            return null;
        }
        return adPresenter.getSessionId();
    }

    /* access modifiers changed from: package-private */
    public String getCreativeId() {
        return (String) getBlocking(new NullableSupplier() {
            public final Object get() {
                return BannerViewLoader.this.lambda$getCreativeId$23$BannerViewLoader();
            }
        });
    }

    public /* synthetic */ String lambda$getCreativeId$23$BannerViewLoader() {
        AdPresenter adPresenter = (AdPresenter) this.referenceToPresenter.get();
        if (adPresenter == null) {
            return null;
        }
        return adPresenter.getCreativeId();
    }

    /* access modifiers changed from: private */
    public void disableAutoReload() {
        this.actionViewedRef.set((Object) null);
        this.autoReloadPolicy.stopTimer();
    }

    /* access modifiers changed from: package-private */
    public void destroy() {
        this.blockingUtils.doBlocking(new Runnable() {
            public final void run() {
                BannerViewLoader.this.lambda$destroy$24$BannerViewLoader();
            }
        });
    }

    public /* synthetic */ void lambda$destroy$24$BannerViewLoader() {
        disableAllTimersAndPendingActions();
        Objects.onNotNull((AdPresenter) this.referenceToPresenter.get(), $$Lambda$LSD7uGamlg8DnWY8NYy91cOxow.INSTANCE);
        this.referenceToPresenter.clear();
        this.bannerViewRef.clear();
    }

    /* access modifiers changed from: package-private */
    public void reportWrongContentSize(int i, int i2, int i3, int i4) {
        this.executors.main().execute(new Runnable(i, i2, i3, i4) {
            public final /* synthetic */ int f$1;
            public final /* synthetic */ int f$2;
            public final /* synthetic */ int f$3;
            public final /* synthetic */ int f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                BannerViewLoader.this.lambda$reportWrongContentSize$25$BannerViewLoader(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public /* synthetic */ void lambda$reportWrongContentSize$25$BannerViewLoader(int i, int i2, int i3, int i4) {
        this.logger.error(LogDomain.WIDGET, "Content size[%d x %d] is bigger than BannerView [%d x %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    /* renamed from: com.smaato.sdk.banner.widget.BannerViewLoader$1 */
    static /* synthetic */ class C109291 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.core.ad.AdLoader$Error[] r0 = com.smaato.sdk.core.p378ad.AdLoader.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error = r0
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.PRESENTER_BUILDER_GENERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.INVALID_RESPONSE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.NO_AD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.API     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.CREATIVE_RESOURCE_EXPIRED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.NETWORK     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.NO_CONNECTION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.BAD_REQUEST     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.CONFIGURATION_ERROR     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.INTERNAL     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.TTL_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x009c }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.CACHE_LIMIT_REACHED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.smaato.sdk.core.ad.AdLoader$Error r1 = com.smaato.sdk.core.p378ad.AdLoader.Error.NO_MANDATORY_CACHE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.banner.widget.BannerViewLoader.C109291.<clinit>():void");
        }
    }

    private void scheduleRetryIfApplicable(AdLoader.Error error) {
        switch (C109291.$SwitchMap$com$smaato$sdk$core$ad$AdLoader$Error[error.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                startAutoReloadInterval(this.loadAdAction);
                return;
            case 6:
            case 7:
                if (this.networkStateMonitor.isOnline()) {
                    this.appBackgroundAwareHandler.postDelayed("Auto-retry", this.loadAdAction, 30000, (PauseUnpauseListener) null);
                    return;
                }
                $$Lambda$BannerViewLoader$cy3HNm50cvONKijAVAFUZB2cCpA r7 = new NetworkStateMonitor.Callback() {
                    public final void onNetworkStateChanged(boolean z) {
                        BannerViewLoader.this.lambda$scheduleRetryIfApplicable$26$BannerViewLoader(z);
                    }
                };
                this.connectionStateListener = r7;
                this.networkStateMonitor.addCallback(r7);
                return;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return;
            default:
                this.logger.warning(LogDomain.WIDGET, "unexpected errorType %s", error);
                return;
        }
    }

    public /* synthetic */ void lambda$scheduleRetryIfApplicable$26$BannerViewLoader(boolean z) {
        if (z) {
            loadAd(this.loadAdParams);
        }
    }

    /* access modifiers changed from: package-private */
    public KeyValuePairs getKeyValuePairs() {
        return this.sharedKeyValuePairsHolder.getKeyValuePairs();
    }

    /* access modifiers changed from: package-private */
    public void setKeyValuePairs(KeyValuePairs keyValuePairs) {
        this.sharedKeyValuePairsHolder.setKeyValuePairs(keyValuePairs);
    }

    /* access modifiers changed from: private */
    public void handleOnAdImpressed() {
        this.executors.main().execute(new Runnable() {
            public final void run() {
                BannerViewLoader.this.lambda$handleOnAdImpressed$27$BannerViewLoader();
            }
        });
    }

    public /* synthetic */ void lambda$handleOnAdImpressed$27$BannerViewLoader() {
        Objects.onNotNull((BannerView) this.bannerViewRef.get(), $$Lambda$XFQcyfZ2EdIFQuv_qaYqM1VpUbc.INSTANCE);
        startAutoReloadInterval(this.loadAdAction);
    }

    /* access modifiers changed from: private */
    public void handleOnAdClicked() {
        this.executors.main().execute(new Runnable() {
            public final void run() {
                BannerViewLoader.this.lambda$handleOnAdClicked$28$BannerViewLoader();
            }
        });
    }

    public /* synthetic */ void lambda$handleOnAdClicked$28$BannerViewLoader() {
        Objects.onNotNull((BannerView) this.bannerViewRef.get(), $$Lambda$7Qo5ui89BFFbGbXAmBhrhBMmy8.INSTANCE);
        if (this.autoReloadPolicy.isAutoReloadEnabled()) {
            this.clickPendingActionRef.set(this.loadAdAction);
            disableAutoReload();
        }
    }

    /* access modifiers changed from: private */
    public void handleOnAdError(AdPresenter adPresenter) {
        this.executors.main().execute(new Runnable(adPresenter) {
            public final /* synthetic */ AdPresenter f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                BannerViewLoader.this.lambda$handleOnAdError$30$BannerViewLoader(this.f$1);
            }
        });
    }

    public /* synthetic */ void lambda$handleOnAdError$30$BannerViewLoader(AdPresenter adPresenter) {
        Objects.onNotNull((AdPresenter) this.referenceToPresenter.get(), new Consumer(adPresenter) {
            public final /* synthetic */ AdPresenter f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                BannerViewLoader.this.lambda$handleOnAdError$29$BannerViewLoader(this.f$1, (AdPresenter) obj);
            }
        });
    }

    public /* synthetic */ void lambda$handleOnAdError$29$BannerViewLoader(AdPresenter adPresenter, AdPresenter adPresenter2) {
        if (adPresenter2 == adPresenter) {
            Objects.onNotNull(this.loadAdParams, new Consumer() {
                public final void accept(Object obj) {
                    BannerViewLoader.this.loadAd((BannerViewLoader.LoadAdParams) obj);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void handleOnTtlExpired() {
        this.executors.main().execute(new Runnable() {
            public final void run() {
                BannerViewLoader.this.lambda$handleOnTtlExpired$32$BannerViewLoader();
            }
        });
    }

    public /* synthetic */ void lambda$handleOnTtlExpired$32$BannerViewLoader() {
        Objects.onNotNull((AdPresenter) this.referenceToPresenter.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerViewLoader.this.lambda$handleOnTtlExpired$31$BannerViewLoader((AdPresenter) obj);
            }
        });
    }

    public /* synthetic */ void lambda$handleOnTtlExpired$31$BannerViewLoader(AdPresenter adPresenter) {
        Objects.onNotNull((BannerView) this.bannerViewRef.get(), $$Lambda$0xMBnFW4RzxmcdIhwy1p7e3tLi0.INSTANCE);
    }

    private void logIgnored(String str, Throwable th) {
        this.logger.info(LogDomain.WIDGET, "Ignoring AdLoader adLoaderException: %s", th);
    }

    private <T> T getBlocking(NullableSupplier<T> nullableSupplier) {
        return this.blockingUtils.getBlocking(nullableSupplier);
    }

    private boolean doBlocking(Runnable runnable) {
        return this.blockingUtils.doBlocking(runnable);
    }

    static final class LoadAdParams {
        final AdRequestParams adRequestParams;
        final String adSpaceId;
        final BannerAdSize bannerAdSize;
        final String mediationAdapterVersion;
        final String mediationNetworkName;
        final String mediationNetworkSDKVersion;
        final String publisherId;

        LoadAdParams(AdRequestParams adRequestParams2, String str, String str2, BannerAdSize bannerAdSize2, String str3, String str4, String str5) {
            this.publisherId = str;
            this.adSpaceId = str2;
            this.bannerAdSize = bannerAdSize2;
            this.mediationNetworkName = str3;
            this.mediationNetworkSDKVersion = str4;
            this.mediationAdapterVersion = str5;
            this.adRequestParams = adRequestParams2;
        }
    }

    private class BannerAdPresenterListenerImpl implements BannerAdPresenter.Listener {
        private BannerAdPresenterListenerImpl() {
        }

        /* synthetic */ BannerAdPresenterListenerImpl(BannerViewLoader bannerViewLoader, C109291 r2) {
            this();
        }

        public void onAdImpressed(BannerAdPresenter bannerAdPresenter) {
            BannerViewLoader.this.handleOnAdImpressed();
        }

        public void onAdClicked(BannerAdPresenter bannerAdPresenter) {
            BannerViewLoader.this.handleOnAdClicked();
        }

        public void onAdError(BannerAdPresenter bannerAdPresenter) {
            BannerViewLoader.this.handleOnAdError(bannerAdPresenter);
        }

        public void onTTLExpired(BannerAdPresenter bannerAdPresenter) {
            BannerViewLoader.this.handleOnTtlExpired();
        }

        public void onAdExpanded(BannerAdPresenter bannerAdPresenter) {
            BannerViewLoader.this.executors.main().execute(new Runnable() {
                public final void run() {
                    BannerViewLoader.this.disableAutoReload();
                }
            });
        }

        public void onAdUnload(BannerAdPresenter bannerAdPresenter) {
            if (TextUtils.isEmpty(BannerViewLoader.this.loadAdParams == null ? null : BannerViewLoader.this.loadAdParams.mediationNetworkName)) {
                onAdError(bannerAdPresenter);
            } else {
                BannerViewLoader.this.executors.main().execute(new Runnable() {
                    public final void run() {
                        BannerViewLoader.BannerAdPresenterListenerImpl.this.mo68234xc17766e5();
                    }
                });
            }
        }

        /* renamed from: lambda$onAdUnload$2$BannerViewLoader$BannerAdPresenterListenerImpl */
        public /* synthetic */ void mo68234xc17766e5() {
            Objects.onNotNull((BannerView) BannerViewLoader.this.bannerViewRef.get(), C10926x951d2ac3.INSTANCE);
        }

        public void onAdClosed() {
            BannerViewLoader bannerViewLoader = BannerViewLoader.this;
            bannerViewLoader.startAutoReloadInterval(bannerViewLoader.loadAdAction);
        }

        public void onAdResized() {
            BannerViewLoader.this.executors.main().execute(new Runnable() {
                public final void run() {
                    BannerViewLoader.BannerAdPresenterListenerImpl.this.mo68233x84c14611();
                }
            });
        }

        /* renamed from: lambda$onAdResized$3$BannerViewLoader$BannerAdPresenterListenerImpl */
        public /* synthetic */ void mo68233x84c14611() {
            BannerViewLoader.this.clickPendingActionRef.set((Object) null);
            BannerViewLoader.this.disableAutoReload();
        }
    }

    private class CsmAdPresenterListenerImpl implements AdPresenter.Listener {
        private CsmAdPresenterListenerImpl() {
        }

        /* synthetic */ CsmAdPresenterListenerImpl(BannerViewLoader bannerViewLoader, C109291 r2) {
            this();
        }

        public void onAdImpressed(AdPresenter adPresenter) {
            BannerViewLoader.this.handleOnAdImpressed();
        }

        public void onAdClicked(AdPresenter adPresenter) {
            BannerViewLoader.this.handleOnAdClicked();
        }

        public void onAdError(AdPresenter adPresenter) {
            BannerViewLoader.this.handleOnAdError(adPresenter);
        }

        public void onTTLExpired(AdPresenter adPresenter) {
            BannerViewLoader.this.handleOnTtlExpired();
        }
    }
}
