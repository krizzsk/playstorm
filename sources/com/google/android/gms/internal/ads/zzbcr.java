package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbcr implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbct zza;

    zzbcr(zzbct zzbct) {
        this.zza = zzbct;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzb) {
            try {
                zzbct zzbct = this.zza;
                if (zzbct.zzc != null) {
                    zzbct.zze = zzbct.zzc.zzq();
                }
            } catch (DeadObjectException e) {
                zze.zzh("Unable to obtain a cache service instance.", e);
                zzbct.zzh(this.zza);
            }
            this.zza.zzb.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzb) {
            this.zza.zze = null;
            this.zza.zzb.notifyAll();
        }
    }
}
