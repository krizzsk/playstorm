package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
final class zzdmb implements zzbol {
    private final WeakReference zza;

    /* synthetic */ zzdmb(zzdmg zzdmg, zzdma zzdma) {
        this.zza = new WeakReference(zzdmg);
    }

    public final void zza(Object obj, Map map) {
        zzdmg zzdmg = (zzdmg) this.zza.get();
        if (zzdmg != null && "_ac".equals((String) map.get("eventName"))) {
            zzdmg.zzh.onAdClicked();
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzif)).booleanValue()) {
                zzdmg.zzi.zzq();
            }
        }
    }
}
