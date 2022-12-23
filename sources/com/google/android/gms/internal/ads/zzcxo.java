package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcxo {
    private final zzdeh zza;
    private final zzdgn zzb;

    public zzcxo(zzdeh zzdeh, zzdgn zzdgn) {
        this.zza = zzdeh;
        this.zzb = zzdgn;
    }

    public final zzdeh zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final zzdgn zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzdiy zzc() {
        zzdgn zzdgn = this.zzb;
        if (zzdgn != null) {
            return new zzdiy(zzdgn, zzcfv.zzf);
        }
        return new zzdiy(new zzcxn(this), zzcfv.zzf);
    }
}
