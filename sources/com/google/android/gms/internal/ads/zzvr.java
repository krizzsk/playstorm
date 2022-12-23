package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzvr implements Runnable {
    public final /* synthetic */ zzvs zza;
    public final /* synthetic */ int zzb;
    public final /* synthetic */ long zzc;
    public final /* synthetic */ long zzd;

    public /* synthetic */ zzvr(zzvs zzvs, int i, long j, long j2) {
        this.zza = zzvs;
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public final void run() {
        zzvs zzvs = this.zza;
        zzvs.zzb.zzY(this.zzb, this.zzc, this.zzd);
    }
}
