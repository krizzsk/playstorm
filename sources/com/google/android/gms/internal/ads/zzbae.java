package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbae implements Runnable {
    final /* synthetic */ Surface zza;
    final /* synthetic */ zzbag zzb;

    zzbae(zzbag zzbag, Surface surface) {
        this.zzb = zzbag;
        this.zza = surface;
    }

    public final void run() {
        this.zzb.zzb.zzm(this.zza);
    }
}
