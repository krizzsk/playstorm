package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzflr extends zzgkk implements zzglz {
    private zzflr() {
        super(zzflt.zzb);
    }

    public final zzflr zza(String str) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzflt.zzd((zzflt) this.zza, str);
        return this;
    }

    public final zzflr zzb(zzflo zzflo) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzflt.zze((zzflt) this.zza, (zzflp) zzflo.zzaj());
        return this;
    }

    public final zzflr zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzflt.zzf((zzflt) this.zza, 2);
        return this;
    }

    /* synthetic */ zzflr(zzflq zzflq) {
        super(zzflt.zzb);
    }
}
