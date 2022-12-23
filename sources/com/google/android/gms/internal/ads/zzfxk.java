package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfxk {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    public static final String zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated
    public static final zzggq zzc;
    @Deprecated
    public static final zzggq zzd;
    @Deprecated
    public static final zzggq zze;

    static {
        new zzfxq();
        new zzfxz();
        new zzfyc();
        new zzfxw();
        new zzfyi();
        new zzfym();
        new zzfyf();
        new zzfyp();
        zzggq zzc2 = zzggq.zzc();
        zzc = zzc2;
        zzd = zzc2;
        zze = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfxi.zzn(new zzfxn());
        zzgba.zza();
        zzfxi.zzm(new zzfxq(), true);
        zzfxi.zzm(new zzfxz(), true);
        if (!zzfzd.zzb()) {
            zzfxi.zzm(new zzfxw(), true);
            zzfyc.zzg(true);
            zzfxi.zzm(new zzfyf(), true);
            zzfxi.zzm(new zzfyi(), true);
            zzfxi.zzm(new zzfym(), true);
            zzfxi.zzm(new zzfyp(), true);
        }
    }
}
