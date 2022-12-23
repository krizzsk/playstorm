package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdzl implements Callable {
    public final /* synthetic */ zzdzo zza;
    public final /* synthetic */ zzbzu zzb;

    public /* synthetic */ zzdzl(zzdzo zzdzo, zzbzu zzbzu) {
        this.zza = zzdzo;
        this.zzb = zzbzu;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb);
    }
}
