package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzejo extends zzcau {
    final /* synthetic */ zzddy zza;
    final /* synthetic */ zzdbq zzb;
    final /* synthetic */ zzdcz zzc;
    final /* synthetic */ zzdjo zzd;

    zzejo(zzejp zzejp, zzddy zzddy, zzdbq zzdbq, zzdcz zzdcz, zzdjo zzdjo) {
        this.zza = zzddy;
        this.zzb = zzdbq;
        this.zzc = zzdcz;
        this.zzd = zzdjo;
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzf(4);
    }

    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzb();
    }

    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper, zzcaw zzcaw) {
        this.zzd.zza(zzcaw);
    }

    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzc.zze();
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
