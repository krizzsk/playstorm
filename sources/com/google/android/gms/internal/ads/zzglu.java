package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzglu {
    private static final zzglt zza;
    private static final zzglt zzb = new zzglt();

    static {
        zzglt zzglt;
        try {
            zzglt = (zzglt) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzglt = null;
        }
        zza = zzglt;
    }

    static zzglt zza() {
        return zza;
    }

    static zzglt zzb() {
        return zzb;
    }
}
