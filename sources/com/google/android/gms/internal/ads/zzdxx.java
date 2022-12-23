package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdxx implements Runnable {
    public final /* synthetic */ zzdyi zza;
    public final /* synthetic */ zzcga zzb;

    public /* synthetic */ zzdxx(zzdyi zzdyi, zzcga zzcga) {
        this.zza = zzdyi;
        this.zzb = zzcga;
    }

    public final void run() {
        zzcga zzcga = this.zzb;
        String zzc = zzt.zzo().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            zzcga.zzd(zzc);
        } else {
            zzcga.zze(new Exception());
        }
    }
}
