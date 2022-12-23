package com.smaato.sdk.rewarded.csm;

import android.content.Context;
import com.smaato.sdk.core.csm.CsmAdContentView;
import com.smaato.sdk.core.csm.CsmAdInteractor;
import com.smaato.sdk.core.csm.CsmAdObject;
import com.smaato.sdk.core.csm.CsmAdPresenter;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdInteractor;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BaseAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.rewarded.csm.RewardedCsmAdPresenter;
import com.smaato.sdk.rewarded.csm.RewardedCsmAdPresenterImpl;
import java.util.Map;

public final class RewardedCsmAdPresenterImpl extends BaseAdPresenter implements RewardedCsmAdPresenter {
    /* access modifiers changed from: private */
    public final CsmAdInteractor adInteractor;
    /* access modifiers changed from: private */
    public CsmAdPresenter.Listener adLoadedListener;
    private final Logger logger;
    /* access modifiers changed from: private */
    public RewardedCsmAdPresenter.Listener rewardedAdListener;
    private final SMARewardedNetworkEvent rewardedNetworkEvent;
    private final SMARewardedNetworkEventListener rewardedNetworkEventListener = new SMARewardedNetworkEventListener() {
        public void onAdLoaded() {
            Objects.onNotNull(RewardedCsmAdPresenterImpl.this.adLoadedListener, new Consumer() {
                public final void accept(Object obj) {
                    RewardedCsmAdPresenterImpl.C111711.this.lambda$onAdLoaded$0$RewardedCsmAdPresenterImpl$1((CsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdLoaded$0$RewardedCsmAdPresenterImpl$1(CsmAdPresenter.Listener listener) {
            listener.onAdLoaded(RewardedCsmAdPresenterImpl.this);
        }

        public void onAdFailedToLoad() {
            Objects.onNotNull(RewardedCsmAdPresenterImpl.this.adLoadedListener, new Consumer() {
                public final void accept(Object obj) {
                    RewardedCsmAdPresenterImpl.C111711.this.lambda$onAdFailedToLoad$1$RewardedCsmAdPresenterImpl$1((CsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdFailedToLoad$1$RewardedCsmAdPresenterImpl$1(CsmAdPresenter.Listener listener) {
            listener.onAdFailedToLoad(RewardedCsmAdPresenterImpl.this);
        }

        public void onAdError() {
            Objects.onNotNull(RewardedCsmAdPresenterImpl.this.rewardedAdListener, new Consumer() {
                public final void accept(Object obj) {
                    RewardedCsmAdPresenterImpl.C111711.this.lambda$onAdError$2$RewardedCsmAdPresenterImpl$1((RewardedCsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdError$2$RewardedCsmAdPresenterImpl$1(RewardedCsmAdPresenter.Listener listener) {
            listener.onAdError(RewardedCsmAdPresenterImpl.this);
        }

        public void onAdClicked() {
            RewardedCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
        }

        public void onAdStarted() {
            RewardedCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            RewardedCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
            Objects.onNotNull(RewardedCsmAdPresenterImpl.this.rewardedAdListener, new Consumer() {
                public final void accept(Object obj) {
                    RewardedCsmAdPresenterImpl.C111711.this.lambda$onAdStarted$3$RewardedCsmAdPresenterImpl$1((RewardedCsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdStarted$3$RewardedCsmAdPresenterImpl$1(RewardedCsmAdPresenter.Listener listener) {
            listener.onAdStarted(RewardedCsmAdPresenterImpl.this);
        }

        public void onAdClosed() {
            RewardedCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.CLOSE);
            Objects.onNotNull(RewardedCsmAdPresenterImpl.this.rewardedAdListener, new Consumer() {
                public final void accept(Object obj) {
                    RewardedCsmAdPresenterImpl.C111711.this.lambda$onAdClosed$4$RewardedCsmAdPresenterImpl$1((RewardedCsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdClosed$4$RewardedCsmAdPresenterImpl$1(RewardedCsmAdPresenter.Listener listener) {
            listener.onAdClosed(RewardedCsmAdPresenterImpl.this);
        }

        public void onAdReward() {
            Objects.onNotNull(RewardedCsmAdPresenterImpl.this.rewardedAdListener, new Consumer() {
                public final void accept(Object obj) {
                    RewardedCsmAdPresenterImpl.C111711.this.lambda$onAdReward$5$RewardedCsmAdPresenterImpl$1((RewardedCsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdReward$5$RewardedCsmAdPresenterImpl$1(RewardedCsmAdPresenter.Listener listener) {
            listener.onAdReward(RewardedCsmAdPresenterImpl.this);
        }

        public void onAdTTLExpired() {
            RewardedCsmAdPresenterImpl.this.adInteractor.onEvent(AdStateMachine.Event.EXPIRE_TTL);
            Objects.onNotNull(RewardedCsmAdPresenterImpl.this.rewardedAdListener, new Consumer() {
                public final void accept(Object obj) {
                    RewardedCsmAdPresenterImpl.C111711.this.lambda$onAdTTLExpired$6$RewardedCsmAdPresenterImpl$1((RewardedCsmAdPresenter.Listener) obj);
                }
            });
        }

        public /* synthetic */ void lambda$onAdTTLExpired$6$RewardedCsmAdPresenterImpl$1(RewardedCsmAdPresenter.Listener listener) {
            listener.onTTLExpired(RewardedCsmAdPresenterImpl.this);
        }
    };
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    private AdInteractor.TtlListener ttlListener = new AdInteractor.TtlListener() {
        public final void onTTLExpired(AdInteractor adInteractor) {
            RewardedCsmAdPresenterImpl.this.lambda$new$1$RewardedCsmAdPresenterImpl(adInteractor);
        }
    };

    public /* synthetic */ void lambda$new$0$RewardedCsmAdPresenterImpl(RewardedCsmAdPresenter.Listener listener) {
        listener.onTTLExpired(this);
    }

    public /* synthetic */ void lambda$new$1$RewardedCsmAdPresenterImpl(AdInteractor adInteractor2) {
        Objects.onNotNull(this.rewardedAdListener, new Consumer() {
            public final void accept(Object obj) {
                RewardedCsmAdPresenterImpl.this.lambda$new$0$RewardedCsmAdPresenterImpl((RewardedCsmAdPresenter.Listener) obj);
            }
        });
    }

    RewardedCsmAdPresenterImpl(CsmAdInteractor csmAdInteractor, Logger logger2, SMARewardedNetworkEvent sMARewardedNetworkEvent) {
        super(csmAdInteractor);
        this.adInteractor = (CsmAdInteractor) Objects.requireNonNull(csmAdInteractor);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.rewardedNetworkEvent = sMARewardedNetworkEvent;
        this.stateListener = new StateMachine.Listener(csmAdInteractor, logger2) {
            public final /* synthetic */ CsmAdInteractor f$1;
            public final /* synthetic */ Logger f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                RewardedCsmAdPresenterImpl.this.lambda$new$3$RewardedCsmAdPresenterImpl(this.f$1, this.f$2, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        csmAdInteractor.addTtlListener(this.ttlListener);
        csmAdInteractor.addStateListener(this.stateListener);
        csmAdInteractor.setOnImpressionTriggered(new CsmAdInteractor.Callback() {
            public final void onImpressionTriggered() {
                RewardedCsmAdPresenterImpl.this.lambda$new$5$RewardedCsmAdPresenterImpl();
            }
        });
        csmAdInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    /* renamed from: com.smaato.sdk.rewarded.csm.RewardedCsmAdPresenterImpl$2 */
    static /* synthetic */ class C111722 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.rewarded.csm.RewardedCsmAdPresenterImpl.C111722.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$3$RewardedCsmAdPresenterImpl(CsmAdInteractor csmAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C111722.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Objects.onNotNull(this.rewardedAdListener, new Consumer() {
                    public final void accept(Object obj) {
                        RewardedCsmAdPresenterImpl.this.lambda$new$2$RewardedCsmAdPresenterImpl((RewardedCsmAdPresenter.Listener) obj);
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

    public /* synthetic */ void lambda$new$2$RewardedCsmAdPresenterImpl(RewardedCsmAdPresenter.Listener listener) {
        listener.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$4$RewardedCsmAdPresenterImpl(RewardedCsmAdPresenter.Listener listener) {
        listener.onAdImpressed(this);
    }

    public /* synthetic */ void lambda$new$5$RewardedCsmAdPresenterImpl() {
        Objects.onNotNull(this.rewardedAdListener, new Consumer() {
            public final void accept(Object obj) {
                RewardedCsmAdPresenterImpl.this.lambda$new$4$RewardedCsmAdPresenterImpl((RewardedCsmAdPresenter.Listener) obj);
            }
        });
    }

    public void requestAd(Context context, Map<String, String> map, Map<String, Object> map2) {
        if (this.rewardedNetworkEvent == null) {
            this.logger.error(LogDomain.AD, String.format("Could not find CustomEvent class with networkName: %s", new Object[]{((CsmAdObject) this.adInteractor.getAdObject()).getNetwork().getName()}), new Object[0]);
            Objects.onNotNull(this.adLoadedListener, new Consumer() {
                public final void accept(Object obj) {
                    RewardedCsmAdPresenterImpl.this.lambda$requestAd$6$RewardedCsmAdPresenterImpl((CsmAdPresenter.Listener) obj);
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
                RewardedCsmAdPresenterImpl.this.lambda$requestAd$7$RewardedCsmAdPresenterImpl(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public /* synthetic */ void lambda$requestAd$6$RewardedCsmAdPresenterImpl(CsmAdPresenter.Listener listener) {
        listener.onAdFailedToLoad(this);
    }

    public /* synthetic */ void lambda$requestAd$7$RewardedCsmAdPresenterImpl(Context context, Map map, Map map2) {
        this.rewardedNetworkEvent.requestRewardedInterstitial(context, this.rewardedNetworkEventListener, map, map2);
    }

    public void showAd() {
        Objects.onNotNull(this.rewardedNetworkEvent, $$Lambda$ANGXSU44BBSNfQbZh4ozlr7KBec.INSTANCE);
    }

    public void setAdLoadedListener(CsmAdPresenter.Listener listener) {
        this.adLoadedListener = listener;
    }

    public void setRewardedAdListener(RewardedCsmAdPresenter.Listener listener) {
        this.rewardedAdListener = listener;
    }

    public AdContentView getAdContentView(Context context) {
        return new CsmAdContentView(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r1.rewardedNetworkEvent;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isValid() {
        /*
            r1 = this;
            com.smaato.sdk.core.csm.CsmAdInteractor r0 = r1.adInteractor
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0014
            com.smaato.sdk.rewarded.csm.SMARewardedNetworkEvent r0 = r1.rewardedNetworkEvent
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.rewarded.csm.RewardedCsmAdPresenterImpl.isValid():boolean");
    }

    public void onDestroy() {
        Threads.ensureMainThread();
        if (!isValid()) {
            this.adInteractor.removeStateListener(this.stateListener);
        }
        this.adLoadedListener = null;
        this.rewardedAdListener = null;
        Objects.onNotNull(this.rewardedNetworkEvent, $$Lambda$t4XVjiOx5EbqMl2om8stnSclAQ.INSTANCE);
    }
}
