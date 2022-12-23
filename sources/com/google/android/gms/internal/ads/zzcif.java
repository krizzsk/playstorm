package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzcif implements Runnable {
    public final /* synthetic */ zzcij zza;
    public final /* synthetic */ int zzb;

    public /* synthetic */ zzcif(zzcij zzcij, int i) {
        this.zza = zzcij;
        this.zzb = i;
    }

    public final void run() {
        this.zza.zzP(this.zzb);
    }
}
