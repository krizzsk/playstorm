package com.smaato.sdk.image.p383ad;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BaseAdPresenter;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.tracker.VisibilityTracker;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.tracker.VisibilityTrackerListener;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.notifier.Timer;
import com.smaato.sdk.core.util.notifier.TimerUtils;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.image.p383ad.ImageAdInteractor;
import com.smaato.sdk.image.p383ad.InterstitialImageAdPresenter;
import com.smaato.sdk.image.p384ui.StaticImageAdContentView;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.image.ad.InterstitialImageAdPresenter */
class InterstitialImageAdPresenter extends BaseAdPresenter implements InterstitialAdPresenter {
    /* access modifiers changed from: private */
    public final ImageAdInteractor adInteractor;
    private final AppBackgroundDetector appBackgroundDetector;
    /* access modifiers changed from: private */
    public final Timer closeButtonTimer;
    private final VisibilityTrackerCreator imageVisibilityTrackerCreator;
    private InterstitialAdPresenter.Listener listener;
    private final Logger logger;
    private Runnable onFinish;
    private Runnable onShowCloseButton;
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    /* access modifiers changed from: private */
    public final Timer.Listener timerListener = new Timer.Listener() {
        public final void onTimePassed() {
            InterstitialImageAdPresenter.this.lambda$new$0$InterstitialImageAdPresenter();
        }
    };
    /* access modifiers changed from: private */
    public final AtomicReference<VisibilityTracker> visibilityTrackerReference = new AtomicReference<>();

    public void setFriendlyObstructionView(View view) {
    }

    public /* synthetic */ void lambda$new$0$InterstitialImageAdPresenter() {
        Objects.onNotNull(this.onShowCloseButton, $$Lambda$huEuq5O9vKGYekRh2sbgvwnUXs.INSTANCE);
    }

    InterstitialImageAdPresenter(Logger logger2, ImageAdInteractor imageAdInteractor, VisibilityTrackerCreator visibilityTrackerCreator, Timer timer, AppBackgroundDetector appBackgroundDetector2) {
        super(imageAdInteractor);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adInteractor = (ImageAdInteractor) Objects.requireNonNull(imageAdInteractor);
        this.imageVisibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        this.closeButtonTimer = createCloseButtonTimer(imageAdInteractor, timer);
        C11072x2b8a7028 r4 = new StateMachine.Listener(imageAdInteractor, logger2) {
            public final /* synthetic */ ImageAdInteractor f$1;
            public final /* synthetic */ Logger f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                InterstitialImageAdPresenter.this.lambda$new$2$InterstitialImageAdPresenter(this.f$1, this.f$2, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        this.stateListener = r4;
        imageAdInteractor.addStateListener(r4);
        imageAdInteractor.setOnImpressionTriggered(new ImageAdInteractor.Callback() {
            public final void onImpressionTriggered() {
                InterstitialImageAdPresenter.this.lambda$new$4$InterstitialImageAdPresenter();
            }
        });
        imageAdInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    /* renamed from: com.smaato.sdk.image.ad.InterstitialImageAdPresenter$3 */
    static /* synthetic */ class C110863 {
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x0033 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.p383ad.InterstitialImageAdPresenter.C110863.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$2$InterstitialImageAdPresenter(ImageAdInteractor imageAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C110863.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                Objects.onNotNull(this.listener, new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialImageAdPresenter.this.lambda$new$1$InterstitialImageAdPresenter((InterstitialAdPresenter.Listener) obj);
                    }
                });
                return;
            case 7:
                imageAdInteractor.removeStateListener(this.stateListener);
                return;
            default:
                logger2.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public /* synthetic */ void lambda$new$1$InterstitialImageAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$3$InterstitialImageAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
    }

    public /* synthetic */ void lambda$new$4$InterstitialImageAdPresenter() {
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialImageAdPresenter.this.lambda$new$3$InterstitialImageAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public AdContentView getAdContentView(Context context) {
        AtomicReference atomicReference = new AtomicReference((Object) null);
        final StaticImageAdContentView create = StaticImageAdContentView.create(context, (ImageAdObject) this.adInteractor.getAdObject(), new View.OnClickListener(atomicReference) {
            public final /* synthetic */ AtomicReference f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                InterstitialImageAdPresenter.this.lambda$getAdContentView$10$InterstitialImageAdPresenter(this.f$1, view);
            }
        });
        atomicReference.set(create);
        this.visibilityTrackerReference.set(this.imageVisibilityTrackerCreator.createTracker(create, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                InterstitialImageAdPresenter.this.lambda$getAdContentView$11$InterstitialImageAdPresenter();
            }
        }, this.adInteractor.getAdObject() != null ? ((ImageAdObject) this.adInteractor.getAdObject()).getImpressionCountingType() : ImpressionCountingType.STANDARD));
        create.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                InterstitialImageAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            }

