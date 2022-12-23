package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzevc implements zzetb {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbxy zzc;

    public zzevc(zzbxy zzbxy, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbxy;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    public final int zza() {
        return 49;
    }

    public final zzfvj zzb() {
        return zzfva.zzm(zzfva.zzo(zzfva.zzi(new Bundle()), ((Long) zzay.zzc().zzb(zzbhy.zzde)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzevb.zza, zzcfv.zza);
    }
}
