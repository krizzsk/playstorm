package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfyo extends zzgap {
    final /* synthetic */ zzfyp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfyo(zzfyp zzfyp, Class cls) {
        super(cls);
        this.zza = zzfyp;
    }

    public final /* bridge */ /* synthetic */ zzgly zza(zzgly zzgly) throws GeneralSecurityException {
        zzggw zzggw = (zzggw) zzgly;
        zzggs zzc = zzggt.zzc();
        zzc.zzb(0);
        zzc.zza(zzgjg.zzv(zzgii.zza(32)));
        return (zzggt) zzc.zzaj();
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzggw.zzd(zzgjg, zzgka.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzgao(zzggw.zzc(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzgao(zzggw.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzggw zzggw = (zzggw) zzgly;
    }
}
