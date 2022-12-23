package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.player.VastVideoPlayerPresenter;
import com.smaato.sdk.video.vast.player.VideoPlayerPresenter;
import com.smaato.sdk.video.vast.widget.VastVideoPlayerView;
import com.smaato.sdk.video.vast.widget.element.VastElementPresenter;
import java.lang.ref.WeakReference;

public class VastVideoPlayerPresenter {
    private final VastElementPresenter.Listener companionListener;
    private final VastElementPresenter companionPresenter;
    private final VastElementPresenter.Listener iconListener;
    private final VastElementPresenter iconPresenter;
    /* access modifiers changed from: private */
    public boolean isCompanionHasError;
    /* access modifiers changed from: private */
    public final Logger logger;
    private final StateMachine.Listener<VastPlayerState> vastPlayerStateListener;
    /* access modifiers changed from: private */
    public final StateMachine<VastPlayerEvent, VastPlayerState> vastVideoPlayerStateMachine;
    /* access modifiers changed from: private */
    public WeakReference<VastVideoPlayerView> vastVideoPlayerViewReference = new WeakReference<>((Object) null);
    private final VideoPlayerPresenter.Listener videoPlayerListener;
    /* access modifiers changed from: private */
    public final VastVideoPlayerModel videoPlayerModel;
    private final VideoPlayerPresenter videoPlayerPresenter;

    public /* synthetic */ void lambda$new$0$VastVideoPlayerPresenter(VastPlayerState vastPlayerState, VastPlayerState vastPlayerState2, Metadata metadata) {
        setupPlayerForState(vastPlayerState2);
    }

