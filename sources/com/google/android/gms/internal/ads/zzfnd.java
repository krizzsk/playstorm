package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
public abstract class zzfnd implements Closeable {
    public static zzfnp zza() {
        return new zzfnp();
    }

    public static zzfnp zzb(int i, zzfno zzfno) {
        return new zzfnp(new zzfnb(i), zzfnc.zza, zzfno);
    }

    public static zzfnp zzc(zzfph<Integer> zzfph, zzfph<Integer> zzfph2, zzfno zzfno) {
        return new zzfnp(zzfph, zzfph2, zzfno);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
