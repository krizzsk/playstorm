package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzais {
    private final Executor zza;

    public zzais(Handler handler) {
        this.zza = new zzaiq(this, handler);
    }

    public final void zza(zzajb zzajb, zzajk zzajk) {
        zzajb.zzm("post-error");
        zzajh zza2 = zzajh.zza(zzajk);
        Executor executor = this.zza;
        ((zzaiq) executor).zza.post(new zzair(zzajb, zza2, (Runnable) null));
    }

    public final void zzb(zzajb zzajb, zzajh zzajh, Runnable runnable) {
        zzajb.zzq();
        zzajb.zzm("post-response");
        Executor executor = this.zza;
        ((zzaiq) executor).zza.post(new zzair(zzajb, zzajh, runnable));
    }
}
