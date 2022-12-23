package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzgap {
    private final Class zza;

    public zzgap(Class cls) {
        this.zza = cls;
    }

    public abstract zzgly zza(zzgly zzgly) throws GeneralSecurityException;

    public abstract zzgly zzb(zzgjg zzgjg) throws zzgla;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzgly zzgly) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
