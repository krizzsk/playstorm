package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfyp extends zzgar {
    zzfyp() {
        super(zzggt.class, new zzfyn(zzfwd.class));
    }

    public final zzgap zza() {
        return new zzfyo(this, zzggw.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzggt.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzggt zzggt = (zzggt) zzgly;
        zzgik.zzb(zzggt.zza(), 0);
        if (zzggt.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final int zzf() {
        return 3;
    }
}
