package com.smaato.sdk.video.p389ad;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.core.openmeasurement.OMVideoViewabilityTracker;
import com.smaato.sdk.core.openmeasurement.VideoProps;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p378ad.AdInteractor;
import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p378ad.BaseAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.video.p389ad.VideoAdPresenter;
import com.smaato.sdk.video.vast.player.VastVideoPlayer;
import com.smaato.sdk.video.vast.player.VideoTimings;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.video.ad.VideoAdPresenter */
abstract class VideoAdPresenter extends BaseAdPresenter {
    private final VastVideoPlayer.EventListener eventListener;
    /* access modifiers changed from: private */
    public final Map<String, List<ViewabilityVerificationResource>> resources;
    private final StateMachine.Listener<AdStateMachine.State> stateListener;
    private AdInteractor.TtlListener ttlListener = new AdInteractor.TtlListener() {
        public final void onTTLExpired(AdInteractor adInteractor) {
            VideoAdPresenter.this.lambda$new$1$VideoAdPresenter(adInteractor);
        }
    };
    private final VastVideoPlayer vastVideoPlayer;
    /* access modifiers changed from: private */
    public final VideoAdInteractor videoAdInteractor;
    /* access modifiers changed from: private */
    public final VideoTimings videoTimings;
    /* access modifiers changed from: private */
    public final OMVideoViewabilityTracker viewabilityTracker;

    /* access modifiers changed from: package-private */
    public abstract void onAdClicked();

    /* access modifiers changed from: package-private */
    public abstract void onAdClosed();

    /* access modifiers changed from: package-private */
    public abstract void onAdCompleted();

    /* access modifiers changed from: package-private */
    public abstract void onAdError();

    /* access modifiers changed from: package-private */
    public abstract void onAddedToView();

    /* access modifiers changed from: package-private */
    public abstract void onReadyToBeClosed();

    /* access modifiers changed from: package-private */
    public abstract void onShown();

    /* access modifiers changed from: package-private */
    public abstract void onTTLExpired();

    public /* synthetic */ void lambda$new$0$VideoAdPresenter(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        stateChanged(state2);
    }

    public /* synthetic */ void lambda$new$1$VideoAdPresenter(AdInteractor adInteractor) {
        onTTLExpired();
    }

