package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzboi implements zzbol {
    zzboi() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        if (map.keySet().contains("start")) {
            zzcli.zzP().zzk();
        } else if (map.keySet().contains("stop")) {
            zzcli.zzP().zzl();
        } else if (map.keySet().contains("cancel")) {
            zzcli.zzP().zzj();
        }
    }
}
