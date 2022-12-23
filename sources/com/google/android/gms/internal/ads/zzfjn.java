package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.amazon.aps.shared.APSAnalytics;
import com.tapjoy.TapjoyConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public class zzfjn {
    private zzfkl zza = new zzfkl((WebView) null);
    private long zzb;
    private int zzc;

    public zzfjn() {
        zzb();
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j) {
        if (j >= this.zzb && this.zzc != 3) {
            this.zzc = 3;
            zzfjg.zza().zzf(zza(), str);
        }
    }

    public final void zze(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzfjg.zza().zzf(zza(), str);
        }
    }

    public void zzf(zzfip zzfip, zzfin zzfin) {
        zzg(zzfip, zzfin, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public final void zzg(zzfip zzfip, zzfin zzfin, JSONObject jSONObject) {
        String zzh = zzfip.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfjr.zzg(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        zzfjr.zzg(jSONObject2, "adSessionType", zzfin.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfjr.zzg(jSONObject3, "deviceType", str + "; " + str2);
        zzfjr.zzg(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfjr.zzg(jSONObject3, "os", APSAnalytics.OS_NAME);
        zzfjr.zzg(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfjr.zzg(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfjr.zzg(jSONObject4, "partnerName", zzfin.zze().zzb());
        zzfjr.zzg(jSONObject4, "partnerVersion", zzfin.zze().zzc());
        zzfjr.zzg(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfjr.zzg(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        zzfjr.zzg(jSONObject5, "appId", zzfje.zzb().zza().getApplicationContext().getPackageName());
        zzfjr.zzg(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject5);
        if (zzfin.zzf() != null) {
            zzfjr.zzg(jSONObject2, "contentUrl", zzfin.zzf());
        }
        zzfjr.zzg(jSONObject2, "customReferenceData", zzfin.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfin.zzh().iterator();
        if (!it.hasNext()) {
            zzfjg.zza().zzg(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzfiv zzfiv = (zzfiv) it.next();
            throw null;
        }
    }

    public final void zzh(float f) {
        zzfjg.zza().zze(zza(), f);
    }

    /* access modifiers changed from: package-private */
    public final void zzi(WebView webView) {
        this.zza = new zzfkl(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.zza.get() != null;
    }
}
