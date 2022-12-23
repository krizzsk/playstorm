package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfzh {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated
    public static final zzggq zzb = zzggq.zzc();
    @Deprecated
    public static final zzggq zzc = zzggq.zzc();

    static {
        new zzfzg();
        try {
            zzfxi.zzn(new zzfzj());
            if (!zzfzd.zzb()) {
                zzfxi.zzm(new zzfzg(), true);
            }
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
