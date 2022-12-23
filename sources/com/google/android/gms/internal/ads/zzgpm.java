package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public abstract class zzgpm {
    public static zzgpm zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzgph(cls.getSimpleName());
        }
        return new zzgpj(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
