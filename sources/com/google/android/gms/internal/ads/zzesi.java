package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzab;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzesi implements zzetb {
    private final String zza;
    private final zzfvk zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfby zze;
    private final zzcnf zzf;

    zzesi(zzfvk zzfvk, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfby zzfby, zzcnf zzcnf) {
        this.zzb = zzfvk;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfby;
        this.zzf = zzcnf;
    }

    public static /* synthetic */ zzfvj zzc(zzesi zzesi) {
        String str = zzesi.zza;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzgc)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        zzg zzn = zzesi.zzf.zzn();
        zzdbc zzdbc = new zzdbc();
        zzdbc.zzc(zzesi.zzd);
        zzfbw zzfbw = new zzfbw();
        zzfbw.zzs("adUnitId");
        zzfbw.zzE(zzesi.zze.zzd);
        zzfbw.zzr(new zzq());
        zzdbc.zzf(zzfbw.zzG());
        zzn.zza(zzdbc.zzg());
        zzab zzab = new zzab();
        zzab.zza(str);
        zzn.zzb(zzab.zzb());
        new zzdhc();
        return zzfva.zzf(zzfva.zzm((zzfur) zzfva.zzo(zzfur.zzv(zzn.zzc().zzb()), ((Long) zzay.zzc().zzb(zzbhy.zzgd)).longValue(), TimeUnit.MILLISECONDS, zzesi.zzc), zzesg.zza, zzesi.zzb), Exception.class, zzesh.zza, zzesi.zzb);
    }

    public final int zza() {
        return 33;
    }

    public final zzfvj zzb() {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzgb)).booleanValue() || "adUnitId".equals(this.zze.zzf)) {
            return this.zzb.zzb(zzese.zza);
        }
        return zzfva.zzl(new zzesf(this), this.zzb);
    }
}
