package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzehl implements zzefa {
    private final zzdub zza;

    public zzehl(zzdub zzdub) {
        this.zza = zzdub;
    }

    public final zzefb zza(String str, JSONObject jSONObject) throws zzfcd {
        return new zzefb(this.zza.zzc(str, jSONObject), new zzegu(), str);
    }
}
