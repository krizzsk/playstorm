package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzas;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdao implements zzfoi {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcfo zzb;
    public final /* synthetic */ zzfby zzc;

    public /* synthetic */ zzdao(Context context, zzcfo zzcfo, zzfby zzfby) {
        this.zza = context;
        this.zzb = zzcfo;
        this.zzc = zzfby;
    }

    public final Object apply(Object obj) {
        Context context = this.zza;
        zzcfo zzcfo = this.zzb;
        zzfby zzfby = this.zzc;
        zzfbg zzfbg = (zzfbg) obj;
        zzas zzas = new zzas(context);
        zzas.zzp(zzfbg.zzC);
        zzas.zzq(zzfbg.zzD.toString());
        zzas.zzo(zzcfo.zza);
        zzas.zzn(zzfby.zzf);
        return zzas;
    }
}
