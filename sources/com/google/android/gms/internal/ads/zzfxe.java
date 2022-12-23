package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfxe implements zzfxh {
    final /* synthetic */ zzgar zza;

    zzfxe(zzgar zzgar) {
        this.zza = zzgar;
    }

    public final zzfwm zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzfwo(this.zza, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzfwm zzb() {
        zzgar zzgar = this.zza;
        return new zzfwo(zzgar, zzgar.zzi());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return null;
    }

    public final Set zze() {
        return this.zza.zzl();
    }
}
