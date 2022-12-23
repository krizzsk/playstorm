package com.smaato.sdk.image.p383ad;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.appbgdetection.AppBackgroundDetector;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.openmeasurement.OMImageViewabilityTracker;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p378ad.AdInteractor;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BannerAdPresenter;
import com.smaato.sdk.core.p378ad.BaseAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.tracker.VisibilityTracker;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.tracker.VisibilityTrackerListener;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.image.p383ad.ImageAdInteractor;
import com.smaato.sdk.image.p384ui.StaticImageAdContentView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.image.ad.BannerImageAdPresenter */
class BannerImageAdPresenter extends BaseAdPresenter implements BannerAdPresenter {
    /* access modifiers changed from: private */
    public final ImageAdInteractor adInteractor;
    private View adView;
    private final AppBackgroundDetector appBackgroundDetector;
    private WeakReference<StaticImageAdContentView> contentViewRef = new WeakReference<>((Object) null);
    private final VisibilityTrackerCreator imageVisibilityTrackerCreator;
    private WeakReference<BannerAdPresenter.Listener> listener = new WeakReference<>((Object) null);
    private final Logger logger;
    private final OMImageViewabilityTracker omImageViewabilityTracker;
    private StateMachine.Listener<AdStateMachine.State> stateListener;
    private AdInteractor.TtlListener ttlListener = new AdInteractor.TtlListener() {
        public final void onTTLExpired(AdInteractor adInteractor) {
            BannerImageAdPresenter.this.lambda$new$1$BannerImageAdPresenter(adInteractor);
        }
    };
    private final AtomicReference<VisibilityTracker> visibilityTrackerRef = new AtomicReference<>();

