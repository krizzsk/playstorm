package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zzecu implements zzffh {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfhg zzc;
    private final zzfhq zzd;

    public zzecu(String str, zzfhq zzfhq, zzfhg zzfhg) {
        this.zzb = str;
        this.zzd = zzfhq;
        this.zzc = zzfhg;
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        String str;
        zzect zzect = (zzect) obj;
        int optInt = zzect.zza.optInt("http_timeout_millis", 60000);
        zzbzx zza2 = zzect.zzb;
        if (zza2.zza() == -2) {
            HashMap hashMap = new HashMap();
            String str2 = "";
            if (zzect.zzb.zzh() && !TextUtils.isEmpty(this.zzb)) {
                if (((Boolean) zzay.zzc().zzb(zzbhy.zzaI)).booleanValue()) {
                    String str3 = this.zzb;
                    if (TextUtils.isEmpty(str3)) {
                        str = str2;
                    } else {
                        Matcher matcher = zza.matcher(str3);
                        str = str2;
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (group != null && (group.toLowerCase(Locale.ROOT).startsWith("id=") || group.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                if (!TextUtils.isEmpty(str)) {
                                    str = str.concat("; ");
                                }
                                str = str.concat(group);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(HttpHeaders.COOKIE, str);
                    }
                } else {
                    hashMap.put(HttpHeaders.COOKIE, this.zzb);
                }
            }
            if (zzect.zzb.zzi()) {
                JSONObject optJSONObject = zzect.zza.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str2))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str2));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str2))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str2));
                    }
                } else {
                    zze.zza("DSID signal does not exist.");
                }
            }
            if (zzect.zzb != null && !TextUtils.isEmpty(zzect.zzb.zzd())) {
                str2 = zzect.zzb.zzd();
            }
            zzfhq zzfhq = this.zzd;
            zzfhg zzfhg = this.zzc;
            zzfhg.zze(true);
            zzfhq.zza(zzfhg);
            return new zzecp(zzect.zzb.zze(), optInt, hashMap, str2.getBytes(zzfog.zzc), "");
        }
        zzfhq zzfhq2 = this.zzd;
        zzfhg zzfhg2 = this.zzc;
        zzfhg2.zze(false);
        zzfhq2.zza(zzfhg2);
        if (zza2.zza() == 1) {
            if (zza2.zzf() != null) {
                zze.zzg(TextUtils.join(", ", zza2.zzf()));
            }
            throw new zzdzk(2, "Error building request URL.");
        }
        throw new zzdzk(1);
    }
}
