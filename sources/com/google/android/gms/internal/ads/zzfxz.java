package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfxz extends zzgar {
    zzfxz() {
        super(zzgco.class, new zzfxx(zzfwd.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzg(int i, int i2) {
        zzgcq zzc = zzgcr.zzc();
        zzc.zza(i);
        return new zzgao((zzgcr) zzc.zzaj(), i2);
    }

    public final zzgap zza() {
        return new zzfxy(this, zzgcr.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgco.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgco zzgco = (zzgco) zzgly;
        zzgik.zzb(zzgco.zza(), 0);
        zzgik.zza(zzgco.zzf().zzd());
    }

    public final int zze() {
        return 2;
    }

    public final int zzf() {
        return 3;
    }
}
