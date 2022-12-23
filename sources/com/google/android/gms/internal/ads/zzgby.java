package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgby extends zzgkk implements zzglz {
    private zzgby() {
        super(zzgbz.zzb);
    }

    public final zzgby zza(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgbz) this.zza).zzf = i;
        return this;
    }

    public final zzgby zzb(zzgcc zzgcc) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgbz.zzh((zzgbz) this.zza, zzgcc);
        return this;
    }

    /* synthetic */ zzgby(zzgbx zzgbx) {
        super(zzgbz.zzb);
    }
}
