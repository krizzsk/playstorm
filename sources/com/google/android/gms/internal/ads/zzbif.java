package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbif {
    public static boolean zza(zzbin zzbin, zzbik zzbik, String... strArr) {
        if (zzbik == null) {
            return false;
        }
        zzbin.zze(zzbik, zzt.zzA().elapsedRealtime(), strArr);
        return true;
    }
}
