package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbbx implements Comparator {
    public zzbbx(zzbby zzbby) {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbbm zzbbm = (zzbbm) obj;
        zzbbm zzbbm2 = (zzbbm) obj2;
        if (zzbbm.zzd() >= zzbbm2.zzd()) {
            if (zzbbm.zzd() > zzbbm2.zzd()) {
                return 1;
            }
            if (zzbbm.zzb() >= zzbbm2.zzb()) {
                if (zzbbm.zzb() > zzbbm2.zzb()) {
                    return 1;
                }
                float zza = (zzbbm.zza() - zzbbm.zzd()) * (zzbbm.zzc() - zzbbm.zzb());
                float zza2 = (zzbbm2.zza() - zzbbm2.zzd()) * (zzbbm2.zzc() - zzbbm2.zzb());
                if (zza <= zza2) {
                    if (zza < zza2) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}
