package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzetz implements zzetb {
    private final Context zza;
    private final String zzb;
    private final zzfvk zzc;

    public zzetz(zzbzw zzbzw, Context context, String str, zzfvk zzfvk) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzfvk;
    }

    public final int zza() {
        return 42;
    }

    public final zzfvj zzb() {
        return this.zzc.zzb(new zzety(this));
    }
}
