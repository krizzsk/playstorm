package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdxt extends zzcbj {
    final /* synthetic */ zzdxv zza;

    zzdxt(zzdxv zzdxv) {
        this.zza = zzdxv;
    }

    public final void zze(int i) throws RemoteException {
        zzdxv zzdxv = this.zza;
        zzdxv.zzc.zzm(zzdxv.zza, i);
    }

    public final void zzf(zze zze) throws RemoteException {
        zzdxv zzdxv = this.zza;
        zzdxv.zzc.zzm(zzdxv.zza, zze.zza);
    }

    public final void zzg() throws RemoteException {
        zzdxv zzdxv = this.zza;
        zzdxv.zzc.zzp(zzdxv.zza);
    }
}
