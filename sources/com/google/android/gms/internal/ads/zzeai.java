package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeai {
    private final ScheduledExecutorService zza;
    private final zzfvk zzb;
    private final zzeaz zzc;
    private final zzgpo zzd;

    public zzeai(ScheduledExecutorService scheduledExecutorService, zzfvk zzfvk, zzeaz zzeaz, zzgpo zzgpo) {
        this.zza = scheduledExecutorService;
        this.zzb = zzfvk;
        this.zzc = zzeaz;
        this.zzd = zzgpo;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zza(zzbzu zzbzu, int i, Throwable th) throws Exception {
        return ((zzecn) this.zzd.zzb()).zzd(zzbzu, i);
    }

    public final zzfvj zzb(zzbzu zzbzu) {
        zzfvj zzfvj;
        String str = zzbzu.zzd;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzfvj = zzfva.zzh(new zzebm(1));
        } else {
            zzeaz zzeaz = this.zzc;
            synchronized (zzeaz.zzb) {
                if (zzeaz.zzc) {
                    zzfvj = zzeaz.zza;
                } else {
                    zzeaz.zzc = true;
                    zzeaz.zze = zzbzu;
                    zzeaz.zzf.checkAvailabilityAndConnect();
                    zzeaz.zza.zzc(new zzeay(zzeaz), zzcfv.zzf);
                    zzfvj = zzeaz.zza;
                }
            }
        }
        int callingUid = Binder.getCallingUid();
        zzfur zzv = zzfur.zzv(zzfvj);
        long intValue = (long) ((Integer) zzay.zzc().zzb(zzbhy.zzex)).intValue();
        return zzfva.zzg((zzfur) zzfva.zzo(zzv, intValue, TimeUnit.SECONDS, this.zza), Throwable.class, new zzeah(this, zzbzu, callingUid), this.zzb);
    }
}
