package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgam {
    private final zzfzz zza;

    zzgam(zzfzz zzfzz) {
        this.zza = zzfzz;
    }

    /* access modifiers changed from: package-private */
    public final zzgae zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2 = zzgil.zza(bArr2, bArr);
        byte[] zzc = zzgil.zzc(bArr2);
        byte[] zzc2 = zzghf.zzc(zzc, bArr);
        byte[] zzd = zzgal.zzd(zzgal.zzb);
        zzfzz zzfzz = this.zza;
        return new zzgae(zzfzz.zzb((byte[]) null, zza2, "eae_prk", zzc2, "shared_secret", zzd, zzfzz.zza()), zzc);
    }
}
