package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzjx {
    public static final zzjx zza = new zzjx(0, 0);
    public static final zzjx zzb = new zzjx(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final zzjx zzc = new zzjx(Long.MAX_VALUE, 0);
    public static final zzjx zzd = new zzjx(0, Long.MAX_VALUE);
    public static final zzjx zze = zza;
    public final long zzf;
    public final long zzg;

    public zzjx(long j, long j2) {
        boolean z = true;
        zzcw.zzd(j >= 0);
        zzcw.zzd(j2 < 0 ? false : z);
        this.zzf = j;
        this.zzg = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzjx zzjx = (zzjx) obj;
            return this.zzf == zzjx.zzf && this.zzg == zzjx.zzg;
        }
    }

    public final int hashCode() {
        return (((int) this.zzf) * 31) + ((int) this.zzg);
    }
}
