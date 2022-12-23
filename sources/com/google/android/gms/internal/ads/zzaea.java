package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzaea implements zzady {
    private final int zza;
    private final int zzb;
    private final zzdy zzc;

    public zzaea(zzadv zzadv, zzad zzad) {
        zzdy zzdy = zzadv.zza;
        this.zzc = zzdy;
        zzdy.zzF(12);
        int zzn = this.zzc.zzn();
        if ("audio/raw".equals(zzad.zzm)) {
            int zzo = zzeg.zzo(zzad.zzB, zzad.zzz);
            if (zzn == 0 || zzn % zzo != 0) {
                Log.w("AtomParsers", "Audio sample size mismatch. stsd sample size: " + zzo + ", stsz sample size: " + zzn);
                zzn = zzo;
            }
        }
        this.zza = zzn == 0 ? -1 : zzn;
        this.zzb = this.zzc.zzn();
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        int i = this.zza;
        return i == -1 ? this.zzc.zzn() : i;
    }
}
