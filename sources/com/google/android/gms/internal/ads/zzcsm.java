package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzcsm {
    private final Map zza;
    private final Map zzb;

    zzcsm(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final void zza(zzfbs zzfbs) throws Exception {
        for (zzfbq zzfbq : zzfbs.zzb.zzc) {
            if (this.zza.containsKey(zzfbq.zza)) {
                ((zzcsp) this.zza.get(zzfbq.zza)).zza(zzfbq.zzb);
            } else if (this.zzb.containsKey(zzfbq.zza)) {
                zzcso zzcso = (zzcso) this.zzb.get(zzfbq.zza);
                JSONObject jSONObject = zzfbq.zzb;
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = jSONObject.optString(next);
                    if (optString != null) {
                        hashMap.put(next, optString);
                    }
                }
                zzcso.zza(hashMap);
            }
        }
    }
}
