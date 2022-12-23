package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdsr implements Runnable {
    public final /* synthetic */ zzcli zza;

    public /* synthetic */ zzdsr(zzcli zzcli) {
        this.zza = zzcli;
    }

    public final void run() {
        this.zza.destroy();
    }
}
