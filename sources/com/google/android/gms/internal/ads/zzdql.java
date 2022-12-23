package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdql {
    private final Executor zza;
    private final zzdqg zzb;

    public zzdql(Executor executor, zzdqg zzdqg) {
        this.zza = executor;
        this.zzb = zzdqg;
    }

    public final zzfvj zza(JSONObject jSONObject, String str) {
        zzfvj zzfvj;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzfva.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzfvj = zzfva.zzi((Object) null);
            } else {
                String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzfvj = zzfva.zzi((Object) null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if ("string".equals(optString2)) {
                        zzfvj = zzfva.zzi(new zzdqk(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzfvj = zzfva.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzdqi(optString), this.zza);
                    } else {
                        zzfvj = zzfva.zzi((Object) null);
                    }
                }
            }
            arrayList.add(zzfvj);
        }
        return zzfva.zzm(zzfva.zze(arrayList), zzdqj.zza, this.zza);
    }
}
