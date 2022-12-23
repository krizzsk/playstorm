package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgaw extends zzgar {
    zzgaw() {
        super(zzgbh.class, new zzgau(zzfwv.class));
    }

    /* access modifiers changed from: private */
    public static void zzm(zzgbn zzgbn) throws GeneralSecurityException {
        if (zzgbn.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzgbn.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzn(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final zzgap zza() {
        return new zzgav(this, zzgbk.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgbh.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgbh zzgbh = (zzgbh) zzgly;
        zzgik.zzb(zzgbh.zza(), 0);
        zzn(zzgbh.zzg().zzd());
        zzm(zzgbh.zzf());
    }

    public final int zzf() {
        return 3;
    }
}
