package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzfjp implements Runnable {
    final /* synthetic */ zzfjq zza;
    private final WebView zzb = this.zza.zza;

    zzfjp(zzfjq zzfjq) {
        this.zza = zzfjq;
    }

    public final void run() {
        this.zzb.destroy();
    }
}
