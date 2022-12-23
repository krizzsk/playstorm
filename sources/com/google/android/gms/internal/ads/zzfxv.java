package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfxv extends zzgap {
    final /* synthetic */ zzfxw zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfxv(zzfxw zzfxw, Class cls) {
        super(cls);
        this.zza = zzfxw;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzgci zzgci = (zzgci) zzgly;
        zzgce zzc = zzgcf.zzc();
        zzc.zza(zzgjg.zzv(zzgii.zza(zzgci.zza())));
        zzc.zzb(zzgci.zzf());
        zzc.zzc(0);
        return (zzgcf) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgci.zze(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzfxw.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzfxw.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzfxw.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzfxw.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgci zzgci = (zzgci) zzgly;
        zzgik.zza(zzgci.zza());
        if (zzgci.zzf().zza() != 12 && zzgci.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
