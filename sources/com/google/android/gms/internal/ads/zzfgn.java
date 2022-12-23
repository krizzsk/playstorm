package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p374my.tracker.ads.AdFormat;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzfgn {
    private final HashMap zza = new HashMap();
    private final zzfgt zzb = new zzfgt(zzt.zzA());

    private zzfgn() {
        this.zza.put("new_csi", "1");
    }

    public static zzfgn zzb(String str) {
        zzfgn zzfgn = new zzfgn();
        zzfgn.zza.put("action", str);
        return zzfgn;
    }

    public static zzfgn zzc(String str) {
        zzfgn zzfgn = new zzfgn();
        zzfgn.zza.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
        return zzfgn;
    }

    public final zzfgn zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfgn zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfgn zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfgn zzf(zzfbg zzfbg) {
        this.zza.put("aai", zzfbg.zzx);
        return this;
    }

    public final zzfgn zzg(zzfbj zzfbj) {
        if (!TextUtils.isEmpty(zzfbj.zzb)) {
            this.zza.put("gqi", zzfbj.zzb);
        }
        return this;
    }

    public final zzfgn zzh(zzfbs zzfbs, zzcev zzcev) {
        zzfbr zzfbr = zzfbs.zzb;
        zzg(zzfbr.zzb);
        if (!zzfbr.zza.isEmpty()) {
            switch (((zzfbg) zzfbr.zza.get(0)).zzb) {
                case 1:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, AdFormat.BANNER);
                    break;
                case 2:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    break;
                case 3:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "rewarded");
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    if (zzcev != null) {
                        this.zza.put("as", true != zzcev.zzj() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfgn zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfgs zzfgs : this.zzb.zza()) {
            hashMap.put(zzfgs.zza, zzfgs.zzb);
        }
        return hashMap;
    }
}
