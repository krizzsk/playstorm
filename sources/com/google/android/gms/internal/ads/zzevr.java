package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzevr implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;
    private final zzgqh zzf;

    public zzevr(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4, zzgqh zzgqh5, zzgqh zzgqh6) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
        this.zze = zzgqh5;
        this.zzf = zzgqh6;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        boolean booleanValue = ((zzevi) this.zzb).zzb().booleanValue();
        zzceg zzceg = new zzceg();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        return new zzevp((zzcer) this.zza.zzb(), booleanValue, zzceg, zzfvk, ((zzevg) this.zze).zza(), (ScheduledExecutorService) this.zzf.zzb(), (byte[]) null);
    }
}
