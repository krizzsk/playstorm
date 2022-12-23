package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzdqg {
    private final Context zza;
    private final zzdpp zzb;
    private final zzaoc zzc;
    private final zzcfo zzd;
    private final zza zze;
    private final zzbdl zzf;
    private final Executor zzg;
    private final zzbko zzh;
    private final zzdqy zzi;
    private final zzdto zzj;
    private final ScheduledExecutorService zzk;
    private final zzdsj zzl;
    private final zzdwg zzm;
    private final zzfgo zzn;
    private final zzfig zzo;
    private final zzeen zzp;

    public zzdqg(Context context, zzdpp zzdpp, zzaoc zzaoc, zzcfo zzcfo, zza zza2, zzbdl zzbdl, Executor executor, zzfby zzfby, zzdqy zzdqy, zzdto zzdto, ScheduledExecutorService scheduledExecutorService, zzdwg zzdwg, zzfgo zzfgo, zzfig zzfig, zzeen zzeen, zzdsj zzdsj) {
        this.zza = context;
        this.zzb = zzdpp;
        this.zzc = zzaoc;
        this.zzd = zzcfo;
        this.zze = zza2;
        this.zzf = zzbdl;
        this.zzg = executor;
        this.zzh = zzfby.zzi;
        this.zzi = zzdqy;
        this.zzj = zzdto;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdwg;
        this.zzn = zzfgo;
        this.zzo = zzfig;
        this.zzp = zzeen;
        this.zzl = zzdsj;
    }

    public static final zzeg zzi(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(optJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzfrh.zzo();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfrh.zzo();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            zzeg zzr = zzr(optJSONArray.optJSONObject(i));
            if (zzr != null) {
                arrayList.add(zzr);
            }
        }
        return zzfrh.zzm(arrayList);
    }

    private static zzfvj zzl(zzfvj zzfvj, Object obj) {
        return zzfva.zzg(zzfvj, Exception.class, new zzdqd((Object) null), zzcfv.zzf);
    }

    private static zzfvj zzm(boolean z, zzfvj zzfvj, Object obj) {
        if (z) {
            return zzfva.zzn(zzfvj, new zzdqb(zzfvj), zzcfv.zzf);
        }
        return zzl(zzfvj, (Object) null);
    }

    private final zzfvj zzn(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzfva.zzi((Object) null);
        }
        String optString = jSONObject.optString("url");
        if (TextUtils.isEmpty(optString)) {
            return zzfva.zzi((Object) null);
        }
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        int optInt = jSONObject.optInt("width", -1);
        int optInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzfva.zzi(new zzbkm((Drawable) null, Uri.parse(optString), optDouble, optInt, optInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzfva.zzm(this.zzb.zzb(optString, optDouble, optBoolean), new zzdqe(optString, optDouble, optInt, optInt2), this.zzg), (Object) null);
    }

    private final zzfvj zzo(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzfva.zzi(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzfva.zzm(zzfva.zze(arrayList), zzdqc.zza, this.zzg);
    }

    private final zzfvj zzp(JSONObject jSONObject, zzfbg zzfbg, zzfbj zzfbj) {
        zzfvj zzb2 = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString(TJAdUnitConstants.String.HTML), zzfbg, zzfbj, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzfva.zzn(zzb2, new zzdqf(zzb2), zzcfv.zzf);
    }

    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt(CampaignEx.JSON_KEY_AD_R), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static final zzeg zzr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_REASON);
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new zzeg(optString, optString2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbkj zza(JSONObject jSONObject, List list) {
        Integer num = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzq = zzq(jSONObject, "bg_color");
        Integer zzq2 = zzq(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        int optInt3 = jSONObject.optInt("presentation_ms", TTAdSdk.INIT_LOCAL_FAIL_CODE);
        if (optInt > 0) {
            num = Integer.valueOf(optInt);
        }
        return new zzbkj(optString, list, zzq, zzq2, num, optInt3 + optInt2, this.zzh.zze, optBoolean);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzb(zzq zzq, zzfbg zzfbg, zzfbj zzfbj, String str, String str2, Object obj) throws Exception {
        zzcli zza2 = this.zzj.zza(zzq, zzfbg, zzfbj);
        zzcfz zza3 = zzcfz.zza(zza2);
        zzdsg zzb2 = this.zzl.zzb();
        zzdsg zzdsg = zzb2;
        zzcmv zzP = zza2.zzP();
        zzb zzb3 = r3;
        zzb zzb4 = new zzb(this.zza, (zzccj) null, (zzbzi) null);
        zzP.zzL(zzb2, zzdsg, zzb2, zzb2, zzb2, false, (zzboo) null, zzb3, (zzbwv) null, (zzccj) null, this.zzp, this.zzo, this.zzm, this.zzn, (zzbom) null, zzb2);
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzcO)).booleanValue()) {
            zza2.zzaf("/getNativeAdViewSignals", zzbok.zzs);
        }
        zza2.zzaf("/getNativeClickMeta", zzbok.zzt);
        zza2.zzP().zzz(new zzdqa(zza3));
        zza2.zzad(str, str2, (String) null);
        return zza3;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvj zzc(String str, Object obj) throws Exception {
        zzt.zzz();
        zzcli zza2 = zzclu.zza(this.zza, zzcmx.zza(), "native-omid", false, false, this.zzc, (zzbix) null, this.zzd, (zzbin) null, (zzl) null, this.zze, this.zzf, (zzfbg) null, (zzfbj) null);
        zzcfz zza3 = zzcfz.zza(zza2);
        zza2.zzP().zzz(new zzdpw(zza3));
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzed)).booleanValue()) {
            zza2.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zza2.loadData(str, "text/html", "UTF-8");
        }
        return zza3;
    }

    public final zzfvj zzd(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzfva.zzi((Object) null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzm(optJSONObject.optBoolean("require"), zzfva.zzm(zzo(optJSONArray, false, true), new zzdpx(this, optJSONObject), this.zzg), (Object) null);
    }

    public final zzfvj zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final zzfvj zzf(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        zzbko zzbko = this.zzh;
        return zzo(optJSONArray, zzbko.zzb, zzbko.zzd);
    }

    public final zzfvj zzg(JSONObject jSONObject, String str, zzfbg zzfbg, zzfbj zzfbj) {
        if (!((Boolean) zzay.zzc().zzb(zzbhy.zzhT)).booleanValue()) {
            return zzfva.zzi((Object) null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzfva.zzi((Object) null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzfva.zzi((Object) null);
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString(TJAdUnitConstants.String.HTML);
        zzq zzk2 = zzk(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzfva.zzi((Object) null);
        }
        zzfvj zzn2 = zzfva.zzn(zzfva.zzi((Object) null), new zzdpy(this, zzk2, zzfbg, zzfbj, optString, optString2), zzcfv.zze);
        return zzfva.zzn(zzn2, new zzdpz(zzn2), zzcfv.zzf);
    }

    public final zzfvj zzh(JSONObject jSONObject, zzfbg zzfbg, zzfbj zzfbj) {
        zzfvj zzfvj;
        JSONObject zzg2 = zzbu.zzg(jSONObject, "html_containers", "instream");
        if (zzg2 != null) {
            return zzp(zzg2, zzfbg, zzfbj);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzfva.zzi((Object) null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzhS)).booleanValue() && optJSONObject.has(TJAdUnitConstants.String.HTML)) {
            z = true;
        }
        if (TextUtils.isEmpty(optString)) {
            if (!z) {
                zze.zzj("Required field 'vast_xml' or 'html' is missing");
                return zzfva.zzi((Object) null);
            }
        } else if (!z) {
            zzfvj = this.zzi.zza(optJSONObject);
            return zzl(zzfva.zzo(zzfvj, (long) ((Integer) zzay.zzc().zzb(zzbhy.zzcP)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
        }
        zzfvj = zzp(optJSONObject, zzfbg, zzfbj);
        return zzl(zzfva.zzo(zzfvj, (long) ((Integer) zzay.zzc().zzb(zzbhy.zzcP)).intValue(), TimeUnit.SECONDS, this.zzk), (Object) null);
    }

    private final zzq zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return zzq.zzc();
            }
            i = 0;
        }
        return new zzq(this.zza, new AdSize(i, i2));
    }
}
