package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfw extends zzgkk implements zzglz {
    private zzgfw() {
        super(zzgfz.zzb);
    }

    public final zzgfw zza(zzgfy zzgfy) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgfz.zze((zzgfz) this.zza, zzgfy);
        return this;
    }

    public final zzgfw zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfz) this.zza).zze = i;
        return this;
    }

    /* synthetic */ zzgfw(zzgfv zzgfv) {
        super(zzgfz.zzb);
    }
}
