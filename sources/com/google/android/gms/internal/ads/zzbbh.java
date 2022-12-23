package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbbh implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbbl zzb;

    zzbbh(zzbbl zzbbl, View view) {
        this.zzb = zzbbl;
        this.zza = view;
    }

    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
