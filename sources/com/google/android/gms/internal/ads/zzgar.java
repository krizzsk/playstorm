package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzgar {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzgar(Class cls, zzgaq... zzgaqArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            zzgaq zzgaq = zzgaqArr[i];
            if (!hashMap.containsKey(zzgaq.zzb())) {
                hashMap.put(zzgaq.zzb(), zzgaq);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgaq.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzgaqArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgap zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgly zzb(zzgjg zzgjg) throws zzgla;

    public abstract String zzc();

    public abstract void zzd(zzgly zzgly) throws GeneralSecurityException;

    public int zze() {
        return 1;
    }

    public abstract int zzf();

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgly zzgly, Class cls) throws GeneralSecurityException {
        zzgaq zzgaq = (zzgaq) this.zzb.get(cls);
        if (zzgaq != null) {
            return zzgaq.zza(zzgly);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
