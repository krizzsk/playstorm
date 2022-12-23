package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzecb implements Callable {
    public final /* synthetic */ zzfvj zza;
    public final /* synthetic */ zzfvj zzb;

    public /* synthetic */ zzecb(zzfvj zzfvj, zzfvj zzfvj2) {
        this.zza = zzfvj;
        this.zzb = zzfvj2;
    }

    public final Object call() {
        return new zzect((JSONObject) this.zza.get(), (zzbzx) this.zzb.get());
    }
}
