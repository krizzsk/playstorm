package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfzf extends zzgap {
    final /* synthetic */ zzfzg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfzf(zzfzg zzfzg, Class cls) {
        super(cls);
        this.zza = zzfzg;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzgcz zzc = zzgda.zzc();
        zzc.zza(zzgjg.zzv(zzgii.zza(((zzgdd) zzgly).zza())));
        zzc.zzb(0);
        return (zzgda) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgdd.zze(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgdc zzc = zzgdd.zzc();
        zzc.zza(64);
        hashMap.put("AES256_SIV", new zzgao((zzgdd) zzc.zzaj(), 1));
        zzgdc zzc2 = zzgdd.zzc();
        zzc2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzgao((zzgdd) zzc2.zzaj(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgdd zzgdd = (zzgdd) zzgly;
        if (zzgdd.zza() != 64) {
            int zza2 = zzgdd.zza();
            throw new InvalidAlgorithmParameterException("invalid key size: " + zza2 + ". Valid keys must have 64 bytes.");
        }
    }
}
