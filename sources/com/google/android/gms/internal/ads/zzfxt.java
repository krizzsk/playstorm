package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfxt extends zzgar {
    zzfxt() {
        super(zzgbw.class, new zzfxr(zzgic.class));
    }

    public static final void zzh(zzgbw zzgbw) throws GeneralSecurityException {
        zzgik.zzb(zzgbw.zza(), 0);
        zzgik.zza(zzgbw.zzh().zzd());
        zzm(zzgbw.zzg());
    }

    /* access modifiers changed from: private */
    public static final void zzm(zzgcc zzgcc) throws GeneralSecurityException {
        if (zzgcc.zza() < 12 || zzgcc.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final zzgap zza() {
        return new zzfxs(this, zzgbz.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgbw.zzf(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzh((zzgbw) zzgly);
    }

    public final int zzf() {
        return 3;
    }
}
