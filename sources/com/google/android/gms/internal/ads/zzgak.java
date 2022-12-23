package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgak extends zzgar {
    public zzgak() {
        super(zzgfe.class, new zzgaj(zzfwl.class));
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgfe.zzg(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgfe zzgfe = (zzgfe) zzgly;
        zzgik.zzb(zzgfe.zza(), 0);
        if (zzgfe.zzl()) {
            zzgal.zza(zzgfe.zzc());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }

    public final int zzf() {
        return 5;
    }
}
