package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfx extends zzgkk implements zzglz {
    private zzgfx() {
        super(zzgfy.zzb);
    }

    public final zzgfx zza(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfy) this.zza).zzg = i;
        return this;
    }

    public final zzgfx zzb(String str) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        zzgfy.zzd((zzgfy) this.zza, str);
        return this;
    }

    public final zzgfx zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfy) this.zza).zzh = zzggn.zza(i);
        return this;
    }

    public final zzgfx zzd(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfy) this.zza).zzf = zzgfj.zza(i);
        return this;
    }

    /* synthetic */ zzgfx(zzgfv zzgfv) {
        super(zzgfy.zzb);
    }
}
