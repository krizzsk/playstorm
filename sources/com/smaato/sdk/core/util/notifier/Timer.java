package com.smaato.sdk.core.util.notifier;

public interface Timer {

    public interface Listener {
        void onTimePassed();
    }

    void start(Listener listener);
}
