package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeot implements zzetb {
    final zzcer zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvk zzd;
    private final Context zze;

    zzeot(Context context, zzcer zzcer, ScheduledExecutorService scheduledExecutorService, zzfvk zzfvk) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzcn)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcer;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfvk;
    }

    public final int zza() {
        return 11;
    }

    public final zzfvj zzb() {
        Task<AppSetIdInfo> task;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcj)).booleanValue()) {
            if (!((Boolean) zzay.zzc().zzb(zzbhy.zzco)).booleanValue()) {
                if (!((Boolean) zzay.zzc().zzb(zzbhy.zzck)).booleanValue()) {
                    return zzfva.zzm(zzfnx.zza(this.zzb.getAppSetIdInfo()), zzeoq.zza, zzcfv.zzf);
                }
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzcn)).booleanValue()) {
                    task = zzfda.zza(this.zze);
                } else {
                    task = this.zzb.getAppSetIdInfo();
                }
                if (task == null) {
                    return zzfva.zzi(new zzeou((String) null, -1));
                }
                zzfvj zzn = zzfva.zzn(zzfnx.zza(task), zzeor.zza, zzcfv.zzf);
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzcl)).booleanValue()) {
                    zzn = zzfva.zzo(zzn, ((Long) zzay.zzc().zzb(zzbhy.zzcm)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfva.zzf(zzn, Exception.class, new zzeos(this), this.zzd);
            }
        }
        return zzfva.zzi(new zzeou((String) null, -1));
    }
}
