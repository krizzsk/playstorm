package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdyd implements Runnable {
    public final /* synthetic */ zzdyi zza;
    public final /* synthetic */ zzfct zzb;
    public final /* synthetic */ zzbqj zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ String zze;

    public /* synthetic */ zzdyd(zzdyi zzdyi, zzfct zzfct, zzbqj zzbqj, List list, String str) {
        this.zza = zzdyi;
        this.zzb = zzfct;
        this.zzc = zzbqj;
        this.zzd = list;
        this.zze = str;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd, this.zze);
    }
}
