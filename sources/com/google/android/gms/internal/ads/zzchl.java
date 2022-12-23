package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzchl {
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) zzay.zzc().zzb(zzbhy.zzB)).longValue());
    private long zzb;
    private boolean zzc = true;

    zzchl() {
    }

    public final void zza(SurfaceTexture surfaceTexture, zzcgw zzcgw) {
        if (zzcgw != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.zzc || Math.abs(timestamp - this.zzb) >= this.zza) {
                this.zzc = false;
                this.zzb = timestamp;
                zzs.zza.post(new zzchk(zzcgw));
            }
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
