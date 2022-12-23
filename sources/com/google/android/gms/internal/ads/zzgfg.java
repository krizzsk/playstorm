package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgfg extends zzgkk implements zzglz {
    private zzgfg() {
        super(zzgfh.zzb);
    }

    public final zzgfg zza(String str) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfh) this.zza).zze = str;
        return this;
    }

    public final zzgfg zzb(zzgjg zzgjg) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfh) this.zza).zzf = zzgjg;
        return this;
    }

    public final zzgfg zzc(int i) {
        if (this.zzb) {
            zzan();
            this.zzb = false;
        }
        ((zzgfh) this.zza).zzg = i - 2;
        return this;
    }

    /* synthetic */ zzgfg(zzgff zzgff) {
        super(zzgfh.zzb);
    }
}
