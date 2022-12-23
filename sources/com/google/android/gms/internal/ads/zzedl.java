package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzedl implements Callable {
    public final /* synthetic */ zzedj zza;

    public /* synthetic */ zzedl(zzedj zzedj) {
        this.zza = zzedj;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
