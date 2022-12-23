package com.smaato.sdk.video.vast.player;

import android.view.Surface;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.tracker.VisibilityTracker;
import com.smaato.sdk.core.tracker.VisibilityTrackerCreator;
import com.smaato.sdk.core.tracker.VisibilityTrackerListener;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.utils.RepeatableAction;
import com.smaato.sdk.video.vast.model.VastMediaFileScenario;
import com.smaato.sdk.video.vast.player.VideoPlayer;
import com.smaato.sdk.video.vast.player.VideoPlayerPresenter;
import com.smaato.sdk.video.vast.player.exception.VideoPlayerException;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

class VideoPlayerPresenter {
    private ImpressionCountingType impressionCountingType = ImpressionCountingType.STANDARD;
    private long lastCurrentPositionMillis;
    private final SkipButtonVisibilityManager skipButtonVisibilityManager;
    private final VastMediaFileScenario vastMediaFileScenario;
    private final VisibilityTrackerCreator vastVisibilityTrackerCreator;
    private final VideoPlayer videoPlayer;
    private final VideoPlayer.LifecycleListener videoPlayerLifecycleListener;
    /* access modifiers changed from: private */
    public Listener videoPlayerPresenterListener;
    private WeakReference<VideoPlayerView> videoPlayerViewRef;
    /* access modifiers changed from: private */
    public final RepeatableAction videoProgressCheckAction;
    private final VideoViewResizeManager videoViewResizeManager;
    private final AtomicReference<VisibilityTracker> visibilityTrackerAtomicRef;

    interface Listener {
        void onMuteClicked();

        void onUnmuteClicked();

        void onVideoClicked(float f, float f2);

        void onVideoCompleted();

        void onVideoError(int i);

        void onVideoImpression();

        void onVideoPaused();

        void onVideoProgressChange(long j, long j2);

        void onVideoResumed();

        void onVideoSkipped();

        void onVideoStarted(long j, float f);
    }

    /* access modifiers changed from: package-private */
    public void onSurfaceChanged(Surface surface, int i, int i2) {
    }

    VideoPlayerPresenter(VideoPlayer videoPlayer2, VastMediaFileScenario vastMediaFileScenario2, VideoViewResizeManager videoViewResizeManager2, SkipButtonVisibilityManager skipButtonVisibilityManager2, VisibilityTrackerCreator visibilityTrackerCreator, RepeatableActionFactory repeatableActionFactory, ImpressionCountingType impressionCountingType2) {
        C113101 r0 = new VideoPlayer.LifecycleListener() {
            public void onReleased(VideoPlayer videoPlayer) {
            }

            public void onSeekComplete(VideoPlayer videoPlayer) {
            }

            public void onStarted(VideoPlayer videoPlayer) {
                VideoPlayerPresenter.this.videoProgressCheckAction.start();
                Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, new Consumer() {
                    public final void accept(Object obj) {
                        ((VideoPlayerPresenter.Listener) obj).onVideoStarted(VideoPlayer.this.getDuration(), VideoPlayer.this.getCurrentVolume());
                    }
                });
            }

            public void onResumed(VideoPlayer videoPlayer) {
                VideoPlayerPresenter.this.videoProgressCheckAction.start();
                Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, $$Lambda$sCJgdSnaYECU12vVJ9u3Dosn9rI.INSTANCE);
            }

