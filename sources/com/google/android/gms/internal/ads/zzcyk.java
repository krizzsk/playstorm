package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcyk {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzfvj zzc;
    private volatile boolean zzd = true;

    public zzcyk(Executor executor, ScheduledExecutorService scheduledExecutorService, zzfvj zzfvj) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzfvj;
    }

    static /* bridge */ /* synthetic */ void zzb(zzcyk zzcyk, List list, zzfuw zzfuw) {
        if (list == null || list.isEmpty()) {
            zzcyk.zza.execute(new zzcye(zzfuw));
            return;
        }
        zzfvj zzi = zzfva.zzi((Object) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzi = zzfva.zzn(zzfva.zzg(zzi, Throwable.class, new zzcyf(zzfuw), zzcyk.zza), new zzcyg(zzcyk, zzfuw, (zzfvj) it.next()), zzcyk.zza);
        }
        zzfva.zzr(zzi, new zzcyj(zzcyk, zzfuw), zzcyk.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zza(zzfuw zzfuw, zzfvj zzfvj, zzcxw zzcxw) throws Exception {
        if (zzcxw != null) {
            zzfuw.zzb(zzcxw);
        }
        return zzfva.zzo(zzfvj, ((Long) zzbka.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzfuw zzfuw) {
        zzfva.zzr(this.zzc, new zzcyi(this, zzfuw), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
