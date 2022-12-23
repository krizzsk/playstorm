package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdak implements zzden {
    private final Context zza;
    private final zzfby zzb;
    private final zzcfo zzc;
    private final zzg zzd;
    private final zzdyi zze;
    private final zzfhs zzf;

    public zzdak(Context context, zzfby zzfby, zzcfo zzcfo, zzg zzg, zzdyi zzdyi, zzfhs zzfhs) {
        this.zza = context;
        this.zzb = zzfby;
        this.zzc = zzcfo;
        this.zzd = zzg;
        this.zze = zzdyi;
        this.zzf = zzfhs;
    }

    public final void zzb(zzfbs zzfbs) {
    }

    public final void zzbE(zzbzu zzbzu) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcZ)).booleanValue()) {
            zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        this.zze.zzr();
    }
}
