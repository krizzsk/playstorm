package com.smaato.sdk.video.vast.player.system;

import android.content.Context;
import android.media.MediaPlayer;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.player.MediaPlayerAction;
import com.smaato.sdk.video.vast.player.MediaPlayerState;
import com.smaato.sdk.video.vast.player.MediaPlayerTransition;
import com.smaato.sdk.video.vast.player.VideoPlayer;
import com.smaato.sdk.video.vast.player.VideoPlayerCreator;

public class SystemMediaPlayerCreator implements VideoPlayerCreator {
    private final Context context;
    private final EventValidator<MediaPlayerAction, MediaPlayerState> mediaPlayerActionsValidator;
    private final EventValidator<MediaPlayerTransition, MediaPlayerState> mediaPlayerTransitionsValidator;
    private final SystemMediaPlayerStateMachineFactory systemMediaPlayerStateMachineFactory;

    public SystemMediaPlayerCreator(Context context2, SystemMediaPlayerStateMachineFactory systemMediaPlayerStateMachineFactory2, EventValidator<MediaPlayerAction, MediaPlayerState> eventValidator, EventValidator<MediaPlayerTransition, MediaPlayerState> eventValidator2) {
        this.context = (Context) Objects.requireNonNull(context2);
        this.systemMediaPlayerStateMachineFactory = (SystemMediaPlayerStateMachineFactory) Objects.requireNonNull(systemMediaPlayerStateMachineFactory2);
        this.mediaPlayerActionsValidator = (EventValidator) Objects.requireNonNull(eventValidator);
        this.mediaPlayerTransitionsValidator = (EventValidator) Objects.requireNonNull(eventValidator2);
    }

    public VideoPlayer createVideoPlayer(Logger logger) {
        Objects.requireNonNull(logger);
        return new SystemMediaPlayer(this.context, new MediaPlayer(), this.systemMediaPlayerStateMachineFactory.create(), this.mediaPlayerActionsValidator, this.mediaPlayerTransitionsValidator, logger);
    }
}
