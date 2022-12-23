package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzbnt implements zzbol {
    public final /* synthetic */ zzdjf zza;

    public /* synthetic */ zzbnt(zzdjf zzdjf) {
        this.zza = zzdjf;
    }

    public final void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        zzbok.zzd(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from click GMSG.");
        } else {
            zzfva.zzr(zzbok.zzb(zzcli, str), new zzbob(zzcli), zzcfv.zza);
        }
    }
}
