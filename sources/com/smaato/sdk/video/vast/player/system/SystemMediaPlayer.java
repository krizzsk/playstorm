package com.smaato.sdk.video.vast.player.system;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Metadata;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.core.util.p382fi.Consumer;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.player.MediaPlayerAction;
import com.smaato.sdk.video.vast.player.MediaPlayerState;
import com.smaato.sdk.video.vast.player.MediaPlayerTransition;
import com.smaato.sdk.video.vast.player.VideoPlayer;
import com.smaato.sdk.video.vast.player.exception.VideoPlayerException;
import java.io.IOException;

public class SystemMediaPlayer implements VideoPlayer {
    private Context context;
    private float currentVolume = -1.0f;
    private VideoPlayer.LifecycleListener lifecycleListener;
    private final Logger logger;
    private final MediaPlayer mediaPlayer;
    private final EventValidator<MediaPlayerAction, MediaPlayerState> mediaPlayerActionsValidator;
    private final StateMachine<MediaPlayerTransition, MediaPlayerState> mediaPlayerStatMachine;
    private final EventValidator<MediaPlayerTransition, MediaPlayerState> mediaPlayerTransitionsValidator;
    private VideoPlayer.PrepareListener prepareListener;
    private VideoPlayer.OnVolumeChangeListener volumeChangeListener;

