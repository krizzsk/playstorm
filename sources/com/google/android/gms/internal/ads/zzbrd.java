package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzbrd {
    public static void zza(zzbre zzbre, String str, Map map) {
        try {
            zzbre.zze(str, zzaw.zzb().zzh(map));
        } catch (JSONException unused) {
            zze.zzj("Could not convert parameters to JSON.");
        }
    }

    public static void zzb(zzbre zzbre, String str, JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        zze.zze("Dispatching AFMA event: ".concat(sb.toString()));
        zzbre.zza(sb.toString());
    }

    public static void zzc(zzbre zzbre, String str, String str2) {
        zzbre.zza(str + "(" + str2 + ");");
    }

    public static void zzd(zzbre zzbre, String str, JSONObject jSONObject) {
        zzbre.zzb(str, jSONObject.toString());
    }
}
