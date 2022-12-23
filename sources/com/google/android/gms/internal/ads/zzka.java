package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzka implements zzjc {
    private final zzcx zza;
    private boolean zzb;
    private long zzc;
    private long zzd;
    private zzbt zze = zzbt.zza;

    public zzka(zzcx zzcx) {
        this.zza = zzcx;
    }

    public final long zza() {
        long j;
        long j2 = this.zzc;
        if (!this.zzb) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzd;
        zzbt zzbt = this.zze;
        if (zzbt.zzc == 1.0f) {
            j = zzeg.zzv(elapsedRealtime);
        } else {
            j = zzbt.zza(elapsedRealtime);
        }
        return j2 + j;
    }

    public final void zzb(long j) {
        this.zzc = j;
        if (this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
        }
    }

    public final zzbt zzc() {
        return this.zze;
    }

    public final void zzd() {
        if (!this.zzb) {
            this.zzd = SystemClock.elapsedRealtime();
            this.zzb = true;
        }
    }

    public final void zze() {
        if (this.zzb) {
            zzb(zza());
            this.zzb = false;
        }
    }

    public final void zzg(zzbt zzbt) {
        if (this.zzb) {
            zzb(zza());
        }
        this.zze = zzbt;
    }
}
