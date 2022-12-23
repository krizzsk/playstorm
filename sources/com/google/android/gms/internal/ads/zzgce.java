package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgce extends zzgkk implements zzglz {
    private zzgce() {
        super(zzgcf.zzb);
    }

    public final zzgce zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgcf) this.zza).zzg = zzgjg;
        return this;
    }

    public final zzgce zzb(zzgcl zzgcl) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgcf.zzi((zzgcf) this.zza, zzgcl);
        return this;
    }

    public final zzgce zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgcf) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgce(zzgcd zzgcd) {
        super(zzgcf.zzb);
    }
}
