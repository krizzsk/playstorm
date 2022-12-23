package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgkj implements zzglw {
    private static final zzgkj zza = new zzgkj();

    private zzgkj() {
    }

    public static zzgkj zza() {
        return zza;
    }

    public final zzglv zzb(Class cls) {
        if (zzgko.class.isAssignableFrom(cls)) {
            try {
                return (zzglv) zzgko.zzay(cls.asSubclass(zzgko.class)).zzb(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    public final boolean zzc(Class cls) {
        return zzgko.class.isAssignableFrom(cls);
    }
}
