package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeaj implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;

    public zzeaj(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
    }

    /* renamed from: zza */
    public final zzeai zzb() {
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        return new zzeai((ScheduledExecutorService) this.zza.zzb(), zzfvk, ((zzeba) this.zzc).zzb(), zzgpt.zza(this.zzd));
    }
}