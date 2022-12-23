package com.smaato.sdk.richmedia.p387ad;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.smaato.sdk.core.FormatType;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BaseAdPresenter;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.notifier.TimerUtils;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.p387ad.InterstitialRichMediaAdPresenter;
import com.smaato.sdk.richmedia.p387ad.RichMediaAdInteractor;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTracker;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTrackerCreator;
import com.smaato.sdk.richmedia.p387ad.tracker.VisibilityTrackerListener;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter */
class InterstitialRichMediaAdPresenter extends BaseAdPresenter implements InterstitialAdPresenter {
    /* access modifiers changed from: private */
    public final RichMediaAdInteractor adInteractor;
    /* access modifiers changed from: private */
    public final AppBackgroundDetector appBackgroundDetector;
    /* access modifiers changed from: private */
    public final Timer closeButtonTimer;
    /* access modifiers changed from: private */
    public WeakReference<RichMediaAdContentView> contentViewRef = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public final List<WeakReference<View>> friendlyObstructionViews = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */
    public InterstitialAdPresenter.Listener listener;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final MraidConfigurator mraidConfigurator;
    /* access modifiers changed from: private */
    public Runnable onFinish;
    private Runnable onShowCloseButton;
    private final RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator;
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    /* access modifiers changed from: private */
    public final Timer.Listener timerListener = new Timer.Listener() {
        public final void onTimePassed() {
            InterstitialRichMediaAdPresenter.this.lambda$new$0$InterstitialRichMediaAdPresenter();
        }
    };
    /* access modifiers changed from: private */
    public final AtomicReference<RichMediaVisibilityTracker> visibilityTrackerReference = new AtomicReference<>();
    /* access modifiers changed from: private */
    public final OMWebViewViewabilityTracker webViewViewabilityTracker;

    public /* synthetic */ void lambda$new$0$InterstitialRichMediaAdPresenter() {
        Objects.onNotNull(this.onShowCloseButton, $$Lambda$huEuq5O9vKGYekRh2sbgvwnUXs.INSTANCE);
    }

