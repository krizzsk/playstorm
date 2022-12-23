package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzca {
    public static final zzl zza = zzbz.zza;
    public final Object zzb;
    public final int zzc;
    public final zzbb zzd;
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;

    public zzca(Object obj, int i, zzbb zzbb, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zzb = obj;
        this.zzc = i;
        this.zzd = zzbb;
        this.zze = obj2;
        this.zzf = i2;
        this.zzg = j;
        this.zzh = j2;
        this.zzi = i3;
        this.zzj = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzca zzca = (zzca) obj;
            return this.zzc == zzca.zzc && this.zzf == zzca.zzf && this.zzg == zzca.zzg && this.zzh == zzca.zzh && this.zzi == zzca.zzi && this.zzj == zzca.zzj && zzfoo.zza(this.zzb, zzca.zzb) && zzfoo.zza(this.zze, zzca.zze) && zzfoo.zza(this.zzd, zzca.zzd);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj)});
    }
}