    VastVideoPlayerPresenter(Logger logger2, VastVideoPlayerModel vastVideoPlayerModel, VisibilityTrackerCreator visibilityTrackerCreator, VastElementPresenter vastElementPresenter, VastElementPresenter vastElementPresenter2, VideoPlayerPresenter videoPlayerPresenter2, StateMachine<VastPlayerEvent, VastPlayerState> stateMachine) {
        C113051 r6 = new VastElementPresenter.Listener() {
            static /* synthetic */ void lambda$onVastElementClicked$0() {
            }

            public void onVastElementClicked(String str) {
                VastVideoPlayerPresenter.this.videoPlayerModel.iconClick(str, $$Lambda$VastVideoPlayerPresenter$1$ys3luZqHkbDvC0BO681GGc9nO8.INSTANCE);
            }

            public void onVastElementRendered() {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onIconRendered", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onIconShown();
            }

            public void onVastElementError(int i) {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onIconError", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onIconError(i);
            }

            public void onRenderProcessGone() {
                VastVideoPlayerPresenter.this.videoPlayerModel.onAdError();
                VastVideoPlayerPresenter.this.closePlayer();
            }
        };
        this.iconListener = r6;
        C113062 r0 = new VideoPlayerPresenter.Listener() {
            public void onVideoStarted(long j, float f) {
                VastVideoPlayerPresenter.this.logger.info(LogDomain.VAST, "VAST video has started", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoStarted((float) j, f);
            }

            public void onVideoImpression() {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoImpression", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoImpression();
            }

            public void onVideoProgressChange(long j, long j2) {
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoProgressChange(j, j2);
            }

            public /* synthetic */ void lambda$onVideoClicked$0$VastVideoPlayerPresenter$2() {
                VastVideoPlayerPresenter.this.onClickSuccess();
            }

            public void onVideoClicked(float f, float f2) {
                VastVideoPlayerPresenter.this.videoPlayerModel.videoClick(f, f2, new Runnable() {
                    public final void run() {
                        VastVideoPlayerPresenter.C113062.this.lambda$onVideoClicked$0$VastVideoPlayerPresenter$2();
                    }
                });
            }

            public void onVideoSkipped() {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoSkipped", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoSkipped();
                VastVideoPlayerPresenter.this.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.VIDEO_SKIPPED);
            }

            public void onMuteClicked() {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onMuteClicked", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoMuteClicked();
            }

            public void onUnmuteClicked() {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onUnmuteClicked", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoUnmuteClicked();
            }

            public void onVideoCompleted() {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoCompleted", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoCompleted();
                VastVideoPlayerPresenter.this.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.VIDEO_COMPLETED);
            }

            public void onVideoError(int i) {
                VastVideoPlayerPresenter.this.logger.error(LogDomain.VAST, "onVideoError", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoError(i);
                VastVideoPlayerPresenter.this.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.ERROR);
            }

            public void onVideoPaused() {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoPaused", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoPaused();
            }

            public void onVideoResumed() {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onVideoResumed", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onVideoResumed();
            }
        };
        this.videoPlayerListener = r0;
        $$Lambda$VastVideoPlayerPresenter$b2LR_p22CJO4YSrzRClk5dDVl5w r1 = new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                VastVideoPlayerPresenter.this.lambda$new$0$VastVideoPlayerPresenter((VastPlayerState) obj, (VastPlayerState) obj2, metadata);
            }
        };
        this.vastPlayerStateListener = r1;
        C113073 r2 = new VastElementPresenter.Listener() {
            public void onVastElementClicked(String str) {
                Objects.onNotNull((VastVideoPlayerView) VastVideoPlayerPresenter.this.vastVideoPlayerViewReference.get(), $$Lambda$VastVideoPlayerPresenter$3$QpQ3qUsRIjfUiftQDZcg1E7sYV8.INSTANCE);
                VastVideoPlayerPresenter.this.videoPlayerModel.companionClick(str, new Runnable() {
                    public final void run() {
                        VastVideoPlayerPresenter.C113073.this.lambda$onVastElementClicked$2$VastVideoPlayerPresenter$3();
                    }
                });
            }

            public /* synthetic */ void lambda$onVastElementClicked$2$VastVideoPlayerPresenter$3() {
                Objects.onNotNull((VastVideoPlayerView) VastVideoPlayerPresenter.this.vastVideoPlayerViewReference.get(), $$Lambda$VastVideoPlayerPresenter$3$rxjY7vEhbzpnt1PGMHW6Z63fI.INSTANCE);
                VastVideoPlayerPresenter.this.onClickSuccess();
            }

            public void onVastElementRendered() {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onCompanionRendered", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onCompanionShown();
            }

            public void onVastElementError(int i) {
                VastVideoPlayerPresenter.this.logger.debug(LogDomain.VAST, "onCompanionError", new Object[0]);
                VastVideoPlayerPresenter.this.videoPlayerModel.onCompanionError(i);
                boolean unused = VastVideoPlayerPresenter.this.isCompanionHasError = true;
            }

            public void onRenderProcessGone() {
                VastVideoPlayerPresenter.this.videoPlayerModel.onAdError();
                VastVideoPlayerPresenter.this.closePlayer();
            }
        };
        this.companionListener = r2;
        this.logger = (Logger) Objects.requireNonNull(logger2);
        this.videoPlayerModel = (VastVideoPlayerModel) Objects.requireNonNull(vastVideoPlayerModel);
        VastElementPresenter vastElementPresenter3 = (VastElementPresenter) Objects.requireNonNull(vastElementPresenter);
        this.companionPresenter = vastElementPresenter3;
        VastElementPresenter vastElementPresenter4 = (VastElementPresenter) Objects.requireNonNull(vastElementPresenter2);
        this.iconPresenter = vastElementPresenter4;
        VideoPlayerPresenter videoPlayerPresenter3 = (VideoPlayerPresenter) Objects.requireNonNull(videoPlayerPresenter2);
        this.videoPlayerPresenter = videoPlayerPresenter3;
        StateMachine<VastPlayerEvent, VastPlayerState> stateMachine2 = (StateMachine) Objects.requireNonNull(stateMachine);
        this.vastVideoPlayerStateMachine = stateMachine2;
        videoPlayerPresenter3.setListener(r0);
        vastElementPresenter3.setListener(r2);
        vastElementPresenter4.setListener(r6);
        stateMachine2.addListener(r1);
    }

    /* access modifiers changed from: private */
    public void onClickSuccess() {
        Threads.runOnUi(new Runnable() {
            public final void run() {
                VastVideoPlayerPresenter.this.lambda$onClickSuccess$1$VastVideoPlayerPresenter();
            }
        });
    }

    public /* synthetic */ void lambda$onClickSuccess$1$VastVideoPlayerPresenter() {
        this.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.CLICKED);
    }

    /* access modifiers changed from: package-private */
    public VastVideoPlayerModel getVideoPlayerModel() {
        return this.videoPlayerModel;
    }

    /* access modifiers changed from: package-private */
    public void attachView(VastVideoPlayerView vastVideoPlayerView) {
        detachView();
        this.vastVideoPlayerViewReference = new WeakReference<>(vastVideoPlayerView);
        vastVideoPlayerView.getIconView().setPresenter(this.iconPresenter);
        vastVideoPlayerView.getCompanionAdView().setPresenter(this.companionPresenter);
        setupPlayerForState(this.vastVideoPlayerStateMachine.getCurrentState());
    }

    /* access modifiers changed from: package-private */
    public void onCloseClicked() {
        this.vastVideoPlayerStateMachine.onEvent(VastPlayerEvent.CLOSE_BUTTON_CLICKED);
    }

    /* access modifiers changed from: package-private */
    public void detachView() {
        Objects.onNotNull((VastVideoPlayerView) this.vastVideoPlayerViewReference.get(), new Consumer() {
            public final void accept(Object obj) {
                VastVideoPlayerPresenter.this.lambda$detachView$2$VastVideoPlayerPresenter((VastVideoPlayerView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$detachView$2$VastVideoPlayerPresenter(VastVideoPlayerView vastVideoPlayerView) {
        this.vastVideoPlayerViewReference.clear();
    }

    /* access modifiers changed from: package-private */
    public void loaded() {
        this.videoPlayerModel.loaded();
    }

    /* access modifiers changed from: package-private */
    public void pause() {
        this.videoPlayerPresenter.pause();
    }

    /* access modifiers changed from: package-private */
    public void resume() {
        this.videoPlayerPresenter.resume();
    }

    private void setupPlayerForState(VastPlayerState vastPlayerState) {
        if (!this.isCompanionHasError || vastPlayerState != VastPlayerState.SHOW_COMPANION) {
            int i = C113084.$SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState[vastPlayerState.ordinal()];
            if (i == 1) {
                showVideoPlayerView();
            } else if (i == 2) {
                showCompanion();
            } else if (i != 3) {
                Logger logger2 = this.logger;
                LogDomain logDomain = LogDomain.VAST;
                logger2.error(logDomain, "Unknown state for VastVideoPlayer: " + vastPlayerState, new Object[0]);
                closePlayer();
            } else {
                closePlayer();
            }
        } else {
            closePlayer();
        }
    }

    /* renamed from: com.smaato.sdk.video.vast.player.VastVideoPlayerPresenter$4 */
    static /* synthetic */ class C113084 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.smaato.sdk.video.vast.player.VastPlayerState[] r0 = com.smaato.sdk.video.vast.player.VastPlayerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState = r0
                com.smaato.sdk.video.vast.player.VastPlayerState r1 = com.smaato.sdk.video.vast.player.VastPlayerState.SHOW_VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.video.vast.player.VastPlayerState r1 = com.smaato.sdk.video.vast.player.VastPlayerState.SHOW_COMPANION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$VastPlayerState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.video.vast.player.VastPlayerState r1 = com.smaato.sdk.video.vast.player.VastPlayerState.CLOSE_PLAYER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.player.VastVideoPlayerPresenter.C113084.<clinit>():void");
        }
    }

    private void clear() {
        this.videoPlayerPresenter.close();
        detachView();
    }

    private void showCompanion() {
        VastVideoPlayerView vastVideoPlayerView = (VastVideoPlayerView) this.vastVideoPlayerViewReference.get();
        if (vastVideoPlayerView != null) {
            vastVideoPlayerView.hidePlayer();
            vastVideoPlayerView.showCompanion();
        }
    }

    private void showVideoPlayerView() {
        VideoPlayerView videoPlayerView;
        VastVideoPlayerView vastVideoPlayerView = (VastVideoPlayerView) this.vastVideoPlayerViewReference.get();
        if (vastVideoPlayerView == null) {
            videoPlayerView = null;
        } else {
            videoPlayerView = vastVideoPlayerView.getVideoPlayerView();
        }
        VideoPlayerPresenter videoPlayerPresenter2 = this.videoPlayerPresenter;
        java.util.Objects.requireNonNull(videoPlayerPresenter2);
        Objects.onNotNull(videoPlayerView, new Consumer() {
            public final void accept(Object obj) {
                VideoPlayerPresenter.this.attachView((VideoPlayerView) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void closePlayer() {
        this.videoPlayerModel.onPlayerClosed();
        clear();
    }
}
