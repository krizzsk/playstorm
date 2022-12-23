package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzggb extends zzgkk implements zzglz {
    private zzggb() {
        super(zzggc.zzb);
    }

    public final zzggb zza(zzggf zzggf) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzggc.zzh((zzggc) this.zza, zzggf);
        return this;
    }

    public final zzggb zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzggc) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzggb(zzgga zzgga) {
        super(zzggc.zzb);
    }
}
