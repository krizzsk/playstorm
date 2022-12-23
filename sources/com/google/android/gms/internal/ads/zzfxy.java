package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfxy extends zzgap {
    final /* synthetic */ zzfxz zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxy(zzfxz zzfxz, Class cls) {
        super(cls);
        this.zza = zzfxz;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzgcn zzc = zzgco.zzc();
        zzc.zza(zzgjg.zzv(zzgii.zza(((zzgcr) zzgly).zza())));
        zzc.zzb(0);
        return (zzgco) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgcr.zze(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzfxz.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzfxz.zzg(16, 3));
        hashMap.put("AES256_GCM", zzfxz.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzfxz.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgik.zza(((zzgcr) zzgly).zza());
    }
}
