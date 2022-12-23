package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzczj implements zzddg, zza, zzden, zzdcm, zzdbs, zzdgy {
    private final Clock zza;
    private final zzcek zzb;

    public zzczj(Clock clock, zzcek zzcek) {
        this.zza = clock;
        this.zzb = zzcek;
    }

    public final void onAdClicked() {
        this.zzb.zzd();
    }

    public final void zzb(zzfbs zzfbs) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    public final void zzbE(zzbzu zzbzu) {
    }

    public final void zzbv() {
    }

    public final String zzc() {
        return this.zzb.zzc();
    }

    public final void zzd() {
    }

    public final void zze(zzbeg zzbeg) {
        this.zzb.zzi();
    }

    public final void zzf(zzbeg zzbeg) {
    }

    public final void zzg(zzl zzl) {
        this.zzb.zzj(zzl);
    }

    public final void zzh(boolean z) {
    }

    public final void zzi(zzbeg zzbeg) {
        this.zzb.zzg();
    }

    public final void zzj() {
        this.zzb.zze();
    }

    public final void zzk(boolean z) {
    }

    public final void zzl() {
        this.zzb.zzf();
    }

    public final void zzm() {
    }

    public final void zzn() {
        this.zzb.zzh(true);
    }

    public final void zzo() {
    }

    public final void zzp(zzcak zzcak, String str, String str2) {
    }

    public final void zzr() {
    }
}
