package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgct extends zzgkk implements zzglz {
    private zzgct() {
        super(zzgcu.zzb);
    }

    public final zzgct zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgcu) this.zza).zzf = zzgjg;
        return this;
    }

    public final zzgct zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgcu) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgct(zzgcs zzgcs) {
        super(zzgcu.zzb);
    }
}
