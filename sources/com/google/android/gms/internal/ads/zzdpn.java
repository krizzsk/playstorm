package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdpn implements zzgpu {
    private final zzdpg zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzdpn(zzdpg zzdpg, zzgqh zzgqh, zzgqh zzgqh2) {
        this.zza = zzdpg;
        this.zzb = zzgqh;
        this.zzc = zzgqh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdiy(((zzdso) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
