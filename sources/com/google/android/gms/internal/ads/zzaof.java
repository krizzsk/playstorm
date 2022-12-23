package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaof extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzaog zza;

    zzaof(zzaog zzaog) {
        this.zza = zzaog;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzaog.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (zzaog.class) {
            this.zza.zza = null;
        }
    }
}
