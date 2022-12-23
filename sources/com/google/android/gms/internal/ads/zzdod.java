package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdod implements Runnable {
    public final /* synthetic */ zzdog zza;
    public final /* synthetic */ ViewGroup zzb;

    public /* synthetic */ zzdod(zzdog zzdog, ViewGroup viewGroup) {
        this.zza = zzdog;
        this.zzb = viewGroup;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
