package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbee extends zzgkk implements zzglz {
    private zzbee() {
        super(zzbef.zzb);
    }

    public final zzbee zza(boolean z) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbef.zzd((zzbef) this.zza, z);
        return this;
    }

    public final zzbee zzb(boolean z) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbef.zze((zzbef) this.zza, z);
        return this;
    }

    public final zzbee zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzbef.zzf((zzbef) this.zza, i);
        return this;
    }

    /* synthetic */ zzbee(zzbds zzbds) {
        super(zzbef.zzb);
    }
}
