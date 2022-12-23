package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdpt {
    private final zzfvk zza;
    private final zzdqg zzb;
    private final zzdql zzc;

    public zzdpt(zzfvk zzfvk, zzdqg zzdqg, zzdql zzdql) {
        this.zza = zzfvk;
        this.zzb = zzdqg;
        this.zzc = zzdql;
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg, JSONObject jSONObject) {
        zzfvj zzn;
        zzfbs zzfbs2 = zzfbs;
        zzfbg zzfbg2 = zzfbg;
        JSONObject jSONObject2 = jSONObject;
        zzfvj zzb2 = this.zza.zzb(new zzdpr(this, zzfbs2, zzfbg2, jSONObject2));
        zzfvj zzf = this.zzb.zzf(jSONObject2, "images");
        zzfvj zzg = this.zzb.zzg(jSONObject2, "images", zzfbg2, zzfbs2.zzb.zzb);
        zzfvj zze = this.zzb.zze(jSONObject2, "secondary_image");
        zzfvj zze2 = this.zzb.zze(jSONObject2, "app_icon");
        zzfvj zzd = this.zzb.zzd(jSONObject2, "attribution");
        zzfvj zzh = this.zzb.zzh(jSONObject2, zzfbg2, zzfbs2.zzb.zzb);
        zzdqg zzdqg = this.zzb;
        if (!jSONObject2.optBoolean("enable_omid")) {
            zzn = zzfva.zzi((Object) null);
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("omid_settings");
            if (optJSONObject == null) {
                zzn = zzfva.zzi((Object) null);
            } else {
                String optString = optJSONObject.optString("omid_html");
                if (TextUtils.isEmpty(optString)) {
                    zzn = zzfva.zzi((Object) null);
                } else {
                    zzn = zzfva.zzn(zzfva.zzi((Object) null), new zzdpv(zzdqg, optString), zzcfv.zze);
                }
            }
        }
        zzfvj zzfvj = zzn;
        zzfvj zza2 = this.zzc.zza(jSONObject2, "custom_assets");
        return zzfva.zzb(zzb2, zzf, zzg, zze, zze2, zzd, zzh, zzfvj, zza2).zza(new zzdps(this, zzb2, zzf, zze2, zze, zzd, jSONObject, zzh, zzg, zzfvj, zza2), this.zza);
    }
}
