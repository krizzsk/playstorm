package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzecd implements Callable {
    public final /* synthetic */ zzecn zza;
    public final /* synthetic */ zzfvj zzb;
    public final /* synthetic */ zzfvj zzc;
    public final /* synthetic */ zzbzu zzd;
    public final /* synthetic */ zzfhg zze;

    public /* synthetic */ zzecd(zzecn zzecn, zzfvj zzfvj, zzfvj zzfvj2, zzbzu zzbzu, zzfhg zzfhg) {
        this.zza = zzecn;
        this.zzb = zzfvj;
        this.zzc = zzfvj2;
        this.zzd = zzbzu;
        this.zze = zzfhg;
    }

    public final Object call() {
        return this.zza.zzj(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
