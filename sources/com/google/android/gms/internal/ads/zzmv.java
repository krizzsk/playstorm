package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzmv {
    public static final zzmv zza = (zzeg.zza < 31 ? new zzmv() : new zzmv(zzmu.zza));
    private final zzmu zzb;

    public zzmv() {
        this.zzb = null;
        zzcw.zzf(zzeg.zza < 31);
    }

    private zzmv(zzmu zzmu) {
        this.zzb = zzmu;
    }

    public final LogSessionId zza() {
        zzmu zzmu = this.zzb;
        if (zzmu != null) {
            return zzmu.zzb;
        }
        throw null;
    }

    public zzmv(LogSessionId logSessionId) {
        this.zzb = new zzmu(logSessionId);
    }
}
