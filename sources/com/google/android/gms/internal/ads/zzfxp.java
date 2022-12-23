package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfxp extends zzgap {
    final /* synthetic */ zzfxq zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxp(zzfxq zzfxq, Class cls) {
        super(cls);
        this.zza = zzfxq;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzgbt zzgbt = (zzgbt) zzgly;
        new zzfxt();
        zzgbw zzf = zzfxs.zzf(zzgbt.zze());
        zzgly zza2 = new zzgaz().zza().zza(zzgbt.zzf());
        zzgbp zzc = zzgbq.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgek) zza2);
        zzc.zzc(0);
        return (zzgbq) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgbt.zzd(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzfxq.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzfxq.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzfxq.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzfxq.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgbt zzgbt = (zzgbt) zzgly;
        ((zzfxs) new zzfxt().zza()).zzd(zzgbt.zze());
        new zzgaz().zza().zzd(zzgbt.zzf());
        zzgik.zza(zzgbt.zze().zza());
    }
}
