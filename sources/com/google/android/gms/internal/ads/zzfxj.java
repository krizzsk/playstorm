package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfxj {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzgfz zza(zzgfu zzgfu) {
        zzgfw zza2 = zzgfz.zza();
        zza2.zzb(zzgfu.zzc());
        for (zzgft zzgft : zzgfu.zzh()) {
            zzgfx zza3 = zzgfy.zza();
            zza3.zzb(zzgft.zzc().zzf());
            zza3.zzd(zzgft.zzi());
            zza3.zzc(zzgft.zzj());
            zza3.zza(zzgft.zza());
            zza2.zza((zzgfy) zza3.zzaj());
        }
        return (zzgfz) zza2.zzaj();
    }

    public static void zzb(zzgfu zzgfu) throws GeneralSecurityException {
        int zzc = zzgfu.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgft zzgft : zzgfu.zzh()) {
            if (zzgft.zzi() == 3) {
                if (!zzgft.zzh()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzgft.zza())}));
                } else if (zzgft.zzj() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzgft.zza())}));
                } else if (zzgft.zzi() != 2) {
                    if (zzgft.zza() == zzc) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= zzgft.zzc().zzi() == 5;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzgft.zza())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
