package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcoz implements zzewe {
    private final zzcrb zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcoz(zzcrb zzcrb, zzcoy zzcoy) {
        this.zza = zzcrb;
    }

    public final /* synthetic */ zzewe zza(String str) {
        if (str != null) {
            this.zzc = str;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzewe zzb(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzewf zzc() {
        zzgqc.zzc(this.zzb, Context.class);
        zzgqc.zzc(this.zzc, String.class);
        return new zzcpb(this.zza, this.zzb, this.zzc, (zzcpa) null);
    }
}
