package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdkh implements zzgpu {
    private final zzdkc zza;
    private final zzgqh zzb;

    public zzdkh(zzdkc zzdkc, zzgqh zzgqh) {
        this.zza = zzdkc;
        this.zzb = zzgqh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdiy((zzdas) this.zzb.zzb(), zzcfv.zzf));
        zzgqc.zzb(singleton);
        return singleton;
    }
}
