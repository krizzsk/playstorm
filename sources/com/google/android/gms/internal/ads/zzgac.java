package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgac implements zzfwk {
    private final zzgfb zza;
    private final zzgaa zzb;
    private final zzgam zzc;
    private final zzfzz zzd;

    private zzgac(zzgfb zzgfb, zzgam zzgam, zzfzz zzfzz, zzgaa zzgaa, int i, byte[] bArr) {
        this.zza = zzgfb;
        this.zzc = zzgam;
        this.zzd = zzfzz;
        this.zzb = zzgaa;
    }

    static zzgac zza(zzgfb zzgfb) throws GeneralSecurityException {
        if (!zzgfb.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!zzgfb.zzf().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!zzgfb.zzg().zzD()) {
            zzgey zzc2 = zzgfb.zzf().zzc();
            zzgam zzc3 = zzgaf.zzc(zzc2);
            zzfzz zzb2 = zzgaf.zzb(zzc2);
            zzgaa zza2 = zzgaf.zza(zzc2);
            int zzg = zzc2.zzg();
            if (zzg - 2 == 1) {
                return new zzgac(zzgfb, zzc3, zzb2, zza2, 32, (byte[]) null);
            }
            throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzges.zza(zzg)));
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }
}
