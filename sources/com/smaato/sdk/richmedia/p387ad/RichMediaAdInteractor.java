package com.smaato.sdk.richmedia.p387ad;

import com.smaato.sdk.core.api.ApiParams;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.api.SomaApiContext;
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
import com.smaato.sdk.core.violationreporter.AdQualityViolationReporter;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdInteractor */
class RichMediaAdInteractor extends AdInteractor<RichMediaAdObject> {
    private final AdQualityViolationReporter adQualityViolationReporter;
    private final BeaconTrackerAdQualityViolationUtils adQualityViolationUtils;
    private final ApiParams apiParams;
    private final BeaconTracker beaconTracker;
    private Callback callback;
    private final ImpressionCountingType impressionCountingType;
    private final LinkHandler linkHandler;
    private final AtomicReference<Boolean> linkHandlingInProgress = new AtomicReference<>(Boolean.FALSE);
    private final Logger logger;
    private final RichMediaAdObject richMediaAdObject;

    /* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdInteractor$Callback */
    public interface Callback {
        void onImpressionTriggered();
    }

    RichMediaAdInteractor(Logger logger2, RichMediaAdObject richMediaAdObject2, BeaconTracker beaconTracker2, StateMachine<AdStateMachine.Event, AdStateMachine.State> stateMachine, LinkHandler linkHandler2, AdQualityViolationReporter adQualityViolationReporter2, OneTimeActionFactory oneTimeActionFactory, ImpressionDetector impressionDetector, BeaconTrackerAdQualityViolationUtils beaconTrackerAdQualityViolationUtils, ApiParams apiParams2) {
        super(richMediaAdObject2, stateMachine, oneTimeActionFactory);
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.beaconTracker = (BeaconTracker) Objects.requireNonNull(beaconTracker2);
        this.linkHandler = (LinkHandler) Objects.requireNonNull(linkHandler2);
        this.richMediaAdObject = richMediaAdObject2;
        this.impressionCountingType = richMediaAdObject2.getImpressionCountingType();
        this.adQualityViolationReporter = (AdQualityViolationReporter) Objects.requireNonNull(adQualityViolationReporter2);
        this.adQualityViolationUtils = (BeaconTrackerAdQualityViolationUtils) Objects.requireNonNull(beaconTrackerAdQualityViolationUtils);
        this.apiParams = apiParams2;
        stateMachine.addListener(new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                RichMediaAdInteractor.this.stateChanged((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        });
        stateMachine.addListener(impressionDetector.stateListener);
        impressionDetector.setOnImpressionStateDetectedCallback(new ImpressionDetector.Callback(impressionDetector, logger2, beaconTracker2) {
            public final /* synthetic */ ImpressionDetector f$1;
            public final /* synthetic */ Logger f$2;
            public final /* synthetic */ BeaconTracker f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void onImpressionStateDetected() {
                RichMediaAdInteractor.this.lambda$new$0$RichMediaAdInteractor(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public /* synthetic */ void lambda$new$0$RichMediaAdInteractor(ImpressionDetector impressionDetector, Logger logger2, BeaconTracker beaconTracker2) {
        impressionDetector.setOnImpressionStateDetectedCallback((ImpressionDetector.Callback) null);
        if (this.impressionCountingType.equals(ImpressionCountingType.STANDARD)) {
            logger2.debug(LogDomain.AD, "Going to send impression beacons", new Object[0]);
            beaconTracker2.trackBeaconUrls(this.richMediaAdObject.getImpressionTrackingUrls(), new Consumer() {
                public final void accept(Object obj) {
                    RichMediaAdInteractor.this.handleImpressionTrackerException((Exception) obj);
                }
            });
            Objects.onNotNull(this.callback, $$Lambda$m3Ktp1gi43if_DIEgrk6mpt0tc.INSTANCE);
        }
    }

    /* renamed from: com.smaato.sdk.richmedia.ad.RichMediaAdInteractor$1 */
    static /* synthetic */ class C112371 {
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.CLICKED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0049 }
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
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.richmedia.p387ad.RichMediaAdInteractor.C112371.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void stateChanged(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        switch (C112371.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                return;
            case 4:
                if (this.impressionCountingType.equals(ImpressionCountingType.VIEWABLE)) {
                    this.logger.debug(LogDomain.AD, "Going to send impression beacons", new Object[0]);
                    this.beaconTracker.trackBeaconUrls(this.richMediaAdObject.getImpressionTrackingUrls(), new Consumer() {
                        public final void accept(Object obj) {
                            RichMediaAdInteractor.this.handleImpressionTrackerException((Exception) obj);
                        }
                    });
                    Objects.onNotNull(this.callback, $$Lambda$m3Ktp1gi43if_DIEgrk6mpt0tc.INSTANCE);
                    return;
                }
                return;
            case 5:
                this.logger.debug(LogDomain.AD, "event %s: going to send click beacons", state2);
                this.beaconTracker.trackBeaconUrls(((RichMediaAdObject) getAdObject()).getClickTrackingUrls(), new Consumer() {
                    public final void accept(Object obj) {
                        RichMediaAdInteractor.this.handleClickTrackerException((Exception) obj);
                    }
                });
                return;
            default:
                this.logger.error(LogDomain.AD, "Unexpected type of new state: %s", state2);
                return;
        }
    }

    public void handleClickUrl(String str, Runnable runnable, Runnable runnable2) {
        Threads.runOnUi(new Runnable(str, runnable, runnable2) {
            public final /* synthetic */ String f$1;
            public final /* synthetic */ Runnable f$2;
            public final /* synthetic */ Runnable f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                RichMediaAdInteractor.this.lambda$handleClickUrl$1$RichMediaAdInteractor(this.f$1, this.f$2, this.f$3);
            }
        });
    }

    public /* synthetic */ void lambda$handleClickUrl$1$RichMediaAdInteractor(String str, Runnable runnable, Runnable runnable2) {
        if (!this.linkHandlingInProgress.get().booleanValue()) {
            this.linkHandlingInProgress.set(Boolean.TRUE);
            if (this.linkHandler.handleUrl(str)) {
                runnable.run();
            } else {
                runnable2.run();
            }
            this.linkHandlingInProgress.set(Boolean.FALSE);
        }
    }

    /* access modifiers changed from: package-private */
    public void reportAdViolation(String str, String str2) {
        SomaApiContext somaApiContext = ((RichMediaAdObject) getAdObject()).getSomaApiContext();
        this.adQualityViolationReporter.reportRichMediaAdViolation(str, somaApiContext.getApiAdResponse().getResponseHeaders(), somaApiContext.getApiAdRequest().getPublisherId(), somaApiContext.getApiAdRequest().getAdSpaceId(), this.apiParams.getBundle(), this.apiParams.getClient(), str2, ((RichMediaAdObject) getAdObject()).getContent(), ((RichMediaAdObject) getAdObject()).getClickTrackingUrls());
    }

    /* access modifiers changed from: package-private */
    public void setOnImpressionTriggered(Callback callback2) {
        this.callback = callback2;
    }

    /* access modifiers changed from: private */
    public void handleImpressionTrackerException(Exception exc) {
        this.adQualityViolationUtils.handleAdQualityViolationIfRequired(((RichMediaAdObject) getAdObject()).getSomaApiContext(), ((RichMediaAdObject) getAdObject()).getClickTrackingUrls(), exc);
    }

    /* access modifiers changed from: private */
    public void handleClickTrackerException(Exception exc) {
        this.adQualityViolationUtils.handleAdQualityViolationIfRequired(((RichMediaAdObject) getAdObject()).getSomaApiContext(), ((RichMediaAdObject) getAdObject()).getClickTrackingUrls(), exc);
    }
}
