package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgjz {
    private final Object zza;
    private final int zzb;

    zzgjz(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgjz)) {
            return false;
        }
        zzgjz zzgjz = (zzgjz) obj;
        if (this.zza == zzgjz.zza && this.zzb == zzgjz.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
