package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzelg extends zzbn {
    final zzfbw zza = new zzfbw();
    final zzdnp zzb = new zzdnp();
    private final Context zzc;
    private final zzcnf zzd;
    private zzbf zze;

    public zzelg(zzcnf zzcnf, Context context, String str) {
        this.zzd = zzcnf;
        this.zza.zzs(str);
        this.zzc = context;
    }

    public final zzbl zze() {
        zzdnr zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfbw zzfbw = this.zza;
        if (zzfbw.zzg() == null) {
            zzfbw.zzr(zzq.zzc());
        }
        return new zzelh(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    public final void zzf(zzbly zzbly) {
        this.zzb.zza(zzbly);
    }

    public final void zzg(zzbmb zzbmb) {
        this.zzb.zzb(zzbmb);
    }

    public final void zzh(String str, zzbmh zzbmh, zzbme zzbme) {
        this.zzb.zzc(str, zzbmh, zzbme);
    }

    public final void zzi(zzbra zzbra) {
        this.zzb.zzd(zzbra);
    }

    public final void zzj(zzbml zzbml, zzq zzq) {
        this.zzb.zze(zzbml);
        this.zza.zzr(zzq);
    }

    public final void zzk(zzbmo zzbmo) {
        this.zzb.zzf(zzbmo);
    }

    public final void zzl(zzbf zzbf) {
        this.zze = zzbf;
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    public final void zzn(zzbqr zzbqr) {
        this.zza.zzv(zzbqr);
    }

    public final void zzo(zzbko zzbko) {
        this.zza.zzA(zzbko);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    public final void zzq(zzcd zzcd) {
        this.zza.zzQ(zzcd);
    }
}
