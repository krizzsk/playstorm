package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbcs implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbct zza;

    zzbcs(zzbct zzbct) {
        this.zza = zzbct;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzb) {
            this.zza.zze = null;
            zzbct zzbct = this.zza;
            if (zzbct.zzc != null) {
                zzbct.zzc = null;
            }
            this.zza.zzb.notifyAll();
        }
    }
}
