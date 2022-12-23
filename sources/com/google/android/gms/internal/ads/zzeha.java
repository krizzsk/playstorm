package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzeha implements zzdlf {
    private final Context zza;
    private final zzcfo zzb;
    private final zzfvj zzc;
    private final zzfbg zzd;
    private final zzcli zze;
    private final zzfby zzf;
    private final zzboo zzg;
    private final boolean zzh;

    zzeha(Context context, zzcfo zzcfo, zzfvj zzfvj, zzfbg zzfbg, zzcli zzcli, zzfby zzfby, boolean z, zzboo zzboo) {
        this.zza = context;
        this.zzb = zzcfo;
        this.zzc = zzfvj;
        this.zzd = zzfbg;
        this.zze = zzcli;
        this.zzf = zzfby;
        this.zzg = zzboo;
        this.zzh = z;
    }

    public final void zza(boolean z, Context context, zzdcf zzdcf) {
        zzdjz zzdjz = (zzdjz) zzfva.zzq(this.zzc);
        this.zze.zzap(true);
        boolean z2 = false;
        boolean zze2 = this.zzh ? this.zzg.zze(false) : false;
        zzt.zzp();
        boolean zzE = zzs.zzE(this.zza);
        boolean z3 = this.zzh;
        if (z3) {
            z2 = this.zzg.zzd();
        }
        zzj zzj = new zzj(zze2, zzE, z2, z3 ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzP, false);
        if (zzdcf != null) {
            zzdcf.zzf();
        }
        zzt.zzj();
        zzdku zzj2 = zzdjz.zzj();
        zzcli zzcli = this.zze;
        zzfbg zzfbg = this.zzd;
        int i = zzfbg.zzR;
        zzcfo zzcfo = this.zzb;
        String str = zzfbg.zzC;
        zzfbl zzfbl = zzfbg.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) zzj2, (zzw) null, zzcli, i, zzcfo, str, zzj, zzfbl.zzb, zzfbl.zza, this.zzf.zzf, zzdcf);
        zzm.zza(context, adOverlayInfoParcel, true);
    }
}
