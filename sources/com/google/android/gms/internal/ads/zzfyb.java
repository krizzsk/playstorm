package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfyb extends zzgap {
    final /* synthetic */ zzfyc zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfyb(zzfyc zzfyc, Class cls) {
        super(cls);
        this.zza = zzfyc;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzgct zzc = zzgcu.zzc();
        zzc.zza(zzgjg.zzv(zzgii.zza(((zzgcx) zzgly).zza())));
        zzc.zzb(0);
        return (zzgcu) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgcx.zze(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzfyc.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzfyc.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzfyc.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzfyc.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgik.zza(((zzgcx) zzgly).zza());
    }
}
