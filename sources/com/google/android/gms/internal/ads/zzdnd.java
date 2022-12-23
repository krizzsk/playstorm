package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdnd {
    private zzbkx zza;

    public zzdnd(zzdms zzdms) {
        this.zza = zzdms;
    }

    public final synchronized zzbkx zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbkx zzbkx) {
        this.zza = zzbkx;
    }
}
