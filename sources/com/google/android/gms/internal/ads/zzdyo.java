package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.warren.model.ReportDBAdapter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdyo implements zzdbv, zzden, zzddk {
    private final zzdza zza;
    private final String zzb;
    private int zzc = 0;
    private zzdyn zzd = zzdyn.AD_REQUESTED;
    private zzdbl zze;
    private zze zzf;

    zzdyo(zzdza zzdza, zzfby zzfby) {
        this.zza = zzdza;
        this.zzb = zzfby.zzf;
    }

    private static JSONObject zze(zze zze2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zze2.zzc);
        jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, zze2.zza);
        jSONObject.put("errorDescription", zze2.zzb);
        zze zze3 = zze2.zzd;
        jSONObject.put("underlyingError", zze3 == null ? null : zze(zze3));
        return jSONObject;
    }

    private static JSONObject zzf(zzdbl zzdbl) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("winningAdapterClassName", zzdbl.zzg());
        jSONObject2.put("responseSecsSinceEpoch", zzdbl.zzc());
        jSONObject2.put("responseId", zzdbl.zzh());
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhI)).booleanValue()) {
            String zzd2 = zzdbl.zzd();
            if (!TextUtils.isEmpty(zzd2)) {
                com.google.android.gms.ads.internal.util.zze.zze("Bidding data: ".concat(String.valueOf(zzd2)));
                jSONObject2.put("biddingData", new JSONObject(zzd2));
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzu : zzdbl.zzi()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("adapterClassName", zzu.zza);
            jSONObject3.put("latencyMillis", zzu.zzb);
            if (((Boolean) zzay.zzc().zzb(zzbhy.zzhJ)).booleanValue()) {
                jSONObject3.put("credentials", zzaw.zzb().zzg(zzu.zzd));
            }
            zze zze2 = zzu.zzc;
            if (zze2 == null) {
                jSONObject = null;
            } else {
                jSONObject = zze(zze2);
            }
            jSONObject3.put("error", jSONObject);
            jSONArray.put(jSONObject3);
        }
        jSONObject2.put("adNetworks", jSONArray);
        return jSONObject2;
    }

    public final void zza(zze zze2) {
        this.zzd = zzdyn.AD_LOAD_FAILED;
        this.zzf = zze2;
    }

    public final void zzb(zzfbs zzfbs) {
        if (!zzfbs.zzb.zza.isEmpty()) {
            this.zzc = ((zzfbg) zzfbs.zzb.zza.get(0)).zzb;
        }
    }

    public final void zzbE(zzbzu zzbzu) {
        this.zza.zze(this.zzb, this);
    }

    public final void zzbH(zzcxw zzcxw) {
        this.zze = zzcxw.zzl();
        this.zzd = zzdyn.AD_LOADED;
    }

    public final JSONObject zzc() throws JSONException {
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zzd);
        jSONObject.put("format", zzfbg.zza(this.zzc));
        zzdbl zzdbl = this.zze;
        JSONObject jSONObject2 = null;
        if (zzdbl != null) {
            jSONObject2 = zzf(zzdbl);
        } else {
            zze zze2 = this.zzf;
            if (!(zze2 == null || (iBinder = zze2.zze) == null)) {
                zzdbl zzdbl2 = (zzdbl) iBinder;
                jSONObject2 = zzf(zzdbl2);
                if (zzdbl2.zzi().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zze(this.zzf));
                    jSONObject2.put(ReportDBAdapter.ReportColumns.COLUMN_ERRORS, jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObject2);
        return jSONObject;
    }

    public final boolean zzd() {
        return this.zzd != zzdyn.AD_REQUESTED;
    }
}
