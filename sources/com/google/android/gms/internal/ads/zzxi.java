package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzxi implements Runnable {
    public final /* synthetic */ zzxq zza;
    public final /* synthetic */ Exception zzb;

    public /* synthetic */ zzxi(zzxq zzxq, Exception exc) {
        this.zza = zzxq;
        this.zzb = exc;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
