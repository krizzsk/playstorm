package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzcig implements Runnable {
    public final /* synthetic */ zzcij zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzcig(zzcij zzcij, int i, int i2) {
        this.zza = zzcij;
        this.zzb = i;
        this.zzc = i2;
    }

    public final void run() {
        this.zza.zzN(this.zzb, this.zzc);
    }
}
