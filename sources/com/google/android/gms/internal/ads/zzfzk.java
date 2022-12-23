package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfzk extends zzgaq {
    zzfzk(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzgly zzgly) throws GeneralSecurityException {
        zzgdx zzgdx = (zzgdx) zzgly;
        zzgdu zzc = zzgdx.zzf().zzc();
        zzged zzf = zzc.zzf();
        int zzc2 = zzfzv.zzc(zzf.zzg());
        byte[] zzE = zzgdx.zzg().zzE();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, zzE), zzgho.zze(zzc2));
        return new zzghj((ECPrivateKey) ((KeyFactory) zzghq.zzg.zza("EC")).generatePrivate(eCPrivateKeySpec), zzf.zze().zzE(), zzfzv.zzb(zzf.zzh()), zzfzv.zzd(zzc.zzi()), new zzfzw(zzc.zza().zze()));
    }
}
