package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcno implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;

    public zzcno(zzgqh zzgqh, zzgqh zzgqh2) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzecz zzecz = (zzecz) this.zza.zzb();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbL)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhf)).booleanValue()) {
                set = Collections.singleton(new zzdiy(zzecz, zzfvk));
                zzgqc.zzb(set);
                return set;
            }
        }
        set = Collections.emptySet();
        zzgqc.zzb(set);
        return set;
    }
}
