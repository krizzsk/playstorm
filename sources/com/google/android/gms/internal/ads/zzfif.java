package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzfif implements Runnable {
    public final /* synthetic */ zzfig zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzfhq zzc;

    public /* synthetic */ zzfif(zzfig zzfig, String str, zzfhq zzfhq) {
        this.zza = zzfig;
        this.zzb = str;
        this.zzc = zzfhq;
    }

    public final void run() {
        this.zza.zzb(this.zzb, this.zzc);
    }
}
