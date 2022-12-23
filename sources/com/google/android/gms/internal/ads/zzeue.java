package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeue implements zzetb {
    private final zzcer zza;
    private final String zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvk zzd;
    private final zzbco zze;

    zzeue(String str, zzbco zzbco, zzcer zzcer, ScheduledExecutorService scheduledExecutorService, zzfvk zzfvk, byte[] bArr) {
        this.zzb = str;
        this.zze = zzbco;
        this.zza = zzcer;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfvk;
    }

    public final int zza() {
        return 43;
    }

    public final zzfvj zzb() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcj)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzco)).booleanValue()) {
                zzfvj zzn = zzfva.zzn(zzfnx.zza(Tasks.forResult(null)), zzeuc.zza, this.zzd);
                if (((Boolean) zzbjd.zza.zze()).booleanValue()) {
                    zzn = zzfva.zzo(zzn, ((Long) zzbjd.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzfva.zzf(zzn, Exception.class, new zzeud(this), this.zzd);
            }
        }
        return zzfva.zzi(new zzeuf((String) null, -1));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeuf zzc(Exception exc) {
        this.zza.zzt(exc, "AppSetIdInfoGmscoreSignal");
        return new zzeuf((String) null, -1);
    }
}
