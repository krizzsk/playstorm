package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfcz implements zzgpu {
    private final zzfcy zza;

    public zzfcz(zzfcy zzfcy) {
        this.zza = zzfcy;
    }

    public final /* synthetic */ Object zzb() {
        Clock instance = DefaultClock.getInstance();
        zzgqc.zzb(instance);
        return instance;
    }
}
