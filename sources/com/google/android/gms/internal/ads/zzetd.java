package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzetd implements Callable {
    public final /* synthetic */ List zza;
    public final /* synthetic */ Object zzb;

    public /* synthetic */ zzetd(List list, Object obj) {
        this.zza = list;
        this.zzb = obj;
    }

    public final Object call() {
        List<zzfvj> list = this.zza;
        Object obj = this.zzb;
        for (zzfvj zzfvj : list) {
            zzeta zzeta = (zzeta) zzfvj.get();
            if (zzeta != null) {
                zzeta.zzf(obj);
            }
        }
        return obj;
    }
}
