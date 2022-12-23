package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfgp implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;

    public zzfgp(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzgpo zza2 = zzgpt.zza(this.zza);
        zzgpo zza3 = zzgpt.zza(this.zzb);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhg)).booleanValue()) {
            obj = new zzfgr((zzfgo) zza2.zzb(), scheduledExecutorService);
        } else {
            obj = (zzfgo) zza3.zzb();
        }
        zzgqc.zzb(obj);
        return obj;
    }
}
