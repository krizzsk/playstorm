package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public final class zzbkf {
    static final AtomicBoolean zza = new AtomicBoolean();
    private static final AtomicReference zzb = new AtomicReference();
    private static final AtomicReference zzc = new AtomicReference();

    static zzbkd zza() {
        return (zzbkd) zzb.get();
    }

    static zzbke zzb() {
        return (zzbke) zzc.get();
    }

    public static void zzc(zzbkd zzbkd) {
        zzb.set(zzbkd);
    }
}
