package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzaye {
    public final zzaxp zza;
    public final zzayb zzb;
    public final Object zzc;
    public final zzarz[] zzd;

    public zzaye(zzaxp zzaxp, zzayb zzayb, Object obj, zzarz[] zzarzArr) {
        this.zza = zzaxp;
        this.zzb = zzayb;
        this.zzc = obj;
        this.zzd = zzarzArr;
    }

    public final boolean zza(zzaye zzaye, int i) {
        if (zzaye != null && zzazn.zzo(this.zzb.zza(i), zzaye.zzb.zza(i)) && zzazn.zzo(this.zzd[i], zzaye.zzd[i])) {
            return true;
        }
        return false;
    }
}
