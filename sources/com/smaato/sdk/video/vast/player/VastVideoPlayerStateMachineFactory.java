package com.smaato.sdk.video.vast.player;

import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import com.smaato.sdk.video.vast.model.VastCompanionScenario;
import com.smaato.sdk.video.vast.model.VastScenario;
import java.util.Arrays;

public class VastVideoPlayerStateMachineFactory {
    private final VastPlayerState initialState;

    VastVideoPlayerStateMachineFactory(VastPlayerState vastPlayerState) {
        this.initialState = (VastPlayerState) Objects.requireNonNull(vastPlayerState);
    }

    public StateMachine<VastPlayerEvent, VastPlayerState> create(VastScenario vastScenario) {
        VastPlayerState vastPlayerState;
        VastCompanionScenario vastCompanionScenario = vastScenario.vastCompanionScenario;
        StateMachine.Builder builder = new StateMachine.Builder();
        if (vastCompanionScenario == null || SmaatoSdk.isCompanionAdSkippable()) {
            vastPlayerState = VastPlayerState.CLOSE_PLAYER;
        } else {
            vastPlayerState = VastPlayerState.SHOW_COMPANION;
        }
        StateMachine.Builder initialState2 = builder.setInitialState(this.initialState);
        VastPlayerEvent vastPlayerEvent = VastPlayerEvent.ERROR;
        VastPlayerState vastPlayerState2 = VastPlayerState.SHOW_VIDEO;
        VastPlayerState vastPlayerState3 = VastPlayerState.CLOSE_PLAYER;
        StateMachine.Builder addTransition = initialState2.addTransition(vastPlayerEvent, Arrays.asList(new VastPlayerState[]{vastPlayerState2, vastPlayerState3}));
        VastPlayerState vastPlayerState4 = VastPlayerState.SHOW_COMPANION;
        StateMachine.Builder addTransition2 = addTransition.addTransition(vastPlayerEvent, Arrays.asList(new VastPlayerState[]{vastPlayerState4, vastPlayerState3}));
        VastPlayerEvent vastPlayerEvent2 = VastPlayerEvent.CLICKED;
        StateMachine.Builder addTransition3 = addTransition2.addTransition(vastPlayerEvent2, Arrays.asList(new VastPlayerState[]{vastPlayerState2, vastPlayerState3})).addTransition(vastPlayerEvent2, Arrays.asList(new VastPlayerState[]{vastPlayerState4, vastPlayerState3})).addTransition(VastPlayerEvent.VIDEO_COMPLETED, Arrays.asList(new VastPlayerState[]{vastPlayerState2, vastPlayerState})).addTransition(VastPlayerEvent.VIDEO_SKIPPED, Arrays.asList(new VastPlayerState[]{vastPlayerState2, vastPlayerState}));
        VastPlayerEvent vastPlayerEvent3 = VastPlayerEvent.CLOSE_BUTTON_CLICKED;
        addTransition3.addTransition(vastPlayerEvent3, Arrays.asList(new VastPlayerState[]{vastPlayerState2, vastPlayerState3})).addTransition(vastPlayerEvent3, Arrays.asList(new VastPlayerState[]{vastPlayerState4, vastPlayerState3}));
        return builder.build();
    }
}
