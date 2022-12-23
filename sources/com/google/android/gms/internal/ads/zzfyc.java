package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfyc extends zzgar {
    zzfyc() {
        super(zzgcu.class, new zzfya(zzfwd.class));
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        if (zzm()) {
            zzfxi.zzm(new zzfyc(), true);
        }
    }

    static /* bridge */ /* synthetic */ zzgao zzh(int i, int i2) {
        zzgcw zzc = zzgcx.zzc();
        zzc.zza(i);
        return new zzgao((zzgcx) zzc.zzaj(), i2);
    }

    private static boolean zzm() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public final zzgap zza() {
        return new zzfyb(this, zzgcx.class);
    }

    public final /* synthetic */ zzgly zzb(zzgjg zzgjg) throws zzgla {
        return zzgcu.zze(zzgjg, zzgka.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgly zzgly) throws GeneralSecurityException {
        zzgcu zzgcu = (zzgcu) zzgly;
        zzgik.zzb(zzgcu.zza(), 0);
        zzgik.zza(zzgcu.zzf().zzd());
    }

    public final int zzf() {
        return 3;
    }
}
