package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgay extends zzgap {
    final /* synthetic */ zzgaz zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgay(zzgaz zzgaz, Class cls) {
        super(cls);
        this.zza = zzgaz;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzgen zzgen = (zzgen) zzgly;
        zzgej zzc = zzgek.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgen.zzg());
        zzc.zza(zzgjg.zzv(zzgii.zza(zzgen.zza())));
        return (zzgek) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgen.zzf(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzgaz.zzm(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgaz.zzm(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzgaz.zzm(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgaz.zzm(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzgaz.zzm(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgaz.zzm(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzgaz.zzm(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgaz.zzm(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzgaz.zzm(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgaz.zzm(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgen zzgen = (zzgen) zzgly;
        if (zzgen.zza() >= 16) {
            zzgaz.zzn(zzgen.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
