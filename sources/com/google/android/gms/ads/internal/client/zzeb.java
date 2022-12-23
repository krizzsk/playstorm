package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.0.0 */
final class zzeb extends zzcx {
    private zzeb() {
    }

    public final void zze(@Nullable zze zze) {
        AdInspectorError adInspectorError;
        OnAdInspectorClosedListener zzb = zzee.zzf().zzg;
        if (zzb != null) {
            if (zze == null) {
                adInspectorError = null;
            } else {
                adInspectorError = new AdInspectorError(zze.zza, zze.zzb, zze.zzc);
            }
            zzb.onAdInspectorClosed(adInspectorError);
        }
    }

    /* synthetic */ zzeb(zzea zzea) {
    }
}
