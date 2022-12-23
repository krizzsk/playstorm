package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeni implements zzetb {
    private final Clock zza;
    private final zzfby zzb;

    zzeni(Clock clock, zzfby zzfby) {
        this.zza = clock;
        this.zzb = zzfby;
    }

    public final int zza() {
        return 4;
    }

    public final zzfvj zzb() {
        return zzfva.zzi(new zzenj(this.zzb, this.zza.currentTimeMillis()));
    }
}
