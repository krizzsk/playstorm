package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeuk implements zzetb {
    private final Context zza;
    private final zzcer zzb;
    private final ScheduledExecutorService zzc;
    private final Executor zzd;
    private final String zze;
    private final zzcei zzf;

    public zzeuk(zzcei zzcei, int i, Context context, zzcer zzcer, ScheduledExecutorService scheduledExecutorService, Executor executor, String str, byte[] bArr) {
        this.zzf = zzcei;
        this.zza = context;
        this.zzb = zzcer;
        this.zzc = scheduledExecutorService;
        this.zzd = executor;
        this.zze = str;
    }

    public final int zza() {
        return 44;
    }

    public final zzfvj zzb() {
        return zzfva.zzf((zzfur) zzfva.zzo(zzfva.zzm(zzfur.zzv(zzfva.zzl(new zzeuh(this), this.zzd)), zzeui.zza, this.zzd), ((Long) zzay.zzc().zzb(zzbhy.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzeuj(this), zzfvq.zzb());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeul zzc(Exception exc) {
        this.zzb.zzt(exc, "AttestationTokenSignal");
        return null;
    }
}
