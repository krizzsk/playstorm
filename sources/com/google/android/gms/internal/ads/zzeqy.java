package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeqy implements zzeta {
    public final zzfbf zza;

    public zzeqy(zzfbf zzfbf) {
        this.zza = zzfbf;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfbf zzfbf = this.zza;
        if (zzfbf != null) {
            bundle.putBoolean("render_in_browser", zzfbf.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
