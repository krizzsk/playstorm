package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdmf implements zzbol {
    private final WeakReference zza;

    /* synthetic */ zzdmf(zzdmg zzdmg, zzdme zzdme) {
        this.zza = new WeakReference(zzdmg);
    }

    public final void zza(Object obj, Map map) {
        zzdmg zzdmg = (zzdmg) this.zza.get();
        if (zzdmg != null) {
            zzdmg.zzg.zza();
        }
    }
}