    public /* synthetic */ void lambda$new$0$BannerImageAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onTTLExpired(this);
    }

    public /* synthetic */ void lambda$new$1$BannerImageAdPresenter(AdInteractor adInteractor2) {
        Objects.onNotNull((BannerAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerImageAdPresenter.this.lambda$new$0$BannerImageAdPresenter((BannerAdPresenter.Listener) obj);
            }
        });
    }

    BannerImageAdPresenter(Logger logger2, ImageAdInteractor imageAdInteractor, VisibilityTrackerCreator visibilityTrackerCreator, AppBackgroundDetector appBackgroundDetector2, OMImageViewabilityTracker oMImageViewabilityTracker) {
        super(imageAdInteractor);
        this.omImageViewabilityTracker = oMImageViewabilityTracker;
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.adInteractor = (ImageAdInteractor) Objects.requireNonNull(imageAdInteractor);
        this.imageVisibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator);
        this.appBackgroundDetector = (AppBackgroundDetector) Objects.requireNonNull(appBackgroundDetector2);
        $$Lambda$BannerImageAdPresenter$8fsYe8QGXTI6QwGs3PkhvEFQdU r5 = new StateMachine.Listener(imageAdInteractor, logger2) {
            public final /* synthetic */ ImageAdInteractor f$1;
            public final /* synthetic */ Logger f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                BannerImageAdPresenter.this.lambda$new$3$BannerImageAdPresenter(this.f$1, this.f$2, (AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        this.stateListener = r5;
        imageAdInteractor.addStateListener(r5);
        imageAdInteractor.addTtlListener(this.ttlListener);
        imageAdInteractor.setOnImpressionTriggered(new ImageAdInteractor.Callback() {
            public final void onImpressionTriggered() {
                BannerImageAdPresenter.this.lambda$new$5$BannerImageAdPresenter();
            }
        });
    }

    /* renamed from: com.smaato.sdk.image.ad.BannerImageAdPresenter$2 */
    static /* synthetic */ class C110792 {
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
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.p383ad.BannerImageAdPresenter.C110792.<clinit>():void");
        }
    }

    public /* synthetic */ void lambda$new$3$BannerImageAdPresenter(ImageAdInteractor imageAdInteractor, Logger logger2, AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C110792.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                if (this.adView != null) {
                    addOMEvent();
                    return;
                }
                return;
            case 6:
                Objects.onNotNull((BannerAdPresenter.Listener) this.listener.get(), new Consumer() {
                    public final void accept(Object obj) {
                        BannerImageAdPresenter.this.lambda$new$2$BannerImageAdPresenter((BannerAdPresenter.Listener) obj);
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

    public /* synthetic */ void lambda$new$2$BannerImageAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    public /* synthetic */ void lambda$new$4$BannerImageAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
    }

    public /* synthetic */ void lambda$new$5$BannerImageAdPresenter() {
        Objects.onNotNull((BannerAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerImageAdPresenter.this.lambda$new$4$BannerImageAdPresenter((BannerAdPresenter.Listener) obj);
            }
        });
    }

    public void initialize() {
        this.adInteractor.onEvent(AdStateMachine.Event.INITIALISE);
    }

    public AdContentView getAdContentView(Context context) {
        StaticImageAdContentView create = StaticImageAdContentView.create(context, (ImageAdObject) this.adInteractor.getAdObject(), new View.OnClickListener() {
            public final void onClick(View view) {
                BannerImageAdPresenter.this.lambda$getAdContentView$11$BannerImageAdPresenter(view);
            }
        });
        this.contentViewRef = new WeakReference<>(create);
        create.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                BannerImageAdPresenter.this.adInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
            }

            public void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
            }
        });
        this.visibilityTrackerRef.set(this.imageVisibilityTrackerCreator.createTracker(create, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                BannerImageAdPresenter.this.lambda$getAdContentView$12$BannerImageAdPresenter();
            }
        }, this.adInteractor.getAdObject() != null ? ((ImageAdObject) this.adInteractor.getAdObject()).getImpressionCountingType() : ImpressionCountingType.STANDARD));
        this.adView = create;
        this.omImageViewabilityTracker.registerAdView(create, getViewabilityResourcesMap());
        return create;
    }

    public /* synthetic */ void lambda$getAdContentView$11$BannerImageAdPresenter(View view) {
        if (this.appBackgroundDetector.isAppInBackground()) {
            this.logger.info(LogDomain.AD, "skipping click event, because app is in background", new Object[0]);
            return;
        }
        ((StaticImageAdContentView) view).showProgressIndicator(true);
        this.adInteractor.handleClickUrl(new Runnable() {
            public final void run() {
                BannerImageAdPresenter.this.lambda$getAdContentView$7$BannerImageAdPresenter();
            }
        }, new Runnable() {
            public final void run() {
                BannerImageAdPresenter.this.lambda$getAdContentView$10$BannerImageAdPresenter();
            }
        });
        this.adInteractor.onEvent(AdStateMachine.Event.CLICK);
    }

    public /* synthetic */ void lambda$getAdContentView$7$BannerImageAdPresenter() {
        Objects.onNotNull((StaticImageAdContentView) this.contentViewRef.get(), $$Lambda$BannerImageAdPresenter$eeOaKlTyXKuk5P319_1FRBFgso.INSTANCE);
    }

    public /* synthetic */ void lambda$getAdContentView$10$BannerImageAdPresenter() {
        this.logger.error(LogDomain.AD, "The url seems to be invalid", new Object[0]);
        Objects.onNotNull((BannerAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerImageAdPresenter.this.lambda$getAdContentView$8$BannerImageAdPresenter((BannerAdPresenter.Listener) obj);
            }
        });
        Objects.onNotNull((StaticImageAdContentView) this.contentViewRef.get(), $$Lambda$BannerImageAdPresenter$DtK26dWEB9JHjS2sPV2hAE32el0.INSTANCE);
    }

    public /* synthetic */ void lambda$getAdContentView$8$BannerImageAdPresenter(BannerAdPresenter.Listener listener2) {
        listener2.onAdError(this);
    }

    public /* synthetic */ void lambda$getAdContentView$12$BannerImageAdPresenter() {
        this.adInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.adInteractor.onEvent(AdStateMachine.Event.DESTROY);
        Objects.onNotNull(this.visibilityTrackerRef.get(), new Consumer() {
            public final void accept(Object obj) {
                BannerImageAdPresenter.this.lambda$onDestroy$13$BannerImageAdPresenter((VisibilityTracker) obj);
            }
        });
        this.contentViewRef.clear();
        this.listener.clear();
    }

    public /* synthetic */ void lambda$onDestroy$13$BannerImageAdPresenter(VisibilityTracker visibilityTracker) {
        visibilityTracker.destroy();
        this.visibilityTrackerRef.set((Object) null);
    }

    public void setListener(BannerAdPresenter.Listener listener2) {
        this.listener = new WeakReference<>(listener2);
    }

    private void addOMEvent() {
        if (!this.omImageViewabilityTracker.isTracked()) {
            this.omImageViewabilityTracker.startTracking();
            this.omImageViewabilityTracker.trackLoaded();
            this.omImageViewabilityTracker.trackImpression();
            this.omImageViewabilityTracker.setHasTracked(true);
        }
    }

    private Map<String, List<ViewabilityVerificationResource>> getViewabilityResourcesMap() {
        HashMap hashMap = new HashMap();
        try {
            List<Extension> list = (List) ((ImageAdObject) this.adInteractor.getAdObject()).getExtensions();
            if (list != null) {
                for (Extension extension : list) {
                    if (extension != null && extension.getName().equalsIgnoreCase(Extension.f27145OM)) {
                        ViewabilityVerificationResource viewabilityVerificationResource = new ViewabilityVerificationResource(extension.getExtConfig().getVendorKey(), extension.getScript(), "", extension.getExtConfig().getVerificationParam(), true);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(viewabilityVerificationResource);
                        hashMap.put(CampaignEx.KEY_OMID, arrayList);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.logger.error(LogDomain.AD, e, "error in getting viewability resource map", new Object[0]);
        }
        return hashMap;
    }
}
