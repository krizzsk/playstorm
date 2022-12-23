package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfzg extends zzgar {
    zzfzg() {
        super(zzgda.class, new zzfze(zzfwj.class));
    }

    public final zzgap zza() {
        return new zzfzf(this, zzgdd.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgda.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgda zzgda = (zzgda) zzgly;
        zzgik.zzb(zzgda.zza(), 0);
        if (zzgda.zzf().zzd() != 64) {
            int zzd = zzgda.zzf().zzd();
            throw new InvalidKeyException("invalid key size: " + zzd + ". Valid keys must have 64 bytes.");
        }
    }

    public final int zzf() {
        return 3;
    }
}
