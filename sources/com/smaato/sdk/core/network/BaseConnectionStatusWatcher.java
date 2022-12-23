package com.smaato.sdk.core.network;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.smaato.sdk.core.network.ConnectionStatusWatcher;
import com.smaato.sdk.core.util.Objects;

final class BaseConnectionStatusWatcher implements ConnectionStatusWatcher {
    private final Application application;
    private ConnectionBroadcastReceiver broadcastReceiver;

    BaseConnectionStatusWatcher(Application application2) {
        this.application = (Application) Objects.requireNonNull(application2);
    }

    public void registerCallback(ConnectionStatusWatcher.Callback callback) {
        if (this.broadcastReceiver != null) {
            unregisterCallback();
        }
        ConnectionBroadcastReceiver connectionBroadcastReceiver = new ConnectionBroadcastReceiver(callback);
        this.broadcastReceiver = connectionBroadcastReceiver;
        this.application.registerReceiver(connectionBroadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public boolean isCallbackRegistered() {
        return this.broadcastReceiver != null;
    }

    public void unregisterCallback() {
        ConnectionBroadcastReceiver connectionBroadcastReceiver = this.broadcastReceiver;
        if (connectionBroadcastReceiver != null) {
            this.application.unregisterReceiver(connectionBroadcastReceiver);
            this.broadcastReceiver = null;
        }
    }

    private static final class ConnectionBroadcastReceiver extends BroadcastReceiver {
        private final ConnectionStatusWatcher.Callback callback;

        public ConnectionBroadcastReceiver(ConnectionStatusWatcher.Callback callback2) {
            this.callback = callback2;
        }

        public void onReceive(Context context, Intent intent) {
            this.callback.onConnectionStateChanged();
        }
    }
}
