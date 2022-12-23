package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdax implements Callable {
    public final /* synthetic */ zzday zza;
    public final /* synthetic */ zzfvj zzb;

    public /* synthetic */ zzdax(zzday zzday, zzfvj zzfvj) {
        this.zza = zzday;
        this.zzb = zzfvj;
    }

    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}
