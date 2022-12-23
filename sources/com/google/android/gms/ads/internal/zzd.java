package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfuh;
import com.google.android.gms.internal.ads.zzfva;
import com.google.android.gms.internal.ads.zzfvj;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
public final /* synthetic */ class zzd implements zzfuh {
    public final /* synthetic */ zzfhs zza;
    public final /* synthetic */ zzfhg zzb;

    public /* synthetic */ zzd(zzfhs zzfhs, zzfhg zzfhg) {
        this.zza = zzfhs;
        this.zzb = zzfhg;
    }

    public final zzfvj zza(Object obj) {
        zzfhs zzfhs = this.zza;
        zzfhg zzfhg = this.zzb;
        JSONObject jSONObject = (JSONObject) obj;
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            zzt.zzo().zzh().zzu(jSONObject.getString("appSettingsJson"));
        }
        zzfhg.zze(optBoolean);
        zzfhs.zzb(zzfhg.zzj());
        return zzfva.zzi((Object) null);
    }
}
