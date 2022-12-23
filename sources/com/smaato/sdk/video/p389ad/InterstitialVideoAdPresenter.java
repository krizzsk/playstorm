package com.smaato.sdk.video.p389ad;

import android.content.Context;
import android.view.View;
import com.smaato.sdk.core.openmeasurement.OMVideoViewabilityTracker;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p378ad.InterstitialAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.player.VastVideoPlayer;
import com.smaato.sdk.video.vast.player.VideoTimings;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.video.ad.InterstitialVideoAdPresenter */
public class InterstitialVideoAdPresenter extends VideoAdPresenter implements InterstitialAdPresenter {
    private WeakReference<InterstitialAdPresenter.Listener> listener = new WeakReference<>((Object) null);
    private WeakReference<Runnable> onFinish = new WeakReference<>((Object) null);
    private WeakReference<Runnable> onShowCloseButton = new WeakReference<>((Object) null);
    private final VastVideoPlayer vastVideoPlayer;

    /* access modifiers changed from: package-private */
    public void onAdCompleted() {
    }

    /* access modifiers changed from: package-private */
    public void onAddedToView() {
    }

    public void setFriendlyObstructionView(View view) {
    }

    InterstitialVideoAdPresenter(VastVideoPlayer vastVideoPlayer2, VideoAdInteractor videoAdInteractor, OMVideoViewabilityTracker oMVideoViewabilityTracker, VideoTimings videoTimings, Map<String, List<ViewabilityVerificationResource>> map) {
        super(vastVideoPlayer2, videoAdInteractor, oMVideoViewabilityTracker, videoTimings, map);
        this.vastVideoPlayer = vastVideoPlayer2;
    }

    public void onCloseClicked() {
        this.vastVideoPlayer.onCloseClicked();
    }

    public void setListener(InterstitialAdPresenter.Listener listener2) {
        this.listener = new WeakReference<>(listener2);
    }

    public AdContentView getAdContentView(Context context) {
        Objects.onNotNull((InterstitialAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$getAdContentView$0$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
        return super.getAdContentView(context);
    }

    public /* synthetic */ void lambda$getAdContentView$0$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onOpen(this);
    }

    public /* synthetic */ void lambda$onShown$1$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
    }

    /* access modifiers changed from: package-private */
    public void onShown() {
        Objects.onNotNull((InterstitialAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onShown$1$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public void setOnShowCloseButtonListener(Runnable runnable) {
        this.onShowCloseButton = new WeakReference<>(runnable);
    }

    public void setOnFinishListener(Runnable runnable) {
        this.onFinish = new WeakReference<>(runnable);
    }

    public /* synthetic */ void lambda$onError$2$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdError(this);
    }

    public void onError() {
        Objects.onNotNull((InterstitialAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onError$2$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onTTLExpired$3$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onTTLExpired(this);
    }

    /* access modifiers changed from: package-private */
    public void onTTLExpired() {
        Objects.onNotNull((InterstitialAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onTTLExpired$3$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onAdClosed() {
        Objects.onNotNull((Runnable) this.onFinish.get(), $$Lambda$huEuq5O9vKGYekRh2sbgvwnUXs.INSTANCE);
        Objects.onNotNull((InterstitialAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onAdClosed$4$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdClosed$4$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onClose(this);
    }

    public /* synthetic */ void lambda$onAdError$5$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdError(this);
    }

    /* access modifiers changed from: package-private */
    public void onAdError() {
        Objects.onNotNull((InterstitialAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onAdError$5$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdClicked$6$InterstitialVideoAdPresenter(InterstitialAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    /* access modifiers changed from: package-private */
    public void onAdClicked() {
        Objects.onNotNull((InterstitialAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                InterstitialVideoAdPresenter.this.lambda$onAdClicked$6$InterstitialVideoAdPresenter((InterstitialAdPresenter.Listener) obj);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onReadyToBeClosed() {
        Objects.onNotNull((Runnable) this.onShowCloseButton.get(), $$Lambda$huEuq5O9vKGYekRh2sbgvwnUXs.INSTANCE);
    }
}
