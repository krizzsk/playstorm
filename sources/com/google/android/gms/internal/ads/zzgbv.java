package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgbv extends zzgkk implements zzglz {
    private zzgbv() {
        super(zzgbw.zzb);
    }

    public final zzgbv zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgbw) this.zza).zzg = zzgjg;
        return this;
    }

    public final zzgbv zzb(zzgcc zzgcc) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgbw.zzj((zzgbw) this.zza, zzgcc);
        return this;
    }

    public final zzgbv zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgbw) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgbv(zzgbu zzgbu) {
        super(zzgbw.zzb);
    }
}
