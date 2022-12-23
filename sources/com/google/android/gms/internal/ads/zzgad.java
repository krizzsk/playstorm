package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgad implements zzfwl {
    private static final byte[] zza = new byte[0];
    private final zzgfe zzb;
    private final zzgaa zzc;
    private final zzgam zzd;
    private final zzfzz zze;

    private zzgad(zzgfe zzgfe, zzgam zzgam, zzfzz zzfzz, zzgaa zzgaa, byte[] bArr) {
        this.zzb = zzgfe;
        this.zzd = zzgam;
        this.zze = zzfzz;
        this.zzc = zzgaa;
    }

    static zzgad zzb(zzgfe zzgfe) throws GeneralSecurityException {
        if (!zzgfe.zzh().zzD()) {
            zzgey zzc2 = zzgfe.zzc();
            return new zzgad(zzgfe, zzgaf.zzc(zzc2), zzgaf.zzb(zzc2), zzgaf.zza(zzc2), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzgfe zzgfe = this.zzb;
        zzgam zzgam = this.zzd;
        zzfzz zzfzz = this.zze;
        zzgaa zzgaa = this.zzc;
        zzgae zza2 = zzgam.zza(zzgfe.zzh().zzE(), zzgil.zzb());
        zzgab zzc2 = zzgab.zzc(zza2.zza(), zza2.zzb(), zzgam, zzfzz, zzgaa, bArr3);
        return zzghf.zzc(zzc2.zza(), zzc2.zzb(bArr, zza));
    }
}
