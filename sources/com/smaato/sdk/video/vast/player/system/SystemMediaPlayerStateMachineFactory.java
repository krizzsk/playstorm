package com.smaato.sdk.video.vast.player.system;

import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.video.vast.player.MediaPlayerState;
import com.smaato.sdk.video.vast.player.MediaPlayerTransition;
import java.util.Arrays;

public class SystemMediaPlayerStateMachineFactory {
    private final MediaPlayerState initialState;

    public SystemMediaPlayerStateMachineFactory(MediaPlayerState mediaPlayerState) {
        this.initialState = mediaPlayerState;
    }

    public StateMachine<MediaPlayerTransition, MediaPlayerState> create() {
        StateMachine.Builder builder = new StateMachine.Builder();
        StateMachine.Builder initialState2 = builder.setInitialState(this.initialState);
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.SET_DATA_SOURCE;
        MediaPlayerState mediaPlayerState = MediaPlayerState.INITIALIZED;
        StateMachine.Builder addTransition = initialState2.addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.IDLE, mediaPlayerState}));
        MediaPlayerTransition mediaPlayerTransition2 = MediaPlayerTransition.PREPARE_ASYNC;
        MediaPlayerState mediaPlayerState2 = MediaPlayerState.PREPARING;
        StateMachine.Builder addTransition2 = addTransition.addTransition(mediaPlayerTransition2, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, mediaPlayerState2}));
        MediaPlayerState mediaPlayerState3 = MediaPlayerState.STOPPED;
        StateMachine.Builder addTransition3 = addTransition2.addTransition(mediaPlayerTransition2, Arrays.asList(new MediaPlayerState[]{mediaPlayerState3, mediaPlayerState2}));
        MediaPlayerTransition mediaPlayerTransition3 = MediaPlayerTransition.ON_PREPARED;
        MediaPlayerState mediaPlayerState4 = MediaPlayerState.PREPARED;
        addTransition3.addTransition(mediaPlayerTransition3, Arrays.asList(new MediaPlayerState[]{mediaPlayerState2, mediaPlayerState4})).addTransition(MediaPlayerTransition.START, Arrays.asList(new MediaPlayerState[]{mediaPlayerState4, MediaPlayerState.STARTED})).addTransition(MediaPlayerTransition.STOP, Arrays.asList(new MediaPlayerState[]{mediaPlayerState4, mediaPlayerState3}));
        addPlaybackCompletedTransitions(builder);
        addStartedTransitions(builder);
        addResumedTransitions(builder);
        addPausedTransitions(builder);
        addErrorTransitions(builder);
        addResetTransitions(builder);
        addReleaseTransitions(builder);
        return builder.build();
    }

    private void addPlaybackCompletedTransitions(StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        builder.addTransition(MediaPlayerTransition.STOP, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PLAYBACK_COMPLETED, MediaPlayerState.STOPPED}));
    }

    private void addPausedTransitions(StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.STOP;
        MediaPlayerState mediaPlayerState = MediaPlayerState.PAUSED;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, MediaPlayerState.STOPPED})).addTransition(MediaPlayerTransition.START, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, MediaPlayerState.RESUMED}));
    }

    private void addResumedTransitions(StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.STOP;
        MediaPlayerState mediaPlayerState = MediaPlayerState.RESUMED;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, MediaPlayerState.STOPPED})).addTransition(MediaPlayerTransition.PAUSE, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, MediaPlayerState.PAUSED})).addTransition(MediaPlayerTransition.ON_COMPLETE, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, MediaPlayerState.PLAYBACK_COMPLETED}));
    }

    private void addStartedTransitions(StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.STOP;
        MediaPlayerState mediaPlayerState = MediaPlayerState.STARTED;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, MediaPlayerState.STOPPED})).addTransition(MediaPlayerTransition.PAUSE, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, MediaPlayerState.PAUSED})).addTransition(MediaPlayerTransition.ON_COMPLETE, Arrays.asList(new MediaPlayerState[]{mediaPlayerState, MediaPlayerState.PLAYBACK_COMPLETED}));
    }

    private void addErrorTransitions(StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.ON_ERROR;
        MediaPlayerState mediaPlayerState = MediaPlayerState.ERROR;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.IDLE, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.INITIALIZED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARING, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.STARTED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.RESUMED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PAUSED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.STOPPED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PLAYBACK_COMPLETED, mediaPlayerState}));
    }

    private void addResetTransitions(StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.RESET;
        MediaPlayerState mediaPlayerState = MediaPlayerState.IDLE;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.ERROR, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.INITIALIZED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARING, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.STARTED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.RESUMED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.STOPPED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PAUSED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PLAYBACK_COMPLETED, mediaPlayerState}));
    }

    private void addReleaseTransitions(StateMachine.Builder<MediaPlayerTransition, MediaPlayerState> builder) {
        MediaPlayerTransition mediaPlayerTransition = MediaPlayerTransition.RELEASE;
        MediaPlayerState mediaPlayerState = MediaPlayerState.END;
        builder.addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.IDLE, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.ERROR, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.INITIALIZED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PREPARING, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.STARTED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.RESUMED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.STOPPED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PAUSED, mediaPlayerState})).addTransition(mediaPlayerTransition, Arrays.asList(new MediaPlayerState[]{MediaPlayerState.PLAYBACK_COMPLETED, mediaPlayerState}));
    }
}
