package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbsp;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, zzcfo zzcfo, String str, Runnable runnable, zzfhs zzfhs) {
        zzb(context, zzcfo, true, (zzcel) null, str, (String) null, runnable, zzfhs);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Context context, zzcfo zzcfo, boolean z, zzcel zzcel, String str, String str2, Runnable runnable, zzfhs zzfhs) {
        PackageInfo packageInfo;
        if (zzt.zzA().elapsedRealtime() - this.zzb < 5000) {
            com.google.android.gms.ads.internal.util.zze.zzj("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzt.zzA().elapsedRealtime();
        if (zzcel != null) {
            long zza2 = zzcel.zza();
            if (zzt.zzA().currentTimeMillis() - zza2 <= ((Long) zzay.zzc().zzb(zzbhy.zzdd)).longValue() && zzcel.zzi()) {
                return;
            }
        }
        if (context == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Context not provided to fetch application settings");
        } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            this.zza = applicationContext;
            zzfhg zza3 = zzfhf.zza(context, 4);
            zza3.zzf();
            zzbsp zza4 = zzt.zzf().zza(this.zza, zzcfo, zzfhs).zza("google.afma.config.fetchAppSettings", zzbsw.zza, zzbsw.zza);
            try {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z);
                jSONObject.put("pn", context.getPackageName());
                jSONObject.put("experiment_ids", TextUtils.join(",", zzbhy.zza()));
                try {
                    ApplicationInfo applicationInfo = this.zza.getApplicationInfo();
                    if (!(applicationInfo == null || (packageInfo = Wrappers.packageManager(context).getPackageInfo(applicationInfo.packageName, 0)) == null)) {
                        jSONObject.put("version", packageInfo.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Error fetching PackageInfo.");
                }
                zzfvj zzb2 = zza4.zzb(jSONObject);
                zzfvj zzn = zzfva.zzn(zzb2, new zzd(zzfhs, zza3), zzcfv.zzf);
                if (runnable != null) {
                    zzb2.zzc(runnable, zzcfv.zzf);
                }
                zzcfy.zza(zzn, "ConfigLoader.maybeFetchNewAppSettings");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzh("Error requesting application settings", e);
                zza3.zze(false);
                zzfhs.zzb(zza3.zzj());
            }
        } else {
            com.google.android.gms.ads.internal.util.zze.zzj("App settings could not be fetched. Required parameters missing");
        }
    }

    public final void zzc(Context context, zzcfo zzcfo, String str, zzcel zzcel, zzfhs zzfhs) {
        zzb(context, zzcfo, false, zzcel, zzcel != null ? zzcel.zzb() : null, str, (Runnable) null, zzfhs);
    }
}
