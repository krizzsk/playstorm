package com.smaato.sdk.core.network;

public interface ConnectionStatusWatcher {

    public interface Callback {
        void onConnectionStateChanged();
    }

    boolean isCallbackRegistered();

    void registerCallback(Callback callback);

    void unregisterCallback();
}
