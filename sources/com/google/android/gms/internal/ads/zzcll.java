package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzcll implements Runnable {
    public final /* synthetic */ zzclp zza;
    public final /* synthetic */ View zzb;
    public final /* synthetic */ zzccj zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzcll(zzclp zzclp, View view, zzccj zzccj, int i) {
        this.zza = zzclp;
        this.zzb = view;
        this.zzc = zzccj;
        this.zzd = i;
    }

    public final void run() {
        this.zza.zzn(this.zzb, this.zzc, this.zzd);
    }
}
