package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajf;
import com.google.android.gms.internal.ads.zzajk;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzbh implements zzajf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbl zzb;

    zzbh(zzbo zzbo, String str, zzbl zzbl) {
        this.zza = str;
        this.zzb = zzbl;
    }

    public final void zza(zzajk zzajk) {
        String str = this.zza;
        String zzajk2 = zzajk.toString();
        zze.zzj("Failed to load URL: " + str + "\n" + zzajk2);
        this.zzb.zza((Object) null);
    }
}
