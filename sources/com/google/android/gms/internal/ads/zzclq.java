package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzclq implements zzfph {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcmx zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzaoc zzf;
    public final /* synthetic */ zzbix zzg;
    public final /* synthetic */ zzcfo zzh;
    public final /* synthetic */ zzl zzi;
    public final /* synthetic */ zza zzj;
    public final /* synthetic */ zzbdl zzk;
    public final /* synthetic */ zzfbg zzl;
    public final /* synthetic */ zzfbj zzm;

    public /* synthetic */ zzclq(Context context, zzcmx zzcmx, String str, boolean z, boolean z2, zzaoc zzaoc, zzbix zzbix, zzcfo zzcfo, zzbin zzbin, zzl zzl2, zza zza2, zzbdl zzbdl, zzfbg zzfbg, zzfbj zzfbj) {
        this.zza = context;
        this.zzb = zzcmx;
        this.zzc = str;
        this.zzd = z;
        this.zze = z2;
        this.zzf = zzaoc;
        this.zzg = zzbix;
        this.zzh = zzcfo;
        this.zzi = zzl2;
        this.zzj = zza2;
        this.zzk = zzbdl;
        this.zzl = zzfbg;
        this.zzm = zzfbj;
    }

    public final Object zza() {
        Context context = this.zza;
        zzcmx zzcmx = this.zzb;
        String str = this.zzc;
        boolean z = this.zzd;
        boolean z2 = this.zze;
        zzaoc zzaoc = this.zzf;
        zzbix zzbix = this.zzg;
        zzcfo zzcfo = this.zzh;
        zzl zzl2 = this.zzi;
        zza zza2 = this.zzj;
        zzbdl zzbdl = this.zzk;
        zzfbg zzfbg = this.zzl;
        zzfbj zzfbj = this.zzm;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = zzcmb.zza;
            zzclx zzclx = new zzclx(new zzcmb(new zzcmw(context), zzcmx, str, z, z2, zzaoc, zzbix, zzcfo, (zzbin) null, zzl2, zza2, zzbdl, zzfbg, zzfbj));
            zzclx.setWebViewClient(zzt.zzq().zzd(zzclx, zzbdl, z2));
            zzclx.setWebChromeClient(new zzclh(zzclx));
            return zzclx;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
