package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzawm implements zzaxm {
    private final zzaxm[] zza;

    public zzawm(zzaxm[] zzaxmArr) {
        this.zza = zzaxmArr;
    }

    public final long zza() {
        long j = Long.MAX_VALUE;
        for (zzaxm zza2 : this.zza) {
            long zza3 = zza2.zza();
            if (zza3 != Long.MIN_VALUE) {
                j = Math.min(j, zza3);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final boolean zzbj(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long zza2 = zza();
            if (zza2 == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzaxm zzaxm : this.zza) {
                if (zzaxm.zza() == zza2) {
                    z |= zzaxm.zzbj(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
