package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.util.PlatformVersion;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzehs implements zzehm {
    private final zzdlt zza;
    private final zzfvk zzb;
    private final zzdpt zzc;
    private final zzfcu zzd;
    private final zzdsj zze;

    public zzehs(zzdlt zzdlt, zzfvk zzfvk, zzdpt zzdpt, zzfcu zzfcu, zzdsj zzdsj) {
        this.zza = zzdlt;
        this.zzb = zzfvk;
        this.zzc = zzdpt;
        this.zzd = zzfcu;
        this.zze = zzdsj;
    }

    private final zzfvj zzg(zzfbs zzfbs, zzfbg zzfbg, JSONObject jSONObject) {
        zzfvj zza2 = this.zzd.zza();
        zzfvj zza3 = this.zzc.zza(zzfbs, zzfbg, jSONObject);
        return zzfva.zzd(zza2, zza3).zza(new zzehn(this, zza3, zza2, zzfbs, zzfbg, jSONObject), this.zzb);
    }

    public final zzfvj zza(zzfbs zzfbs, zzfbg zzfbg) {
        return zzfva.zzn(zzfva.zzn(this.zzd.zza(), new zzehp(this, zzfbg), this.zzb), new zzehq(this, zzfbs, zzfbg), this.zzb);
    }

    public final boolean zzb(zzfbs zzfbs, zzfbg zzfbg) {
        zzfbl zzfbl = zzfbg.zzt;
        return (zzfbl == null || zzfbl.zzc == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdnb zzc(zzfvj zzfvj, zzfvj zzfvj2, zzfbs zzfbs, zzfbg zzfbg, JSONObject jSONObject) throws Exception {
        zzdng zzdng = (zzdng) zzfvj.get();
        zzdsd zzdsd = (zzdsd) zzfvj2.get();
        zzdnh zzd2 = this.zza.zzd(new zzcyl(zzfbs, zzfbg, (String) null), new zzdns(zzdng), new zzdmi(jSONObject, zzdsd));
        zzd2.zzj().zzb();
        zzd2.zzk().zza(zzdsd);
        zzd2.zzg().zza(zzdng.zzr());
        zzd2.zzl().zza(this.zze);
        return zzd2.zza();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzd(zzdsd zzdsd, JSONObject jSONObject) throws Exception {
        this.zzd.zzb(zzfva.zzi(zzdsd));
        if (jSONObject.optBoolean("success")) {
            return zzfva.zzi(jSONObject.getJSONObject("json").getJSONArray(CampaignUnit.JSON_KEY_ADS));
        }
        throw new zzbso("process json failed");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zze(zzfbg zzfbg, zzdsd zzdsd) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhc)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfbg.zzt.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzfva.zzn(zzdsd.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzeho(this, zzdsd), this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzf(zzfbs zzfbs, zzfbg zzfbg, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return zzfva.zzh(new zzdzk(3));
        }
        if (zzfbs.zza.zza.zzk <= 1) {
            return zzfva.zzm(zzg(zzfbs, zzfbg, jSONArray.getJSONObject(0)), zzehr.zza, this.zzb);
        }
        int length = jSONArray.length();
        this.zzd.zzc(Math.min(length, zzfbs.zza.zza.zzk));
        ArrayList arrayList = new ArrayList(zzfbs.zza.zza.zzk);
        for (int i = 0; i < zzfbs.zza.zza.zzk; i++) {
            if (i < length) {
                arrayList.add(zzg(zzfbs, zzfbg, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(zzfva.zzh(new zzdzk(3)));
            }
        }
        return zzfva.zzi(arrayList);
    }
}
