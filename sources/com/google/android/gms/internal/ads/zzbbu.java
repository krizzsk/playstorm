package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbbu {
    final long zza;
    final String zzb;
    final int zzc;

    zzbbu(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbbu)) {
            zzbbu zzbbu = (zzbbu) obj;
            if (zzbbu.zza == this.zza && zzbbu.zzc == this.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
