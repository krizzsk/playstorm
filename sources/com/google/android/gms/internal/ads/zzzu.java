package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzzu implements zzzv {
    private final long zza;
    private final zzzt zzb;

    public zzzu(long j, long j2) {
        this.zza = j;
        zzzw zzzw = j2 == 0 ? zzzw.zza : new zzzw(0, j2);
        this.zzb = new zzzt(zzzw, zzzw);
    }

    public final long zze() {
        return this.zza;
    }

    public final zzzt zzg(long j) {
        return this.zzb;
    }

    public final boolean zzh() {
        return false;
    }
}
