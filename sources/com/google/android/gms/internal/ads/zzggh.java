package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzggh extends zzgkk implements zzglz {
    private zzggh() {
        super(zzggi.zzb);
    }

    public final zzggh zza(zzggl zzggl) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzggi.zzh((zzggi) this.zza, zzggl);
        return this;
    }

    public final zzggh zzb(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzggi) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzggh(zzggg zzggg) {
        super(zzggi.zzb);
    }
}
