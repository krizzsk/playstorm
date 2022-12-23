package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzkk {
    private final zzy zza;
    private final SparseArray zzb;

    public zzkk(zzy zzy, SparseArray sparseArray) {
        this.zza = zzy;
        SparseArray sparseArray2 = new SparseArray(zzy.zzb());
        int i = 0;
        while (i < zzy.zzb()) {
            int zza2 = zzy.zza(i);
            zzkj zzkj = (zzkj) sparseArray.get(zza2);
            if (zzkj != null) {
                sparseArray2.append(zza2, zzkj);
                i++;
            } else {
                throw null;
            }
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzkj zzc(int i) {
        zzkj zzkj = (zzkj) this.zzb.get(i);
        if (zzkj != null) {
            return zzkj;
        }
        throw null;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
