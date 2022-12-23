package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzffe implements zzgpu {
    private final zzgqh zza;

    public zzffe(zzgqh zzgqh) {
        this.zza = zzgqh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfnt.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.zza.zzb()));
        zzgqc.zzb(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
