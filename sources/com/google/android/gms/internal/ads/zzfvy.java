package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfvy extends zzfuq implements RunnableFuture {
    @CheckForNull
    private volatile zzfvi zza;

    zzfvy(zzfug zzfug) {
        this.zza = new zzfvw(this, zzfug);
    }

    static zzfvy zzf(Runnable runnable, Object obj) {
        return new zzfvy(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzfvi zzfvi = this.zza;
        if (zzfvi != null) {
            zzfvi.run();
        }
        this.zza = null;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        zzfvi zzfvi = this.zza;
        if (zzfvi == null) {
            return super.zza();
        }
        String obj = zzfvi.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 7);
        sb.append("task=[");
        sb.append(obj);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzfvi zzfvi;
        if (zzu() && (zzfvi = this.zza) != null) {
            zzfvi.zzh();
        }
        this.zza = null;
    }

    zzfvy(Callable callable) {
        this.zza = new zzfvx(this, callable);
    }
}