    InterstitialRichMediaAdPresenter(Logger logger2, RichMediaAdInteractor richMediaAdInteractor, RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator2, Timer timer, AppBackgroundDetector appBackgroundDetector2, MraidConfigurator mraidConfigurator2, OMWebViewViewabilityTracker oMWebViewViewabilityTracker) {
        super(richMediaAdInteractor);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adInteractor = (RichMediaAdInteractor) Objects.requireNonNull(richMediaAdInteractor);
        this.richMediaVisibilityTrackerCreator = (RichMediaVisibilityTrackerCreator) Objects.requireNonNull(richMediaVisibilityTrackerCreator2);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        this.mraidConfigurator = (MraidConfigurator) Objects.requireNonNull(mraidConfigurator2);
        this.webViewViewabilityTracker = (OMWebViewViewabilityTracker) Objects.requireNonNull(oMWebViewViewabilityTracker);
        this.closeButtonTimer = createCloseButtonTimer(richMediaAdInteractor, timer);
        C11216xbbfd39a5 r5 = new StateMachine.Listener(richMediaAdInteractor, logger2) {
            public final /* synthetic */ RichMediaAdInteractor f$1;
            public final /* synthetic */ Logger f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                InterstitialRichMediaAdPresenter.this.lambda$new$2$InterstitialRichMediaAdPresenter(this.f$1, this.f$2, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        this.stateListener = r5;
        richMediaAdInteractor.addStateListener(r5);
        richMediaAdInteractor.setOnImpressionTriggered(new RichMediaAdInteractor.Callback(oMWebViewViewabilityTracker) {
            public final /* synthetic */ OMWebViewViewabilityTracker f$1;

            {
                this.f$1 = r2;
            }

            public final void onImpressionTriggered() {
                InterstitialRichMediaAdPresenter.this.lambda$new$4$InterstitialRichMediaAdPresenter(this.f$1);
            }
        });
        richMediaAdInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter$3 */
    static /* synthetic */ class C112363 {
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x003e }
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
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p387ad.InterstitialRichMediaAdPresenter.C112363.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$2$InterstitialRichMediaAdPresenter(RichMediaAdInteractor richMediaAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C112363.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Objects.onNotNull(this.listener, new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialRichMediaAdPresenter.this.lambda$new$1$InterstitialRichMediaAdPresenter((InterstitialAdPresenter.Listener) obj);
                    }
                });
                return;
            case 7:
                richMediaAdInteractor.removeStateListener(this.stateListener);
                return;
            default:
                logger2.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public /* synthetic */ void lambda$new$1$InterstitialRichMediaAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$4$InterstitialRichMediaAdPresenter(OMWebViewViewabilityTracker oMWebViewViewabilityTracker) {
        Objects.onNotNull(this.listener, new Consumer(oMWebViewViewabilityTracker) {
            public final /* synthetic */ OMWebViewViewabilityTracker f$1;

            {
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                InterstitialRichMediaAdPresenter.this.lambda$new$3$InterstitialRichMediaAdPresenter(this.f$1, (InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$new$3$InterstitialRichMediaAdPresenter(OMWebViewViewabilityTracker oMWebViewViewabilityTracker, InterstitialAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
        oMWebViewViewabilityTracker.trackImpression();
    }

    public AdContentView getAdContentView(Context context) {
        final RichMediaAdContentView createViewForInterstitial = this.mraidConfigurator.createViewForInterstitial(context, (RichMediaAdObject) this.adInteractor.getAdObject(), new RichMediaAdContentViewCallback());
        if (createViewForInterstitial == null) {
            return null;
        }
        createViewForInterstitial.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                InterstitialRichMediaAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            }

            public void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                InterstitialRichMediaAdPresenter.this.friendlyObstructionViews.clear();
                InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.stopTracking();
                Objects.onNotNull((RichMediaVisibilityTracker) InterstitialRichMediaAdPresenter.this.visibilityTrackerReference.get(), new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialRichMediaAdPresenter.C112341.this.mo70360x3865df61((RichMediaVisibilityTracker) obj);
                    }
                });
                Objects.onNotNull((RichMediaAdContentView) InterstitialRichMediaAdPresenter.this.contentViewRef.get(), new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialRichMediaAdPresenter.C112341.this.mo70361xaca517c0((RichMediaAdContentView) obj);
                    }
                });
            }

            /* renamed from: lambda$onViewDetachedFromWindow$0$InterstitialRichMediaAdPresenter$1 */
            public /* synthetic */ void mo70360x3865df61(RichMediaVisibilityTracker richMediaVisibilityTracker) {
                InterstitialRichMediaAdPresenter.this.visibilityTrackerReference.set((Object) null);
                richMediaVisibilityTracker.destroy();
            }

            /* renamed from: lambda$onViewDetachedFromWindow$1$InterstitialRichMediaAdPresenter$1 */
            public /* synthetic */ void mo70361xaca517c0(RichMediaAdContentView richMediaAdContentView) {
                InterstitialRichMediaAdPresenter.this.contentViewRef.clear();
                richMediaAdContentView.destroy();
            }
        });
        createViewForInterstitial.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                createViewForInterstitial.getViewTreeObserver().removeOnPreDrawListener(this);
                InterstitialRichMediaAdPresenter.this.closeButtonTimer.start(InterstitialRichMediaAdPresenter.this.timerListener);
                return true;
            }
        });
        this.visibilityTrackerReference.set(this.richMediaVisibilityTrackerCreator.createTracker(createViewForInterstitial, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                InterstitialRichMediaAdPresenter.this.lambda$getAdContentView$5$InterstitialRichMediaAdPresenter();
            }
        }, this.adInteractor.getAdObject() != null ? ((RichMediaAdObject) this.adInteractor.getAdObject()).getImpressionCountingType() : ImpressionCountingType.STANDARD, FormatType.IMAGE));
        this.contentViewRef = new WeakReference<>(createViewForInterstitial);
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialRichMediaAdPresenter.this.lambda$getAdContentView$6$InterstitialRichMediaAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
        return createViewForInterstitial;
    }

    public /* synthetic */ void lambda$getAdContentView$5$InterstitialRichMediaAdPresenter() {
        this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
    }

    public /* synthetic */ void lambda$getAdContentView$6$InterstitialRichMediaAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onOpen(this);
    }

    public void onCloseClicked() {
        Objects.onNotNull(this.onFinish, $$Lambda$huEuq5O9vKGYekRh2sbgvwnUXs.INSTANCE);
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialRichMediaAdPresenter.this.lambda$onCloseClicked$7$InterstitialRichMediaAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onCloseClicked$7$InterstitialRichMediaAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onClose(this);
    }

    public /* synthetic */ void lambda$onError$8$InterstitialRichMediaAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdError(this);
    }

    public void onError() {
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialRichMediaAdPresenter.this.lambda$onError$8$InterstitialRichMediaAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public void setListener(InterstitialAdPresenter.Listener listener2) {
        this.listener = listener2;
    }

    public void setOnShowCloseButtonListener(Runnable runnable) {
        this.onShowCloseButton = runnable;
    }

    public void setOnFinishListener(Runnable runnable) {
        this.onFinish = runnable;
    }

    public void setFriendlyObstructionView(View view) {
        this.friendlyObstructionViews.add(new WeakReference(view));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.adInteractor.onEvent(AdStateMachine.Event.DESTROY);
        this.listener = null;
        this.onFinish = null;
        this.onShowCloseButton = null;
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
    private final class RichMediaAdContentViewCallback implements RichMediaAdContentView.Callback {
        public void onAdCollapsed(RichMediaAdContentView richMediaAdContentView) {
        }

        public void onAdExpanded(RichMediaAdContentView richMediaAdContentView) {
        }

        public void onAdResized(RichMediaAdContentView richMediaAdContentView) {
        }

        public void updateAdView(RichMediaWebView richMediaWebView) {
        }

        private RichMediaAdContentViewCallback() {
        }

        public void onWebViewLoaded(RichMediaAdContentView richMediaAdContentView) {
            InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.registerAdView(richMediaAdContentView.getWebView());
            InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.startTracking();
            InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.trackLoaded();
            Objects.onNotNull((RichMediaVisibilityTracker) InterstitialRichMediaAdPresenter.this.visibilityTrackerReference.get(), $$Lambda$u0fuGW6C4x96oi_UHwrAM_O6eeI.INSTANCE);
        }

        public void onUrlClicked(RichMediaAdContentView richMediaAdContentView, String str) {
            if (InterstitialRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                InterstitialRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
                return;
            }
            richMediaAdContentView.showProgressIndicator(true);
            InterstitialRichMediaAdPresenter.this.adInteractor.handleClickUrl(str, new Runnable() {
                public final void run() {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70371x70c8568f();
                }
            }, new Runnable() {
                public final void run() {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.handleResolveUrlError();
                }
            });
        }

        /* renamed from: lambda$onUrlClicked$0$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70371x70c8568f() {
            handleResolveUrlSuccess();
            onWebViewClicked();
        }

        public void onUnloadView(RichMediaAdContentView richMediaAdContentView) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70370xf3de321d();
                }
            });
        }

        /* renamed from: lambda$onUnloadView$2$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70370xf3de321d() {
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.onFinish, $$Lambda$huEuq5O9vKGYekRh2sbgvwnUXs.INSTANCE);
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.listener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70369xa61eba1c((InterstitialAdPresenter.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$onUnloadView$1$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70369xa61eba1c(InterstitialAdPresenter.Listener listener) {
            listener.onAdUnload(InterstitialRichMediaAdPresenter.this);
        }

        public void onHidden(RichMediaAdContentView richMediaAdContentView) {
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.onFinish, $$Lambda$huEuq5O9vKGYekRh2sbgvwnUXs.INSTANCE);
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.listener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70367x73b3e04((InterstitialAdPresenter.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$onHidden$3$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70367x73b3e04(InterstitialAdPresenter.Listener listener) {
            listener.onClose(InterstitialRichMediaAdPresenter.this);
        }

        public void onAdViolation(String str, String str2) {
            InterstitialRichMediaAdPresenter.this.adInteractor.reportAdViolation(str, str2);
        }

        public void registerFriendlyObstruction(View view) {
            if (view != null) {
                InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.registerFriendlyObstruction(view);
            }
        }

        public void removeFriendlyObstruction(View view) {
            InterstitialRichMediaAdPresenter.this.webViewViewabilityTracker.removeFriendlyObstruction(view);
        }

        public void onRenderProcessGone(RichMediaAdContentView richMediaAdContentView) {
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.onFinish, $$Lambda$huEuq5O9vKGYekRh2sbgvwnUXs.INSTANCE);
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.listener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70368x4ff7179b((InterstitialAdPresenter.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$onRenderProcessGone$4$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70368x4ff7179b(InterstitialAdPresenter.Listener listener) {
            listener.onAdError(InterstitialRichMediaAdPresenter.this);
            listener.onClose(InterstitialRichMediaAdPresenter.this);
        }

        public void onPlayVideo(RichMediaAdContentView richMediaAdContentView, String str) {
            if (InterstitialRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                InterstitialRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping play video event, because app is in background", new Object[0]);
                return;
            }
            richMediaAdContentView.showProgressIndicator(true);
            InterstitialRichMediaAdPresenter.this.adInteractor.handleClickUrl(str, new Runnable() {
                public final void run() {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.handleResolveUrlSuccess();
                }
            }, new Runnable() {
                public final void run() {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.handleResolveUrlError();
                }
            });
        }

        private void onWebViewClicked() {
            if (InterstitialRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                InterstitialRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
            } else {
                InterstitialRichMediaAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
            }
        }

        /* access modifiers changed from: private */
        public void handleResolveUrlError() {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70366x3c8afe62();
                }
            });
        }

        /* renamed from: lambda$handleResolveUrlError$7$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70366x3c8afe62() {
            InterstitialRichMediaAdPresenter.this.logger.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
            Objects.onNotNull((RichMediaAdContentView) InterstitialRichMediaAdPresenter.this.contentViewRef.get(), C11204x9d854644.INSTANCE);
            Objects.onNotNull(InterstitialRichMediaAdPresenter.this.listener, new Consumer() {
                public final void accept(Object obj) {
                    InterstitialRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70365xeecb8661((InterstitialAdPresenter.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$handleResolveUrlError$6$InterstitialRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70365xeecb8661(InterstitialAdPresenter.Listener listener) {
            listener.onAdError(InterstitialRichMediaAdPresenter.this);
        }

        /* access modifiers changed from: private */
        public void handleResolveUrlSuccess() {
            Objects.onNotNull((RichMediaAdContentView) InterstitialRichMediaAdPresenter.this.contentViewRef.get(), C11203xb0037e7.INSTANCE);
        }
    }

    private Timer createCloseButtonTimer(RichMediaAdInteractor richMediaAdInteractor, Timer timer) {
        try {
            Integer displayAdCloseInterval = ((RichMediaAdObject) richMediaAdInteractor.getAdObject()).getSomaApiContext().getApiAdRequest().getDisplayAdCloseInterval();
            if (displayAdCloseInterval != null) {
                return TimerUtils.createSingleTimer((long) (displayAdCloseInterval.intValue() * 1000));
            }
        } catch (NullPointerException e) {
            this.logger.error(LogDomain.RICH_MEDIA, e, "Null pointer exception", new Object[0]);
        }
        return (Timer) Objects.requireNonNull(timer);
    }
}
