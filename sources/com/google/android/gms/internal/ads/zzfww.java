package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfww {
    @Deprecated
    public static final zzfwr zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgfu zzg = zzgfu.zzg(bArr, zzgka.zza());
            for (zzgft zzgft : zzg.zzh()) {
                if (zzgft.zzc().zzi() == 2 || zzgft.zzc().zzi() == 3 || zzgft.zzc().zzi() == 4) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzfwr.zza(zzg);
        } catch (zzgla unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
