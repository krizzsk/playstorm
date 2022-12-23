package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeke implements zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdbq zzb;
    private final zzdck zzc;
    private final zzdjh zzd;
    private final zzdja zze;
    private final zzcuc zzf;

    zzeke(zzdbq zzdbq, zzdck zzdck, zzdjh zzdjh, zzdja zzdja, zzcuc zzcuc) {
        this.zzb = zzdbq;
        this.zzc = zzdck;
        this.zzd = zzdjh;
        this.zze = zzdja;
        this.zzf = zzcuc;
    }

    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
