package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgbj extends zzgkk implements zzglz {
    private zzgbj() {
        super(zzgbk.zzb);
    }

    public final zzgbj zza(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgbk) this.zza).zze = 32;
        return this;
    }

    public final zzgbj zzb(zzgbn zzgbn) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgbk.zzh((zzgbk) this.zza, zzgbn);
        return this;
    }

    /* synthetic */ zzgbj(zzgbi zzgbi) {
        super(zzgbk.zzb);
    }
}
