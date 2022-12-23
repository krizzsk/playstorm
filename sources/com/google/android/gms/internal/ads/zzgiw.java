package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgiw extends zzgiy {
    final /* synthetic */ zzgjg zza;
    private int zzb = 0;
    private final int zzc = this.zza.zzd();

    zzgiw(zzgjg zzgjg) {
        this.zza = zzgjg;
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
