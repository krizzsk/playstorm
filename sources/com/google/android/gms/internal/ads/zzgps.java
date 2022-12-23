package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzgps implements zzgpu {
    private zzgqh zza;

    public static void zza(zzgqh zzgqh, zzgqh zzgqh2) {
        zzgps zzgps = (zzgps) zzgqh;
        if (zzgps.zza == null) {
            zzgps.zza = zzgqh2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zzb() {
        zzgqh zzgqh = this.zza;
        if (zzgqh != null) {
            return zzgqh.zzb();
        }
        throw new IllegalStateException();
    }
}
