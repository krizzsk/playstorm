package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfvp extends zzfvm implements ScheduledExecutorService, zzfvk {
    final ScheduledExecutorService zza;

    zzfvp(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        if (scheduledExecutorService != null) {
            this.zza = scheduledExecutorService;
            return;
        }
        throw null;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzfvy zzf = zzfvy.zzf(runnable, (Object) null);
        return new zzfvn(zzf, this.zza.schedule(zzf, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfvo zzfvo = new zzfvo(runnable);
        return new zzfvn(zzfvo, this.zza.scheduleAtFixedRate(zzfvo, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfvo zzfvo = new zzfvo(runnable);
        return new zzfvn(zzfvo, this.zza.scheduleWithFixedDelay(zzfvo, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzfvy zzfvy = new zzfvy(callable);
        return new zzfvn(zzfvy, this.zza.schedule(zzfvy, j, timeUnit));
    }
}
