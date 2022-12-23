package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzesa implements zzfoi {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzesa(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        zze.zzg("Error calling adapter: ".concat(String.valueOf(this.zza)));
        return null;
    }
}
