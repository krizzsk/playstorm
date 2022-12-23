package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeug implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;

    public zzeug(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4, zzgqh zzgqh5) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
        this.zze = zzgqh5;
    }

    public static zzeue zza(String str, zzbco zzbco, zzcer zzcer, ScheduledExecutorService scheduledExecutorService, zzfvk zzfvk) {
        return new zzeue(str, zzbco, zzcer, scheduledExecutorService, zzfvk, (byte[]) null);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        return new zzeue(((zzevg) this.zza).zza(), new zzbco(), (zzcer) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzfvk, (byte[]) null);
    }
}
