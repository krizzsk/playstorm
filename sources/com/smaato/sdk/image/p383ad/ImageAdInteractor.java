package com.smaato.sdk.image.p383ad;

import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.trackers.BeaconTracker;
import com.smaato.sdk.core.network.trackers.BeaconTrackerAdQualityViolationUtils;
import com.smaato.sdk.core.p378ad.AdInteractor;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.tracker.ImpressionDetector;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.OneTimeActionFactory;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Consumer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.image.ad.ImageAdInteractor */
public class ImageAdInteractor extends AdInteractor<ImageAdObject> {
    private final ImageAdObject adObject;
    private final BeaconTrackerAdQualityViolationUtils adQualityViolationUtils;
    private final BeaconTracker beaconTracker;
    private Callback callback;
    private final ImpressionCountingType impressionCountingType;
    private final LinkHandler linkHandler;
    private final AtomicReference<Boolean> linkHandlingInProgress = new AtomicReference<>(Boolean.FALSE);
    private final Logger logger;

    /* renamed from: com.smaato.sdk.image.ad.ImageAdInteractor$Callback */
    public interface Callback {
        void onImpressionTriggered();
    }

    public ImageAdInteractor(Logger logger2, ImageAdObject imageAdObject, BeaconTracker beaconTracker2, StateMachine<AdStateMachine.Event, AdStateMachine.State> stateMachine, LinkHandler linkHandler2, OneTimeActionFactory oneTimeActionFactory, ImpressionDetector impressionDetector, BeaconTrackerAdQualityViolationUtils beaconTrackerAdQualityViolationUtils) {
        super(imageAdObject, stateMachine, oneTimeActionFactory);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.linkHandler = (LinkHandler) Objects.requireNonNull(linkHandler2);
        this.adObject = (ImageAdObject) Objects.requireNonNull(imageAdObject);
        this.impressionCountingType = imageAdObject.getImpressionCountingType();
        this.adQualityViolationUtils = (BeaconTrackerAdQualityViolationUtils) Objects.requireNonNull(beaconTrackerAdQualityViolationUtils);
        stateMachine.addListener(new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                ImageAdInteractor.this.stateChanged((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        });
        stateMachine.addListener(impressionDetector.stateListener);
        impressionDetector.setOnImpressionStateDetectedCallback(new ImpressionDetector.Callback(impressionDetector, logger2, beaconTracker2, imageAdObject) {
            public final /* synthetic */ ImpressionDetector f$1;
            public final /* synthetic */ Logger f$2;
            public final /* synthetic */ BeaconTracker f$3;
            public final /* synthetic */ ImageAdObject f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void onImpressionStateDetected() {
                ImageAdInteractor.this.lambda$new$0$ImageAdInteractor(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        });
    }

    public /* synthetic */ void lambda$new$0$ImageAdInteractor(ImpressionDetector impressionDetector, Logger logger2, BeaconTracker beaconTracker2, ImageAdObject imageAdObject) {
        impressionDetector.setOnImpressionStateDetectedCallback((ImpressionDetector.Callback) null);
        if (this.impressionCountingType.equals(ImpressionCountingType.STANDARD)) {
            logger2.debug(LogDomain.AD, "Going to send impression beacons", new Object[0]);
            beaconTracker2.trackBeaconUrls(imageAdObject.getImpressionTrackingUrls(), new Consumer() {
                public final void accept(Object obj) {
                    ImageAdInteractor.this.handleImpressionTrackerException((Exception) obj);
                }
            });
            Objects.onNotNull(this.callback, $$Lambda$FMBsgakutzeMHIcP8_PRhy0NyeI.INSTANCE);
        }
    }

    /* renamed from: com.smaato.sdk.image.ad.ImageAdInteractor$1 */
    static /* synthetic */ class C110801 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.CREATED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.ON_SCREEN     // Catch:{ NoSuchFieldError -> 0x001d }
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.CLICKED     // Catch:{ NoSuchFieldError -> 0x0033 }
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.TO_BE_DELETED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.image.p383ad.ImageAdInteractor.C110801.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void stateChanged(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C110801.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 5:
            case 6:
                return;
            case 3:
                if (this.impressionCountingType.equals(ImpressionCountingType.VIEWABLE)) {
                    this.logger.debug(LogDomain.AD, "Going to send impression beacons", new Object[0]);
                    this.beaconTracker.trackBeaconUrls(this.adObject.getImpressionTrackingUrls(), new Consumer() {
                        public final void accept(Object obj) {
                            ImageAdInteractor.this.handleImpressionTrackerException((Exception) obj);
                        }
                    });
                    Objects.onNotNull(this.callback, $$Lambda$FMBsgakutzeMHIcP8_PRhy0NyeI.INSTANCE);
                    return;
                }
                return;
            case 4:
                this.logger.debug(LogDomain.AD, "event %s: going to send impression beacons", state2);
                this.beaconTracker.trackBeaconUrls(((ImageAdObject) getAdObject()).getClickTrackingUrls(), new Consumer() {
                    public final void accept(Object obj) {
                        ImageAdInteractor.this.handleClickTrackerException((Exception) obj);
                    }
                });
                return;
            default:
                this.logger.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public void handleClickUrl(Runnable runnable, Runnable runnable2) {
        Threads.runOnUi(new Runnable(runnable, runnable2) {
            public final /* synthetic */ Runnable f$1;
            public final /* synthetic */ Runnable f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                ImageAdInteractor.this.lambda$handleClickUrl$1$ImageAdInteractor(this.f$1, this.f$2);
            }
        });
    }

    public /* synthetic */ void lambda$handleClickUrl$1$ImageAdInteractor(Runnable runnable, Runnable runnable2) {
        if (!this.linkHandlingInProgress.get().booleanValue()) {
            this.linkHandlingInProgress.set(Boolean.TRUE);
            if (this.linkHandler.handleUrl(this.adObject.getClickUrl())) {
                runnable.run();
            } else {
                runnable2.run();
            }
            this.linkHandlingInProgress.set(Boolean.FALSE);
        }
    }

    public void setOnImpressionTriggered(Callback callback2) {
        this.callback = callback2;
    }

    /* access modifiers changed from: private */
    public void handleImpressionTrackerException(Exception exc) {
        this.adQualityViolationUtils.handleAdQualityViolationIfRequired(this.adObject.getSomaApiContext(), this.adObject.getImpressionTrackingUrls(), exc);
    }

    /* access modifiers changed from: private */
    public void handleClickTrackerException(Exception exc) {
        this.adQualityViolationUtils.handleAdQualityViolationIfRequired(this.adObject.getSomaApiContext(), this.adObject.getClickTrackingUrls(), exc);
    }
}
