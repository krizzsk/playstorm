package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzccq implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzccq(zzgqh zzgqh, zzgqh zzgqh2) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
    }

    /* renamed from: zza */
    public final zzccp zzb() {
        return new zzccp((Clock) this.zza.zzb(), (zzccn) this.zzb.zzb());
    }
}
