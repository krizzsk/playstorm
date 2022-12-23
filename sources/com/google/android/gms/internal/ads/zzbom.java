package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzbom implements zzbol {
    private final zzdza zza;

    public zzbom(zzdza zzdza) {
        Preconditions.checkNotNull(zzdza, "The Inspector Manager must not be null");
        this.zza = zzdza;
    }

    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzh((String) map.get("extras"), j);
        }
    }
}
