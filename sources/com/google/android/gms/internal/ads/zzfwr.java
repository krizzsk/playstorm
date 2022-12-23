package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfwr {
    private final zzgfu zza;

    private zzfwr(zzgfu zzgfu) {
        this.zza = zzgfu;
    }

    static final zzfwr zza(zzgfu zzgfu) throws GeneralSecurityException {
        if (zzgfu != null && zzgfu.zza() > 0) {
            return new zzfwr(zzgfu);
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static final zzfwr zzb(zzfwp zzfwp) throws GeneralSecurityException {
        zzfws zzd = zzfws.zzd();
        zzd.zzc(zzfwp.zza());
        return zzd.zzb();
    }

    public final String toString() {
        return zzfxj.zza(this.zza).toString();
    }

    /* access modifiers changed from: package-private */
    public final zzgfu zzc() {
        return this.zza;
    }

    public final Object zzd(Class cls) throws GeneralSecurityException {
        Class zze = zzfxi.zze(cls);
        if (zze != null) {
            zzfxj.zzb(this.zza);
            zzfxa zzc = zzfxa.zzc(zze);
            for (zzgft zzgft : this.zza.zzh()) {
                if (zzgft.zzi() == 3) {
                    zzfwx zza2 = zzc.zza(zzfxi.zzf(zzgft.zzc(), zze), zzgft);
                    if (zzgft.zza() == this.zza.zzc()) {
                        zzc.zzf(zza2);
                    }
                }
            }
            return zzfxi.zzi(zzc, cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }
}
