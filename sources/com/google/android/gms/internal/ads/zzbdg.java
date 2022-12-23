package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbdg implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzbdh zzb;

    zzbdg(zzbdh zzbdh, zzcga zzcga) {
        this.zzb = zzbdh;
        this.zza = zzcga;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
