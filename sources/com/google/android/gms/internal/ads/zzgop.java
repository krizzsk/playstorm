package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgop extends zzgkk implements zzglz {
    private zzgop() {
        super(zzgor.zzb);
    }

    public final zzgop zza(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgor.zze((zzgor) this.zza, zzgjg);
        return this;
    }

    public final zzgop zzb(String str) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgor.zzd((zzgor) this.zza, "image/png");
        return this;
    }

    public final zzgop zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgor.zzf((zzgor) this.zza, 2);
        return this;
    }

    /* synthetic */ zzgop(zzgoa zzgoa) {
        super(zzgor.zzb);
    }
}
