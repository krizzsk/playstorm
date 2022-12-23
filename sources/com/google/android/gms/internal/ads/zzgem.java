package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgem extends zzgkk implements zzglz {
    private zzgem() {
        super(zzgen.zzb);
    }

    public final zzgem zza(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgen) this.zza).zzf = i;
        return this;
    }

    public final zzgem zzb(zzgeq zzgeq) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgen.zzh((zzgen) this.zza, zzgeq);
        return this;
    }

    /* synthetic */ zzgem(zzgel zzgel) {
        super(zzgen.zzb);
    }
}
