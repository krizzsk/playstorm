package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdwb;
import com.google.android.gms.internal.ads.zzdwl;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zze implements Runnable {
    public final /* synthetic */ zzdwl zza;
    public final /* synthetic */ zzdwb zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ Pair[] zzd;

    public /* synthetic */ zze(zzdwl zzdwl, zzdwb zzdwb, String str, Pair[] pairArr) {
        this.zza = zzdwl;
        this.zzb = zzdwb;
        this.zzc = str;
        this.zzd = pairArr;
    }

    public final void run() {
        Map map;
        zzdwl zzdwl = this.zza;
        zzdwb zzdwb = this.zzb;
        String str = this.zzc;
        Pair[] pairArr = this.zzd;
        if (zzdwb == null) {
            map = zzdwl.zzc();
        } else {
            map = zzdwb.zza();
        }
        map.put("action", str);
        for (Pair pair : pairArr) {
            map.put((String) pair.first, (String) pair.second);
        }
        zzdwl.zze(map);
    }
}
