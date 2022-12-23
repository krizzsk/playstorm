package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgmk extends zzgiy {
    final zzgmo zza = new zzgmo(this.zzc, (zzgmn) null);
    zzgja zzb = zzb();
    final /* synthetic */ zzgmq zzc;

    zzgmk(zzgmq zzgmq) {
        this.zzc = zzgmq;
    }

    private final zzgja zzb() {
        zzgmo zzgmo = this.zza;
        if (zzgmo.hasNext()) {
            return zzgmo.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final byte zza() {
        zzgja zzgja = this.zzb;
        if (zzgja != null) {
            byte zza2 = zzgja.zza();
            if (!this.zzb.hasNext()) {
                this.zzb = zzb();
            }
            return zza2;
        }
        throw new NoSuchElementException();
    }
}
