package com.smaato.sdk.video.utils;

import com.smaato.sdk.core.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class EventValidator<Event, State> {
    private final Map<Event, List<? extends State>> validStatesForEvent;

    private EventValidator(Map<Event, List<? extends State>> map) {
        this.validStatesForEvent = map;
    }

    public boolean isValid(Event event, State state) {
        List list = this.validStatesForEvent.get(event);
        if (list == null) {
            return false;
        }
        return list.contains(state);
    }

    public static class Builder<Event, State> {
        private final Map<Event, List<? extends State>> validStatesForEvent = new HashMap();

        public Builder<Event, State> setValidStatesForEvent(Event event, List<? extends State> list) {
            Objects.requireNonNull(event, "Parameter event can not be null");
            ArrayList<Object> arrayList = new ArrayList<>((Collection) Objects.requireNonNull(list, "Parameter states can not be null"));
            for (Object requireNonNull : arrayList) {
                Objects.requireNonNull(requireNonNull, "a state can not be null");
            }
            if (arrayList.size() <= new HashSet(list).size()) {
                this.validStatesForEvent.put(event, arrayList);
                return this;
            }
            throw new IllegalArgumentException("a states must consist of unique states");
        }

        public EventValidator<Event, State> build() {
            if (!this.validStatesForEvent.isEmpty()) {
                return new EventValidator<>(this.validStatesForEvent);
            }
            throw new IllegalStateException("At least one valid event for states should be added.");
        }
    }
}
