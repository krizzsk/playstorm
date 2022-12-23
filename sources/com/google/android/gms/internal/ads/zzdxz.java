package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdxz implements Runnable {
    public final /* synthetic */ zzdyi zza;
    public final /* synthetic */ Object zzb;
    public final /* synthetic */ zzcga zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ long zze;
    public final /* synthetic */ zzfhg zzf;

    public /* synthetic */ zzdxz(zzdyi zzdyi, Object obj, zzcga zzcga, String str, long j, zzfhg zzfhg) {
        this.zza = zzdyi;
        this.zzb = obj;
        this.zzc = zzcga;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzfhg;
    }

    public final void run() {
        this.zza.zzq(this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
