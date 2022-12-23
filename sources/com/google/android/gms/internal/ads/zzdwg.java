package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdwg {
    /* access modifiers changed from: private */
    public final zzdwl zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    /* access modifiers changed from: private */
    public final Map zzc;

    public zzdwg(zzdwl zzdwl, Executor executor) {
        this.zza = zzdwl;
        this.zzc = zzdwl.zza();
        this.zzb = executor;
    }

    public final zzdwf zza() {
        zzdwf zzdwf = new zzdwf(this);
        zzdwf unused = zzdwf.zzb.putAll(zzdwf.zza.zzc);
        return zzdwf;
    }
}
