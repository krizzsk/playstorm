package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcql implements zzfaz {
    private final zzcrb zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcql(zzcrb zzcrb, zzcqk zzcqk) {
        this.zza = zzcrb;
    }

    public final /* synthetic */ zzfaz zza(String str) {
        this.zzc = str;
        return this;
    }

    public final /* synthetic */ zzfaz zzb(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzfba zzc() {
        zzgqc.zzc(this.zzb, Context.class);
        return new zzcqn(this.zza, this.zzb, this.zzc, (zzcqm) null);
    }
}
