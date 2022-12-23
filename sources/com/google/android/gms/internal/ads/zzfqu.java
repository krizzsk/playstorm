package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfqu extends zzfqw {
    zzfqu() {
        super((zzfqu) null);
    }

    static final zzfqw zzf(int i) {
        return i < 0 ? zzfqw.zzb : i > 0 ? zzfqw.zzc : zzfqw.zza;
    }

    public final int zza() {
        return 0;
    }

    public final zzfqw zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    public final zzfqw zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    public final zzfqw zzd(boolean z, boolean z2) {
        return zzf(zzftl.zza(z, z2));
    }

    public final zzfqw zze(boolean z, boolean z2) {
        return zzf(zzftl.zza(false, false));
    }
}
