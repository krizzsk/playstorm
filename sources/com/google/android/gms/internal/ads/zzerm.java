package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzerm implements zzetb {
    private final zzetb zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzerm(zzetb zzetb, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetb;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return 28;
    }

    public final zzfvj zzb() {
        zzfvj zzb2 = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            zzb2 = zzfva.zzo(zzb2, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfva.zzg(zzb2, Throwable.class, zzerl.zza, zzcfv.zzf);
    }
}
