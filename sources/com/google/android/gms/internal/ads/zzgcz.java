package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgcz extends zzgkk implements zzglz {
    private zzgcz() {
        super(zzgda.zzb);
    }

    public final zzgcz zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgda) this.zza).zzf = zzgjg;
        return this;
    }

    public final zzgcz zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgda) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgcz(zzgcy zzgcy) {
        super(zzgda.zzb);
    }
}
