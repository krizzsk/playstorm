package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzad;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzcqv implements zzg {
    private final zzcrb zza;
    private zzdbe zzb;
    private zzad zzc;

    /* synthetic */ zzcqv(zzcrb zzcrb, zzcqu zzcqu) {
        this.zza = zzcrb;
    }

    public final /* synthetic */ zzg zza(zzdbe zzdbe) {
        this.zzb = zzdbe;
        return this;
    }

    public final /* synthetic */ zzg zzb(zzad zzad) {
        this.zzc = zzad;
        return this;
    }

    public final zzh zzc() {
        zzgqc.zzc(this.zzb, zzdbe.class);
        zzgqc.zzc(this.zzc, zzad.class);
        return new zzcqx(this.zza, this.zzc, new zzczb(), new zzdwt(), this.zzb, new zzfdf(), (zzezb) null, (zzeyc) null, (zzcqw) null);
    }
}
