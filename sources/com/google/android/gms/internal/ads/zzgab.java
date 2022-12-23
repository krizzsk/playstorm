package com.google.android.gms.internal.ads;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgab {
    private static final byte[] zza = new byte[0];
    private final zzgaa zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzgab(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgaa zzgaa) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzgaa;
    }

    static zzgab zzc(byte[] bArr, byte[] bArr2, zzgam zzgam, zzfzz zzfzz, zzgaa zzgaa, byte[] bArr3) throws GeneralSecurityException {
        zzfzz zzfzz2 = zzfzz;
        byte[] bArr4 = zzgal.zzc;
        if (Arrays.equals(bArr4, bArr4)) {
            byte[] zzb2 = zzgal.zzb(zzgal.zzb, zzgal.zzc, zzgaa.zzb());
            byte[] zzc2 = zzghf.zzc(zzgal.zza, zzfzz2.zzd(zzgal.zzg, zza, "psk_id_hash", zzb2), zzfzz2.zzd(zzgal.zzg, bArr3, "info_hash", zzb2));
            zzfzz zzfzz3 = zzfzz;
            byte[] zzd2 = zzfzz2.zzd(bArr2, zza, "secret", zzb2);
            byte[] bArr5 = zzc2;
            byte[] bArr6 = zzb2;
            return new zzgab(bArr, zzfzz3.zzc(zzd2, bArr5, SDKConstants.PARAM_KEY, bArr6, zzgaa.zza()), zzfzz3.zzc(zzd2, bArr5, "base_nonce", bArr6, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzgaa);
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    private final synchronized byte[] zzd() throws GeneralSecurityException {
        byte[] zzd2;
        byte[] bArr = this.zze;
        byte[] byteArray = this.zzg.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            } else if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        zzd2 = zzghf.zzd(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) < 0) {
            this.zzg = this.zzg.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zzd2;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zza() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
