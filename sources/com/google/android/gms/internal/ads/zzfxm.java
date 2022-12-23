package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfxm implements zzfwd {
    private final zzfxa zza;

    /* synthetic */ zzfxm(zzfxa zzfxa, zzfxl zzfxl) {
        this.zza = zzfxa;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwx zza2 : this.zza.zze(copyOfRange)) {
                try {
                    return ((zzfwd) zza2.zza()).zza(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    zzfxn.zza.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e.toString())));
                }
            }
        }
        for (zzfwx zza3 : this.zza.zze(zzfwi.zza)) {
            try {
                return ((zzfwd) zza3.zza()).zza(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzghf.zzc(this.zza.zzb().zzb(), ((zzfwd) this.zza.zzb().zza()).zzb(bArr, bArr2));
    }
}
