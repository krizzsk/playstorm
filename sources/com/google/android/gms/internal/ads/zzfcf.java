package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzfcf implements zzbol {
    public final /* synthetic */ zzdjf zza;
    public final /* synthetic */ zzfig zzb;
    public final /* synthetic */ zzeen zzc;

    public /* synthetic */ zzfcf(zzdjf zzdjf, zzfig zzfig, zzeen zzeen) {
        this.zza = zzdjf;
        this.zzb = zzfig;
        this.zzc = zzeen;
    }

    public final void zza(Object obj, Map map) {
        zzdjf zzdjf = this.zza;
        zzfig zzfig = this.zzb;
        zzeen zzeen = this.zzc;
        zzcli zzcli = (zzcli) obj;
        zzbok.zzd(map, zzdjf);
        String str = (String) map.get("u");
        if (str == null) {
            zze.zzj("URL missing from click GMSG.");
        } else {
            zzfva.zzr(zzbok.zzb(zzcli, str), new zzfcg(zzcli, zzfig, zzeen), zzcfv.zza);
        }
    }
}
