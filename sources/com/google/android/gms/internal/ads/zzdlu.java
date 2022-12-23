package com.google.android.gms.internal.ads;

import com.p374my.tracker.ads.AdFormat;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdlu implements zzgpu {
    private final zzgqh zza;

    public zzdlu(zzgqh zzgqh) {
        this.zza = zzgqh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        if (((zzdlr) this.zza).zza().zze() != null) {
            set = Collections.singleton(AdFormat.BANNER);
        } else {
            set = Collections.emptySet();
        }
        zzgqc.zzb(set);
        return set;
    }
}
