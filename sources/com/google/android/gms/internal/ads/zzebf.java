package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzebf implements zzden {
    private final Context zza;
    private final zzcdn zzb;

    zzebf(Context context, zzcdn zzcdn) {
        this.zza = context;
        this.zzb = zzcdn;
    }

    public final void zzb(zzfbs zzfbs) {
        if (!TextUtils.isEmpty(zzfbs.zzb.zzb.zzd)) {
            this.zzb.zzp(this.zza, zzfbs.zza.zza.zzd);
            this.zzb.zzl(this.zza, zzfbs.zzb.zzb.zzd);
        }
    }

    public final void zzbE(zzbzu zzbzu) {
    }
}
