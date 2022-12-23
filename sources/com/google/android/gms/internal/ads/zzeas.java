package com.google.android.gms.internal.ads;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzeas {
    private final zzcnf zza;
    private final Context zzb;
    private final zzcfo zzc;
    private final zzfby zzd;
    private final Executor zze;
    private final String zzf;
    private final zzfhq zzg;
    private final zzfck zzh;
    private final zzdwb zzi;

    public zzeas(zzcnf zzcnf, Context context, zzcfo zzcfo, zzfby zzfby, Executor executor, String str, zzfhq zzfhq, zzdwb zzdwb) {
        this.zza = zzcnf;
        this.zzb = context;
        this.zzc = zzcfo;
        this.zzd = zzfby;
        this.zze = executor;
        this.zzf = str;
        this.zzg = zzfhq;
        this.zzh = zzcnf.zzv();
        this.zzi = zzdwb;
    }

    private final zzfvj zzc(String str, String str2) {
        zzfhg zza2 = zzfhf.zza(this.zzb, 11);
        zza2.zzf();
        zzfvj zzn = zzfva.zzn(zzfva.zzn(zzfva.zzn(zzfva.zzi(""), new zzeap(this, str, str2), this.zze), new zzeaq(zzt.zzf().zza(this.zzb, this.zzc, this.zza.zzy()).zza("google.afma.response.normalize", zzbsw.zza, zzbsw.zza)), this.zze), new zzear(this), this.zze);
        zzfhp.zza(zzn, this.zzg, zza2);
        return zzn;
    }

    private final String zzd(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzf));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            zze.zzj("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }

    private static final String zze(String str) {
        try {
            return new JSONObject(str).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzfvj zza() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzfby r0 = r10.zzd
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd
            java.lang.String r0 = r0.zzx
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "true"
            if (r1 != 0) goto L_0x0114
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzfT
            com.google.android.gms.internal.ads.zzbhw r3 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r3.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0114
            java.lang.String r1 = zze(r0)
            com.google.android.gms.internal.ads.zzbhq r3 = com.google.android.gms.internal.ads.zzbhy.zzgf
            com.google.android.gms.internal.ads.zzbhw r4 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            if (r3 == 0) goto L_0x004e
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x004e
            java.lang.String r1 = "&request_id="
            int r1 = r0.lastIndexOf(r1)
            if (r1 == r4) goto L_0x004c
            int r1 = r1 + 12
            java.lang.String r1 = r0.substring(r1)
            goto L_0x004e
        L_0x004c:
            java.lang.String r1 = ""
        L_0x004e:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzeio r0 = new com.google.android.gms.internal.ads.zzeio
            r1 = 15
            java.lang.String r2 = "Invalid ad string."
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzfvj r0 = com.google.android.gms.internal.ads.zzfva.zzh(r0)
            return r0
        L_0x0062:
            com.google.android.gms.internal.ads.zzcnf r3 = r10.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzc r3 = r3.zzm()
            com.google.android.gms.internal.ads.zzdwb r5 = r10.zzi
            java.lang.String r3 = r3.zzb(r1, r5)
            com.google.android.gms.internal.ads.zzbhq r5 = com.google.android.gms.internal.ads.zzbhy.zzgf
            com.google.android.gms.internal.ads.zzbhw r6 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r5 = r6.zzb(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0104
            com.google.android.gms.internal.ads.zzdwb r5 = r10.zzi
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x0104
            r6 = 0
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00a0 }
            r7.<init>(r3)     // Catch:{ JSONException -> 0x00a0 }
            java.lang.String r8 = "is_gbid"
            java.lang.String r7 = r7.optString(r8)     // Catch:{ JSONException -> 0x00a0 }
            boolean r7 = r7.equals(r2)     // Catch:{ JSONException -> 0x00a0 }
            if (r7 == 0) goto L_0x00a0
            r7 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
        L_0x00a4:
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x0104
            java.lang.String r7 = "&"
            int r7 = r0.lastIndexOf(r7)     // Catch:{ UnsupportedEncodingException -> 0x00ed }
            r8 = 0
            if (r7 == r4) goto L_0x00b8
            java.lang.String r4 = r0.substring(r6, r7)     // Catch:{ UnsupportedEncodingException -> 0x00ed }
            goto L_0x00b9
        L_0x00b8:
            r4 = r8
        L_0x00b9:
            r6 = 11
            byte[] r4 = android.util.Base64.decode(r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x00ed }
            java.lang.String r6 = "UTF-8"
            byte[] r1 = r1.getBytes(r6)     // Catch:{ UnsupportedEncodingException -> 0x00ed }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d1 }
            r6.<init>(r3)     // Catch:{ JSONException -> 0x00d1 }
            java.lang.String r7 = "arek"
            java.lang.String r8 = r6.getString(r7)     // Catch:{ JSONException -> 0x00d1 }
            goto L_0x00e8
        L_0x00d1:
            r6 = move-exception
            java.lang.String r7 = "Failed to get key from QueryJSONMap"
            java.lang.String r9 = r6.toString()     // Catch:{ UnsupportedEncodingException -> 0x00ed }
            java.lang.String r7 = r7.concat(r9)     // Catch:{ UnsupportedEncodingException -> 0x00ed }
            com.google.android.gms.ads.internal.util.zze.zza(r7)     // Catch:{ UnsupportedEncodingException -> 0x00ed }
            com.google.android.gms.internal.ads.zzcer r7 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch:{ UnsupportedEncodingException -> 0x00ed }
            java.lang.String r9 = "CryptoUtils.getKeyFromQueryJsonMap"
            r7.zzt(r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x00ed }
        L_0x00e8:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfck.zzb(r4, r1, r8, r5)     // Catch:{ UnsupportedEncodingException -> 0x00ed }
            goto L_0x0104
        L_0x00ed:
            r1 = move-exception
            java.lang.String r4 = r1.toString()
            java.lang.String r5 = "Failed to decode the adResponse. "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.ads.internal.util.zze.zza(r4)
            com.google.android.gms.internal.ads.zzcer r4 = com.google.android.gms.ads.internal.zzt.zzo()
            java.lang.String r5 = "PreloadedLoader.decryptAdResponseIfNecessary"
            r4.zzt(r1, r5)
        L_0x0104:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto L_0x010b
            goto L_0x0114
        L_0x010b:
            java.lang.String r1 = r10.zzd(r3)
            com.google.android.gms.internal.ads.zzfvj r0 = r10.zzc(r0, r1)
            return r0
        L_0x0114:
            com.google.android.gms.internal.ads.zzfby r0 = r10.zzd
            com.google.android.gms.ads.internal.client.zzl r0 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs
            if (r0 == 0) goto L_0x0173
            com.google.android.gms.internal.ads.zzbhq r1 = com.google.android.gms.internal.ads.zzbhy.zzfR
            com.google.android.gms.internal.ads.zzbhw r3 = com.google.android.gms.ads.internal.client.zzay.zzc()
            java.lang.Object r1 = r3.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x012f
            goto L_0x015b
        L_0x012f:
            java.lang.String r1 = r0.zza
            java.lang.String r1 = zze(r1)
            java.lang.String r3 = r0.zzb
            java.lang.String r3 = zze(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0168
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0168
            com.google.android.gms.internal.ads.zzcnf r2 = r10.zza
            com.google.android.gms.ads.nonagon.signalgeneration.zzc r2 = r2.zzm()
            r2.zzf(r1)
            com.google.android.gms.internal.ads.zzdwb r2 = r10.zzi
            java.util.Map r2 = r2.zza()
            java.lang.String r3 = "rid"
            r2.put(r3, r1)
        L_0x015b:
            java.lang.String r1 = r0.zza
            java.lang.String r0 = r0.zzb
            java.lang.String r0 = r10.zzd(r0)
            com.google.android.gms.internal.ads.zzfvj r0 = r10.zzc(r1, r0)
            return r0
        L_0x0168:
            com.google.android.gms.internal.ads.zzdwb r0 = r10.zzi
            java.util.Map r0 = r0.zza()
            java.lang.String r1 = "ridmm"
            r0.put(r1, r2)
        L_0x0173:
            com.google.android.gms.internal.ads.zzeio r0 = new com.google.android.gms.internal.ads.zzeio
            r1 = 14
            java.lang.String r2 = "Mismatch request IDs."
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.zzfvj r0 = com.google.android.gms.internal.ads.zzfva.zzh(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeas.zza():com.google.android.gms.internal.ads.zzfvj");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzb(JSONObject jSONObject) throws Exception {
        return zzfva.zzi(new zzfbs(new zzfbp(this.zzd), zzfbr.zza(new StringReader(jSONObject.toString()))));
    }
}
