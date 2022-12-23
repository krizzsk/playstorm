package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzaw;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcei {
    public final zzfvj zza(Context context, int i) {
        zzcga zzcga = new zzcga();
        zzaw.zzb();
        if (zzcfb.zzr(context)) {
            zzcfv.zza.execute(new zzceh(this, context, zzcga));
        }
        return zzcga;
    }
}
