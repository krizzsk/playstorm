package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.warren.model.ReportDBAdapter;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzdpr implements Callable {
    public final /* synthetic */ zzdpt zza;
    public final /* synthetic */ zzfbs zzb;
    public final /* synthetic */ zzfbg zzc;
    public final /* synthetic */ JSONObject zzd;

    public /* synthetic */ zzdpr(zzdpt zzdpt, zzfbs zzfbs, zzfbg zzfbg, JSONObject jSONObject) {
        this.zza = zzdpt;
        this.zzb = zzfbs;
        this.zzc = zzfbg;
        this.zzd = jSONObject;
    }

    public final Object call() {
        zzfbs zzfbs = this.zzb;
        zzfbg zzfbg = this.zzc;
        JSONObject jSONObject = this.zzd;
        zzdng zzdng = new zzdng();
        zzdng.zzV(jSONObject.optInt(ReportDBAdapter.ReportColumns.COLUMN_TEMPATE_ID, -1));
        zzdng.zzI(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdng.zzS(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfby zzfby = zzfbs.zza.zza;
        if (zzfby.zzg.contains(Integer.toString(zzdng.zzc()))) {
            if (zzdng.zzc() == 3) {
                if (zzdng.zzy() == null) {
                    throw new zzeio(1, "No custom template id for custom template ad response.");
                } else if (!zzfby.zzh.contains(zzdng.zzy())) {
                    throw new zzeio(1, "Unexpected custom template id in the response.");
                }
            }
            zzdng.zzT(jSONObject.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d));
            String optString = jSONObject.optString("headline", (String) null);
            if (zzfbg.zzN) {
                zzt.zzp();
                optString = zzs.zzv() + " : " + optString;
            }
            zzdng.zzU("headline", optString);
            zzdng.zzU("body", jSONObject.optString("body", (String) null));
            zzdng.zzU("call_to_action", jSONObject.optString("call_to_action", (String) null));
            zzdng.zzU("store", jSONObject.optString("store", (String) null));
            zzdng.zzU("price", jSONObject.optString("price", (String) null));
            zzdng.zzU(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, jSONObject.optString(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, (String) null));
            return zzdng;
        }
        throw new zzeio(1, "Invalid template ID: " + zzdng.zzc());
    }
}
