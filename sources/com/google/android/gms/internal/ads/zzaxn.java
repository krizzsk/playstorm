package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaxn extends zzasd {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzaxn(long j, boolean z) {
        this.zzc = j;
        this.zzd = j;
    }

    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzasb zzd(int i, zzasb zzasb, boolean z) {
        zzayy.zza(i, 0, 1);
        Object obj = z ? zzb : null;
        long j = this.zzc;
        zzasb.zza = obj;
        zzasb.zzb = obj;
        zzasb.zzc = j;
        return zzasb;
    }

    public final zzasc zze(int i, zzasc zzasc, boolean z, long j) {
        zzayy.zza(i, 0, 1);
        zzasc.zza = this.zzd;
        return zzasc;
    }
}
