package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgej extends zzgkk implements zzglz {
    private zzgej() {
        super(zzgek.zzb);
    }

    public final zzgej zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgek) this.zza).zzg = zzgjg;
        return this;
    }

    public final zzgej zzb(zzgeq zzgeq) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgek.zzj((zzgek) this.zza, zzgeq);
        return this;
    }

    public final zzgej zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgek) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgej(zzgei zzgei) {
        super(zzgek.zzb);
    }
}
