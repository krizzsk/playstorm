package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzcdi implements Callable {
    public final /* synthetic */ zzcdn zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzcdi(zzcdn zzcdn, Context context) {
        this.zza = zzcdn;
        this.zzb = context;
    }

    public final Object call() {
        return this.zza.zzg(this.zzb);
    }
}
