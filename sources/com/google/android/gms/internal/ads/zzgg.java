package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzgg {
    private final Context zza;
    private final zzge zzb;

    public zzgg(Context context, Handler handler, zzgf zzgf) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzge(this, handler, zzgf);
    }
}
