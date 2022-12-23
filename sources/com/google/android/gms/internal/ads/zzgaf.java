package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgaf {
    static zzgaa zza(zzgey zzgey) throws GeneralSecurityException {
        if (zzgey.zze() == 3) {
            return new zzfzx(16);
        }
        if (zzgey.zze() == 4) {
            return new zzfzx(32);
        }
        if (zzgey.zze() == 5) {
            return new zzfzy();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static zzfzz zzb(zzgey zzgey) {
        if (zzgey.zzf() == 3) {
            return new zzfzz("HmacSha256");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    static zzgam zzc(zzgey zzgey) {
        if (zzgey.zzg() == 3) {
            return new zzgam(new zzfzz("HmacSha256"));
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
