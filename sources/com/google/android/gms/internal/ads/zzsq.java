package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzsq implements zztr {
    private final zztr zza;
    private final long zzb;

    public zzsq(zztr zztr, long j) {
        this.zza = zztr;
        this.zzb = j;
    }

    public final int zza(zzja zzja, zzgc zzgc, int i) {
        int zza2 = this.zza.zza(zzja, zzgc, i);
        if (zza2 != -4) {
            return zza2;
        }
        zzgc.zzd = Math.max(0, zzgc.zzd + this.zzb);
        return -4;
    }

    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zztr zzc() {
        return this.zza;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return this.zza.zze();
    }
}
