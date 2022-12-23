package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzbrl implements Runnable {
    public final /* synthetic */ zzbro zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbrl(zzbro zzbro, String str) {
        this.zza = zzbro;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzp(this.zzb);
    }
}
