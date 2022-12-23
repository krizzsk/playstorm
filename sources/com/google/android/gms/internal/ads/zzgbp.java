package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgbp extends zzgkk implements zzglz {
    private zzgbp() {
        super(zzgbq.zzb);
    }

    public final zzgbp zza(zzgbw zzgbw) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgbq.zzi((zzgbq) this.zza, zzgbw);
        return this;
    }

    public final zzgbp zzb(zzgek zzgek) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgbq.zzj((zzgbq) this.zza, zzgek);
        return this;
    }

    public final zzgbp zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgbq) this.zza).zze = i;
        return this;
    }

    /* synthetic */ zzgbp(zzgbo zzgbo) {
        super(zzgbq.zzb);
    }
}
