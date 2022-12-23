package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfye extends zzgap {
    final /* synthetic */ zzfyf zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfye(zzfyf zzfyf, Class cls) {
        super(cls);
        this.zza = zzfyf;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzgdj zzgdj = (zzgdj) zzgly;
        zzgdf zzc = zzgdg.zzc();
        zzc.zzb(0);
        zzc.zza(zzgjg.zzv(zzgii.zza(32)));
        return (zzgdg) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgdj.zzd(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzgao(zzgdj.zzc(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzgao(zzgdj.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgdj zzgdj = (zzgdj) zzgly;
    }
}
