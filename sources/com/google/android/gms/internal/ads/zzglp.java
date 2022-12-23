package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzglp implements zzglw {
    private final zzglw[] zza;

    zzglp(zzglw... zzglwArr) {
        this.zza = zzglwArr;
    }

    public final zzglv zzb(Class cls) {
        zzglw[] zzglwArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzglw zzglw = zzglwArr[i];
            if (zzglw.zzc(cls)) {
                return zzglw.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    public final boolean zzc(Class cls) {
        zzglw[] zzglwArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzglwArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
