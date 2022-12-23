package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
abstract class zzgpq implements zzgpu {
    private final Map zza;

    zzgpq(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
