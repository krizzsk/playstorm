package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgai extends zzgas {
    public zzgai() {
        super(zzgfb.class, zzgfe.class, new zzgag(zzfwk.class));
    }

    static /* bridge */ /* synthetic */ zzgao zzg(int i, int i2, int i3, int i4) {
        zzgex zza = zzgey.zza();
        zza.zzc(3);
        zza.zzb(3);
        zza.zza(i3);
        zzgeu zza2 = zzgev.zza();
        zza2.zza((zzgey) zza.zzaj());
        return new zzgao((zzgev) zza2.zzaj(), i4);
    }

    public final zzgap zza() {
        return new zzgah(this, zzgev.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgfb.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgfb zzgfb = (zzgfb) zzgly;
        if (zzgfb.zzg().zzD()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zzgfb.zzk()) {
            zzgik.zzb(zzgfb.zza(), 0);
            zzgal.zza(zzgfb.zzf().zzc());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    public final int zzf() {
        return 4;
    }
}
