package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzffm {
    final /* synthetic */ zzffw zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzffm(zzffw zzffw, Object obj, List list, zzffl zzffl) {
        this.zza = zzffw;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzffv zza(Callable callable) {
        zzfuz zzc2 = zzfva.zzc(this.zzc);
        zzfvj zza2 = zzc2.zza(zzffk.zza, zzcfv.zzf);
        zzffw zzffw = this.zza;
        return new zzffv(zzffw, this.zzb, (String) null, zza2, this.zzc, zzc2.zza(callable, zzffw.zzb), (zzffu) null);
    }
}
