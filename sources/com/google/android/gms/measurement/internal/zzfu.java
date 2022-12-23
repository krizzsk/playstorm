package com.google.android.gms.measurement.internal;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.0.0 */
public final /* synthetic */ class zzfu implements Callable {
    public final /* synthetic */ zzgb zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzfu(zzgb zzgb, String str) {
        this.zza = zzgb;
        this.zzb = str;
    }

    public final Object call() {
        zzgb zzgb = this.zza;
        String str = this.zzb;
        zzh zzj = zzgb.zzf.zzi().zzj(str);
        HashMap hashMap = new HashMap();
        hashMap.put(TapjoyConstants.TJC_PLATFORM, "android");
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, str);
        zzgb.zzs.zzf().zzh();
        hashMap.put("gmp_version", 64000L);
        if (zzj != null) {
            String zzw = zzj.zzw();
            if (zzw != null) {
                hashMap.put(TapjoyConstants.TJC_APP_VERSION_NAME, zzw);
            }
            hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
            hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
        }
        return hashMap;
    }
}
