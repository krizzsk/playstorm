package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzggs extends zzgkk implements zzglz {
    private zzggs() {
        super(zzggt.zzb);
    }

    public final zzggs zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzggt) this.zza).zzf = zzgjg;
        return this;
    }

    public final zzggs zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzggt) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzggs(zzggr zzggr) {
        super(zzggt.zzb);
    }
}
