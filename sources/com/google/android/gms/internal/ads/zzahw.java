package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzahw {
    public final int zza;
    public final long zzb;

    private zzahw(int i, long j) {
        this.zza = i;
        this.zzb = j;
    }

    public static zzahw zza(zzyt zzyt, zzdy zzdy) throws IOException {
        ((zzym) zzyt).zzm(zzdy.zzH(), 0, 8, false);
        zzdy.zzF(0);
        return new zzahw(zzdy.zze(), zzdy.zzq());
    }
}
