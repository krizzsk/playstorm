package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzemo implements zzdbv {
    public final /* synthetic */ zzemc zza;
    public final /* synthetic */ zzbra zzb;

    public /* synthetic */ zzemo(zzemc zzemc, zzbra zzbra) {
        this.zza = zzemc;
        this.zzb = zzbra;
    }

    public final void zza(zze zze) {
        zzemc zzemc = this.zza;
        zzbra zzbra = this.zzb;
        zzemc.zza(zze);
        if (zzbra != null) {
            try {
                zzbra.zzf(zze);
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
        if (zzbra != null) {
            try {
                zzbra.zze(zze.zza);
            } catch (RemoteException e2) {
                zzcfi.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
