package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzzt {
    public final zzzw zza;
    public final zzzw zzb;

    public zzzt(zzzw zzzw, zzzw zzzw2) {
        this.zza = zzzw;
        this.zzb = zzzw2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzzt zzzt = (zzzt) obj;
            return this.zza.equals(zzzt.zza) && this.zzb.equals(zzzt.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String concat = this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString());
        return "[" + obj + concat + "]";
    }
}
