package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzng implements Runnable {
    public final /* synthetic */ zznk zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzng(zznk zznk, Exception exc) {
        this.zza = zznk;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzi(this.zzb);
    }
}