            public void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                Objects.onNotNull((VisibilityTracker) InterstitialImageAdPresenter.this.visibilityTrackerReference.get(), new Consumer() {
                    public final void accept(Object obj) {
                        InterstitialImageAdPresenter.C110841.this.lambda$onViewDetachedFromWindow$0$InterstitialImageAdPresenter$1((VisibilityTracker) obj);
                    }
                });
            }

            public /* synthetic */ void lambda$onViewDetachedFromWindow$0$InterstitialImageAdPresenter$1(VisibilityTracker visibilityTracker) {
                InterstitialImageAdPresenter.this.visibilityTrackerReference.set((Object) null);
                visibilityTracker.destroy();
            }
        });
        create.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            public boolean onPreDraw() {
                create.getViewTreeObserver().removeOnPreDrawListener(this);
                InterstitialImageAdPresenter.this.closeButtonTimer.start(InterstitialImageAdPresenter.this.timerListener);
                return true;
            }
        });
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialImageAdPresenter.this.lambda$getAdContentView$12$InterstitialImageAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
        return create;
    }

    public /* synthetic */ void lambda$getAdContentView$10$InterstitialImageAdPresenter(AtomicReference atomicReference, View view) {
        if (this.appBackgroundDetector.isAppInBackground()) {
            this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
            return;
        }
        ((StaticImageAdContentView) view).showProgressIndicator(true);
        this.adInteractor.handleClickUrl(new Runnable(atomicReference) {
            public final /* synthetic */ AtomicReference f$0;

            {
                this.f$0 = r1;
            }

            public final void run() {
                Objects.onNotNull((StaticImageAdContentView) this.f$0.get(), C11065xc384d811.INSTANCE);
            }
        }, new Runnable(atomicReference) {
            public final /* synthetic */ AtomicReference f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                InterstitialImageAdPresenter.this.lambda$getAdContentView$9$InterstitialImageAdPresenter(this.f$1);
            }
        });
        this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
    }

    public /* synthetic */ void lambda$getAdContentView$9$InterstitialImageAdPresenter(AtomicReference atomicReference) {
        this.logger.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialImageAdPresenter.this.lambda$getAdContentView$7$InterstitialImageAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
        Objects.onNotNull((StaticImageAdContentView) atomicReference.get(), C11063xc1689201.INSTANCE);
    }

    public /* synthetic */ void lambda$getAdContentView$7$InterstitialImageAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdError(this);
    }

    public /* synthetic */ void lambda$getAdContentView$11$InterstitialImageAdPresenter() {
        this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
    }

    public /* synthetic */ void lambda$getAdContentView$12$InterstitialImageAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onOpen(this);
    }

    public void onCloseClicked() {
        Objects.onNotNull(this.onFinish, $$Lambda$huEuq5O9vKGYekRh2sbgvwnUXs.INSTANCE);
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialImageAdPresenter.this.lambda$onCloseClicked$13$InterstitialImageAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onCloseClicked$13$InterstitialImageAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onClose(this);
    }

    public void setListener(InterstitialAdPresenter.Listener listener2) {
        this.listener = listener2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.adInteractor.onEvent(AdStateMachine.Event.DESTROY);
        this.listener = null;
        this.onFinish = null;
        this.onShowCloseButton = null;
    }

    public void setOnShowCloseButtonListener(Runnable runnable) {
        this.onShowCloseButton = runnable;
    }

    public void setOnFinishListener(Runnable runnable) {
        this.onFinish = runnable;
    }

    public /* synthetic */ void lambda$onError$14$InterstitialImageAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdError(this);
    }

    public void onError() {
        Objects.onNotNull(this.listener, new Consumer() {
            public final void accept(Object obj) {
                InterstitialImageAdPresenter.this.lambda$onError$14$InterstitialImageAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    private Timer createCloseButtonTimer(ImageAdInteractor imageAdInteractor, Timer timer) {
        try {
            Integer displayAdCloseInterval = ((ImageAdObject) imageAdInteractor.getAdObject()).getSomaApiContext().getApiAdRequest().getDisplayAdCloseInterval();
            if (displayAdCloseInterval != null) {
                return TimerUtils.createSingleTimer((long) (displayAdCloseInterval.intValue() * 1000));
            }
        } catch (NullPointerException e) {
            this.logger.error(LogDomain.CORE, e, "Null pointer exception", new Object[0]);
        }
        return (Timer) Objects.requireNonNull(timer);
    }
}
