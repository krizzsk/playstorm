package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzfty implements Runnable {
    public final /* synthetic */ zzfua zza;
    public final /* synthetic */ zzfvj zzb;
    public final /* synthetic */ int zzc;

    public /* synthetic */ zzfty(zzfua zzfua, zzfvj zzfvj, int i) {
        this.zza = zzfua;
        this.zzb = zzfvj;
        this.zzc = i;
    }

    public final void run() {
        this.zza.zzx(this.zzb, this.zzc);
    }
}
