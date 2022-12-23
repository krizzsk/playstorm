package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdzo {
    private final zzfvk zza;
    private final zzfvk zzb;
    private final zzeav zzc;
    private final zzgpo zzd;

    public zzdzo(zzfvk zzfvk, zzfvk zzfvk2, zzeav zzeav, zzgpo zzgpo) {
        this.zza = zzfvk;
        this.zzb = zzfvk2;
        this.zzc = zzeav;
        this.zzd = zzgpo;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zza(zzbzu zzbzu, int i, zzebm zzebm) throws Exception {
        return ((zzecn) this.zzd.zzb()).zzc(zzbzu, i);
    }

    public final zzfvj zzb(zzbzu zzbzu) {
        zzfvj zzfvj;
        String str = zzbzu.zzd;
        zzt.zzp();
        if (zzs.zzy(str)) {
            zzfvj = zzfva.zzh(new zzebm(1));
        } else {
            zzfvj = zzfva.zzg(this.zza.zzb(new zzdzl(this, zzbzu)), ExecutionException.class, zzdzm.zza, this.zzb);
        }
        return zzfva.zzg(zzfvj, zzebm.class, new zzdzn(this, zzbzu, Binder.getCallingUid()), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ InputStream zzc(zzbzu zzbzu) throws Exception {
        zzcga zzcga;
        zzeav zzeav = this.zzc;
        synchronized (zzeav.zzb) {
            if (zzeav.zzc) {
                zzcga = zzeav.zza;
            } else {
                zzeav.zzc = true;
                zzeav.zze = zzbzu;
                zzeav.zzf.checkAvailabilityAndConnect();
                zzeav.zza.zzc(new zzeau(zzeav), zzcfv.zzf);
                zzcga = zzeav.zza;
            }
        }
        return (InputStream) zzcga.get((long) ((Integer) zzay.zzc().zzb(zzbhy.zzex)).intValue(), TimeUnit.SECONDS);
    }
}
