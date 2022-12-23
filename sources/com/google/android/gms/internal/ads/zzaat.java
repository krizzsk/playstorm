package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
abstract class zzaat {
    protected final zzzz zza;

    protected zzaat(zzzz zzzz) {
        this.zza = zzzz;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zza(zzdy zzdy) throws zzbp;

    /* access modifiers changed from: protected */
    public abstract boolean zzb(zzdy zzdy, long j) throws zzbp;

    public final boolean zzf(zzdy zzdy, long j) throws zzbp {
        return zza(zzdy) && zzb(zzdy, j);
    }
}
