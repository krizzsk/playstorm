package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzkj {
    public final long zza;
    public final zzci zzb;
    public final int zzc;
    public final zzsb zzd;
    public final long zze;
    public final zzci zzf;
    public final int zzg;
    public final zzsb zzh;
    public final long zzi;
    public final long zzj;

    public zzkj(long j, zzci zzci, int i, zzsb zzsb, long j2, zzci zzci2, int i2, zzsb zzsb2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzci;
        this.zzc = i;
        this.zzd = zzsb;
        this.zze = j2;
        this.zzf = zzci2;
        this.zzg = i2;
        this.zzh = zzsb2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzkj zzkj = (zzkj) obj;
            return this.zza == zzkj.zza && this.zzc == zzkj.zzc && this.zze == zzkj.zze && this.zzg == zzkj.zzg && this.zzi == zzkj.zzi && this.zzj == zzkj.zzj && zzfoo.zza(this.zzb, zzkj.zzb) && zzfoo.zza(this.zzd, zzkj.zzd) && zzfoo.zza(this.zzf, zzkj.zzf) && zzfoo.zza(this.zzh, zzkj.zzh);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
