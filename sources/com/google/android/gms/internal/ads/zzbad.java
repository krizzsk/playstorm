package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbad implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzbag zze;

    zzbad(zzbag zzbag, int i, int i2, int i3, float f) {
        this.zze = zzbag;
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = f;
    }

    public final void run() {
        this.zze.zzb.zzo(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
