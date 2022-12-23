package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

public class NetworkConnectivity extends Activity {

    /* renamed from: a */
    private final int f29014a = 0;

    /* renamed from: b */
    private final int f29015b;

    /* renamed from: c */
    private final int f29016c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f29017d;

    /* renamed from: e */
    private ConnectivityManager f29018e;

    /* renamed from: f */
    private final ConnectivityManager.NetworkCallback f29019f;

    public NetworkConnectivity(Context context) {
        int i = 1;
        this.f29015b = 1;
        this.f29016c = 2;
        this.f29017d = 0;
        this.f29019f = new ConnectivityManager.NetworkCallback() {
            public final void onAvailable(Network network) {
                super.onAvailable(network);
            }

            public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                NetworkConnectivity networkConnectivity;
                int i;
                super.onCapabilitiesChanged(network, networkCapabilities);
                if (networkCapabilities.hasTransport(0)) {
                    networkConnectivity = NetworkConnectivity.this;
                    i = 1;
                } else {
                    networkConnectivity = NetworkConnectivity.this;
                    i = 2;
                }
                int unused = networkConnectivity.f29017d = i;
            }

            public final void onLost(Network network) {
                super.onLost(network);
                int unused = NetworkConnectivity.this.f29017d = 0;
            }

            public final void onUnavailable() {
                super.onUnavailable();
                int unused = NetworkConnectivity.this.f29017d = 0;
            }
        };
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f29018e = connectivityManager;
        connectivityManager.registerDefaultNetworkCallback(this.f29019f);
        NetworkInfo activeNetworkInfo = this.f29018e.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            this.f29017d = activeNetworkInfo.getType() != 0 ? 2 : i;
        }
    }

    /* renamed from: a */
    public final int mo72892a() {
        return this.f29017d;
    }

    /* renamed from: b */
    public final void mo72893b() {
        this.f29018e.unregisterNetworkCallback(this.f29019f);
    }
}
