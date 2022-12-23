package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcpx implements zzdxo {
    private final zzcrb zza;
    private Context zzb;
    private zzbpg zzc;

    /* synthetic */ zzcpx(zzcrb zzcrb, zzcpw zzcpw) {
        this.zza = zzcrb;
    }

    public final /* synthetic */ zzdxo zza(zzbpg zzbpg) {
        if (zzbpg != null) {
            this.zzc = zzbpg;
            return this;
        }
        throw null;
    }

    public final /* synthetic */ zzdxo zzb(Context context) {
        if (context != null) {
            this.zzb = context;
            return this;
        }
        throw null;
    }

    public final zzdxp zzc() {
        zzgqc.zzc(this.zzb, Context.class);
        zzgqc.zzc(this.zzc, zzbpg.class);
        return new zzcpz(this.zza, this.zzb, this.zzc, (zzcpy) null);
    }
}
