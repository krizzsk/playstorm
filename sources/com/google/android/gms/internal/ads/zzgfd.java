package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfd extends zzgkk implements zzglz {
    private zzgfd() {
        super(zzgfe.zzb);
    }

    public final zzgfd zza(zzgey zzgey) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgfe.zzj((zzgfe) this.zza, zzgey);
        return this;
    }

    public final zzgfd zzb(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfe) this.zza).zzg = zzgjg;
        return this;
    }

    public final zzgfd zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfe) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgfd(zzgfc zzgfc) {
        super(zzgfe.zzb);
    }
}
