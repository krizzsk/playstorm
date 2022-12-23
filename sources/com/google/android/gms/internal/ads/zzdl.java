package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdl {
    public final Object zza;
    private zzw zzb = new zzw();
    private boolean zzc;
    private boolean zzd;

    public zzdl(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzdl) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, zzdj zzdj) {
        if (!this.zzd) {
            if (i != -1) {
                this.zzb.zza(i);
            }
            this.zzc = true;
            zzdj.zza(this.zza);
        }
    }

    public final void zzb(zzdk zzdk) {
        if (!this.zzd && this.zzc) {
            zzy zzb2 = this.zzb.zzb();
            this.zzb = new zzw();
            this.zzc = false;
            zzdk.zza(this.zza, zzb2);
        }
    }

    public final void zzc(zzdk zzdk) {
        this.zzd = true;
        if (this.zzc) {
            zzdk.zza(this.zza, this.zzb.zzb());
        }
    }
}
