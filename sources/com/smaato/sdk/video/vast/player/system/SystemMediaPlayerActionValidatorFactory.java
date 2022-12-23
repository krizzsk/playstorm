package com.smaato.sdk.video.vast.player.system;

import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.player.MediaPlayerAction;
import com.smaato.sdk.video.vast.player.MediaPlayerState;
import java.util.Arrays;

public class SystemMediaPlayerActionValidatorFactory implements ClassFactory<EventValidator> {
    public EventValidator<MediaPlayerAction, MediaPlayerState> get(DiConstructor diConstructor) {
        EventValidator.Builder builder = new EventValidator.Builder();
        MediaPlayerAction mediaPlayerAction = MediaPlayerAction.SET_SURFACE;
        MediaPlayerState mediaPlayerState = MediaPlayerState.INITIALIZED;
        MediaPlayerState mediaPlayerState2 = MediaPlayerState.PREPARED;
        MediaPlayerState mediaPlayerState3 = MediaPlayerState.STARTED;
        MediaPlayerState mediaPlayerState4 = MediaPlayerState.RESUMED;
        MediaPlayerState mediaPlayerState5 = MediaPlayerState.PAUSED;
        MediaPlayerState mediaPlayerState6 = MediaPlayerState.STOPPED;
        MediaPlayerState mediaPlayerState7 = MediaPlayerState.PLAYBACK_COMPLETED;
        EventValidator.Builder validStatesForEvent = builder.setValidStatesForEvent(mediaPlayerAction, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, mediaPlayerState2, mediaPlayerState3, mediaPlayerState4, mediaPlayerState5, mediaPlayerState6, mediaPlayerState7}));
        MediaPlayerAction mediaPlayerAction2 = MediaPlayerAction.GET_CURRENT_POSITION;
        MediaPlayerState mediaPlayerState8 = MediaPlayerState.IDLE;
        validStatesForEvent.setValidStatesForEvent(mediaPlayerAction2, Arrays.asList(new MediaPlayerState[]{mediaPlayerState8, mediaPlayerState, mediaPlayerState2, mediaPlayerState3, mediaPlayerState4, mediaPlayerState5, mediaPlayerState6, mediaPlayerState7})).setValidStatesForEvent(MediaPlayerAction.GET_DURATION, Arrays.asList(new MediaPlayerState[]{mediaPlayerState2, mediaPlayerState3, mediaPlayerState4, mediaPlayerState5, mediaPlayerState6, mediaPlayerState7})).setValidStatesForEvent(MediaPlayerAction.IS_PLAYING, Arrays.asList(new MediaPlayerState[]{mediaPlayerState8, mediaPlayerState, mediaPlayerState2, mediaPlayerState3, mediaPlayerState4, mediaPlayerState5, mediaPlayerState6, mediaPlayerState7})).setValidStatesForEvent(MediaPlayerAction.SEEK_TO, Arrays.asList(new MediaPlayerState[]{mediaPlayerState2, mediaPlayerState3, mediaPlayerState4, mediaPlayerState5, mediaPlayerState7})).setValidStatesForEvent(MediaPlayerAction.SET_VOLUME, Arrays.asList(new MediaPlayerState[]{mediaPlayerState8, mediaPlayerState, mediaPlayerState2, mediaPlayerState3, mediaPlayerState4, mediaPlayerState5, mediaPlayerState6, mediaPlayerState7}));
        return builder.build();
    }
}