    SystemMediaPlayer(Context context2, MediaPlayer mediaPlayer2, StateMachine<MediaPlayerTransition, MediaPlayerState> stateMachine, EventValidator<MediaPlayerAction, MediaPlayerState> eventValidator, EventValidator<MediaPlayerTransition, MediaPlayerState> eventValidator2, Logger logger2) {
        this.context = (Context) Objects.requireNonNull(context2, "Parameter context should not be null for SystemMediaPlayer::new");
        this.mediaPlayer = (MediaPlayer) Objects.requireNonNull(mediaPlayer2, "Parameter mediaPlayer should not be null for SystemMediaPlayer::new");
        this.mediaPlayerStatMachine = (StateMachine) Objects.requireNonNull(stateMachine, "Parameter mediaPlayerStatMachine should not be null for SystemMediaPlayer::new");
        this.mediaPlayerActionsValidator = (EventValidator) Objects.requireNonNull(eventValidator, "Parameter mediaPlayerActionsValidator should not be null for SystemMediaPlayer::new");
        this.mediaPlayerTransitionsValidator = (EventValidator) Objects.requireNonNull(eventValidator2, "Parameter mediaPlayerTransitionsValidator should not be null for SystemMediaPlayer::new");
        this.logger = (Logger) Objects.requireNonNull(logger2, "Parameter logger should not be null for SystemMediaPlayer::new");
        mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public final void onCompletion(MediaPlayer mediaPlayer) {
                SystemMediaPlayer.this.onCompletion(mediaPlayer);
            }
        });
        mediaPlayer2.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                return SystemMediaPlayer.this.onError(mediaPlayer, i, i2);
            }
        });
        mediaPlayer2.setOnInfoListener(new MediaPlayer.OnInfoListener() {
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                return SystemMediaPlayer.this.onInfo(mediaPlayer, i, i2);
            }
        });
        mediaPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public final void onPrepared(MediaPlayer mediaPlayer) {
                SystemMediaPlayer.this.onPrepared(mediaPlayer);
            }
        });
        mediaPlayer2.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() {
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                SystemMediaPlayer.this.onSeekComplete(mediaPlayer);
            }
        });
        stateMachine.addListener(new StateMachine.Listener() {
            public final void onStateChanged(Object obj, Object obj2, Metadata metadata) {
                SystemMediaPlayer.this.onStateChanged((MediaPlayerState) obj, (MediaPlayerState) obj2, metadata);
            }
        });
    }

    /* access modifiers changed from: private */
    public void onSeekComplete(MediaPlayer mediaPlayer2) {
        VideoPlayer.LifecycleListener lifecycleListener2;
        if (isValidStateForAction(MediaPlayerAction.SEEK_TO) && (lifecycleListener2 = this.lifecycleListener) != null) {
            lifecycleListener2.onSeekComplete(this);
        }
    }

    /* access modifiers changed from: private */
    public void onCompletion(MediaPlayer mediaPlayer2) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.ON_COMPLETE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        } else {
            this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
        }
    }

    /* access modifiers changed from: private */
    public void onPrepared(MediaPlayer mediaPlayer2) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.ON_PREPARED;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        } else {
            this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
        }
    }

    /* access modifiers changed from: private */
    public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
        this.logger.info(LogDomain.VAST, "MediaPlayer Info: [what: %d, extra: %d]; For more details check android.media.MediaPlayer info codes", Integer.valueOf(i), Integer.valueOf(i2));
        return false;
    }

    /* access modifiers changed from: private */
    public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
        this.logger.error(LogDomain.VAST, "MediaPlayer Error: [what: %d, extra: %d]; For more details check android.media.MediaPlayer error codes", Integer.valueOf(i), Integer.valueOf(i2));
        this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR, MetadataMapperUtils.mapToMetadata(i, i2));
        return true;
    }

    /* renamed from: com.smaato.sdk.video.vast.player.system.SystemMediaPlayer$1 */
    static /* synthetic */ class C113121 {
        static final /* synthetic */ int[] $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.smaato.sdk.video.vast.player.MediaPlayerState[] r0 = com.smaato.sdk.video.vast.player.MediaPlayerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState = r0
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x001d }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.PREPARING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.PREPARED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x003e }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.STARTED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.RESUMED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.PAUSED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.STOPPED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x006c }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.PLAYBACK_COMPLETED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.ERROR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.smaato.sdk.video.vast.player.MediaPlayerState r1 = com.smaato.sdk.video.vast.player.MediaPlayerState.END     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.smaato.sdk.video.vast.player.system.SystemMediaPlayer.C113121.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void onStateChanged(MediaPlayerState mediaPlayerState, MediaPlayerState mediaPlayerState2, Metadata metadata) {
        switch (C113121.$SwitchMap$com$smaato$sdk$video$vast$player$MediaPlayerState[mediaPlayerState2.ordinal()]) {
            case 1:
                VideoPlayer.LifecycleListener lifecycleListener2 = this.lifecycleListener;
                if (lifecycleListener2 != null) {
                    lifecycleListener2.onReset(this);
                    return;
                }
                return;
            case 2:
                VideoPlayer.PrepareListener prepareListener2 = this.prepareListener;
                if (prepareListener2 != null) {
                    prepareListener2.onInitialized(this);
                    return;
                }
                return;
            case 3:
                VideoPlayer.PrepareListener prepareListener3 = this.prepareListener;
                if (prepareListener3 != null) {
                    prepareListener3.onPreparing(this);
                    return;
                }
                return;
            case 4:
                VideoPlayer.PrepareListener prepareListener4 = this.prepareListener;
                if (prepareListener4 != null) {
                    prepareListener4.onPrepared(this);
                    return;
                }
                return;
            case 5:
                VideoPlayer.LifecycleListener lifecycleListener3 = this.lifecycleListener;
                if (lifecycleListener3 != null) {
                    lifecycleListener3.onStarted(this);
                    return;
                }
                return;
            case 6:
                VideoPlayer.LifecycleListener lifecycleListener4 = this.lifecycleListener;
                if (lifecycleListener4 != null) {
                    lifecycleListener4.onResumed(this);
                    return;
                }
                return;
            case 7:
                VideoPlayer.LifecycleListener lifecycleListener5 = this.lifecycleListener;
                if (lifecycleListener5 != null) {
                    lifecycleListener5.onPaused(this);
                    return;
                }
                return;
            case 8:
                VideoPlayer.LifecycleListener lifecycleListener6 = this.lifecycleListener;
                if (lifecycleListener6 != null) {
                    lifecycleListener6.onStopped(this);
                    return;
                }
                return;
            case 9:
                VideoPlayer.LifecycleListener lifecycleListener7 = this.lifecycleListener;
                if (lifecycleListener7 != null) {
                    lifecycleListener7.onCompleted(this);
                    return;
                }
                return;
            case 10:
                VideoPlayerException mapToVideoPlayerException = MetadataMapperUtils.mapToVideoPlayerException(metadata);
                VideoPlayer.LifecycleListener lifecycleListener8 = this.lifecycleListener;
                if (lifecycleListener8 != null) {
                    lifecycleListener8.onError(this, mapToVideoPlayerException);
                }
                VideoPlayer.PrepareListener prepareListener5 = this.prepareListener;
                if (prepareListener5 != null) {
                    prepareListener5.onError(this, mapToVideoPlayerException);
                    return;
                }
                return;
            case 11:
                VideoPlayer.LifecycleListener lifecycleListener9 = this.lifecycleListener;
                if (lifecycleListener9 != null) {
                    lifecycleListener9.onReleased(this);
                    return;
                }
                return;
            default:
                throw new IllegalArgumentException(String.format("Unexpected MediaPlayerState: %s", new Object[]{mediaPlayerState2}));
        }
    }

    public void setDataSource(Uri uri) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.SET_DATA_SOURCE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            try {
                this.mediaPlayer.setDataSource(this.context, uri);
                this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                this.logger.error(LogDomain.VAST, "Unable to set DataSource uri:[%s] to MediaPlayer. Exception %s", uri, e);
                this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
            }
        }
    }

    public void setDataSource(String str) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.SET_DATA_SOURCE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            try {
                this.mediaPlayer.setDataSource(str);
                this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
            } catch (IOException | IllegalArgumentException | SecurityException e) {
                this.logger.error(LogDomain.VAST, "Unable to set DataSource path:[%s] to MediaPlayer. Exception %s", str, e);
                this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
            }
        }
    }

    public void prepare() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.PREPARE_ASYNC;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            try {
                this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
                this.mediaPlayer.prepare();
            } catch (IOException e) {
                this.logger.error(LogDomain.VAST, "Unable to prepare DataSource for MediaPlayer. Exception %s", e);
                this.mediaPlayerStatMachine.onEvent(MediaPlayerTransition.ON_ERROR);
            }
        }
    }

    public void start() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.START;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayer.start();
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        }
    }

    public void pause() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.PAUSE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayer.pause();
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        }
    }

    public void stop() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.STOP;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayer.stop();
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        }
    }

    public void seekTo(int i) {
        if (isValidStateForAction(MediaPlayerAction.SEEK_TO)) {
            this.mediaPlayer.seekTo(i);
        }
    }

    public void reset() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.RESET;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayer.reset();
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
        }
    }

    public void release() {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.RELEASE;
        if (isValidStateForTransition(mediaPlayerTransition)) {
            this.mediaPlayer.release();
            this.mediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
            this.mediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener) null);
            this.mediaPlayer.setOnInfoListener((MediaPlayer.OnInfoListener) null);
            this.mediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
            this.mediaPlayer.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener) null);
            this.volumeChangeListener = null;
            this.mediaPlayerStatMachine.onEvent(mediaPlayerTransition);
            this.mediaPlayerStatMachine.deleteListeners();
        }
    }

    public void setPrepareListener(VideoPlayer.PrepareListener prepareListener2) {
        this.prepareListener = prepareListener2;
    }

    public void setLifecycleListener(VideoPlayer.LifecycleListener lifecycleListener2) {
        this.lifecycleListener = lifecycleListener2;
    }

    public void setSurface(Surface surface) {
        if (isValidStateForAction(MediaPlayerAction.SET_SURFACE)) {
            this.mediaPlayer.setSurface(surface);
        }
    }

    public void setOnVolumeChangeListener(VideoPlayer.OnVolumeChangeListener onVolumeChangeListener) {
        this.volumeChangeListener = onVolumeChangeListener;
    }

    public void setVolume(float f) {
        if ((Math.abs(f - this.currentVolume) > 0.0f) && isValidStateForAction(MediaPlayerAction.SET_VOLUME)) {
            this.mediaPlayer.setVolume(f, f);
            this.currentVolume = f;
            Objects.onNotNull(this.volumeChangeListener, new Consumer() {
                public final void accept(Object obj) {
                    SystemMediaPlayer.this.lambda$setVolume$0$SystemMediaPlayer((VideoPlayer.OnVolumeChangeListener) obj);
                }
            });
        }
    }

    public /* synthetic */ void lambda$setVolume$0$SystemMediaPlayer(VideoPlayer.OnVolumeChangeListener onVolumeChangeListener) {
        onVolumeChangeListener.onVolumeChanged(this.currentVolume);
    }

    public float getCurrentVolume() {
        return this.currentVolume;
    }

    public long getCurrentPositionMillis() {
        if (isValidStateForAction(MediaPlayerAction.GET_CURRENT_POSITION)) {
            return (long) this.mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public long getDuration() {
        if (isValidStateForAction(MediaPlayerAction.GET_DURATION)) {
            return (long) this.mediaPlayer.getDuration();
        }
        return 0;
    }

    public MediaPlayerState getState() {
        return this.mediaPlayerStatMachine.getCurrentState();
    }

    private boolean isValidStateForAction(MediaPlayerAction mediaPlayerAction) {
        MediaPlayerState currentState = this.mediaPlayerStatMachine.getCurrentState();
        if (this.mediaPlayerActionsValidator.isValid(mediaPlayerAction, currentState)) {
            return true;
        }
        this.logger.error(LogDomain.VAST, "Invalid MediaPlayer state: %s, for action: %s ", currentState, mediaPlayerAction);
        return false;
    }

    private boolean isValidStateForTransition(MediaPlayerTransition mediaPlayerTransition) {
        MediaPlayerState currentState = this.mediaPlayerStatMachine.getCurrentState();
        if (this.mediaPlayerTransitionsValidator.isValid(mediaPlayerTransition, currentState)) {
            return true;
        }
        this.logger.error(LogDomain.VAST, "Invalid MediaPlayer state: %s, for transition: %s ", currentState, mediaPlayerTransition);
        return false;
    }
}
