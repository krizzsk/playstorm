package com.smaato.sdk.image.p383ad;

import com.smaato.sdk.core.p378ad.AdStateMachine;
import com.smaato.sdk.core.util.StateMachine;
import java.util.Arrays;

/* renamed from: com.smaato.sdk.image.ad.ImageAdStateMachine */
public final class ImageAdStateMachine {
    private ImageAdStateMachine() {
    }

    public static StateMachine<AdStateMachine.Event, AdStateMachine.State> newInstance(AdStateMachine.State state) {
        StateMachine.Builder initialState = new StateMachine.Builder().setInitialState(state);
        AdStateMachine.Event event = AdStateMachine.Event.INITIALISE;
        AdStateMachine.State state2 = AdStateMachine.State.INIT;
        AdStateMachine.State state3 = AdStateMachine.State.CREATED;
        StateMachine.Builder addTransition = initialState.addTransition(event, Arrays.asList(new AdStateMachine.State[]{state2, state3}));
        AdStateMachine.Event event2 = AdStateMachine.Event.ADDED_ON_SCREEN;
        AdStateMachine.State state4 = AdStateMachine.State.ON_SCREEN;
        StateMachine.Builder addTransition2 = addTransition.addTransition(event2, Arrays.asList(new AdStateMachine.State[]{state3, state4}));
        AdStateMachine.Event event3 = AdStateMachine.Event.IMPRESSION;
        AdStateMachine.State state5 = AdStateMachine.State.IMPRESSED;
        StateMachine.Builder addTransition3 = addTransition2.addTransition(event3, Arrays.asList(new AdStateMachine.State[]{state4, state5}));
        AdStateMachine.Event event4 = AdStateMachine.Event.CLICK;
        AdStateMachine.State state6 = AdStateMachine.State.CLICKED;
        AdStateMachine.State state7 = AdStateMachine.State.COMPLETE;
        StateMachine.Builder addTransition4 = addTransition3.addTransition(event4, Arrays.asList(new AdStateMachine.State[]{state4, state5, state6, state7})).addTransition(event4, Arrays.asList(new AdStateMachine.State[]{state5, state6, state7}));
        AdStateMachine.Event event5 = AdStateMachine.Event.EXPIRE_TTL;
        AdStateMachine.State state8 = AdStateMachine.State.TO_BE_DELETED;
        StateMachine.Builder addTransition5 = addTransition4.addTransition(event5, Arrays.asList(new AdStateMachine.State[]{state2, state8})).addTransition(event5, Arrays.asList(new AdStateMachine.State[]{state3, state8})).addTransition(event5, Arrays.asList(new AdStateMachine.State[]{state4, state8}));
        AdStateMachine.Event event6 = AdStateMachine.Event.AD_ERROR;
        StateMachine.Builder addTransition6 = addTransition5.addTransition(event6, Arrays.asList(new AdStateMachine.State[]{state2, state8})).addTransition(event6, Arrays.asList(new AdStateMachine.State[]{state3, state8})).addTransition(event6, Arrays.asList(new AdStateMachine.State[]{state4, state8}));
        AdStateMachine.Event event7 = AdStateMachine.Event.DESTROY;
        return addTransition6.addTransition(event7, Arrays.asList(new AdStateMachine.State[]{state4, state3})).addTransition(event7, Arrays.asList(new AdStateMachine.State[]{state5, state8})).addTransition(event7, Arrays.asList(new AdStateMachine.State[]{state7, state8})).build();
    }

    public static StateMachine<AdStateMachine.Event, AdStateMachine.State> newInstance() {
        return newInstance(AdStateMachine.State.INIT);
    }
}
