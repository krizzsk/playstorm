package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzeiz extends zzeka {
    private final zzdjo zza;

    public zzeiz(zzdbq zzdbq, zzdjd zzdjd, zzdck zzdck, zzdcz zzdcz, zzdde zzdde, zzdcf zzdcf, zzdgl zzdgl, zzdjv zzdjv, zzddy zzddy, zzdjo zzdjo, zzdgh zzdgh) {
        super(zzdbq, zzdjd, zzdck, zzdcz, zzdde, zzdgl, zzddy, zzdjv, zzdgh, zzdcf);
        this.zza = zzdjo;
    }

    public final void zzs(zzcaw zzcaw) {
        this.zza.zza(zzcaw);
    }

    public final void zzt(zzcba zzcba) throws RemoteException {
        this.zza.zza(new zzcaw(zzcba.zzf(), zzcba.zze()));
    }

    public final void zzu() throws RemoteException {
        this.zza.zzb();
    }

    public final void zzv() {
        this.zza.zzb();
    }

    public final void zzy() {
        this.zza.zzc();
    }
}
