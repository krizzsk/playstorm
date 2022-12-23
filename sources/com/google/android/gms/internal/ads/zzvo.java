package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzvo {
    public final int zza;
    public final zzjw[] zzb;
    public final zzvh[] zzc;
    public final zzct zzd;
    public final Object zze;

    public zzvo(zzjw[] zzjwArr, zzvh[] zzvhArr, zzct zzct, Object obj) {
        this.zzb = zzjwArr;
        this.zzc = (zzvh[]) zzvhArr.clone();
        this.zzd = zzct;
        this.zze = obj;
        this.zza = zzjwArr.length;
    }

    public final boolean zza(zzvo zzvo, int i) {
        if (zzvo != null && zzeg.zzS(this.zzb[i], zzvo.zzb[i]) && zzeg.zzS(this.zzc[i], zzvo.zzc[i])) {
            return true;
        }
        return false;
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