    VideoAdPresenter(VastVideoPlayer vastVideoPlayer2, VideoAdInteractor videoAdInteractor2, OMVideoViewabilityTracker oMVideoViewabilityTracker, VideoTimings videoTimings2, Map<String, List<ViewabilityVerificationResource>> map) {
        super(videoAdInteractor2);
        C112741 r0 = new VastVideoPlayer.EventListener() {
            public void onStart(float f, float f2) {
                VideoAdPresenter.this.videoAdInteractor.onEvent(AdStateMachine.Event.ADDED_ON_SCREEN);
                VideoAdPresenter.this.viewabilityTracker.trackStarted(f, f2);
            }

            public void onMute() {
                VideoAdPresenter.this.viewabilityTracker.trackPlayerVolumeChanged(0.0f);
            }

            public void onUnmute() {
                VideoAdPresenter.this.viewabilityTracker.trackPlayerVolumeChanged(1.0f);
            }

            public void onSkipped() {
                VideoAdPresenter.this.viewabilityTracker.trackSkipped();
            }

            public void onPaused() {
                VideoAdPresenter.this.viewabilityTracker.trackPaused();
            }

            public void onResumed() {
                VideoAdPresenter.this.viewabilityTracker.trackResumed();
            }

            public void onFirstQuartile() {
                VideoAdPresenter.this.viewabilityTracker.trackFirstQuartile();
            }

            public void onMidPoint() {
                VideoAdPresenter.this.viewabilityTracker.trackMidPoint();
            }

            public void onThirdQuartile() {
                VideoAdPresenter.this.viewabilityTracker.trackThirdQuartile();
            }

            public void onClose() {
                VideoAdPresenter.this.videoAdInteractor.addStateListener(new StateMachine.Listener() {
                    public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                        VideoAdPresenter.C112741.this.lambda$onClose$0$VideoAdPresenter$1((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
                    }
                });
                VideoAdPresenter.this.videoAdInteractor.onEvent(AdStateMachine.Event.CLOSE);
            }

            public /* synthetic */ void lambda$onClose$0$VideoAdPresenter$1(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
                if (state2 == AdStateMachine.State.TO_BE_DELETED) {
                    VideoAdPresenter.this.onAdClosed();
                }
            }

            public void onComplete() {
                VideoAdPresenter.this.onAdCompleted();
                VideoAdPresenter.this.viewabilityTracker.trackCompleted();
            }

            public void onCompanionShown() {
                VideoAdPresenter.this.onReadyToBeClosed();
            }

            public void onVideoImpression() {
                VideoAdPresenter.this.videoAdInteractor.onEvent(AdStateMachine.Event.IMPRESSION);
            }

            public void onAdClick() {
                VideoAdPresenter.this.videoAdInteractor.onEvent(AdStateMachine.Event.CLICK);
            }

            public void onAdError() {
                VideoAdPresenter.this.videoAdInteractor.addStateListener(new StateMachine.Listener() {
                    public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                        VideoAdPresenter.C112741.this.lambda$onAdError$1$VideoAdPresenter$1((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
                    }
                });
                VideoAdPresenter.this.videoAdInteractor.onEvent(AdStateMachine.Event.AD_ERROR);
            }

            public /* synthetic */ void lambda$onAdError$1$VideoAdPresenter$1(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
                if (state2 == AdStateMachine.State.TO_BE_DELETED) {
                    VideoAdPresenter.this.onAdError();
                }
            }
        };
        this.eventListener = r0;
        $$Lambda$VideoAdPresenter$RZ91O7MYVh3psGmI3YWS6iI7OAA r1 = new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                VideoAdPresenter.this.lambda$new$0$VideoAdPresenter((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        };
        this.stateListener = r1;
        VastVideoPlayer vastVideoPlayer3 = (VastVideoPlayer) Objects.requireNonNull(vastVideoPlayer2);
        this.vastVideoPlayer = vastVideoPlayer3;
        this.videoAdInteractor = (VideoAdInteractor) Objects.requireNonNull(videoAdInteractor2);
        this.viewabilityTracker = (OMVideoViewabilityTracker) Objects.requireNonNull(oMVideoViewabilityTracker);
        this.videoTimings = (VideoTimings) Objects.requireNonNull(videoTimings2);
        this.resources = (Map) Objects.requireNonNull(map);
        vastVideoPlayer3.setEventListener(r0);
        videoAdInteractor2.addStateListener(r1);
        videoAdInteractor2.addTtlListener(this.ttlListener);
        videoAdInteractor2.onEvent(AdStateMachine.Event.INITIALISE);
    }

    /* renamed from: com.smaato.sdk.video.ad.VideoAdPresenter$3 */
    static /* synthetic */ class C112763 {
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.TO_BE_DELETED     // Catch:{ NoSuchFieldError -> 0x0033 }
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
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.IMPRESSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.core.ad.AdStateMachine$State r1 = com.smaato.sdk.core.p378ad.AdStateMachine.State.CLICKED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.p389ad.VideoAdPresenter.C112763.<clinit>():void");
        }
    }

    private void stateChanged(AdStateMachine.State state) {
        switch (C112763.$SwitchMap$com$smaato$sdk$core$ad$AdStateMachine$State[state.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                onAddedToView();
                return;
            case 6:
                onShown();
                this.viewabilityTracker.trackImpression();
                return;
            case 7:
                onAdClicked();
                this.viewabilityTracker.trackVideoClicked();
                return;
            default:
                throw new IllegalStateException("Unexpected state for RewardedVideoAdPresenter " + state);
        }
    }

    public AdContentView getAdContentView(Context context) {
        AdContentView newVideoPlayerView = this.vastVideoPlayer.getNewVideoPlayerView(context);
        newVideoPlayerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                VideoAdPresenter.this.viewabilityTracker.registerAdView(view, VideoAdPresenter.this.resources);
                VideoAdPresenter.this.viewabilityTracker.startTracking();
                VideoAdPresenter.this.viewabilityTracker.trackPlayerStateChange();
                VideoAdPresenter.this.viewabilityTracker.trackLoaded(VideoAdPresenter.this.videoTimings.isVideoSkippable ? VideoProps.buildForSkippableVideo((float) VideoAdPresenter.this.videoTimings.skipOffsetMillis) : VideoProps.buildForNonSkippableVideo());
            }

            public void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                VideoAdPresenter.this.viewabilityTracker.stopTracking();
            }
        });
        return newVideoPlayerView;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.videoAdInteractor.removeStateListener(this.stateListener);
        this.videoAdInteractor.addStateListener(new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                VideoAdPresenter.this.lambda$onDestroy$2$VideoAdPresenter((AdStateMachine.State) obj, (AdStateMachine.State) obj2, metadata);
            }
        });
        this.videoAdInteractor.onEvent(AdStateMachine.Event.CLOSE);
    }

    public /* synthetic */ void lambda$onDestroy$2$VideoAdPresenter(AdStateMachine.State state, AdStateMachine.State state2, Metadata metadata) {
        if (state2 == AdStateMachine.State.TO_BE_DELETED) {
            onAdClosed();
        }
    }
}
