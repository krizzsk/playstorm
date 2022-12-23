package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgdw extends zzgkk implements zzglz {
    private zzgdw() {
        super(zzgdx.zzb);
    }

    public final zzgdw zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgdx) this.zza).zzg = zzgjg;
        return this;
    }

    public final zzgdw zzb(zzgea zzgea) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgdx.zzi((zzgdx) this.zza, zzgea);
        return this;
    }

    public final zzgdw zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgdx) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgdw(zzgdv zzgdv) {
        super(zzgdx.zzb);
    }
}
