package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzegs implements zzeey {
    /* access modifiers changed from: private */
    public final zzcwr zza;
    private final zzefz zzb;
    private final zzfvk zzc;
    /* access modifiers changed from: private */
    public final zzdbu zzd;
    private final ScheduledExecutorService zze;

    public zzegs(zzcwr zzcwr, zzefz zzefz, zzdbu zzdbu, ScheduledExecutorService scheduledExecutorService, zzfvk zzfvk) {
        this.zza = zzcwr;
        this.zzb = zzefz;
        this.zzd = zzdbu;
        this.zze = scheduledExecutorService;
        this.zzc = zzfvk;
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        return this.zzc.zzb(new zzegp(this, zzfbs, zzfbg));
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        return zzfbs.zza.zza.zza() != null && this.zzb.zzb(zzfbs, zzfbg);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzcvu zzc(zzfbs zzfbs, zzfbg zzfbg) throws Exception {
        return this.zza.zzb(new zzcyl(zzfbs, zzfbg, (String) null), new zzcxe(zzfbs.zza.zza.zza(), new zzegq(this, zzfbs, zzfbg))).zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzfbs zzfbs, zzfbg zzfbg) {
        zzfva.zzr(zzfva.zzo(this.zzb.zza(zzfbs, zzfbg), (long) zzfbg.zzS, TimeUnit.SECONDS, this.zze), new zzegr(this), this.zzc);
    }
}
