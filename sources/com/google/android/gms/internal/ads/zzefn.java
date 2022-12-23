package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzefn implements zzdlf {
    private final zzcfo zza;
    private final zzfvj zzb;
    private final zzfbg zzc;
    private final zzcli zzd;
    private final zzfby zze;
    private final zzboo zzf;
    private final boolean zzg;

    zzefn(zzcfo zzcfo, zzfvj zzfvj, zzfbg zzfbg, zzcli zzcli, zzfby zzfby, boolean z, zzboo zzboo) {
        this.zza = zzcfo;
        this.zzb = zzfvj;
        this.zzc = zzfbg;
        this.zzd = zzcli;
        this.zze = zzfby;
        this.zzg = z;
        this.zzf = zzboo;
    }

    public final void zza(boolean z, Context context, zzdcf zzdcf) {
        zzcvf zzcvf = (zzcvf) zzfva.zzq(this.zzb);
        this.zzd.zzap(true);
        boolean zze2 = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        zzj zzj = new zzj(zze2, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzP, false);
        if (zzdcf != null) {
            zzdcf.zzf();
        }
        zzt.zzj();
        zzdku zzg2 = zzcvf.zzg();
        zzcli zzcli = this.zzd;
        int i = this.zzc.zzR;
        if (i == -1) {
            zzw zzw = this.zze.zzj;
            if (zzw != null) {
                int i2 = zzw.zza;
                if (i2 == 1) {
                    i = 7;
                } else if (i2 == 2) {
                    i = 6;
                }
            }
            zze.zze("Error setting app open orientation; no targeting orientation available.");
            i = this.zzc.zzR;
        }
        int i3 = i;
        zzcfo zzcfo = this.zza;
        zzfbg zzfbg = this.zzc;
        String str = zzfbg.zzC;
        zzfbl zzfbl = zzfbg.zzt;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((zza) null, (zzo) zzg2, (com.google.android.gms.ads.internal.overlay.zzw) null, zzcli, i3, zzcfo, str, zzj, zzfbl.zzb, zzfbl.zza, this.zze.zzf, zzdcf);
        zzm.zza(context, adOverlayInfoParcel, true);
    }
}
