package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzta implements zztr {
    final /* synthetic */ zztd zza;
    /* access modifiers changed from: private */
    public final int zzb;

    public zzta(zztd zztd, int i) {
        this.zza = zztd;
        this.zzb = i;
    }

    public final int zza(zzja zzja, zzgc zzgc, int i) {
        return this.zza.zzg(this.zzb, zzja, zzgc, i);
    }

    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    public final void zzd() throws IOException {
        this.zza.zzF(this.zzb);
    }

    public final boolean zze() {
        return this.zza.zzM(this.zzb);
    }
}
