package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzceo extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzcer zza;

    zzceo(zzcer zzcer) {
        this.zza = zzcer;
    }

    public final void onAvailable(Network network) {
        this.zza.zzm.set(true);
    }

    public final void onLost(Network network) {
        this.zza.zzm.set(false);
    }
}
