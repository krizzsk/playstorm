package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzcxa implements Runnable {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzcxa(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    public final void run() {
        zzcxc.zzi(this.zza);
    }
}