            public void onPaused(VideoPlayer videoPlayer) {
                Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, $$Lambda$yKuADDDAd5PGrUQfm_tTUA2m_ro.INSTANCE);
                VideoPlayerPresenter.this.videoProgressCheckAction.stop();
            }

            public void onStopped(VideoPlayer videoPlayer) {
                VideoPlayerPresenter.this.videoProgressCheckAction.stop();
            }

            public void onCompleted(VideoPlayer videoPlayer) {
                Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, $$Lambda$kWGw60ziXycWUiyXA1FvlxdP_zo.INSTANCE);
                VideoPlayerPresenter.this.videoProgressCheckAction.stop();
            }

            public void onReset(VideoPlayer videoPlayer) {
                VideoPlayerPresenter.this.videoProgressCheckAction.stop();
            }

            public void onError(VideoPlayer videoPlayer, VideoPlayerException videoPlayerException) {
                Objects.onNotNull(VideoPlayerPresenter.this.videoPlayerPresenterListener, $$Lambda$VideoPlayerPresenter$1$KYf6bWHFtx50IxGq9O6SUyQK4.INSTANCE);
                VideoPlayerPresenter.this.videoProgressCheckAction.stop();
            }
        };
        this.videoPlayerLifecycleListener = r0;
        this.videoPlayerViewRef = new WeakReference<>((Object) null);
        this.videoPlayer = (VideoPlayer) Objects.requireNonNull(videoPlayer2);
        this.vastMediaFileScenario = (VastMediaFileScenario) Objects.requireNonNull(vastMediaFileScenario2);
        this.videoViewResizeManager = (VideoViewResizeManager) Objects.requireNonNull(videoViewResizeManager2);
        this.skipButtonVisibilityManager = (SkipButtonVisibilityManager) Objects.requireNonNull(skipButtonVisibilityManager2);
        this.vastVisibilityTrackerCreator = (VisibilityTrackerCreator) Objects.requireNonNull(visibilityTrackerCreator);
        this.videoProgressCheckAction = (RepeatableAction) Objects.requireNonNull(repeatableActionFactory.createRepeatableAction(new RepeatableAction.Listener() {
            public final void doAction() {
                VideoPlayerPresenter.this.checkVideoProgress();
            }
        }));
        this.visibilityTrackerAtomicRef = new AtomicReference<>();
        this.impressionCountingType = impressionCountingType2;
        videoPlayer2.setLifecycleListener(r0);
        videoPlayer2.setOnVolumeChangeListener(new VideoPlayer.OnVolumeChangeListener() {
            public final void onVolumeChanged(float f) {
                VideoPlayerPresenter.this.onVolumeChanged(f);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onVolumeChanged(float f) {
        boolean z = f == 0.0f;
        Objects.onNotNull((VideoPlayerView) this.videoPlayerViewRef.get(), new Consumer(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                ((VideoPlayerView) obj).changeMuteIcon(this.f$0);
            }
        });
        Objects.onNotNull(this.videoPlayerPresenterListener, new Consumer(z) {
            public final /* synthetic */ boolean f$0;

            {
                this.f$0 = r1;
            }

            public final void accept(Object obj) {
                VideoPlayerPresenter.lambda$onVolumeChanged$1(this.f$0, (VideoPlayerPresenter.Listener) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onVolumeChanged$1(boolean z, Listener listener) {
        if (z) {
            listener.onMuteClicked();
        } else {
            listener.onUnmuteClicked();
        }
    }

    /* access modifiers changed from: package-private */
    public void setListener(Listener listener) {
        this.videoPlayerPresenterListener = listener;
    }

    /* access modifiers changed from: private */
    public void checkVideoProgress() {
        long currentPositionMillis = this.videoPlayer.getCurrentPositionMillis();
        if (currentPositionMillis != this.lastCurrentPositionMillis) {
            this.lastCurrentPositionMillis = currentPositionMillis;
            onProgressChanged(currentPositionMillis);
        }
    }

    /* access modifiers changed from: package-private */
    public void attachView(VideoPlayerView videoPlayerView) {
        this.videoPlayerViewRef = new WeakReference<>(videoPlayerView);
        videoPlayerView.setVideoPlayerPresenter(this);
        videoPlayerView.changeMuteIcon(this.videoPlayer.getCurrentVolume() == 0.0f);
    }

    /* access modifiers changed from: package-private */
    public void detachView() {
        this.videoPlayerViewRef.clear();
        destroyVisibilityTracker();
    }

    /* access modifiers changed from: package-private */
    public void close() {
        this.videoPlayerViewRef.clear();
        destroyVisibilityTracker();
        this.videoPlayer.stop();
        this.videoPlayer.release();
    }

    /* access modifiers changed from: package-private */
    public void pause() {
        this.videoPlayer.pause();
    }

    /* access modifiers changed from: package-private */
    public void resume() {
        this.videoPlayer.start();
    }

    /* access modifiers changed from: package-private */
    public void onSurfaceAvailable(Surface surface) {
        Objects.onNotNull((VideoPlayerView) this.videoPlayerViewRef.get(), new Consumer() {
            public final void accept(Object obj) {
                VideoPlayerPresenter.this.lambda$onSurfaceAvailable$2$VideoPlayerPresenter((VideoPlayerView) obj);
            }
        });
        this.videoPlayer.setSurface(surface);
        this.videoPlayer.start();
    }

    public /* synthetic */ void lambda$onSurfaceAvailable$2$VideoPlayerPresenter(VideoPlayerView videoPlayerView) {
        this.visibilityTrackerAtomicRef.set(createVisibilityTrackerForView(videoPlayerView));
    }

    /* access modifiers changed from: package-private */
    public void onSurfaceDestroyed(Surface surface) {
        destroyVisibilityTracker();
        this.videoPlayer.setSurface((Surface) null);
        this.videoPlayer.pause();
    }

    /* access modifiers changed from: package-private */
    public void onViewMeasured(VideoPlayerView videoPlayerView, int i, int i2) {
        this.videoViewResizeManager.resizeToContainerSizes(videoPlayerView, i, i2);
    }

    /* access modifiers changed from: package-private */
    public void onVideoClicked(float f, float f2) {
        Objects.onNotNull(this.videoPlayerPresenterListener, new Consumer(f, f2) {
            public final /* synthetic */ float f$0;
            public final /* synthetic */ float f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((VideoPlayerPresenter.Listener) obj).onVideoClicked(this.f$0, this.f$1);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onSkipClicked() {
        Objects.onNotNull(this.videoPlayerPresenterListener, $$Lambda$VikFNIf8dscuXVazY8XFtvll8o0.INSTANCE);
        close();
    }

    /* access modifiers changed from: package-private */
    public void onMuteClicked() {
        float f = 0.0f;
        boolean z = this.videoPlayer.getCurrentVolume() == 0.0f;
        VideoPlayer videoPlayer2 = this.videoPlayer;
        if (z) {
            f = 1.0f;
        }
        videoPlayer2.setVolume(f);
    }

    private VisibilityTracker createVisibilityTrackerForView(VideoPlayerView videoPlayerView) {
        return this.vastVisibilityTrackerCreator.createTracker(videoPlayerView, new VisibilityTrackerListener() {
            public final void onVisibilityHappen() {
                VideoPlayerPresenter.this.lambda$createVisibilityTrackerForView$4$VideoPlayerPresenter();
            }
        }, this.impressionCountingType);
    }

    public /* synthetic */ void lambda$createVisibilityTrackerForView$4$VideoPlayerPresenter() {
        Objects.onNotNull(this.videoPlayerPresenterListener, $$Lambda$fzbpppBPpEtt7AXA53allQZDEU.INSTANCE);
    }

    private void destroyVisibilityTracker() {
        Objects.onNotNull(this.visibilityTrackerAtomicRef.get(), new Consumer() {
            public final void accept(Object obj) {
                VideoPlayerPresenter.this.lambda$destroyVisibilityTracker$5$VideoPlayerPresenter((VisibilityTracker) obj);
            }
        });
    }

    public /* synthetic */ void lambda$destroyVisibilityTracker$5$VideoPlayerPresenter(VisibilityTracker visibilityTracker) {
        visibilityTracker.destroy();
        this.visibilityTrackerAtomicRef.set((Object) null);
    }

    private void onProgressChanged(long j) {
        long duration = this.videoPlayer.getDuration();
        Objects.onNotNull(this.videoPlayerPresenterListener, new Consumer(j, duration) {
            public final /* synthetic */ long f$0;
            public final /* synthetic */ long f$1;

            {
                this.f$0 = r1;
                this.f$1 = r3;
            }

            public final void accept(Object obj) {
                ((VideoPlayerPresenter.Listener) obj).onVideoProgressChange(this.f$0, this.f$1);
            }
        });
        Objects.onNotNull((VideoPlayerView) this.videoPlayerViewRef.get(), new Consumer(j, duration) {
            public final /* synthetic */ long f$1;
            public final /* synthetic */ long f$2;

            {
                this.f$1 = r2;
                this.f$2 = r4;
            }

            public final void accept(Object obj) {
                VideoPlayerPresenter.this.lambda$onProgressChanged$7$VideoPlayerPresenter(this.f$1, this.f$2, (VideoPlayerView) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onProgressChanged$7$VideoPlayerPresenter(long j, long j2, VideoPlayerView videoPlayerView) {
        videoPlayerView.updateProgressBar(j, j2);
        this.skipButtonVisibilityManager.onProgressChange(j, videoPlayerView);
    }
}
