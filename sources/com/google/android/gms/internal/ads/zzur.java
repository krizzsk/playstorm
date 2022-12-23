package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzur implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzur(zzad zzad, int i) {
        this.zza = 1 != (zzad.zze & 1) ? false : true;
        this.zzb = zzvf.zzi(i, false);
    }

    /* renamed from: zza */
    public final int compareTo(zzur zzur) {
        return zzfqw.zzj().zzd(this.zzb, zzur.zzb).zzd(this.zza, zzur.zza).zza();
    }
}
