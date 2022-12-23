package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgcn extends zzgkk implements zzglz {
    private zzgcn() {
        super(zzgco.zzb);
    }

    public final zzgcn zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgco) this.zza).zzf = zzgjg;
        return this;
    }

    public final zzgcn zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgco) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgcn(zzgcm zzgcm) {
        super(zzgco.zzb);
    }
}
