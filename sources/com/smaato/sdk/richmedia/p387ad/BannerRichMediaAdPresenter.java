package com.smaato.sdk.richmedia.p387ad;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.core.FormatType;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.OMWebViewViewabilityTracker;
import com.smaato.sdk.core.p378ad.AdInteractor;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.p378ad.BaseAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.richmedia.mraid.MraidConfigurator;
import com.smaato.sdk.richmedia.p387ad.BannerRichMediaAdPresenter;
import com.smaato.sdk.richmedia.p387ad.RichMediaAdInteractor;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTracker;
import com.smaato.sdk.richmedia.p387ad.tracker.RichMediaVisibilityTrackerCreator;
import com.smaato.sdk.richmedia.p387ad.tracker.VisibilityTrackerListener;
import com.smaato.sdk.richmedia.widget.RichMediaAdContentView;
import com.smaato.sdk.richmedia.widget.RichMediaWebView;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter */
class BannerRichMediaAdPresenter extends BaseAdPresenter implements BannerAdPresenter {
    /* access modifiers changed from: private */
    public final RichMediaAdInteractor adInteractor;
    /* access modifiers changed from: private */
    public final AppBackgroundDetector appBackgroundDetector;
    /* access modifiers changed from: private */
    public WeakReference<RichMediaAdContentView> contentViewRef = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public WeakReference<BannerAdPresenter.Listener> listener = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */
    public final Logger logger;
    private final MraidConfigurator mraidConfigurator;
    private final RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator;
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    private AdInteractor.TtlListener ttlListener = new AdInteractor.TtlListener() {
        public final void onTTLExpired(AdInteractor adInteractor) {
            BannerRichMediaAdPresenter.this.lambda$new$1$BannerRichMediaAdPresenter(adInteractor);
        }
    };
    /* access modifiers changed from: private */
    public final AtomicReference<RichMediaVisibilityTracker> visibilityTrackerRef = new AtomicReference<>();
    /* access modifiers changed from: private */
    public final OMWebViewViewabilityTracker webViewViewabilityTracker;

