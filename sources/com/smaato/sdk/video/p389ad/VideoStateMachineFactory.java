package com.smaato.sdk.video.p389ad;

import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.p379di.ClassFactory;
import com.smaato.sdk.core.p379di.DiConstructor;
import com.smaato.sdk.core.util.StateMachine;
import java.util.Arrays;

/* renamed from: com.smaato.sdk.video.ad.VideoStateMachineFactory */
public final class VideoStateMachineFactory implements ClassFactory<StateMachine> {
    private AdStateMachine.State initialState;

    public VideoStateMachineFactory(AdStateMachine.State state) {
        this.initialState = state;
    }

    public StateMachine<AdStateMachine.Event, AdStateMachine.State> get(DiConstructor diConstructor) {
        return new StateMachine.Builder().setInitialState(this.initialState).addTransition(AdStateMachine.Event.INITIALISE, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.INIT, AdStateMachine.State.CREATED})).addTransition(AdStateMachine.Event.ADDED_ON_SCREEN, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CREATED, AdStateMachine.State.ON_SCREEN})).addTransition(AdStateMachine.Event.IMPRESSION, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.IMPRESSED})).addTransition(AdStateMachine.Event.EXPIRE_TTL, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.INIT, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.EXPIRE_TTL, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CREATED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.EXPIRE_TTL, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.AD_ERROR, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.INIT, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.AD_ERROR, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CREATED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.AD_ERROR, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.CLOSE, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.CLOSE, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.IMPRESSED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.CLOSE, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.CLICKED, AdStateMachine.State.TO_BE_DELETED})).addTransition(AdStateMachine.Event.CLICK, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.ON_SCREEN, AdStateMachine.State.IMPRESSED, AdStateMachine.State.CLICKED})).addTransition(AdStateMachine.Event.CLICK, Arrays.asList(new AdStateMachine.State[]{AdStateMachine.State.IMPRESSED, AdStateMachine.State.CLICKED})).build();
    }
}
