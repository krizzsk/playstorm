package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgbc implements zzfwv {
    private final zzfxa zza;
    private final byte[] zzb = {0};

    /* synthetic */ zzgbc(zzfxa zzfxa, zzgbb zzgbb) {
        this.zza = zzfxa;
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfwx zzfwx : this.zza.zze(copyOf)) {
                try {
                    if (zzfwx.zzd() == 4) {
                        ((zzfwv) zzfwx.zza()).zza(copyOfRange, zzghf.zzc(bArr2, this.zzb));
                        return;
                    }
                    ((zzfwv) zzfwx.zza()).zza(copyOfRange, bArr2);
                    return;
                } catch (GeneralSecurityException e) {
                    zzgbd.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (zzfwx zza2 : this.zza.zze(zzfwi.zza)) {
                try {
                    ((zzfwv) zza2.zza()).zza(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        if (this.zza.zzb().zzd() == 4) {
            return zzghf.zzc(this.zza.zzb().zzb(), ((zzfwv) this.zza.zzb().zza()).zzb(zzghf.zzc(bArr, this.zzb)));
        }
        return zzghf.zzc(this.zza.zzb().zzb(), ((zzfwv) this.zza.zzb().zza()).zzb(bArr));
    }
}
