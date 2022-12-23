package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.vast.model.VastBeaconEvent;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.player.VastVideoPlayer;
import com.smaato.sdk.video.vast.player.VastVideoPlayerModel;
import com.smaato.sdk.video.vast.tracking.VastBeaconTracker;
import com.smaato.sdk.video.vast.tracking.VastErrorTracker;
import com.smaato.sdk.video.vast.tracking.VastEventTracker;
import com.smaato.sdk.video.vast.tracking.macro.PlayerState;
import java.util.concurrent.atomic.AtomicReference;

class VastVideoPlayerModel {
    private float clickPositionXPx;
    private float clickPositionYPx;
    private final ComponentClickHandler componentClickHandler;
    private final VastErrorTracker errorTracker;
    private final AtomicReference<VastVideoPlayer.EventListener> eventListenerRef = new AtomicReference<>();
    private boolean isMuted;
    private final boolean isVideoClickable;
    private long lastKnownPositionMillis;
    private final ChangeSender<Quartile> quartileChangeSender;
    private final ChangeNotifier.Listener<Quartile> quartileListener;
    private final VastBeaconTracker vastBeaconTracker;
    private final VastEventTracker vastEventTracker;

    public enum Quartile {
        ZERO,
        FIRST,
        MID,
        THIRD
    }

    VastVideoPlayerModel(VastErrorTracker vastErrorTracker, VastEventTracker vastEventTracker2, VastBeaconTracker vastBeaconTracker2, ComponentClickHandler componentClickHandler2, boolean z, boolean z2, ChangeSender<Quartile> changeSender) {
        $$Lambda$VastVideoPlayerModel$j7aSYGUNoqOJyanpsFfXSZ2LffA r0 = new ChangeNotifier.Listener() {
            public final void onNextValue(Object obj) {
                VastVideoPlayerModel.this.onQuartileChange((VastVideoPlayerModel.Quartile) obj);
            }
        };
        this.quartileListener = r0;
        this.errorTracker = (VastErrorTracker) Objects.requireNonNull(vastErrorTracker);
        this.vastEventTracker = (VastEventTracker) Objects.requireNonNull(vastEventTracker2);
        this.vastBeaconTracker = (VastBeaconTracker) Objects.requireNonNull(vastBeaconTracker2);
        this.componentClickHandler = (ComponentClickHandler) Objects.requireNonNull(componentClickHandler2);
        this.isMuted = z;
        this.isVideoClickable = z2;
        this.quartileChangeSender = changeSender;
        changeSender.addListener(r0);
    }

    /* access modifiers changed from: package-private */
    public void setEventListener(VastVideoPlayer.EventListener eventListener) {
        this.eventListenerRef.set(eventListener);
    }

    /* access modifiers changed from: package-private */
    public void onAdError() {
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$rxzlszxUvTfhZTPxg_FsLlOtmzk.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void onPlayerClosed() {
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$hcuRu8OsTOVrv3fWzCW4zS7dHA.INSTANCE);
        this.vastEventTracker.triggerEventByName(VastEvent.CLOSE_LINEAR, createPlayerState());
    }

    /* access modifiers changed from: package-private */
    public void loaded() {
        this.vastEventTracker.triggerEventByName(VastEvent.LOADED, createPlayerState());
    }

