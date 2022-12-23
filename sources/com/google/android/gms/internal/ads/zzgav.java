package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgav extends zzgap {
    zzgav(zzgaw zzgaw, Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzgbk zzgbk = (zzgbk) zzgly;
        zzgbg zzc = zzgbh.zzc();
        zzc.zzc(0);
        zzc.zza(zzgjg.zzv(zzgii.zza(zzgbk.zza())));
        zzc.zzb(zzgbk.zzf());
        return (zzgbh) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgbk.zze(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgbj zzc = zzgbk.zzc();
        zzc.zza(32);
        zzgbm zzc2 = zzgbn.zzc();
        zzc2.zza(16);
        zzc.zzb((zzgbn) zzc2.zzaj());
        hashMap.put("AES_CMAC", new zzgao((zzgbk) zzc.zzaj(), 1));
        zzgbj zzc3 = zzgbk.zzc();
        zzc3.zza(32);
        zzgbm zzc4 = zzgbn.zzc();
        zzc4.zza(16);
        zzc3.zzb((zzgbn) zzc4.zzaj());
        hashMap.put("AES256_CMAC", new zzgao((zzgbk) zzc3.zzaj(), 1));
        zzgbj zzc5 = zzgbk.zzc();
        zzc5.zza(32);
        zzgbm zzc6 = zzgbn.zzc();
        zzc6.zza(16);
        zzc5.zzb((zzgbn) zzc6.zzaj());
        hashMap.put("AES256_CMAC_RAW", new zzgao((zzgbk) zzc5.zzaj(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgbk zzgbk = (zzgbk) zzgly;
        zzgaw.zzm(zzgbk.zzf());
        zzgaw.zzn(zzgbk.zza());
    }
}
