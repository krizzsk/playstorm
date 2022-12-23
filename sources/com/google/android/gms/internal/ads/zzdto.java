package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdto {
    private final zzclu zza;
    private final Context zzb;
    private final zzaoc zzc;
    private final zzbix zzd;
    private final zzcfo zze;
    private final zza zzf;
    private final zzbdl zzg;
    /* access modifiers changed from: private */
    public final zzdeh zzh;

    public zzdto(zzclu zzclu, Context context, zzaoc zzaoc, zzbix zzbix, zzcfo zzcfo, zza zza2, zzbdl zzbdl, zzdeh zzdeh) {
        this.zza = zzclu;
        this.zzb = context;
        this.zzc = zzaoc;
        this.zzd = zzbix;
        this.zze = zzcfo;
        this.zzf = zza2;
        this.zzg = zzbdl;
        this.zzh = zzdeh;
    }

    public final zzcli zza(zzq zzq, zzfbg zzfbg, zzfbj zzfbj) throws zzclt {
        return zzclu.zza(this.zzb, zzcmx.zzc(zzq), zzq.zza, false, false, this.zzc, this.zzd, this.zze, (zzbin) null, new zzdtd(this), this.zzf, this.zzg, zzfbg, zzfbj);
    }
}
