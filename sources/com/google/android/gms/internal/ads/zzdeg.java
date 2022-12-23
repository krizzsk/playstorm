package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdeg implements Runnable {
    private final WeakReference zza;

    /* synthetic */ zzdeg(zzdeh zzdeh, zzdef zzdef) {
        this.zza = new WeakReference(zzdeh);
    }

    public final void run() {
        zzdeh zzdeh = (zzdeh) this.zza.get();
        if (zzdeh != null) {
            zzdeh.zzo(zzdee.zza);
        }
    }
}