    public /* synthetic */ void lambda$new$0$BannerRichMediaAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onTTLExpired(this);
    }

    public /* synthetic */ void lambda$new$1$BannerRichMediaAdPresenter(AdInteractor adInteractor2) {
        Objects.onNotNull((BannerAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerRichMediaAdPresenter.this.lambda$new$0$BannerRichMediaAdPresenter((BannerAdPresenter.Listener) obj);
            }
        });
    }

    BannerRichMediaAdPresenter(Logger logger2, RichMediaAdInteractor richMediaAdInteractor, RichMediaVisibilityTrackerCreator richMediaVisibilityTrackerCreator2, AppBackgroundDetector appBackgroundDetector2, MraidConfigurator mraidConfigurator2, OMWebViewViewabilityTracker oMWebViewViewabilityTracker) {
        super(richMediaAdInteractor);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adInteractor = (RichMediaAdInteractor) Objects.requireNonNull(richMediaAdInteractor);
        this.richMediaVisibilityTrackerCreator = (RichMediaVisibilityTrackerCreator) Objects.requireNonNull(richMediaVisibilityTrackerCreator2);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        this.mraidConfigurator = (MraidConfigurator) Objects.requireNonNull(mraidConfigurator2);
        this.webViewViewabilityTracker = (OMWebViewViewabilityTracker) Objects.requireNonNull(oMWebViewViewabilityTracker);
        $$Lambda$BannerRichMediaAdPresenter$YfSIv3bxFoWN4rkKjov9jHZcsM r5 = new StateMachine.Listener(oMWebViewViewabilityTracker, richMediaAdInteractor, logger2) {
            public final /* synthetic */ OMWebViewViewabilityTracker f$1;
            public final /* synthetic */ RichMediaAdInteractor f$2;
            public final /* synthetic */ Logger f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                BannerRichMediaAdPresenter.this.lambda$new$3$BannerRichMediaAdPresenter(this.f$1, this.f$2, this.f$3, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        this.stateListener = r5;
        richMediaAdInteractor.addStateListener(r5);
        richMediaAdInteractor.addTtlListener(this.ttlListener);
        richMediaAdInteractor.setOnImpressionTriggered(new RichMediaAdInteractor.Callback() {
            public final void onImpressionTriggered() {
                BannerRichMediaAdPresenter.this.lambda$new$5$BannerRichMediaAdPresenter();
            }
        });
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter$2 */
    static /* synthetic */ class C112332 {
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0028 }
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x003e }
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
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p387ad.BannerRichMediaAdPresenter.C112332.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$3$BannerRichMediaAdPresenter(OMWebViewViewabilityTracker oMWebViewViewabilityTracker, RichMediaAdInteractor richMediaAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C112332.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                oMWebViewViewabilityTracker.trackImpression();
                return;
            case 6:
                Objects.onNotNull((BannerAdPresenter.Listener) this.listener.get(), new Consumer() {
                    public final void accept(Object obj) {
                        BannerRichMediaAdPresenter.this.lambda$new$2$BannerRichMediaAdPresenter((BannerAdPresenter.Listener) obj);
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

    public /* synthetic */ void lambda$new$2$BannerRichMediaAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$4$BannerRichMediaAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
    }

    public /* synthetic */ void lambda$new$5$BannerRichMediaAdPresenter() {
        Objects.onNotNull((BannerAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerRichMediaAdPresenter.this.lambda$new$4$BannerRichMediaAdPresenter((BannerAdPresenter.Listener) obj);
            }
        });
    }

    public void initialize() {
        this.adInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    public AdContentView getAdContentView(Context context) {
        RichMediaAdContentViewCallback richMediaAdContentViewCallback = new RichMediaAdContentViewCallback();
        RichMediaAdObject richMediaAdObject = (RichMediaAdObject) this.adInteractor.getAdObject();
        RichMediaAdContentView createViewForBanner = this.mraidConfigurator.createViewForBanner(context, richMediaAdObject, richMediaAdContentViewCallback);
        if (createViewForBanner == null) {
            return null;
        }
        createViewForBanner.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                BannerRichMediaAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            }

            public void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
            }
        });
        this.visibilityTrackerRef.set(this.richMediaVisibilityTrackerCreator.createTracker(createViewForBanner, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                BannerRichMediaAdPresenter.this.lambda$getAdContentView$6$BannerRichMediaAdPresenter();
            }
        }, richMediaAdObject.getImpressionCountingType(), richMediaAdObject.getContent().contains("VAST>") ? FormatType.VIDEO : FormatType.RICHMEDIA));
        this.contentViewRef = new WeakReference<>(createViewForBanner);
        return createViewForBanner;
    }

    public /* synthetic */ void lambda$getAdContentView$6$BannerRichMediaAdPresenter() {
        this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
    }

    public void setListener(BannerAdPresenter.Listener listener2) {
        this.listener = new WeakReference<>(listener2);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.adInteractor.onEvent(AdStateMachine.Event.DESTROY);
        Objects.onNotNull((RichMediaAdContentView) this.contentViewRef.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerRichMediaAdPresenter.this.lambda$onDestroy$7$BannerRichMediaAdPresenter((RichMediaAdContentView) obj);
            }
        });
        Objects.onNotNull(this.visibilityTrackerRef.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerRichMediaAdPresenter.this.lambda$onDestroy$8$BannerRichMediaAdPresenter((RichMediaVisibilityTracker) obj);
            }
        });
        this.webViewViewabilityTracker.stopTracking();
        this.listener.clear();
    }

    public /* synthetic */ void lambda$onDestroy$7$BannerRichMediaAdPresenter(RichMediaAdContentView richMediaAdContentView) {
        richMediaAdContentView.destroy();
        this.contentViewRef.clear();
    }

    public /* synthetic */ void lambda$onDestroy$8$BannerRichMediaAdPresenter(RichMediaVisibilityTracker richMediaVisibilityTracker) {
        richMediaVisibilityTracker.destroy();
        this.visibilityTrackerRef.set((Object) null);
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
    private final class RichMediaAdContentViewCallback implements RichMediaAdContentView.Callback {
        public void onHidden(RichMediaAdContentView richMediaAdContentView) {
        }

        private RichMediaAdContentViewCallback() {
        }

        public void onWebViewLoaded(RichMediaAdContentView richMediaAdContentView) {
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.registerAdView(richMediaAdContentView.getWebView());
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.startTracking();
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.trackLoaded();
            Objects.onNotNull((RichMediaVisibilityTracker) BannerRichMediaAdPresenter.this.visibilityTrackerRef.get(), $$Lambda$u0fuGW6C4x96oi_UHwrAM_O6eeI.INSTANCE);
        }

        public void onUrlClicked(RichMediaAdContentView richMediaAdContentView, String str) {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
                return;
            }
            richMediaAdContentView.showProgressIndicator(true);
            BannerRichMediaAdPresenter.this.adInteractor.handleClickUrl(str, new Runnable() {
                public final void run() {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70350xd0128b8f();
                }
            }, new Runnable() {
                public final void run() {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.handleResolveUrlError();
                }
            });
        }

        /* renamed from: lambda$onUrlClicked$0$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70350xd0128b8f() {
            handleResolveUrlSuccess();
            onWebViewClicked();
        }

        public void onAdExpanded(RichMediaAdContentView richMediaAdContentView) {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping expand event, because app is in background", new Object[0]);
            } else {
                Objects.onNotNull((BannerAdPresenter.Listener) BannerRichMediaAdPresenter.this.listener.get(), new Consumer() {
                    public final void accept(Object obj) {
                        BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70346xe7190c94((BannerAdPresenter.Listener) obj);
                    }
                });
            }
        }

        /* renamed from: lambda$onAdExpanded$1$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70346xe7190c94(BannerAdPresenter.Listener listener) {
            listener.onAdExpanded(BannerRichMediaAdPresenter.this);
        }

        /* renamed from: lambda$onUnloadView$2$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70348x615fa99d(BannerAdPresenter.Listener listener) {
            listener.onAdUnload(BannerRichMediaAdPresenter.this);
        }

        /* renamed from: lambda$onUnloadView$3$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70349x7215765e() {
            Objects.onNotNull((BannerAdPresenter.Listener) BannerRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70348x615fa99d((BannerAdPresenter.Listener) obj);
                }
            });
        }

        public void onUnloadView(RichMediaAdContentView richMediaAdContentView) {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70349x7215765e();
                }
            });
        }

        public void onAdResized(RichMediaAdContentView richMediaAdContentView) {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping resize event, because app is in background", new Object[0]);
            } else {
                Objects.onNotNull((BannerAdPresenter.Listener) BannerRichMediaAdPresenter.this.listener.get(), $$Lambda$cYYIRl5OnGn12VImG_S6TxguU.INSTANCE);
            }
        }

        public void onAdCollapsed(RichMediaAdContentView richMediaAdContentView) {
            Objects.onNotNull((BannerAdPresenter.Listener) BannerRichMediaAdPresenter.this.listener.get(), $$Lambda$DnClyV8LMK4oneag9X9lq8FTdY.INSTANCE);
        }

        public void onAdViolation(String str, String str2) {
            BannerRichMediaAdPresenter.this.adInteractor.reportAdViolation(str, str2);
        }

        public void registerFriendlyObstruction(View view) {
            if (BannerRichMediaAdPresenter.this.webViewViewabilityTracker != null && view != null) {
                BannerRichMediaAdPresenter.this.webViewViewabilityTracker.registerFriendlyObstruction(view);
            }
        }

        public void removeFriendlyObstruction(View view) {
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.removeFriendlyObstruction(view);
        }

        public void updateAdView(RichMediaWebView richMediaWebView) {
            BannerRichMediaAdPresenter.this.webViewViewabilityTracker.updateAdView(richMediaWebView);
        }

        /* renamed from: lambda$onRenderProcessGone$4$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70347x657a059b(BannerAdPresenter.Listener listener) {
            listener.onAdError(BannerRichMediaAdPresenter.this);
        }

        public void onRenderProcessGone(RichMediaAdContentView richMediaAdContentView) {
            Objects.onNotNull((BannerAdPresenter.Listener) BannerRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70347x657a059b((BannerAdPresenter.Listener) obj);
                }
            });
        }

        public void onPlayVideo(RichMediaAdContentView richMediaAdContentView, String str) {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping play video event, because app is in background", new Object[0]);
                return;
            }
            richMediaAdContentView.showProgressIndicator(true);
            BannerRichMediaAdPresenter.this.adInteractor.handleClickUrl(str, new Runnable() {
                public final void run() {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.handleResolveUrlSuccess();
                }
            }, new Runnable() {
                public final void run() {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.handleResolveUrlError();
                }
            });
        }

        private void onWebViewClicked() {
            if (BannerRichMediaAdPresenter.this.appBackgroundDetector.isAppInBackground()) {
                BannerRichMediaAdPresenter.this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
            } else {
                BannerRichMediaAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
            }
        }

        /* access modifiers changed from: private */
        public void handleResolveUrlError() {
            Threads.runOnUi(new Runnable() {
                public final void run() {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70345x2d984da2();
                }
            });
        }

        /* renamed from: lambda$handleResolveUrlError$7$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70345x2d984da2() {
            BannerRichMediaAdPresenter.this.logger.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
            Objects.onNotNull((RichMediaAdContentView) BannerRichMediaAdPresenter.this.contentViewRef.get(), C11196xdda958a0.INSTANCE);
            Objects.onNotNull((BannerAdPresenter.Listener) BannerRichMediaAdPresenter.this.listener.get(), new Consumer() {
                public final void accept(Object obj) {
                    BannerRichMediaAdPresenter.RichMediaAdContentViewCallback.this.mo70344x1ce280e1((BannerAdPresenter.Listener) obj);
                }
            });
        }

        /* renamed from: lambda$handleResolveUrlError$6$BannerRichMediaAdPresenter$RichMediaAdContentViewCallback */
        public /* synthetic */ void mo70344x1ce280e1(BannerAdPresenter.Listener listener) {
            listener.onAdError(BannerRichMediaAdPresenter.this);
        }

        /* access modifiers changed from: private */
        public void handleResolveUrlSuccess() {
            Objects.onNotNull((RichMediaAdContentView) BannerRichMediaAdPresenter.this.contentViewRef.get(), C11189xc291f7c9.INSTANCE);
        }
    }
}
