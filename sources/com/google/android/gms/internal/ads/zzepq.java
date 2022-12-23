package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzepq implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzepq(zzgqh zzgqh, zzgqh zzgqh2) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepl(((zzepg) this.zza).zzb(), 10000, (Clock) this.zzb.zzb());
    }
}