    /* access modifiers changed from: package-private */
    public void onVideoStarted(float f, float f2) {
        Objects.onNotNull(this.eventListenerRef.get(), new Consumer(f, f2) {
            public final /* synthetic */ float f$0;
            public final /* synthetic */ float f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void accept(Object obj) {
                ((VastVideoPlayer.EventListener) obj).onStart(this.f$0, this.f$1);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void onVideoImpression() {
        track(VastBeaconEvent.SMAATO_VIEWABLE_IMPRESSION);
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$rjmACulradfMI0bMLMkbGk0j5pM.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void onVideoSkipped() {
        this.vastEventTracker.triggerEventByName(VastEvent.SKIP, createPlayerState());
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$Dh_Ymce1nc8aiUkBl7y3AeHH19Q.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void onVideoMuteClicked() {
        this.isMuted = true;
        this.vastEventTracker.triggerEventByName(VastEvent.MUTE, createPlayerState());
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$O7DCh2FczmlysYEc7ZgafTB4FI.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void onVideoUnmuteClicked() {
        this.isMuted = false;
        this.vastEventTracker.triggerEventByName(VastEvent.UNMUTE, createPlayerState());
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$qiSj9ER82EqvUFANsAKa9ze8.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void onVideoCompleted() {
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$5XODgJXw9fkBonBTry1OvLS83Fg.INSTANCE);
        this.vastEventTracker.triggerEventByName(VastEvent.COMPLETE, createPlayerState());
    }

    /* access modifiers changed from: package-private */
    public void onVideoPaused() {
        this.vastEventTracker.triggerEventByName(VastEvent.PAUSE, createPlayerState());
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$oTG8YGM3hyR7DZOxDO_ltfxKKw.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void onVideoProgressChange(long j, long j2) {
        this.lastKnownPositionMillis = j;
        this.vastEventTracker.triggerProgressDependentEvent(createPlayerState(), j2);
        float f = ((float) j) / ((float) j2);
        if (f >= 0.01f) {
            track(VastBeaconEvent.SMAATO_IMPRESSION);
        }
        Quartile quartile = Quartile.ZERO;
        if (f >= 0.25f && f < 0.5f) {
            quartile = Quartile.FIRST;
        } else if (f >= 0.5f && f < 0.75f) {
            quartile = Quartile.MID;
        } else if (f >= 0.75f) {
            quartile = Quartile.THIRD;
        }
        this.quartileChangeSender.newValue(quartile);
    }

    /* access modifiers changed from: package-private */
    public void onVideoResumed() {
        this.vastEventTracker.triggerEventByName(VastEvent.RESUME, createPlayerState());
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$2gw2hPvCv9LlOxBvCXtbvmr4DSE.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void onCompanionShown() {
        this.vastEventTracker.triggerEventByName(VastEvent.CREATIVE_VIEW, createPlayerState());
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$XJZ4N7GNxDaJJrqnASUMZPLIM2M.INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void onIconShown() {
        track(VastBeaconEvent.SMAATO_ICON_VIEW_TRACKING);
    }

    /* access modifiers changed from: package-private */
    public void onVideoError(int i) {
        trackError(i);
    }

    /* access modifiers changed from: package-private */
    public void onIconError(int i) {
        trackError(i);
    }

    /* access modifiers changed from: package-private */
    public void onCompanionError(int i) {
        trackError(i);
    }

    private void trackError(int i) {
        this.errorTracker.track(new PlayerState.Builder().setOffsetMillis(this.lastKnownPositionMillis).setMuted(this.isMuted).setErrorCode(i).setClickPositionX(this.clickPositionXPx).setClickPositionY(this.clickPositionYPx).build());
    }

    /* access modifiers changed from: private */
    public void onQuartileChange(Quartile quartile) {
        VastVideoPlayer.EventListener eventListener = this.eventListenerRef.get();
        if (eventListener != null) {
            int i = C113041.f27185x63d6fa44[quartile.ordinal()];
            if (i == 1) {
                eventListener.onFirstQuartile();
            } else if (i == 2) {
                eventListener.onMidPoint();
            } else if (i == 3) {
                eventListener.onThirdQuartile();
            }
        }
    }

    /* renamed from: com.smaato.sdk.video.vast.player.VastVideoPlayerModel$1 */
    static /* synthetic */ class C113041 {

        /* renamed from: $SwitchMap$com$smaato$sdk$video$vast$player$VastVideoPlayerModel$Quartile */
        static final /* synthetic */ int[] f27185x63d6fa44;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.smaato.sdk.video.vast.player.VastVideoPlayerModel$Quartile[] r0 = com.smaato.sdk.video.vast.player.VastVideoPlayerModel.Quartile.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27185x63d6fa44 = r0
                com.smaato.sdk.video.vast.player.VastVideoPlayerModel$Quartile r1 = com.smaato.sdk.video.vast.player.VastVideoPlayerModel.Quartile.FIRST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27185x63d6fa44     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.video.vast.player.VastVideoPlayerModel$Quartile r1 = com.smaato.sdk.video.vast.player.VastVideoPlayerModel.Quartile.MID     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27185x63d6fa44     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.video.vast.player.VastVideoPlayerModel$Quartile r1 = com.smaato.sdk.video.vast.player.VastVideoPlayerModel.Quartile.THIRD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27185x63d6fa44     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.video.vast.player.VastVideoPlayerModel$Quartile r1 = com.smaato.sdk.video.vast.player.VastVideoPlayerModel.Quartile.ZERO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.player.VastVideoPlayerModel.C113041.<clinit>():void");
        }
    }

    private void track(VastBeaconEvent vastBeaconEvent) {
        this.vastBeaconTracker.trigger(vastBeaconEvent, createPlayerState());
    }

    /* access modifiers changed from: package-private */
    public void videoClick(float f, float f2, Runnable runnable) {
        if (this.isVideoClickable) {
            this.clickPositionXPx = f;
            this.clickPositionYPx = f2;
            track(VastBeaconEvent.SMAATO_VIDEO_CLICK_TRACKING);
            Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$7kWMfJwzYbFCTxButyHgxNnTet8.INSTANCE);
            this.componentClickHandler.handleClick((String) null, runnable);
        }
    }

    /* access modifiers changed from: package-private */
    public void companionClick(String str, Runnable runnable) {
        track(VastBeaconEvent.SMAATO_COMPANION_CLICK_TRACKING);
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$7kWMfJwzYbFCTxButyHgxNnTet8.INSTANCE);
        this.componentClickHandler.handleClick(str, runnable);
    }

    /* access modifiers changed from: package-private */
    public void iconClick(String str, Runnable runnable) {
        track(VastBeaconEvent.SMAATO_ICON_CLICK_TRACKING);
        Objects.onNotNull(this.eventListenerRef.get(), $$Lambda$7kWMfJwzYbFCTxButyHgxNnTet8.INSTANCE);
        this.componentClickHandler.handleClick(str, runnable);
    }

    private PlayerState createPlayerState() {
        return new PlayerState.Builder().setOffsetMillis(this.lastKnownPositionMillis).setMuted(this.isMuted).setClickPositionX(this.clickPositionXPx).setClickPositionY(this.clickPositionYPx).build();
    }
}
