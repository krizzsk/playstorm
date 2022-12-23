package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdas implements zzdbs, zzdip, zzdgj, zzdci {
    /* access modifiers changed from: private */
    public final zzdck zza;
    private final zzfbg zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final zzfvr zze = zzfvr.zzf();
    private ScheduledFuture zzf;

    public zzdas(zzdck zzdck, zzfbg zzfbg, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.zza = zzdck;
        this.zzb = zzfbg;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        synchronized (this) {
            if (!this.zze.isDone()) {
                this.zze.zzd(true);
            }
        }
    }

    public final void zzbv() {
    }

    public final void zzc() {
    }

    public final synchronized void zzd() {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zzd(true);
        }
    }

    public final void zze() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbp)).booleanValue()) {
            zzfbg zzfbg = this.zzb;
            if (zzfbg.zzZ != 2) {
                return;
            }
            if (zzfbg.zzr == 0) {
                this.zza.zza();
                return;
            }
            zzfva.zzr(this.zze, new zzdar(this), this.zzd);
            this.zzf = this.zzc.schedule(new zzdaq(this), (long) this.zzb.zzr, TimeUnit.MILLISECONDS);
        }
    }

    public final void zzf() {
    }

    public final void zzj() {
    }

    public final synchronized void zzk(zze zze2) {
        if (!this.zze.isDone()) {
            ScheduledFuture scheduledFuture = this.zzf;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.zze.zze(new Exception());
        }
    }

    public final void zzm() {
    }

    public final void zzo() {
        int i = this.zzb.zzZ;
        if (i == 0 || i == 1) {
            this.zza.zza();
        }
    }

    public final void zzp(zzcak zzcak, String str, String str2) {
    }

    public final void zzr() {
    }
}
