package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfgl {
    private final Executor zza;
    private final zzcfn zzb;

    public zzfgl(Executor executor, zzcfn zzcfn) {
        this.zza = executor;
        this.zzb = zzcfn;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(String str) {
        this.zzb.zza(str);
    }

    public final void zzb(String str) {
        this.zza.execute(new zzfgk(this, str));
    }
}
