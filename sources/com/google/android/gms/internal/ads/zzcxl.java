package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcxl implements zzddg, zzbam {
    private final zzfbg zza;
    private final zzdck zzb;
    private final zzddp zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcxl(zzfbg zzfbg, zzdck zzdck, zzddp zzddp) {
        this.zza = zzfbg;
        this.zzb = zzdck;
        this.zzc = zzddp;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    public final void zzc(zzbal zzbal) {
        if (this.zza.zzf == 1 && zzbal.zzj) {
            zza();
        }
        if (zzbal.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    public final synchronized void zzn() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
