package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeao implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;
    private final zzgqh zzg;

    public zzeao(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4, zzgqh zzgqh5, zzgqh zzgqh6, zzgqh zzgqh7) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
        this.zze = zzgqh5;
        this.zzf = zzgqh6;
        this.zzg = zzgqh7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzfdh) this.zza).zza();
        zzfby zza3 = ((zzdbj) this.zzb).zza();
        zzdzo zza4 = ((zzdzp) this.zzc).zzb();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        return new zzean(zza2, zza3, zza4, zzfvk, (ScheduledExecutorService) this.zze.zzb(), (zzedr) this.zzf.zzb(), (zzfhq) this.zzg.zzb());
    }
}
