package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbqd implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcga zza;

    zzbqd(zzbqe zzbqe, zzcga zzcga) {
        this.zza = zzcga;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}
