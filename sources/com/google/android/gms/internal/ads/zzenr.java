package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzenr implements zzetb {
    private final zzfvj zza;
    private final Executor zzb;

    public zzenr(zzfvj zzfvj, Executor executor) {
        this.zza = zzfvj;
        this.zzb = executor;
    }

    public final int zza() {
        return 6;
    }

    public final zzfvj zzb() {
        return zzfva.zzn(this.zza, zzenq.zza, this.zzb);
    }
}
