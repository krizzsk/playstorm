package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgba {
    @Deprecated
    public static final zzggq zza;
    @Deprecated
    public static final zzggq zzb;
    @Deprecated
    public static final zzggq zzc;

    static {
        new zzgaz();
        zzggq zzc2 = zzggq.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzfxi.zzn(new zzgbd());
        zzfxi.zzm(new zzgaz(), true);
        if (!zzfzd.zzb()) {
            zzfxi.zzm(new zzgaw(), true);
        }
    }
}
