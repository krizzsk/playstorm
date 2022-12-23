package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcud implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;
    private final zzgqh zze;

    public zzcud(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4, zzgqh zzgqh5) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
        this.zze = zzgqh5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcuc((zzbti) this.zza.zzb(), (zzcty) this.zzb.zzb(), (Executor) this.zzc.zzb(), (zzctx) this.zzd.zzb(), (Clock) this.zze.zzb());
    }
}
