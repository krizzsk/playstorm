package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzduv implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzduv(zzgqh zzgqh, zzgqh zzgqh2) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        zzdvn zza2 = ((zzdvo) this.zzb).zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdU)).booleanValue()) {
            set = Collections.singleton(new zzdiy(zza2, zzfvk));
        } else {
            set = Collections.emptySet();
        }
        zzgqc.zzb(set);
        return set;
    }
}
