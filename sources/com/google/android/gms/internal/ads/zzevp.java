package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzevp implements zzetb {
    private final zzcer zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzfvk zzd;
    private final String zze;
    private final zzceg zzf;

    zzevp(zzcer zzcer, boolean z, zzceg zzceg, zzfvk zzfvk, String str, ScheduledExecutorService scheduledExecutorService, byte[] bArr) {
        this.zza = zzcer;
        this.zzb = z;
        this.zzf = zzceg;
        this.zzd = zzfvk;
        this.zze = str;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return 50;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzevq zzc(Exception exc) {
        this.zza.zzt(exc, "TrustlessTokenSignal");
        return null;
    }

    public final zzfvj zzb() {
        if (!this.zzb) {
            return zzfva.zzi((Object) null);
        }
        return zzfva.zzf(zzfva.zzo(zzfva.zzm(zzfva.zzi((Object) null), zzevn.zza, this.zzd), ((Long) zzbkb.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzevo(this), this.zzd);
    }
}
