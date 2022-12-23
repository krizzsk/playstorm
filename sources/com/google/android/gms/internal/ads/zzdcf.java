package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdcf extends zzdhb implements zzdbw {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd = false;

    public zzdcf(zzdce zzdce, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzb = scheduledExecutorService;
        zzj(zzdce, executor);
    }

    public final void zza(zze zze) {
        zzo(new zzdby(zze));
    }

    public final void zzb() {
        zzo(zzdca.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc() {
        synchronized (this) {
            com.google.android.gms.ads.internal.util.zze.zzg("Timeout waiting for show call succeed to be called.");
            zze(new zzdle("Timeout for show call succeed."));
            this.zzd = true;
        }
    }

    public final synchronized void zzd() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zze(zzdle zzdle) {
        if (!this.zzd) {
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            zzo(new zzdbx(zzdle));
        }
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new zzdbz(this), (long) ((Integer) zzay.zzc().zzb(zzbhy.zzic)).intValue(), TimeUnit.MILLISECONDS);
    }
}
