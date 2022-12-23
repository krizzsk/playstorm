package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfvv extends zzfuq {
    /* access modifiers changed from: private */
    @CheckForNull
    public zzfvj zza;
    /* access modifiers changed from: private */
    @CheckForNull
    public ScheduledFuture zzb;

    private zzfvv(zzfvj zzfvj) {
        if (zzfvj != null) {
            this.zza = zzfvj;
            return;
        }
        throw null;
    }

    static zzfvj zzg(zzfvj zzfvj, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfvv zzfvv = new zzfvv(zzfvj);
        zzfvt zzfvt = new zzfvt(zzfvv);
        zzfvv.zzb = scheduledExecutorService.schedule(zzfvt, j, timeUnit);
        zzfvj.zzc(zzfvt, zzfuo.INSTANCE);
        return zzfvv;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        zzfvj zzfvj = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfvj == null) {
            return null;
        }
        String obj = zzfvj.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 14);
        sb.append("inputFuture=[");
        sb.append(obj);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() + 43);
        sb3.append(sb2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
