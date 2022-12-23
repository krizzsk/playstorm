package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzbp extends IOException {
    public final boolean zza;
    public final int zzb;

    protected zzbp(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzbp zza(String str, Throwable th) {
        return new zzbp(str, th, true, 1);
    }

    public static zzbp zzb(String str, Throwable th) {
        return new zzbp(str, th, true, 0);
    }

    public static zzbp zzc(String str) {
        return new zzbp(str, (Throwable) null, false, 1);
    }
}
