package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzcxb implements Runnable {
    public final /* synthetic */ zzcxc zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcxb(zzcxc zzcxc, Runnable runnable) {
        this.zza = zzcxc;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzk(this.zzb);
    }
}
