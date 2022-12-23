package com.smaato.sdk.video.vast.player.system;

import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.video.utils.EventValidator;
import com.smaato.sdk.video.vast.player.MediaPlayerState;
import com.smaato.sdk.video.vast.player.MediaPlayerTransition;
import java.util.Arrays;
import java.util.Collections;

public class SystemMediaPlayerTransitionValidatorFactory implements ClassFactory<EventValidator> {
    public EventValidator<MediaPlayerTransition, MediaPlayerState> get(DiConstructor diConstructor) {
        EventValidator.Builder builder = new EventValidator.Builder();
        EventValidator.Builder validStatesForEvent = builder.setValidStatesForEvent(MediaPlayerTransition.SET_DATA_SOURCE, Collections.singletonList(MediaPlayerState.IDLE)).setValidStatesForEvent(MediaPlayerTransition.PREPARE_ASYNC, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.INITIALIZED, MediaPlayerState.STOPPED})).setValidStatesForEvent(MediaPlayerTransition.ON_PREPARED, Collections.singletonList(MediaPlayerState.PREPARING));
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.PAUSE;
        MediaPlayerState mediaPlayerState = MediaPlayerState.STARTED;
        MediaPlayerState mediaPlayerState2 = MediaPlayerState.RESUMED;
        EventValidator.Builder validStatesForEvent2 = validStatesForEvent.setValidStatesForEvent(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, mediaPlayerState2}));
        MediaPlayerTransition mediaPlayerTransition2 = MediaPlayerTransition.START;
        MediaPlayerState mediaPlayerState3 = MediaPlayerState.PREPARED;
        MediaPlayerState mediaPlayerState4 = MediaPlayerState.PAUSED;
        validStatesForEvent2.setValidStatesForEvent(mediaPlayerTransition2, Arrays.asList(new MediaPlayerState[]{mediaPlayerState3, mediaPlayerState4})).setValidStatesForEvent(MediaPlayerTransition.STOP, Arrays.asList(new MediaPlayerState[]{mediaPlayerState3, mediaPlayerState, mediaPlayerState2, mediaPlayerState4, MediaPlayerState.PLAYBACK_COMPLETED})).setValidStatesForEvent(MediaPlayerTransition.ON_COMPLETE, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, mediaPlayerState2}));
        setValidStatesForRelease(builder);
        setValidStatesForReset(builder);
        return builder.build();
    }

    private void setValidStatesForRelease(EventValidator.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        builder.setValidStatesForEvent(MediaPlayerTransition.RELEASE, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.IDLE, MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARING, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED, MediaPlayerState.ERROR}));
    }

    private void setValidStatesForReset(EventValidator.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        builder.setValidStatesForEvent(MediaPlayerTransition.RESET, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.INITIALIZED, MediaPlayerState.PREPARING, MediaPlayerState.PREPARED, MediaPlayerState.STARTED, MediaPlayerState.RESUMED, MediaPlayerState.PAUSED, MediaPlayerState.STOPPED, MediaPlayerState.PLAYBACK_COMPLETED, MediaPlayerState.ERROR}));
    }
}
