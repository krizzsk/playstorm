package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.tapjoy.TJAdUnitConstants;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbnm implements zzbol {
    private final zzbnn zza;

    public zzbnm(zzbnn zzbnn) {
        this.zza = zzbnn;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zze.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbD(str, (String) map.get(TJAdUnitConstants.String.VIDEO_INFO));
        }
    }
}
