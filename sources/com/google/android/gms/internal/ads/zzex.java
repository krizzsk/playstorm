package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzex implements zzeq {
    private final Context zza;
    private final zzeq zzb;

    public zzex(Context context) {
        zzez zzez = new zzez();
        this.zza = context.getApplicationContext();
        this.zzb = zzez;
    }

    public final /* bridge */ /* synthetic */ zzer zza() {
        return new zzey(this.zza, ((zzez) this.zzb).zza());
    }
}
