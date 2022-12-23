package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzejb implements zzefa {
    private final Map zza = new HashMap();
    private final zzdub zzb;

    public zzejb(zzdub zzdub) {
        this.zzb = zzdub;
    }

    public final zzefb zza(String str, JSONObject jSONObject) throws zzfcd {
        zzefb zzefb;
        synchronized (this) {
            zzefb = (zzefb) this.zza.get(str);
            if (zzefb == null) {
                zzefb = new zzefb(this.zzb.zzc(str, jSONObject), new zzegv(), str);
                this.zza.put(str, zzefb);
            }
        }
        return zzefb;
    }
}
