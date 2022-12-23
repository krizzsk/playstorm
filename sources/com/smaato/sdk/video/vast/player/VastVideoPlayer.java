package com.smaato.sdk.video.vast.player;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.widget.VastVideoPlayerView;

public class VastVideoPlayer {
    /* access modifiers changed from: private */
    public final VastVideoPlayerPresenter vastVideoPlayerPresenter;
    private final VastVideoPlayerViewFactory vastVideoPlayerViewFactory;

    public interface EventListener {
        void onAdClick();

        void onAdError();

        void onClose();

        void onCompanionShown();

        void onComplete();

        void onFirstQuartile();

        void onMidPoint();

        void onMute();

        void onPaused();

        void onResumed();

        void onSkipped();

        void onStart(float f, float f2);

        void onThirdQuartile();

        void onUnmute();

        void onVideoImpression();
    }

    VastVideoPlayer(VastVideoPlayerPresenter vastVideoPlayerPresenter2, VastVideoPlayerViewFactory vastVideoPlayerViewFactory2) {
        this.vastVideoPlayerPresenter = (VastVideoPlayerPresenter) Objects.requireNonNull(vastVideoPlayerPresenter2);
        this.vastVideoPlayerViewFactory = (VastVideoPlayerViewFactory) Objects.requireNonNull(vastVideoPlayerViewFactory2);
    }

    public AdContentView getNewVideoPlayerView(Context context) {
        Objects.requireNonNull(context);
        final VastVideoPlayerView vastVideoPlayerView = this.vastVideoPlayerViewFactory.getVastVideoPlayerView(context);
        vastVideoPlayerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
                VastVideoPlayer.this.vastVideoPlayerPresenter.attachView(vastVideoPlayerView);
            }

            public void onViewDetachedFromWindow(View view) {
                view.removeOnAttachStateChangeListener(this);
                VastVideoPlayer.this.vastVideoPlayerPresenter.detachView();
            }
        });
        return vastVideoPlayerView;
    }

    public void setEventListener(EventListener eventListener) {
        this.vastVideoPlayerPresenter.getVideoPlayerModel().setEventListener(eventListener);
    }

    public void loaded() {
        this.vastVideoPlayerPresenter.loaded();
    }

    public void pause() {
        this.vastVideoPlayerPresenter.pause();
    }

    public void resume() {
        this.vastVideoPlayerPresenter.resume();
    }

    public void onCloseClicked() {
        this.vastVideoPlayerPresenter.onCloseClicked();
    }
}
