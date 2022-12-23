package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzi {
    public static final zzi zza = new zzi(0, 0, 1, 1, 0, (zzh) null);
    public static final zzl zzb = zze.zza;
    public final int zzc = 1;
    private AudioAttributes zzd;

    /* synthetic */ zzi(int i, int i2, int i3, int i4, int i5, zzh zzh) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzi zzi = (zzi) obj;
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }

    public final AudioAttributes zza() {
        if (this.zzd == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (zzeg.zza >= 29) {
                zzf.zza(usage, 1);
            }
            if (zzeg.zza >= 32) {
                zzg.zza(usage, 0);
            }
            this.zzd = usage.build();
        }
        return this.zzd;
    }
}
