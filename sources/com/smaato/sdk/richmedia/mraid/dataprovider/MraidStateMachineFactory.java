package com.smaato.sdk.richmedia.mraid.dataprovider;

import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.StateMachine;
import java.util.Arrays;

public final class MraidStateMachineFactory {
    private final State initialState;

    public enum Event {
        LOAD_COMPLETE,
        CLOSE,
        RESIZE,
        EXPAND,
        ERROR,
        RESIZING_FINISHED,
        EXPANDING_FINISHED,
        CLOSE_FINISHED,
        VISIBILITY_PARAMS_CHECK
    }

    public enum State {
        HIDDEN,
        LOADING,
        DEFAULT,
        RESIZED,
        EXPANDED,
        RESIZE_IN_PROGRESS,
        EXPAND_IN_PROGRESS,
        COLLAPSE_IN_PROGRESS
    }

    public MraidStateMachineFactory(State state) {
        this.initialState = (State) Objects.requireNonNull(state);
    }

    public StateMachine<Event, State> newInstanceForBanner() {
        StateMachine.Builder initialState2 = new StateMachine.Builder().setInitialState(this.initialState);
        Event event = Event.LOAD_COMPLETE;
        State state = State.DEFAULT;
        StateMachine.Builder addTransition = initialState2.addTransition(event, Arrays.asList(new State[]{State.LOADING, state}));
        Event event2 = Event.RESIZE;
        State state2 = State.RESIZE_IN_PROGRESS;
        StateMachine.Builder addTransition2 = addTransition.addTransition(event2, Arrays.asList(new State[]{state, state2}));
        State state3 = State.RESIZED;
        StateMachine.Builder addTransition3 = addTransition2.addTransition(event2, Arrays.asList(new State[]{state3, state2})).addLoopTransition(event2, state2).addTransition(Event.RESIZING_FINISHED, Arrays.asList(new State[]{state2, state3}));
        Event event3 = Event.EXPAND;
        State state4 = State.EXPAND_IN_PROGRESS;
        StateMachine.Builder addTransition4 = addTransition3.addTransition(event3, Arrays.asList(new State[]{state, state4})).addTransition(event3, Arrays.asList(new State[]{state3, state4})).addTransition(event3, Arrays.asList(new State[]{state2, state4}));
        Event event4 = Event.EXPANDING_FINISHED;
        State state5 = State.EXPANDED;
        StateMachine.Builder addTransition5 = addTransition4.addTransition(event4, Arrays.asList(new State[]{state4, state5}));
        Event event5 = Event.CLOSE;
        State state6 = State.COLLAPSE_IN_PROGRESS;
        StateMachine.Builder addTransition6 = addTransition5.addTransition(event5, Arrays.asList(new State[]{state3, state6})).addTransition(event5, Arrays.asList(new State[]{state5, state6}));
        Event event6 = Event.ERROR;
        StateMachine.Builder addTransition7 = addTransition6.addTransition(event6, Arrays.asList(new State[]{state2, state})).addTransition(event6, Arrays.asList(new State[]{state4, state})).addTransition(Event.CLOSE_FINISHED, Arrays.asList(new State[]{state6, state}));
        Event event7 = Event.VISIBILITY_PARAMS_CHECK;
        return addTransition7.addLoopTransition(event7, state).addLoopTransition(event7, state3).addLoopTransition(event7, state5).build();
    }

    public StateMachine<Event, State> newInstanceForInterstitial() {
        StateMachine.Builder initialState2 = new StateMachine.Builder().setInitialState(this.initialState);
        Event event = Event.LOAD_COMPLETE;
        State state = State.DEFAULT;
        return initialState2.addTransition(event, Arrays.asList(new State[]{State.LOADING, state})).addTransition(Event.CLOSE, Arrays.asList(new State[]{state, State.HIDDEN})).addLoopTransition(Event.VISIBILITY_PARAMS_CHECK, state).build();
    }
}
