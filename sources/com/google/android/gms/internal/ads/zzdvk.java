package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdvk implements zzgpu {
    private final zzgqh zza;
    private final zzgqh zzb;
    private final zzgqh zzc;
    private final zzgqh zzd;

    public zzdvk(zzgqh zzgqh, zzgqh zzgqh2, zzgqh zzgqh3, zzgqh zzgqh4) {
        this.zza = zzgqh;
        this.zzb = zzgqh2;
        this.zzc = zzgqh3;
        this.zzd = zzgqh4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        String zza2 = ((zzevj) this.zza).zza();
        Context zza3 = ((zzcnk) this.zzb).zza();
        zzfvk zzfvk = zzcfv.zza;
        zzgqc.zzb(zzfvk);
        Map zzd2 = ((zzgpy) this.zzd).zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzdU)).booleanValue()) {
            zzbdl zzbdl = new zzbdl(new zzbdr(zza3));
            zzbdl.zzb(new zzdvl(zza2));
            set = Collections.singleton(new zzdiy(new zzdvn(zzbdl, zzd2), zzfvk));
        } else {
            set = Collections.emptySet();
        }
        zzgqc.zzb(set);
        return set;
    }
}
