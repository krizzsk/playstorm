package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfzl extends zzgap {
    final /* synthetic */ zzfzm zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzl(zzfzm zzfzm, Class cls) {
        super(cls);
        this.zza = zzfzm;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzgdr zzgdr = (zzgdr) zzgly;
        KeyPair zzb = zzgho.zzb(zzgho.zze(zzfzv.zzc(zzgdr.zze().zzf().zzg())));
        ECPoint w = ((ECPublicKey) zzb.getPublic()).getW();
        zzgdz zzd = zzgea.zzd();
        zzd.zzb(0);
        zzd.zza(zzgdr.zze());
        zzd.zzc(zzgjg.zzv(w.getAffineX().toByteArray()));
        zzd.zzd(zzgjg.zzv(w.getAffineY().toByteArray()));
        zzgdw zzc = zzgdx.zzc();
        zzc.zzc(0);
        zzc.zzb((zzgea) zzd.zzaj());
        zzc.zza(zzgjg.zzv(((ECPrivateKey) zzb.getPrivate()).getS().toByteArray()));
        return (zzgdx) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgdr.zzd(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzfzm.zzh(4, 5, 3, zzfwq.zza("AES128_GCM"), zzfzm.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfzm.zzh(4, 5, 3, zzfwq.zza("AES128_GCM"), zzfzm.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzfzm.zzh(4, 5, 4, zzfwq.zza("AES128_GCM"), zzfzm.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzfzm.zzh(4, 5, 4, zzfwq.zza("AES128_GCM"), zzfzm.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzfzm.zzh(4, 5, 4, zzfwq.zza("AES128_GCM"), zzfzm.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfzm.zzh(4, 5, 3, zzfwq.zza("AES128_CTR_HMAC_SHA256"), zzfzm.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfzm.zzh(4, 5, 3, zzfwq.zza("AES128_CTR_HMAC_SHA256"), zzfzm.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzfzm.zzh(4, 5, 4, zzfwq.zza("AES128_CTR_HMAC_SHA256"), zzfzm.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzfzm.zzh(4, 5, 4, zzfwq.zza("AES128_CTR_HMAC_SHA256"), zzfzm.zza, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzfzv.zza(((zzgdr) zzgly).zze());
    }
}
