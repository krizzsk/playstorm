package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbu;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfbl {
    public final String zza;
    public final String zzb = this.zzd.optString("ad_base_url", (String) null);
    public final JSONObject zzc = this.zzd.optJSONObject("ad_json");
    public final JSONObject zzd;

    zzfbl(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        JSONObject zzh = zzbu.zzh(jsonReader);
        this.zzd = zzh;
        this.zza = zzh.optString(CampaignEx.JSON_KEY_AD_HTML, (String) null);
    }
}
