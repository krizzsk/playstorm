package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbv {
    private final zzw zza = new zzw();

    public final zzbv zza(int i) {
        this.zza.zza(i);
        return this;
    }

    public final zzbv zzb(zzbx zzbx) {
        zzw zzw = this.zza;
        zzy zza2 = zzbx.zzc;
        for (int i = 0; i < zza2.zzb(); i++) {
            zzw.zza(zza2.zza(i));
        }
        return this;
    }

    public final zzbv zzc(int... iArr) {
        zzw zzw = this.zza;
        for (int i = 0; i < 20; i++) {
            zzw.zza(iArr[i]);
        }
        return this;
    }

    public final zzbv zzd(int i, boolean z) {
        zzw zzw = this.zza;
        if (z) {
            zzw.zza(i);
        }
        return this;
    }

    public final zzbx zze() {
        return new zzbx(this.zza.zzb(), (zzbw) null);
    }
}
