package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzje {
    public final zzsb zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    zzje(zzsb zzsb, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzcw.zzd(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzcw.zzd(z5);
        this.zza = zzsb;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzje zzje = (zzje) obj;
            return this.zzb == zzje.zzb && this.zzc == zzje.zzc && this.zzd == zzje.zzd && this.zze == zzje.zze && this.zzg == zzje.zzg && this.zzh == zzje.zzh && this.zzi == zzje.zzi && zzeg.zzS(this.zza, zzje.zza);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzje zza(long j) {
        if (j == this.zzc) {
            return this;
        }
        return new zzje(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzje zzb(long j) {
        if (j == this.zzb) {
            return this;
        }
        return new zzje(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
