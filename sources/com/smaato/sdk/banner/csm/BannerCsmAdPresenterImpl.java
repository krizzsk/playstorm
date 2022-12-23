package com.smaato.sdk.banner.csm;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.banner.csm.BannerCsmAdPresenterImpl;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.csm.CsmAdContentView;
import com.smaato.sdk.core.csm.CsmAdInteractor;
import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.csm.CsmAdPresenter;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdInteractor;
import com.smaato.sdk.core.p378ad.AdPresenter;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BaseAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.tracker.VisibilityTracker;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.tracker.VisibilityTrackerListener;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class BannerCsmAdPresenterImpl extends BaseAdPresenter implements BannerCsmAdPresenter {
    /* access modifiers changed from: private */
    public final CsmAdInteractor adInteractor;
    /* access modifiers changed from: private */
    public CsmAdPresenter.Listener adLoadedListener;
    private final SMABannerNetworkEvent bannerNetworkEvent;
    private final SMABannerNetworkEventListener bannerNetworkEventListener = new SMABannerNetworkEventListener() {
        public void onAdLoaded(View view) {
            WeakReference unused = BannerCsmAdPresenterImpl.this.csmAdViewReference = new WeakReference(view);
            Objects.onNotNull(BannerCsmAdPresenterImpl.this.adLoadedListener, new Consumer() {
                public final void accept(Object obj) {
                    BannerCsmAdPresenterImpl.C109191.this.lambda$onAdLoaded$0$BannerCsmAdPresenterImpl$1((CsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdLoaded$0$BannerCsmAdPresenterImpl$1(CsmAdPresenter.Listener listener) {
            listener.onAdLoaded(BannerCsmAdPresenterImpl.this);
        }

        public void onAdFailedToLoad() {
            Objects.onNotNull(BannerCsmAdPresenterImpl.this.adLoadedListener, new Consumer() {
                public final void accept(Object obj) {
                    BannerCsmAdPresenterImpl.C109191.this.lambda$onAdFailedToLoad$1$BannerCsmAdPresenterImpl$1((CsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdFailedToLoad$1$BannerCsmAdPresenterImpl$1(CsmAdPresenter.Listener listener) {
            listener.onAdFailedToLoad(BannerCsmAdPresenterImpl.this);
        }

        public void onAdClicked() {
            BannerCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
        }

        public void onAdTTLExpired() {
            BannerCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.EXPIRE_TTL);
            Objects.onNotNull(BannerCsmAdPresenterImpl.this.bannerViewLoaderListener, new Consumer() {
                public final void accept(Object obj) {
                    BannerCsmAdPresenterImpl.C109191.this.lambda$onAdTTLExpired$2$BannerCsmAdPresenterImpl$1((AdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdTTLExpired$2$BannerCsmAdPresenterImpl$1(AdPresenter.Listener listener) {
            listener.onTTLExpired(BannerCsmAdPresenterImpl.this);
        }
    };
    /* access modifiers changed from: private */
    public AdPresenter.Listener<BannerCsmAdPresenter> bannerViewLoaderListener;
    private WeakReference<CsmAdContentView> contentViewReference = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public WeakReference<View> csmAdViewReference = new WeakReference<>((Object) null);
    private final Logger logger;
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    private AdInteractor.TtlListener ttlListener = new AdInteractor.TtlListener() {
        public final void onTTLExpired(AdInteractor adInteractor) {
            BannerCsmAdPresenterImpl.this.lambda$new$1$BannerCsmAdPresenterImpl(adInteractor);
        }
    };
    private final VisibilityTrackerCreator visibilityTrackerCreator;
    /* access modifiers changed from: private */
    public WeakReference<VisibilityTracker> visibilityTrackerReference = new WeakReference<>((Object) null);

    public /* synthetic */ void lambda$new$0$BannerCsmAdPresenterImpl(AdPresenter.Listener listener) {
        listener.onTTLExpired(this);
    }

    public /* synthetic */ void lambda$new$1$BannerCsmAdPresenterImpl(AdInteractor adInteractor2) {
        Objects.onNotNull(this.bannerViewLoaderListener, new Consumer() {
            public final void accept(Object obj) {
                BannerCsmAdPresenterImpl.this.lambda$new$0$BannerCsmAdPresenterImpl((AdPresenter.Listener) obj);
            }
        });
    }

    BannerCsmAdPresenterImpl(CsmAdInteractor csmAdInteractor, VisibilityTrackerCreator visibilityTrackerCreator2, Logger logger2, SMABannerNetworkEvent sMABannerNetworkEvent) {
        super(csmAdInteractor);
        this.adInteractor = (CsmAdInteractor) Objects.requireNonNull(csmAdInteractor);
        this.visibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator2);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.bannerNetworkEvent = sMABannerNetworkEvent;
        this.stateListener = new StateMachine.Listener(csmAdInteractor, logger2) {
            public final /* synthetic */ CsmAdInteractor f$1;
            public final /* synthetic */ Logger f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                BannerCsmAdPresenterImpl.this.lambda$new$3$BannerCsmAdPresenterImpl(this.f$1, this.f$2, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        csmAdInteractor.addTtlListener(this.ttlListener);
        csmAdInteractor.addStateListener(this.stateListener);
        csmAdInteractor.setOnImpressionTriggered(new CsmAdInteractor.Callback() {
            public final void onImpressionTriggered() {
                BannerCsmAdPresenterImpl.this.lambda$new$5$BannerCsmAdPresenterImpl();
            }
        });
    }

    /* renamed from: com.smaato.sdk.banner.csm.BannerCsmAdPresenterImpl$4 */
    static /* synthetic */ class C109224 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.core.ad.AdStateMachine$State[] r0 = com.smaato.sdk.core.p378ad.AdStateMachine.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State = r0
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.INIT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.CLICKED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.TO_BE_DELETED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.banner.csm.BannerCsmAdPresenterImpl.C109224.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$3$BannerCsmAdPresenterImpl(CsmAdInteractor csmAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C109224.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Objects.onNotNull(this.bannerViewLoaderListener, new Consumer() {
                    public final void accept(Object obj) {
                        BannerCsmAdPresenterImpl.this.lambda$new$2$BannerCsmAdPresenterImpl((AdPresenter.Listener) obj);
                    }
                });
                return;
            case 7:
                csmAdInteractor.removeStateListener(this.stateListener);
                return;
            default:
                logger2.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public /* synthetic */ void lambda$new$2$BannerCsmAdPresenterImpl(AdPresenter.Listener listener) {
        listener.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$4$BannerCsmAdPresenterImpl(AdPresenter.Listener listener) {
        listener.onAdImpressed(this);
    }

    public /* synthetic */ void lambda$new$5$BannerCsmAdPresenterImpl() {
        Objects.onNotNull(this.bannerViewLoaderListener, new Consumer() {
            public final void accept(Object obj) {
                BannerCsmAdPresenterImpl.this.lambda$new$4$BannerCsmAdPresenterImpl((AdPresenter.Listener) obj);
            }
        });
    }

    public void requestAd(Context context, Map<String, String> map, Map<String, Object> map2) {
        if (this.bannerNetworkEvent == null) {
            this.logger.error(LogDomain.AD, String.format("Could not find CustomEvent class with networkName: %s", new Object[]{((CsmAdObject) this.adInteractor.getAdObject()).getNetwork().getName()}), new Object[0]);
            Objects.onNotNull(this.adLoadedListener, new Consumer() {
                public final void accept(Object obj) {
                    BannerCsmAdPresenterImpl.this.lambda$requestAd$6$BannerCsmAdPresenterImpl((CsmAdPresenter.Listener) obj);
                }
            });
            return;
        }
        Threads.runOnUi(new Runnable(context, map, map2) {
            public final /* synthetic */ Context f$1;
            public final /* synthetic */ Map f$2;
            public final /* synthetic */ Map f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                BannerCsmAdPresenterImpl.this.lambda$requestAd$7$BannerCsmAdPresenterImpl(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public /* synthetic */ void lambda$requestAd$6$BannerCsmAdPresenterImpl(CsmAdPresenter.Listener listener) {
        listener.onAdFailedToLoad(this);
    }

    public /* synthetic */ void lambda$requestAd$7$BannerCsmAdPresenterImpl(Context context, Map map, Map map2) {
        this.bannerNetworkEvent.requestBanner(context, this.bannerNetworkEventListener, map, map2);
    }

    public void setAdLoadedListener(CsmAdPresenter.Listener listener) {
        this.adLoadedListener = listener;
    }

    public void initialize() {
        this.adInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    public void setBannerAdPresenterListener(AdPresenter.Listener<BannerCsmAdPresenter> listener) {
        this.bannerViewLoaderListener = listener;
    }

    public AdContentView getAdContentView(Context context) {
        CsmAdContentView csmAdContentView = new CsmAdContentView(context);
        if (this.csmAdViewReference.get() == null) {
            this.logger.error(LogDomain.AD, "An error occurred while showing the ad, 3rd party ad network view is null.", new Object[0]);
        } else {
            csmAdContentView.addView((View) this.csmAdViewReference.get());
        }
        csmAdContentView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                BannerCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            }

            public void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
            }
        });
        this.visibilityTrackerReference = new WeakReference<>(this.visibilityTrackerCreator.createTracker(csmAdContentView, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                BannerCsmAdPresenterImpl.this.lambda$getAdContentView$8$BannerCsmAdPresenterImpl();
            }
        }, this.adInteractor.getAdObject() != null ? ((CsmAdObject) this.adInteractor.getAdObject()).getImpressionCountingType() : ImpressionCountingType.STANDARD));
        this.contentViewReference = new WeakReference<>(csmAdContentView);
        return csmAdContentView;
    }

    public /* synthetic */ void lambda$getAdContentView$8$BannerCsmAdPresenterImpl() {
        this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
    }

    public boolean isValid() {
        return this.adInteractor.isValid() && this.csmAdViewReference.get() != null;
    }

    public void onDestroy() {
        Threads.ensureMainThread();
        Objects.onNotNull((VisibilityTracker) this.visibilityTrackerReference.get(), new Consumer<VisibilityTracker>() {
            public void accept(VisibilityTracker visibilityTracker) {
                BannerCsmAdPresenterImpl.this.visibilityTrackerReference.clear();
                visibilityTracker.destroy();
            }
        });
        Objects.onNotNull((CsmAdContentView) this.contentViewReference.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerCsmAdPresenterImpl.this.lambda$onDestroy$9$BannerCsmAdPresenterImpl((CsmAdContentView) obj);
            }
        });
        this.adLoadedListener = null;
        this.bannerViewLoaderListener = null;
        if (!isValid()) {
            Objects.onNotNull((View) this.csmAdViewReference.get(), new Consumer() {
                public final void accept(Object obj) {
                    BannerCsmAdPresenterImpl.this.lambda$onDestroy$10$BannerCsmAdPresenterImpl((View) obj);
                }
            });
            this.adInteractor.removeStateListener(this.stateListener);
        }
        Objects.onNotNull(this.bannerNetworkEvent, $$Lambda$ZG2rKDLHiXlsE9qPygunB16sDWw.INSTANCE);
    }

    public /* synthetic */ void lambda$onDestroy$9$BannerCsmAdPresenterImpl(CsmAdContentView csmAdContentView) {
        this.contentViewReference.clear();
    }

    public /* synthetic */ void lambda$onDestroy$10$BannerCsmAdPresenterImpl(View view) {
        this.csmAdViewReference.clear();
    }
}
