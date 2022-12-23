package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdwl extends zzdwn {
    private final zzfgw zzf;

    public zzdwl(Executor executor, zzcfn zzcfn, zzfgw zzfgw, zzfgy zzfgy) {
        super(executor, zzcfn, zzfgy);
        this.zzf = zzfgw;
        zzfgw.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
