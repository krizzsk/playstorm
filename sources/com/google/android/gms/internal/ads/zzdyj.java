package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdyj implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;
    private final zzgqh zzh;
    private final zzgqh zzi;
    private final zzgqh zzj;

    public zzdyj(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4, zzgqh zzgqh5, zzgqh zzgqh6, zzgqh zzgqh7, zzgqh zzgqh8, zzgqh zzgqh9, zzgqh zzgqh10) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
        this.zze = zzgqh5;
        this.zzf = zzgqh6;
        this.zzg = zzgqh7;
        this.zzh = zzgqh8;
        this.zzi = zzgqh9;
        this.zzj = zzgqh10;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcnk) this.zzb).zza();
        WeakReference zza3 = ((zzcnl) this.zzc).zza();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        return new zzdyi((Executor) this.zza.zzb(), zza2, zza3, zzfvk, (zzdub) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb(), (zzdwp) this.zzg.zzb(), ((zzcnu) this.zzh).zza(), ((zzdik) this.zzi).zzb(), (zzfhs) this.zzj.zzb());
    }
}
