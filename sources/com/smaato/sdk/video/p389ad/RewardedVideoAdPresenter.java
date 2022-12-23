package com.smaato.sdk.video.p389ad;

import android.content.Context;
import com.smaato.sdk.core.openmeasurement.OMVideoViewabilityTracker;
import com.smaato.sdk.core.openmeasurement.ViewabilityVerificationResource;
import com.smaato.sdk.core.p378ad.RewardedAdPresenter;
import com.smaato.sdk.core.p381ui.AdContentView;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.player.VastVideoPlayer;
import com.smaato.sdk.video.vast.player.VideoTimings;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.smaato.sdk.video.ad.RewardedVideoAdPresenter */
public class RewardedVideoAdPresenter extends VideoAdPresenter implements RewardedAdPresenter {
    private WeakReference<RewardedAdPresenter.Listener> listener = new WeakReference<>((Object) null);
    private WeakReference<RewardedAdPresenter.OnCloseEnabledListener> onCloseEnabledListener = new WeakReference<>((Object) null);
    private final VastVideoPlayer vastVideoPlayer;

    public /* bridge */ /* synthetic */ AdContentView getAdContentView(Context context) {
        return super.getAdContentView(context);
    }

    RewardedVideoAdPresenter(VastVideoPlayer vastVideoPlayer2, VideoAdInteractor videoAdInteractor, OMVideoViewabilityTracker oMVideoViewabilityTracker, VideoTimings videoTimings, Map<String, List<ViewabilityVerificationResource>> map) {
        super(vastVideoPlayer2, videoAdInteractor, oMVideoViewabilityTracker, videoTimings, map);
        this.vastVideoPlayer = vastVideoPlayer2;
    }

    public RewardedAdPresenter.Listener getListener() {
        return (RewardedAdPresenter.Listener) this.listener.get();
    }

    public void setListener(RewardedAdPresenter.Listener listener2) {
        this.listener = new WeakReference<>(listener2);
    }

    public void setOnCloseEnabledListener(RewardedAdPresenter.OnCloseEnabledListener onCloseEnabledListener2) {
        this.onCloseEnabledListener = new WeakReference<>(onCloseEnabledListener2);
    }

    public void onCloseClicked() {
        this.vastVideoPlayer.onCloseClicked();
    }

    public /* synthetic */ void lambda$onAddedToView$0$RewardedVideoAdPresenter(RewardedAdPresenter.Listener listener2) {
        listener2.onStart(this);
    }

    /* access modifiers changed from: package-private */
    public void onAddedToView() {
        Objects.onNotNull((RewardedAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                RewardedVideoAdPresenter.this.lambda$onAddedToView$0$RewardedVideoAdPresenter((RewardedAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onShown$1$RewardedVideoAdPresenter(RewardedAdPresenter.Listener listener2) {
        listener2.onAdImpressed(this);
    }

    /* access modifiers changed from: package-private */
    public void onShown() {
        Objects.onNotNull((RewardedAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                RewardedVideoAdPresenter.this.lambda$onShown$1$RewardedVideoAdPresenter((RewardedAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdCompleted$2$RewardedVideoAdPresenter(RewardedAdPresenter.Listener listener2) {
        listener2.onCompleted(this);
    }

    /* access modifiers changed from: package-private */
    public void onAdCompleted() {
        Objects.onNotNull((RewardedAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                RewardedVideoAdPresenter.this.lambda$onAdCompleted$2$RewardedVideoAdPresenter((RewardedAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onTTLExpired$3$RewardedVideoAdPresenter(RewardedAdPresenter.Listener listener2) {
        listener2.onTTLExpired(this);
    }

    /* access modifiers changed from: package-private */
    public void onTTLExpired() {
        Objects.onNotNull((RewardedAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                RewardedVideoAdPresenter.this.lambda$onTTLExpired$3$RewardedVideoAdPresenter((RewardedAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdClosed$4$RewardedVideoAdPresenter(RewardedAdPresenter.Listener listener2) {
        listener2.onClose(this);
    }

    /* access modifiers changed from: package-private */
    public void onAdClosed() {
        Objects.onNotNull((RewardedAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                RewardedVideoAdPresenter.this.lambda$onAdClosed$4$RewardedVideoAdPresenter((RewardedAdPresenter.Listener) obj);
            }
        });
        Objects.onNotNull((RewardedAdPresenter.OnCloseEnabledListener) this.onCloseEnabledListener.get(), new Consumer() {
            public final void accept(Object obj) {
                RewardedVideoAdPresenter.this.lambda$onAdClosed$5$RewardedVideoAdPresenter((RewardedAdPresenter.OnCloseEnabledListener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdClosed$5$RewardedVideoAdPresenter(RewardedAdPresenter.OnCloseEnabledListener onCloseEnabledListener2) {
        onCloseEnabledListener2.onClose(this);
    }

    public /* synthetic */ void lambda$onAdError$6$RewardedVideoAdPresenter(RewardedAdPresenter.Listener listener2) {
        listener2.onAdError(this);
    }

    /* access modifiers changed from: package-private */
    public void onAdError() {
        Objects.onNotNull((RewardedAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                RewardedVideoAdPresenter.this.lambda$onAdError$6$RewardedVideoAdPresenter((RewardedAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onAdClicked$7$RewardedVideoAdPresenter(RewardedAdPresenter.Listener listener2) {
        listener2.onAdClicked(this);
    }

    /* access modifiers changed from: package-private */
    public void onAdClicked() {
        Objects.onNotNull((RewardedAdPresenter.Listener) this.listener.get(), new Consumer() {
            public final void accept(Object obj) {
                RewardedVideoAdPresenter.this.lambda$onAdClicked$7$RewardedVideoAdPresenter((RewardedAdPresenter.Listener) obj);
            }
        });
    }

    public /* synthetic */ void lambda$onReadyToBeClosed$8$RewardedVideoAdPresenter(RewardedAdPresenter.OnCloseEnabledListener onCloseEnabledListener2) {
        onCloseEnabledListener2.onCloseEnabled(this);
    }

    /* access modifiers changed from: package-private */
    public void onReadyToBeClosed() {
        Objects.onNotNull((RewardedAdPresenter.OnCloseEnabledListener) this.onCloseEnabledListener.get(), new Consumer() {
            public final void accept(Object obj) {
                RewardedVideoAdPresenter.this.lambda$onReadyToBeClosed$8$RewardedVideoAdPresenter((RewardedAdPresenter.OnCloseEnabledListener) obj);
            }
        });
    }
}
