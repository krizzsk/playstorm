package com.smaato.sdk.core.util;

import java.lang.Enum;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class StateMachine<Event extends Enum<Event>, State extends Enum<State>> {
    private final Map<Pair<Event, State>, List<State>> graph;
    private boolean inTransition;
    private final LinkedHashSet<Listener<State>> listeners;
    private State state;

    public interface Listener<State> {
        void onStateChanged(State state, State state2, Metadata metadata);
    }

    private StateMachine(Map<Pair<Event, State>, List<State>> map, State state2) {
        this.listeners = new LinkedHashSet<>();
        this.graph = map;
        this.state = state2;
    }

    public void onEvent(Event event) {
        onEvent(event, (Metadata) null);
    }

    public synchronized void onEvent(Event event, Metadata metadata) {
        List list = this.graph.get(Pair.m32964of(event, this.state));
        if (list != null) {
            if (!this.inTransition) {
                int size = list.size();
                int i = 0;
                while (i < size) {
                    this.inTransition = i < size + -1;
                    State state2 = this.state;
                    State state3 = (Enum) list.get(i);
                    this.state = state3;
                    Iterator it = new ArrayList(this.listeners).iterator();
                    while (it.hasNext()) {
                        ((Listener) it.next()).onStateChanged(state2, state3, metadata);
                    }
                    i++;
                }
                return;
            }
            throw new IllegalStateException("can not start a new transition, because there is an on-going unfinished transition");
        }
    }

    public synchronized boolean isTransitionAllowed(Event event) {
        return this.graph.get(Pair.m32964of(event, this.state)) != null;
    }

    public synchronized State getCurrentState() {
        return this.state;
    }

    public synchronized void addListener(Listener<State> listener) {
        Objects.requireNonNull(listener, "listener can not be null");
        this.listeners.add(listener);
    }

    public synchronized void deleteListeners() {
        this.listeners.clear();
    }

    public synchronized void deleteListener(Listener<State> listener) {
        this.listeners.remove(listener);
    }

    public static class Builder<Event extends Enum<Event>, State extends Enum<State>> {
        private final Map<Pair<Event, State>, List<State>> graph = new HashMap();
        private State initialState;

        public Builder<Event, State> setInitialState(State state) {
            this.initialState = (Enum) Objects.requireNonNull(state, "initialState can not be null");
            return this;
        }

        public Builder<Event, State> addTransition(Event event, List<State> list) {
            Objects.requireNonNull(event, "event can not be null");
            ArrayList<Enum> arrayList = new ArrayList<>((Collection) Objects.requireNonNull(list, "statePath can not be null"));
            if (arrayList.size() >= 2) {
                for (Enum requireNonNull : arrayList) {
                    Objects.requireNonNull(requireNonNull, "a state can not be null");
                }
                if (arrayList.size() <= EnumSet.copyOf(arrayList).size()) {
                    Enum enumR = (Enum) arrayList.remove(0);
                    Pair of = Pair.m32964of(event, enumR);
                    if (!this.graph.containsKey(of)) {
                        this.graph.put(of, arrayList);
                        return this;
                    }
                    throw new IllegalArgumentException("a statePath with the same start state " + enumR + " is already defined for the event " + event);
                }
                throw new IllegalArgumentException("a statePath must consist of unique states");
            }
            throw new IllegalArgumentException("statePath must have at least 2 states");
        }

        public Builder<Event, State> addLoopTransition(Event event, State state) {
            Objects.requireNonNull(event, "event cannot be null");
            Objects.requireNonNull(state, "state cannot be null");
            Pair of = Pair.m32964of(event, state);
            if (!this.graph.containsKey(of)) {
                this.graph.put(of, Collections.singletonList(state));
                return this;
            }
            throw new IllegalArgumentException("a statePath with the same start state " + state + " is already defined for the event " + event);
        }

        public StateMachine<Event, State> build() {
            if (this.initialState == null) {
                throw new IllegalStateException("initialState must be set");
            } else if (!this.graph.isEmpty()) {
                return new StateMachine<>(this.graph, this.initialState);
            } else {
                throw new IllegalStateException("at least one transition must be added");
            }
        }
    }
}
