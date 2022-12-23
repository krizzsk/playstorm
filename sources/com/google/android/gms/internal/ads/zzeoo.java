package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeoo implements zzetb {
    private final Executor zza;
    private final zzcer zzb;

    zzeoo(Executor executor, zzcer zzcer) {
        this.zza = executor;
        this.zzb = zzcer;
    }

    public final int zza() {
        return 10;
    }

    public final zzfvj zzb() {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzci)).booleanValue()) {
            return zzfva.zzi((Object) null);
        }
        return zzfva.zzm(this.zzb.zzj(), zzeom.zza, this.zza);
    }
}
