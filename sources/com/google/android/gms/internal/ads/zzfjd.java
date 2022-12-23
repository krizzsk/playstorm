package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfjd {
    private final zzfkk zza;
    private final String zzb;
    private final zzfir zzc;
    private final String zzd = "Ad overlay";

    public zzfjd(View view, zzfir zzfir, String str) {
        this.zza = new zzfkk(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfir;
    }

    public final zzfir zza() {
        return this.zzc;
    }

    public final zzfkk zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
